package it.cai.cividale.server.domain.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.Persona;

@Component
@SessionScope
public class CorsoMapper {

    private final ModelMapper modelMapper;
    @Autowired
    private IscrizioneMapper iscrizioneMapper;

    @Autowired
    private IstruttoreMapper istruttoreMapper;

    @Autowired
    private PersonaMapper personaMapper;

    public CorsoMapper() {
	modelMapper = new ModelMapper();
	// modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
    }

    public Corso domain2model(it.cai.cividale.server.domain.Corso corsoDomain) {

	Corso corsoModel = ModelFactory.eINSTANCE.createCorso();

	for (it.cai.cividale.server.domain.Iscrizione iscrizioneDomain : corsoDomain.getIscrizioni()) {
	    Iscrizione iscrizioneModel = iscrizioneMapper.domain2model(iscrizioneDomain);
	    iscrizioneModel.setTotaleDaVersare(corsoDomain.getQuotaIscrizione());
	    iscrizioneModel.setDataFineCorso(corsoDomain.getDataFine());
	    corsoModel.getIscrizioni().add(iscrizioneModel);
	}

	Istruttore direttoreModel = istruttoreMapper.domain2model(corsoDomain.getDirettore());
	Istruttore vicedirettoreModel = istruttoreMapper.domain2model(corsoDomain.getViceDirettore());
	Persona segretario = personaMapper.domain2modelPersona(corsoDomain.getSegretario());

	corsoModel.setDirettore(direttoreModel);
	corsoModel.setViceDirettore(vicedirettoreModel);
	corsoModel.setSegretario(segretario);

	modelMapper.map(corsoDomain, corsoModel);

	corsoModel.setViceDirettore(vicedirettoreModel);

	return corsoModel;
    }
}
