/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.ElencoIscrizioni;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelPackage;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Iscrizioni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.ElencoIscrizioniImpl#getElencoIscrizioni <em>Elenco Iscrizioni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoIscrizioniImpl extends ExternalizableEObjectImpl implements ElencoIscrizioni {
    /**
     * The cached value of the '{@link #getElencoIscrizioni() <em>Elenco Iscrizioni</em>}' reference list.
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
	    elencoIscrizioni = new EObjectResolvingEList<Iscrizione>(Iscrizione.class, this,
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
