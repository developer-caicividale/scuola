/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import it.caicividale.scuola.emf.model.ElencoIscrizioni;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Iscrizioni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.ElencoIscrizioniImpl#getElencoIscrizioni <em>Elenco Iscrizioni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoIscrizioniImpl extends MinimalEObjectImpl.Container implements ElencoIscrizioni {
    /**
     * The cached value of the '{@link #getElencoIscrizioni() <em>Elenco Iscrizioni</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElencoIscrizioni()
     * @generated
     * @ordered
     */
    protected EList<Iscrizione> elencoIscrizioni;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElencoIscrizioniImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ELENCO_ISCRIZIONI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Iscrizione> getElencoIscrizioni() {
	if (elencoIscrizioni == null) {
	    elencoIscrizioni = new EObjectEList<Iscrizione>(Iscrizione.class, this,
		    ModelPackage.ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI);
	}
	return elencoIscrizioni;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI:
	    return getElencoIscrizioni();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI:
	    getElencoIscrizioni().clear();
	    getElencoIscrizioni().addAll((Collection<? extends Iscrizione>) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI:
	    getElencoIscrizioni().clear();
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI:
	    return elencoIscrizioni != null && !elencoIscrizioni.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //ElencoIscrizioniImpl
