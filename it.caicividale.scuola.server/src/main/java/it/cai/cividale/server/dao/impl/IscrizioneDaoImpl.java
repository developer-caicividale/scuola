package it.cai.cividale.server.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.cai.cividale.server.dao.IscrizioneDao;
import it.cai.cividale.server.domain.Corso;
import it.cai.cividale.server.domain.Iscrizione;

@Repository
@Transactional
@SessionScope
public class IscrizioneDaoImpl extends AbstractDaoImpl<Iscrizione> implements IscrizioneDao {
    @Autowired
    CorsoDao corsoDao;

    @Override
    public void save(Iscrizione iscrizioneDomain, Long idCorso) {
	Corso corsoDomian = corsoDao.objectById(idCorso);
	corsoDomian.setId(idCorso);
	corsoDomian.getIscrizioni().add(iscrizioneDomain);
	save(iscrizioneDomain);

    }

}
