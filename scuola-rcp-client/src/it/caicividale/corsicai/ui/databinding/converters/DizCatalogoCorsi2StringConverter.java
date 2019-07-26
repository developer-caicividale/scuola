package it.caicividale.corsicai.ui.databinding.converters;

import it.caicividale.corsicai.model.Corso;

public class DizCatalogoCorsi2StringConverter extends GenericsConverter<Corso, String> {

    public DizCatalogoCorsi2StringConverter() {
	super(Corso.class, String.class);
    }

    @Override
    public String apply(Corso corso) {
	String text = "";
	if (corso != null) {
	    text = corso.getNome() + " - " + corso.getSigla();
	}

	return text;
    }

}
