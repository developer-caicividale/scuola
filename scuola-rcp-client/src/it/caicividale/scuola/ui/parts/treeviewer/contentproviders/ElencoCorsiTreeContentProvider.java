package it.caicividale.scuola.ui.parts.treeviewer.contentproviders;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

import it.caicividale.scuola.emf.model.Corso;

public class ElencoCorsiTreeContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
	@SuppressWarnings("unchecked")
	List<Corso> elencoCorsiItems = (List<Corso>) inputElement;
	List<Corso> elencoCorsiItemsSoloCorsi = elencoCorsiItems.stream().filter(corsoItem -> !corsoItem.getIsModulo()).collect(Collectors.toList());
	return ArrayContentProvider.getInstance().getElements(elencoCorsiItemsSoloCorsi);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof Corso) {
	    Corso corso = (Corso) parentElement;
	    if (corso.getModuli() != null && !corso.getModuli().isEmpty()) {
		return corso.getModuli().toArray();
	    }
	}
	return null;
    }

    @Override
    public Object getParent(Object element) {
	return null;
    }

    @Override
    public boolean hasChildren(Object element) {
	if (element instanceof Corso) {
	    Corso corso = (Corso) element;
	    if (corso.getModuli() != null && !corso.getModuli().isEmpty()) {
		return true;
	    }
	}
	return false;
    }

}
