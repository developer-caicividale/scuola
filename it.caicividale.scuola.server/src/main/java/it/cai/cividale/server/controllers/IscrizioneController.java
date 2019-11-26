package it.cai.cividale.server.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.IscrizioneService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class IscrizioneController {

    private final IscrizioneService iscrizioneService;

    @PostMapping(value = RestResources.ISCRIZIONE_CREA, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> creaIscrizione(@PathVariable(required = true) final Long idCorso,
	    @RequestBody Iscrizione iscrizione) {
	iscrizioneService.creaIscrizione(iscrizione, idCorso);

	return ResponseEntityUtils.create(null);
    }
}
