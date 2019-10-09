
package it.caicividale.corsicai.ui.parts;

import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.ui.databinding.converters.Corso2NumeroAllieviStringConverter;
import it.caicividale.corsicai.ui.databinding.converters.Integer2StringConverter;
import it.caicividale.corsicai.ui.parts.tableviewer.filters.ElencoIscrizioniFilter;
import it.caicividale.corsicai.ui.parts.tableviewer.filters.ElencoIscrizioniKoFilter;
import it.caicividale.corsicai.ui.parts.tableviewer.filters.ElencoIscrizioniOkFilter;
import it.caicividale.corsicai.ui.parts.tableviewer.labelproviders.ElencoIscrizioniLabelProvider;
import it.caicividale.corsicai.ui.parts.tableviewer.labelproviders.RiepilogoMaterialeNoleggiatoLabelProvider;
import it.caicividale.corsicai.ui.parts.tableviewer.sorters.EObjectTableColumnSorter;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.updatevaluestrategy.ConverterUpdateValueStrategy;

public class ElencoIscrizioniPart implements IMyPart {

	@Inject
	IStylingEngine stylingEngine;

	@Inject
	private EHandlerService handlerService;

	@Inject
	private ECommandService commandService;

	private final ModelManager modelManager = ModelManager.getInstance();

	// icrizioni
	private Group groupIscrizioni;
	private TableViewer tableViewerElencoIscrizioni;
	private Table tableElencoIscrizioni;

	// filtri
	private ElencoIscrizioniFilter elencoIscrizioniFilter = new ElencoIscrizioniFilter();
	private final ElencoIscrizioniKoFilter elencoIscrizioniKoFilter = new ElencoIscrizioniKoFilter();
	private final ElencoIscrizioniOkFilter elencoIscrizioniOkFilter = new ElencoIscrizioniOkFilter();

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
	private Group groupRiepilogoRiepilogo;
	private Group groupRiepilogoNoleggio;
	private Label lblNumeroAllieviConNoleggio;
	private Text numeroAllieviConNoleggio;
	private TableViewer tableViewerRiepilogoNoleggio;
	private Table tableRiepilogoNoleggio;

	@SuppressWarnings("unchecked")
	public DataBindingContext bindToModel(TableViewer tableViewerElencoIscrizioni) {

		DataBindingContext bindingContext = new DataBindingContext();
		tableViewerElencoIscrizioni.setLabelProvider(new ElencoIscrizioniLabelProvider(tableViewerElencoIscrizioni));

		// Content e label provider iscrizioni
		ObservableListContentProvider listContentProviderIscrizione = new ObservableListContentProvider();
		tableViewerElencoIscrizioni.setContentProvider(listContentProviderIscrizione);
		tableViewerElencoIscrizioni.setFilters(elencoIscrizioniFilter, elencoIscrizioniOkFilter,
				elencoIscrizioniKoFilter);

		// Binding iscrizioni
		IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();
		IObservableList<Iscrizione> iscrizioniObservableList = EMFProperties
				.list(ModelPackage.Literals.CORSO__ISCRIZIONI).observeDetail(corsoObservable);
		tableViewerElencoIscrizioni.setInput(iscrizioniObservableList);

		IObservableValue<Iscrizione> iscrizioneObservable = modelManager.getIscrizioneObservable();
		IViewerObservableValue targetObservable = ViewersObservables
				.observeSingleSelection(tableViewerElencoIscrizioni);
		bindingContext.bindValue(targetObservable, iscrizioneObservable);

		tableViewerElencoIscrizioni.addDoubleClickListener(new IDoubleClickListener() {
			@SuppressWarnings("restriction")
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ParameterizedCommand command = commandService
						.createCommand("it.caicividale.corsicai.ui.command.modificaiscrizione", Collections.emptyMap());

				handlerService.executeHandler(command);
			}

		});

		// riepilogo dati
		tableViewerRiepilogoNoleggio
				.setLabelProvider(new RiepilogoMaterialeNoleggiatoLabelProvider(tableViewerRiepilogoNoleggio));
		// Content e label provider
		ObservableListContentProvider listContentProviderNoleggio = new ObservableListContentProvider();
		tableViewerRiepilogoNoleggio.setContentProvider(listContentProviderNoleggio);
		// tableViewerRiepilogoNoleggio.setInput(modelManager.getNoleggioObservableList());

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
		groupIscrizioni = new Group(container, SWT.NONE);
		groupIscrizioni.setText("Iscrizioni");
		groupIscrizioni.setLayout(new FormLayout());
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		groupIscrizioni.setLayoutData(formData);

