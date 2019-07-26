package it.caicividale.corsicai.ui.databinding.converters;

import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

public class String2NumeroCellulareConverter extends GenericsConverter<String, NumeroCellulare> {

    public String2NumeroCellulareConverter() {
	super(String.class, NumeroCellulare.class);
    }

    @Override
    public NumeroCellulare apply(String string) {
	NumeroCellulare telefono = null;
	if (string != null && !string.isEmpty()) {
	    try {
		telefono = new NumeroCellulare(string);
	    } catch (Exception e) {
		throw new RuntimeException("Numero inserito non corretto.");
	    }

	}

	return telefono;
    }

}
