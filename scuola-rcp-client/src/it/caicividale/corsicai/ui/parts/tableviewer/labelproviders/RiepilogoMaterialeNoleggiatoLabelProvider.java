package it.caicividale.corsicai.ui.parts.tableviewer.labelproviders;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;

import it.caicividale.corsicai.ui.services.ModelManager;

public class RiepilogoMaterialeNoleggiatoLabelProvider extends CellLabelProvider {

	private ModelManager modelManager = ModelManager.getInstance();

	public RiepilogoMaterialeNoleggiatoLabelProvider(final TableViewer tableViewer) {
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

	private String getColumnText(Object element, int columnIndex) {
		String text = null;
//		if (element instanceof RiepilogoNoleggioBean) {
//			RiepilogoNoleggioBean riepilogoNoleggioBean = (RiepilogoNoleggioBean) element;
//			switch (columnIndex) {
//			case 0: {
//				if (riepilogoNoleggioBean != null && riepilogoNoleggioBean.getMateriale() != null) {
//					text = riepilogoNoleggioBean.getMateriale().getNome();
//				}
//				break;
//			}
//
//			case 1: {
//				if (riepilogoNoleggioBean.getNumeroMateriale() != null) {
//					text = riepilogoNoleggioBean.getNumeroMateriale().toString();
//				}
//				break;
//			}
//
//			default: {
//				break;
//			}
//			}
//		}
		return text;
	}
}
