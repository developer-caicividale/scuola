package it.caicividale.scuola.ui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class OpenPart {
	@Execute
	public void execute(EPartService partService) {

		// Test test = new Test();
		// try {
		// test.test();
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }

		// MPart part = partService.findPart("it.caicividale.scuola.ui.part.hello");
		// part.setVisible(true);
		//
		// partService.showPart("it.caicividale.scuola.ui.part.hello",
		// PartState.ACTIVATE);
	}
}
