/**
 */
package it.caicividale.scuola.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import it.caicividale.scuola.emf.model.LezioneTeorica;
import it.caicividale.scuola.emf.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lezione Teorica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.LezioneTeoricaImpl#getDocente <em>Docente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LezioneTeoricaImpl extends LezioneImpl implements LezioneTeorica {
    /**
     * The default value of the '{@link #getDocente() <em>Docente</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocente()
     * @generated
     * @ordered
     */
    protected static final String DOCENTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDocente() <em>Docente</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocente()
     * @generated
     * @ordered
     */
    protected String docente = DOCENTE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LezioneTeoricaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.LEZIONE_TEORICA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDocente() {
	return docente;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDocente(String newDocente) {
	String oldDocente = docente;
	docente = newDocente;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE_TEORICA__DOCENTE, oldDocente,
		    docente));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.LEZIONE_TEORICA__DOCENTE:
	    return getDocente();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.LEZIONE_TEORICA__DOCENTE:
	    setDocente((String) newValue);
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
	case ModelPackage.LEZIONE_TEORICA__DOCENTE:
	    setDocente(DOCENTE_EDEFAULT);
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
	case ModelPackage.LEZIONE_TEORICA__DOCENTE:
	    return DOCENTE_EDEFAULT == null ? docente != null : !DOCENTE_EDEFAULT.equals(docente);
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuilder result = new StringBuilder(super.toString());
	result.append(" (Docente: ");
	result.append(docente);
	result.append(')');
	return result.toString();
    }

} //LezioneTeoricaImpl
