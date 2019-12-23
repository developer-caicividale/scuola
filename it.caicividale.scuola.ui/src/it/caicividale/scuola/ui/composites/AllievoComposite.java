package it.caicividale.scuola.ui.composites;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.service.ModelManager;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AllievoComposite extends PersonaComposite {

    ModelManager modelManager = ModelManager.getInstance();

    public AllievoComposite(Shell shell, Composite container, IStylingEngine stylingEngine) {
	super(shell, container, stylingEngine);
    }

    public Composite configure() {
	super.configure();

	return container;

    }
}
