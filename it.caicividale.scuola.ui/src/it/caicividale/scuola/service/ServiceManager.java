package it.caicividale.scuola.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ElencoCorsi;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import it.caicividale.scuola.rest.RestClient;

public class ServiceManager {
    private static String baseUrl = "http://localhost:8080/it.caicividale.scuola.server";

    private RestClient restClient = new RestClient();

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

	ElencoCorsi elencoCorso = restClient.get(url(RestResources.ELENCO_CORSI_ANNO, query), ElencoCorsi.class);

	List<Corso> corsi = elencoCorso.getElencoCorsi();
	return corsi;
    }

    public List<DizMateriale> getDizionarioMateriali() {
	ElencoMateriali elencoMateriali = restClient.get(url(RestResources.ELENCO_MATERIALI), ElencoMateriali.class);

	List<DizMateriale> materiali = elencoMateriali.getElencoMateriali();
	return materiali;
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
