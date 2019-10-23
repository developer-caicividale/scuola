package it.caicividale.scuola.ui.validators;

import org.eclipse.core.databinding.validation.MultiValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

public class OkKoValidator extends MultiValidator {

    private final Boolean cond;

    public OkKoValidator(Boolean cond) {
	super();
	this.cond = cond;
    }

    @Override
    protected IStatus validate() {
	if (cond != null) {
	    if (cond)
		return ValidationStatus.ok();
	    else
		return ValidationStatus.info("Errori presenti");
	}
	return ValidationStatus.ok();
    }

}
