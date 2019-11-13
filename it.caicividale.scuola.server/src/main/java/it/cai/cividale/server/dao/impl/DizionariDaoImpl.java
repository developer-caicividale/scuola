package it.cai.cividale.server.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.DizionarioMaterialiDao;
import it.cai.cividale.server.domain.DizMateriale;

@Repository
@Transactional
@SessionScope
public class DizionariDaoImpl extends AbstractDaoImpl<DizMateriale> implements DizionarioMaterialiDao {

}
