/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allievo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.AllievoImpl#getIsDiploma <em>Is Diploma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllievoImpl extends PersonaImpl implements Allievo {
    /**
     * The default value of the '{@link #getIsDiploma() <em>Is Diploma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDiploma()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_DIPLOMA_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsDiploma() <em>Is Diploma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDiploma()
     * @generated
     * @ordered
     */
    protected Boolean isDiploma = IS_DIPLOMA_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AllievoImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ALLIEVO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsDiploma() {
	return isDiploma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsDiploma(Boolean newIsDiploma) {
	Boolean oldIsDiploma = isDiploma;
	isDiploma = newIsDiploma;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALLIEVO__IS_DIPLOMA, oldIsDiploma,
		    isDiploma));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ALLIEVO__IS_DIPLOMA:
	    return getIsDiploma();
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
	case ModelPackage.ALLIEVO__IS_DIPLOMA:
	    setIsDiploma((Boolean) newValue);
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
	case ModelPackage.ALLIEVO__IS_DIPLOMA:
	    setIsDiploma(IS_DIPLOMA_EDEFAULT);
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
	case ModelPackage.ALLIEVO__IS_DIPLOMA:
	    return IS_DIPLOMA_EDEFAULT == null ? isDiploma != null : !IS_DIPLOMA_EDEFAULT.equals(isDiploma);
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
	result.append(" (isDiploma: ");
	result.append(isDiploma);
	result.append(')');
	return result.toString();
    }

} //AllievoImpl
