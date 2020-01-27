package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.service.ModelManager;

public class String2DizMaterialeConverter extends GenericsConverter<String, DizMateriale> {

    ModelManager modelManager = ModelManager.getInstance();

    public String2DizMaterialeConverter() {
	super(String.class, DizMateriale.class);
    }

    @Override
    public DizMateriale apply(String t) {
	if (t != null) {
	    return modelManager.getElencoDizMaterialeObservableList().stream().filter(d -> d.getNome().equals(t))
		    .findFirst().orElse(null);
	}
	return null;
    }

}
