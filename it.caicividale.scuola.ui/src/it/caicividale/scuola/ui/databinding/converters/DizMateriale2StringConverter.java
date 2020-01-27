package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.service.ModelManager;

public class DizMateriale2StringConverter extends GenericsConverter<DizMateriale, String> {

    ModelManager modelManager = ModelManager.getInstance();

    public DizMateriale2StringConverter() {
	super(DizMateriale.class, String.class);
    }

    @Override
    public String apply(DizMateriale t) {
	if (t != null) {
	    return t.getNome();
	}
	return null;
    }

}
