
package it.caicividale.corsicai.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.services.ServiceManager;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.utils.PartsUtils;

public class CancellaCorsoHandler {
	@Inject
	@Optional
	Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			Corso corso = modelManager.getCorsoObservable().getValue();
			if (MessageDialog.openConfirm(shell, "Cancellazione",
					"Confermi la cencellazione del corso '" + corso.getNome() + " - " + corso.getSigla() + "'?")) {
				serviceManager.deleteCorso(corso);
				modelManager.caricamentoCorsi();
				PartsUtils.refreshMyParts(partService);
			}

		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}