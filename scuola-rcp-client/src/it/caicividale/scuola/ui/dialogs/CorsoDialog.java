package it.caicividale.scuola.ui.dialogs;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.nebula.widgets.cdatetime.CDT;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
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
import it.caicividale.scuola.emf.model.ESiglaCorso;
import it.caicividale.scuola.emf.model.ETitoloIstruttore;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.ui.databinding.converters.Float2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.String2FloatConverter;
import it.caicividale.scuola.ui.labelproviders.IstruttoreLabelProvider;
import it.caicividale.scuola.ui.labelproviders.PersonaLabelProvider;
import it.caicividale.scuola.ui.parts.PartDefaults;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.scuola.ui.validators.BooleanWarningValidator;
import it.caicividale.scuola.ui.validators.DataNotNullValidator;
import it.caicividale.scuola.ui.validators.ObjectNotNullValidator;
import it.caicividale.scuola.ui.validators.TextFloatNotNullValidator;
import it.caicividale.scuola.ui.validators.TextSoloLettereNotNullValidator;
import it.caicividale.scuola.ui.validators.TextSoloNumeriValidator;
import it.caicividale.scuola.ui.widgetvalueproperty.LocalDateSelectionProperty;

public class CorsoDialog extends Dialog {
	private final Shell shell;

	private final IStylingEngine stylingEngine;

	private Group groupDatiCorso;

	private Label lblNome;
	private Text nome;

	private Label lblSigla;
	private ComboViewer siglaViewer;
	private Combo sigla;

	private Label lblDataInizio;
	private CDateTime dataInizio;

	private Label lblDataFine;
	private CDateTime dataFine;

	private Label lblDirettore;
	private ComboViewer direttoreViewer;
	private Combo direttore;

	private Label lblViceDirettore;
	private ComboViewer viceDirettoreViewer;
	private Combo viceDirettore;

	private Label lblSegretario;
	private ComboViewer segretarioViewer;
	private Combo segretario;

	private Label lblCaparra;
	private Text caparra;

	private Label lblQuotaPartecipazione;
	private Text quotaPartecipazione;

	private Label lblIscrizione;
	private StyledText iscrizione;

	private Label lblEquipaggiamento;
	private StyledText equipaggiamento;

	private Button checkBoxIsModulo;

	private Label lblCorsoAfferente;
	private ComboViewer corsoAfferenteViewer;
	private Combo corsoAfferente;

	public CorsoDialog(Shell parentShell, IStylingEngine stylingEngine) {
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

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new FillLayout());

		Composite container = new Composite(area, SWT.NONE);
		FormLayout layout = new FormLayout();
		container.setLayout(layout);

		FormData formData = new FormData();

		// gruppo per dati corso
		groupDatiCorso = new Group(container, SWT.NONE);
		groupDatiCorso.setText("Dati corso");
		groupDatiCorso.setLayout(new FormLayout());
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		groupDatiCorso.setLayoutData(formData);

		// nome
		lblNome = new Label(groupDatiCorso, SWT.NONE);
		lblNome.setText("Nome corso");
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblNome.setLayoutData(formData);

