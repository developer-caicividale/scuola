package it.cai.cividale.server.dao;

import java.util.List;

import it.cai.cividale.server.domain.DizComune;

public interface DizionarioComuniDao extends Dao<DizComune> {

    List<DizComune> listComuniPerRegione(String regione);
}
