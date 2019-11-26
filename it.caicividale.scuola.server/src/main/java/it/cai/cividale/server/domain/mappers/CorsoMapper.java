package it.cai.cividale.server.domain.mappers;

import org.modelmapper.AbstractProvider;
import org.modelmapper.ModelMapper;
import org.modelmapper.Provider;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.domain.Iscrizione;
import it.cai.cividale.server.domain.mappers.converters.EmailConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.EmailConverterModel2Domain;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterDomain2Model;
import it.cai.cividale.server.domain.mappers.converters.NumeroCellulareConverterModel2Domain;
import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.emf.model.impl.CorsoImpl;
import it.caicividale.scuola.emf.model.impl.IstruttoreImpl;

@Component
@SessionScope
public class CorsoMapper {

    private final ModelMapper modelMapper;
    @Autowired
    private IscrizioneMapper iscrizioneMapper;

    public CorsoMapper() {
	modelMapper = new ModelMapper();
	// modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
	TypeMap<it.cai.cividale.server.domain.Corso, CorsoImpl> typeMap = modelMapper
		.createTypeMap(it.cai.cividale.server.domain.Corso.class, CorsoImpl.class);

	Provider<Persona> personaProvider = new AbstractProvider<Persona>() {
	    @Override
	    protected Persona get() {
		return ModelFactory.eINSTANCE.createPersona();
	    }

	};

	Provider<Istruttore> istruttoreProvider = new AbstractProvider<Istruttore>() {
	    @Override
	    protected Istruttore get() {
		return ModelFactory.eINSTANCE.createIstruttore();
	    }

	};

	modelMapper.addConverter(new NumeroCellulareConverterModel2Domain());
	modelMapper.addConverter(new NumeroCellulareConverterDomain2Model());

	modelMapper.addConverter(new EmailConverterModel2Domain());
	modelMapper.addConverter(new EmailConverterDomain2Model());

	typeMap.addMappings(mapper -> {
	    mapper.with(personaProvider).map(it.cai.cividale.server.domain.Corso::getSegretario,
		    CorsoImpl::setSegretario);
	    mapper.with(istruttoreProvider).map(it.cai.cividale.server.domain.Corso::getDirettore,
		    CorsoImpl::setDirettore);
	    mapper.with(istruttoreProvider).map(it.cai.cividale.server.domain.Corso::getViceDirettore,
		    CorsoImpl::setViceDirettore);

	});

    }

    public Corso domain2model(it.cai.cividale.server.domain.Corso corsoDomain) {

	CorsoImpl corsoModel = modelMapper.map(corsoDomain, CorsoImpl.class);

	IstruttoreImpl direttoreModel = modelMapper.map(corsoDomain.getDirettore(), IstruttoreImpl.class);

	corsoModel.setDirettore(direttoreModel);

	IstruttoreImpl vicedirettoreModel = modelMapper.map(corsoDomain.getViceDirettore(), IstruttoreImpl.class);

	corsoModel.setViceDirettore(vicedirettoreModel);

	for (Iscrizione iscrizioneDomain : corsoDomain.getIscrizioni()) {
	    corsoModel.getIscrizioni().add(iscrizioneMapper.domain2model(iscrizioneDomain));
	}

	return corsoModel;
    }
}
