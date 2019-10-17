package it.caicividale.corsicai.model;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;

import it.caicividale.corsicai.services.rest.ServiceManager;
import lombok.Data;

@Data
public class ModelManager {
    private static final ModelManager INSTANCE = new ModelManager();

    // corso selezionato
    private final IObservableValue<Corso> corsoObservable = WritableValue.withValueType(Corso.class);

    // id corso selezionato
    private final IObservableValue<Long> idCorsoObservable = WritableValue.withValueType(Long.class);

    // anno relativo ai corsi
    private final IObservableValue<Integer> annoCorsiObservable = WritableValue.withValueType(Integer.class);

    // elenco delle item corso per anno
    private final IObservableList<Corso> elencoCorsiItemsObservableList = WritableList.withElementType(Corso.class);

    // iscrizione selezionata
    private final IObservableValue<Iscrizione> iscrizioneObservable = WritableValue.withValueType(Iscrizione.class);

    // elenco delle iscrizioni del corso
    private final IObservableList<Iscrizione> elencoIscrizioneObservableList = WritableList
	    .withElementType(Iscrizione.class);

    // dizionaio materiali
    private final IObservableList<DizMateriale> elencoDizMaterialeObservableList = WritableList
	    .withElementType(DizMateriale.class);

//	// riepilogo materiale noleggiato
//	private final IObservableList<RiepilogoNoleggioBean> noleggioObservableList = WritableList
//			.withElementType(RiepilogoNoleggioBean.class);

    // elenco delle iscrizioni del corso
    private final IObservableList<Istruttore> elencoIstruttoriObservableList = WritableList
	    .withElementType(Istruttore.class);
    private final IObservableList<Persona> elencoPersoneInStaffObservableList = WritableList
	    .withElementType(Persona.class);

    // CONFIGURAIZONE
    private final IObservableList<Corso> elencoConfigurazioneCorsiAnnoCorrenteItemsObservableList = WritableList
	    .withElementType(Corso.class);

    private ServiceManager serviceManager = ServiceManager.getInstance();

    // Singleton
    public static ModelManager getInstance() {
	return INSTANCE;
    }

    private ModelManager() {
	// quando cambia l'anno di corso aggiorno la lista ElencoCorsiItem
	annoCorsiObservable.addValueChangeListener(new IValueChangeListener<Integer>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Integer> event) {
		Integer anno = (Integer) ((IObservableValue) event.getSource()).getValue();
		loadElencoCorsi(anno);
	    }
	});

	// quando cambia l'ElencoCorsiItem aggiorno il corso
	idCorsoObservable.addValueChangeListener(new IValueChangeListener<Long>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Long> event) {
		Long idCorso = (Long) ((IObservableValue) event.getSource()).getValue();
		if (idCorso != null) {
		    loadCorso(idCorso);
		}

	    }

	});
    }

    public void loadElencoCorsi(Integer anno) {
	if (anno != null) {
	    elencoCorsiItemsObservableList.clear();
	    elencoCorsiItemsObservableList.addAll(serviceManager.getElencoCorsi(anno));
	}
    }

    public void loadElencoCorsiAnnoSelected() {
	Integer anno = annoCorsiObservable.getValue();
	if (anno != null) {
	    elencoCorsiItemsObservableList.clear();
	    elencoCorsiItemsObservableList.addAll(serviceManager.getElencoCorsi(anno));
	}
    }

    public void caricamentoCorsi() {
	try {

	    loadElencoCorsiAnnoSelected();

	    // carico i dizionari
	    elencoDizMaterialeObservableList.clear();
	    elencoDizMaterialeObservableList.addAll(serviceManager.getDizionarioMateriali());

	    // elenco istruttori (attivi e non)
	    elencoIstruttoriObservableList.clear();
	    elencoIstruttoriObservableList.addAll(serviceManager.getElencoIstruttori(null));

	    // elenco persone in staff
	    elencoPersoneInStaffObservableList.clear();
	    elencoPersoneInStaffObservableList.addAll(serviceManager.getElencoPersoneInStaff());

	} catch (Exception e) {
	    throw new RuntimeException(e.getMessage());
	}
    }

    public void loadCorso(Long idCorso) {
	Corso corso = serviceManager.getCorso(idCorso);
	corsoObservable.setValue(corso);
	elencoIscrizioneObservableList.clear();
	if (corso.getIscrizioni() != null) {
	    elencoIscrizioneObservableList.addAll(corso.getIscrizioni());
	}
//		if (corso.getListRiepilogonoleggio() != null) {
//			noleggioObservableList.clear();
//			noleggioObservableList.addAll(corso.getListRiepilogonoleggio());
//		}
    }
}
