package it.cai.cividale.server.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.PersonaService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.ElencoIstruttori;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @GetMapping(value = RestResources.ELENCO_ISTRUTTORI, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElencoIstruttori> getElencoIstruttori() {
	ElencoIstruttori elencoIstruttori = personaService.getElencoIstruttori();

	return ResponseEntityUtils.create(elencoIstruttori);
    }
}
