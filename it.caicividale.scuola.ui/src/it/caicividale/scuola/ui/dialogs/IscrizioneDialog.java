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

import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.ui.composites.IscrizioneComposite;
import it.caicividale.scuola.ui.controllers.IscrizioneController;

public class IscrizioneDialog extends Dialog {

    private final Shell shell;
    private final IStylingEngine stylingEngine;

    private IscrizioneComposite iscrizioneComposite;
    private IscrizioneController iscrizioneController;

    private final IObservableValue<Iscrizione> iscrizioneActualObservable = WritableValue
	    .withValueType(Iscrizione.class);

    public IscrizioneDialog(Shell parentShell, Iscrizione iscrizione, IStylingEngine stylingEngine) {
	super(parentShell);
	iscrizioneActualObservable.setValue(iscrizione);
	this.stylingEngine = stylingEngine;
	this.shell = parentShell;
    }

    @Override
    public void create() {
	super.create();
	iscrizioneController = new IscrizioneController(iscrizioneComposite, getButton(IDialogConstants.OK_ID),
		iscrizioneActualObservable);
	// metto il binding qui in modo che venga fatto dopo la create della super
	iscrizioneController.bind2model();
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite area = (Composite) super.createDialogArea(parent);
	area.setLayout(new FillLayout());

	Composite container = new Composite(area, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	iscrizioneComposite = new IscrizioneComposite(shell, container, stylingEngine);
	iscrizioneComposite.configure();

	return area;
    }

    @Override
    protected boolean isResizable() {
	return false;
    }

    @Override
    protected Point getInitialSize() {
	return new Point(1200, 800);
    }

    public IObservableValue<Iscrizione> getIscrizioneActualObservable() {
	return iscrizioneActualObservable;
    }
}
