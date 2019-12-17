package it.caicividale.scuola.ui.lov;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.accessibility.Accessible;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Table;

/**
 * A composite widget which holds a list of elements for user selection. The
 * elements are sorted alphabetically. Optionally, the elements can be filtered
 * and duplicate entries can be hidden (folding).
 *
 * @since 2.0
 */
public class FilteredList extends Composite {

    private Table fList;

    ILabelProvider fLabelProvider;

    private boolean fMatchEmptyString = true;

    private boolean fIgnoreCase;

    private boolean fAllowDuplicates;

    private String fFilter = ""; //$NON-NLS-1$

    private TwoArrayQuickSorter fSorter;

    Object[] fElements = new Object[0];

    Label[] fLabels;

    Vector fImages = new Vector();

    int[] fFoldedIndices;

    int fFoldedCount;

    int[] fFilteredIndices;

    int fFilteredCount;

    Comparator fComparator;

    /**
     * Label is a private class used for comparing list objects
     */
    private static class Label {
	/**
	 * The string portion of the label.
	 */
	public final String string;

	/**
	 * The image portion of the label.
	 */
	public final Image image;

	/**
	 * Create a new instance of label.
	 *
	 * @param newString
	 * @param image
	 */
	public Label(String newString, Image image) {
	    if (newString == null) {
		this.string = "";
	    } else {
		this.string = newString;
	    }
	    this.image = image;
	}

	/**
	 * Return whether or not the receiver is the same as label.
	 *
	 * @param label
	 * @return boolean
	 */
	public boolean equals(Label label) {
	    if (label == null) {
		return false;
	    }
	    // If the string portions match (whether null or not), fall
	    // through and check the image portion.
	    if (string == null && label.string != null) {
		return false;
	    }
	    if ((string != null) && (!string.equals(label.string))) {
		return false;
	    }
	    if (image == null) {
		return label.image == null;
	    }
	    return image.equals(label.image);
	}
    }

    private final class LabelComparator implements Comparator {
	private boolean labelIgnoreCase;

	LabelComparator(boolean ignoreCase) {
	    labelIgnoreCase = ignoreCase;
	}

	@Override
	public int compare(Object left, Object right) {
	    Label leftLabel = (Label) left;
	    Label rightLabel = (Label) right;
	    int value;
	    if (fComparator == null) {
		value = labelIgnoreCase ? leftLabel.string.compareToIgnoreCase(rightLabel.string)
			: leftLabel.string.compareTo(rightLabel.string);
	    } else {
		value = fComparator.compare(leftLabel.string, rightLabel.string);
	    }
	    if (value != 0) {
		return value;
	    }
	    // images are allowed to be null
	    if (leftLabel.image == null) {
		return (rightLabel.image == null) ? 0 : -1;
	    } else if (rightLabel.image == null) {
		return +1;
	    } else {
		return fImages.indexOf(leftLabel.image) - fImages.indexOf(rightLabel.image);
	    }
	}
    }

    /**
     * Constructs a new filtered list.
     *
     * @param parent           the parent composite
     * @param style            the widget style
     * @param labelProvider    the label renderer
     * @param ignoreCase       specifies whether sorting and folding is case
     *                         sensitive
     * @param allowDuplicates  specifies whether folding of duplicates is desired
     * @param matchEmptyString specifies whether empty filter strings should filter
     *                         everything or nothing
     */
    public FilteredList(Composite parent, int style, ILabelProvider labelProvider, boolean ignoreCase,
	    boolean allowDuplicates, boolean matchEmptyString) {
	super(parent, SWT.NONE);
	GridLayout layout = new GridLayout();
	layout.marginHeight = 0;
	layout.marginWidth = 0;
	setLayout(layout);
	fList = new Table(this, style);
	fList.setLayoutData(new GridData(GridData.FILL_BOTH));
	fList.setFont(parent.getFont());
	fList.addDisposeListener(e -> {
	    fLabelProvider.dispose();

	});
	fLabelProvider = labelProvider;
	fIgnoreCase = ignoreCase;
	fSorter = new TwoArrayQuickSorter(new LabelComparator(ignoreCase));
	fAllowDuplicates = allowDuplicates;
	fMatchEmptyString = matchEmptyString;
    }

