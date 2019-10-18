package it.caicividale.corsicai.services.rest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.DizMateriale;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.Persona;

public class ServiceManager {
    private static String baseUrl = "http://localhost:8080/";

    private RestClient restInvoker = new RestClient();

    private static final ServiceManager INSTANCE = new ServiceManager();

    public ServiceManager() {

    }

    // Singleton
    public static ServiceManager getInstance() {
	return INSTANCE;
    }

    public static final String url(String restResource) {
	return baseUrl + restResource;
    }

    public static final String url(String restResource, String pathVariableName, Object pathVariableValue) {
	return url(restResource, pathVariableName, pathVariableValue, baseUrl);
    }

    public static final String url(String restResource, String pathVariableName, Object pathVariableValue,
	    String prefix) {
	return prefix + restResource.replaceAll("\\{" + pathVariableName + "\\}",
		Objects.toString(pathVariableValue, StringUtils.EMPTY));
    }

    public static final String url(String restResource, Map<String, Object> pathVariableNameValueMap) {
	String replacedString = restResource;
	for (String name : pathVariableNameValueMap.keySet()) {
	    replacedString = url(replacedString, name,
		    Objects.toString(pathVariableNameValueMap.get(name), StringUtils.EMPTY), StringUtils.EMPTY);
	}
	return baseUrl + replacedString;
    }

//	public Anagrafica anagrafica(final Long idAnagrafica) throws RestException {
//		Map<String, Object> query = new HashMap<>();
//		query.put("idAnagrafica", idAnagrafica);
//		return restInvoker.get(baseUrl + RestResources.ANAGRAFICA, query, Anagrafica.class);
//	}

    public List<Persona> getPersoneByNomeCognome(String text, String text2) {
	// TODO Auto-generated method stub
	return null;
    }

    public List<Integer> getElencoAnniCorsi() {
	// TODO Auto-generated method stub
	return null;
    }

    public List<Corso> getElencoCorsi(Integer anno) {
	Map<String, Object> query = new HashMap<>();
	query.put("anno", anno);

	// return restInvoker.get(baseUrl + RestResources.ELENCO_CORSI_ANNO, query,
	// Dizionario.class);

	List<Corso> corsi = new ArrayList<>();
	return corsi;
    }

    public Collection<? extends DizMateriale> getDizionarioMateriali() {
	// TODO Auto-generated method stub
	return null;
    }

    public Collection<? extends Istruttore> getElencoIstruttori(Object object) {
	// TODO Auto-generated method stub
	return null;
    }

    public Collection<? extends Persona> getElencoPersoneInStaff() {
	// TODO Auto-generated method stub
	return null;
    }

    public Corso getCorso(Long idCorso) {
	// TODO Auto-generated method stub
	return null;
    }

    public void popolaCorsi() {
	// TODO Auto-generated method stub

    }

    public void deleteCorso(Corso corso) {
	// TODO Auto-generated method stub

    }

    public void update(Corso value) {
	// TODO Auto-generated method stub

    }

    public void update(Iscrizione iscrizione) {
	// TODO Auto-generated method stub

    }

    public void createCorso(Corso corso) {
	// TODO Auto-generated method stub

    }
}
