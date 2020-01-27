package it.cai.cividale.server.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.MaterialeNoleggiatoDao;
import it.cai.cividale.server.domain.Iscrizione;
import it.cai.cividale.server.domain.MaterialeNoleggiato;

@Repository
@Transactional
@SessionScope
public class MaterialeNoleggiatoDaoImpl extends AbstractDaoImpl<MaterialeNoleggiato> implements MaterialeNoleggiatoDao {

    @Override
    public Long save(MaterialeNoleggiato materialeNoleggiato, Long idIscrizione) {
	Iscrizione iscrizione = new Iscrizione();
	iscrizione.setId(idIscrizione);
	materialeNoleggiato.setIscrizione(iscrizione);
	return super.save(materialeNoleggiato);
    }

//    @Override
//    public void update(MaterialeNoleggiato materialeNoleggiato, Long idIscrizione) {
//	Iscrizione iscrizione = new Iscrizione();
//	iscrizione.setId(idIscrizione);
//	materialeNoleggiato.setIscrizione(iscrizione);
//	super.update(materialeNoleggiato);
//
//    }
//
//    @Override
//    public void delete(MaterialeNoleggiato materialeNoleggiato, Long idIscrizione) {
////	Iscrizione iscrizione = new Iscrizione();
////	iscrizione.setId(idIscrizione);
////	materialeNoleggiato.setIscrizione(iscrizione);
////	super.hashCode(materialeNoleggiato);
//
//    }

}
