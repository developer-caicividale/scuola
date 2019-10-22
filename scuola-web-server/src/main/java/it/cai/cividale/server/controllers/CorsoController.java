package it.cai.cividale.server.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.CorsoService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.ElencoCorsi;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;

@RestController
public class CorsoController {

    CorsoService corsoService;

    public CorsoController(CorsoService corsoService) {
	super();
	this.corsoService = corsoService;
    }

    @GetMapping(value = RestResources.ELENCO_CORSI_ANNO, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElencoCorsi> getElencoCorsiPerAnno(@PathVariable(required = true) final Integer anno) {
	corsoService.getElencoCorsiPerAnno(anno);
	return ResponseEntityUtils.create(null);
    }

}
