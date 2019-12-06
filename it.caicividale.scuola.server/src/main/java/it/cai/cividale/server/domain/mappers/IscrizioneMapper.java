package it.cai.cividale.server.domain.mappers;

import org.modelmapper.AbstractProvider;
import org.modelmapper.ModelMapper;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.domain.mappers.converters.EmailConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.EmailConverterModel2Domain;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterModel2Domain;
import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.impl.IscrizioneImpl;

@Component
@SessionScope
public class IscrizioneMapper {
    private final ModelMapper modelMapper;

    @Autowired
    private AllievoMapper allievoMapper;

    public IscrizioneMapper() {
	modelMapper = new ModelMapper();
	TypeMap<it.cai.cividale.server.domain.Iscrizione, IscrizioneImpl> typeMapDomain2Model = modelMapper
		.createTypeMap(it.cai.cividale.server.domain.Iscrizione.class, IscrizioneImpl.class);

	Provider<Allievo> allievoProvider = new AbstractProvider<Allievo>() {
	    @Override
	    protected Allievo get() {
		return ModelFactory.eINSTANCE.createAllievo();
	    }

	};

	modelMapper.addConverter(new NumeroCellulareConverterModel2Domain());
	modelMapper.addConverter(new NumeroCellulareConverterDomain2Model());

	modelMapper.addConverter(new EmailConverterModel2Domain());
	modelMapper.addConverter(new EmailConverterDomain2Model());

	typeMapDomain2Model.addMappings(mapper -> {

	    mapper.with(allievoProvider).map(it.cai.cividale.server.domain.Iscrizione::getAllievo,
		    IscrizioneImpl::setAllievo);

	});

    }

    public Iscrizione domain2model(it.cai.cividale.server.domain.Iscrizione domain) {
	Iscrizione model = ModelFactory.eINSTANCE.createIscrizione();
	modelMapper.map(domain, model);

	Allievo allievo = allievoMapper.domain2model(domain.getAllievo());
	model.setAllievo(allievo);
	return model;
    }

    public it.cai.cividale.server.domain.Iscrizione model2domain(Iscrizione model) {
	it.cai.cividale.server.domain.Allievo allievo = allievoMapper.model2domain(model.getAllievo());

	it.cai.cividale.server.domain.Iscrizione iscrizione = modelMapper.map(model,
		it.cai.cividale.server.domain.Iscrizione.class);
	iscrizione.setAllievo(allievo);
	return iscrizione;
    }
}
