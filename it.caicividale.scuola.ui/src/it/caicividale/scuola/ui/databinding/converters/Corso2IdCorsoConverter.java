package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.Corso;

public class Corso2IdCorsoConverter extends GenericsConverter<Corso, Long> {

    public Corso2IdCorsoConverter() {
	super(Corso.class, Long.class);
    }

    @Override
    public Long apply(Corso corso) {
	Long id = null;
	if (corso != null && corso.getId() != null) {
	    id = corso.getId();
	}

	return id;
    }

}
