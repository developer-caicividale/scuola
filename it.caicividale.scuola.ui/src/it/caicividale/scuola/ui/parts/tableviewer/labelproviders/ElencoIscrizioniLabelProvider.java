package it.caicividale.scuola.ui.parts.tableviewer.labelproviders;

import java.time.LocalDate;
import java.util.Optional;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.ESesso;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.util.UtilsService;
import it.caicividale.scuola.service.ModelManager;

public class ElencoIscrizioniLabelProvider extends CellLabelProvider {
    private static final long serialVersionUID = 1771645478589522736L;

    private final Image failImage;
    private final Image goodImage;
    private final Image toolImage;
    // private final Image femaleImage;

    private ModelManager modelManager = ModelManager.getInstance();

    public ElencoIscrizioniLabelProvider(final TableViewer tableViewer) {
	ClassLoader classLoader = this.getClass().getClassLoader();
	failImage = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/fail16x16.png"));
	goodImage = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/good16x16.png"));
	toolImage = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/tools16x16.png"));
	// femaleImage = new Image(Display.getCurrent(),
	// classLoader.getResourceAsStream("/icons/female16x16.png"));

	// Abilito i tooltip
	if (tableViewer != null) {
	    ColumnViewerToolTipSupport.enableFor(tableViewer);
	}
	// tableViewer.getTable().setData(RWT.TOOLTIP_MARKUP_ENABLED, Boolean.TRUE);
    }

    @Override
    public void update(ViewerCell cell) {
	Object element = cell.getElement();
	int columnIndex = cell.getColumnIndex();
	String text = getColumnText(element, columnIndex);
	Image image = getColumnImage(element, columnIndex);
	cell.setImage(image);
	cell.setText(text);
    }

    @Override
    public void dispose() {
	// maleImage.dispose();
	// femaleImage.dispose();
	failImage.dispose();
	goodImage.dispose();
	toolImage.dispose();
	super.dispose();
    }

    private Image getColumnImage(Object element, int columnIndex) {
	Image image = null;
	if (element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    switch (columnIndex) {
	    case 0: {
		if (iscrizione.getIsIscrizioneOk()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }

	    case 2: {// modulo
		if (iscrizione.getIsModuloIscrizione()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }
	    case 3: {// consenso
		if (iscrizione.getIsConsensoInformato()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }
	    case 4: {// bollino
		if (iscrizione.getIsBollinoAnnoCorso()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }
	    case 5: {// certificato medico
		if (iscrizione.getIsCertificatoMedicoOk()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }
	    case 6: {// quota
		if (iscrizione.getIsQuotaVersataOk()) {
		    image = goodImage;
		} else {
		    image = failImage;
		}

		break;
	    }
	    case 7: {// noleggio
		if (iscrizione.getIsNoleggio()) {
		    image = toolImage;
		}

		break;
	    }

	    default: {
		break;
	    }
	    }
	}
	return image;
    }

    @Override
    public String getToolTipText(Object element) {
	String toolTipText = null;
	if (element != null && element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    Allievo allievo = iscrizione.getAllievo();
	    final StringBuilder buf = new StringBuilder();
	    buf.append(getInfoAllievo(allievo));
	    buf.append('\n');
	    if (allievo.getNumeroCellulare() != null) {
		buf.append("Telefono: " + allievo.getNumeroCellulare().getValue());
	    }
	    buf.append('\n');
	    if (!iscrizione.getIsIscrizioneOk()) {
		buf.append('\n');
		for (String errore : iscrizione.getMessaggiErrore()) {
		    buf.append('-');
		    buf.append(errore);
		    buf.append('\n');
		}
	    }
	    if (iscrizione.getNote() != null && !iscrizione.getNote().isEmpty()) {
		buf.append('\n');
		buf.append("Note:");
		buf.append('\n');
		buf.append(iscrizione.getNote());
	    }
	    toolTipText = buf.toString();
	}
	return toolTipText;
    }

    private String getColumnText(Object element, int columnIndex) {
	String text = null;
	if (element instanceof Iscrizione) {
	    Iscrizione iscrizione = (Iscrizione) element;
	    Allievo allievo = iscrizione.getAllievo();
	    switch (columnIndex) {
	    case 1: {
		text = getInfoAllievo(allievo);
		break;
	    }

	    // case 2: {
	    // if (allievo.getNumeroCellulare() != null) {
	    // text = allievo.getNumeroCellulare().getValue();
	    // }
	    // break;
	    // }

	    case 8: {
		if (iscrizione.getNote() != null) {
		    text = iscrizione.getNote();
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

    public String getInfoAllievo(Allievo allievo) {
	String text;
	String sessoString = "";
	ESesso sesso = allievo.getSesso();
	if (sesso != null) {
	    switch (sesso) {
	    case MASCHIO:
		sessoString = "M - ";
		break;
	    case FEMMINA:
		sessoString = "F - ";
		break;
	    default:
		break;
	    }
	}
	LocalDate dataNascita = allievo.getNascitaData();
	LocalDate dataCorso = modelManager.getCorsoObservable().getValue().getDataInizio();
	String etaString = "";
	if (dataNascita != null && dataCorso != null) {
	    long eta = UtilsService.getYearsBetween(dataNascita, dataCorso);
	    etaString = " (" + sessoString + eta + ")";
	}
	text = Optional.ofNullable(allievo.getCognome()).orElse("").toUpperCase() + " "
		+ Optional.ofNullable(allievo.getNome()).orElse("").toUpperCase() + etaString;
	return text;
    }
}
