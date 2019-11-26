
package it.caicividale.scuola.ui.parts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;
import it.caicividale.scuola.ui.parts.treeviewer.contentproviders.ElencoCorsiTreeContentProvider;
import it.caicividale.scuola.ui.parts.treeviewer.labelproviders.TreeviewCorsiLabelProvider;

public class TreeviewPartCorsi implements IMyPart {

    @SuppressWarnings("restriction")
    @Inject
    private ECommandService commandService;

    @SuppressWarnings("restriction")
    @Inject
    private EHandlerService handlerService;

    private ModelManager modelManager = ModelManager.getInstance();

    private ServiceManager serviceManager = ServiceManager.getInstance();

    private TreeViewer treeViewerCorsi;
    private Tree treeCorsi;

    public TreeviewPartCorsi() {
	modelManager.caricamentoCorsi();
    }

    @PostConstruct
    public void postConstruct(Composite parent) {

	Composite container = new Composite(parent, SWT.NONE);
	FormLayout layout = new FormLayout();
	container.setLayout(layout);

	// filtro testo
	Label lblfiltroAnno = new Label(container, SWT.NONE);
	lblfiltroAnno.setText("Anno: ");
	FormData formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	lblfiltroAnno.setLayoutData(formData);

	ComboViewer comboViewer = new ComboViewer(container, SWT.NONE);
	Combo combo = comboViewer.getCombo();
	combo.setToolTipText("Selezionare l'anno dei corsi");
	formData = new FormData();
	formData.top = new FormAttachment(PartDefaults.MARGIN);
	formData.left = new FormAttachment(lblfiltroAnno, PartDefaults.H_LABEL2CONTROL_OFFSET);
	formData.width = 100;
	combo.setLayoutData(formData);

	ScrolledComposite scrolledComposite = new ScrolledComposite(container,
		SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
	scrolledComposite.setAlwaysShowScrollBars(true);
	scrolledComposite.setExpandHorizontal(true);
	scrolledComposite.setExpandVertical(true);
	// scrolledComposite.setMinSize(300, 300);

	formData = new FormData();
	formData.top = new FormAttachment(combo, PartDefaults.MARGIN);
	formData.left = new FormAttachment(PartDefaults.MARGIN);
	formData.bottom = new FormAttachment(PartDefaults.MARGIN_BOTTOM);
	formData.right = new FormAttachment(PartDefaults.MARGIN_RIGHT);
	scrolledComposite.setLayoutData(formData);

	// Composite containerTree = new Composite(scrolledComposite, SWT.NONE);
	FillLayout fillLayout = new FillLayout();
	// fillLayout.type = SWT.HORIZONTAL;
	scrolledComposite.setLayout(fillLayout);

	treeViewerCorsi = new TreeViewer(scrolledComposite, SWT.BORDER | SWT.MULTI);
	// treeViewerCorsi = new TreeViewer(scrolledComposite, SWT.BORDER | SWT.MULTI |
	// SWT.H_SCROLL | SWT.V_SCROLL);
	treeViewerCorsi.setAutoExpandLevel(3);

	treeViewerCorsi.getTree().setHeaderVisible(true);
	treeViewerCorsi.getTree().setLinesVisible(true);

	treeCorsi = treeViewerCorsi.getTree();
	treeCorsi.setToolTipText("Elenco dei corsi della scuola");
	treeCorsi.addSelectionListener(new SelectionAdapter() {
	    @Override
	    public void widgetSelected(SelectionEvent e) {
		TreeItem item = (TreeItem) e.item;
		if (item.getItemCount() > 0) {
		    item.setExpanded(!item.getExpanded());
		    // update the viewer
		    treeViewerCorsi.refresh();
		}
	    }
	});
	scrolledComposite.setContent(treeCorsi);

	bindToModel(treeViewerCorsi, comboViewer);

    }

    @SuppressWarnings("unchecked")
    private DataBindingContext bindToModel(TreeViewer treeViewerCorsi, ComboViewer comboViewer) {

	DataBindingContext bindingContext = new DataBindingContext();
	List<Integer> anniCorsi = serviceManager.getElencoAnniCorsi();

	// content provider e label provider della combo di filtro
	comboViewer.setContentProvider(ArrayContentProvider.getInstance());
	comboViewer.setInput(anniCorsi);
	comboViewer.setLabelProvider(new LabelProvider() {
	    @Override
	    public String getText(Object element) {
		if (element instanceof Short) {
		    Short anno = (Short) element;
		    return anno.toString();
		}
		return super.getText(element);
	    }
	});
	IViewerObservableValue targetAnnoObservable = ViewersObservables.observeSingleSelection(comboViewer);
	IObservableValue<Integer> modelAnnoObservable = modelManager.getAnnoCorsiObservable();
	bindingContext.bindValue(targetAnnoObservable, modelAnnoObservable);

	// setto il primo valore dell'anno
	modelManager.getAnnoCorsiObservable().setValue(anniCorsi.get(0));

	IObservableList<Corso> elencoCorsiItemsObservableList = modelManager.getElencoCorsiItemsObservableList();

	// Binding treeview
	// Content e label provider
	treeViewerCorsi.setContentProvider(new ElencoCorsiTreeContentProvider());
	treeViewerCorsi.setLabelProvider(new TreeviewCorsiLabelProvider());
	treeViewerCorsi.setInput(elencoCorsiItemsObservableList);
	IViewerObservableValue targetElencoCorsiObservable = ViewersObservables.observeSingleSelection(treeViewerCorsi);

	IObservableValue<Corso> corsoObservable = modelManager.getCorsoObservable();
//	UpdateValueStrategy target2ModelCorsoStrategy = new ConverterUpdateValueStrategy(new Corso2IdCorsoConverter());
//	UpdateValueStrategy model2targetCorsoStrategy = new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE);
//
//	bindingContext.bindValue(targetElencoCorsiObservable, corsoObservable, target2ModelCorsoStrategy,
//		model2targetCorsoStrategy);

	bindingContext.bindValue(targetElencoCorsiObservable, corsoObservable);

	return bindingContext;
    }

    @Override
    public void refresh() {
	treeViewerCorsi.refresh();
    }

    public void setSelection(Corso corso) {
	if (corso != null && corso.getId() != null) {
	    Corso corsoSelected = modelManager.getElencoCorsiItemsObservableList().stream()
		    .filter(c -> c.getId().equals(corso.getId())).findFirst().orElse(null);
	    treeViewerCorsi.setSelection(new StructuredSelection(corsoSelected));
	}
    }

}