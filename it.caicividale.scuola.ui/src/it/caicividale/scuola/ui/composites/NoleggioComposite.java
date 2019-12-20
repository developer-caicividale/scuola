package it.caicividale.scuola.ui.composites;

import java.time.LocalDate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelFactory;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.ui.dialogs.NoleggioMaterialeDialog;
import it.caicividale.scuola.ui.parts.PartDefaults;
import it.caicividale.scuola.ui.parts.tableviewer.sorters.EObjectTableColumnSorter;
import it.caicividale.scuola.ui.utils.EmfUtils;

public class NoleggioComposite {

    private Label lblMaterialeNoleggiato;
    private TableViewer tableViewerNoleggio;
    private Table tableNoleggio;
    private Button aggiungiNoleggio;
    private Button modificaNoleggio;
    private Button cancellaNoleggio;

    private Label lblQuotaNoleggioDovuta;
    private Text quotaNoleggioDovuta;

    private void configureNoleggio() {
	FormData formData = new FormData();

	// materiale noleggiato
	lblMaterialeNoleggiato = new Label(groupIscrizione, SWT.NONE);
	lblMaterialeNoleggiato.setText("Materiale noleggiato");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(lblDataScadenzaCertificatoMedico, PartDefaults.H_CONTROL2CONTROL_OFFSET);
	formData.width = 150;
	formData.height = PartDefaults.H_LABEL;
	lblMaterialeNoleggiato.setLayoutData(formData);

	tableViewerNoleggio = new TableViewer(groupIscrizione, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerNoleggio.setColumnProperties(new String[] {});
	tableNoleggio = tableViewerNoleggio.getTable();

	tableNoleggio.setLinesVisible(true);
	tableNoleggio.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tableNoleggio.setHeaderVisible(true);
	tableNoleggio.setLocation(0, 0);

	int h1 = 130;
	int h2 = 130;
	int h3 = 87;
	int h4 = 87;
	int iconsize = 24;

	formData = new FormData();
	formData.top = new FormAttachment(lblMaterialeNoleggiato, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(lblDataScadenzaCertificatoMedico, PartDefaults.V_LABEL2LABEL_OFFSET);
	formData.height = 100;
	formData.width = h1 + h2 + h3 + h4;
	tableNoleggio.setLayoutData(formData);
	EObjectTableColumnSorter tableColumnSorter = new EObjectTableColumnSorter(tableViewerNoleggio);

	final TableViewerColumn tableViewerColumnData = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
	TableColumn tblclmnData = tableViewerColumnData.getColumn();
	tblclmnData.setAlignment(SWT.CENTER);
	tblclmnData.setWidth(h1);
	tblclmnData.setText("Data");
	tblclmnData.setToolTipText("Data del noleggio");
	tableColumnSorter.addColumn(tblclmnData, ModelPackage.Literals.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO);

	final TableViewerColumn tableViewerColumnMateriale = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
	TableColumn tblclmnMateriale = tableViewerColumnMateriale.getColumn();
	tblclmnMateriale.setAlignment(SWT.CENTER);
	tblclmnMateriale.setWidth(h2);
	tblclmnMateriale.setText("Materiale");
	tblclmnMateriale.setToolTipText("Materiale noleggiato");
	tableColumnSorter.addColumn(tblclmnMateriale, ModelPackage.Literals.DIZ_MATERIALE__NOME);

	final TableViewerColumn tableViewerColumnQuantita = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
	TableColumn tblclmnQuantita = tableViewerColumnQuantita.getColumn();
	tblclmnQuantita.setAlignment(SWT.CENTER);
	tblclmnQuantita.setWidth(h3);
	tblclmnQuantita.setText("Quantità");
	tblclmnQuantita.setToolTipText("Quantità noleggiata");
	tableColumnSorter.addColumn(tblclmnQuantita, ModelPackage.Literals.MATERIALE_NOLEGGIATO__QUANTITA);

	final TableViewerColumn tableViewerColumnQuotaNoleggio = new TableViewerColumn(tableViewerNoleggio, SWT.CENTER);
	TableColumn tblclmnQuotaNoleggio = tableViewerColumnQuotaNoleggio.getColumn();
	tblclmnQuotaNoleggio.setAlignment(SWT.CENTER);
	tblclmnQuotaNoleggio.setWidth(h4);
	tblclmnQuotaNoleggio.setText("Quota");
	tblclmnQuotaNoleggio.setToolTipText("Quota richiesta per il materiale noleggiato");
	tableColumnSorter.addColumn(tblclmnQuotaNoleggio, ModelPackage.Literals.DIZ_MATERIALE__QUOTA_NOLEGGIO);

	aggiungiNoleggio = new Button(groupIscrizione, SWT.NONE);
	aggiungiNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/edit_add24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize * 2);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	aggiungiNoleggio.setLayoutData(formData);
	aggiungiNoleggio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		@SuppressWarnings("unused")
		MaterialeNoleggiato materialeNoleggiato = ModelFactory.eINSTANCE.createMaterialeNoleggiato();
		materialeNoleggiato.setDataNoleggio(LocalDate.now());
		materialeNoleggiato.setQuantita(Short.valueOf("1"));
		NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(shell,
			materialeNoleggiato);
		if (noleggioMaterialeDialog.open() == Window.OK) {
		    iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
			    .add(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
		}
		tableViewerNoleggio.refresh();
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	modificaNoleggio = new Button(groupIscrizione, SWT.PUSH);
	modificaNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/modifica24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	modificaNoleggio.setLayoutData(formData);
	modificaNoleggio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {

		if (materialeNoleggiatoItemsObservable.getValue() != null) {
		    MaterialeNoleggiato materialeNoleggiatoOld = EcoreUtil
			    .copy(materialeNoleggiatoItemsObservable.getValue());
		    int index = EmfUtils.getIndexOfEObject(
			    iscrizioneActualObservable.getValue().getMaterialeNoleggiato(), materialeNoleggiatoOld);

		    MaterialeNoleggiato materialeNoleggiatoActual = EcoreUtil
			    .copy(materialeNoleggiatoItemsObservable.getValue());
		    @SuppressWarnings("unused")
		    NoleggioMaterialeDialog noleggioMaterialeDialog = new NoleggioMaterialeDialog(shell,
			    materialeNoleggiatoActual);
		    if (noleggioMaterialeDialog.open() == Window.OK) {
			// materialeNoleggiatoItemsObservable.setValue(noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
			iscrizioneActualObservable.getValue().getMaterialeNoleggiato().set(index,
				noleggioMaterialeDialog.getMaterialeNoleggiatoObservableValue().getValue());
		    }
		    tableViewerNoleggio.refresh();
		} else {
		    MessageDialog.openError(shell, "Errore", "Selezionare il materiale noleggiato da modificare");
		}
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});

	cancellaNoleggio = new Button(groupIscrizione, SWT.PUSH);
	cancellaNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons//trash_red24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	cancellaNoleggio.setLayoutData(formData);

	cancellaNoleggio.addSelectionListener(new SelectionListener() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		if (materialeNoleggiatoItemsObservable.getValue() != null) {

		    if (MessageDialog.openConfirm(shell, "Errore", "Confermi la cencellazione del noleggio '"
			    + materialeNoleggiatoItemsObservable.getValue().getMateriale().getNome() + "'?")) {
			iscrizioneActualObservable.getValue().getMaterialeNoleggiato()
				.remove(materialeNoleggiatoItemsObservable.getValue());
			tableViewerNoleggio.refresh();
		    }

		} else {
		    MessageDialog.openError(shell, "Errore", "Selezionare il materiale noleggiato da cancellare");
		}
	    }

	    @Override
	    public void widgetDefaultSelected(SelectionEvent e) {

	    }
	});
    }

}
