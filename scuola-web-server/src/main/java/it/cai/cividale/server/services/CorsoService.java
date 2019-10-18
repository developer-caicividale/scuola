package it.cai.cividale.server.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.caicividale.corsicai.model.Corso;

@Service
@SessionScope
public class CorsoService {

    private CorsoDao corsoDao;

    public CorsoService(CorsoDao corsoDao) {
	this.corsoDao = corsoDao;
    }

    public List<Corso> getElencoCorsiPerAnno(Integer anno) {
	List<it.cai.cividale.server.domain.Corso> corsiPerAnno = corsoDao.getCorsiPerAnno(anno);

	return null;

    }
}
