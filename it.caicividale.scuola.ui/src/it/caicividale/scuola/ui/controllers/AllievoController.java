package it.caicividale.scuola.ui.controllers;

import java.time.LocalDate;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.ESesso;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.valueobject.EMail;
import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;
import it.caicividale.scuola.service.ModelManager;
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
import lombok.Data;

@Data
public class AllievoController {

    private final AllievoComposite allievoComposite;
    private final Button okButton;

    private final IObservableValue<Allievo> allievoActualObservable;

    private IObservableList<DizComune> dizComuneObservableList = WritableList.withElementType(DizComune.class);

    ModelManager modelManager = ModelManager.getInstance();

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void bind2model() {
	DataBindingContext bindingContext = new DataBindingContext();

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
	IViewerObservableValue sessoComboObservable = ViewerProperties.singleSelection()
		.observe(allievoComposite.getSessoViewer());
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

	// regione Residenza

	IObservableValue<String> regioneResidenzaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_RESIDENZA, ModelPackage.Literals.DIZ_COMUNE__REGIONE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue regioneResidenzaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getRegioneResidenza());
	Binding regioneResidenzaBinding = bindingContext.bindValue(regioneResidenzaTextObservable,
		regioneResidenzaObservable, target2modelTextSoloLettereStrategy, null);
	ControlDecorationSupport.create(regioneResidenzaBinding, SWT.TOP | SWT.LEFT);

	// metto in binding l'osservabile della regione nel model manager con la regione
	// di residenza per fare il refresh del dizionario del comune
	IObservableValue<String> regioneResidenzaDizObservable = modelManager.getRegioneResidenzaObservable();
	bindingContext.bindValue(regioneResidenzaDizObservable, regioneResidenzaTextObservable);

	// comune Residenza
	IObservableValue<String> comuneResidenzaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_RESIDENZA, ModelPackage.Literals.DIZ_COMUNE__COMUNE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue comuneResidenzaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getComuneResidenza());
	Binding comuneResidenzaBinding = bindingContext.bindValue(comuneResidenzaTextObservable,
		comuneResidenzaObservable, target2modelTextSoloLettereStrategy, null);
	ControlDecorationSupport.create(comuneResidenzaBinding, SWT.TOP | SWT.LEFT);

	// data Nascita
	LocalDateSelectionProperty localDateSelectionDataNascitaProperty = new LocalDateSelectionProperty();
	IObservableValue<LocalDate> dataNascitaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.PERSONA__NASCITA_DATA))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue dataNascitaDateTimeObservable = localDateSelectionDataNascitaProperty
		.observe(allievoComposite.getDataNascita());
	Binding dataNascitaBinding = bindingContext.bindValue(dataNascitaDateTimeObservable, dataNascitaObservable,
		target2modelDataNotNullStrategy, model2targetDataNotNullStrategy);
	ControlDecorationSupport.create(dataNascitaBinding, SWT.TOP | SWT.LEFT);

	// regione Nascita
	IObservableValue<String> regioneNascitaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_NASCITA, ModelPackage.Literals.DIZ_COMUNE__REGIONE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue regioneNascitaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getRegioneNascita());
	Binding regioneNascitaBinding = bindingContext.bindValue(regioneNascitaTextObservable, regioneNascitaObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(regioneNascitaBinding, SWT.TOP | SWT.LEFT);

	// comune Nascita
	IObservableValue<String> comuneNascitaObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.PERSONA__COMUNE_NASCITA, ModelPackage.Literals.DIZ_COMUNE__COMUNE))
		.observeDetail(allievoActualObservable);
	ISWTObservableValue comuneNascitaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(allievoComposite.getComuneNascita());
	Binding comuneNascitaBinding = bindingContext.bindValue(comuneNascitaTextObservable, comuneNascitaObservable,
		target2modelTextSoloLettereNotNullStrategy, null);
	ControlDecorationSupport.create(comuneNascitaBinding, SWT.TOP | SWT.LEFT);

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
	ISWTObservableValue buttonEnabledObservable = WidgetProperties.enabled().observe(okButton);
	bindingContext.bindValue(buttonEnabledObservable, isValidationOk);
    }

    public IObservableValue<Allievo> getIscrizioneActualObservable() {
	return allievoActualObservable;
    }
}
