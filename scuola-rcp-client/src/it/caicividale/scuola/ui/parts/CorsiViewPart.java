package it.caicividale.scuola.ui.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

public class CorsiViewPart {
	private static final int INTERNAL_MARGIN = 3;
	private static final int TOP_MARGIN = 3;
	private static final int BOTTOM_MARGIN = 3;
	private static final int FIELD_SPACING = 20;
	private static final int LABEL_SPACING = 10;
	private static final int ICON_SPACING = 5;
	private static final int ICON_TOP_SPACING = 24;

	private Table tableIscrizioni;

	public CorsiViewPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent) {

		Composite compositeSfondo = new Composite(parent, SWT.NONE);

		// TITOLO DEL CORSO
		Label lblTitoloCorso = new Label(compositeSfondo, SWT.NONE);
		lblTitoloCorso.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		lblTitoloCorso.setBounds(10, 10, 932, 25);
		lblTitoloCorso.setText("Nome corso");

		// TAB FOLDER
		TabFolder tabFolderCorso = new TabFolder(compositeSfondo, SWT.NONE);
		tabFolderCorso.setBounds(10, 56, 801, 675);
		tabFolderCorso.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.NORMAL));

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TAB ITEM ISCRIZIONE
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		TabItem tbtmIscrizione = new TabItem(tabFolderCorso, SWT.NONE);
		tbtmIscrizione.setToolTipText("Iscrizioni e dettagli del corso");
		tbtmIscrizione.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/users_male.ico"));
		tbtmIscrizione.setText("Iscrizioni");

		Composite compositeIscrizioni = new Composite(tabFolderCorso, SWT.NONE);
		tbtmIscrizione.setControl(compositeIscrizioni);
		FormLayout formLayoutCompositeIscrizioni = new FormLayout();
		formLayoutCompositeIscrizioni.marginWidth = 5;
		formLayoutCompositeIscrizioni.marginHeight = 5;
		compositeIscrizioni.setLayout(formLayoutCompositeIscrizioni);

		Composite tableViewerCompositeIscrizioni = new Composite(compositeIscrizioni, SWT.NONE);
		FormData formData = new FormData();
		formData.top = new FormAttachment(0, TOP_MARGIN);
		formData.left = new FormAttachment(0, FIELD_SPACING);
		formData.bottom = new FormAttachment(0, 409);
		formData.right = new FormAttachment(0, 683);

		tableViewerCompositeIscrizioni.setLayoutData(formData);
		tbtmIscrizione.setControl(tableViewerCompositeIscrizioni);

		TableColumnLayout tcl_tableViewerCompositeIscrizioni = new TableColumnLayout();
		tableViewerCompositeIscrizioni.setLayout(tcl_tableViewerCompositeIscrizioni);

		TableViewer tableViewerIscrizioni = new TableViewer(tableViewerCompositeIscrizioni,
				SWT.BORDER | SWT.FULL_SELECTION);
		tableIscrizioni = tableViewerIscrizioni.getTable();
		tableIscrizioni.setHeaderVisible(true);
		tableIscrizioni.setLinesVisible(true);

		// COGNOME
		TableViewerColumn tableViewerColumnIscrizioniCognome = new TableViewerColumn(tableViewerIscrizioni, SWT.NONE);
		TableColumn tblclmnTableColumIscrizioniCognome = tableViewerColumnIscrizioniCognome.getColumn();
		tcl_tableViewerCompositeIscrizioni.setColumnData(tblclmnTableColumIscrizioniCognome,
				new ColumnPixelData(102, true, true));
		tblclmnTableColumIscrizioniCognome.setText("Cognome");

		// NOME
		TableViewerColumn tableViewerColumnIscrizioniNome = new TableViewerColumn(tableViewerIscrizioni, SWT.NONE);
		TableColumn tblclmnTableColumIscrizioniNome = tableViewerColumnIscrizioniNome.getColumn();
		tcl_tableViewerCompositeIscrizioni.setColumnData(tblclmnTableColumIscrizioniNome,
				new ColumnPixelData(102, true, true));
		tblclmnTableColumIscrizioniNome.setText("Nome");

		// NOME
		TableViewerColumn tableViewerColumnIscrizioniModuloIscrizione = new TableViewerColumn(tableViewerIscrizioni,
				SWT.NONE);
		TableColumn tblclmnTableColumIscrizioniModuloIscrizione = tableViewerColumnIscrizioniModuloIscrizione
				.getColumn();
		tcl_tableViewerCompositeIscrizioni.setColumnData(tblclmnTableColumIscrizioniModuloIscrizione,
				new ColumnPixelData(65, true, true));
		tblclmnTableColumIscrizioniModuloIscrizione.setText("Mod. Iscr.");

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TAB ITEM LEZIONI TEORICHE
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		TabItem tbtmLezioniTeoriche = new TabItem(tabFolderCorso, SWT.NONE);
		tbtmLezioniTeoriche.setImage(
				ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/applications_office.ico"));
		tbtmLezioniTeoriche.setText("Lezioni teoriche");

		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// TAB ITEM LEZIONI PRATICHE
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		TabItem tbtmLezioniPratiche = new TabItem(tabFolderCorso, SWT.NONE);
		tbtmLezioniPratiche.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui", "icons/run_1.ico"));
		tbtmLezioniPratiche.setText("Lezioni pratiche");
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		// TODO Set the focus to control
	}

}
