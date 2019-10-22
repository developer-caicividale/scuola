
package it.caicividale.scuola.ui.parts;

import java.util.Collections;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.ModelManager;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.RipartizioneCassa;
import it.caicividale.scuola.emf.model.VoceDiSpesa;
import it.caicividale.scuola.ui.databinding.converters.Soldi2StringConverter;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.BilancioUsciteLabelProvider;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.CasseLabelProvider;
import it.caicividale.scuola.ui.updatevaluestrategy.ConverterUpdateValueStrategy;

public class BilancioPart implements IMyPart {

    @Inject
    IStylingEngine stylingEngine;

    @Inject
    private EHandlerService handlerService;

    @Inject
    private ECommandService commandService;

    // private TableViewer tableViewerEntrate;
    // private Table tableEntrate;
    private Text entrate;
    private Text uscite;
    private Text avanzo;
    private Text totaleCasse;
    private Text differenzaCasseAvanzo;

    private TableViewer tableViewerUscite;
    private Table tableUscite;

    private TableViewer tableViewerCasse;
    private Table tablecasse;

    private Group groupBilancio;
    private Group groupUscite;
    private Group groupCasse;

    private final ModelManager modelManager = ModelManager.getInstance();
    private final IObservableValue<VoceDiSpesa> voceDiSpesaItemsObservable = WritableValue
	    .withValueType(VoceDiSpesa.class);
    private final IObservableValue<RipartizioneCassa> ripartizioneCassaItemsObservable = WritableValue
	    .withValueType(RipartizioneCassa.class);

