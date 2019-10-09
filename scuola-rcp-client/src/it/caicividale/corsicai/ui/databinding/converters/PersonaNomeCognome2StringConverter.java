package it.caicividale.corsicai.ui.databinding.converters;

import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.Persona;

public class PersonaNomeCognome2StringConverter extends GenericsConverter<Persona, String> {

    public PersonaNomeCognome2StringConverter() {
	super(Persona.class, String.class);
    }

    @Override
    public String apply(Persona persona) {
	String text = "";
	if (persona != null) {
	    text = persona.getNome() + " " + persona.getCognome();
	}
	if (persona instanceof Istruttore) {
	    Istruttore istruttore = (Istruttore) persona;
	    text += " (" + istruttore.getTitolo() + ")";
	}
	return text;
    }

}