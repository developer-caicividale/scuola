package it.caicividale.corsicai.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class DifferenzaQuotaValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {
	if (value != null) {
	    Float differenzaQuota = Float.parseFloat((String) value);
	    if (differenzaQuota >= 0) {
		return ValidationStatus.ok();
	    } else {

		return ValidationStatus.warning("La differenza tra la quota versata e la quota da versare è negativa");
	    }
	}
	return ValidationStatus.ok();
    }

}
