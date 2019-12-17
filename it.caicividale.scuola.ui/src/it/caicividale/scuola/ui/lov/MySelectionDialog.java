package it.caicividale.scuola.ui.lov;

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.typed.ViewerProperties;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionStatusDialog;
import org.eclipse.wb.swt.SWTResourceManager;

import it.caicividale.scuola.ui.parts.PartDefaults;
import it.caicividale.scuola.ui.parts.tableviewer.filters.ContentFilter;

public class MySelectionDialog extends SelectionStatusDialog {
    private Label lblFiltro;
    private Text filtro;

    private TableViewer tableViewerElenco;
    private Table tableElenco;

    private ILabelProvider labelProvider;
    private ContentFilter contentFilter;
    private Class clazz;
    private String stringFilter;

    private IObservableList elencoObservableList = WritableList.withElementType(clazz);

    private IObservableValue selectionObservable = WritableValue.withValueType(clazz);

    public MySelectionDialog(Shell parentShell, ILabelProvider labelProvider, ContentFilter contentFilter,
	    List elencoList, Class clazz, String stringFilter) {
	super(parentShell);

	this.labelProvider = labelProvider;
	this.contentFilter = contentFilter;
	this.clazz = clazz;
	this.stringFilter = stringFilter;

	elencoObservableList.clear();
	elencoObservableList.addAll(elencoList);

    }

    public Object getSelecion() {
	return selectionObservable.getValue();
    }

    @Override
    protected void computeResult() {
	// TODO Auto-generated method stub

    }

    @Override
    protected Control createDialogArea(Composite parent) {
	Composite area = (Composite) super.createDialogArea(parent);
	area.setLayout(new FillLayout());

	Composite container = new Composite(area, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	FormData formData = new FormData();

	// nome
	lblFiltro = new Label(container, SWT.NONE);
	lblFiltro.setText("Filtro");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.width = 100;
	formData.height = PartDefaults.H_LABEL;
	lblFiltro.setLayoutData(formData);

	filtro = new Text(container, SWT.BORDER | SWT.WRAP);
	formData = new FormData();
	formData.top = new FormAttachment(lblFiltro, PartDefaults.V_LABEL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.height = PartDefaults.H_TEXT;
	formData.width = 400;
	filtro.setLayoutData(formData);
	filtro.addVerifyListener(new VerifyListener() {
	    public void verifyText(VerifyEvent e) {
		e.text = e.text.toUpperCase();
	    }
	});
	filtro.addKeyListener(new KeyAdapter() {
	    public void keyReleased(KeyEvent ke) {
		contentFilter.setSearchText(filtro.getText());
		tableViewerElenco.refresh();
	    }

	});

	tableViewerElenco = new TableViewer(container, SWT.BORDER | SWT.FULL_SELECTION);
	tableViewerElenco.setColumnProperties(new String[] {});
	tableElenco = tableViewerElenco.getTable();

	tableElenco.setLinesVisible(true);
	tableElenco.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
	tableElenco.setHeaderVisible(true);
	tableElenco.setLocation(0, 0);
	formData = new FormData();
	formData.top = new FormAttachment(filtro, PartDefaults.V_CONTROL2CONTROL_OFFSET);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	// formData.right = new FormAttachment(90, -PartDefaults.MARGIN);
	formData.height = 400;
	tableElenco.setLayoutData(formData);

	final TableViewerColumn tableViewerColumnIscrizioneOk = new TableViewerColumn(tableViewerElenco, SWT.CENTER);
	TableColumn tblclmnElenco = tableViewerColumnIscrizioneOk.getColumn();
	// tblclmnIscrizioneOk.setImage(ResourceManager.getPluginImage("it.caicividale.scuola.ui",
	// "icons/documents_folder32x32.png"));
	tblclmnElenco.setWidth(400);

	tableViewerElenco.addDoubleClickListener(new IDoubleClickListener() {
	    @SuppressWarnings("restriction")
	    @Override
	    public void doubleClick(DoubleClickEvent event) {
		getOkButton().notifyListeners(SWT.Selection, new Event());
	    }

	});

	bindToModel();

	filtro.setText(stringFilter);
	contentFilter.setSearchText(filtro.getText());
	tableViewerElenco.refresh();

	return area;
    }

    @SuppressWarnings("unchecked")
    private void bindToModel() {
	DataBindingContext bindingContext = new DataBindingContext();
	tableViewerElenco.setLabelProvider(labelProvider);
	ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
	tableViewerElenco.setContentProvider(listContentProvider);
	tableViewerElenco.setFilters(contentFilter);

	tableViewerElenco.setInput(elencoObservableList);
	IViewerObservableValue targetObservable = ViewerProperties.singleSelection().observe(tableViewerElenco);
	bindingContext.bindValue(targetObservable, selectionObservable);
    }
}
