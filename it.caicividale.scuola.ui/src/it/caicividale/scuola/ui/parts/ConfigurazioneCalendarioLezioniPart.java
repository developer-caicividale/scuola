
package it.caicividale.scuola.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.aspencloud.ccalendar.CCalendar;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;
import it.caicividale.scuola.ui.cccalendar.CEvent;
import it.caicividale.scuola.ui.cccalendar.CEventItemBuilder;

public class ConfigurazioneCalendarioLezioniPart implements IMyPart {

	@SuppressWarnings("restriction")
	@Inject
	private ECommandService commandService;

	@SuppressWarnings("restriction")
	@Inject
	private EHandlerService handlerService;

	private ModelManager modelManager = ModelManager.getInstance();

	private ServiceManager serviceManager = ServiceManager.getInstance();

	@PostConstruct
	public void postConstruct(Composite parent) {
		Group groupCalendario;

		Composite container = new Composite(parent, SWT.NONE);
		// container.setBounds(0, 0, 886, 465);
		container.setLayout(new GridLayout());

		final CCalendar cc = new CCalendar(container, SWT.BORDER);
		cc.setItemBuilder(new CEventItemBuilder());
		cc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Menu menu = new Menu(cc);
		final MenuItem item = new MenuItem(menu, SWT.PUSH);
		menu.addMenuListener(new MenuAdapter() {
			@Override
			public void menuShown(MenuEvent e) {
				ISelection selection = cc.getSelection();
				if (selection.isEmpty()) {
					item.setText("No Selection");
					item.setEnabled(false);
				} else {
					item.setText(((CEvent) ((StructuredSelection) selection).getFirstElement()).getName());
					item.setEnabled(true);
				}
			}
		});
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!cc.getSelection().isEmpty()) {
					System.out.println(cc.getSelection());
				}
			}
		});
		cc.setMenu(menu);

		bindToModel();

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

	}
}