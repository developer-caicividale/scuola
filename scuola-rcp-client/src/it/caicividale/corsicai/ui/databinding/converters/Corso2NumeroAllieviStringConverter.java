package it.caicividale.corsicai.ui.databinding.converters;

import it.caicividale.corsicai.model.Corso;

public class Corso2NumeroAllieviStringConverter extends GenericsConverter<Corso, String> {

    public Corso2NumeroAllieviStringConverter() {
	super(Corso.class, String.class);
    }

    @Override
    public String apply(Corso corso) {
	String text = "";
	if (corso != null && corso.getNumeroAllievi() != null) {
	    text = corso.getNumeroAllievi().toString();
	}

	return text;
    }

}
