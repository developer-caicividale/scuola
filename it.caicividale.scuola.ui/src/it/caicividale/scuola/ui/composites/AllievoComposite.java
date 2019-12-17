package it.caicividale.scuola.ui.composites;

import java.util.List;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
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

import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.ui.dialogs.RicercaAllievoDialog;
import it.caicividale.scuola.ui.lov.LovDizComuneLabelProvider;
import it.caicividale.scuola.ui.lov.MySelectionDialog;
import it.caicividale.scuola.ui.parts.PartDefaults;
import it.caicividale.scuola.ui.parts.tableviewer.filters.ComuneFilter;
import lombok.Data;

@Data
public class AllievoComposite {

    private final Shell shell;

    private final Composite container;

    private final IStylingEngine stylingEngine;

    private Group groupDatiAnagrafici;
    private Group groupDatiResidenza;
    private Group groupDatiNascita;
    private Group groupDatiContatti;
    private Group groupDatiCai;

    private Button ricercaAllievo;

    // anagrafica
    private Label lblNome;
    private Text nome;

    private Label lblCognome;
    private Text cognome;

    private Label lblSesso;
    private ComboViewer sessoViewer;
    private Combo sesso;

    // residenza
    private Label lblRegioneResidenza;
    private Text regioneResidenza;

    private Label lblVia;
    private Text via;

    private Label lblComuneResidenza;
    private Text comuneResidenza;

    // nascita
    private Label lblDataNascita;
    private CDateTime dataNascita;

    private Label lblRegioneNascita;
    private Text regioneNascita;

    private Label lblComuneNascita;
    private Text comuneNascita;

    // cai
    private Label lblSezione;
    private Text sezione;
    private Button checkBoxNuovoAllievo;

    // contatti
    private Label lblNumeroCellulare;
    private Text numeroCellulare;

    private Label lblEmail;
    private Text email;

    ModelManager modelManager = ModelManager.getInstance();

