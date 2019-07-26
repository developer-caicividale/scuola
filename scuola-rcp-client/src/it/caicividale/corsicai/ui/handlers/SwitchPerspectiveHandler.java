package it.caicividale.corsicai.ui.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SwitchPerspectiveHandler {
    @Execute
    public void execute(MApplication application, EPartService partService, EModelService modelService,
	    @Named("it.caicividale.corsicai.ui.parameter.commandparameter.idperspective") String perspectiveId) {
	MPerspective currentPerspective = modelService.getActivePerspective(application.getSelectedElement());
	if (!perspectiveId.equals(currentPerspective.getElementId())) {
	    MPerspective element = (MPerspective) modelService.find(perspectiveId, application);
	    partService.switchPerspective(element);

	    // Collection<MPart> partCollection = partService.getParts();
	    // for (MPart part : partCollection) {
	    // if (partService.isPartOrPlaceholderInPerspective(part.getElementId(), element) && part.getObject() instanceof IElencoPazientiLoader) {
	    // IElencoPazientiLoader elencoPazientiLoader = (IElencoPazientiLoader) part.getObject();
	    // elencoPazientiLoader.caricaElencoPazienti();
	    // }
	    // }
	}
    }
}
