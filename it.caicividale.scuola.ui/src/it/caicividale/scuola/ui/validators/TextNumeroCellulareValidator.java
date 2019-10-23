package it.caicividale.scuola.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;

public class TextNumeroCellulareValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
	if (value == null) {
	    return ValidationStatus.ok();
	}
	if (value instanceof NumeroCellulare) {
	    return ValidationStatus.ok();
	}
	return ValidationStatus.error("Numero cellulare formalmente non corretto");
    }

}
