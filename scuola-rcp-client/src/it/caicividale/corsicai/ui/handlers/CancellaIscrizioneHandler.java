
package it.caicividale.corsicai.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.services.ServiceManager;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.utils.PartsUtils;

public class CancellaIscrizioneHandler {
	@Inject
	@Optional
	private Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			Iscrizione iscrizione = ModelManager.getInstance().getIscrizioneObservable().getValue();

			if (iscrizione != null) {
				if (MessageDialog.openConfirm(shell, "Cancellazione", "Confermi la cencellazione dell'allievo '"
						+ iscrizione.getAllievo().getNome() + " " + iscrizione.getAllievo().getCognome() + "'?")) {
					modelManager.getCorsoObservable().getValue().getIscrizioni().remove(iscrizione);
					serviceManager.update(modelManager.getCorsoObservable().getValue());
					PartsUtils.refreshMyParts(partService);
				}

			} else {
				MessageDialog.openError(shell, "Errore", "Selezionare un allievo");
			}
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}

	}

}