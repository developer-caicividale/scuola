/**
 */
package it.caicividale.scuola.emf.model.impl;

import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.ElencoComuni;
import it.caicividale.scuola.emf.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Comuni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.ElencoComuniImpl#getElencoComuni <em>Elenco Comuni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoComuniImpl extends MinimalEObjectImpl.Container implements ElencoComuni {
    /**
     * The cached value of the '{@link #getElencoComuni() <em>Elenco Comuni</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElencoComuni()
     * @generated
     * @ordered
     */
    protected EList<DizComune> elencoComuni;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElencoComuniImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ELENCO_COMUNI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DizComune> getElencoComuni() {
	if (elencoComuni == null) {
	    elencoComuni = new EObjectEList<DizComune>(DizComune.class, this,
		    ModelPackage.ELENCO_COMUNI__ELENCO_COMUNI);
	}
	return elencoComuni;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ELENCO_COMUNI__ELENCO_COMUNI:
	    return getElencoComuni();
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
	case ModelPackage.ELENCO_COMUNI__ELENCO_COMUNI:
	    getElencoComuni().clear();
	    getElencoComuni().addAll((Collection<? extends DizComune>) newValue);
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
	case ModelPackage.ELENCO_COMUNI__ELENCO_COMUNI:
	    getElencoComuni().clear();
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
	case ModelPackage.ELENCO_COMUNI__ELENCO_COMUNI:
	    return elencoComuni != null && !elencoComuni.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //ElencoComuniImpl
