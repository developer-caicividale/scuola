package it.cai.cividale.server.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.DizionarioMaterialiDao;
import it.cai.cividale.server.domain.mappers.DizionariMapper;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.ModelFactory;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class DizionariService {

    private final DizionarioMaterialiDao dizionarioMaterialiDao;
    private final DizionariMapper mapper;

    public ElencoMateriali getElencoMateriali() {
	List<it.cai.cividale.server.domain.DizMateriale> materialiDomain = dizionarioMaterialiDao.list();

	List<DizMateriale> materialiModel = mapper.domain2model(materialiDomain);

	ElencoMateriali elencoMateriali = ModelFactory.eINSTANCE.createElencoMateriali();
	elencoMateriali.getElencoMateriali().addAll(materialiModel);

	return elencoMateriali;

    }
}
