
package it.caicividale.corsicai.ui.handlers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelFactory;
import it.caicividale.corsicai.ui.dialogs.IscrizioneDialog;
import it.caicividale.corsicai.ui.rest.ServiceManager;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.utils.PartsUtils;

public class NuovaIscrizioneHandler {
	@Inject
	@Optional
	Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			Iscrizione iscrizione = ModelFactory.eINSTANCE.createIscrizione();

			Allievo allevo = ModelFactory.eINSTANCE.createAllievo();
			iscrizione.setAllievo(allevo);

			Long idIscrizioneSelezionata = null;
			if (modelManager.getIscrizioneObservable().getValue() != null) {
				idIscrizioneSelezionata = modelManager.getIscrizioneObservable().getValue().getId();
			}

			modelManager.getIscrizioneObservable().setValue(iscrizione);

			IscrizioneDialog dialog = new IscrizioneDialog(shell, iscrizione, stylingEngine);
			if (dialog.open() == Window.OK) {
				List<Iscrizione> iscrizioni = modelManager.getCorsoObservable().getValue().getIscrizioni();
				iscrizioni.add(iscrizione);
				serviceManager.update(modelManager.getCorsoObservable().getValue());
				// PartsUtils.refreshMyParts(partService);
			} else {

			}

			modelManager.loadCorso(modelManager.getIdCorsoObservable().getValue());
			PartsUtils.refreshMyParts(partService);
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}