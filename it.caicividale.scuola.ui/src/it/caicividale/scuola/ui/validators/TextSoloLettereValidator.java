package it.caicividale.scuola.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

/**
 * Validatore che valida la presenza di sole lettere. Se num è non null viene validata esclusivamente la presenza di <num> lettere
 * 
 * @author 913725
 *
 */
public class TextSoloLettereValidator implements IValidator {

    private final Integer num;

    public TextSoloLettereValidator(Integer num) {
	this.num = num;
    }

    @Override
    public IStatus validate(Object value) {

	if (value instanceof String) {
	    String s = (String) value;
	    if (num == null) {
		if (s.matches("[a-zA-Z ]+\\.?")) {
		    return ValidationStatus.ok();
		}
	    } else {
		if (s.matches("[a-zA-Z]{" + num + "}")) {
		    return ValidationStatus.ok();
		} else {
		    ValidationStatus.error("inserire solo " + num + " lettere (a-z)");
		}
	    }
	}
	return ValidationStatus.error("inserire solo lettere (a-z)");
    }

}
