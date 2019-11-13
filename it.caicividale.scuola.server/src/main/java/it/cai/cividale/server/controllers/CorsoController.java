package it.cai.cividale.server.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.CorsoService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.ElencoCorsi;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CorsoController {

    private final CorsoService corsoService;

    @GetMapping(value = RestResources.ELENCO_CORSI_ANNO, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElencoCorsi> getElencoCorsiPerAnno(@PathVariable(required = true) final Integer anno) {
	ElencoCorsi elencoCorsi = corsoService.getElencoCorsiPerAnno(anno);

	return ResponseEntityUtils.create(elencoCorsi);
    }

    @GetMapping(value = RestResources.CORSO, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Corso> getCorsoById(@PathVariable(required = true) final Long id) {
	Corso corso = corsoService.getCorsoById(id);

	return ResponseEntityUtils.create(corso);
    }

    @GetMapping(value = RestResources.ELENCO_ANNI_CORSI, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> getElencoAnniCorsi() {
	List<Integer> anniCorsi = corsoService.getElencoAnniCorsi();

	return ResponseEntityUtils.create(anniCorsi);
    }

}
