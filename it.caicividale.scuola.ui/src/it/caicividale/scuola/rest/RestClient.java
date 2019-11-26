package it.caicividale.scuola.rest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.ParseException;
import org.apache.http.entity.ContentType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.valueobject.EMail;
import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;
import it.caicividale.scuola.rest.json.deserializer.EMailDeserializer;
import it.caicividale.scuola.rest.json.deserializer.NumeroCellularelDeserializer;
import it.caicividale.scuola.rest.json.serializer.EMailSerializer;
import it.caicividale.scuola.rest.json.serializer.NumeroCellularelSerializer;

public class RestClient {
    private final RestTemplate restTemplate;

    private Map<Class<? extends TemporalAccessor>, DateTimeFormatter> dateTimeFormatterMap = new HashMap<Class<? extends TemporalAccessor>, DateTimeFormatter>() { // @formatter:off
	private static final long serialVersionUID = 1174427483375371991L;
	{
	    put(LocalDate.class, DateTimeFormatter.ISO_LOCAL_DATE);
	    put(LocalDateTime.class, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	    put(LocalTime.class, DateTimeFormatter.ISO_LOCAL_TIME);
	}
    }; // @formatter:on

    public RestClient() {
	FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
	formHttpMessageConverter.setCharset(StandardCharsets.UTF_8);
	StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(StandardCharsets.UTF_8);

	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.findAndRegisterModules();

	SimpleModule valueObjectsModule = new SimpleModule();

	valueObjectsModule.addDeserializer(NumeroCellulare.class, new NumeroCellularelDeserializer());
	valueObjectsModule.addDeserializer(EMail.class, new EMailDeserializer());

	valueObjectsModule.addSerializer(NumeroCellulare.class, new NumeroCellularelSerializer());
	valueObjectsModule.addSerializer(EMail.class, new EMailSerializer());

	objectMapper.registerModules(new EMFModule(), new JavaTimeModule(), valueObjectsModule);

	JsonResourceFactory jsonResourceFactory = new JsonResourceFactory(objectMapper);

	ResourceSet resourceSet = new ResourceSetImpl();
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", jsonResourceFactory);
	resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put("*", jsonResourceFactory);
	resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

	EPackage modelPackage = ModelPackage.eINSTANCE;
	resourceSet.getPackageRegistry().put(modelPackage.getNsURI(), modelPackage);

	MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
	mappingJackson2HttpMessageConverter.setDefaultCharset(StandardCharsets.UTF_8);
	mappingJackson2HttpMessageConverter.setPrettyPrint(false);
	mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);

	mappingJackson2HttpMessageConverter
		.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));

	restTemplate = new RestTemplate(Arrays.asList(formHttpMessageConverter, stringHttpMessageConverter,
		mappingJackson2HttpMessageConverter));

	restTemplate.setErrorHandler(new ResponseErrorHandler() {
	    @Override
	    public boolean hasError(ClientHttpResponse response) throws IOException {
		return response.getStatusCode().isError();
	    }

	    @Override
	    public void handleError(ClientHttpResponse response) throws IOException {
		Charset charset = StandardCharsets.UTF_8;
		if (response.getHeaders() != null) {
		    List<String> contentTypeList = response.getHeaders()
			    .get(org.springframework.http.HttpHeaders.CONTENT_TYPE);
		    if (contentTypeList.size() == 1) {
			try {
			    charset = ContentType.parse(contentTypeList.get(0)).getCharset();
			} catch (ParseException | UnsupportedCharsetException e) {
			    // Amen
			}
		    }
		}
		handleStatusCode(response.getStatusCode(), response.getBody(), charset);
	    }

	    private void handleStatusCode(HttpStatus httpStatus, InputStream inputStream, Charset charset)
		    throws RestException {
		if (httpStatus.is5xxServerError()) {
		    String errorMessage = httpStatus.getReasonPhrase();
		    try {
			errorMessage = IOUtils.toString(inputStream, charset.name());
		    } catch (IOException e) {
			// Amen
		    }
		    throw new RestException(errorMessage);
		}
	    }
	});

    }

    private RestException restException(Exception e) {
	e.printStackTrace(); // FIXME
	return new RestException(e);
    }

    public final <T extends Object> T get(String url, Class<T> clazz) throws RestException {
	return restTemplate.getForObject(url, clazz);
    }

    public final <T extends Object> T get(String url, Map<String, Object> query, Class<T> clazz) throws RestException {
	try {
	    fixQueryMap(query);
	    return restTemplate.getForObject(appendQueryString(url, query), clazz, query);
	} catch (RestClientException e) {
	    throw restException(e);
	}
    }

    private void fixQueryMap(Map<String, Object> query) {
	if (query != null) {
	    for (String key : query.keySet()) {
		Object value = query.get(key);
		DateTimeFormatter dateTimeFormatter = dateTimeFormatterMap.get(value.getClass());
		if (dateTimeFormatter != null) {
		    query.put(key, dateTimeFormatter.format((TemporalAccessor) value));
		}
	    }
	}
    }

    public String post(String url, Map<String, Object> query) throws RestException {
	return post(url, query, null, String.class);
    }

    public final <T extends Object> T post(String url, Object body, Class<T> clazz) throws RestException {
	return post(url, Collections.emptyMap(), body, clazz);
    }

    public final <T extends Object> T post(String url, Map<String, Object> query, Object body, Class<T> clazz)
	    throws RestException {
	try {
	    fixQueryMap(query);

	    return restTemplate.postForObject(appendQueryString(url, query), body, clazz, query);
	} catch (RestClientException e) {
	    throw restException(e);
	}
    }

    public final void put(String url, Map<String, Object> query) throws RestException {
	put(url, query, null);
    }

    public final void put(String url, Map<String, Object> query, Object body) throws RestException {
	try {
	    fixQueryMap(query);
	    restTemplate.put(appendQueryString(url, query), body, query);
	} catch (RestClientException e) {
	    throw restException(e);
	}
    }

    public final void delete(String url, Map<String, Object> query) throws RestException {
	try {
	    fixQueryMap(query);
	    restTemplate.delete(appendQueryString(url, query), query);
	} catch (RestClientException e) {
	    throw restException(e);
	}
    }

    private String appendQueryString(String url, Map<String, Object> query) {
	if (query.size() == 0) {
	    return url;
	} else {
	    StringBuffer queryStringBuffer = new StringBuffer("?");
	    Iterator<Entry<String, Object>> iterator = query.entrySet().iterator();
	    while (iterator.hasNext()) {
		Entry<String, Object> entry = iterator.next();

		String primoElemento = entry.getKey();
		String secondoElemento = "{" + primoElemento + "}";
		queryStringBuffer.append(StringUtils.joinWith("=", primoElemento, secondoElemento));
		if (iterator.hasNext()) {
		    queryStringBuffer.append("&");
		}
	    }
	    return url + queryStringBuffer;
	}
    }
}