		nome = new Text(groupDatiCorso, SWT.BORDER | SWT.WRAP);
		formData = new FormData();
		formData.top = new FormAttachment(lblNome, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.height = PartDefaults.H_TEXT;
		formData.width = 400;
		nome.setLayoutData(formData);
		nome.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				e.text = e.text.toUpperCase();
			}
		});
		nome.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					e.doit = true;
				}
			}
		});

		lblSigla = new Label(groupDatiCorso, SWT.NONE);
		lblSigla.setText("Sigla");
		formData = new FormData();
		formData.top = new FormAttachment(nome, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 50;
		formData.height = PartDefaults.H_LABEL;
		lblSigla.setLayoutData(formData);

		siglaViewer = new ComboViewer(groupDatiCorso, SWT.NONE);
		sigla = siglaViewer.getCombo();
		formData = new FormData();
		formData.top = new FormAttachment(lblSigla, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 50;
		formData.height = PartDefaults.H_TEXT;
		sigla.setLayoutData(formData);

		checkBoxIsModulo = new Button(groupDatiCorso, SWT.CHECK);
		checkBoxIsModulo.setText("Modulo");
		formData = new FormData();
		formData.top = new FormAttachment(lblSigla, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(sigla, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.width = 100;
		checkBoxIsModulo.setLayoutData(formData);

		// data inizio
		lblDataInizio = new Label(groupDatiCorso, SWT.NONE);
		lblDataInizio.setText("Data Inzio");
		formData = new FormData();
		formData.top = new FormAttachment(sigla, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblDataInizio.setLayoutData(formData);

		dataInizio = new CDateTime(groupDatiCorso, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
		dataInizio.setPattern("dd/MM/yyyy");
		formData = new FormData();
		formData.top = new FormAttachment(lblDataInizio, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 150;
		formData.height = PartDefaults.H_DATA;
		dataInizio.setLayoutData(formData);
		dataInizio.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					e.doit = true;
				}
			}
		});

		// data fine
		lblDataFine = new Label(groupDatiCorso, SWT.NONE);
		lblDataFine.setText("Data Fine");
		formData = new FormData();
		formData.top = new FormAttachment(sigla, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(dataInizio, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblDataFine.setLayoutData(formData);

		dataFine = new CDateTime(groupDatiCorso, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN);
		dataFine.setPattern("dd/MM/yyyy");
		formData = new FormData();
		formData.top = new FormAttachment(lblDataFine, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(dataInizio, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.width = 150;
		formData.height = PartDefaults.H_DATA;
		dataFine.setLayoutData(formData);
		dataFine.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					e.doit = true;
				}
			}
		});

		lblDirettore = new Label(groupDatiCorso, SWT.NONE);
		lblDirettore.setText("Direttore");
		formData = new FormData();
		formData.top = new FormAttachment(dataInizio, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_LABEL;
		lblDirettore.setLayoutData(formData);

		direttoreViewer = new ComboViewer(groupDatiCorso, SWT.NONE);
		direttore = direttoreViewer.getCombo();
		formData = new FormData();
		formData.top = new FormAttachment(lblDirettore, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_TEXT;
		direttore.setLayoutData(formData);

		lblViceDirettore = new Label(groupDatiCorso, SWT.NONE);
		lblViceDirettore.setText("Vice direttore");
		formData = new FormData();
		formData.top = new FormAttachment(direttore, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_LABEL;
		lblViceDirettore.setLayoutData(formData);

		viceDirettoreViewer = new ComboViewer(groupDatiCorso, SWT.NONE);
		viceDirettore = viceDirettoreViewer.getCombo();
		formData = new FormData();
		formData.top = new FormAttachment(lblViceDirettore, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_TEXT;
		viceDirettore.setLayoutData(formData);

		lblSegretario = new Label(groupDatiCorso, SWT.NONE);
		lblSegretario.setText("Segretario");
		formData = new FormData();
		formData.top = new FormAttachment(viceDirettore, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_LABEL;
		lblSegretario.setLayoutData(formData);

		segretarioViewer = new ComboViewer(groupDatiCorso, SWT.NONE);
		segretario = segretarioViewer.getCombo();
		formData = new FormData();
		formData.top = new FormAttachment(lblSegretario, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = PartDefaults.H_TEXT;
		segretario.setLayoutData(formData);

		// caparra versata
		lblCaparra = new Label(groupDatiCorso, SWT.NONE);
		lblCaparra.setText("Caparra");
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblCaparra.setLayoutData(formData);

		caparra = new Text(groupDatiCorso, SWT.BORDER | SWT.WRAP);
		formData = new FormData();
		formData.top = new FormAttachment(lblCaparra, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_TEXT;
		caparra.setLayoutData(formData);
		caparra.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					e.doit = true;
				}
			}
		});

		// quota partecipazione
		lblQuotaPartecipazione = new Label(groupDatiCorso, SWT.NONE);
		lblQuotaPartecipazione.setText("Quota partecipazione");
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(caparra, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.width = 200;
		formData.height = PartDefaults.H_LABEL;
		lblQuotaPartecipazione.setLayoutData(formData);

		quotaPartecipazione = new Text(groupDatiCorso, SWT.BORDER | SWT.WRAP);
		formData = new FormData();
		formData.top = new FormAttachment(lblQuotaPartecipazione, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(caparra, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.width = 100;
		formData.height = PartDefaults.H_TEXT;
		quotaPartecipazione.setLayoutData(formData);
		quotaPartecipazione.addTraverseListener(new TraverseListener() {
			public void keyTraversed(TraverseEvent e) {
				if (e.detail == SWT.TRAVERSE_TAB_NEXT || e.detail == SWT.TRAVERSE_TAB_PREVIOUS) {
					e.doit = true;
				}
			}
		});

		// iscrizione
		lblIscrizione = new Label(groupDatiCorso, SWT.NONE);
		lblIscrizione.setText("Iscrizione");
		formData = new FormData();
		formData.top = new FormAttachment(caparra, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblIscrizione.setLayoutData(formData);

		iscrizione = new StyledText(groupDatiCorso, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		iscrizione.setEditable(true);
		formData = new FormData();
		formData.top = new FormAttachment(lblIscrizione, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 600;
		formData.height = 100;
		iscrizione.setLayoutData(formData);

		// equipaggiamento
		lblEquipaggiamento = new Label(groupDatiCorso, SWT.NONE);
		lblEquipaggiamento.setText("Equipaggiamento");
		formData = new FormData();
		formData.top = new FormAttachment(iscrizione, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 100;
		formData.height = PartDefaults.H_LABEL;
		lblEquipaggiamento.setLayoutData(formData);

		equipaggiamento = new StyledText(groupDatiCorso, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		equipaggiamento.setEditable(true);
		formData = new FormData();
		formData.top = new FormAttachment(lblEquipaggiamento, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 600;
		formData.height = 100;
		equipaggiamento.setLayoutData(formData);

		return area;
	}

	@SuppressWarnings("unchecked")
	private void bind2model() {
		DataBindingContext bindingContext = new DataBindingContext();

		ModelManager modelManager = ModelManager.getInstance();

		IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();

		UpdateValueStrategy target2modelTextSoloLettereNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSoloLettereNotNullStrategy.setBeforeSetValidator(new TextSoloLettereNotNullValidator());

		UpdateValueStrategy target2modelDataNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelDataNotNullStrategy.setBeforeSetValidator(new DataNotNullValidator());

		UpdateValueStrategy target2modelTextSoloNumeriStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelTextSoloNumeriStrategy.setBeforeSetValidator(new TextSoloNumeriValidator());

		UpdateValueStrategy target2modelObjectNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);
		target2modelObjectNotNullStrategy.setBeforeSetValidator(new ObjectNotNullValidator());

		UpdateValueStrategy target2modelCheckStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
		target2modelCheckStrategy.setBeforeSetValidator(new BooleanWarningValidator());

		UpdateValueStrategy target2modelQuotaStrategy = new ConverterUpdateValueStrategy(new String2FloatConverter());
		target2modelQuotaStrategy.setBeforeSetValidator(new TextFloatNotNullValidator());

		UpdateValueStrategy model2targetQuotaStrategy = new ConverterUpdateValueStrategy(new Float2StringConverter());

		UpdateValueStrategy model2targetObjectNotNullStrategy = new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_UPDATE);

		// nome
		IObservableValue<String> nomeObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__NOME)).observeDetail(corsoObservable);
		ISWTObservableValue nomeTextObservable = WidgetProperties.text(SWT.Modify).observe(nome);
		Binding nomeBinding = bindingContext.bindValue(nomeTextObservable, nomeObservable,
				target2modelObjectNotNullStrategy, null);
		ControlDecorationSupport.create(nomeBinding, SWT.TOP | SWT.LEFT);

		// sigla
		siglaViewer.setContentProvider(ArrayContentProvider.getInstance());
		siglaViewer.setInput(ESiglaCorso.values());
		IObservableValue<String> siglaObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__SIGLA)).observeDetail(corsoObservable);
		IViewerObservableValue siglaComboObservable = ViewersObservables.observeSingleSelection(siglaViewer);
		Binding siglaBinding = bindingContext.bindValue(siglaComboObservable, siglaObservable,
				target2modelObjectNotNullStrategy, model2targetObjectNotNullStrategy);
		ControlDecorationSupport.create(siglaBinding, SWT.TOP | SWT.LEFT);

		// modulo
		IObservableValue<Boolean> isModuloObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__IS_MODULO)).observeDetail(corsoObservable);
		ISWTObservableValue isModuloCheckboxObservable = WidgetProperties.selection().observe(checkBoxIsModulo);
		bindingContext.bindValue(isModuloCheckboxObservable, isModuloObservable, target2modelCheckStrategy, null);

		// data inizio
		LocalDateSelectionProperty localDateSelectionDataNascitaProperty = new LocalDateSelectionProperty();
		IObservableValue<Date> dataInizioObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__DATA_INIZIO)).observeDetail(corsoObservable);
		ISWTObservableValue dataInizioDateTimeObservable = localDateSelectionDataNascitaProperty.observe(dataInizio);
		Binding dataInizioBinding = bindingContext.bindValue(dataInizioDateTimeObservable, dataInizioObservable,
				target2modelDataNotNullStrategy, null);
		ControlDecorationSupport.create(dataInizioBinding, SWT.TOP | SWT.LEFT);

		// data fine
		IObservableValue<Date> dataFineObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__DATA_FINE)).observeDetail(corsoObservable);
		ISWTObservableValue dataFineDateTimeObservable = localDateSelectionDataNascitaProperty.observe(dataFine);
		Binding dataFineBinding = bindingContext.bindValue(dataFineDateTimeObservable, dataFineObservable,
				target2modelDataNotNullStrategy, null);
		ControlDecorationSupport.create(dataFineBinding, SWT.TOP | SWT.LEFT);

		// direttore
		List<Istruttore> istruttoriTitolati = modelManager.getElencoIstruttoriObservableList().stream()
				.filter(i -> !ETitoloIstruttore.ISTRUTTORE_SEZIONALE.equals(i.getTitolo())
						&& !ETitoloIstruttore.ASPIRANTE_ISTRUTTORE.equals(i.getTitolo()))
				.sorted(new Comparator<Istruttore>() {

					@Override
					public int compare(Istruttore i1, Istruttore i2) {

						return i1.getCognome().compareTo(i2.getCognome());
					}

				}).collect(Collectors.toList());
		direttoreViewer.setContentProvider(ArrayContentProvider.getInstance());
		direttoreViewer.setInput(istruttoriTitolati);
		direttoreViewer.setLabelProvider(new IstruttoreLabelProvider());
		if (corsoObservable.getValue() != null && corsoObservable.getValue().getDirettore() != null) {
			Istruttore direttore = istruttoriTitolati.stream()
					.filter(i -> i.getId().equals(corsoObservable.getValue().getDirettore().getId())).findFirst()
					.orElse(null);
			direttoreViewer.setSelection(new StructuredSelection(direttore));
		}

		IObservableValue<String> direttoreObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__DIRETTORE)).observeDetail(corsoObservable);
		IViewerObservableValue targetObservable = ViewersObservables.observeSingleSelection(direttoreViewer);
		Binding direttoreoBinding = bindingContext.bindValue(targetObservable, direttoreObservable,
				target2modelObjectNotNullStrategy, model2targetObjectNotNullStrategy);
		ControlDecorationSupport.create(direttoreoBinding, SWT.TOP | SWT.LEFT);

		List<Istruttore> istruttori = modelManager.getElencoIstruttoriObservableList();
		// vice direttore
		viceDirettoreViewer.setContentProvider(ArrayContentProvider.getInstance());
		viceDirettoreViewer.setInput(istruttori);
		viceDirettoreViewer.setLabelProvider(new IstruttoreLabelProvider());
		if (corsoObservable.getValue() != null && corsoObservable.getValue().getVicedirettore() != null) {
			Istruttore viceDirettore = istruttori.stream()
					.filter(i -> i.getId().equals(corsoObservable.getValue().getVicedirettore().getId())).findFirst()
					.orElse(null);
			viceDirettoreViewer.setSelection(new StructuredSelection(viceDirettore));
		}

		IObservableValue<String> viceDirettoreObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__VICEDIRETTORE)).observeDetail(corsoObservable);
		IViewerObservableValue viceDirettoreTargetObservable = ViewersObservables
				.observeSingleSelection(viceDirettoreViewer);
		Binding viceDirettoreoBinding = bindingContext.bindValue(viceDirettoreTargetObservable, viceDirettoreObservable,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE),
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE));

		// segretario
		List<Persona> staffScuola = modelManager.getElencoPersoneInStaffObservableList().stream()
				.sorted(new Comparator<Persona>() {

					@Override
					public int compare(Persona p1, Persona p2) {

						return p1.getCognome().compareTo(p2.getCognome());
					}

				}).collect(Collectors.toList());
		segretarioViewer.setContentProvider(ArrayContentProvider.getInstance());
		segretarioViewer.setInput(staffScuola);
		segretarioViewer.setLabelProvider(new PersonaLabelProvider());
		if (corsoObservable.getValue() != null && corsoObservable.getValue().getSegretario() != null) {
			Persona segretario = staffScuola.stream()
					.filter(i -> i.getId().equals(corsoObservable.getValue().getSegretario().getId())).findFirst()
					.orElse(null);
			segretarioViewer.setSelection(new StructuredSelection(segretario));
		}

		IObservableValue<String> segretarioObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__SEGRETARIO)).observeDetail(corsoObservable);
		IViewerObservableValue segretarioTargetObservable = ViewersObservables.observeSingleSelection(segretarioViewer);
		Binding segretarioBinding = bindingContext.bindValue(segretarioTargetObservable, segretarioObservable,
				target2modelObjectNotNullStrategy, model2targetObjectNotNullStrategy);
		ControlDecorationSupport.create(segretarioBinding, SWT.TOP | SWT.LEFT);

		// caparra
		IObservableValue<Float> caparraObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__QUOTA_CAPARRA)).observeDetail(corsoObservable);
		ISWTObservableValue caparraTextObservable = WidgetProperties.text(SWT.Modify).observe(caparra);
		Binding caparraBinding = bindingContext.bindValue(caparraTextObservable, caparraObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);
		ControlDecorationSupport.create(caparraBinding, SWT.TOP | SWT.LEFT);

		// quotaCorso
		IObservableValue<Float> quotaCorsoObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__QUOTA_ISCRIZIONE))
				.observeDetail(corsoObservable);
		ISWTObservableValue quotaCorsoTextObservable = WidgetProperties.text(SWT.Modify).observe(quotaPartecipazione);
		Binding quotaBinding = bindingContext.bindValue(quotaCorsoTextObservable, quotaCorsoObservable,
				target2modelQuotaStrategy, model2targetQuotaStrategy);
		ControlDecorationSupport.create(quotaBinding, SWT.TOP | SWT.LEFT);

		// iscrizione
		IObservableValue<String> corsoIscrizioneObservable = EMFProperties.value(ModelPackage.Literals.CORSO__TESTO)
				.observeDetail(corsoObservable);
		ISWTObservableValue descrizioneTextObservable = WidgetProperties.text(SWT.Modify).observe(iscrizione);
		bindingContext.bindValue(descrizioneTextObservable, corsoIscrizioneObservable);

		// equipaggiamento
		IObservableValue<String> corsoEquipaggiamentoObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__EQUIPAGGIAMENTO).observeDetail(corsoObservable);
		ISWTObservableValue equipaggiamentoTextObservable = WidgetProperties.text(SWT.Modify).observe(equipaggiamento);
		bindingContext.bindValue(equipaggiamentoTextObservable, corsoEquipaggiamentoObservable);

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
		return new Point(700, 850);
	}
}
