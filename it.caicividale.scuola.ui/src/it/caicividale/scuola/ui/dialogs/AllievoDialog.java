package it.caicividale.scuola.ui.dialogs;

import java.util.Date;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.ESesso;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.valueobject.EMail;
import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;
import it.caicividale.scuola.ui.composites.AllievoComposite;
import it.caicividale.scuola.ui.databinding.converters.Date2LocalDateConverter;
import it.caicividale.scuola.ui.databinding.converters.LocalDate2DateConverter;
import it.caicividale.scuola.ui.databinding.converters.String2EmailConverter;
import it.caicividale.scuola.ui.databinding.converters.String2NumeroCellulareConverter;
import it.caicividale.scuola.ui.databinding.converters.ValueObject2StringConverter;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.scuola.ui.validators.BooleanWarningValidator;
import it.caicividale.scuola.ui.validators.DataNotNullValidator;
import it.caicividale.scuola.ui.validators.ObjectNotNullValidator;
import it.caicividale.scuola.ui.validators.TextEmailValidator;
import it.caicividale.scuola.ui.validators.TextNumeroCellulareValidator;
import it.caicividale.scuola.ui.validators.TextSoloLettereNotNullValidator;
import it.caicividale.scuola.ui.validators.TextSoloLettereValidator;
import it.caicividale.scuola.ui.validators.TextSoloNumeriValidator;
import it.caicividale.scuola.ui.widgetvalueproperty.LocalDateSelectionProperty;

public class AllievoDialog extends Dialog {

    private final Shell shell;

    private final IStylingEngine stylingEngine;

    private Group groupDatiAnagrafici;

    private AllievoComposite allievoComposite;

//    private final IObservableValue<Iscrizione> allievoActualObservable = WritableValue
//	    .withValueType(Iscrizione.class);

    private final IObservableValue<Allievo> allievoActualObservable = WritableValue.withValueType(Allievo.class);

    public AllievoDialog(Shell parentShell, Allievo allievo, IStylingEngine stylingEngine) {
	super(parentShell);
	allievoActualObservable.setValue(allievo);
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

	return area;
    }

