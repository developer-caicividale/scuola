package it.cai.cividale.server.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.IstruttoreDao;
import it.cai.cividale.server.domain.Istruttore;

@Repository
@Transactional
@SessionScope
public class IstruttoreDaoImpl extends AbstractDaoImpl<Istruttore> implements IstruttoreDao {

}
