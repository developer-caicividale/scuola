package it.cai.cividale.server.services;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.IscrizioneDao;
import it.cai.cividale.server.domain.mappers.IscrizioneMapper;
import it.cai.cividale.server.domain.mappers.MaterialeNoleggaitoMapper;
import it.caicividale.scuola.emf.model.Iscrizione;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class IscrizioneService {

    private final IscrizioneDao iscrizioneDao;
    private final IscrizioneMapper mapper;
    private final MaterialeNoleggaitoMapper materialeNoleggaitoMapper;

    public void creaIscrizione(@NotNull Iscrizione iscrizioneModel, @NotNull Long idCorso) {
	it.cai.cividale.server.domain.Iscrizione iscrizioneDomain = mapper.model2domain(iscrizioneModel);

	iscrizioneDao.save(iscrizioneDomain, idCorso);
    }

    public void aggiornaIscrizione(Iscrizione iscrizioneModel, Long idCorso) {
	it.cai.cividale.server.domain.Iscrizione iscrizioneDomain = mapper.model2domain(iscrizioneModel);
	it.cai.cividale.server.domain.Corso corso = new it.cai.cividale.server.domain.Corso();
	corso.setId(idCorso);
	iscrizioneDomain.setCorso(corso);
	iscrizioneDao.update(iscrizioneDomain);

    }

}