    private void configureGropuDatiAnagrafici(Composite container) {
	allievoComposite = new AllievoComposite(shell, container, stylingEngine);
	groupDatiAnagrafici = allievoComposite.configureGropuDatiAnagrafici();

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void bind2model() {
	DataBindingContext bindingContext = new DataBindingContext();
	// if (allievoActualObservable.getValue() == null) {
	// // sono nel caso di nuovo inserimento
	// Iscrizione iscrizione = ModelFactory.eINSTANCE.createIscrizione();
	// Allievo allievo = ModelFactory.eINSTANCE.createAllievo();
	// iscrizione.setAllievo(allievo);
	// allievoActualObservable.setValue(iscrizione);
	// }

	UpdateValueStrategy target2modelTextSoloLettereNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	target2modelTextSoloLettereNotNullStrategy.setBeforeSetValidator(new TextSoloLettereNotNullValidator());

	UpdateValueStrategy target2modelObjectNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	target2modelObjectNotNullStrategy.setBeforeSetValidator(new ObjectNotNullValidator());

	UpdateValueStrategy target2modelDataNotNullStrategy = new ConverterUpdateValueStrategy(
		new Date2LocalDateConverter());
	target2modelDataNotNullStrategy.setBeforeSetValidator(new DataNotNullValidator());

	UpdateValueStrategy model2targetDataNotNullStrategy = new ConverterUpdateValueStrategy(
		new LocalDate2DateConverter());
	model2targetDataNotNullStrategy.setBeforeSetValidator(new DataNotNullValidator());

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

	UpdateValueStrategy model2targetObjectNotNullStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);

	UpdateValueStrategy target2modelCheckStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
	target2modelCheckStrategy.setBeforeSetValidator(new BooleanWarningValidator());

	// nome
	IObservableValue<String> nomeObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__NOME))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue nomeTextObservable = WidgetProperties.text(SWT.Modify).observe(allievoComposite.getNome());
	Binding nomeBinding = bindingContext.bindValue(nomeTextObservable, nomeObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(nomeBinding, SWT.TOP | SWT.LEFT);

	// cognome
	IObservableValue<String> cognomeObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__COGNOME))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue cognomeTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getCognome());
	Binding cognomeBinding = bindingContext.bindValue(cognomeTextObservable, cognomeObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(cognomeBinding, SWT.TOP | SWT.LEFT);

	// sesso
	allievoComposite.getSessoViewer().setContentProvider(ArrayContentProvider.getInstance());
	allievoComposite.getSessoViewer().setInput(ESesso.values());
	IObservableValue<String> sessoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__SESSO))
		.observeDetail(allievoActualObservable);
	IViewerObservableValue sessoComboObservable = ViewersObservables
		.observeSingleSelection(allievoComposite.getSessoViewer());
	Binding sessoBinding = bindingContext.bindValue(sessoComboObservable, sessoObservable,
		target2modelObjectNotNullStrategy, model2targetObjectNotNullStrategy);
	ControlDecorationSupport.create(sessoBinding, SWT.TOP | SWT.LEFT);

	// via
	IObservableValue<String> viaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__RESIDENZA_VIA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue viaTextObservable = WidgetProperties.text(SWT.Modify).observe(allievoComposite.getVia());
	Binding viaBinding = bindingContext.bindValue(viaTextObservable, viaObservable,
		target2modelObjectNotNullStrategy, null);
	ControlDecorationSupport.create(viaBinding, SWT.TOP | SWT.LEFT);

	// comune Residenza
	IObservableValue<String> comuneResidenzaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_RESIDENZA, ModelPackage.Literals.DIZ_COMUNE__COMUNE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue comuneResidenzaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getComuneResidenza());
	Binding comuneResidenzaBinding = bindingContext.bindValue(comuneResidenzaTextObservable,
		comuneResidenzaObservable, target2modelTextSoloLettereStrategy, null);
	ControlDecorationSupport.create(comuneResidenzaBinding, SWT.TOP | SWT.LEFT);

	// cap
	IObservableValue<String> capObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_RESIDENZA, ModelPackage.Literals.DIZ_COMUNE__CAP))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue capTextObservable = WidgetProperties.text(SWT.Modify).observe(allievoComposite.getCap());
	Binding capBinding = bindingContext.bindValue(capTextObservable, capObservable,
		target2modelTextSoloNumeriStrategy, null);
	ControlDecorationSupport.create(capBinding, SWT.TOP | SWT.LEFT);

	// provincia residenza
	IObservableValue<String> provinciaResidenzaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_RESIDENZA, ModelPackage.Literals.DIZ_COMUNE__SIGLA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue provinciaResidenzaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getProvinciaResidenza());
	Binding provinciaResidenzaBinding = bindingContext.bindValue(provinciaResidenzaTextObservable,
		provinciaResidenzaObservable, target2modelTextSolo2LettereStrategy, null);
	ControlDecorationSupport.create(provinciaResidenzaBinding, SWT.TOP | SWT.LEFT);

	// data Nascita
	LocalDateSelectionProperty localDateSelectionDataNascitaProperty = new LocalDateSelectionProperty();
	IObservableValue<Date> dataNascitaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__NASCITA_DATA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue dataNascitaDateTimeObservable = localDateSelectionDataNascitaProperty
		.observe(allievoComposite.getDataNascita());
	Binding dataNascitaBinding = bindingContext.bindValue(dataNascitaDateTimeObservable, dataNascitaObservable,
		target2modelDataNotNullStrategy, model2targetDataNotNullStrategy);
	ControlDecorationSupport.create(dataNascitaBinding, SWT.TOP | SWT.LEFT);

	// comune Nascita
	IObservableValue<String> comuneNascitaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_NASCITA, ModelPackage.Literals.DIZ_COMUNE__COMUNE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue comuneNascitaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getComuneNascita());
	Binding comuneNascitaBinding = bindingContext.bindValue(comuneNascitaTextObservable, comuneNascitaObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(comuneNascitaBinding, SWT.TOP | SWT.LEFT);

	// provincia Nascita
	IObservableValue<String> provinciaNascitaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_NASCITA, ModelPackage.Literals.DIZ_COMUNE__SIGLA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue comuneProvinciaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getProvinciaNascita());
	Binding provinciaNascitaBinding = bindingContext.bindValue(comuneProvinciaTextObservable,
		provinciaNascitaObservable, target2modelTextSolo2LettereStrategy, null);
	ControlDecorationSupport.create(provinciaNascitaBinding, SWT.TOP | SWT.LEFT);

	// sezione
	IObservableValue<String> sezioneObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__SEZIONE_CAI_APPARTENENZA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue sezioneTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getSezione());
	Binding sezioneBinding = bindingContext.bindValue(sezioneTextObservable, sezioneObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(sezioneBinding, SWT.TOP | SWT.LEFT);

	// nuovo allievo
	IObservableValue<Boolean> nuovoAllievoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_NUOVO_ALLIEVO))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue nuovoAllievoCheckboxObservable = WidgetProperties.buttonSelection()
		.observe(allievoComposite.getCheckBoxNuovoAllievo());
	Binding nuovoAllievoBinding = bindingContext.bindValue(nuovoAllievoCheckboxObservable, nuovoAllievoObservable,
		target2modelCheckStrategy, null);

	// numeroCellulare
	IObservableValue<NumeroCellulare> numeroCellulareObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__NUMERO_CELLULARE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue numeroCellulareTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getNumeroCellulare());
	Binding numeroCellulareBinding = bindingContext.bindValue(numeroCellulareTextObservable,
		numeroCellulareObservable, target2modelTextNumeroCellulareStrategy,
		model2targetNumeroCellulareTextStrategy);
	ControlDecorationSupport.create(numeroCellulareBinding, SWT.TOP | SWT.LEFT);

	// email
	IObservableValue<EMail> emailObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__EMAIL))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue emailTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getEmail());
	Binding emailBinding = bindingContext.bindValue(emailTextObservable, emailObservable,
		target2modelTextEmailStrategy, model2targetEmailTextStrategy);
	ControlDecorationSupport.create(emailBinding, SWT.TOP | SWT.LEFT);

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

    public IObservableValue<Allievo> getIscrizioneActualObservable() {
	return allievoActualObservable;
    }
}
