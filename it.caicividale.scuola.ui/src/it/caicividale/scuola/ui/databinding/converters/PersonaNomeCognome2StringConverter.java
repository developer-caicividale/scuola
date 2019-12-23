package it.caicividale.scuola.ui.databinding.converters;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.ElencoIscrizioniLabelProvider;

public class PersonaNomeCognome2StringConverter extends GenericsConverter<Persona, String> {

    public PersonaNomeCognome2StringConverter() {
	super(Persona.class, String.class);
    }

    @Override
    public String apply(Persona persona) {
	String text = "";
	if (persona != null) {
	    text = persona.getNome() + " " + persona.getCognome();

	    if (persona instanceof Allievo) {
		Allievo allievo = (Allievo) persona;
		ElencoIscrizioniLabelProvider labelProvider = new ElencoIscrizioniLabelProvider(null);
		text = labelProvider.getInfoAllievo(allievo);
	    }

	    if (persona instanceof Istruttore) {
		Istruttore istruttore = (Istruttore) persona;
		text += " (" + istruttore.getTitolo() + ")";
	    }
	}
	return text;
    }

}
