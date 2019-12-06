package it.cai.cividale.server.domain.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.domain.mappers.converters.EmailConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.EmailConverterModel2Domain;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterModel2Domain;
import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.Persona;

@Component
@SessionScope
public class PersonaMapper {
    private final ModelMapper modelMapper;

    public PersonaMapper() {
	modelMapper = new ModelMapper();

	modelMapper.addConverter(new NumeroCellulareConverterModel2Domain());
	modelMapper.addConverter(new NumeroCellulareConverterDomain2Model());

	modelMapper.addConverter(new EmailConverterModel2Domain());
	modelMapper.addConverter(new EmailConverterDomain2Model());

    }

    public Persona domain2modelPersona(it.cai.cividale.server.domain.Persona personaDomain) {
	Persona personaModel = ModelFactory.eINSTANCE.createPersona();
	if (personaDomain.getComuneNascita() != null) {
	    DizComune comuneNascitaModel = ModelFactory.eINSTANCE.createDizComune();
	    modelMapper.map(personaDomain.getComuneNascita(), comuneNascitaModel);
	    personaModel.setComuneNascita(comuneNascitaModel);
	}
	if (personaDomain.getComuneResidenza() != null) {
	    DizComune comuneReisndenzaModel = ModelFactory.eINSTANCE.createDizComune();
	    modelMapper.map(personaDomain.getComuneResidenza(), comuneReisndenzaModel);
	    personaModel.setComuneResidenza(comuneReisndenzaModel);
	}
	modelMapper.map(personaDomain, personaModel);
	return personaModel;

    }
}
