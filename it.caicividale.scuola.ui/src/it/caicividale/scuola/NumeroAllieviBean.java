package it.caicividale.scuola;

import it.caicividale.scuola.service.ModelManager;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class NumeroAllieviBean {

    private Long numeroAllievi;
    private Long numeroAllieviIscrizioneOk;
    private Long numeroAllieviIscrizioneKo;
    private Long numeroAllieviMaschi;
    private Long numeroAllieviFemmine;
    private Long numeroNuoviAllievi;

    private final ModelManager modelManager = ModelManager.getInstance();

    public Long getNumeroAllievi() {
	numeroAllievi = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllievi()
		: 0L;
	return numeroAllievi;
    }

    public Long getNumeroAllieviIscrizioneOk() {

	numeroAllieviIscrizioneOk = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllieviIscrizioneOk()
		: 0L;

	return numeroAllieviIscrizioneOk;
    }

    public Long getNumeroAllieviIscrizioneKo() {
	numeroAllieviIscrizioneKo = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllieviIscrizioneKo()
		: 0L;

	return numeroAllieviIscrizioneKo;

    }

    public Long getNumeroAllieviMaschi() {
	numeroAllieviMaschi = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllieviMaschi()
		: 0L;
	return numeroAllieviMaschi;

    }

    public Long getNumeroAllieviFemmine() {
	numeroAllieviFemmine = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllieviFemmine()
		: 0L;

	return numeroAllieviFemmine;
    }

    public Long getNumeroNuoviAllievi() {
	numeroNuoviAllievi = modelManager.getCorsoObservable().getValue() != null
		? modelManager.getCorsoObservable().getValue().getNumeroAllieviNuoviIscritti()
		: 0L;
	return numeroNuoviAllievi;

    }

    public void ricalcolaConteggi() {
	getNumeroAllievi();
	getNumeroAllieviMaschi();
	getNumeroAllieviFemmine();
	getNumeroAllieviIscrizioneOk();
	getNumeroAllieviIscrizioneKo();

    }

}
