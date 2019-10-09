
package it.caicividale.corsicai.ui.handlers;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.services.StampeManager;

public class StampaSchedaCorsoHandler {
	@Inject
	@Optional
	private Shell shell;

	public static final String ID = "it.caicividale.corsicai.ui.part.iscrizioni";

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();
		if (modelManager.getCorsoObservable().getValue() != null) {
			Corso corso = ModelManager.getInstance().getCorsoObservable().getValue();

			if (corso != null) {
				Long idCorso = corso.getId();
				Map<String, Object> parameters = new HashMap<>();
				parameters.put("id_corso", idCorso);
				StampeManager.getInstance().getReport("report.corso", parameters);
			}
		} else {
			MessageDialog.openError(shell, "Errore", "Selezionare un corso");
		}
	}

}