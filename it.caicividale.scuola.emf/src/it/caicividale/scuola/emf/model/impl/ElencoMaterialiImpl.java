/**
 */
package it.caicividale.scuola.emf.model.impl;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ElencoMateriali;
import it.caicividale.scuola.emf.model.ModelPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Materiali</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.ElencoMaterialiImpl#getElencoMateriali <em>Elenco Materiali</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoMaterialiImpl extends MinimalEObjectImpl.Container implements ElencoMateriali {
    /**
     * The cached value of the '{@link #getElencoMateriali() <em>Elenco Materiali</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElencoMateriali()
     * @generated
     * @ordered
     */
    protected EList<DizMateriale> elencoMateriali;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElencoMaterialiImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ELENCO_MATERIALI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DizMateriale> getElencoMateriali() {
	if (elencoMateriali == null) {
	    elencoMateriali = new EObjectEList<DizMateriale>(DizMateriale.class, this,
		    ModelPackage.ELENCO_MATERIALI__ELENCO_MATERIALI);
	}
	return elencoMateriali;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ELENCO_MATERIALI__ELENCO_MATERIALI:
	    return getElencoMateriali();
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
	case ModelPackage.ELENCO_MATERIALI__ELENCO_MATERIALI:
	    getElencoMateriali().clear();
	    getElencoMateriali().addAll((Collection<? extends DizMateriale>) newValue);
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
	case ModelPackage.ELENCO_MATERIALI__ELENCO_MATERIALI:
	    getElencoMateriali().clear();
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
	case ModelPackage.ELENCO_MATERIALI__ELENCO_MATERIALI:
	    return elencoMateriali != null && !elencoMateriali.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //ElencoMaterialiImpl
