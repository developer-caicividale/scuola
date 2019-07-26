package it.caicividale.corsicai.ui.parts.tableviewer.edit;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;

import it.caicividale.corsicai.model.Iscrizione;

public class ElencoPazientiBollinoEditingSupport extends EditingSupport {

    private final TableViewer viewer;

    public ElencoPazientiBollinoEditingSupport(TableViewer viewer) {
	super(viewer);
	this.viewer = viewer;
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
	return new CheckboxCellEditor(null, SWT.CHECK);
    }

    @Override
    protected boolean canEdit(Object element) {
	return true;
    }

    @Override
    protected Object getValue(Object element) {
	Boolean isbollino = null;
	if (element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    isbollino = iscrizione.getIsBollinoAnnoCorso();
	}
	return isbollino;
    }

    @Override
    protected void setValue(Object element, Object userInputValue) {
	if (element instanceof Iscrizione) {
	    ((Iscrizione) element).setIsBollinoAnnoCorso((Boolean) userInputValue);
	    viewer.update(element, null);
	}
    }
}
