package it.cai.cividale.server.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.cai.cividale.server.domain.Corso;
import it.cai.cividale.server.exceptions.DaoException;
import it.cai.cividale.server.exceptions.ECodiceErrore;

@Repository
@Transactional
@SessionScope
public class CorsoDaoImpl extends AbstractDaoImpl<Corso> implements CorsoDao {

    @Override
    public List<Corso> getCorsiPerAnno(Integer anno) {
	try {
	    List<Corso> corsi = new ArrayList<>();
	    if (anno == null) {
		throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { "Anno nullo" });
	    }

	    LocalDate dateFrom = LocalDate.of(anno, 1, 1);
	    LocalDate dateTo = LocalDate.of(anno, 12, 31);

	    @SuppressWarnings("unchecked")
	    TypedQuery<Corso> query = sessionFactory.getCurrentSession().//
		    createQuery("from Corso where dataInizio between :dateFrom and :dateTo").//
		    setParameter("dateFrom", dateFrom).//
		    setParameter("dateTo", dateTo);
	    corsi = (List<Corso>) query.getResultList();
	    return corsi;
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

}
