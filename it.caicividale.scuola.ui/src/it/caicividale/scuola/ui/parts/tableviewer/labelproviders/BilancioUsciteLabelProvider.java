package it.caicividale.scuola.ui.parts.tableviewer.labelproviders;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;

import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.emf.model.VoceDiSpesa;
import it.caicividale.scuola.emf.model.util.UtilsService;

public class BilancioUsciteLabelProvider extends CellLabelProvider {

	private ModelManager modelManager = ModelManager.getInstance();

	public BilancioUsciteLabelProvider(final TableViewer tableViewer) {

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
		if (element instanceof VoceDiSpesa) {
			VoceDiSpesa voceDiSpesa = (VoceDiSpesa) element;
			switch (columnIndex) {
			case 0: {
				if (voceDiSpesa.getData() != null) {
					text = UtilsService.getDateString(voceDiSpesa.getData());
				}
				break;
			}

			case 1: {
				if (voceDiSpesa.getTitolo() != null) {
					text = voceDiSpesa.getTitolo();
				}
				break;
			}
			case 2: {
				text = Float.valueOf(voceDiSpesa.getValore()).toString();
				break;
			}

			case 3: {
				if (voceDiSpesa.getNota() != null) {
					text = voceDiSpesa.getNota();
				}
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
