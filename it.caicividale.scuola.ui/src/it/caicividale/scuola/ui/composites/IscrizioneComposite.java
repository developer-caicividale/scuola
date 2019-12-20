package it.caicividale.scuola.ui.composites;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import it.caicividale.scuola.ui.parts.PartDefaults;
import lombok.Data;

@Data
public class IscrizioneComposite {

    private final Shell shell;
    private final Composite container;
    private final IStylingEngine stylingEngine;
    private Group groupIscrizione;
    private Group groupQuote;
    private Group groupStatoIscrizione;

    private Button ricercaAllievo;

    // iscrizione
    private Button checkBoxModuloIscrizione;

    private Button checkBoxConsensoInformato;

    private Button checkBoxCertificatoMedico;

    private Button checkBoxBollino;

    private Label lblDataScadenzaCertificatoMedico;
    private CDateTime dataScadenzaCertificatoMedico;

    // quote versate
    private Label lblCaparraVersata;
    private Text caparraVersata;

    private Label lblSaldoVersato;
    private Text saldoVersato;

    private Label lblNoleggioVersato;
    private Text noleggioVersato;

    private Label lblNote;
    private StyledText note;

    private Label lblElencoErrori;
    private ListViewer listViewerElencoErrori;

    private Label lblTotaleVersato;
    private Text totaleVersato;

    // quote dovute
    private Label lblQuotaCorso;
    private Text quotaCorso;

    private Label lblQuotaNoleggioDovuta;
    private Text quotaNoleggioDovuta;

    private Label lblTotaleDovuto;
    private Text totaleDovuto;

    private Label lblDifferenzaTotaleVersatoTotaleDovuto;
    private Text differenzaTotaleVersatoTotaleDovuto;

