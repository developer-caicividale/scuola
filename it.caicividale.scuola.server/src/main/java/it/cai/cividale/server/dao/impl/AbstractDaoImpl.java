package it.cai.cividale.server.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.Dao;
import it.cai.cividale.server.exceptions.DaoException;
import it.cai.cividale.server.exceptions.ECodiceErrore;

@SessionScope
@Repository
@Transactional
public abstract class AbstractDaoImpl<T> implements Dao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    @SuppressWarnings("unused")
    private final Class<T> genericType;

    @SuppressWarnings("unchecked")
    public AbstractDaoImpl() {
	try {
	    this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), AbstractDaoImpl.class);
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> list() {
	try {
	    TypedQuery<T> query = sessionFactory.getCurrentSession().createQuery("from " + genericType.getName());
	    return (List<T>) query.getResultList();
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

    @Override
    public T objectById(Long id) {
	try {
	    Session session = sessionFactory.getCurrentSession();
	    return (T) session.get(genericType, id);
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}
    }

    @Override
    public void save(T object) {
	try {
	    sessionFactory.getCurrentSession().save(object);
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}

    }

    @Override
    public void saveOrUpdate(T object) {
	try {
	    sessionFactory.getCurrentSession().saveOrUpdate(object);
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}

    }

    @Override
    public void update(T object) {
	try {
	    sessionFactory.getCurrentSession().update(object);
	} catch (Exception e) {
	    throw new DaoException(ECodiceErrore.DAO_ERROR, new Object[] { e.getMessage() });
	}

    }

}
