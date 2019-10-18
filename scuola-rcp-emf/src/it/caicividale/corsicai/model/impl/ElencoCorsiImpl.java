/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.ElencoCorsi;
import it.caicividale.corsicai.model.ModelPackage;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Corsi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.ElencoCorsiImpl#getElencoCorsi <em>Elenco Corsi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoCorsiImpl extends ExternalizableEObjectImpl implements ElencoCorsi {
    /**
     * The cached value of the '{@link #getElencoCorsi() <em>Elenco Corsi</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElencoCorsi()
     * @generated
     * @ordered
     */
    protected EList<Corso> elencoCorsi;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElencoCorsiImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ELENCO_CORSI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Corso> getElencoCorsi() {
	if (elencoCorsi == null) {
	    elencoCorsi = new EObjectResolvingEList<Corso>(Corso.class, this, ModelPackage.ELENCO_CORSI__ELENCO_CORSI);
	}
	return elencoCorsi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ELENCO_CORSI__ELENCO_CORSI:
	    return getElencoCorsi();
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
	case ModelPackage.ELENCO_CORSI__ELENCO_CORSI:
	    getElencoCorsi().clear();
	    getElencoCorsi().addAll((Collection<? extends Corso>) newValue);
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
	case ModelPackage.ELENCO_CORSI__ELENCO_CORSI:
	    getElencoCorsi().clear();
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
	case ModelPackage.ELENCO_CORSI__ELENCO_CORSI:
	    return elencoCorsi != null && !elencoCorsi.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //ElencoCorsiImpl
