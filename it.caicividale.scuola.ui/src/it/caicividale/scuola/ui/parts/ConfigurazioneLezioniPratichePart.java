
package it.caicividale.scuola.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.ElencoIscrizioniLabelProvider;

public class ConfigurazioneLezioniPratichePart implements IMyPart {

    @SuppressWarnings("restriction")
    @Inject
    private ECommandService commandService;

    @SuppressWarnings("restriction")
    @Inject
    private EHandlerService handlerService;

    private ModelManager modelManager = ModelManager.getInstance();

    private ServiceManager serviceManager = ServiceManager.getInstance();

    private TableViewer tableViewerLezioniPratiche;
    private Table tableLezioniPratiche;

    @PostConstruct
    public void postConstruct(Composite parent) {
	Group groupElencoLezioniPratiche;

	Composite container = new Composite(parent, SWT.NONE);
	// container.setBounds(0, 0, 886, 465);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	FormData formData = new FormData();

	groupElencoLezioniPratiche = new Group(container, SWT.NONE);
	groupElencoLezioniPratiche.setText("Uscite");
	groupElencoLezioniPratiche.setLayout(new FormLayout());
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	groupElencoLezioniPratiche.setLayoutData(formData);

	tableViewerLezioniPratiche = new TableViewer(groupElencoLezioniPratiche, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerLezioniPratiche.setColumnProperties(new String[] {});
	tableLezioniPratiche = tableViewerLezioniPratiche.getTable();

	tableLezioniPratiche.setLinesVisible(true);
	tableLezioniPratiche.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tableLezioniPratiche.setHeaderVisible(true);
	tableLezioniPratiche.setLocation(0, 0);
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
	formData.height = 400;
	tableLezioniPratiche.setLayoutData(formData);

	createLezioniPratiche();

	bindToModel();

    }

    private void createLezioniPratiche() {
	final TableViewerColumn tableViewerColumnData = new TableViewerColumn(tableViewerLezioniPratiche, SWT.CENTER);
	TableColumn tblclmnData = tableViewerColumnData.getColumn();
	tblclmnData.setWidth(100);
	tblclmnData.setText("Data");
	tblclmnData.setToolTipText("Data svolgimento uscita pratica");

	final TableViewerColumn tableViewerColumnLuogo = new TableViewerColumn(tableViewerLezioniPratiche, SWT.CENTER);
	TableColumn tblclmnLuogo = tableViewerColumnLuogo.getColumn();
	tblclmnLuogo.setWidth(100);
	tblclmnLuogo.setText("Luogo uscita");
	tblclmnLuogo.setToolTipText("Luogo svolgimento uscita pratica");

	final TableViewerColumn tableViewerColumnTitolo = new TableViewerColumn(tableViewerLezioniPratiche, SWT.CENTER);
	TableColumn tblclmnTitolo = tableViewerColumnTitolo.getColumn();
	tblclmnTitolo.setWidth(150);
	tblclmnTitolo.setText("Tema");
	tblclmnTitolo.setToolTipText("Tema uscita pratica");

	final TableViewerColumn tableViewerColumnRelatore = new TableViewerColumn(tableViewerLezioniPratiche,
		SWT.CENTER);
	TableColumn tblclmnRelatore = tableViewerColumnRelatore.getColumn();
	tblclmnRelatore.setWidth(200);
	tblclmnRelatore.setText("Staff istruttori");
	tblclmnRelatore.setToolTipText("Staff istruttori presenti");

	final TableViewerColumn tableViewerColumnArgomentiTrattati = new TableViewerColumn(tableViewerLezioniPratiche,
		SWT.CENTER);
	TableColumn tblclmnArgomentiTrattati = tableViewerColumnArgomentiTrattati.getColumn();
	tblclmnArgomentiTrattati.setWidth(300);
	tblclmnArgomentiTrattati.setText("Argomenti trattati");
	tblclmnArgomentiTrattati.setToolTipText("Argomenti trattati nella lezione");
    }

    private DataBindingContext bindToModel() {

	DataBindingContext bindingContext = new DataBindingContext();

	ObservableListContentProvider listContentProviderIscrizione = new ObservableListContentProvider();
	tableViewerLezioniPratiche.setContentProvider(listContentProviderIscrizione);
	IObservableList<Corso> elencoCorsiItemsObservableList = modelManager
		.getElencoConfigurazioneCorsiAnnoCorrenteItemsObservableList();
	tableViewerLezioniPratiche.setInput(elencoCorsiItemsObservableList);
	tableViewerLezioniPratiche.setLabelProvider(new ElencoIscrizioniLabelProvider(tableViewerLezioniPratiche));
	IViewerObservableValue targetElencoCorsiObservable = ViewersObservables
		.observeSingleSelection(tableViewerLezioniPratiche);

//		IObservableValue<Long> idCorsoObservable = modelManager.getIdCorsoObservable();
//		UpdateValueStrategy target2ModelCorso = new ConverterUpdateValueStrategy(new Corso2IdCorsoConverter());
//
//		bindingContext.bindValue(targetElencoCorsiObservable, idCorsoObservable, target2ModelCorso, null);

	return bindingContext;
    }

    @Override
    public void refresh() {
	tableViewerLezioniPratiche.refresh();

    }
}