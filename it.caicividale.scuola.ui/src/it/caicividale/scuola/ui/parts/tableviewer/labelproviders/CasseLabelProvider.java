package it.caicividale.scuola.ui.parts.tableviewer.labelproviders;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;

import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.emf.model.RipartizioneCassa;

public class CasseLabelProvider extends CellLabelProvider {

	private ModelManager modelManager = ModelManager.getInstance();

	public CasseLabelProvider(final TableViewer tableViewer) {

		// Abilito i tooltip
		ColumnViewerToolTipSupport.enableFor(tableViewer);
		// tableViewer.getTable().setData(RWT.TOOLTIP_MARKUP_ENABLED, Boolean.TRUE);
	}

	@Override
	public void update(ViewerCell cell) {
		Object element = cell.getElement();
		int columnIndex = cell.getColumnIndex();
		String text = getColumnText(element, columnIndex);
		cell.setText(text);
	}

	@Override
	public void dispose() {

		super.dispose();
	}

	@Override
	public String getToolTipText(Object element) {
		String toolTipText = null;

		return toolTipText;
	}

	private String getColumnText(Object element, int columnIndex) {
		String text = null;
		if (element instanceof RipartizioneCassa) {
			RipartizioneCassa ripartizioneCassa = (RipartizioneCassa) element;
			switch (columnIndex) {
			case 0: {
				if (ripartizioneCassa.getSede() != null) {
					text = ripartizioneCassa.getSede();
				}
				break;
			}

			case 1: {
				text = Float.valueOf(ripartizioneCassa.getQuota()).toString();
				break;
			}

			default: {
				break;
			}
			}
		}
		return text;
	}
}