		// filtro testo
		formData = new FormData();
		Label lblFilter = new Label(groupIscrizioni, SWT.NONE);
		lblFilter.setText("Filtro nome/cognome:");
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		formData.width = 180;
		formData.height = PartDefaults.H_LABEL;
		lblFilter.setLayoutData(formData);

		Text filter = new Text(groupIscrizioni, SWT.BORDER);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(lblFilter, PartDefaults.V_LABEL2CONTROL_OFFSET);
		formData.width = 200;
		filter.setLayoutData(formData);
		filter.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				elencoIscrizioniFilter.setSearchText(filter.getText());
				refresh();
			}

		});

		// tabella iscrizioni
		tableViewerElencoIscrizioni = new TableViewer(groupIscrizioni, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerElencoIscrizioni.setColumnProperties(new String[] {});
		tableElencoIscrizioni = tableViewerElencoIscrizioni.getTable();

		tableElencoIscrizioni.setLinesVisible(true);
		tableElencoIscrizioni.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		tableElencoIscrizioni.setHeaderVisible(true);
		tableElencoIscrizioni.setLocation(0, 0);
		formData = new FormData();
		formData.top = new FormAttachment(filter, PartDefaults.V_CONTROL2CONTROL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
		formData.height = 400;

		tableElencoIscrizioni.setLayoutData(formData);
		creaTableIscrizioni();

		// dati di riepilogo
		formData = new FormData();
		groupRiepilogoRiepilogo = new Group(container, SWT.NONE);
		groupRiepilogoRiepilogo.setText("Riepilogo");
		groupRiepilogoRiepilogo.setLayout(new FormLayout());
		formData.top = new FormAttachment(groupIscrizioni, PartDefaults.H_LABEL2LABEL_OFFSET);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		groupRiepilogoRiepilogo.setLayoutData(formData);

		int widgetLenght = 100;
		int labelLenght = 270;

		formData = new FormData();
		groupRiepilogoAllievi = new Group(groupRiepilogoRiepilogo, SWT.NONE);
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
		groupRiepilogoNoleggio = new Group(groupRiepilogoRiepilogo, SWT.NONE);
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

		bindToModel(tableViewerElencoIscrizioni);

	}

	private void creaTableIscrizioni() {
		EObjectTableColumnSorter tableColumnSorter = new EObjectTableColumnSorter(tableViewerElencoIscrizioni);

		final TableViewerColumn tableViewerColumnIscrizioneOk = new TableViewerColumn(tableViewerElencoIscrizioni,
				SWT.CENTER);
		TableColumn tblclmnIscrizioneOk = tableViewerColumnIscrizioneOk.getColumn();
		// tblclmnIscrizioneOk.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/documents_folder32x32.png"));
		tblclmnIscrizioneOk.setWidth(87);
		tblclmnIscrizioneOk.setText("ISCR.");
		tblclmnIscrizioneOk.setToolTipText("Stato dell'iscrizione");
		tableColumnSorter.addColumn(tblclmnIscrizioneOk, ModelPackage.Literals.ISCRIZIONE__IS_ISCRIZIONE_OK);

		final TableViewerColumn tableViewerColumnAllievo = new TableViewerColumn(tableViewerElencoIscrizioni, SWT.NONE);
		TableColumn tblclmnAllievo = tableViewerColumnAllievo.getColumn();
		tblclmnAllievo.setWidth(250);
		// tblclmnAllievo.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/user32x32.png"));
		tblclmnAllievo.setText("ALLIEVO");
		tblclmnAllievo.setToolTipText("Cognome, nome e età dell'allievo\\a");
		tableColumnSorter.addColumn(tblclmnAllievo, ModelPackage.Literals.PERSONA__COGNOME);

		final TableViewerColumn tableViewerColumnModuloIscrizione = new TableViewerColumn(tableViewerElencoIscrizioni,
				SWT.NONE);
		TableColumn tblclmnModulo = tableViewerColumnModuloIscrizione.getColumn();
		tblclmnModulo.setWidth(100);
		// tblclmnModulo.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/file_doc32x32.png"));
		tblclmnModulo.setText("MOD. ISCR.");
		tblclmnModulo.setToolTipText("Modulo iscrizione presente");
		tableColumnSorter.addColumn(tblclmnModulo, ModelPackage.Literals.ISCRIZIONE__IS_MODULO_ISCRIZIONE);

		final TableViewerColumn tableViewerColumnConsenso = new TableViewerColumn(tableViewerElencoIscrizioni,
				SWT.NONE);
		TableColumn tblclmnConsenso = tableViewerColumnConsenso.getColumn();
		tblclmnConsenso.setWidth(100);
		// tblclmnConsenso.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/encrypted32x32.png"));
		tblclmnConsenso.setText("CONSENSO");
		tblclmnConsenso.setToolTipText("Consenso Informato presente");
		tableColumnSorter.addColumn(tblclmnConsenso, ModelPackage.Literals.ISCRIZIONE__IS_CONSENSO_INFORMATO);

		final TableViewerColumn tableViewerColumnBollino = new TableViewerColumn(tableViewerElencoIscrizioni, SWT.NONE);
		TableColumn tblclmnBollino = tableViewerColumnBollino.getColumn();
		tblclmnBollino.setWidth(100);
		// tblclmnBollino.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/Cai32x32.png"));
		tblclmnBollino.setText("BOLLINO");
		tblclmnBollino.setToolTipText("Bollino per l'anno in corso presente");
		tableColumnSorter.addColumn(tblclmnBollino, ModelPackage.Literals.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO);

		final TableViewerColumn tableViewerColumnDatScadenzaCertificato = new TableViewerColumn(
				tableViewerElencoIscrizioni, SWT.NONE);
		TableColumn tblclmnDatScadenzaCertificato = tableViewerColumnDatScadenzaCertificato.getColumn();
		tblclmnDatScadenzaCertificato.setWidth(100);
		// tblclmnDatScadenzaCertificato.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/config_date32x32.png"));
		tblclmnDatScadenzaCertificato.setText("CERT. MED.");
		tblclmnDatScadenzaCertificato.setToolTipText("certificato medico e data scadenze certficato medico");
		tableColumnSorter.addColumn(tblclmnDatScadenzaCertificato,
				ModelPackage.Literals.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK);

		final TableViewerColumn tableViewerColumnTotale = new TableViewerColumn(tableViewerElencoIscrizioni, SWT.NONE);
		TableColumn tblclmnTotale = tableViewerColumnTotale.getColumn();
		tblclmnTotale.setWidth(100);
		// tblclmnTotale.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/euro32x32.png"));
		tblclmnTotale.setText("QUOTA");
		tblclmnTotale.setToolTipText("Quota iscrizione e noleggio versati");
		tableColumnSorter.addColumn(tblclmnTotale, ModelPackage.Literals.ISCRIZIONE__TOTALE_VERSATO);

		final TableViewerColumn tableViewerColumnIsNoleggio = new TableViewerColumn(tableViewerElencoIscrizioni,
				SWT.NONE);
		TableColumn tblclmnIsNoleggio = tableViewerColumnIsNoleggio.getColumn();
		tblclmnIsNoleggio.setWidth(100);
		// tblclmnIsNoleggio.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/tools32x32.png"));
		tblclmnIsNoleggio.setText("NOLEGGIO");
		tblclmnIsNoleggio.setToolTipText("Noleggio attrezzatura presente");
		tableColumnSorter.addColumn(tblclmnIsNoleggio, ModelPackage.Literals.ISCRIZIONE__IS_NOLEGGIO);

		final TableViewerColumn tableViewerColumnNote = new TableViewerColumn(tableViewerElencoIscrizioni, SWT.NONE);
		TableColumn tblclmnNote = tableViewerColumnNote.getColumn();
		tblclmnNote.setWidth(300);
		// tblclmnNote.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui",
		// "icons/notes32x32.png"));
		tblclmnNote.setText("NOTE");
		tblclmnNote.setToolTipText("Note");
		tableColumnSorter.addColumn(tblclmnNote, ModelPackage.Literals.ISCRIZIONE__NOTE);
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
		tableViewerElencoIscrizioni.getControl().setFocus();

	}

	@Override
	public void refresh() {
		tableViewerElencoIscrizioni.refresh();

	}

	public ElencoIscrizioniKoFilter getElencoIscrizioniKoFilter() {
		return elencoIscrizioniKoFilter;
	}

	public ElencoIscrizioniOkFilter getElencoIscrizioniOkFilter() {
		return elencoIscrizioniOkFilter;
	}

}