    public void configure() {
	FormData formData;
	groupIscrizione = new Group(container, SWT.NONE);
	groupIscrizione.setText("Iscrizione");
	groupIscrizione.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupIscrizione.setLayoutData(formData);

	// ModuloIscrizione
	checkBoxModuloIscrizione = new Button(groupIscrizione, SWT.CHECK);
	checkBoxModuloIscrizione.setText("Modulo iscrizione");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	checkBoxModuloIscrizione.setLayoutData(formData);

	// ConsensoInformato
	checkBoxConsensoInformato = new Button(groupIscrizione, SWT.CHECK);
	checkBoxConsensoInformato.setText("Consenso informato");
	formData = new FormData();
	formData.top = new FormAttachment(checkBoxModuloIscrizione, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	checkBoxConsensoInformato.setLayoutData(formData);

	// Bollino
	checkBoxBollino = new Button(groupIscrizione, SWT.CHECK);
	checkBoxBollino.setText("Bollino CAI");
	formData = new FormData();
	formData.top = new FormAttachment(checkBoxConsensoInformato, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	checkBoxBollino.setLayoutData(formData);

	// CertificatoMedico
	checkBoxCertificatoMedico = new Button(groupIscrizione, SWT.CHECK);
	checkBoxCertificatoMedico.setText("Certificato medico");
	formData = new FormData();
	formData.top = new FormAttachment(checkBoxBollino, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	checkBoxCertificatoMedico.setLayoutData(formData);

	lblDataScadenzaCertificatoMedico = new Label(groupIscrizione, SWT.NONE);
	lblDataScadenzaCertificatoMedico.setText("Data scadenza certificato");
	formData = new FormData();
	formData.top = new FormAttachment(checkBoxCertificatoMedico, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblDataScadenzaCertificatoMedico.setLayoutData(formData);

	dataScadenzaCertificatoMedico = new CDateTime(groupIscrizione, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
	dataScadenzaCertificatoMedico.setPattern("dd/MM/yyyy");
	formData = new FormData();
	formData.top = new FormAttachment(lblDataScadenzaCertificatoMedico, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	formData.height = PartDefaults.H_DATA;
	dataScadenzaCertificatoMedico.setLayoutData(formData);
	dataScadenzaCertificatoMedico.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	lblNote = new Label(groupIscrizione, SWT.NONE);
	lblNote.setText("Note");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(tableNoleggio, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 150;
	formData.height = PartDefaults.H_LABEL;
	lblNote.setLayoutData(formData);

	note = new StyledText(groupIscrizione, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
	formData = new FormData();
	formData.top = new FormAttachment(lblNote, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(tableNoleggio, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 400;
	formData.height = 120;
	note.setLayoutData(formData);
	note.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	configureGroupQuote();
	configureGroupStatoIscrizione();

    }

    private void configureGroupQuote() {
	FormData formData;
	groupQuote = new Group(groupIscrizione, SWT.NONE);
	groupQuote.setText("Quote (Euro)");
	groupQuote.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(dataScadenzaCertificatoMedico, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupQuote.setLayoutData(formData);

	int widthLabel = 120;
	int widthControl = 120;

	// caparra versata
	lblCaparraVersata = new Label(groupQuote, SWT.NONE);
	lblCaparraVersata.setText("Caparra");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblCaparraVersata.setLayoutData(formData);

	caparraVersata = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblCaparraVersata, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	caparraVersata.setLayoutData(formData);
	caparraVersata.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// saldo versato
	lblSaldoVersato = new Label(groupQuote, SWT.NONE);
	lblSaldoVersato.setText("Saldo");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(caparraVersata, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblSaldoVersato.setLayoutData(formData);

	saldoVersato = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblSaldoVersato, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(caparraVersata, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	saldoVersato.setLayoutData(formData);
	saldoVersato.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// noleggio versato
	lblNoleggioVersato = new Label(groupQuote, SWT.NONE);
	lblNoleggioVersato.setText("Noleggio");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(saldoVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblNoleggioVersato.setLayoutData(formData);

	noleggioVersato = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblNoleggioVersato, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(saldoVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	noleggioVersato.setLayoutData(formData);
	noleggioVersato.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// totale versato
	lblTotaleVersato = new Label(groupQuote, SWT.NONE);
	lblTotaleVersato.setText("Totale versato");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(noleggioVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel + 50;
	formData.height = PartDefaults.H_LABEL;
	lblTotaleVersato.setLayoutData(formData);

	totaleVersato = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	totaleVersato.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblTotaleVersato, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(noleggioVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	totaleVersato.setLayoutData(formData);
	stylingEngine.setId(totaleVersato, "CSSTextMediumBold");

	// quotaCorso
	lblQuotaCorso = new Label(groupQuote, SWT.NONE);
	lblQuotaCorso.setText("Quota corso dovuta");
	formData = new FormData();
	formData.top = new FormAttachment(caparraVersata, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = widthLabel + 50;
	formData.height = PartDefaults.H_LABEL;
	lblQuotaCorso.setLayoutData(formData);

	quotaCorso = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	quotaCorso.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblQuotaCorso, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	quotaCorso.setLayoutData(formData);

	// quota Noleggio
	lblQuotaNoleggioDovuta = new Label(groupQuote, SWT.NONE);
	lblQuotaNoleggioDovuta.setText("Noleggio dovuto");
	formData = new FormData();
	formData.top = new FormAttachment(caparraVersata, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(saldoVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblQuotaNoleggioDovuta.setLayoutData(formData);

	quotaNoleggioDovuta = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	quotaNoleggioDovuta.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblQuotaNoleggioDovuta, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(saldoVersato, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	quotaNoleggioDovuta.setLayoutData(formData);

	// totale versato
	lblTotaleDovuto = new Label(groupQuote, SWT.NONE);
	lblTotaleDovuto.setText("Totale dovuto");
	formData = new FormData();
	formData.top = new FormAttachment(caparraVersata, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(quotaNoleggioDovuta, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblTotaleDovuto.setLayoutData(formData);

	totaleDovuto = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	totaleDovuto.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblTotaleDovuto, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(quotaNoleggioDovuta, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	totaleDovuto.setLayoutData(formData);
	stylingEngine.setId(totaleDovuto, "CSSTextMediumBold");

	// differenza
	lblDifferenzaTotaleVersatoTotaleDovuto = new Label(groupQuote, SWT.NONE);
	lblDifferenzaTotaleVersatoTotaleDovuto.setText("Differenza");
	formData = new FormData();
	formData.top = new FormAttachment(totaleDovuto, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(quotaNoleggioDovuta, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthLabel;
	formData.height = PartDefaults.H_LABEL;
	lblDifferenzaTotaleVersatoTotaleDovuto.setLayoutData(formData);

	differenzaTotaleVersatoTotaleDovuto = new Text(groupQuote, SWT.BORDER | SWT.WRAP);
	differenzaTotaleVersatoTotaleDovuto.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblDifferenzaTotaleVersatoTotaleDovuto, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(quotaNoleggioDovuta, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = widthControl;
	formData.height = PartDefaults.H_TEXT;
	differenzaTotaleVersatoTotaleDovuto.setLayoutData(formData);
	stylingEngine.setId(differenzaTotaleVersatoTotaleDovuto, "CSSTextMediumBold");

    }

    private void configureGroupStatoIscrizione() {
	FormData formData;
	groupStatoIscrizione = new Group(groupIscrizione, SWT.NONE);
	groupStatoIscrizione.setText("Stato iscrizione");
	groupStatoIscrizione.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(dataScadenzaCertificatoMedico, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(groupQuote, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.right = new FormAttachment(100, -PartDefaults.MARGIN_GROUP);
	formData.width = 400;
	formData.bottom = new FormAttachment(100, -3);
	groupStatoIscrizione.setLayoutData(formData);

	lblElencoErrori = new Label(groupStatoIscrizione, SWT.NONE);
	lblElencoErrori.setText("Errori rilevati");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	formData.height = PartDefaults.H_LABEL;
	lblElencoErrori.setLayoutData(formData);

	listViewerElencoErrori = new ListViewer(groupStatoIscrizione, SWT.BORDER | SWT.MULTI);
	List list = listViewerElencoErrori.getList();
	list.setLayoutData(new FormData());
	formData = new FormData();
	formData.top = new FormAttachment(lblElencoErrori, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 400;
	formData.height = 100;
	listViewerElencoErrori.getControl().setLayoutData(formData);
	stylingEngine.setId(listViewerElencoErrori.getControl(), "CSSListRed");

    }

}
