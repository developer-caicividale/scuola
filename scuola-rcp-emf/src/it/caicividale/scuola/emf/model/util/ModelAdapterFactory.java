/**
 */
package it.caicividale.scuola.emf.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import it.caicividale.scuola.emf.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.caicividale.scuola.emf.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelAdapterFactory() {
	if (modelPackage == null) {
	    modelPackage = ModelPackage.eINSTANCE;
	}
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
	if (object == modelPackage) {
	    return true;
	}
	if (object instanceof EObject) {
	    return ((EObject) object).eClass().getEPackage() == modelPackage;
	}
	return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelSwitch<Adapter> modelSwitch = new ModelSwitch<Adapter>() {
	@Override
	public Adapter casePersona(Persona object) {
	    return createPersonaAdapter();
	}

	@Override
	public Adapter caseAllievo(Allievo object) {
	    return createAllievoAdapter();
	}

	@Override
	public Adapter caseCorso(Corso object) {
	    return createCorsoAdapter();
	}

	@Override
	public Adapter caseIscrizione(Iscrizione object) {
	    return createIscrizioneAdapter();
	}

	@Override
	public Adapter caseLezione(Lezione object) {
	    return createLezioneAdapter();
	}

	@Override
	public Adapter caseLezioneTeorica(LezioneTeorica object) {
	    return createLezioneTeoricaAdapter();
	}

	@Override
	public Adapter caseLezionePratica(LezionePratica object) {
	    return createLezionePraticaAdapter();
	}

	@Override
	public Adapter caseIstruttore(Istruttore object) {
	    return createIstruttoreAdapter();
	}

	@Override
	public Adapter caseSquadra(Squadra object) {
	    return createSquadraAdapter();
	}

	@Override
	public Adapter caseBilancio(Bilancio object) {
	    return createBilancioAdapter();
	}

	@Override
	public Adapter caseCassa(Cassa object) {
	    return createCassaAdapter();
	}

	@Override
	public Adapter caseRipartizioneCassa(RipartizioneCassa object) {
	    return createRipartizioneCassaAdapter();
	}

	@Override
	public Adapter casePresenzaLezione(PresenzaLezione object) {
	    return createPresenzaLezioneAdapter();
	}

	@Override
	public Adapter caseDizMateriale(DizMateriale object) {
	    return createDizMaterialeAdapter();
	}

	@Override
	public Adapter caseMaterialeNoleggiato(MaterialeNoleggiato object) {
	    return createMaterialeNoleggiatoAdapter();
	}

	@Override
	public Adapter caseVoceDiSpesa(VoceDiSpesa object) {
	    return createVoceDiSpesaAdapter();
	}

	@Override
	public Adapter caseElencoCorsi(ElencoCorsi object) {
	    return createElencoCorsiAdapter();
	}

	@Override
	public Adapter caseElencoIscrizioni(ElencoIscrizioni object) {
	    return createElencoIscrizioniAdapter();
	}

	@Override
	public Adapter defaultCase(EObject object) {
	    return createEObjectAdapter();
	}
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
	return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Persona <em>Persona</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Persona
     * @generated
     */
    public Adapter createPersonaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Allievo <em>Allievo</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Allievo
     * @generated
     */
    public Adapter createAllievoAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Corso <em>Corso</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Corso
     * @generated
     */
    public Adapter createCorsoAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Iscrizione <em>Iscrizione</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Iscrizione
     * @generated
     */
    public Adapter createIscrizioneAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Lezione <em>Lezione</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Lezione
     * @generated
     */
    public Adapter createLezioneAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.LezioneTeorica <em>Lezione Teorica</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.LezioneTeorica
     * @generated
     */
    public Adapter createLezioneTeoricaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.LezionePratica <em>Lezione Pratica</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.LezionePratica
     * @generated
     */
    public Adapter createLezionePraticaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Istruttore <em>Istruttore</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Istruttore
     * @generated
     */
    public Adapter createIstruttoreAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Squadra <em>Squadra</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Squadra
     * @generated
     */
    public Adapter createSquadraAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Bilancio <em>Bilancio</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Bilancio
     * @generated
     */
    public Adapter createBilancioAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.Cassa <em>Cassa</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.Cassa
     * @generated
     */
    public Adapter createCassaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.RipartizioneCassa <em>Ripartizione Cassa</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.RipartizioneCassa
     * @generated
     */
    public Adapter createRipartizioneCassaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.PresenzaLezione <em>Presenza Lezione</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.PresenzaLezione
     * @generated
     */
    public Adapter createPresenzaLezioneAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.DizMateriale <em>Diz Materiale</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.DizMateriale
     * @generated
     */
    public Adapter createDizMaterialeAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato <em>Materiale Noleggiato</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato
     * @generated
     */
    public Adapter createMaterialeNoleggiatoAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.VoceDiSpesa <em>Voce Di Spesa</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa
     * @generated
     */
    public Adapter createVoceDiSpesaAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.ElencoCorsi <em>Elenco Corsi</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.ElencoCorsi
     * @generated
     */
    public Adapter createElencoCorsiAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link it.caicividale.scuola.emf.model.ElencoIscrizioni <em>Elenco Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see it.caicividale.scuola.emf.model.ElencoIscrizioni
     * @generated
     */
    public Adapter createElencoIscrizioniAdapter() {
	return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
	return null;
    }

} //ModelAdapterFactory
