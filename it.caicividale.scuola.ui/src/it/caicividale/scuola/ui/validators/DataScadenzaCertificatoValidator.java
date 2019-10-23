package it.caicividale.scuola.ui.validators;

import java.util.Date;

import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.emf.model.util.UtilsService;

public class DataScadenzaCertificatoValidator implements IValidator {

	private ModelManager modelManager = ModelManager.getInstance();

	@Override
	public IStatus validate(Object value) {
		if (value != null) {
			Date dataScadenzaCertificato = (Date) value;
			Corso corso = modelManager.getCorsoObservable().getValue();
			if (corso != null) {
				if (modelManager.getIscrizioneObservable().getValue().getIsCertificatoMedico()) {
					if (UtilsService.isBeforeOrEqual(corso.getDataFine(), dataScadenzaCertificato)) {
						return ValidationStatus.ok();
					}

					return ValidationStatus.warning(
							"Data scadenza certificato medico inferiore alla data di fine corso o non presente");
				}
			}
		}
		return ValidationStatus.ok();
	}

}
