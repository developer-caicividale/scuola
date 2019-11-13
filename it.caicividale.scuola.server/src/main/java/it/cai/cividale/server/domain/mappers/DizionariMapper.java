package it.cai.cividale.server.domain.mappers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ModelFactory;

@Component
@SessionScope
public class DizionariMapper {
    private final ModelMapper modelMapper;

    public DizionariMapper() {
	modelMapper = new ModelMapper();
//	// modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
//	TypeMap<it.cai.cividale.server.domain.DizMateriale, DizMaterialeImpl> typeMapDizMateriale = modelMapper
//		.createTypeMap(it.cai.cividale.server.domain.DizMateriale.class, DizMaterialeImpl.class);
//	
//
//	Provider<DizMateriale> dizMaterialeProvider = new AbstractProvider<DizMateriale>() {
//	    @Override
//	    protected DizMateriale get() {
//		return ModelFactory.eINSTANCE.createDizMateriale();
//	    }
//
//	};
//	modelMapper.getConfiguration().setProvider(dizMaterialeProvider);

	// typeMapDizMateriale.addMapping(mapper->{ mapper.map()});

    }

    public List<DizMateriale> domain2model(List<it.cai.cividale.server.domain.DizMateriale> materialiDomain) {
	List<DizMateriale> materialiModel = new ArrayList<>();
	for (it.cai.cividale.server.domain.DizMateriale dizMaterialeDomain : materialiDomain) {
	    DizMateriale dizMaterialeModel = ModelFactory.eINSTANCE.createDizMateriale();
	    modelMapper.map(dizMaterialeDomain, dizMaterialeModel);
	    materialiModel.add(dizMaterialeModel);
	}
//	modelMapper.map(materialiDomain, new TypeToken<List<DizMateriale>>() {
//	}.getType());
	return materialiModel;
    }
}
