
package it.caicividale.corsicai.ui.handlers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelManager;
import it.caicividale.corsicai.services.rest.ServiceManager;
import it.caicividale.corsicai.ui.dialogs.IscrizioneDialog;
import it.caicividale.corsicai.ui.utils.EmfUtils;
import it.caicividale.corsicai.ui.utils.PartsUtils;

public class ModificaIscrizioneHandler {
	@Inject
	@Optional
	private Shell shell;

	public static final String ID = "it.caicividale.corsicai.ui.part.iscrizioni";
	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			Iscrizione iscrizione = ModelManager.getInstance().getIscrizioneObservable().getValue();
			Iscrizione iscrizioneOld = EcoreUtil.copy(iscrizione);
			// int position = IntStream.range(0,
			// modelManager.getCorsoObservable().getValue().getIscrizioni().size())
			// .filter(i -> iscrizione.getId() ==
			// modelManager.getCorsoObservable().getValue().getIscrizioni().get(i).getId()).findFirst().orElse(-1);

			if (iscrizione != null) {
				int index = EmfUtils.getIndexOfEObject(modelManager.getCorsoObservable().getValue().getIscrizioni(),
						iscrizione);
				IscrizioneDialog dialog = new IscrizioneDialog(shell, iscrizione, stylingEngine);
				if (dialog.open() == Window.OK) {
					List<Iscrizione> iscrizioni = modelManager.getCorsoObservable().getValue().getIscrizioni();
					iscrizioni.set(index, iscrizione);
					serviceManager.update(iscrizione);

					modelManager.loadCorso(modelManager.getIdCorsoObservable().getValue());
					PartsUtils.refreshMyParts(partService);

				} else {
					modelManager.getIscrizioneObservable().setValue(iscrizioneOld);
					modelManager.getCorsoObservable().getValue().getIscrizioni().set(index, iscrizioneOld);
				}
			} else {
				MessageDialog.openError(shell, "Errore", "Selezionare un allievo");
			}
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}