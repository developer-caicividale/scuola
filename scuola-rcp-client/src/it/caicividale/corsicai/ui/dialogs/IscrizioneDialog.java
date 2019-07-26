package it.caicividale.corsicai.ui.dialogs;

import java.util.Date;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.corsicai.model.ESesso;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.MaterialeNoleggiato;
import it.caicividale.corsicai.model.ModelFactory;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.valueobject.EMail;
import it.caicividale.corsicai.model.valueobject.NumeroCellulare;
import it.caicividale.corsicai.ui.databinding.converters.Float2StringConverter;
import it.caicividale.corsicai.ui.databinding.converters.String2EmailConverter;
import it.caicividale.corsicai.ui.databinding.converters.String2FloatConverter;
import it.caicividale.corsicai.ui.databinding.converters.String2NumeroCellulareConverter;
import it.caicividale.corsicai.ui.databinding.converters.ValueObject2StringConverter;
import it.caicividale.corsicai.ui.decorationupdaters.OkKoControlDecoratorUpdater;
import it.caicividale.corsicai.ui.parts.PartDefaults;
import it.caicividale.corsicai.ui.parts.tableviewer.labelproviders.MaterialeNoleggiatoLabelProvider;
import it.caicividale.corsicai.ui.parts.tableviewer.sorters.EObjectTableColumnSorter;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.corsicai.ui.utils.EmfUtils;
import it.caicividale.corsicai.ui.validators.BooleanWarningValidator;
import it.caicividale.corsicai.ui.validators.DataNotNullValidator;
import it.caicividale.corsicai.ui.validators.DataScadenzaCertificatoValidator;
import it.caicividale.corsicai.ui.validators.DifferenzaQuotaValidator;
import it.caicividale.corsicai.ui.validators.ObjectNotNullValidator;
import it.caicividale.corsicai.ui.validators.TextEmailValidator;
import it.caicividale.corsicai.ui.validators.TextFloatValidator;
import it.caicividale.corsicai.ui.validators.TextNumeroCellulareValidator;
import it.caicividale.corsicai.ui.validators.TextSoloLettereNotNullValidator;
import it.caicividale.corsicai.ui.validators.TextSoloLettereValidator;
import it.caicividale.corsicai.ui.validators.TextSoloNumeriValidator;
import it.caicividale.corsicai.ui.widgetvalueproperty.LocalDateSelectionProperty;

public class IscrizioneDialog extends Dialog {

	private final Shell shell;

	private final IStylingEngine stylingEngine;

	private Group groupDatiAnagrafici;
	private Group groupIscrizione;
	private Group groupQuote;
	private Group groupStatoIscrizione;

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

	private Label lblMaterialeNoleggiato;
	private TableViewer tableViewerNoleggio;
	private Table tableNoleggio;
	private Button aggiungiNoleggio;
	private Button modificaNoleggio;
	private Button cancellaNoleggio;

	private Label lblQuotaNoleggioDovuta;
	private Text quotaNoleggioDovuta;

	private Label lblTotaleDovuto;
	private Text totaleDovuto;

	private Label lblDifferenzaTotaleVersatoTotaleDovuto;
	private Text differenzaTotaleVersatoTotaleDovuto;

	private final IObservableValue<Iscrizione> iscrizioneActualObservable = WritableValue
			.withValueType(Iscrizione.class);
	private final IObservableValue<MaterialeNoleggiato> materialeNoleggiatoItemsObservable = WritableValue
			.withValueType(MaterialeNoleggiato.class);

	public IscrizioneDialog(Shell parentShell, Iscrizione iscrizione, IStylingEngine stylingEngine) {
		super(parentShell);
		iscrizioneActualObservable.setValue(iscrizione);
		this.stylingEngine = stylingEngine;
		this.shell = parentShell;
	}

	@Override
	public void create() {
		super.create();

		// metto il binding qui in modo che venga fatto dopo la create della super
		bind2model();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new FillLayout());

		Composite container = new Composite(area, SWT.NONE);
		FormLayout layout = new FormLayout();
		container.setLayout(layout);

