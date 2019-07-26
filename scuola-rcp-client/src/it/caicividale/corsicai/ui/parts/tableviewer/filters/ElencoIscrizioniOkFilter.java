package it.caicividale.corsicai.ui.parts.tableviewer.filters;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import it.caicividale.corsicai.model.Iscrizione;

public class ElencoIscrizioniOkFilter extends ViewerFilter {

    private boolean isToApply = false;

    public boolean isToApply() {
	return isToApply;
    }

    public void setToApply(boolean isToApply) {
	this.isToApply = isToApply;
    }

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
	if (element != null && element instanceof Iscrizione && isToApply) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    return iscrizione.getIsIscrizioneOk();
	}

	return true;
    }

}
