package it.cai.cividale.server.exceptions;

public enum ECodiceErrore {

    VALUE_OBJECT_CREATION_ERROR("{0} non conforme"), //
    FILTER_ERROR_INCORRECT_DATA("{0}"), //
    DOMAIN_ERROR_INCORRECT_DATA("{0}"), //
    REPOSITORY_INCORRECT_DATA("{0}"), //
    SERVICE_INCORRECT_DATA("{0}"), //
    SERVICE_ERROR("{0}"), //
    DAO_ERROR("{0}"), //
    XDS_ERROR("{0}"), //
    REST_ERROR("{0}"), //

    ERRORE_GENERICO("{0}");

    private static final String DESCRIZIONE_DEFAULT = "Errore interno";
    private String descrizioneErrore;

    private ECodiceErrore(String descrizioneErrore) {
	if (descrizioneErrore != null && descrizioneErrore.trim().length() > 0) {
	    this.descrizioneErrore = descrizioneErrore;
	} else {
	    this.descrizioneErrore = DESCRIZIONE_DEFAULT;
	}

    }

    public String getDescrizioneErrore() {
	return descrizioneErrore;
    }

}
