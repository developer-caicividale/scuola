package it.caicividale.scuola.ui.lov;

import org.eclipse.jface.viewers.LabelProvider;

import it.caicividale.scuola.emf.model.DizComune;

public class LovDizComuneLabelProvider extends LabelProvider {

    public LovDizComuneLabelProvider(final boolean showId) {
	super();
    }

    public LovDizComuneLabelProvider() {
	this(true);
    }

    @Override
    public String getText(final Object element) {
	String text = null;
	if (element instanceof DizComune) {
	    DizComune dizComune = (DizComune) element;
	    text = dizComune.getComune() + " (" + dizComune.getCap() + " - " + dizComune.getProvincia() + ")";

	}
	return text;
    }
}
