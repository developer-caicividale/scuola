
package it.caicividale.corsicai.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.ModelManager;
import it.caicividale.corsicai.services.rest.ServiceManager;
import it.caicividale.corsicai.ui.dialogs.CorsoDialog;
import it.caicividale.corsicai.ui.utils.PartsUtils;

public class ModificaCorsoHandler {
	@Inject
	@Optional
	Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();

		if (modelManager.getCorsoObservable().getValue() != null) {
			Long idCorso = modelManager.getCorsoObservable().getValue().getId();
			CorsoDialog dialog = new CorsoDialog(shell, stylingEngine);
			if (dialog.open() == Window.OK) {
				serviceManager.update(modelManager.getCorsoObservable().getValue());
			} else {
				modelManager.getCorsoObservable().setValue(serviceManager.getCorso(idCorso));
			}
			PartsUtils.refreshMyParts(partService);
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}