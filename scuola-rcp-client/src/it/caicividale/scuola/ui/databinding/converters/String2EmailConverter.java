package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.valueobject.EMail;

public class String2EmailConverter extends GenericsConverter<String, EMail> {

    public String2EmailConverter() {
	super(String.class, EMail.class);
    }

    @Override
    public EMail apply(String string) {
	EMail email = null;
	if (string != null && !string.isEmpty()) {
	    try {
		email = new EMail(string);
	    } catch (Exception e) {
		throw new RuntimeException("Email inserita non corretta.");
	    }

	}

	return email;
    }

}
