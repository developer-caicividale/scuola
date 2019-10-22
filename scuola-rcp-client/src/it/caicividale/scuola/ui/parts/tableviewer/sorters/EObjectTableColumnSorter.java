package it.caicividale.scuola.ui.parts.tableviewer.sorters;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;

import it.caicividale.scuola.ui.comparators.EObjectComparator;
import it.caicividale.scuola.ui.sorters.TableColumnSorter;

public class EObjectTableColumnSorter extends TableColumnSorter {
    public EObjectTableColumnSorter(TableViewer viewer) {
	super(viewer);
    }

    public final void addColumn(TableColumn column, EStructuralFeature feature) {
	super.addColumn(column, new EObjectComparator<>(feature));
    }
}
