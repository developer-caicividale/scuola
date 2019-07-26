package it.caicividale.corsicai.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

import it.caicividale.corsicai.model.valueobject.EMail;

public class TextEmailValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
	if (value == null) {
	    return ValidationStatus.ok();
	}
	if (value instanceof EMail) {
	    return ValidationStatus.ok();
	}
	return ValidationStatus.error("Email formalmente non corretta (xxxx@yyyy.zz)");
    }

}
