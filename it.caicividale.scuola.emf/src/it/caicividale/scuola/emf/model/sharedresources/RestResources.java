package it.caicividale.scuola.emf.model.sharedresources;

public interface RestResources {

    final String ELENCO_CORSI_ANNO = "/corso/elenco_corsi/{anno}";
    final String ELENCO_ANNI_CORSI = "/corso/elenco_anni_corsi";

    final String CORSO = "/corso/{id}";

    final String ELENCO_MATERIALI = "/dizionari/elenco_materiali";

    final String ELENCO_ISTRUTTORI = "/persona/elenco_istruttori";

}
