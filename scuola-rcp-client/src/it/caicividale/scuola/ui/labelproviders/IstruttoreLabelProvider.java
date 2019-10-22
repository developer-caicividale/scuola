package it.caicividale.scuola.ui.labelproviders;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import it.caicividale.scuola.emf.model.Istruttore;

public class IstruttoreLabelProvider extends LabelProvider {
    @Override
    public Image getImage(Object element) {
	return null;
    }

    @Override
    public String getText(Object element) {
	String text = null;
	if (element != null && element instanceof Istruttore) {
	    Istruttore istruttore = (Istruttore) element;
	    String nonAttivoText = "";
	    if (!istruttore.getIsAttivo()) {
		nonAttivoText = " (NON ATTIVO)";
	    }
	    text = istruttore.getCognome() + " " + istruttore.getNome() + " - " + istruttore.getTitolo() + nonAttivoText;
	}
	return text;
    }
}
