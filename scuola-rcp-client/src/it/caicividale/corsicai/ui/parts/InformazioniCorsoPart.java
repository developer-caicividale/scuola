
package it.caicividale.corsicai.ui.parts;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Persona;
import it.caicividale.corsicai.ui.databinding.converters.Corso2ImageConverter;
import it.caicividale.corsicai.ui.databinding.converters.Date2StringConverter;
import it.caicividale.corsicai.ui.databinding.converters.DizCatalogoCorsi2StringConverter;
import it.caicividale.corsicai.ui.databinding.converters.PersonaNomeCognome2StringConverter;
import it.caicividale.corsicai.ui.databinding.converters.Soldi2StringConverter;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.updatevaluestrategy.ConverterUpdateValueStrategy;

public class InformazioniCorsoPart {

	@Inject
	IStylingEngine stylingEngine;
	private Group groupTitolo;
	private Group groupInfoGenerali;
	private Group groupDescrizione;
	private Group groupEqipaggaimento;

	private Label imageCorso;
	private Text nomeCorso;
	private Label lblDirettore;
	private Text direttore;
	private Label lblViceDirettore;
	private Text viceDirettore;
	private Label lblSegretario;
	private Text segretario;
	private Text caparra;
	private Text quotaPartecipazione;
	private Label lblDataInizio;
	private Text dataInizio;
	private Label lblDataFine;
	private Text dataFine;

	private StyledText corsoIscrizione;
	private StyledText corsoEquipaggiamento;

	ModelManager modelManager = ModelManager.getInstance();

