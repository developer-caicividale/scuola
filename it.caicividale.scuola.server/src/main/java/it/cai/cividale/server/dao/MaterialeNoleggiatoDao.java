package it.cai.cividale.server.dao;

import it.cai.cividale.server.domain.MaterialeNoleggiato;

public interface MaterialeNoleggiatoDao extends Dao<MaterialeNoleggiato> {

    Long save(MaterialeNoleggiato materialeNoleggiato, Long idIscrizione);

//    void update(MaterialeNoleggiato materialeNoleggiato, Long idIscrizione);
//
//    void delete(MaterialeNoleggiato model2Domain, Long idIscrizione);
}
