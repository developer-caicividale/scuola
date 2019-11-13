package it.cai.cividale.server.config;

import java.util.List;

import org.emfjson.jackson.module.EMFModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import it.cai.cividale.server.util.CommonsLang3Module;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "it.cai.cividale.server")
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver viewResolver() {
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/views");
	resolver.setSuffix(".jsp");
	resolver.setExposeContextBeansAsAttributes(true);
	resolver.setViewClass(JstlView.class);
	return resolver;
    }

    @Bean
    public RequestContextListener requestContextListener() {
	return new RequestContextListener();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	configurer.enable();
    }

    @Bean
    public ObjectMapper objectMapper() {
	ObjectMapper mapper = EMFModule.setupDefaultMapper();
	EMFModule module = new EMFModule();

//	module.configure(EMFModule.Feature.OPTION_USE_ID, true);
//	module.configure(EMFModule.Feature.OPTION_SERIALIZE_TYPE, false);
//
//	module.setIdentityInfo(new EcoreIdentityInfo("id"));

//	module.setReferenceSerializer(new JsonSerializer<EObject>() {
//	    @Override
//	    public void serialize(EObject v, JsonGenerator g, SerializerProvider s) throws IOException {
//		g.writeString(((JsonResource) v.eResource()).getID(v));
//	    }
//	});

	mapper.registerModules(module, new JavaTimeModule(), new CommonsLang3Module());
	// mapper.registerModules(eMFModule, new JavaTimeModule(), new
	// CommonsLang3Module());
	return mapper;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(objectMapper());
	converters.add(converter);

	StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
	converters.add(stringHttpMessageConverter);

	ByteArrayHttpMessageConverter byteArrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
	converters.add(byteArrayHttpMessageConverter);
    }
}
