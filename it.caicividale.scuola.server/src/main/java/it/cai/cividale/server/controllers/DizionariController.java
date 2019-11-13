package it.cai.cividale.server.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.DizionariService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DizionariController {

    private final DizionariService dizionariService;

    @GetMapping(value = RestResources.ELENCO_MATERIALI, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ElencoMateriali> getElencoMateriali() {
	ElencoMateriali elencoMateriali = dizionariService.getElencoMateriali();

	return ResponseEntityUtils.create(elencoMateriali);
    }
}