		configureGropuDatiAnagrafici(container);
		configureGroupIscrizione(container);

		return area;
	}

	private void configureGropuDatiAnagrafici(Composite container) {
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
		ricercaAllievo.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/search 64x64.png"));
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

	}

	private void configureGroupIscrizione(Composite container) {
		FormData formData;
		groupIscrizione = new Group(container, SWT.NONE);
		groupIscrizione.setText("Iscrizione");
		groupIscrizione.setLayout(new FormLayout());
		formData = new FormData();
		formData.top = new FormAttachment(groupDatiAnagrafici, PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.right = new FormAttachment(100, -PartDefaults.MARGIN_GROUP);
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

		configureNoleggio();

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

	private void configureNoleggio() {
		FormData formData = new FormData();

		// materiale noleggiato
		lblMaterialeNoleggiato = new Label(groupIscrizione, SWT.NONE);
		lblMaterialeNoleggiato.setText("Materiale noleggiato");
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(lblDataScadenzaCertificatoMedico, PartDefaults.H_CONTROL2CONTROL_OFFSET);
		formData.width = 150;
		formData.height = PartDefaults.H_LABEL;
		lblMaterialeNoleggiato.setLayoutData(formData);

		tableViewerNoleggio = new TableViewer(groupIscrizione, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerNoleggio.setColumnProperties(new String[] {});
		tableNoleggio = tableViewerNoleggio.getTable();

		tableNoleggio.setLinesVisible(true);
		tableNoleggio.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		tableNoleggio.setHeaderVisible(true);
		tableNoleggio.setLocation(0, 0);

		int h1 = 130;
		int h2 = 130;
		int h3 = 87;
		int h4 = 87;
		int iconsize = 24;

		formData = new FormData();
		formData.top = new FormAttachment(lblMaterialeNoleggiato, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(lblDataScadenzaCertificatoMedico, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.height = 100;
		formData.width = h1 + h2 + h3 + h4;
		tableNoleggio.setLayoutData(formData);
		EObjectTableColumnSorter tableColumnSorter = new EObjectTableColumnSorter(tableViewerNoleggio);

		final TableViewerColumn tableViewerColumnData = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
		TableColumn tblclmnData = tableViewerColumnData.getColumn();
		tblclmnData.setAlignment(SWT.CENTER);
		tblclmnData.setWidth(h1);
		tblclmnData.setText("Data");
		tblclmnData.setToolTipText("Data del noleggio");
		tableColumnSorter.addColumn(tblclmnData, ModelPackage.Literals.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO);

		final TableViewerColumn tableViewerColumnMateriale = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
		TableColumn tblclmnMateriale = tableViewerColumnMateriale.getColumn();
		tblclmnMateriale.setAlignment(SWT.CENTER);
		tblclmnMateriale.setWidth(h2);
		tblclmnMateriale.setText("Materiale");
		tblclmnMateriale.setToolTipText("Materiale noleggiato");
		tableColumnSorter.addColumn(tblclmnMateriale, ModelPackage.Literals.DIZ_MATERIALE__NOME);

		final TableViewerColumn tableViewerColumnQuantita = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
		TableColumn tblclmnQuantita = tableViewerColumnQuantita.getColumn();
		tblclmnQuantita.setAlignment(SWT.CENTER);
		tblclmnQuantita.setWidth(h3);
		tblclmnQuantita.setText("Quantità");
		tblclmnQuantita.setToolTipText("Quantità noleggiata");
		tableColumnSorter.addColumn(tblclmnQuantita, ModelPackage.Literals.MATERIALE_NOLEGGIATO__QUANTITA);

		final TableViewerColumn tableViewerColumnQuotaNoleggio = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
		TableColumn tblclmnQuotaNoleggio = tableViewerColumnQuotaNoleggio.getColumn();
		tblclmnQuotaNoleggio.setAlignment(SWT.CENTER);
		tblclmnQuotaNoleggio.setWidth(h4);
		tblclmnQuotaNoleggio.setText("Quota");
		tblclmnQuotaNoleggio.setToolTipText("Quota richiesta per il materiale noleggiato");
		tableColumnSorter.addColumn(tblclmnQuotaNoleggio, ModelPackage.Literals.DIZ_MATERIALE__QUOTA_NOLEGGIO);

		aggiungiNoleggio = new Button(groupIscrizione, SWT.NONE);
		aggiungiNoleggio
				.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/edit_add24x24.png"));
		formData = new FormData();
		formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize * 2);
		formData.bottom = new FormAttachment(tableNoleggio);
		formData.width = iconsize;
		formData.height = iconsize;
		aggiungiNoleggio.setLayoutData(formData);
		aggiungiNoleggio.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				@SuppressWarnings("unused")
				MaterialeNoleggiato materialeNoleggiato = ModelFactory.eINSTANCE.createMaterialeNoleggiato();
				materialeNoleggiato.setDataNoleggio(new Date());
				materialeNoleggiato.setQuantita(Short.valueOf("1"));
				NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(shell,
						materialeNoleggiato);
				if (noleggioMaterialeDialog.open() == Window.OK) {
					iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
							.add(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
				}
				tableViewerNoleggio.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		modificaNoleggio = new Button(groupIscrizione, SWT.PUSH);
		modificaNoleggio
				.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/modifica24x24.png"));
		formData = new FormData();
		formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize);
		formData.bottom = new FormAttachment(tableNoleggio);
		formData.width = iconsize;
		formData.height = iconsize;
		modificaNoleggio.setLayoutData(formData);
		modificaNoleggio.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if (materialeNoleggiatoItemsObservable.getValue() != null) {
					MaterialeNoleggiato materialeNoleggiatoOld = EcoreUtil
							.copy(materialeNoleggiatoItemsObservable.getValue());
					int index = EmfUtils.getIndexOfEObject(
							iscrizioneActualObservable.getValue().getMaterialeNoleggiato(), materialeNoleggiatoOld);

					MaterialeNoleggiato materialeNoleggiatoActual = EcoreUtil
							.copy(materialeNoleggiatoItemsObservable.getValue());
					@SuppressWarnings("unused")
					NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(shell,
							materialeNoleggiatoActual);
					if (noleggioMaterialeDialog.open() == Window.OK) {
						// materialeNoleggiatoItemsObservable.setValue(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
						iscrizioneActualObservable.getValue().getMaterialeNoleggiato().set(index,
								noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
					}
					tableViewerNoleggio.refresh();
				} else {
					MessageDialog.openError(shell, "Errore", "Selezionare il materiale noleggiato da modificare");
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		cancellaNoleggio = new Button(groupIscrizione, SWT.PUSH);
		cancellaNoleggio
				.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons//trash_red24x24.png"));
		formData = new FormData();
		formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4);
		formData.bottom = new FormAttachment(tableNoleggio);
		formData.width = iconsize;
		formData.height = iconsize;
		cancellaNoleggio.setLayoutData(formData);

		cancellaNoleggio.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (materialeNoleggiatoItemsObservable.getValue() != null) {

					if (MessageDialog.openConfirm(shell, "Errore", "Confermi la cencellazione del noleggio '"
							+ materialeNoleggiatoItemsObservable.getValue().getMateriale().getNome() + "'?")) {
						iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
								.remove(materialeNoleggiatoItemsObservable.getValue());
						tableViewerNoleggio.refresh();
					}

				} else {
					MessageDialog.openError(shell, "Errore", "Selezionare il materiale noleggiato da cancellare");
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
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

	@SuppressWarnings("unchecked")
	private void bind2model() {
		DataBindingContext bindingContext = new DataBindingContext();
		// if (iscrizioneActualObservable.getValue() == null) {
		// // sono nel caso di nuovo inserimento
		// Iscrizione iscrizione = ModelFactory.eINSTANCE.createIscrizione();
		// Allievo allievo = ModelFactory.eINSTANCE.createAllievo();
		// iscrizione.setAllievo(allievo);
		// iscrizioneActualObservable.setValue(iscrizione);
		// }

		UpdateValueStrategy target2modelTextSoloLettereNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSoloLettereNotNullStrategy.setBeforeSetValidator(new TextSoloLettereNotNullValidator());

		UpdateValueStrategy target2modelObjectNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelObjectNotNullStrategy.setBeforeSetValidator(new ObjectNotNullValidator());

		UpdateValueStrategy target2modelDataNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelDataNotNullStrategy.setBeforeSetValidator(new DataNotNullValidator());

		UpdateValueStrategy target2modelTextSoloLettereStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSoloLettereStrategy.setBeforeSetValidator(new TextSoloLettereValidator(null));

		UpdateValueStrategy target2modelTextSolo2LettereStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSolo2LettereStrategy.setBeforeSetValidator(new TextSoloLettereValidator(2));

		UpdateValueStrategy target2modelTextSoloNumeriStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSoloNumeriStrategy.setBeforeSetValidator(new TextSoloNumeriValidator());

		UpdateValueStrategy target2modelTextNumeroCellulareStrategy = new ConverterUpdateValueStrategy(
				new String2NumeroCellulareConverter());
		target2modelTextNumeroCellulareStrategy.setBeforeSetValidator(new TextNumeroCellulareValidator());
		UpdateValueStrategy model2targetNumeroCellulareTextStrategy = new ConverterUpdateValueStrategy(
				new ValueObject2StringConverter());

		UpdateValueStrategy target2modelTextEmailStrategy = new ConverterUpdateValueStrategy(
				new String2EmailConverter());
		target2modelTextEmailStrategy.setBeforeSetValidator(new TextEmailValidator());
		UpdateValueStrategy model2targetEmailTextStrategy = new ConverterUpdateValueStrategy(
				new ValueObject2StringConverter());

		UpdateValueStrategy target2modelQuotaStrategy = new ConverterUpdateValueStrategy(new String2FloatConverter());
		target2modelQuotaStrategy.setBeforeSetValidator(new TextFloatValidator());
		UpdateValueStrategy model2targetQuotaStrategy = new ConverterUpdateValueStrategy(new Float2StringConverter());

		UpdateValueStrategy target2modelCheckStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
		target2modelCheckStrategy.setBeforeSetValidator(new BooleanWarningValidator());

		UpdateValueStrategy target2modelDataScadenzaCertificatoStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelDataScadenzaCertificatoStrategy.setBeforeSetValidator(new DataScadenzaCertificatoValidator());

		UpdateValueStrategy target2modelDifferenzaQuotaStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelDifferenzaQuotaStrategy.setBeforeSetValidator(new DifferenzaQuotaValidator());

		UpdateValueStrategy model2targetObjectNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);

		// nome
		IObservableValue<String> nomeObservable = EMFProperties.value(
				FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__NOME))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue nomeTextObservable = WidgetProperties.text(SWT.Modify).observe(nome);
		Binding nomeBinding = bindingContext.bindValue(nomeTextObservable, nomeObservable,
				target2modelTextSoloLettereNotNullStrategy, null);
		ControlDecorationSupport.create(nomeBinding, SWT.TOP | SWT.LEFT);

		// cognome
		IObservableValue<String> cognomeObservable = EMFProperties.value(
				FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__COGNOME))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue cognomeTextObservable = WidgetProperties.text(SWT.Modify).observe(cognome);
		Binding cognomeBinding = bindingContext.bindValue(cognomeTextObservable, cognomeObservable,
				target2modelTextSoloLettereNotNullStrategy, null);
		ControlDecorationSupport.create(cognomeBinding, SWT.TOP | SWT.LEFT);

		// sesso
		sessoViewer.setContentProvider(ArrayContentProvider.getInstance());
		sessoViewer.setInput(ESesso.values());
		IObservableValue<String> sessoObservable = EMFProperties.value(
				FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__SESSO))
				.observeDetail(iscrizioneActualObservable);
		IViewerObservableValue sessoComboObservable = ViewersObservables.observeSingleSelection(sessoViewer);
		Binding sessoBinding = bindingContext.bindValue(sessoComboObservable, sessoObservable,
				target2modelObjectNotNullStrategy, model2targetObjectNotNullStrategy);
		ControlDecorationSupport.create(sessoBinding, SWT.TOP | SWT.LEFT);

		// via
		IObservableValue<String> viaObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__RESIDENZA_VIA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue viaTextObservable = WidgetProperties.text(SWT.Modify).observe(via);
		Binding viaBinding = bindingContext.bindValue(viaTextObservable, viaObservable,
				target2modelObjectNotNullStrategy, null);
		ControlDecorationSupport.create(viaBinding, SWT.TOP | SWT.LEFT);

		// comune Residenza
		IObservableValue<String> comuneResidenzaObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__RESIDENZA_CITTA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue comuneResidenzaTextObservable = WidgetProperties.text(SWT.Modify).observe(comuneResidenza);
		Binding comuneResidenzaBinding = bindingContext.bindValue(comuneResidenzaTextObservable,
				comuneResidenzaObservable, target2modelTextSoloLettereStrategy, null);
		ControlDecorationSupport.create(comuneResidenzaBinding, SWT.TOP | SWT.LEFT);

		// cap
		IObservableValue<String> capObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__RESIDENZA_CAP))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue capTextObservable = WidgetProperties.text(SWT.Modify).observe(cap);
		Binding capBinding = bindingContext.bindValue(capTextObservable, capObservable,
				target2modelTextSoloNumeriStrategy, null);
		ControlDecorationSupport.create(capBinding, SWT.TOP | SWT.LEFT);

		// provincia residenza
		IObservableValue<String> provinciaResidenzaObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO,
						ModelPackage.Literals.PERSONA__RESIDENZA_PROVINCIA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue provinciaResidenzaTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(provinciaResidenza);
		Binding provinciaResidenzaBinding = bindingContext.bindValue(provinciaResidenzaTextObservable,
				provinciaResidenzaObservable, target2modelTextSolo2LettereStrategy, null);
		ControlDecorationSupport.create(provinciaResidenzaBinding, SWT.TOP | SWT.LEFT);

		// data Nascita
		LocalDateSelectionProperty localDateSelectionDataNascitaProperty = new LocalDateSelectionProperty();
		IObservableValue<Date> dataNascitaObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__NASCITA_DATA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue dataNascitaDateTimeObservable = localDateSelectionDataNascitaProperty.observe(dataNascita);
		Binding dataNascitaBinding = bindingContext.bindValue(dataNascitaDateTimeObservable, dataNascitaObservable,
				target2modelDataNotNullStrategy, null);
		ControlDecorationSupport.create(dataNascitaBinding, SWT.TOP | SWT.LEFT);

		// comune Nascita
		IObservableValue<String> comuneNascitaObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__NASCITA_CITTA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue comuneNascitaTextObservable = WidgetProperties.text(SWT.Modify).observe(comuneNascita);
		Binding comuneNascitaBinding = bindingContext.bindValue(comuneNascitaTextObservable, comuneNascitaObservable,
				target2modelTextSoloLettereNotNullStrategy, null);
		ControlDecorationSupport.create(comuneNascitaBinding, SWT.TOP | SWT.LEFT);

		// provincia Nascita
		IObservableValue<String> provinciaNascitaObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__NASCITA_PROVINCIA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue comuneProvinciaTextObservable = WidgetProperties.text(SWT.Modify).observe(provinciaNascita);
		Binding provinciaNascitaBinding = bindingContext.bindValue(comuneProvinciaTextObservable,
				provinciaNascitaObservable, target2modelTextSolo2LettereStrategy, null);
		ControlDecorationSupport.create(provinciaNascitaBinding, SWT.TOP | SWT.LEFT);

		// sezione
		IObservableValue<String> sezioneObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO,
						ModelPackage.Literals.PERSONA__SEZIONE_CAI_APPARTENENZA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue sezioneTextObservable = WidgetProperties.text(SWT.Modify).observe(sezione);
		Binding sezioneBinding = bindingContext.bindValue(sezioneTextObservable, sezioneObservable,
				target2modelTextSoloLettereNotNullStrategy, null);
		ControlDecorationSupport.create(sezioneBinding, SWT.TOP | SWT.LEFT);

		// nuovo allievo
		IObservableValue<Boolean> nuovoAllievoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_NUOVO_ALLIEVO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue nuovoAllievoCheckboxObservable = WidgetProperties.selection().observe(checkBoxNuovoAllievo);
		Binding nuovoAllievoBinding = bindingContext.bindValue(nuovoAllievoCheckboxObservable, nuovoAllievoObservable,
				target2modelCheckStrategy, null);

		// numeroCellulare
		IObservableValue<NumeroCellulare> numeroCellulareObservable = EMFProperties.value(FeaturePath
				.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__NUMERO_CELLULARE))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue numeroCellulareTextObservable = WidgetProperties.text(SWT.Modify).observe(numeroCellulare);
		Binding numeroCellulareBinding = bindingContext.bindValue(numeroCellulareTextObservable,
				numeroCellulareObservable, target2modelTextNumeroCellulareStrategy,
				model2targetNumeroCellulareTextStrategy);
		ControlDecorationSupport.create(numeroCellulareBinding, SWT.TOP | SWT.LEFT);

		// email
		IObservableValue<EMail> emailObservable = EMFProperties.value(
				FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO, ModelPackage.Literals.PERSONA__EMAIL))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue emailTextObservable = WidgetProperties.text(SWT.Modify).observe(email);
		Binding emailBinding = bindingContext.bindValue(emailTextObservable, emailObservable,
				target2modelTextEmailStrategy, model2targetEmailTextStrategy);
		ControlDecorationSupport.create(emailBinding, SWT.TOP | SWT.LEFT);

		// moduloIscrizione
		IObservableValue<Boolean> moduloIscrizioneObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_MODULO_ISCRIZIONE))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue moduloIscrizionCheckboxObservable = WidgetProperties.selection()
				.observe(checkBoxModuloIscrizione);
		Binding moduloIscrizionBinding = bindingContext.bindValue(moduloIscrizionCheckboxObservable,
				moduloIscrizioneObservable, target2modelCheckStrategy, null);
		ControlDecorationSupport.create(moduloIscrizionBinding, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// consensoInformato
		IObservableValue<Boolean> consensoInformatoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_CONSENSO_INFORMATO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue consensoInformatoCheckboxObservable = WidgetProperties.selection()
				.observe(checkBoxConsensoInformato);
		Binding consensoInformatoBinding = bindingContext.bindValue(consensoInformatoCheckboxObservable,
				consensoInformatoObservable, target2modelCheckStrategy, null);
		ControlDecorationSupport.create(consensoInformatoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// certificatoMedico
		IObservableValue<Boolean> certificatoMedicoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_CERTIFICATO_MEDICO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue certificatoMedicoCheckboxObservable = WidgetProperties.selection()
				.observe(checkBoxCertificatoMedico);
		Binding certificatoMedicoBinding = bindingContext.bindValue(certificatoMedicoCheckboxObservable,
				certificatoMedicoObservable, target2modelCheckStrategy, null);
		ControlDecorationSupport.create(certificatoMedicoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// data ScadenzaCertificato
		LocalDateSelectionProperty localDateSelectionDataScadenzaCertificatoProperty = new LocalDateSelectionProperty();
		IObservableValue<Date> dataScadenzaCertificatoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue dataScadenzaCertificatoDateTimeObservable = localDateSelectionDataScadenzaCertificatoProperty
				.observe(dataScadenzaCertificatoMedico);
		Binding dataScadenzaCertificatoBinding = bindingContext.bindValue(dataScadenzaCertificatoDateTimeObservable,
				dataScadenzaCertificatoObservable, target2modelDataScadenzaCertificatoStrategy, null);
		ControlDecorationSupport.create(dataScadenzaCertificatoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// bollino
		IObservableValue<Boolean> bollinoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue bollinoCheckboxObservable = WidgetProperties.selection().observe(checkBoxBollino);
		Binding bollinoBinding = bindingContext.bindValue(bollinoCheckboxObservable, bollinoObservable,
				target2modelCheckStrategy, null);
		ControlDecorationSupport.create(bollinoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// caparra
		IObservableValue<Float> caparraObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__CAPARRA))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue caparraTextObservable = WidgetProperties.text(SWT.Modify).observe(caparraVersata);
		Binding caparraBinding = bindingContext.bindValue(caparraTextObservable, caparraObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);
		ControlDecorationSupport.create(caparraBinding, SWT.TOP | SWT.LEFT);

		// saldo
		IObservableValue<Float> saldoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__SALDO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue saldoTextObservable = WidgetProperties.text(SWT.Modify).observe(saldoVersato);
		Binding saldoBinding = bindingContext.bindValue(saldoTextObservable, saldoObservable, target2modelQuotaStrategy,
				model2targetQuotaStrategy);
		ControlDecorationSupport.create(saldoBinding, SWT.TOP | SWT.LEFT);

		// noleggio
		IObservableValue<Float> noleggioObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__QUOTA_NOLEGGIO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue noleggioTextObservable = WidgetProperties.text(SWT.Modify).observe(noleggioVersato);
		Binding noleggioBinding = bindingContext.bindValue(noleggioTextObservable, noleggioObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);
		ControlDecorationSupport.create(noleggioBinding, SWT.TOP | SWT.LEFT);

		// totale
		IObservableValue<Float> totaleObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__TOTALE_VERSATO))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue totaleTextObservable = WidgetProperties.text(SWT.Modify).observe(totaleVersato);
		Binding totaleBinding = bindingContext.bindValue(totaleTextObservable, totaleObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);
		ControlDecorationSupport.create(totaleBinding, SWT.TOP | SWT.LEFT);

		// quotaCorso
		IObservableValue<Float> quotaCorsoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__QUOTA_ISCRIZIONE))
				.observeDetail(ModelManager.getInstance().getCorsoObservable());
		ISWTObservableValue quotaCorsoTextObservable = WidgetProperties.text(SWT.Modify).observe(quotaCorso);
		bindingContext.bindValue(quotaCorsoTextObservable, quotaCorsoObservable, target2modelQuotaStrategy,
				model2targetQuotaStrategy);

		// tabella noleggio
		tableViewerNoleggio.setLabelProvider(new MaterialeNoleggiatoLabelProvider(tableViewerNoleggio));
		ObservableListContentProvider noleggioListContentProvider = new ObservableListContentProvider();
		tableViewerNoleggio.setContentProvider(noleggioListContentProvider);
		IObservableList<MaterialeNoleggiato> materialeNoleggiatoObservableList = EMFProperties
				.list(ModelPackage.Literals.ISCRIZIONE__MATERIALE_NOLEGGIATO).observeDetail(iscrizioneActualObservable);
		tableViewerNoleggio.setInput(materialeNoleggiatoObservableList);
		IViewerObservableValue targetObservableMaterialeNoleggiato = ViewersObservables
				.observeSingleSelection(tableViewerNoleggio);
		bindingContext.bindValue(targetObservableMaterialeNoleggiato, materialeNoleggiatoItemsObservable);

		// note
		IObservableValue<String> noteObservable = EMFProperties.value(ModelPackage.Literals.ISCRIZIONE__NOTE)
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue noteTextObservable = WidgetProperties.text(SWT.Modify).observe(note);
		bindingContext.bindValue(noteTextObservable, noteObservable);

		// elenco errori
		ObservableListContentProvider erroriListContentProvider = new ObservableListContentProvider();
		listViewerElencoErrori.setContentProvider(erroriListContentProvider);
		IObservableList<String> erroriObservableList = EMFProperties
				.list(ModelPackage.Literals.ISCRIZIONE__MESSAGGI_ERRORE).observeDetail(iscrizioneActualObservable);
		listViewerElencoErrori.setInput(erroriObservableList);

		// quota noleggio Dovuta
		IObservableValue<Float> quotaNoleggioDovutaObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue quotaNoleggioDovutaTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(quotaNoleggioDovuta);
		bindingContext.bindValue(quotaNoleggioDovutaTextObservable, quotaNoleggioDovutaObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);

		// quota totale Dovuta
		IObservableValue<Float> quotaTotaleDovutaObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__TOTALE_DA_VERSARE))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue quotaTotaleDovutaTextObservable = WidgetProperties.text(SWT.Modify).observe(totaleDovuto);
		bindingContext.bindValue(quotaTotaleDovutaTextObservable, quotaTotaleDovutaObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);

		// differenza
		IObservableValue<Float> differenzaObservable = EMFProperties
				.value(FeaturePath
						.fromList(ModelPackage.Literals.ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE))
				.observeDetail(iscrizioneActualObservable);
		ISWTObservableValue differenzaTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(differenzaTotaleVersatoTotaleDovuto);
		Binding bindingDifferenza = bindingContext.bindValue(differenzaTextObservable, differenzaObservable,
				target2modelDifferenzaQuotaStrategy, model2targetQuotaStrategy);

		ControlDecorationSupport.create(bindingDifferenza, SWT.TOP | SWT.LEFT, (Composite) null,
				new OkKoControlDecoratorUpdater(16));

		// scateno il calcolo del totale a fronte di un cambiamento delle quote
		caparraTextObservable.addValueChangeListener(new IValueChangeListener<Float>() {
			@Override
			public void handleValueChange(ValueChangeEvent<? extends Float> event) {
				totaleObservable.getValue();
				quotaTotaleDovutaObservable.getValue();
				differenzaObservable.getValue();
				iscrizioneActualObservable.getValue().getMessaggiErrore();
			}
		});

		saldoTextObservable.addValueChangeListener(new IValueChangeListener<Float>() {
			@Override
			public void handleValueChange(ValueChangeEvent<? extends Float> event) {
				totaleObservable.getValue();
				quotaTotaleDovutaObservable.getValue();
				differenzaObservable.getValue();
				listViewerElencoErrori.refresh();
			}
		});
		noleggioTextObservable.addValueChangeListener(new IValueChangeListener<Float>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Float> event) {
				totaleObservable.getValue();
				quotaTotaleDovutaObservable.getValue();
				differenzaObservable.getValue();
				listViewerElencoErrori.refresh();
			}
		});

		moduloIscrizioneObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
				listViewerElencoErrori.refresh();
			}
		});

		consensoInformatoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
				listViewerElencoErrori.refresh();
			}
		});

		bollinoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
				listViewerElencoErrori.refresh();
			}
		});

		certificatoMedicoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
				listViewerElencoErrori.refresh();
			}
		});

		dataScadenzaCertificatoObservable.addValueChangeListener(new IValueChangeListener<Date>() {

			@Override
			public void handleValueChange(ValueChangeEvent<? extends Date> event) {
				listViewerElencoErrori.refresh();
			}
		});

		// inibisco il bottene di ok se le validazioni falliscono
		AggregateValidationStatus aggregateValidationStatus = new AggregateValidationStatus(
				bindingContext.getBindings(), AggregateValidationStatus.MAX_SEVERITY);
		IObservableValue<Boolean> isValidationOk = ComputedValue
				.create(() -> (aggregateValidationStatus.getValue().getSeverity() < 4));
		ISWTObservableValue buttonEnabledObservable = WidgetProperties.enabled()
				.observe(getButton(IDialogConstants.OK_ID));
		bindingContext.bindValue(buttonEnabledObservable, isValidationOk);
	}

	@Override
	protected boolean isResizable() {
		return false;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(1200, 800);
	}

	public IObservableValue<Iscrizione> getIscrizioneActualObservable() {
		return iscrizioneActualObservable;
	}
}
