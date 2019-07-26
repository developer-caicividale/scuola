package it.caicividale.corsicai.ui.validators;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class BooleanWarningValidator implements IValidator {

    @Override
    public IStatus validate(Object value) {

	if (value != null && value instanceof Boolean) {
	    Boolean cond = (Boolean) value;
	    if (cond) {
		return ValidationStatus.ok();
	    }
	    return ValidationStatus.warning("Campo non popolato");
	}
	return ValidationStatus.warning("Campo non gestito");
    }

}