    /**
     * Sets the list of elements.
     *
     * @param elements the elements to be shown in the list.
     */
    public void setElements(Object[] elements) {
	if (elements == null) {
	    fElements = new Object[0];
	} else {
	    // copy list for sorting
	    fElements = new Object[elements.length];
	    System.arraycopy(elements, 0, fElements, 0, elements.length);
	}
	int length = fElements.length;
	// fill labels
	fLabels = new Label[length];
	Set imageSet = new HashSet();
	for (int i = 0; i != length; i++) {
	    String text = fLabelProvider.getText(fElements[i]);
	    Image image = fLabelProvider.getImage(fElements[i]);
	    fLabels[i] = new Label(text, image);
	    imageSet.add(image);
	}
	fList.deselectAll();
	fImages.clear();
	fImages.addAll(imageSet);
	fSorter.sort(fLabels, fElements);
	fFilteredIndices = new int[length];
	fFoldedIndices = new int[length];
	updateList();
    }

    /**
     * Tests if the list (before folding and filtering) is empty.
     *
     * @return returns <code>true</code> if the list is empty, <code>false</code>
     *         otherwise.
     */
    public boolean isEmpty() {
	return (fElements == null) || (fElements.length == 0);
    }

    /**
     * Sets a custom comparator for sorting the list.
     *
     * @param comparator
     */
    public void setComparator(Comparator comparator) {
	Assert.isNotNull(comparator);
	fComparator = comparator;
    }

    /**
     * Adds a selection listener to the list.
     *
     * @param listener the selection listener to be added.
     */
    public void addSelectionListener(SelectionListener listener) {
	fList.addSelectionListener(listener);
    }

    /**
     * Removes a selection listener from the list.
     *
     * @param listener the selection listener to be removed.
     */
    public void removeSelectionListener(SelectionListener listener) {
	fList.removeSelectionListener(listener);
    }

    /**
     * Sets the selection of the list. Empty or null array removes selection.
     *
     * @param selection an array of indices specifying the selection.
     */
    public void setSelection(int[] selection) {
	if (selection == null || selection.length == 0) {
	    fList.deselectAll();
	} else {
	    // If there is no working update job, or the update job is ready to
	    // accept selections, set the selection immediately.

	    fList.setSelection(selection);
	    fList.notifyListeners(SWT.Selection, new Event());
	}
    }

    /**
     * Returns the selection of the list.
     *
     * @return returns an array of indices specifying the current selection.
     */
    public int[] getSelectionIndices() {
	return fList.getSelectionIndices();
    }

    /**
     * Returns the selection of the list. This is a convenience function for
     * <code>getSelectionIndices()</code>.
     *
     * @return returns the index of the selection, -1 for no selection.
     */
    public int getSelectionIndex() {
	return fList.getSelectionIndex();
    }

    /**
     * Sets the selection of the list. Empty or null array removes selection.
     *
     * @param elements the array of elements to be selected.
     */
    public void setSelection(Object[] elements) {
	if (elements == null || elements.length == 0) {
	    fList.deselectAll();
	    return;
	}
	if (fElements == null) {
	    return;
	}
	// fill indices
	int[] indices = new int[elements.length];
	for (int i = 0; i != elements.length; i++) {
	    int j;
	    for (j = 0; j != fFoldedCount; j++) {
		int max = (j == fFoldedCount - 1) ? fFilteredCount : fFoldedIndices[j + 1];
		int l;
		for (l = fFoldedIndices[j]; l != max; l++) {
		    // found matching element?
		    if (fElements[fFilteredIndices[l]].equals(elements[i])) {
			indices[i] = j;
			break;
		    }
		}
		if (l != max) {
		    break;
		}
	    }
	    // not found
	    if (j == fFoldedCount) {
		indices[i] = 0;
	    }
	}
	setSelection(indices);
    }

    /**
     * Returns an array of the selected elements. The type of the elements returned
     * in the list are the same as the ones passed with <code>setElements</code>.
     * The array does not contain the rendered strings.
     *
     * @return returns the array of selected elements.
     */
    public Object[] getSelection() {
	if (fList.isDisposed() || (fList.getSelectionCount() == 0)) {
	    return new Object[0];
	}
	int[] indices = fList.getSelectionIndices();
	Object[] elements = new Object[indices.length];
	for (int i = 0; i != indices.length; i++) {
	    elements[i] = fElements[fFilteredIndices[fFoldedIndices[indices[i]]]];
	}
	return elements;
    }

    /**
     * Sets the filter pattern. Current only prefix filter patterns are supported.
     *
     * @param filter the filter pattern.
     */
    public void setFilter(String filter) {
	fFilter = (filter == null) ? "" : filter; //$NON-NLS-1$
	updateList();
    }

    private void updateList() {
	fFilteredCount = filter();
	fFoldedCount = fold();

    }

    /**
     * Returns the filter pattern.
     *
     * @return returns the filter pattern.
     */
    public String getFilter() {
	return fFilter;
    }

