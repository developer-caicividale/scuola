package it.caicividale.scuola.ui.lov;

import java.util.List;

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class Lov<T> extends ElementListSelectionDialog {
    private IObservableList observableList;

    public Lov(final Shell parent, final ILabelProvider labelProvider, final List<T> elementList, final String title,
	    final String message) {
	super(parent, labelProvider);

	assert (!(elementList instanceof IObservableList)) : "Utilizzare il costruttore ad hoc per le IObservableList";

	setBlockOnOpen(true);
	setMultipleSelection(false);
	setElements(elementList);
	setTitle(title);
	setMessage(message);
    }

    @SuppressWarnings("unchecked")
    public Lov(final Shell parent, final ILabelProvider labelProvider, final IObservableList observableList,
	    final Class<T> elementType, final String title, final String message) {
	super(parent, labelProvider);
	this.observableList = observableList;
	assert (elementType.equals(observableList.getElementType()));

	// Type consistency verificata dall'assert in creazione
	@SuppressWarnings("unchecked")
	List<T> elementList = observableList;

	setBlockOnOpen(true);
	setMultipleSelection(false);
	setElements(elementList);
	setTitle(title);
	setMessage(message);

	this.observableList.addListChangeListener(new IListChangeListener() {
	    // Type consistency verificata dall'assert in creazione
	    @SuppressWarnings("unchecked")
	    @Override
	    public void handleListChange(final ListChangeEvent event) {
		// Sostituisco la lista mostrando la clessidra di attesa
		Runnable runnable = new Runnable() {
		    @Override
		    public final void run() {
			setElements(observableList);
		    }
		};
		BusyIndicator.showWhile(Display.getCurrent(), runnable);
	    }
	});

	this.observableList.addChangeListener(new IChangeListener() {

	    @Override
	    public void handleChange(ChangeEvent event) {
		// Sostituisco la lista mostrando la clessidra di attesa
		Runnable runnable = new Runnable() {
		    @SuppressWarnings("unchecked")
		    @Override
		    public final void run() {
			setElements(observableList);
		    }
		};
		BusyIndicator.showWhile(Display.getCurrent(), runnable);

	    }

	});
    }

    public Lov(final Shell parent, final ILabelProvider labelProvider, final List<T> elementList,
	    final String message) {
	this(parent, labelProvider, elementList, "Lista valori", message);
    }

    public Lov(final Shell parent, final ILabelProvider labelProvider, final IObservableList observableList,
	    final Class<T> elementType, final String message) {
	this(parent, labelProvider, observableList, elementType, "Lista valori", message);
    }

    public Lov(final Shell parent, final ILabelProvider labelProvider, final List<T> elementList) {
	this(parent, labelProvider, elementList,
		"Selezionare un elemento della lista (* = qualsiasi sequenza di caratteri, ? = qualsiasi carattere singolo)");
    }

    public Lov(final Shell parent, final ILabelProvider labelProvider, final IObservableList observableList,
	    final Class<T> elementType) {
	this(parent, labelProvider, observableList, elementType,
		"Selezionare un elemento della lista (* = qualsiasi sequenza di caratteri, ? = qualsiasi carattere singolo)");
    }

    public Lov(final Shell parent, final List<T> elementList, final String title, final String message) {
	this(parent, new LovDizComuneLabelProvider(), elementList, title, message);
    }

    public Lov(final Shell parent, final IObservableList observableList, final Class<T> elementType, final String title,
	    final String message) {
	this(parent, new LovDizComuneLabelProvider(), observableList, elementType, title, message);
    }

    public Lov(final Shell parent, final List<T> elementList, final String message) {
	this(parent, new LovDizComuneLabelProvider(), elementList, message);
    }

    public Lov(final Shell parent, final IObservableList observableList, final Class<T> elementType,
	    final String message) {
	this(parent, new LovDizComuneLabelProvider(), observableList, elementType, message);
    }

    public Lov(final Shell parent, final List<T> elementList) {
	this(parent, new LovDizComuneLabelProvider(), elementList);
    }

    public Lov(final Shell parent, final IObservableList observableList, final Class<T> elementType) {
	this(parent, new LovDizComuneLabelProvider(), observableList, elementType);
    }

    @Override
    public void setElements(final Object[] elements) {
	throw new UnsupportedOperationException("Use setElements(final List<T> elementList) instead");
    }

    public void setElements(final List<T> elementList) {
	super.setElements(elementList.toArray());
    }

    public T doLov() {
	return doLov(null);
    }

    @SuppressWarnings("unchecked")
    public T doLov(final String filter) {
	T result = null;

	// Controllo che il widget non sia disposed
	Shell shell = this.getShell();
	if (shell == null || shell.isDisposed()) {
	    shell = null;
	    create();
	}

	// Imposto il filtro ed apro la Lov
	if (filter != null && filter.length() > 0) {
	    setFilter("*" + filter + "*");
	}
	open();

	// Valore di ritorno
	Object[] resultArray = getResult();
	if (resultArray != null && resultArray.length > 0) {
	    result = (T) resultArray[0];
	}

	return result;
    }

    public IObservableList getObservableList() {
	return observableList;
    }

    public void setObservableList(IObservableList observableList) {
	this.observableList = observableList;
	setElements(observableList);
    }
}
