
package it.caicividale.scuola.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.ui.utils.PartsUtils;

public class RefreshPerspective {

	@Execute
	public void execute(MApplication application, EPartService partService, EModelService modelService) {
		ModelManager modelManager = ModelManager.getInstance();
		MPerspective currentPerspective = modelService.getActivePerspective(application.getSelectedElement());
		String elementId = currentPerspective.getElementId();
		// if (elementId.equals("it.caicividale.scuola.ui.perspective.corsi")) {
		modelManager.caricamentoCorsi();

		PartsUtils.refreshMyParts(partService);
		// } else if
		// (elementId.equals("it.caicividale.scuola.ui.perspective.configurazione")) {
		// modelManager.caricamentoConfigurazione();
		// }
	}
}