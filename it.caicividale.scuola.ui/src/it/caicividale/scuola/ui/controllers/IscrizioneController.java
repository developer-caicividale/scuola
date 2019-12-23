package it.caicividale.scuola.ui.controllers;

import java.time.LocalDate;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.ComputedValue;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.ui.composites.IscrizioneComposite;
import it.caicividale.scuola.ui.databinding.converters.Date2LocalDateConverter;
import it.caicividale.scuola.ui.databinding.converters.Float2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.LocalDate2DateConverter;
import it.caicividale.scuola.ui.databinding.converters.PersonaNomeCognome2StringConverter;
import it.caicividale.scuola.ui.databinding.converters.String2FloatConverter;
import it.caicividale.scuola.ui.decorationupdaters.OkKoControlDecoratorUpdater;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;
import it.caicividale.scuola.ui.validators.BooleanWarningValidator;
import it.caicividale.scuola.ui.validators.DataNotNullValidator;
import it.caicividale.scuola.ui.validators.DataScadenzaCertificatoValidator;
import it.caicividale.scuola.ui.validators.DifferenzaQuotaValidator;
import it.caicividale.scuola.ui.validators.ObjectNotNullValidator;
import it.caicividale.scuola.ui.validators.TextFloatValidator;
import it.caicividale.scuola.ui.validators.TextSoloLettereNotNullValidator;
import it.caicividale.scuola.ui.validators.TextSoloLettereValidator;
import it.caicividale.scuola.ui.validators.TextSoloNumeriValidator;
import it.caicividale.scuola.ui.widgetvalueproperty.LocalDateSelectionProperty;
import lombok.Data;

@Data
public class IscrizioneController {

    private final IscrizioneComposite iscrizioneComposite;
    private final Button okButton;

    private final IObservableValue<Iscrizione> iscrizioneActualObservable;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void bind2model() {
	DataBindingContext bindingContext = new DataBindingContext();

	UpdateValueStrategy model2targetInfoAllievo = new ConverterUpdateValueStrategy(
		new PersonaNomeCognome2StringConverter());

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

	UpdateValueStrategy target2modelQuotaStrategy = new ConverterUpdateValueStrategy(new String2FloatConverter());
	target2modelQuotaStrategy.setBeforeSetValidator(new TextFloatValidator());
	UpdateValueStrategy model2targetQuotaStrategy = new ConverterUpdateValueStrategy(new Float2StringConverter());

	UpdateValueStrategy target2modelCheckStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
	target2modelCheckStrategy.setBeforeSetValidator(new BooleanWarningValidator());

	UpdateValueStrategy target2modelDataScadenzaCertificatoStrategy = new ConverterUpdateValueStrategy(
		new Date2LocalDateConverter());
	target2modelDataScadenzaCertificatoStrategy.setBeforeSetValidator(new DataScadenzaCertificatoValidator());

	UpdateValueStrategy model2targetDataScadenzaCertificatoStrategy = new ConverterUpdateValueStrategy(
		new LocalDate2DateConverter());
	model2targetDataNotNullStrategy.setBeforeSetValidator(new DataNotNullValidator());

	UpdateValueStrategy target2modelDifferenzaQuotaStrategy = new UpdateValueStrategy(
		UpdateValueStrategy.POLICY_UPDATE);
	target2modelDifferenzaQuotaStrategy.setBeforeSetValidator(new DifferenzaQuotaValidator());

	// allievo
	IObservableValue<Text> allievoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__ALLIEVO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue allievoTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getAllievo());
	bindingContext.bindValue(allievoTextObservable, allievoObservable, null, model2targetInfoAllievo);

