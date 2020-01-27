package it.cai.cividale.server.dao;

import it.cai.cividale.server.domain.Iscrizione;

public interface IscrizioneDao extends Dao<Iscrizione> {

    void save(Iscrizione iscrizioneDomain, Long idCorso);

}
