package it.caicividale.scuola.ui.parts.tableviewer.filters;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.jface.viewers.Viewer;

import it.caicividale.scuola.emf.model.ModelPackage;

public class RegioneFilter extends ContentFilter {

    private String searchString;

    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
	if (searchString == null || searchString.length() == 0) {
	    return true;
	}
	if (element != null && element instanceof String) {
	    String regione = (String) element;
	    if (regione.toUpperCase().matches(searchString.toUpperCase())) {
		return true;
	    }

	}

	return false;
    }

    @Override
    public boolean isFilterProperty(Object element, String property) {
	String[] filterProperties = { //
		ModelPackage.Literals.DIZ_COMUNE__REGIONE.getName() };//

	return (element instanceof String && ArrayUtils.contains(filterProperties, property));
    }

    @Override
    public void setSearchText(String s) {

	this.searchString = ".*" + s + ".*";
    }

}
