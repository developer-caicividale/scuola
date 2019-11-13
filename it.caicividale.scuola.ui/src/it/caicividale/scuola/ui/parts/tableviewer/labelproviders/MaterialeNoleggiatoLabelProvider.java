package it.caicividale.scuola.ui.parts.tableviewer.labelproviders;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;

import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.emf.model.util.UtilsService;

public class MaterialeNoleggiatoLabelProvider extends CellLabelProvider {

	private ModelManager modelManager = ModelManager.getInstance();

	public MaterialeNoleggiatoLabelProvider(final TableViewer tableViewer) {

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
		if (element instanceof Iscrizione) {
			Iscrizione iscrizione = (Iscrizione) element;
			// TODO: inserire tootip con errori
			// toolTipText = "<b>" + //
			// StringUtils.joinWith("/", //
			// StringUtils.joinWith(" - ", //
			// StringUtils.joinWith(StringUtils.SPACE, iscrizione.getAllievo().getCognome(),
			// iscrizione.getAllievo().getNome())), //
			// "</b><br/>"

		}
		return toolTipText;
	}

	private String getColumnText(Object element, int columnIndex) {
		String text = null;
		if (element instanceof MaterialeNoleggiato) {
			MaterialeNoleggiato materialeNoleggiato = (MaterialeNoleggiato) element;
			switch (columnIndex) {
			case 0: {
				if (materialeNoleggiato.getDataNoleggio() != null) {
					text = UtilsService.getDateString(materialeNoleggiato.getDataNoleggio());
				}
				break;
			}

			case 1: {
				if (materialeNoleggiato.getMateriale() != null) {
					text = materialeNoleggiato.getMateriale().getNome();
				}
				break;
			}
			case 2: {
				text = Short.valueOf(materialeNoleggiato.getQuantita()).toString();
				break;
			}

			case 3: {
				if (materialeNoleggiato.getMateriale() != null) {
					text = Float.valueOf(materialeNoleggiato.getMateriale().getQuotaNoleggio()).toString();
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
