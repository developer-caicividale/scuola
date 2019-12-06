package it.cai.cividale.server.domain.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.Persona;

@Component
@SessionScope
public class AllievoMapper extends PersonaMapper {
    private final ModelMapper modelMapper;

    public AllievoMapper() {
	modelMapper = new ModelMapper();

    }

    public it.cai.cividale.server.domain.Allievo model2domain(Allievo model) {

	return modelMapper.map(model, it.cai.cividale.server.domain.Allievo.class);
    }

    public Allievo domain2model(it.cai.cividale.server.domain.Allievo domain) {
	Allievo model = ModelFactory.eINSTANCE.createAllievo();
	Persona personaModel = super.domain2modelPersona(domain);
	modelMapper.map(personaModel, model);
	modelMapper.map(domain, model);
	return model;
    }
}
