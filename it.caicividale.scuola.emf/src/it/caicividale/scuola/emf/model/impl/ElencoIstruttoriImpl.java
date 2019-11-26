/**
 */
package it.caicividale.scuola.emf.model.impl;

import it.caicividale.scuola.emf.model.ElencoIstruttori;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elenco Istruttori</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.ElencoIstruttoriImpl#getElencoIstruttori <em>Elenco Istruttori</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElencoIstruttoriImpl extends MinimalEObjectImpl.Container implements ElencoIstruttori {
    /**
     * The cached value of the '{@link #getElencoIstruttori() <em>Elenco Istruttori</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElencoIstruttori()
     * @generated
     * @ordered
     */
    protected EList<Istruttore> elencoIstruttori;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElencoIstruttoriImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ELENCO_ISTRUTTORI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Istruttore> getElencoIstruttori() {
	if (elencoIstruttori == null) {
	    elencoIstruttori = new EObjectEList<Istruttore>(Istruttore.class, this,
		    ModelPackage.ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI);
	}
	return elencoIstruttori;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI:
	    return getElencoIstruttori();
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
	case ModelPackage.ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI:
	    getElencoIstruttori().clear();
	    getElencoIstruttori().addAll((Collection<? extends Istruttore>) newValue);
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
	case ModelPackage.ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI:
	    getElencoIstruttori().clear();
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
	case ModelPackage.ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI:
	    return elencoIstruttori != null && !elencoIstruttori.isEmpty();
	}
	return super.eIsSet(featureID);
    }

} //ElencoIstruttoriImpl
