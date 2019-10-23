package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;

public class NumeroCellulare2StringConverter extends GenericsConverter<NumeroCellulare, String> {

    public NumeroCellulare2StringConverter() {
	super(NumeroCellulare.class, String.class);
    }

    @Override
    public String apply(NumeroCellulare telefono) {
	String string = null;
	if (telefono != null && !telefono.getValue().isEmpty()) {
	    try {
		string = telefono.getValue();
	    } catch (Exception e) {
		throw new RuntimeException("Errore nella conversione in stringa del numero di cellulare.");
	    }

	}

	return string;
    }

}
