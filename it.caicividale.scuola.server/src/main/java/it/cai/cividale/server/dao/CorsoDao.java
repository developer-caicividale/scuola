package it.cai.cividale.server.dao;

import java.util.List;

import it.cai.cividale.server.domain.Corso;

public interface CorsoDao extends Dao<Corso> {
    List<Corso> getCorsiPerAnno(Integer anno);

    List<Integer> getElencoAnniCorsi();
}
