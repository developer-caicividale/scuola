package it.caicividale.scuola.ui.utils;

import java.util.Collection;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import it.caicividale.scuola.ui.parts.IMyPart;

public class PartsUtils {

    public static void refreshMyParts(EPartService partService) {
	Collection<MPart> mParts = partService.getParts();
	for (MPart mPart : mParts) {

	    if (mPart.getObject() instanceof IMyPart) {
		// partService.hidePart(mPart, true);
		// partService.showPart(mPart, PartState.VISIBLE);
		((IMyPart) mPart.getObject()).refresh();

	    }

	}

    }

    public static MPart getPart(EPartService partService, String id) {
	Collection<MPart> mParts = partService.getParts();
	for (MPart mPart : mParts) {
	    if (mPart.getElementId().equals(id)) {
		return mPart;
	    }
	}
	return null;
    }

}
