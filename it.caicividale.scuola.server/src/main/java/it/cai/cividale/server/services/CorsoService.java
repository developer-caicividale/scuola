package it.cai.cividale.server.services;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.CorsoDao;
import it.cai.cividale.server.domain.mappers.CorsoMapper;
import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.ElencoCorsi;
import it.caicividale.scuola.emf.model.ModelFactory;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class CorsoService {
    private final CorsoDao corsoDao;

    private final CorsoMapper corsoMapper;

    public ElencoCorsi getElencoCorsiPerAnno(Integer anno) {
	List<it.cai.cividale.server.domain.Corso> corsiPerAnnoDomain = corsoDao.getCorsiPerAnno(anno);
	ElencoCorsi elencoCorsi = ModelFactory.eINSTANCE.createElencoCorsi();
	EList<Corso> corsiPerAnnoModel = elencoCorsi.getElencoCorsi();

	for (it.cai.cividale.server.domain.Corso corsoDomain : corsiPerAnnoDomain) {
	    Corso corsoModel = corsoMapper.domain2model(corsoDomain);
	    // Corso corsoModel = corsoMapper.corsoModelToCorsoDomain(corsoDomain);
	    corsiPerAnnoModel.add(corsoModel);
	}

	return elencoCorsi;

    }

    public Corso getCorsoById(Long id) {
	it.cai.cividale.server.domain.Corso corsoDomain = corsoDao.objectById(id);
	return corsoMapper.domain2model(corsoDomain);
    }
}
