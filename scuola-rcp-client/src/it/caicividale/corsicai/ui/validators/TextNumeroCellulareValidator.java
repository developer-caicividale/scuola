package it.caicividale.corsicai.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

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
