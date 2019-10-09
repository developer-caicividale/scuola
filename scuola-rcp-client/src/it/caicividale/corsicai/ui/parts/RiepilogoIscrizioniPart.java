
package it.caicividale.corsicai.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.ui.databinding.converters.Corso2NumeroAllieviStringConverter;
import it.caicividale.corsicai.ui.databinding.converters.Integer2StringConverter;
import it.caicividale.corsicai.ui.parts.tableviewer.labelproviders.RiepilogoMaterialeNoleggiatoLabelProvider;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.updatevaluestrategy.ConverterUpdateValueStrategy;

public class RiepilogoIscrizioniPart implements IMyPart {

	@Inject
	IStylingEngine stylingEngine;

	private final ModelManager modelManager = ModelManager.getInstance();

	// riepilogo allievi
	private Group groupRiepilogoAllievi;
	private Label lblNumeroAllievi;
	private Text numeroAllievi;
	private Label lblNumeroAllieviIscrizioneOk;
	private Text numeroAllieviIscrizioneOk;
	private Label lblNumeroAllieviIscrizioneKo;
	private Text numeroAllieviIscrizioneKo;
	private Label lblNumeroAllieviMaschi;
	private Text numeroAllieviMaschi;
	private Label lblNumeroAllieviFemmine;
	private Text numeroAllieviFemmine;
	private Label lblNumeroNuoviAllievi;
	private Text numeroNuoviAllievi;

	// riepilogo noleggio
	private Group groupRiepilogoNoleggio;
	private Label lblNumeroAllieviConNoleggio;
	private Text numeroAllieviConNoleggio;
	private TableViewer tableViewerRiepilogoNoleggio;
	private Table tableRiepilogoNoleggio;

	@SuppressWarnings("unchecked")
	public DataBindingContext bindToModel(TableViewer tableViewerElencoIscrizioni) {

		DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();

		tableViewerRiepilogoNoleggio
				.setLabelProvider(new RiepilogoMaterialeNoleggiatoLabelProvider(tableViewerRiepilogoNoleggio));
		// Content e label provider
		ObservableListContentProvider listContentProviderNoleggio = new ObservableListContentProvider();
		tableViewerElencoIscrizioni.setContentProvider(listContentProviderNoleggio);
		// tableViewerElencoIscrizioni.setInput(modelManager.getNoleggioObservableList());

		UpdateValueStrategy modelToTargetNumeroAllievi2 = new ConverterUpdateValueStrategy(
				new Corso2NumeroAllieviStringConverter());

		UpdateValueStrategy modelToTargetNumeroAllievi = new ConverterUpdateValueStrategy(
				new Integer2StringConverter());
		UpdateValueStrategy target2modelTextSoloLettera = new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER);

		ISWTObservableValue numeroAllieviTextObservable = WidgetProperties.text(SWT.Modify).observe(numeroAllievi);
		bindingContext.bindValue(numeroAllieviTextObservable, corsoObservable, target2modelTextSoloLettera,
				modelToTargetNumeroAllievi2);