    @SuppressWarnings("restriction")
    @PostConstruct
    public void postConstruct(Composite parent) {
	Composite container = new Composite(parent, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	FormData formData = new FormData();

	groupBilancio = new Group(container, SWT.NONE);
	groupBilancio.setText("Bilancio");
	groupBilancio.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupBilancio.setLayoutData(formData);

	Label lblEntrate = new Label(groupBilancio, SWT.NONE);
	lblEntrate.setText("Totale entrate:");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_DATA);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	lblEntrate.setLayoutData(formData);

	entrate = new Text(groupBilancio, SWT.NONE);
	entrate.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_DATA);
	formData.left = new FormAttachment(lblEntrate, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 150;
	stylingEngine.setId(entrate, "CSSTextMediumBold");
	entrate.setLayoutData(formData);

	Label lblUscite = new Label(groupBilancio, SWT.NONE);
	lblUscite.setText("Totale uscite:");
	formData = new FormData();
	formData.top = new FormAttachment(entrate, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	lblUscite.setLayoutData(formData);

	uscite = new Text(groupBilancio, SWT.NONE);
	uscite.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(entrate, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(lblUscite, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 150;
	stylingEngine.setId(uscite, "CSSTextMediumBold");
	uscite.setLayoutData(formData);

	Label lblAvanzo = new Label(groupBilancio, SWT.NONE);
	lblAvanzo.setText("Avanzo corso:");
	formData = new FormData();
	formData.top = new FormAttachment(uscite, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	lblAvanzo.setLayoutData(formData);

	avanzo = new Text(groupBilancio, SWT.NONE);
	avanzo.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(uscite, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(lblAvanzo, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 150;
	stylingEngine.setId(avanzo, "CSSTextMediumBold");
	avanzo.setLayoutData(formData);

	createBilancioUscite(container);
	createBilancioCasse(container);

	bindToModel();
    }

    private void createBilancioCasse(Composite container) {
	// casse
	FormData formData = new FormData();
	groupCasse = new Group(container, SWT.NONE);
	groupCasse.setText("Gestione cassa");
	groupCasse.setLayout(new FormLayout());
	formData.top = new FormAttachment(groupBilancio, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupCasse.setLayoutData(formData);

	tableViewerCasse = new TableViewer(groupCasse, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerCasse.setColumnProperties(new String[] {});
	tablecasse = tableViewerCasse.getTable();
	tablecasse.setLinesVisible(true);
	tablecasse.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tablecasse.setHeaderVisible(true);
	tablecasse.setLocation(0, 0);
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
	formData.height = 100;
	tablecasse.setLayoutData(formData);

	int h1 = 150;
	int h2 = 150;

	ToolBar toolBar = new ToolBar(groupCasse, SWT.FLAT | SWT.RIGHT);
	formData = new FormData();
	formData.bottom = new FormAttachment(PartDefaults.MARGIN);
	formData.right = new FormAttachment(tableUscite, h1 + h2);
	toolBar.setLayoutData(formData);

	ToolItem tltmNuovaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmNuovaUscitaBilancio.setToolTipText("Nuova cassa");
	tltmNuovaUscitaBilancio.setImage(
		ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/cassaforte_add24x24.png"));

	ToolItem tltmModificaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmModificaUscitaBilancio.setImage(
		ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/cassaforte_modifica24x24.png"));
	tltmModificaUscitaBilancio.setToolTipText("Modifica cassa");

	ToolItem tltmCancellaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmCancellaUscitaBilancio.setImage(
		ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/cassaforte_remove24x24.png"));
	tltmCancellaUscitaBilancio.setToolTipText("Cancella uscita");

	final TableViewerColumn tableViewerColumnVoce = new TableViewerColumn(tableViewerCasse, SWT.CENTER);
	TableColumn tblclmnVoce = tableViewerColumnVoce.getColumn();
	tblclmnVoce.setAlignment(SWT.LEFT);
	tblclmnVoce.setWidth(h1);
	tblclmnVoce.setText("Sede");
	tblclmnVoce.setToolTipText("Sede della cassa");

	final TableViewerColumn tableViewerColumnImporto = new TableViewerColumn(tableViewerCasse, SWT.CENTER);
	TableColumn tblclmnImporto = tableViewerColumnImporto.getColumn();
	tblclmnImporto.setAlignment(SWT.LEFT);
	tblclmnImporto.setWidth(h2);
	tblclmnImporto.setText("Quota");
	tblclmnImporto.setToolTipText("Quota depositata nella cassa");

	Label lbltotaleCasse = new Label(groupCasse, SWT.NONE);
	lbltotaleCasse.setText("Totale casse:");
	formData = new FormData();
	formData.top = new FormAttachment(tablecasse, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	lbltotaleCasse.setLayoutData(formData);

	totaleCasse = new Text(groupCasse, SWT.NONE);
	totaleCasse.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(tablecasse, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(lbltotaleCasse, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 150;
	stylingEngine.setId(avanzo, "CSSTextMediumBold");
	totaleCasse.setLayoutData(formData);

	Label lblDifferenzaCasseAvanzo = new Label(groupCasse, SWT.NONE);
	lblDifferenzaCasseAvanzo.setText("Diff. avanzo:");
	formData = new FormData();
	formData.top = new FormAttachment(totaleCasse, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 150;
	lblDifferenzaCasseAvanzo.setLayoutData(formData);

	differenzaCasseAvanzo = new Text(groupCasse, SWT.NONE);
	differenzaCasseAvanzo.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(totaleCasse, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.left = new FormAttachment(lblDifferenzaCasseAvanzo, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 150;
	stylingEngine.setId(avanzo, "CSSTextMediumBold");
	differenzaCasseAvanzo.setLayoutData(formData);

    }

    private void createBilancioUscite(Composite container) {
	FormData formData = new FormData();
	groupUscite = new Group(container, SWT.NONE);
	groupUscite.setText("Uscite");
	groupUscite.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(groupBilancio, PartDefaults.V_LABEL2LABEL_OFFSET);
	groupUscite.setLayoutData(formData);

	int h1 = 150;
	int h2 = 150;
	int h3 = 80;
	int h4 = 200;
	int iconsize = 24;

	tableViewerUscite = new TableViewer(groupUscite, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerUscite.setColumnProperties(new String[] {});
	tableUscite = tableViewerUscite.getTable();
	tableUscite.setLinesVisible(true);
	tableUscite.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tableUscite.setHeaderVisible(true);
	tableUscite.setLocation(0, 0);
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
	formData.height = 400;
	tableUscite.setLayoutData(formData);

	ToolBar toolBar = new ToolBar(groupUscite, SWT.FLAT | SWT.RIGHT);
	formData = new FormData();
	formData.bottom = new FormAttachment(PartDefaults.MARGIN);
	formData.right = new FormAttachment(tableUscite, h1 + h2 + h3 + h4);
	toolBar.setLayoutData(formData);

	ToolItem tltmNuovaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmNuovaUscitaBilancio.setToolTipText("Nuova uscita");
	tltmNuovaUscitaBilancio.setImage(
		ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/bilancio_uscita_add24x24.png"));

	ToolItem tltmModificaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmModificaUscitaBilancio.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui",
		"icons/bilancio_uscita_modifica24x24.png"));
	tltmModificaUscitaBilancio.setToolTipText("Modifica uscita");

	ToolItem tltmCancellaUscitaBilancio = new ToolItem(toolBar, SWT.NONE);
	tltmCancellaUscitaBilancio.setImage(
		ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/bilancio_uscita_remove24x24.png"));
	tltmCancellaUscitaBilancio.setToolTipText("Cancella uscita");

	tltmNuovaUscitaBilancio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		ParameterizedCommand command = commandService.createCommand(
			"it.caicividale.scuola.ui.command.bilancionuovouscita", Collections.emptyMap());
		handlerService.executeHandler(command);
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {
	    }
	});

	tltmModificaUscitaBilancio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		ParameterizedCommand command = commandService.createCommand(
			"it.caicividale.scuola.ui.command.bilanciomodificauscita", Collections.emptyMap());
		handlerService.executeHandler(command);
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {
	    }
	});

	tltmCancellaUscitaBilancio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		ParameterizedCommand command = commandService.createCommand(
			"it.caicividale.scuola.ui.command.bilanciocancellauscita", Collections.emptyMap());
		handlerService.executeHandler(command);
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {
	    }
	});

	final TableViewerColumn tableViewerColumnData = new TableViewerColumn(tableViewerUscite, SWT.CENTER);
	TableColumn tblclmnData = tableViewerColumnData.getColumn();
	tblclmnData.setAlignment(SWT.LEFT);
	tblclmnData.setWidth(h1);
	tblclmnData.setText("Data");
	tblclmnData.setToolTipText("Voce di spesa");

	tableViewerUscite.addDoubleClickListener(new IDoubleClickListener() {
	    @SuppressWarnings("restriction")
	    @Override
	    public void doubleClick(DoubleClickEvent event) {
		ParameterizedCommand command = commandService.createCommand(
			"it.caicividale.scuola.ui.command.bilanciomodificauscita", Collections.emptyMap());

		handlerService.executeHandler(command);
	    }

	});

	final TableViewerColumn tableViewerColumnVoce = new TableViewerColumn(tableViewerUscite, SWT.CENTER);
	TableColumn tblclmnVoce = tableViewerColumnVoce.getColumn();
	tblclmnVoce.setAlignment(SWT.LEFT);
	tblclmnVoce.setWidth(h2);
	tblclmnVoce.setText("Voce");
	tblclmnVoce.setToolTipText("Voce di spesa");

	final TableViewerColumn tableViewerColumnImporto = new TableViewerColumn(tableViewerUscite, SWT.CENTER);
	TableColumn tblclmnImporto = tableViewerColumnImporto.getColumn();
	tblclmnImporto.setAlignment(SWT.LEFT);
	tblclmnImporto.setWidth(h3);
	tblclmnImporto.setText("Importo");
	tblclmnImporto.setToolTipText("Importo della voce di spesa");

	final TableViewerColumn tableViewerColumnNota = new TableViewerColumn(tableViewerUscite, SWT.CENTER);
	TableColumn tblclmnNota = tableViewerColumnNota.getColumn();
	tblclmnNota.setAlignment(SWT.LEFT);
	tblclmnNota.setWidth(h4);
	tblclmnNota.setText("Nota");
	tblclmnNota.setToolTipText("Nota");
    }

    @SuppressWarnings("unchecked")
    private DataBindingContext bindToModel() {
	DataBindingContext bindingContext = new DataBindingContext();
	IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();

	// entrate
	IObservableValue<Float> entrateObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__BILANCIO,
			ModelPackage.Literals.BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI))
		.observeDetail(corsoObservable);
	ISWTObservableValue entrateTextObservable = WidgetProperties.text(SWT.Modify).observe(entrate);
	UpdateValueStrategy modelToTargetEntrate = new ConverterUpdateValueStrategy(new Soldi2StringConverter());
	bindingContext.bindValue(entrateTextObservable, entrateObservable, null, modelToTargetEntrate);

	// uscite
	IObservableValue<Float> usciteObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.CORSO__BILANCIO, ModelPackage.Literals.BILANCIO__TOTALE_USCITE))
		.observeDetail(corsoObservable);
	ISWTObservableValue usciteTextObservable = WidgetProperties.text(SWT.Modify).observe(uscite);
	bindingContext.bindValue(usciteTextObservable, usciteObservable, null, modelToTargetEntrate);

	// avanzo
	IObservableValue<Float> avanzoObservable = EMFProperties.value(FeaturePath
		.fromList(ModelPackage.Literals.CORSO__BILANCIO, ModelPackage.Literals.BILANCIO__AVANZO_CORSO))
		.observeDetail(corsoObservable);
	ISWTObservableValue avanzoTextObservable = WidgetProperties.text(SWT.Modify).observe(avanzo);
	bindingContext.bindValue(avanzoTextObservable, avanzoObservable, null, modelToTargetEntrate);

	// tabella uscite
	tableViewerUscite.setLabelProvider(new BilancioUsciteLabelProvider(tableViewerUscite));
	ObservableListContentProvider bilancioUsciteListContentProvider = new ObservableListContentProvider();
	tableViewerUscite.setContentProvider(bilancioUsciteListContentProvider);
	IObservableList<VoceDiSpesa> vociDiSpesaObservableList = EMFProperties.list(FeaturePath
		.fromList(ModelPackage.Literals.CORSO__BILANCIO, ModelPackage.Literals.BILANCIO__VOCI_DI_SPESA))
		.observeDetail(corsoObservable);
	tableViewerUscite.setInput(vociDiSpesaObservableList);
	IViewerObservableValue targetObservableVoceDiSpesa = ViewersObservables
		.observeSingleSelection(tableViewerUscite);
	bindingContext.bindValue(targetObservableVoceDiSpesa, voceDiSpesaItemsObservable);

	// tabella cassa
	tableViewerCasse.setLabelProvider(new CasseLabelProvider(tableViewerCasse));
	ObservableListContentProvider casseListContentProvider = new ObservableListContentProvider();
	tableViewerCasse.setContentProvider(casseListContentProvider);
	IObservableList<RipartizioneCassa> ripartizioneCasseObservableList = EMFProperties.list(FeaturePath
		.fromList(ModelPackage.Literals.CORSO__CASSA, ModelPackage.Literals.CASSA__RIPARTIZIONI_CASSA))
		.observeDetail(corsoObservable);
	tableViewerCasse.setInput(ripartizioneCasseObservableList);
	IViewerObservableValue targetObservableRipartizioneCassa = ViewersObservables
		.observeSingleSelection(tableViewerCasse);
	bindingContext.bindValue(targetObservableRipartizioneCassa, ripartizioneCassaItemsObservable);

	// totale casse
	IObservableValue<Float> totaleCasseObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__CASSA, ModelPackage.Literals.CASSA__TOTALE))
		.observeDetail(corsoObservable);
	ISWTObservableValue totaleCasseTextObservable = WidgetProperties.text(SWT.Modify).observe(totaleCasse);
	bindingContext.bindValue(totaleCasseTextObservable, totaleCasseObservable, null, modelToTargetEntrate);

	// differenza totale casse e avanzo
	IObservableValue<Float> differenzaTotaleCasseEAvanzoObservable = EMFProperties
		.value(FeaturePath.fromList(ModelPackage.Literals.CORSO__CASSA,
			ModelPackage.Literals.CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO))
		.observeDetail(corsoObservable);
	ISWTObservableValue differenzaTotaleCasseEAvanzoTextObservable = WidgetProperties.text(SWT.Modify)
		.observe(differenzaCasseAvanzo);
	bindingContext.bindValue(differenzaTotaleCasseEAvanzoTextObservable, differenzaTotaleCasseEAvanzoObservable,
		null, modelToTargetEntrate);

	return bindingContext;
    }

    // private void createEntrate() {
    //
    // final TableViewerColumn tableViewerColumnData = new
    // TableViewerColumn(tableViewerEntrate, SWT.CENTER);
    // TableColumn tblclmnData = tableViewerColumnData.getColumn();
    // tblclmnData.setWidth(100);
    // tblclmnData.setText("Data");
    // tblclmnData.setToolTipText("Voce di spesa");
    //
    // final TableViewerColumn tableViewerColumnVoce = new
    // TableViewerColumn(tableViewerEntrate, SWT.CENTER);
    // TableColumn tblclmnVoce = tableViewerColumnVoce.getColumn();
    // tblclmnVoce.setWidth(100);
    // tblclmnVoce.setText("Voce");
    // tblclmnVoce.setToolTipText("Voce di spesa");
    //
    // final TableViewerColumn tableViewerColumnImporto = new
    // TableViewerColumn(tableViewerEntrate, SWT.CENTER);
    // TableColumn tblclmnImporto = tableViewerColumnImporto.getColumn();
    // tblclmnImporto.setWidth(70);
    // tblclmnImporto.setText("Importo");
    // tblclmnImporto.setToolTipText("Importo della voce di spesa");
    //
    // final TableViewerColumn tableViewerColumnNota = new
    // TableViewerColumn(tableViewerEntrate, SWT.CENTER);
    // TableColumn tblclmnNota = tableViewerColumnNota.getColumn();
    // tblclmnNota.setWidth(100);
    // tblclmnNota.setText("Nota");
    // tblclmnNota.setToolTipText("Nota");
    //
    // }

    @Override
    public void refresh() {
	// tableViewerEntrate.refresh();
	tableViewerUscite.refresh();
    }
}