package it.caicividale.corsicai.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.corsicai.ui.rest.ServiceManager;

public class AboutHandler {
	@Execute
	public void execute(Shell shell) {
		// MessageDialog.openInformation(shell, "About", "Eclipse 4 RCP Application");
		ServiceManager.getInstance().popolaCorsi();
	}
}