    public Group configureGropuDatiAnagrafici() {
	FormData formData = new FormData();

	// gruppo per dati anagrafici
	groupDatiAnagrafici = new Group(container, SWT.NONE);
	groupDatiAnagrafici.setText("Dati anagrafici");
	groupDatiAnagrafici.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
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

	// residenza

	groupDatiResidenza = new Group(container, SWT.NONE);
	groupDatiResidenza.setText("Dati residenza");
	groupDatiResidenza.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupDatiAnagrafici, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupDatiResidenza.setLayoutData(formData);

	// via
	lblVia = new Label(groupDatiResidenza, SWT.NONE);
	lblVia.setText("Via Residenza");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblVia.setLayoutData(formData);

	via = new Text(groupDatiResidenza, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblVia, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 450;
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

	// regioneResidenza
	lblRegioneResidenza = new Label(groupDatiResidenza, SWT.NONE);
	lblRegioneResidenza.setText("Regione Residenza");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblRegioneResidenza.setLayoutData(formData);

	regioneResidenza = new Text(groupDatiResidenza, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblRegioneResidenza, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	regioneResidenza.setLayoutData(formData);
	stylingEngine.setId(regioneResidenza, "CSSTextLov");
	regioneResidenza.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// comuneResidenza
	lblComuneResidenza = new Label(groupDatiResidenza, SWT.NONE);
	lblComuneResidenza.setText("Comune Residenza");
	formData = new FormData();
	formData.top = new FormAttachment(via, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(regioneResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblComuneResidenza.setLayoutData(formData);

	comuneResidenza = new Text(groupDatiResidenza, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblComuneResidenza, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(regioneResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	comuneResidenza.setLayoutData(formData);
	stylingEngine.setId(comuneResidenza, "CSSTextLov");
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

	comuneResidenza.addMouseListener(new MouseListener() {

	    @Override
	    public void mouseDoubleClick(MouseEvent e) {
		List<DizComune> dizComuni = modelManager.getElencoDizComuni();

		MySelectionDialog dialog = new MySelectionDialog(shell, new LovDizComuneLabelProvider(),
			new ComuneFilter(), dizComuni, DizComune.class, comuneResidenza.getText());
		// dialog.setSize(100, 20);
		if (dialog.open() == Window.OK) {
		    Object result = dialog.getSelecion();
		    if (result != null) {
			DizComune DizComune = (DizComune) result;
			DizComune.getComune();
		    }
		}
	    }

	    @Override
	    public void mouseDown(MouseEvent e) {

	    }

	    @Override
	    public void mouseUp(MouseEvent e) {

	    }

	});

	groupDatiNascita = new Group(container, SWT.NONE);
	groupDatiNascita.setText("Dati nascita");
	groupDatiNascita.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupDatiResidenza, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupDatiNascita.setLayoutData(formData);

	// data nascita
	lblDataNascita = new Label(groupDatiNascita, SWT.NONE);
	lblDataNascita.setText("Data Nascita");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblDataNascita.setLayoutData(formData);

	dataNascita = new CDateTime(groupDatiNascita, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
	dataNascita.setPattern("dd/MM/yyyy");
	formData = new FormData();
	formData.top = new FormAttachment(lblDataNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
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

	// regioneResidenza
	lblRegioneNascita = new Label(groupDatiNascita, SWT.NONE);
	lblRegioneNascita.setText("Regione Nascita");
	formData = new FormData();
	formData.top = new FormAttachment(dataNascita, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblRegioneNascita.setLayoutData(formData);

	regioneNascita = new Text(groupDatiNascita, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblRegioneNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	regioneNascita.setLayoutData(formData);
	stylingEngine.setId(regioneNascita, "CSSTextLov");
	regioneNascita.addTraverseListener(new TraverseListener() {
	    public void keyTraversed(TraverseEvent e) {
		if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
		    e.doit = true;
		}
	    }
	});

	// comuneNascita
	lblComuneNascita = new Label(groupDatiNascita, SWT.NONE);
	lblComuneNascita.setText("Comune Nascita");
	formData = new FormData();
	formData.top = new FormAttachment(dataNascita, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(regioneNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblComuneNascita.setLayoutData(formData);

	comuneNascita = new Text(groupDatiNascita, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblComuneNascita, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(regioneNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.width = 200;
	formData.height = PartDefaults.H_TEXT;
	comuneNascita.setLayoutData(formData);
	stylingEngine.setId(comuneNascita, "CSSTextLov");
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

	groupDatiContatti = new Group(container, SWT.NONE);
	groupDatiContatti.setText("Dati contatto");
	groupDatiContatti.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupDatiNascita, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupDatiContatti.setLayoutData(formData);

	// numeroCellulare
	lblNumeroCellulare = new Label(groupDatiContatti, SWT.NONE);
	lblNumeroCellulare.setText("NumeroCellulare");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblNumeroCellulare.setLayoutData(formData);

	numeroCellulare = new Text(groupDatiContatti, SWT.BORDER | SWT.WRAP);
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
	lblEmail = new Label(groupDatiContatti, SWT.NONE);
	lblEmail.setText("E-Mail");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(numeroCellulare, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblEmail.setLayoutData(formData);

	email = new Text(groupDatiContatti, SWT.BORDER | SWT.WRAP);
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

	groupDatiCai = new Group(container, SWT.NONE);
	groupDatiCai.setText("Dati Cai");
	groupDatiCai.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupDatiContatti, PartDefaults.H_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupDatiCai.setLayoutData(formData);

	// sezione
	lblSezione = new Label(groupDatiCai, SWT.NONE);
	lblSezione.setText("Sezione di appartenenza");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblSezione.setLayoutData(formData);

	sezione = new Text(groupDatiCai, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblSezione, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 300;
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
	checkBoxNuovoAllievo = new Button(groupDatiCai, SWT.CHECK);
	checkBoxNuovoAllievo.setText("Nuovo allievo");
	formData = new FormData();
	formData.top = new FormAttachment(lblSezione, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(sezione, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
	formData.width = 200;
	checkBoxNuovoAllievo.setLayoutData(formData);

	return groupDatiAnagrafici;

    }
}
