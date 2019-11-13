
package it.caicividale.scuola.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
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

import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;

public class ConfigurazioneLezioniTeorichePart implements IMyPart {

	@SuppressWarnings("restriction")
	@Inject
	private ECommandService commandService;

	@SuppressWarnings("restriction")
	@Inject
	private EHandlerService handlerService;

	private ModelManager modelManager = ModelManager.getInstance();

	private ServiceManager serviceManager = ServiceManager.getInstance();

	private TableViewer tableViewerLezioniTeoriche;
	private Table tableLezioniTeoriche;

	@PostConstruct
	public void postConstruct(Composite parent) {
		Group groupElencoLezioniTeoriche;

		Composite container = new Composite(parent, SWT.NONE);
		// container.setBounds(0, 0, 886, 465);
		FormLayout layout = new FormLayout();
		container.setLayout(layout);

		FormData formData = new FormData();
		groupElencoLezioniTeoriche = new Group(container, SWT.NONE);
		groupElencoLezioniTeoriche.setText("Lezioni teoriche");
		groupElencoLezioniTeoriche.setLayout(new FormLayout());
		formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
		formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
		groupElencoLezioniTeoriche.setLayoutData(formData);

		tableViewerLezioniTeoriche = new TableViewer(groupElencoLezioniTeoriche, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewerLezioniTeoriche.setColumnProperties(new String[] {});
		tableLezioniTeoriche = tableViewerLezioniTeoriche.getTable();

		tableLezioniTeoriche.setLinesVisible(true);
		tableLezioniTeoriche.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		tableLezioniTeoriche.setHeaderVisible(true);
		tableLezioniTeoriche.setLocation(0, 0);
		formData = new FormData();
		formData.top = new FormAttachment(PartDefaults.MARGIN);
		formData.left = new FormAttachment(PartDefaults.MARGIN);
		// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
		formData.height = 400;
		tableLezioniTeoriche.setLayoutData(formData);

		createLezioniTeoriche();

		bindToModel();

	}

	private void createLezioniTeoriche() {

		final TableViewerColumn tableViewerColumnData = new TableViewerColumn(tableViewerLezioniTeoriche, SWT.CENTER);
		TableColumn tblclmnData = tableViewerColumnData.getColumn();
		tblclmnData.setWidth(100);
		tblclmnData.setText("Data");
		tblclmnData.setToolTipText("Data svolgimento lezione");

		final TableViewerColumn tableViewerColumnLuogo = new TableViewerColumn(tableViewerLezioniTeoriche, SWT.CENTER);
		TableColumn tblclmnLuogo = tableViewerColumnLuogo.getColumn();
		tblclmnLuogo.setWidth(70);
		tblclmnLuogo.setText("Luogo");
		tblclmnLuogo.setToolTipText("Luogo svolgimento lezione");

		final TableViewerColumn tableViewerColumnTitolo = new TableViewerColumn(tableViewerLezioniTeoriche, SWT.CENTER);
		TableColumn tblclmnTitolo = tableViewerColumnTitolo.getColumn();
		tblclmnTitolo.setWidth(150);
		tblclmnTitolo.setText("Titolo");
		tblclmnTitolo.setToolTipText("Titolo lezione");

		final TableViewerColumn tableViewerColumnRelatore = new TableViewerColumn(tableViewerLezioniTeoriche,
				SWT.CENTER);
		TableColumn tblclmnRelatore = tableViewerColumnRelatore.getColumn();
		tblclmnRelatore.setWidth(150);
		tblclmnRelatore.setText("Relatore");
		tblclmnRelatore.setToolTipText("Relatore lezione");

		final TableViewerColumn tableViewerColumnArgomentiTrattati = new TableViewerColumn(tableViewerLezioniTeoriche,
				SWT.CENTER);
		TableColumn tblclmnArgomentiTrattati = tableViewerColumnArgomentiTrattati.getColumn();
		tblclmnArgomentiTrattati.setWidth(200);
		tblclmnArgomentiTrattati.setText("Argomenti trattati");
		tblclmnArgomentiTrattati.setToolTipText("Argomenti trattati nella lezione");
	}

	private DataBindingContext bindToModel() {

		DataBindingContext bindingContext = new DataBindingContext();
		//
		// ObservableListContentProvider listContentProviderIscrizione = new
		// ObservableListContentProvider();
		// tableViewerLezioniPratiche.setContentProvider(listContentProviderIscrizione);
		// IObservableList<Corso> elencoCorsiItemsObservableList =
		// modelManager.getElencoConfigurazioneCorsiAnnoCorrenteItemsObservableList();
		// tableViewerLezioniPratiche.setInput(elencoCorsiItemsObservableList);
		// tableViewerLezioniPratiche.setLabelProvider(new
		// ElencoIscrizioniLabelProvider(tableViewerLezioniPratiche));
		// IViewerObservableValue targetElencoCorsiObservable =
		// ViewersObservables.observeSingleSelection(tableViewerLezioniPratiche);
		//
		// IObservableValue<Long> idCorsoObservable =
		// modelManager.getIdCorsoObservable();
		// UpdateValueStrategy target2ModelCorso = new ConverterUpdateValueStrategy(new
		// Corso2IdCorsoConverter());
		//
		// bindingContext.bindValue(targetElencoCorsiObservable, idCorsoObservable,
		// target2ModelCorso, null);

		return bindingContext;
	}

	@Override
	public void refresh() {
		tableViewerLezioniTeoriche.refresh();

	}
}