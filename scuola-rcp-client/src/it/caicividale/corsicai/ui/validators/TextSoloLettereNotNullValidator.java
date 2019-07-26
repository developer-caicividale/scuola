package it.caicividale.corsicai.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class TextSoloLettereNotNullValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
	if (value == null) {
	    return ValidationStatus.error("inserire i dati");
	}
	if (value instanceof String) {
	    String s = (String) value;
	    if (s.isEmpty()) {
		return ValidationStatus.error("inserire i dati");
	    }
	    TextSoloLettereValidator textSoloLettereValidator = new TextSoloLettereValidator(null);
	    return textSoloLettereValidator.validate(value);
	}
	return ValidationStatus.error("inserire solo lettere (a-z)");
    }

}
