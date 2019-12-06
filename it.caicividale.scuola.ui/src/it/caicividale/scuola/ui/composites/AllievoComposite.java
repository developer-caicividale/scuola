package it.caicividale.scuola.ui.composites;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

import it.caicividale.scuola.ui.dialogs.RicercaAllievoDialog;
import it.caicividale.scuola.ui.parts.PartDefaults;
import lombok.Data;

@Data
public class AllievoComposite {

    private final Shell shell;

    private final Composite container;

    private final IStylingEngine stylingEngine;

    private Group groupDatiAnagrafici;

    private Button ricercaAllievo;

    // residenza
    private Label lblNome;
    private Text nome;

    private Label lblCognome;
    private Text cognome;

    private Label lblSesso;
    private ComboViewer sessoViewer;
    private Combo sesso;

    private Label lblVia;
    private Text via;

    private Label lblComuneResidenza;
    private Text comuneResidenza;

    private Label lblProvinciaResidenza;
    private Text provinciaResidenza;

    private Label lblCap;
    private Text cap;

    // nascita
    private Label lblDataNascita;
    private CDateTime dataNascita;

    private Label lblComuneNascita;
    private Text comuneNascita;

    private Label lblProvinciaNascita;
    private Text provinciaNascita;

    // cai
    private Label lblSezione;
    private Text sezione;
    private Button checkBoxNuovoAllievo;

    // contatti
    private Label lblNumeroCellulare;
    private Text numeroCellulare;

    private Label lblEmail;
    private Text email;

