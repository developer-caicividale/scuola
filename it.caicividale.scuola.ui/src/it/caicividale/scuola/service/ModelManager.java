package it.caicividale.scuola.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;

import it.caicividale.scuola.NumeroAllieviBean;
import it.caicividale.scuola.emf.model.Corso;
import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.Persona;
import it.caicividale.scuola.emf.model.adapters.ChangeDataAdapter;
import lombok.Data;

@Data
public class ModelManager {
    private static final ModelManager INSTANCE = new ModelManager();

    // corso selezionato
    private final IObservableValue<Corso> corsoObservable = WritableValue.withValueType(Corso.class);

    private final ChangeDataAdapter changeDataAdapter = new ChangeDataAdapter();

//    // id corso selezionato
//    private final IObservableValue<Long> idCorsoObservable = WritableValue.withValueType(Long.class);

    // anno relativo ai corsi
    private final IObservableValue<Integer> annoCorsiObservable = WritableValue.withValueType(Integer.class);

    private final IObservableValue<NumeroAllieviBean> numeroAllieviBeanObservable = WritableValue
	    .withValueType(NumeroAllieviBean.class);

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

    // dizionaio comuni
//    private final IObservableList<DizComune> elencoDizComuneObservableList = WritableList
//	    .withElementType(DizComune.class);
    List<DizComune> elencoDizComuniResidenza = new ArrayList<>();
    List<DizComune> elencoDizComuniNascita = new ArrayList<>();
    List<String> regioni = new ArrayList<>();

    private final IObservableValue<String> regioneResidenzaObservable = WritableValue.withValueType(String.class);
    private final IObservableValue<String> regioneNascitaObservable = WritableValue.withValueType(String.class);

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
	corsoObservable.addValueChangeListener(new IValueChangeListener<Corso>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Corso> event) {
		Corso corso = (Corso) ((IObservableValue) event.getSource()).getValue();
		if (corso != null) {
		    corso.eAdapters().add(changeDataAdapter);
		}

	    }

	});

	iscrizioneObservable.addValueChangeListener(new IValueChangeListener<Iscrizione>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends Iscrizione> event) {
//		NumeroAllieviBean numeroAllieviBean = new NumeroAllieviBean();
//		numeroAllieviBeanObservable.setValue(numeroAllieviBean);
		if (numeroAllieviBeanObservable.getValue() != null) {
		    numeroAllieviBeanObservable.getValue().ricalcolaConteggi();
		}
	    }

	});

	IListChangeListener<? super Iscrizione> listener;
	elencoIscrizioneObservableList.addListChangeListener(new IListChangeListener<Iscrizione>() {

	    @Override
	    public void handleListChange(ListChangeEvent<? extends Iscrizione> event) {
		System.out.println("Cambiamento lista iscrizioni rilevato:" + event.diff.toString());

	    }

	});

	regioneResidenzaObservable.addValueChangeListener(new IValueChangeListener<String>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends String> event) {
		String regione = (String) ((IObservableValue) event.getSource()).getValue();
		if (regione != null) {
		    elencoDizComuniResidenza.clear();
		    if (Optional.ofNullable(regioneNascitaObservable.getValue()).orElse("").equals(regione)) {
			elencoDizComuniNascita.addAll(elencoDizComuniResidenza.stream().collect(Collectors.toList()));
		    } else {
			List<DizComune> dizionarioComuni = serviceManager.getDizionarioComuni(regione);
			elencoDizComuniResidenza.addAll(dizionarioComuni);
		    }
		}
	    }

	});

	regioneNascitaObservable.addValueChangeListener(new IValueChangeListener<String>() {

	    @Override
	    public void handleValueChange(ValueChangeEvent<? extends String> event) {
		String regione = (String) ((IObservableValue) event.getSource()).getValue();
		if (regione != null) {
		    elencoDizComuniNascita.clear();
		    if (Optional.ofNullable(regioneResidenzaObservable.getValue()).orElse("").equals(regione)) {
			elencoDizComuniNascita.addAll(elencoDizComuniResidenza.stream().collect(Collectors.toList()));
		    } else {
			List<DizComune> dizionarioComuni = serviceManager.getDizionarioComuni(regione);
			elencoDizComuniNascita.addAll(dizionarioComuni);
		    }
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
	if (anno == null) {
	    anno = LocalDate.now().getYear();
	}

	elencoCorsiItemsObservableList.clear();
	elencoCorsiItemsObservableList.addAll(serviceManager.getElencoCorsi(anno));

    }

    public void caricamentoCorsi() {
	try {

	    loadDizionari();

	    loadElencoCorsiAnnoSelected();

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

    public void loadDizionari() {
	// carico i dizionari
	elencoDizMaterialeObservableList.clear();
	elencoDizMaterialeObservableList.addAll(serviceManager.getDizionarioMateriali());

	regioni.clear();
	regioni.addAll(serviceManager.getDizionarioRegioni());
    }

}
