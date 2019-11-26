package it.cai.cividale.server.services;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import it.cai.cividale.server.dao.IscrizioneDao;
import it.cai.cividale.server.domain.mappers.IscrizioneMapper;
import it.caicividale.scuola.emf.model.Iscrizione;
import lombok.RequiredArgsConstructor;

@Service
@SessionScope
@RequiredArgsConstructor
public class IscrizioneService {

    private final IscrizioneDao iscrizioneDao;
    private final IscrizioneMapper mapper;

    public void creaIscrizione(@NotNull Iscrizione iscrizioneModel, @NotNull Long idCorso) {
	it.cai.cividale.server.domain.Iscrizione iscrizioneDomain = mapper.model2domain(iscrizioneModel);

	iscrizioneDao.save(iscrizioneDomain, idCorso);
    }
}
