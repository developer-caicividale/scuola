package it.cai.cividale.server.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.cai.cividale.server.services.MaterialeNoleggiatoService;
import it.cai.cividale.server.web.ResponseEntityUtils;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.sharedresources.RestResources;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MaterialeNoleggiatoController {

    private final MaterialeNoleggiatoService materialeNoleggiatoService;

    @PostMapping(value = RestResources.MATERIALE_NOLEGGIATO_ADD, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> nuovoMaterialeNoleggiato(@PathVariable(required = true) final Long idIscrizione,
	    @RequestBody MaterialeNoleggiato materialeNoleggiato) {
	Long id = materialeNoleggiatoService.nuovoMaterialeNoleggiato(idIscrizione, materialeNoleggiato);

	return ResponseEntityUtils.create(id);
    }

    @PutMapping(value = RestResources.MATERIALE_NOLEGGIATO_UPDATE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> aggiornaMaterialeNoleggiato(@RequestBody MaterialeNoleggiato materialeNoleggiato) {
	materialeNoleggiatoService.aggiornaMaterialeNoleggiato(materialeNoleggiato);

	return ResponseEntityUtils.create(null);
    }

    @PutMapping(value = RestResources.MATERIALE_NOLEGGIATO_DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> cancellaMaterialeNoleggiato(@RequestBody MaterialeNoleggiato materialeNoleggiato) {
	materialeNoleggiatoService.cancellaMaterialeNoleggiato(materialeNoleggiato);

	return ResponseEntityUtils.create(null);
    }

}