		IObservableValue<Integer> numeroAllieviOkObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviOkTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroAllieviIscrizioneOk);
		bindingContext.bindValue(numeroAllieviOkTextObservable, numeroAllieviOkObservable, target2modelTextSoloLettera,
				modelToTargetNumeroAllievi);

		IObservableValue<Integer> numeroAllieviKoObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviKoTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroAllieviIscrizioneKo);
		bindingContext.bindValue(numeroAllieviKoTextObservable, numeroAllieviKoObservable, target2modelTextSoloLettera,
				modelToTargetNumeroAllievi);

		IObservableValue<Integer> numeroAllieviMaschiObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_MASCHI).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviMaschiTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroAllieviMaschi);
		bindingContext.bindValue(numeroAllieviMaschiTextObservable, numeroAllieviMaschiObservable,
				target2modelTextSoloLettera, modelToTargetNumeroAllievi);

		IObservableValue<Integer> numeroAllieviFemmineObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_FEMMINE).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviFemmineTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroAllieviFemmine);
		bindingContext.bindValue(numeroAllieviFemmineTextObservable, numeroAllieviFemmineObservable,
				target2modelTextSoloLettera, modelToTargetNumeroAllievi);

		IObservableValue<Integer> numeroAllieviNuoviIscrittiObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviNuoviIscrittiTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroNuoviAllievi);
		bindingContext.bindValue(numeroAllieviNuoviIscrittiTextObservable, numeroAllieviNuoviIscrittiObservable,
				target2modelTextSoloLettera, modelToTargetNumeroAllievi);

		IObservableValue<Integer> numeroAllieviNoleggioObservable = EMFProperties
				.value(ModelPackage.Literals.CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO).observeDetail(corsoObservable);
		ISWTObservableValue numeroAllieviNoleggioTextObservable = WidgetProperties.text(SWT.Modify)
				.observe(numeroAllieviConNoleggio);
		bindingContext.bindValue(numeroAllieviNoleggioTextObservable, numeroAllieviNoleggioObservable,
				target2modelTextSoloLettera, modelToTargetNumeroAllievi);

		return bindingContext;
	}

	@PostConstruct
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		// container.setBounds(0, 0, 886, 465);
		FormLayout layout = new FormLayout();
		container.setLayout(layout);

		FormData formData = new FormData();

		// riepilogo allievi
		int widgetLenght = 100;
		int labelLenght = 270;

		formData = new FormData();
		groupRiepilogoAllievi = new Group(container, SWT.NONE);
		groupRiepilogoAllievi.setText("Riepilogo numero allievi");
		groupRiepilogoAllievi.setLayout(new FormLayout());
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		groupRiepilogoAllievi.setLayoutData(formData);

		// numero allievi
		lblNumeroAllievi = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroAllievi.setText("Numero totale allievi iscritti:");
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllievi.setLayoutData(formData);

		numeroAllievi = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroAllievi.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblNumeroAllievi, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllievi.setLayoutData(formData);

		// numero allievi ok
		lblNumeroAllieviIscrizioneOk = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroAllieviIscrizioneOk.setText("Numero allievi iscrizione Ok:  ");
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllievi, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllieviIscrizioneOk.setLayoutData(formData);

		numeroAllieviIscrizioneOk = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroAllieviIscrizioneOk.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllievi, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(lblNumeroAllieviIscrizioneOk, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllieviIscrizioneOk.setLayoutData(formData);

		// numero allievi ko
		lblNumeroAllieviIscrizioneKo = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroAllieviIscrizioneKo.setText("Numero allievi iscrizione incompleta:  ");
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviIscrizioneOk, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllieviIscrizioneKo.setLayoutData(formData);

		numeroAllieviIscrizioneKo = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroAllieviIscrizioneKo.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviIscrizioneOk, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(lblNumeroAllieviIscrizioneKo, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllieviIscrizioneKo.setLayoutData(formData);

		// numero allievi maschi
		lblNumeroAllieviMaschi = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroAllieviMaschi.setText("Numero allievi maschi:              ");
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviIscrizioneKo, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllieviMaschi.setLayoutData(formData);

		numeroAllieviMaschi = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroAllieviMaschi.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviIscrizioneKo, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(lblNumeroAllieviMaschi, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllieviMaschi.setLayoutData(formData);

		// numero allievi femmine
		lblNumeroAllieviFemmine = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroAllieviFemmine.setText("Numero allieve femmine:         ");
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviMaschi, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllieviFemmine.setLayoutData(formData);

		numeroAllieviFemmine = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroAllieviFemmine.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviMaschi, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(lblNumeroAllieviFemmine, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllieviFemmine.setLayoutData(formData);

		// numero allievi femmine
		lblNumeroNuoviAllievi = new Label(groupRiepilogoAllievi, SWT.NONE);
		lblNumeroNuoviAllievi.setText("Numero nuovi allievi  :         ");
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviFemmine, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroNuoviAllievi.setLayoutData(formData);

		numeroNuoviAllievi = new Text(groupRiepilogoAllievi, SWT.NONE);
		numeroNuoviAllievi.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviFemmine, PartDefaults.V_LABEL2LABEL_OFFSET * 2);
		formData.left = new FormAttachment(lblNumeroNuoviAllievi, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroNuoviAllievi.setLayoutData(formData);

		// riepilogo noleggio
		formData = new FormData();
		groupRiepilogoNoleggio = new Group(container, SWT.NONE);
		groupRiepilogoNoleggio.setText("Riepilogo noleggio");
		groupRiepilogoNoleggio.setLayout(new FormLayout());
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(groupRiepilogoAllievi, PartDefaults.MARGIN_GROUP);
		groupRiepilogoNoleggio.setLayoutData(formData);

		// numero allievi con noleggio
		lblNumeroAllieviConNoleggio = new Label(groupRiepilogoNoleggio, SWT.NONE);
		lblNumeroAllieviConNoleggio.setText("Numero allievi con noleggio:");
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = labelLenght;
		lblNumeroAllieviConNoleggio.setLayoutData(formData);

		numeroAllieviConNoleggio = new Text(groupRiepilogoNoleggio, SWT.NONE);
		numeroAllieviConNoleggio.setEditable(false);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.V_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(lblNumeroAllieviConNoleggio, PartDefaults.H_LABEL2CONTROL_OFFSET);
		formData.width = widgetLenght;
		numeroAllieviConNoleggio.setLayoutData(formData);

		tableViewerRiepilogoNoleggio = new TableViewer(groupRiepilogoNoleggio, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerRiepilogoNoleggio.setColumnProperties(new String[] {});
		tableRiepilogoNoleggio = tableViewerRiepilogoNoleggio.getTable();

		tableRiepilogoNoleggio.setLinesVisible(true);
		tableRiepilogoNoleggio.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		tableRiepilogoNoleggio.setHeaderVisible(true);
		// tableRiepilogoNoleggio.setLocation(0, 0);
		formData = new FormData();
		formData.top = new FormAttachment(lblNumeroAllieviConNoleggio, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
		formData.height = 100;

		tableRiepilogoNoleggio.setLayoutData(formData);
		creaTabletableRiepilogoNoleggio();

		bindToModel(tableViewerRiepilogoNoleggio);

	}

	private void creaTabletableRiepilogoNoleggio() {

		final TableViewerColumn tableViewerColumnMaterialeNoleggiato = new TableViewerColumn(
				tableViewerRiepilogoNoleggio, SWT.CENTER);
		TableColumn tblclmntableViewerColumnMaterialeNoleggiato = tableViewerColumnMaterialeNoleggiato.getColumn();
		tblclmntableViewerColumnMaterialeNoleggiato.setWidth(87);
		tblclmntableViewerColumnMaterialeNoleggiato.setText("MATERIALE");
		tblclmntableViewerColumnMaterialeNoleggiato.setToolTipText("MaterialeNoleggiato");

		final TableViewerColumn tableViewerColumnNumeroMaterialeNoleggiato = new TableViewerColumn(
				tableViewerRiepilogoNoleggio, SWT.NONE);
		TableColumn tblclmnAllievo = tableViewerColumnNumeroMaterialeNoleggiato.getColumn();
		tblclmnAllievo.setWidth(250);
		tblclmnAllievo.setText("NUMERO");
		tblclmnAllievo.setToolTipText("Numero di elementi noleggiati");

	}

	@Focus
	public void setFocus() {
		tableViewerRiepilogoNoleggio.getControl().setFocus();

	}

	@Override
	public void refresh() {
		tableViewerRiepilogoNoleggio.refresh();
	}

}