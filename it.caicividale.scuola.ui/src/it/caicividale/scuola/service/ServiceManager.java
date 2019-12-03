package it.caicividale.scuola.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ElencoCorsi;
import it.caicividale.scuola.emf.model.ElencoIstruttori;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.emf.model.impl.IscrizioneImpl;
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
	List<Integer> anni = restClient.get(url(RestResources.ELENCO_ANNI_CORSI), List.class);
	return anni;
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

    public List<Istruttore> getElencoIstruttori(Object object) {
	ElencoIstruttori elencoIstruttori = restClient.get(url(RestResources.ELENCO_ISTRUTTORI),
		ElencoIstruttori.class);
	List<Istruttore> istruttori = elencoIstruttori.getElencoIstruttori();
	return istruttori;
    }

    public List<? extends Persona> getElencoPersoneInStaff() {
	return getElencoIstruttori(null);
    }

    public Corso getCorso(Long idCorso) {
	Map<String, Object> query = new HashMap<>();
	query.put("id", idCorso);

	Corso corso = restClient.get(url(RestResources.CORSO, query), Corso.class);

	return corso;
    }

    public void deleteCorso(Corso corso) {

    }

    public void update(Corso corso) {
	restClient.post(url(RestResources.CORSO_UPDATE), corso, Corso.class);

    }

    public void update(Iscrizione iscrizione, Long idCorso) {
	Map<String, Object> query = new HashMap<>();
	query.put("idCorso", idCorso);

	restClient.put(url(RestResources.ISCRIZIONE_UPDATE, query), iscrizione);

    }

    public void createCorso(Corso corso) {
	// TODO Auto-generated method stub

    }

    public void insertIscrizione(Iscrizione iscrizione, Long idCorso) {
	Map<String, Object> query = new HashMap<>();
	query.put("idCorso", idCorso);

	restClient.post(url(RestResources.ISCRIZIONE_CREA, query), iscrizione, IscrizioneImpl.class);

    }
}
