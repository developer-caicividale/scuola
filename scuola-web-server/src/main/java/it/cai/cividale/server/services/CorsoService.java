package it.cai.cividale.server.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.cai.cividale.server.domain.mappers.CorsoMapper;
import it.caicividale.scuola.emf.model.Corso;

@Service
@SessionScope
//@RequiredArgsConstructor
public class CorsoService {
    @Autowired
    private CorsoDao corsoDao;

    public List<Corso> getElencoCorsiPerAnno(Integer anno) {
	List<it.cai.cividale.server.domain.Corso> corsiPerAnnoDomain = corsoDao.getCorsiPerAnno(anno);
	List<Corso> corsiPerAnnoModel = new ArrayList<>();
	for (it.cai.cividale.server.domain.Corso corsoDomain : corsiPerAnnoDomain) {
	    Corso corsoModel = CorsoMapper.INSTANCE.corsoModelToCorsoDomain(corsoDomain);
	    corsiPerAnnoModel.add(corsoModel);
	}

	return corsiPerAnnoModel;

    }
}
