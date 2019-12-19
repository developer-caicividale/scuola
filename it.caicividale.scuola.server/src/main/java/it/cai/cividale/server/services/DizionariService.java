package it.cai.cividale.server.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.DizionarioComuniDao;
import it.cai.cividale.server.dao.DizionarioMaterialiDao;
import it.cai.cividale.server.domain.mappers.DizionariMapper;
import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ElencoComuni;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.ModelFactory;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class DizionariService {

    private final DizionarioMaterialiDao dizionarioMaterialiDao;
    private final DizionarioComuniDao dizionarioComuniDao;
    private final DizionariMapper mapper;

    public ElencoMateriali getElencoMateriali() {
	List<it.cai.cividale.server.domain.DizMateriale> materialiDomain = dizionarioMaterialiDao.list();

	List<DizMateriale> materialiModel = mapper.domain2modelMateriali(materialiDomain);

	ElencoMateriali elencoMateriali = ModelFactory.eINSTANCE.createElencoMateriali();
	elencoMateriali.getElencoMateriali().addAll(materialiModel);

	return elencoMateriali;

    }

    public ElencoComuni getElencoComuni(String regione) {
	List<it.cai.cividale.server.domain.DizComune> comuniDomain = dizionarioComuniDao.listComuniPerRegione(regione);

	List<DizComune> comuniModel = mapper.domain2modelComuni(comuniDomain);

	ElencoComuni elencoComuni = ModelFactory.eINSTANCE.createElencoComuni();
	elencoComuni.getElencoComuni().addAll(comuniModel);

	return elencoComuni;
    }

    public List<String> getElencoRegioni() {
	return dizionarioComuniDao.listRegioni();
    }
}
