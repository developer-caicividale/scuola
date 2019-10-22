package it.caicividale.scuola.ui.dialogs;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.ui.parts.PartDefaults;

public class IstruttoreDialog extends Dialog {
    private final Shell shell;

    private Group groupDati;

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

    // cai
    private Label lblSezione;
    private Text sezione;

    // contatti
    private Label lblNumeroCellulare;
    private Text numeroCellulare;

    private Label lblEmail;
    private Text email;

    private Label lblTitolo;
    private ComboViewer titoloViewer;
    private Combo titolo;

    private Button checkBoxIsAttivo;

    private final IStylingEngine stylingEngine;

    protected IstruttoreDialog(Shell parentShell, Corso corso, IStylingEngine stylingEngine) {
	super(parentShell);
	this.stylingEngine = stylingEngine;
	this.shell = parentShell;
    }

    @Override
    public void create() {
	super.create();

	// metto il binding qui in modo che venga fatto dopo la create della super
	bind2model();
    }

    private void bind2model() {

    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite area = (Composite) super.createDialogArea(parent);
	area.setLayout(new FillLayout());

	Composite container = new Composite(area, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	configureGropuDati(container);

	return area;
    }

    private void configureGropuDati(Composite container) {
	FormData formData = new FormData();

	// gruppo per dati anagrafici
	groupDati = new Group(container, SWT.NONE);
	groupDati.setText("Dati allievo");
	groupDati.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupDati.setLayoutData(formData);

	lblTitolo = new Label(groupDati, SWT.NONE);
	lblTitolo.setText("Titolo");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 400;
	formData.height = PartDefaults.H_LABEL;
	lblTitolo.setLayoutData(formData);

	titoloViewer = new ComboViewer(groupDati, SWT.NONE);
	titolo = titoloViewer.getCombo();
	formData = new FormData();
	formData.top = new FormAttachment(lblTitolo, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 400;
	formData.height = PartDefaults.H_TEXT;
	titolo.setLayoutData(formData);

	// nome
	lblNome = new Label(groupDati, SWT.NONE);
	lblNome.setText("Nome");
	formData = new FormData();
	formData.top = new FormAttachment(titolo, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblNome.setLayoutData(formData);

	nome = new Text(groupDati, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblNome, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
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
	lblCognome = new Label(groupDati, SWT.NONE);
	lblCognome.setText("Cognome");
	formData = new FormData();
	formData.top = new FormAttachment(titolo, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(nome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblCognome.setLayoutData(formData);

	cognome = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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
	lblSesso = new Label(groupDati, SWT.NONE);
	lblSesso.setText("Sesso");
	formData = new FormData();
	formData.top = new FormAttachment(titolo, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cognome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 50;
	formData.height = PartDefaults.H_LABEL;
	lblSesso.setLayoutData(formData);

	sessoViewer = new ComboViewer(groupDati, SWT.NONE);
	sesso = sessoViewer.getCombo();
	formData = new FormData();
	formData.top = new FormAttachment(lblSesso, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cognome, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 50;
	formData.height = PartDefaults.H_TEXT;
	sesso.setLayoutData(formData);

	// via
	lblVia = new Label(groupDati, SWT.NONE);
	lblVia.setText("Via");
	formData = new FormData();
	formData.top = new FormAttachment(titolo, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(sesso, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblVia.setLayoutData(formData);

	via = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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
	lblComuneResidenza = new Label(groupDati, SWT.NONE);
	lblComuneResidenza.setText("Comune");
	formData = new FormData();
	formData.top = new FormAttachment(nome, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblComuneResidenza.setLayoutData(formData);

	comuneResidenza = new Text(groupDati, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblComuneResidenza, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
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
	lblCap = new Label(groupDati, SWT.NONE);
	lblCap.setText("CAP");
	formData = new FormData();
	formData.top = new FormAttachment(nome, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(comuneResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblCap.setLayoutData(formData);

	cap = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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
	lblProvinciaResidenza = new Label(groupDati, SWT.NONE);
	lblProvinciaResidenza.setText("Provincia");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(cap, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblProvinciaResidenza.setLayoutData(formData);

	provinciaResidenza = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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
	lblDataNascita = new Label(groupDati, SWT.NONE);
	lblDataNascita.setText("Data Nascita");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(provinciaResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblDataNascita.setLayoutData(formData);

	dataNascita = new CDateTime(groupDati, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
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

	// numeroCellulare
	lblNumeroCellulare = new Label(groupDati, SWT.NONE);
	lblNumeroCellulare.setText("NumeroCellulare");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblNumeroCellulare.setLayoutData(formData);

	numeroCellulare = new Text(groupDati, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblNumeroCellulare, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
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
	lblEmail = new Label(groupDati, SWT.NONE);
	lblEmail.setText("E-Mail");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(numeroCellulare, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblEmail.setLayoutData(formData);

	email = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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
	lblSezione = new Label(groupDati, SWT.NONE);
	lblSezione.setText("Sezione CAI");
	formData = new FormData();
	formData.top = new FormAttachment(cap, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(email, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblSezione.setLayoutData(formData);

	sezione = new Text(groupDati, SWT.BORDER | SWT.WRAP);
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

	// attivo
	checkBoxIsAttivo = new Button(groupDati, SWT.CHECK);
	checkBoxIsAttivo.setText("Attualmente attivo");
	formData = new FormData();
	formData.top = new FormAttachment(lblSezione, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(sezione, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
	formData.width = 200;
	checkBoxIsAttivo.setLayoutData(formData);

    }

    @Override
    protected boolean isResizable() {
	return false;
    }

    @Override
    protected Point getInitialSize() {
	return new Point(1200, 800);
    }
}
