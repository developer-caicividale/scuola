package it.caicividale.corsicai.ui.dialogs;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Persona;
import it.caicividale.corsicai.ui.rest.ServiceManager;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.services.UtilsService;

public class RicercaAllievoDialog extends TitleAreaDialog {

	private Text nome;
	private Text cognome;

	private Label lblNome;
	private Label lblCognome;

	private Button cercaButton;
	private ListViewer elencoAllieviListViewer;
	private org.eclipse.swt.widgets.List elencoAllieviList;

	private final ModelManager modelManager = ModelManager.getInstance();

	private ServiceManager serviceManager = ServiceManager.getInstance();

	private final IObservableList<Persona> elencoPersonaObservableList = WritableList.withElementType(Persona.class);

	public RicercaAllievoDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Ricerca allievo da corsi precedenti");
		// setMessage("This is a TitleAreaDialog", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		lblNome = new Label(container, SWT.NONE);
		lblNome.setText("Nome");
		GridData nomeGridData = new GridData();
		nomeGridData.grabExcessHorizontalSpace = true;
		nomeGridData.horizontalAlignment = GridData.FILL;
		nome = new Text(container, SWT.BORDER);
		nome.setLayoutData(nomeGridData);

		lblCognome = new Label(container, SWT.NONE);
		lblCognome.setText("Cognome");
		GridData cognomeGridData = new GridData();
		cognomeGridData.grabExcessHorizontalSpace = true;
		cognomeGridData.horizontalAlignment = GridData.FILL;
		cognome = new Text(container, SWT.BORDER);
		cognome.setLayoutData(cognomeGridData);

		GridData cercaButtonGridData = new GridData();
		// cercaButtonGridData.grabExcessHorizontalSpace = true;
		cercaButtonGridData.horizontalAlignment = GridData.FILL;
		cercaButton = new Button(container, SWT.NONE);
		cercaButton.setImage(ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/search 32x32.png"));
		cercaButton.setLayoutData(cercaButtonGridData);

		cercaButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				List<Persona> allievi = serviceManager.getPersoneByNomeCognome(nome.getText(), cognome.getText());
				elencoPersonaObservableList.clear();
				elencoPersonaObservableList.addAll(allievi);
				elencoAllieviListViewer.refresh();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		elencoAllieviListViewer = new ListViewer(container, SWT.BORDER);
		elencoAllieviList = elencoAllieviListViewer.getList();
		elencoAllieviList.setToolTipText("Elenco allievi trovati");
		elencoAllieviList.setLayoutData(cercaButtonGridData);

		bindToModel();
		return area;
	}

	@SuppressWarnings("unchecked")
	private void bindToModel() {
		DataBindingContext bindingContext = new DataBindingContext();
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		elencoAllieviListViewer.setContentProvider(listContentProvider);
		elencoAllieviListViewer.setInput(elencoPersonaObservableList);
		elencoAllieviListViewer.setLabelProvider(new LabelProvider() {
			public Image getImage(Object element) {
				return null;
			}

			public String getText(Object element) {
				String text = null;
				if (element != null && element instanceof Allievo) {
					Allievo allievo = (Allievo) element;
					text = allievo.getNome();
					text += " " + allievo.getCognome();
					text += allievo.getNascitaData() != null
							? " - " + UtilsService.getDateString(allievo.getNascitaData())
							: null;

				}
				return text;
			}
		});

		IObservableValue<Iscrizione> iscrizioneObservable = modelManager.getIscrizioneObservable();
		IObservableValue<Allievo> allievoObservable = EMFProperties.value(ModelPackage.Literals.ISCRIZIONE__ALLIEVO)
				.observeDetail(iscrizioneObservable);

		IViewerObservableValue targetObservable = ViewersObservables.observeSingleSelection(elencoAllieviListViewer);
		bindingContext.bindValue(targetObservable, allievoObservable);

	}

	@Override
	protected boolean isResizable() {
		return false;
	}

	@Override
	protected void okPressed() {
		super.okPressed();
	}

}