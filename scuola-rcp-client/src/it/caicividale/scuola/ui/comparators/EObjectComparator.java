package it.caicividale.scuola.ui.comparators;

import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EObjectComparator<T extends EObject> implements Comparator<T> {
    private static final int BEFORE = -1;
    private static final int EQUAL = 0;
    private static final int AFTER = 1;

    private final EStructuralFeature feature;

    public EObjectComparator(EStructuralFeature feature) {
	this.feature = feature;
    }

    @Override
    public int compare(T t1, T t2) {
	if (t1 == null & t2 == null) {
	    return EQUAL;
	} else if (t1 == null & t2 != null) {
	    return AFTER;
	} else if (t1 != null & t2 == null) {
	    return BEFORE;
	} else {
	    return new CompareToBuilder().append(t1.eGet(feature), t2.eGet(feature)).toComparison();
	}
    }

}
