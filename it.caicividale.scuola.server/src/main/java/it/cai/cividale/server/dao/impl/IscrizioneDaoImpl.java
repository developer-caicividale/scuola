package it.cai.cividale.server.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.cai.cividale.server.dao.IscrizioneDao;
import it.cai.cividale.server.domain.Corso;
import it.cai.cividale.server.domain.Iscrizione;
import it.cai.cividale.server.domain.MaterialeNoleggiato;

@Repository
@Transactional
@SessionScope
public class IscrizioneDaoImpl extends AbstractDaoImpl<Iscrizione> implements IscrizioneDao {
    @Autowired
    CorsoDao corsoDao;

    @Override
    public void save(Iscrizione iscrizioneDomain, Long idCorso) {
	Corso corsoDomian = new Corso();
	corsoDomian.setId(idCorso);
	iscrizioneDomain.setCorso(corsoDomian);
	save(iscrizioneDomain);

    }

//    @Override
//    public void saveOrUpdate(Iscrizione iscrizione) {
//	List<MaterialeNoleggiato> materialiNoleggiati = Optional.ofNullable(iscrizione.getMaterialiNoleggiati())
//		.orElse(new ArrayList<>());
//	if (!materialiNoleggiati.isEmpty()) {
//	    Iscrizione iscrizioneFake = new Iscrizione();
//	    iscrizioneFake.setId(iscrizione.getId());
//	    for (MaterialeNoleggiato materialeNoleggiato : materialiNoleggiati) {
//		materialeNoleggiato.setIscrizione(iscrizioneFake);
//	    }
//	}
//	super.saveOrUpdate(iscrizione);
//    }

}
