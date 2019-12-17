package it.caicividale.scuola.ui.parts.tableviewer.filters;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.jface.viewers.Viewer;

import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.ModelPackage;

public class ComuneFilter extends ContentFilter {

    private String searchString;

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
	if (searchString == null || searchString.length() == 0) {
	    return true;
	}
	if (element != null && element instanceof DizComune) {
	    DizComune dizComune = (DizComune) element;
	    String comune = dizComune.getComune();
	    if (comune.toUpperCase().matches(searchString.toUpperCase())) {
		return true;
	    }

	}

	return false;
    }

    @Override
    public boolean isFilterProperty(Object element, String property) {
	String[] filterProperties = { //
		ModelPackage.Literals.DIZ_COMUNE__COMUNE.getName() };//

	return (element instanceof DizComune && ArrayUtils.contains(filterProperties, property));
    }

    @Override
    public void setSearchText(String s) {

	this.searchString = ".*" + s + ".*";
    }

}
