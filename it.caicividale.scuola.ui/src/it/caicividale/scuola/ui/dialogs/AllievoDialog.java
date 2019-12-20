package it.caicividale.scuola.ui.dialogs;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.ui.composites.AllievoComposite;
import it.caicividale.scuola.ui.controllers.AllievoController;

public class AllievoDialog extends Dialog {

    private final Shell shell;

    private final IStylingEngine stylingEngine;

    private AllievoComposite allievoComposite;
    private AllievoController allievoController;

//    private final IObservableValue<Iscrizione> allievoActualObservable = WritableValue
//	    .withValueType(Iscrizione.class);

    private final IObservableValue<Allievo> allievoActualObservable = WritableValue.withValueType(Allievo.class);

    public AllievoDialog(Shell parentShell, Allievo allievo, IStylingEngine stylingEngine) {
	super(parentShell);
	allievoActualObservable.setValue(allievo);
	this.stylingEngine = stylingEngine;
	this.shell = parentShell;

    }

    @Override
    public void create() {
	super.create();

	// metto il binding qui in modo che venga fatto dopo la create della super
	allievoController = new AllievoController(allievoComposite, getButton(IDialogConstants.OK_ID),
		allievoActualObservable);
	allievoController.bind2model();
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite area = (Composite) super.createDialogArea(parent);
	area.setLayout(new FillLayout());

	Composite container = new Composite(area, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	allievoComposite = new AllievoComposite(shell, container, stylingEngine);
	allievoComposite.configure();

	return area;
    }

    @Override
    protected boolean isResizable() {
	return false;
    }

    @Override
    protected Point getInitialSize() {
	return new Point(800, 800);
    }

    public IObservableValue<Allievo> getIscrizioneActualObservable() {
	return allievoActualObservable;
    }
}
