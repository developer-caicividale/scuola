package it.caicividale.corsicai.ui.parts.tableviewer.edit;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

import it.caicividale.corsicai.model.Iscrizione;

public class ElencoPazientiCognomeEditingSupport extends EditingSupport {

    private final TableViewer viewer;
    private final CellEditor editor;

    public ElencoPazientiCognomeEditingSupport(TableViewer viewer) {
	super(viewer);
	this.viewer = viewer;
	this.editor = new TextCellEditor(viewer.getTable());
    }

    @Override
    protected CellEditor getCellEditor(Object element) {
	return editor;
    }

    @Override
    protected boolean canEdit(Object element) {
	return true;
    }

    @Override
    protected Object getValue(Object element) {
	String cognome = null;
	if (element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    cognome = iscrizione.getAllievo().getCognome();
	}
	return cognome;
    }

    @Override
    protected void setValue(Object element, Object userInputValue) {
	if (element instanceof Iscrizione) {
	    ((Iscrizione) element).getAllievo().setCognome((String.valueOf(userInputValue)));
	    viewer.update(element, null);
	}
    }
}
