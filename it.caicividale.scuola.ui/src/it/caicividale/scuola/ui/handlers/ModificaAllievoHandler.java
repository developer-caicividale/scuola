
package it.caicividale.scuola.ui.handlers;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.service.ServiceManager;
import it.caicividale.scuola.ui.dialogs.AllievoDialog;
import it.caicividale.scuola.ui.utils.EmfUtils;

public class ModificaAllievoHandler {
    @Inject
    @Optional
    private Shell shell;

    public static final String ID = "it.caicividale.scuola.ui.part.iscrizioni";
    private ServiceManager serviceManager = ServiceManager.getInstance();

    @Execute
    public void execute(EPartService partService, IStylingEngine stylingEngine) {
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null) {
	    Iscrizione iscrizione = ModelManager.getInstance().getIscrizioneObservable().getValue();
	    Iscrizione iscrizioneOld = EcoreUtil.copy(iscrizione);
	    // int position = IntStream.range(0,
	    // modelManager.getCorsoObservable().getValue().getIscrizioni().size())
	    // .filter(i -> iscrizione.getId() ==
	    // modelManager.getCorsoObservable().getValue().getIscrizioni().get(i).getId()).findFirst().orElse(-1);

	    if (iscrizione != null) {
		int index = EmfUtils.getIndexOfEObject(corso.getIscrizioni(), iscrizione);
		Allievo allievo = iscrizione.getAllievo();

		AllievoDialog dialog = new AllievoDialog(shell, allievo, stylingEngine);
		if (dialog.open() == Window.OK) {
		    List<Iscrizione> iscrizioni = corso.getIscrizioni();
		    iscrizione.setAllievo(allievo);
		    iscrizioni.set(index, iscrizione);
		    serviceManager.update(iscrizione, corso.getId());
//		    // L'ooservabile Corso non reagisce ai cambiamenti della lista iscrizione, forzo
//		    // il cambiamento copiando l'oggetto
		    modelManager.getCorsoObservable().setValue(EcoreUtil.copy(corso));

		    // modelManager.getIscrizioneObservable().setValue(iscrizione);

		} else {
		    ModelManager.getInstance().getIscrizioneObservable().setValue(iscrizioneOld);
		    corso.getIscrizioni().set(index, iscrizioneOld);
		}
	    } else {
		MessageDialog.openError(shell, "Errore", "Selezionare un allievo");
	    }
	} else {
	    MessageDialog.openError(shell, "Errore", "Selezionare un corso");
	}
    }

}