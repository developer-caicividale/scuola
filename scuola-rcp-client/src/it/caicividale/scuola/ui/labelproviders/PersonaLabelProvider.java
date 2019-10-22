package it.caicividale.scuola.ui.labelproviders;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import it.caicividale.scuola.emf.model.Persona;

public class PersonaLabelProvider extends LabelProvider {
    @Override
    public Image getImage(Object element) {
	return null;
    }

    @Override
    public String getText(Object element) {
	String text = null;
	if (element != null && element instanceof Persona) {
	    Persona persona = (Persona) element;
	    text = persona.getCognome() + " " + persona.getNome();
	}
	return text;
    }
}
