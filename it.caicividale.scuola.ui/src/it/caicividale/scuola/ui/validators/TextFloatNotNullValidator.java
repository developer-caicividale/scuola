package it.caicividale.scuola.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class TextFloatNotNullValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
	if (value == null) {
	    return ValidationStatus.error("inserire i dati");
	}
	if (value instanceof Float) {
	    return ValidationStatus.ok();
	}
	return ValidationStatus.error("Inserire solo numeri");
    }

}
