package it.caicividale.scuola.ui.parts.tableviewer.filters;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.ModelPackage;

public class ElencoIscrizioniFilter extends ViewerFilter {

    private String searchString;

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
	if (searchString == null || searchString.length() == 0) {
	    return true;
	}
	if (element != null && element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    Allievo allievo = iscrizione.getAllievo();
	    if (allievo.getCognome().toUpperCase().matches(searchString.toUpperCase())) {
		return true;
	    }
	    if (allievo.getNome().toUpperCase().matches(searchString.toUpperCase())) {
		return true;
	    }
	}

	return false;
    }

    @Override
    public boolean isFilterProperty(Object element, String property) {
	String[] filterProperties = { //
		ModelPackage.Literals.PERSONA__NOME.getName(), //
		ModelPackage.Literals.PERSONA__COGNOME.getName() //
	};//

	return (element instanceof Iscrizione && ArrayUtils.contains(filterProperties, property));
    }

    public void setSearchText(String s) {

	this.searchString = ".*" + s + ".*";
    }

}
