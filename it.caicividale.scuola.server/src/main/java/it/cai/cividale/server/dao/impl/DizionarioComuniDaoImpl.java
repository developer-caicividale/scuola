package it.cai.cividale.server.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.DizionarioComuniDao;
import it.cai.cividale.server.domain.DizComune;
import it.cai.cividale.server.exceptions.DaoException;
import it.cai.cividale.server.exceptions.ECodiceErrore;

@Repository
@Transactional
@SessionScope
public class DizionarioComuniDaoImpl extends AbstractDaoImpl<DizComune> implements DizionarioComuniDao {

    @Override
    public List<DizComune> listComuniPerRegione(String regione) {
	try {
	    @SuppressWarnings("unchecked")
	    TypedQuery<DizComune> query = sessionFactory.getCurrentSession().//
		    createQuery("from DizComune where regione = :regione order by comune").//
		    setParameter("regione", regione);
	    return (List<DizComune>) query.getResultList();
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

    @Override
    public List<String> listRegioni() {
	try {
	    @SuppressWarnings("unchecked")
	    TypedQuery<String> query = sessionFactory.getCurrentSession().//
		    createQuery("select distinct regione from DizComune order by regione");
	    return (List<String>) query.getResultList();
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

}