	@PostConstruct
	public void postConstruct(Composite parent) {

		FormData formData = new FormData();

		Composite container = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		container.setLayout(layout);

		groupTitolo = new Group(container, SWT.NONE);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		groupTitolo.setLayout(new FormLayout());
		groupTitolo.setLayoutData(formData);

		// immagine corso
		imageCorso = new Label(groupTitolo, SWT.NONE);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.height = 32;
		formData.width = 32;
		imageCorso.setLayoutData(formData);

		// nome corso
		nomeCorso = new Text(groupTitolo, SWT.NONE);
		nomeCorso.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(imageCorso, PartDefaults.H_LABEL2LABEL_OFFSET);
		formData.width = 400;
		nomeCorso.setLayoutData(formData);
		stylingEngine.setId(nomeCorso, "CSSTextTitle");

		groupInfoGenerali = new Group(container, SWT.NONE);
		groupInfoGenerali.setText("Informazioni generali");
		formData = new FormData();
		formData.top = new FormAttachment(groupTitolo, PartDefaults.H_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		groupInfoGenerali.setLayout(new FormLayout());
		groupInfoGenerali.setLayoutData(formData);

		// direttore
		lblDirettore = new Label(groupInfoGenerali, SWT.NONE);
		lblDirettore.setText("Direttore:       ");
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		lblDirettore.setLayoutData(formData);

		direttore = new Text(groupInfoGenerali, SWT.NONE);
		direttore.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblDirettore, PartDefaults.H_LABEL2CONTROL_OFFSET);
		// formData.right = new FormAttachment(PartDefaults.MARGIN, SWT.RIGHT);
		formData.width = 200;
		direttore.setLayoutData(formData);

		// vicedirettore
		lblViceDirettore = new Label(groupInfoGenerali, SWT.NONE);
		lblViceDirettore.setText("Vicedirettore: ");
		formData = new FormData();
		formData.top = new FormAttachment(direttore, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		lblViceDirettore.setLayoutData(formData);

		viceDirettore = new Text(groupInfoGenerali, SWT.NONE);
		viceDirettore.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(direttore, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblDirettore, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 200;
		viceDirettore.setLayoutData(formData);

		// segretario
		lblSegretario = new Label(groupInfoGenerali, SWT.NONE);
		lblSegretario.setText("Segretario: ");
		formData = new FormData();
		formData.top = new FormAttachment(viceDirettore, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		lblSegretario.setLayoutData(formData);

		segretario = new Text(groupInfoGenerali, SWT.NONE);
		segretario.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(viceDirettore, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblDirettore, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 200;

		segretario.setLayoutData(formData);

		// caparra
		Label lblcaparra = new Label(groupInfoGenerali, SWT.NONE);
		lblcaparra.setText("Caparra:");
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 85;
		lblcaparra.setLayoutData(formData);

		caparra = new Text(groupInfoGenerali, SWT.NONE);
		caparra.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblcaparra, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 100;
		caparra.setLayoutData(formData);

		// quota partecipazione
		Label lblquotaPartecipazione = new Label(groupInfoGenerali, SWT.NONE);
		lblquotaPartecipazione.setText("Quota: ");
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(caparra, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 85;
		lblquotaPartecipazione.setLayoutData(formData);

		quotaPartecipazione = new Text(groupInfoGenerali, SWT.NONE);
		quotaPartecipazione.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(segretario, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblquotaPartecipazione, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 100;
		quotaPartecipazione.setLayoutData(formData);

		// data inizio
		lblDataInizio = new Label(groupInfoGenerali, SWT.NONE);
		lblDataInizio.setText("Data inizio:");
		formData = new FormData();
		formData.top = new FormAttachment(quotaPartecipazione, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 85;
		lblDataInizio.setLayoutData(formData);

		dataInizio = new Text(groupInfoGenerali, SWT.NONE);
		dataInizio.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(quotaPartecipazione, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblDataInizio, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 100;
		dataInizio.setLayoutData(formData);

		// data fine
		lblDataFine = new Label(groupInfoGenerali, SWT.NONE);
		lblDataFine.setText("Data fine:");
		formData = new FormData();
		formData.top = new FormAttachment(quotaPartecipazione, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(dataInizio, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 85;
		lblDataFine.setLayoutData(formData);

		dataFine = new Text(groupInfoGenerali, SWT.NONE);
		dataFine.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(quotaPartecipazione, PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblDataFine, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = 100;
		dataFine.setLayoutData(formData);

		groupDescrizione = new Group(container, SWT.NONE);
		groupDescrizione.setText("Note corso");
		formData = new FormData();
		formData.top = new FormAttachment(groupInfoGenerali, PartDefaults.H_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		groupDescrizione.setLayout(new FormLayout());
		groupDescrizione.setLayoutData(formData);

		corsoIscrizione = new StyledText(groupDescrizione,
				SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
		corsoIscrizione.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = 100;
		corsoIscrizione.setLayoutData(formData);

		groupEqipaggaimento = new Group(container, SWT.NONE);
		groupEqipaggaimento.setText("Equipaggiamento");
		formData = new FormData();
		formData.top = new FormAttachment(groupDescrizione, PartDefaults.H_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		groupEqipaggaimento.setLayout(new FormLayout());
		groupEqipaggaimento.setLayoutData(formData);

		corsoEquipaggiamento = new StyledText(groupEqipaggaimento,
				SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
		corsoEquipaggiamento.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 400;
		formData.height = 100;
		corsoEquipaggiamento.setLayoutData(formData);

		bindToModel();

		// Composite

		// scrolledComposite.setContent(container);

	}

	private DataBindingContext bindToModel() {
		DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();
		// // immagine corso
		ISWTObservableValue immagineCorsoObservable = SWTObservables.observeImage(imageCorso);
		UpdateValueStrategy modelToTargetImmagineCorso = new ConverterUpdateValueStrategy(new Corso2ImageConverter());
		bindingContext.bindValue(immagineCorsoObservable, corsoObservable, null, modelToTargetImmagineCorso);

		// nome corso
		ISWTObservableValue nomeCorsoTextObservable = WidgetProperties.text(SWT.Modify).observe(nomeCorso);
		UpdateValueStrategy modelToTargetNomeCorso = new ConverterUpdateValueStrategy(
				new DizCatalogoCorsi2StringConverter());
		bindingContext.bindValue(nomeCorsoTextObservable, corsoObservable, null, modelToTargetNomeCorso);

		// direttore
		IObservableValue<Istruttore> direttoreObservable = EMFProperties.value(ModelPackage.Literals.CORSO__DIRETTORE)
				.observeDetail(corsoObservable);
		ISWTObservableValue direttoreTextObservable = WidgetProperties.text(SWT.Modify).observe(direttore);
		UpdateValueStrategy modelToTargetDirettore = new ConverterUpdateValueStrategy(
				new PersonaNomeCognome2StringConverter());
		bindingContext.bindValue(direttoreTextObservable, direttoreObservable, null, modelToTargetDirettore);

		// vicedirettore
		IObservableValue<Istruttore> viceDirettoreObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__VICEDIRETTORE).observeDetail(corsoObservable);
		ISWTObservableValue viceDirettoreTextObservable = WidgetProperties.text(SWT.Modify).observe(viceDirettore);
		UpdateValueStrategy modelToTargetViceDirettore = new ConverterUpdateValueStrategy(
				new PersonaNomeCognome2StringConverter());
		bindingContext.bindValue(viceDirettoreTextObservable, viceDirettoreObservable, null,
				modelToTargetViceDirettore);

		// segretario
		IObservableValue<Persona> segretarioObservable = EMFProperties.value(ModelPackage.Literals.CORSO__SEGRETARIO)
				.observeDetail(corsoObservable);
		ISWTObservableValue segretarioTextObservable = WidgetProperties.text(SWT.Modify).observe(segretario);
		UpdateValueStrategy modelToTargetSegretario = new ConverterUpdateValueStrategy(
				new PersonaNomeCognome2StringConverter());
		bindingContext.bindValue(segretarioTextObservable, segretarioObservable, null, modelToTargetSegretario);

		// caparra
		IObservableValue<Float> caparraObservable = EMFProperties.value(ModelPackage.Literals.CORSO__QUOTA_CAPARRA)
				.observeDetail(corsoObservable);
		ISWTObservableValue caparraTextObservable = WidgetProperties.text(SWT.Modify).observe(caparra);
		UpdateValueStrategy modelToTargetCaparra = new ConverterUpdateValueStrategy(new Soldi2StringConverter());
		bindingContext.bindValue(caparraTextObservable, caparraObservable, null, modelToTargetCaparra);

		// quota partecipazione
		IObservableValue<Float> quotaPartecipazioneObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__QUOTA_ISCRIZIONE).observeDetail(corsoObservable);
		ISWTObservableValue quotaPartecipazioneTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(quotaPartecipazione);
		UpdateValueStrategy modelToTargetquotaPartecipazione = new ConverterUpdateValueStrategy(
				new Soldi2StringConverter());
		bindingContext.bindValue(quotaPartecipazioneTextObservable, quotaPartecipazioneObservable, null,
				modelToTargetquotaPartecipazione);

		// data inizio
		IObservableValue<Date> dataInzioObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__DATA_INIZIO)).observeDetail(corsoObservable);
		ISWTObservableValue dataInizioDateTimeObservable = WidgetProperties.text(SWT.Modify).observe(dataInizio);
		UpdateValueStrategy modelToTargetData = new ConverterUpdateValueStrategy(new Date2StringConverter());
		bindingContext.bindValue(dataInizioDateTimeObservable, dataInzioObservable, null, modelToTargetData);

		// data fine
		IObservableValue<Date> dataFineObservable = EMFProperties
				.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__DATA_FINE)).observeDetail(corsoObservable);
		ISWTObservableValue dataFineDateTimeObservable = WidgetProperties.text(SWT.Modify).observe(dataFine);
		bindingContext.bindValue(dataFineDateTimeObservable, dataFineObservable, null, modelToTargetData);

		// corsoIscrizione
		IObservableValue<String> corsoIscrizioneObservable = EMFProperties.value(ModelPackage.Literals.CORSO__TESTO)
				.observeDetail(corsoObservable);
		ISWTObservableValue descrizioneTextObservable = WidgetProperties.text(SWT.Modify).observe(corsoIscrizione);
		bindingContext.bindValue(descrizioneTextObservable, corsoIscrizioneObservable);

		// corsoEquipaggiamento
		IObservableValue<String> corsoEquipaggiamentoObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__EQUIPAGGIAMENTO).observeDetail(corsoObservable);
		ISWTObservableValue equipaggiamentoTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(corsoEquipaggiamento);
		bindingContext.bindValue(equipaggiamentoTextObservable, corsoEquipaggiamentoObservable);

		return bindingContext;

	}

	@PreDestroy
	public void dispose() {
		imageCorso.dispose();
	}

}