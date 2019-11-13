package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.service.ModelManager;

public class Iscrizione2NumeroAllieviStringConverter extends GenericsConverter<Iscrizione, String> {
    private final ModelManager modelManager = ModelManager.getInstance();

    public Iscrizione2NumeroAllieviStringConverter() {
	super(Iscrizione.class, String.class);
    }

    @Override
    public String apply(Iscrizione iscrizione) {
	String text = "";
	if (modelManager.getCorsoObservable().getValue() != null) {
	    text = modelManager.getCorsoObservable().getValue().getNumeroAllieviNuoviIscritti().toString();
	}

	return text;
    }

}
