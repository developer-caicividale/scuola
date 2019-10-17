/**
 */
package it.caicividale.corsicai.model.util;

import it.caicividale.corsicai.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.caicividale.corsicai.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelSwitch() {
	if (modelPackage == null) {
	    modelPackage = ModelPackage.eINSTANCE;
	}
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
	return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
	switch (classifierID) {
	case ModelPackage.PERSONA: {
	    Persona persona = (Persona) theEObject;
	    T result = casePersona(persona);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.ALLIEVO: {
	    Allievo allievo = (Allievo) theEObject;
	    T result = caseAllievo(allievo);
	    if (result == null)
		result = casePersona(allievo);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.CORSO: {
	    Corso corso = (Corso) theEObject;
	    T result = caseCorso(corso);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.ISCRIZIONE: {
	    Iscrizione iscrizione = (Iscrizione) theEObject;
	    T result = caseIscrizione(iscrizione);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.LEZIONE: {
	    Lezione lezione = (Lezione) theEObject;
	    T result = caseLezione(lezione);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.LEZIONE_TEORICA: {
	    LezioneTeorica lezioneTeorica = (LezioneTeorica) theEObject;
	    T result = caseLezioneTeorica(lezioneTeorica);
	    if (result == null)
		result = caseLezione(lezioneTeorica);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.LEZIONE_PRATICA: {
	    LezionePratica lezionePratica = (LezionePratica) theEObject;
	    T result = caseLezionePratica(lezionePratica);
	    if (result == null)
		result = caseLezione(lezionePratica);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.ISTRUTTORE: {
	    Istruttore istruttore = (Istruttore) theEObject;
	    T result = caseIstruttore(istruttore);
	    if (result == null)
		result = casePersona(istruttore);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.SQUADRA: {
	    Squadra squadra = (Squadra) theEObject;
	    T result = caseSquadra(squadra);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.BILANCIO: {
	    Bilancio bilancio = (Bilancio) theEObject;
	    T result = caseBilancio(bilancio);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.CASSA: {
	    Cassa cassa = (Cassa) theEObject;
	    T result = caseCassa(cassa);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.RIPARTIZIONE_CASSA: {
	    RipartizioneCassa ripartizioneCassa = (RipartizioneCassa) theEObject;
	    T result = caseRipartizioneCassa(ripartizioneCassa);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.PRESENZA_LEZIONE: {
	    PresenzaLezione presenzaLezione = (PresenzaLezione) theEObject;
	    T result = casePresenzaLezione(presenzaLezione);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.DIZ_MATERIALE: {
	    DizMateriale dizMateriale = (DizMateriale) theEObject;
	    T result = caseDizMateriale(dizMateriale);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.MATERIALE_NOLEGGIATO: {
	    MaterialeNoleggiato materialeNoleggiato = (MaterialeNoleggiato) theEObject;
	    T result = caseMaterialeNoleggiato(materialeNoleggiato);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	case ModelPackage.VOCE_DI_SPESA: {
	    VoceDiSpesa voceDiSpesa = (VoceDiSpesa) theEObject;
	    T result = caseVoceDiSpesa(voceDiSpesa);
	    if (result == null)
		result = defaultCase(theEObject);
	    return result;
	}
	default:
	    return defaultCase(theEObject);
	}
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Persona</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Persona</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePersona(Persona object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Allievo</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Allievo</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAllievo(Allievo object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Corso</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Corso</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCorso(Corso object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Iscrizione</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Iscrizione</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIscrizione(Iscrizione object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lezione</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lezione</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLezione(Lezione object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lezione Teorica</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lezione Teorica</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLezioneTeorica(LezioneTeorica object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Lezione Pratica</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lezione Pratica</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLezionePratica(LezionePratica object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Istruttore</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Istruttore</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIstruttore(Istruttore object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Squadra</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Squadra</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSquadra(Squadra object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bilancio</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bilancio</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBilancio(Bilancio object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cassa</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cassa</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCassa(Cassa object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ripartizione Cassa</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ripartizione Cassa</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRipartizioneCassa(RipartizioneCassa object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Presenza Lezione</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Presenza Lezione</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePresenzaLezione(PresenzaLezione object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Diz Materiale</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Diz Materiale</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDizMateriale(DizMateriale object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Materiale Noleggiato</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Materiale Noleggiato</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaterialeNoleggiato(MaterialeNoleggiato object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voce Di Spesa</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voce Di Spesa</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoceDiSpesa(VoceDiSpesa object) {
	return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
	return null;
    }

} //ModelSwitch
