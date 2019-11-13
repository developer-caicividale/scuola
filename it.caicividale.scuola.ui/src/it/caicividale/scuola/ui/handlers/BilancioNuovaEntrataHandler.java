
package it.caicividale.scuola.ui.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;

public class BilancioNuovaEntrataHandler {
	@Inject
	@Optional
	Shell shell;

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@Execute
	public void execute(EPartService partService, IStylingEngine stylingEngine) {
		ModelManager modelManager = ModelManager.getInstance();

	}

}