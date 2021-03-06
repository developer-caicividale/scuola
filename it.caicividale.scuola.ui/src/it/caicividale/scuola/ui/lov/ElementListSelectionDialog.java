package it.caicividale.scuola.ui.lov;

import java.util.Arrays;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class ElementListSelectionDialog extends AbstractElementListSelectionDialog {

    private Object[] fElements;

    /**
     * Creates a list selection dialog.
     * 
     * @param parent   the parent widget.
     * @param renderer the label renderer.
     */
    public ElementListSelectionDialog(Shell parent, ILabelProvider renderer) {
	super(parent, renderer);
    }

    /**
     * Sets the elements of the list.
     * 
     * @param elements the elements of the list.
     */
    public void setElements(Object[] elements) {
	fElements = elements;
    }

    @Override
    protected void computeResult() {
	setResult(Arrays.asList(getSelectedElements()));
    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite contents = (Composite) super.createDialogArea(parent);

	createMessageArea(contents);
	createFilterText(contents);
	createFilteredList(contents);

	setListElements(fElements);

	setSelection(getInitialElementSelections().toArray());

	return contents;
    }
}