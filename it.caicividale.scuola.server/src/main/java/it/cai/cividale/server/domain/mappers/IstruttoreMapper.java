package it.cai.cividale.server.domain.mappers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.Persona;

@Component
@SessionScope
public class IstruttoreMapper extends PersonaMapper {
    private final ModelMapper modelMapper;

    public IstruttoreMapper() {
	modelMapper = new ModelMapper();

    }

    public it.cai.cividale.server.domain.Istruttore model2domain(Istruttore model) {

	return modelMapper.map(model, it.cai.cividale.server.domain.Istruttore.class);
    }

    public Istruttore domain2model(it.cai.cividale.server.domain.Istruttore domain) {
	Istruttore model = ModelFactory.eINSTANCE.createIstruttore();
	Persona personaModel = super.domain2modelPersona(domain);
	modelMapper.map(personaModel, model);
	modelMapper.map(domain, model);
	return model;
    }

    public List<Istruttore> domain2model(List<it.cai.cividale.server.domain.Istruttore> istruttoriDomain) {
	List<Istruttore> istruttoriModel = new ArrayList<>();
	for (it.cai.cividale.server.domain.Istruttore istruttoreDomain : istruttoriDomain) {
	    Istruttore istruttoreModel = domain2model(istruttoreDomain);
	    istruttoriModel.add(istruttoreModel);
	}
//	modelMapper.map(materialiDomain, new TypeToken<List<DizMateriale>>() {
//	}.getType());
	return istruttoriModel;
    }
}