	// moduloIscrizione
	IObservableValue<Boolean> moduloIscrizioneObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_MODULO_ISCRIZIONE))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue moduloIscrizionCheckboxObservable = WidgetProperties.buttonSelection()
		.observe(iscrizioneComposite.getCheckBoxModuloIscrizione());
	Binding moduloIscrizionBinding = bindingContext.bindValue(moduloIscrizionCheckboxObservable,
		moduloIscrizioneObservable, target2modelCheckStrategy, null);
	ControlDecorationSupport.create(moduloIscrizionBinding, SWT.TOP | SWT.LEFT, (Composite) null,
		new OkKoControlDecoratorUpdater(16));

	// consensoInformato
	IObservableValue<Boolean> consensoInformatoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_CONSENSO_INFORMATO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue consensoInformatoCheckboxObservable = WidgetProperties.buttonSelection()
		.observe(iscrizioneComposite.getCheckBoxConsensoInformato());
	Binding consensoInformatoBinding = bindingContext.bindValue(consensoInformatoCheckboxObservable,
		consensoInformatoObservable, target2modelCheckStrategy, null);
	ControlDecorationSupport.create(consensoInformatoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
		new OkKoControlDecoratorUpdater(16));

	// certificatoMedico
	IObservableValue<Boolean> certificatoMedicoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_CERTIFICATO_MEDICO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue certificatoMedicoCheckboxObservable = WidgetProperties.buttonSelection()
		.observe(iscrizioneComposite.getCheckBoxCertificatoMedico());
	Binding certificatoMedicoBinding = bindingContext.bindValue(certificatoMedicoCheckboxObservable,
		certificatoMedicoObservable, target2modelCheckStrategy, null);
	ControlDecorationSupport.create(certificatoMedicoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
		new OkKoControlDecoratorUpdater(16));

	// data ScadenzaCertificato
	LocalDateSelectionProperty localDateSelectionDataScadenzaCertificatoProperty = new LocalDateSelectionProperty();
	IObservableValue<LocalDate> dataScadenzaCertificatoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue dataScadenzaCertificatoDateTimeObservable = localDateSelectionDataScadenzaCertificatoProperty
		.observe(iscrizioneComposite.getDataScadenzaCertificatoMedico());
	Binding dataScadenzaCertificatoBinding = bindingContext.bindValue(dataScadenzaCertificatoDateTimeObservable,
		dataScadenzaCertificatoObservable, target2modelDataScadenzaCertificatoStrategy,
		model2targetDataScadenzaCertificatoStrategy);
	ControlDecorationSupport.create(dataScadenzaCertificatoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
		new OkKoControlDecoratorUpdater(16));

	// bollino
	IObservableValue<Boolean> bollinoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue bollinoCheckboxObservable = WidgetProperties.buttonSelection()
		.observe(iscrizioneComposite.getCheckBoxBollino());
	Binding bollinoBinding = bindingContext.bindValue(bollinoCheckboxObservable, bollinoObservable,
		target2modelCheckStrategy, null);
	ControlDecorationSupport.create(bollinoBinding, SWT.TOP | SWT.LEFT, (Composite) null,
		new OkKoControlDecoratorUpdater(16));

	// caparra
	IObservableValue<Float> caparraObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__CAPARRA))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue caparraTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getCaparraVersata());
	Binding caparraBinding = bindingContext.bindValue(caparraTextObservable, caparraObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);
	ControlDecorationSupport.create(caparraBinding, SWT.TOP | SWT.LEFT);

	// saldo
	IObservableValue<Float> saldoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__SALDO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue saldoTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getSaldoVersato());
	Binding saldoBinding = bindingContext.bindValue(saldoTextObservable, saldoObservable, target2modelQuotaStrategy,
		model2targetQuotaStrategy);
	ControlDecorationSupport.create(saldoBinding, SWT.TOP | SWT.LEFT);

	// noleggio
	IObservableValue<Float> noleggioObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__QUOTA_NOLEGGIO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue noleggioTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getNoleggioVersato());
	Binding noleggioBinding = bindingContext.bindValue(noleggioTextObservable, noleggioObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);
	ControlDecorationSupport.create(noleggioBinding, SWT.TOP | SWT.LEFT);

	// totale
	IObservableValue<Float> totaleObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__TOTALE_VERSATO))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue totaleTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getTotaleVersato());
	Binding totaleBinding = bindingContext.bindValue(totaleTextObservable, totaleObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);
	ControlDecorationSupport.create(totaleBinding, SWT.TOP | SWT.LEFT);

	// quotaCorso
	IObservableValue<Float> quotaCorsoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__QUOTA_ISCRIZIONE))
		.observeDetail(ModelManager.getInstance().getCorsoObservable());
	ISWTObservableValue quotaCorsoTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getQuotaCorso());
	bindingContext.bindValue(quotaCorsoTextObservable, quotaCorsoObservable, target2modelQuotaStrategy,
		model2targetQuotaStrategy);

	// note
	IObservableValue<String> noteObservable = EMFProperties.value(ModelPackage.Literals.ISCRIZIONE__NOTE)
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue noteTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getNote());
	bindingContext.bindValue(noteTextObservable, noteObservable);

	// elenco errori
	ObservableListContentProvider erroriListContentProvider = new ObservableListContentProvider();
	iscrizioneComposite.getListViewerElencoErrori().setContentProvider(erroriListContentProvider);
	IObservableList<String> erroriObservableList = EMFProperties
		.list(ModelPackage.Literals.ISCRIZIONE__MESSAGGI_ERRORE).observeDetail(iscrizioneActualObservable);
	iscrizioneComposite.getListViewerElencoErrori().setInput(erroriObservableList);

	// quota noleggio Dovuta
	IObservableValue<Float> quotaNoleggioDovutaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue quotaNoleggioDovutaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getQuotaNoleggioDovuta());
	bindingContext.bindValue(quotaNoleggioDovutaTextObservable, quotaNoleggioDovutaObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);

	// quota totale Dovuta
	IObservableValue<Float> quotaTotaleDovutaObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.ISCRIZIONE__TOTALE_DA_VERSARE))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue quotaTotaleDovutaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getTotaleDovuto());
	bindingContext.bindValue(quotaTotaleDovutaTextObservable, quotaTotaleDovutaObservable,
		target2modelQuotaStrategy, model2targetQuotaStrategy);

	// differenza
	IObservableValue<Float> differenzaObservable = EMFProperties
		.value(FeaturePath
			.fromList(ModelPackage.Literals.ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE))
		.observeDetail(iscrizioneActualObservable);
	ISWTObservableValue differenzaTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(iscrizioneComposite.getDifferenzaTotaleVersatoTotaleDovuto());
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
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});
	noleggioTextObservable.addValueChangeListener(new IValueChangeListener<Float>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Float> event) {
		totaleObservable.getValue();
		quotaTotaleDovutaObservable.getValue();
		differenzaObservable.getValue();
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	moduloIscrizioneObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	consensoInformatoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	bollinoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	certificatoMedicoObservable.addValueChangeListener(new IValueChangeListener<Boolean>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Boolean> event) {
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	dataScadenzaCertificatoObservable.addValueChangeListener(new IValueChangeListener<LocalDate>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends LocalDate> event) {
		iscrizioneComposite.getListViewerElencoErrori().refresh();
	    }
	});

	// inibisco il bottene di ok se le validazioni falliscono
	AggregateValidationStatus aggregateValidationStatus = new AggregateValidationStatus(
		bindingContext.getBindings(), AggregateValidationStatus.MAX_SEVERITY);
	IObservableValue<Boolean> isValidationOk = ComputedValue
		.create(() -> (aggregateValidationStatus.getValue().getSeverity() < 4));
	ISWTObservableValue buttonEnabledObservable = WidgetProperties.enabled().observe(okButton);
	bindingContext.bindValue(buttonEnabledObservable, isValidationOk);
    }

}
