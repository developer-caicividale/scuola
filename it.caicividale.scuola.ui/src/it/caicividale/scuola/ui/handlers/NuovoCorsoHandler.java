
package it.caicividale.scuola.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;
import it.caicividale.scuola.ui.dialogs.CorsoDialog;
import it.caicividale.scuola.ui.parts.TreeviewPartCorsi;
import it.caicividale.scuola.ui.utils.PartsUtils;

public class NuovoCorsoHandler {
	@Inject
	@Optional
	Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		Corso corso = ModelFactory.eINSTANCE.createCorso();
		modelManager.getCorsoObservable().setValue(corso);

		Long idCorso = null;
		if (modelManager.getCorsoObservable().getValue() != null) {
			idCorso = modelManager.getCorsoObservable().getValue().getId();
		}

		CorsoDialog dialog = new CorsoDialog(shell, stylingEngine);
		if (dialog.open() == Window.OK) {

			serviceManager.createCorso(corso);
			modelManager.loadElencoCorsiAnnoSelected();
			modelManager.getCorsoObservable().setValue(corso);
			PartsUtils.refreshMyParts(partService);
			MPart mpart = PartsUtils.getPart(partService, "it.caicividale.scuola.ui.part.treeviewcorsi");
			if (mpart != null && mpart.getObject() instanceof TreeviewPartCorsi) {
				((TreeviewPartCorsi) mpart.getObject()).setSelection(corso);
			}

		} else {
			if (idCorso != null) {
				modelManager.getCorsoObservable().setValue(serviceManager.getCorso(idCorso));
			}
		}

	}

}