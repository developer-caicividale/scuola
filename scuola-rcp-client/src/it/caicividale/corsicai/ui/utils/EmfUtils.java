package it.caicividale.corsicai.ui.utils;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EmfUtils {
    public static int getIndexOfEObject(List<? extends EObject> list, EObject object) {
	int index = -1;
	boolean find = false;
	for (EObject objectinList : list) {
	    index++;
	    if (EcoreUtil.equals(objectinList, object)) {
		find = true;
		break;
	    }
	}
	if (!find) {
	    throw new RuntimeException("Oggetto non trovato");
	}
	return index;
    }
}
