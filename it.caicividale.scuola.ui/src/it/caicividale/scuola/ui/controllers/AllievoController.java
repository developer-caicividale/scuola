package it.caicividale.scuola.ui.controllers;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.swt.widgets.Button;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.service.ModelManager;
import it.caicividale.scuola.ui.composites.AllievoComposite;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class AllievoController extends PersonaController {

    private final AllievoComposite allievoComposite;

    private final Button okButton;
    private final IObservableValue<Allievo> allievoActualObservable;

    ModelManager modelManager = ModelManager.getInstance();

    public AllievoController(AllievoComposite allievoComposite, Button okButton,
	    IObservableValue<Allievo> allievoActualObservable) {
	super(allievoComposite, okButton, allievoActualObservable);
	this.allievoComposite = allievoComposite;
	this.allievoActualObservable = allievoActualObservable;
	this.okButton = okButton;

    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void bind2model() {
	super.bind2model();

    }

    public IObservableValue<Allievo> getIscrizioneActualObservable() {
	return allievoActualObservable;
    }
}
