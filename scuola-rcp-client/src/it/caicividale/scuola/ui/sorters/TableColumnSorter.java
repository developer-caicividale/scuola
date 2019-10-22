package it.caicividale.scuola.ui.sorters;

import java.util.Comparator;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class TableColumnSorter {
	private TableViewer viewer;

	public TableColumnSorter(final TableViewer viewer) {
		this.viewer = viewer;
	}

	private int updateSortDirection(TableColumn column) {
		Table table = column.getParent();
		if (column == table.getSortColumn()) {
			switch (table.getSortDirection()) {
			case SWT.NONE: {
				table.setSortDirection(SWT.UP);
				break;
			}
			case SWT.UP: {
				table.setSortDirection(SWT.DOWN);
				break;
			}
			case SWT.DOWN: {
				table.setSortDirection(SWT.NONE);
				break;
			}
			default: {
				break;
			}
			}
		} else {
			table.setSortColumn(column);
			table.setSortDirection(SWT.UP);
		}
		return table.getSortDirection();
	}

	private void sort(int sortDirection, Comparator<?> comparator) {
		ViewerComparator upViewerComparator = new TableColumnSorterViewerComparator(comparator);
		ViewerComparator downViewerComparator = new TableColumnSorterViewerComparator(comparator.reversed());

		switch (sortDirection) {
		case SWT.NONE: {
			viewer.setComparator(null);
			break;
		}
		case SWT.UP: {
			viewer.setComparator(upViewerComparator);
			break;
		}
		case SWT.DOWN: {
			viewer.setComparator(downViewerComparator);
			break;
		}
		default: {
			break;
		}
		}
		viewer.refresh();
	}

	public final void addColumn(TableColumn column, Comparator<?> comparator) {
		column.addSelectionListener(new SelectionAdapter() {
			private static final long serialVersionUID = 4710899920517627493L;

			@Override
			public void widgetSelected(SelectionEvent event) {
				int sortDirection = updateSortDirection((TableColumn) event.widget);
				sort(sortDirection, comparator);
			}
		});
	}

	private static class TableColumnSorterViewerComparator extends ViewerComparator {
		private static final long serialVersionUID = -1121621621505296457L;

		private static final int BEFORE = -1;
		private static final int EQUAL = 0;
		private static final int AFTER = 1;

		@SuppressWarnings("rawtypes")
		private final Comparator comparator;

		private TableColumnSorterViewerComparator(@SuppressWarnings("rawtypes") Comparator comparator) {
			this.comparator = comparator;
		}

		@SuppressWarnings("unchecked")
		@Override
		public int compare(Viewer viewer, Object o1, Object o2) {
			if (o1 == null & o2 == null) {
				return EQUAL;
			} else if (o1 == null & o2 != null) {
				return AFTER;
			} else if (o1 != null & o2 == null) {
				return BEFORE;
			} else {
				return comparator.compare(o1, o2);
			}
		}
	}
}
