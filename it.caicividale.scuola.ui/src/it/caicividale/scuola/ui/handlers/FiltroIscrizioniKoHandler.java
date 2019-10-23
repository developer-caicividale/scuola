
package it.caicividale.scuola.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.ui.parts.ElencoIscrizioniPart;

public class FiltroIscrizioniKoHandler {
	@Inject
	@Optional
	private Shell shell;

	@Execute
	public void execute(EPartService partService) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			MPart mpart = partService.getActivePart();
			if (mpart.getObject() instanceof ElencoIscrizioniPart) {
				ElencoIscrizioniPart elencoIscrizioniPart = (ElencoIscrizioniPart) mpart.getObject();
				elencoIscrizioniPart.getElencoIscrizioniKoFilter()
						.setToApply(!elencoIscrizioniPart.getElencoIscrizioniKoFilter().isToApply());
				elencoIscrizioniPart.refresh();
			}
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}