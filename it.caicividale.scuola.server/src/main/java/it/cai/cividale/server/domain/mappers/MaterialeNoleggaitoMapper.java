package it.cai.cividale.server.domain.mappers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelFactory;

@Component
@SessionScope
public class MaterialeNoleggaitoMapper {

    @Autowired
    DizionariMapper dizionariMapper;

    private final ModelMapper modelMapper;

    public MaterialeNoleggaitoMapper() {
	modelMapper = new ModelMapper();

    }

    public it.cai.cividale.server.domain.MaterialeNoleggiato model2Domain(
	    MaterialeNoleggiato materialeNoleggiatoModel) {
	it.cai.cividale.server.domain.MaterialeNoleggiato materialeNoleggiatoDomain = new it.cai.cividale.server.domain.MaterialeNoleggiato();

	modelMapper.map(materialeNoleggiatoModel, materialeNoleggiatoDomain);
	return materialeNoleggiatoDomain;
    }

    public MaterialeNoleggiato domain2Model(
	    it.cai.cividale.server.domain.MaterialeNoleggiato materialeNoleggiatoDomain) {
	MaterialeNoleggiato materialeNoleggiatoModel = ModelFactory.eINSTANCE.createMaterialeNoleggiato();
	DizMateriale dizMaterialeModel = dizionariMapper
		.domain2modelMateriali(materialeNoleggiatoDomain.getMateriale());
	materialeNoleggiatoModel.setMateriale(dizMaterialeModel);
	modelMapper.map(materialeNoleggiatoDomain, materialeNoleggiatoModel);
	return materialeNoleggiatoModel;
    }

    public List<it.cai.cividale.server.domain.MaterialeNoleggiato> model2Domain(
	    List<MaterialeNoleggiato> materialeNoleggiatoModel) {
	List<it.cai.cividale.server.domain.MaterialeNoleggiato> materialeNoleggiatodomain = new ArrayList<>();

	for (MaterialeNoleggiato materialeNoleggiato : materialeNoleggiatoModel) {

	    materialeNoleggiatodomain.add(model2Domain(materialeNoleggiato));
	}
	return materialeNoleggiatodomain;

    }

}