    public Group configureGropuDatiAnagrafici() {
	FormData formData = new FormData();

	// gruppo per dati anagrafici
	groupDatiAnagrafici = new Group(container, SWT.NONE);
	groupDatiAnagrafici.setText("Dati allievo");
	groupDatiAnagrafici.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupDatiAnagrafici.setLayoutData(formData);

	ricercaAllievo = new Button(groupDatiAnagrafici, SWT.NONE);
	ricercaAllievo.setToolTipText("Ricerca Allievo");
	ricercaAllievo.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/search 64x64.png"));
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.height = 80;
	formData.width = 80;
	ricercaAllievo.setLayoutData(formData);

	ricercaAllievo.addSelectionListener(new SelectionListener() {

	    @Override
	    public void widgetSelected(SelectionEvent e) {
		@SuppressWarnings("unused")
		RicercaAllievoDialog ricercaAllievoDialog = new RicercaAllievoDialog(shell);
		if (ricercaAllievoDialog.open() == Window.OK) {

		}

	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	// nome
	lblNome = new Label(groupDatiAnagrafici, SWT.NONE);
	lblNome.setText("Nome");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblNome.setLayoutData(formData);

	nome = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblNome, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	nome.setLayoutData(formData);
	nome.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	nome.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// cognome
	lblCognome = new Label(groupDatiAnagrafici, SWT.NONE);
	lblCognome.setText("Cognome");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(nome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblCognome.setLayoutData(formData);

	cognome = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblCognome, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(nome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	cognome.setLayoutData(formData);
	cognome.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	cognome.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// sessoViewer
	lblSesso = new Label(groupDatiAnagrafici, SWT.NONE);
	lblSesso.setText("Sesso");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(cognome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 50;
	formData.height = PartDefaults.H_LABEL;
	lblSesso.setLayoutData(formData);

	sessoViewer = new ComboViewer(groupDatiAnagrafici, SWT.NONE);
	sesso = sessoViewer.getCombo();
	formData = new FormData();
	formData.top = new FormAttachment(lblSesso, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cognome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 50;
	formData.height = PartDefaults.H_TEXT;
	sesso.setLayoutData(formData);

	// via
	lblVia = new Label(groupDatiAnagrafici, SWT.NONE);
	lblVia.setText("Via");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(sesso, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblVia.setLayoutData(formData);

	via = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblVia, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(sesso, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 350;
	formData.height = PartDefaults.H_TEXT;
	via.setLayoutData(formData);
	via.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		e.text = e.text.toUpperCase();
	    }
	});
	via.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// comuneResidenza
	lblComuneResidenza = new Label(groupDatiAnagrafici, SWT.NONE);
	lblComuneResidenza.setText("Comune");
	formData = new FormData();
	formData.top = new FormAttachment(nome, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN_GROUP);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblComuneResidenza.setLayoutData(formData);

	comuneResidenza = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblComuneResidenza, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN_GROUP);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	comuneResidenza.setLayoutData(formData);
	comuneResidenza.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	comuneResidenza.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// cap
	lblCap = new Label(groupDatiAnagrafici, SWT.NONE);
	lblCap.setText("CAP");
	formData = new FormData();
	formData.top = new FormAttachment(nome, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(comuneResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblCap.setLayoutData(formData);

	cap = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	cap.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblCap, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(comuneResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_TEXT;
	cap.setLayoutData(formData);
	cap.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// provincia residenza
	lblProvinciaResidenza = new Label(groupDatiAnagrafici, SWT.NONE);
	lblProvinciaResidenza.setText("Provincia");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cap, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblProvinciaResidenza.setLayoutData(formData);

	provinciaResidenza = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	provinciaResidenza.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblProvinciaResidenza, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cap, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 70;
	formData.height = PartDefaults.H_TEXT;
	provinciaResidenza.setLayoutData(formData);
	provinciaResidenza.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	provinciaResidenza.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// data nascita
	lblDataNascita = new Label(groupDatiAnagrafici, SWT.NONE);
	lblDataNascita.setText("Data Nascita");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(provinciaResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblDataNascita.setLayoutData(formData);

	dataNascita = new CDateTime(groupDatiAnagrafici, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
	dataNascita.setPattern("dd/MM/yyyy");
	formData = new FormData();
	formData.top = new FormAttachment(lblDataNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(provinciaResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 150;
	formData.height = PartDefaults.H_DATA;
	dataNascita.setLayoutData(formData);
	dataNascita.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// comuneNascita
	lblComuneNascita = new Label(groupDatiAnagrafici, SWT.NONE);
	lblComuneNascita.setText("Comune Nas.");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(dataNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblComuneNascita.setLayoutData(formData);

	comuneNascita = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblComuneNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(dataNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	comuneNascita.setLayoutData(formData);
	comuneNascita.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	comuneNascita.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// provinciaNascita
	lblProvinciaNascita = new Label(groupDatiAnagrafici, SWT.NONE);
	lblProvinciaNascita.setText("Provincia Nas.");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(comuneNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblProvinciaNascita.setLayoutData(formData);

	provinciaNascita = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	provinciaNascita.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblProvinciaNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(comuneNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 70;
	formData.height = PartDefaults.H_TEXT;
	provinciaNascita.setLayoutData(formData);
	provinciaNascita.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	provinciaNascita.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// numeroCellulare
	lblNumeroCellulare = new Label(groupDatiAnagrafici, SWT.NONE);
	lblNumeroCellulare.setText("NumeroCellulare");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN_GROUP);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblNumeroCellulare.setLayoutData(formData);

	numeroCellulare = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblNumeroCellulare, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(ricercaAllievo, PartDefaults.MARGIN_GROUP);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	numeroCellulare.setLayoutData(formData);
	numeroCellulare.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// email
	lblEmail = new Label(groupDatiAnagrafici, SWT.NONE);
	lblEmail.setText("E-Mail");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(numeroCellulare, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblEmail.setLayoutData(formData);

	email = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblEmail, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(numeroCellulare, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 300;
	formData.height = PartDefaults.H_TEXT;
	email.setLayoutData(formData);
	email.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	email.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// sezione
	lblSezione = new Label(groupDatiAnagrafici, SWT.NONE);
	lblSezione.setText("Sezione CAI");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(email, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblSezione.setLayoutData(formData);

	sezione = new Text(groupDatiAnagrafici, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblSezione, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(email, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	sezione.setLayoutData(formData);
	sezione.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		if (e.text.startsWith("1")) {
		    e.doit = false;
		} else {
		    e.text = e.text.toUpperCase();
		}
	    }
	});
	sezione.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// Nuovo allievo
	checkBoxNuovoAllievo = new Button(groupDatiAnagrafici, SWT.CHECK);
	checkBoxNuovoAllievo.setText("Nuovo allievo");
	formData = new FormData();
	formData.top = new FormAttachment(lblSezione, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(sezione, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
	formData.width = 200;
	checkBoxNuovoAllievo.setLayoutData(formData);

	return groupDatiAnagrafici;

    }
}