    /**
     * Returns all elements which are folded together to one entry in the list.
     *
     * @param index the index selecting the entry in the list.
     * @return returns an array of elements folded together, <code>null</code> if
     *         index is out of range.
     */
    public Object[] getFoldedElements(int index) {
	if ((index < 0) || (index >= fFoldedCount)) {
	    return null;
	}
	int start = fFoldedIndices[index];
	int count = (index == fFoldedCount - 1) ? fFilteredCount - start : fFoldedIndices[index + 1] - start;
	Object[] elements = new Object[count];
	for (int i = 0; i != count; i++) {
	    elements[i] = fElements[fFilteredIndices[start + i]];
	}
	return elements;
    }

    /*
     * Folds duplicate entries. Two elements are considered as a pair of duplicates
     * if they coiincide in the rendered string and image. @return returns the
     * number of elements after folding.
     */
    private int fold() {
	if (fAllowDuplicates) {
	    for (int i = 0; i != fFilteredCount; i++) {
		fFoldedIndices[i] = i; // identity mapping
	    }
	    return fFilteredCount;
	}
	int k = 0;
	Label last = null;
	for (int i = 0; i != fFilteredCount; i++) {
	    int j = fFilteredIndices[i];
	    Label current = fLabels[j];
	    if (!current.equals(last)) {
		fFoldedIndices[k] = i;
		k++;
		last = current;
	    }
	}
	return k;
    }

    /*
     * Filters the list with the filter pattern. @return returns the number of
     * elements after filtering.
     */
    private int filter() {
	if (((fFilter == null) || (fFilter.length() == 0)) && !fMatchEmptyString) {
	    return 0;
	}
	int k = 0;
	for (int i = 0; i != fElements.length; i++) {
	    if (StringUtils.contains(fLabelProvider.getText(fElements[i]), fFilter)) {

		fFilteredIndices[k++] = i;
	    }
	}
	return k;
    }

    /**
     * Returns whether or not duplicates are allowed.
     *
     * @return <code>true</code> indicates duplicates are allowed
     */
    public boolean getAllowDuplicates() {
	return fAllowDuplicates;
    }

    /**
     * Sets whether or not duplicates are allowed. If this value is set the items
     * should be set again for this value to take effect.
     *
     * @param allowDuplicates <code>true</code> indicates duplicates are allowed
     */
    public void setAllowDuplicates(boolean allowDuplicates) {
	this.fAllowDuplicates = allowDuplicates;
    }

    /**
     * Returns whether or not case should be ignored.
     *
     * @return <code>true</code> if case should be ignored
     */
    public boolean getIgnoreCase() {
	return fIgnoreCase;
    }

    /**
     * Sets whether or not case should be ignored If this value is set the items
     * should be set again for this value to take effect.
     *
     * @param ignoreCase <code>true</code> if case should be ignored
     */
    public void setIgnoreCase(boolean ignoreCase) {
	this.fIgnoreCase = ignoreCase;
    }

    /**
     * Returns whether empty filter strings should filter everything or nothing.
     *
     * @return <code>true</code> for the empty string to match all items,
     *         <code>false</code> to match none
     */
    public boolean getMatchEmptyString() {
	return fMatchEmptyString;
    }

    /**
     * Sets whether empty filter strings should filter everything or nothing. If
     * this value is set the items should be set again for this value to take
     * effect.
     *
     * @param matchEmptyString <code>true</code> for the empty string to match all
     *                         items, <code>false</code> to match none
     */
    public void setMatchEmptyString(boolean matchEmptyString) {
	this.fMatchEmptyString = matchEmptyString;
    }

    /**
     * Returns the label provider for the items.
     *
     * @return the label provider
     */
    public ILabelProvider getLabelProvider() {
	return fLabelProvider;
    }

    /**
     * Sets the label provider. If this value is set the items should be set again
     * for this value to take effect.
     *
     * @param labelProvider the label provider
     */
    public void setLabelProvider(ILabelProvider labelProvider) {
	this.fLabelProvider = labelProvider;
    }

    /**
     * Returns the accessible object for the receiver. If this is the first time
     * this object is requested, then the object is created and returned.
     *
     * @return the accessible object
     *
     * @exception SWTException
     *                         <ul>
     *                         <li>ERROR_WIDGET_DISPOSED - if the receiver has been
     *                         disposed</li>
     *                         <li>ERROR_THREAD_INVALID_ACCESS - if not called from
     *                         the thread that created the receiver</li>
     *                         </ul>
     *
     * @see Accessible#addAccessibleListener
     * @see Accessible#addAccessibleControlListener
     *
     * @since 3.3
     */
    @Override
    public Accessible getAccessible() {
	return fList.getAccessible();
    }
}
