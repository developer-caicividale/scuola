package it.caicividale.scuola.ui.validators;

import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ListViewer;

public class ListEmptyValidator extends MultiValidator {

    private final ListViewer listViewer;

    public ListEmptyValidator(ListViewer listViewer) {
	super();
	this.listViewer = listViewer;
    }

    @Override
    protected IStatus validate() {
	if (listViewer.getList().getItemCount() > 0) {
	    return ValidationStatus.info("Errori presenti");
	}
	return ValidationStatus.ok();
    }

}
