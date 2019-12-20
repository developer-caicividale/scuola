package it.caicividale.scuola.ui.controllers;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.IViewerObservableValue;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;

import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.ui.parts.tableviewer.labelproviders.MaterialeNoleggiatoLabelProvider;

public class NoleggioController {

    private final IObservableValue<MaterialeNoleggiato> materialeNoleggiatoItemsObservable = WritableValue
	    .withValueType(MaterialeNoleggiato.class);

    public void bind2model() {
	// tabella noleggio
	tableViewerNoleggio.setLabelProvider(new MaterialeNoleggiatoLabelProvider(tableViewerNoleggio));
	ObservableListContentProvider noleggioListContentProvider = new ObservableListContentProvider();
	tableViewerNoleggio.setContentProvider(noleggioListContentProvider);
	IObservableList<MaterialeNoleggiato> materialeNoleggiatoObservableList = EMFProperties
		.list(ModelPackage.Literals.ISCRIZIONE__MATERIALE_NOLEGGIATO).observeDetail(iscrizioneActualObservable);
	tableViewerNoleggio.setInput(materialeNoleggiatoObservableList);
	IViewerObservableValue targetObservableMaterialeNoleggiato = ViewersObservables
		.observeSingleSelection(tableViewerNoleggio);
	bindingContext.bindValue(targetObservableMaterialeNoleggiato, materialeNoleggiatoItemsObservable);

    }
}
