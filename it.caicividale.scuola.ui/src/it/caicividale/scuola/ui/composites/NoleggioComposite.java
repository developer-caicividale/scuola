package it.caicividale.scuola.ui.composites;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.ui.parts.PartDefaults;
import it.caicividale.scuola.ui.parts.tableviewer.sorters.EObjectTableColumnSorter;
import lombok.Data;

@Data
public class NoleggioComposite {

    private final Shell shell;
    private final Composite container;
    private final IStylingEngine stylingEngine;

    private Group groupAllievo;
    private Group groupNoleggio;
    private Group groupQuotaNoleggio;

    private Text allievo;

    private Label lblMaterialeNoleggiato;
    private TableViewer tableViewerNoleggio;
    private Table tableNoleggio;
    private Button aggiungiNoleggio;
    private Button modificaNoleggio;
    private Button cancellaNoleggio;

    private Label lblQuotaNoleggioDovuta;
    private Text quotaNoleggioDovuta;

    public void configure() {

	configureGroupAllievo();
	configureNoleggio();
	configureQuotaNoleggio();

    }

    private void configureQuotaNoleggio() {
	FormData formData;
	groupQuotaNoleggio = new Group(container, SWT.NONE);
	groupQuotaNoleggio.setText("Quote (Euro)");
	groupQuotaNoleggio.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupNoleggio, PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupQuotaNoleggio.setLayoutData(formData);
	// quota Noleggio
	lblQuotaNoleggioDovuta = new Label(groupQuotaNoleggio, SWT.NONE);
	lblQuotaNoleggioDovuta.setText("Noleggio dovuto");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 120;
	formData.height = PartDefaults.H_LABEL;
	lblQuotaNoleggioDovuta.setLayoutData(formData);

	quotaNoleggioDovuta = new Text(groupQuotaNoleggio, SWT.BORDER | SWT.WRAP);
	quotaNoleggioDovuta.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(lblQuotaNoleggioDovuta, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 120;
	formData.height = PartDefaults.H_TEXT;
	quotaNoleggioDovuta.setLayoutData(formData);

    }

    private void configureGroupAllievo() {
	FormData formData;
	groupAllievo = new Group(container, SWT.NONE);
	groupAllievo.setText("Allievo");
	groupAllievo.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupAllievo.setLayoutData(formData);

	allievo = new Text(groupAllievo, SWT.NONE);
	allievo.setEditable(false);
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 400;
	allievo.setLayoutData(formData);
	stylingEngine.setId(allievo, "CSSTextTitle");
    }

    private void configureNoleggio() {
	FormData formData;
	groupNoleggio = new Group(container, SWT.NONE);
	groupNoleggio.setText("Noleggio");
	groupNoleggio.setLayout(new FormLayout());
	formData = new FormData();
	formData.top = new FormAttachment(groupAllievo, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN_GROUP);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	groupNoleggio.setLayoutData(formData);

	// materiale noleggiato
	lblMaterialeNoleggiato = new Label(groupNoleggio, SWT.NONE);
	lblMaterialeNoleggiato.setText("Materiale noleggiato");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 200;
	formData.height = PartDefaults.H_LABEL;
	lblMaterialeNoleggiato.setLayoutData(formData);

	tableViewerNoleggio = new TableViewer(groupNoleggio, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerNoleggio.setColumnProperties(new String[] {});
	tableNoleggio = tableViewerNoleggio.getTable();

	tableNoleggio.setLinesVisible(true);
	tableNoleggio.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tableNoleggio.setHeaderVisible(true);
	tableNoleggio.setLocation(0, 0);

	int h1 = 130;
	int h2 = 330;
	int h3 = 87;
	int h4 = 87;
	int iconsize = 24;

	formData = new FormData();
	formData.top = new FormAttachment(lblMaterialeNoleggiato, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.height = 200;
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

	aggiungiNoleggio = new Button(groupNoleggio, SWT.NONE);
	aggiungiNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/edit_add24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize * 2);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	aggiungiNoleggio.setLayoutData(formData);

	modificaNoleggio = new Button(groupNoleggio, SWT.PUSH);
	modificaNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/modifica24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4 - iconsize);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	modificaNoleggio.setLayoutData(formData);

	cancellaNoleggio = new Button(groupNoleggio, SWT.PUSH);
	cancellaNoleggio
		.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons//trash_red24x24.png"));
	formData = new FormData();
	formData.right = new FormAttachment(tableNoleggio, h1 + h2 + h3 + h4);
	formData.bottom = new FormAttachment(tableNoleggio);
	formData.width = iconsize;
	formData.height = iconsize;
	cancellaNoleggio.setLayoutData(formData);

    }

}
