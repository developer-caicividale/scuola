/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.ETitoloIstruttore;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Istruttore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.IstruttoreImpl#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.IstruttoreImpl#getIsAttivo <em>Is Attivo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IstruttoreImpl extends PersonaImpl implements Istruttore {
    /**
     * The default value of the '{@link #getTitolo() <em>Titolo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitolo()
     * @generated
     * @ordered
     */
    protected static final ETitoloIstruttore TITOLO_EDEFAULT = ETitoloIstruttore.ISTRUTTORE_SEZIONALE;

    /**
     * The cached value of the '{@link #getTitolo() <em>Titolo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitolo()
     * @generated
     * @ordered
     */
    protected ETitoloIstruttore titolo = TITOLO_EDEFAULT;

    /**
     * The default value of the '{@link #getIsAttivo() <em>Is Attivo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsAttivo()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ATTIVO_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getIsAttivo() <em>Is Attivo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsAttivo()
     * @generated
     * @ordered
     */
    protected Boolean isAttivo = IS_ATTIVO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IstruttoreImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ISTRUTTORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETitoloIstruttore getTitolo() {
	return titolo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitolo(ETitoloIstruttore newTitolo) {
	ETitoloIstruttore oldTitolo = titolo;
	titolo = newTitolo == null ? TITOLO_EDEFAULT : newTitolo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISTRUTTORE__TITOLO, oldTitolo, titolo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsAttivo() {
	return isAttivo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsAttivo(Boolean newIsAttivo) {
	Boolean oldIsAttivo = isAttivo;
	isAttivo = newIsAttivo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISTRUTTORE__IS_ATTIVO, oldIsAttivo,
		    isAttivo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ISTRUTTORE__TITOLO:
	    return getTitolo();
	case ModelPackage.ISTRUTTORE__IS_ATTIVO:
	    return getIsAttivo();
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
	case ModelPackage.ISTRUTTORE__TITOLO:
	    setTitolo((ETitoloIstruttore) newValue);
	    return;
	case ModelPackage.ISTRUTTORE__IS_ATTIVO:
	    setIsAttivo((Boolean) newValue);
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
	case ModelPackage.ISTRUTTORE__TITOLO:
	    setTitolo(TITOLO_EDEFAULT);
	    return;
	case ModelPackage.ISTRUTTORE__IS_ATTIVO:
	    setIsAttivo(IS_ATTIVO_EDEFAULT);
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
	case ModelPackage.ISTRUTTORE__TITOLO:
	    return titolo != TITOLO_EDEFAULT;
	case ModelPackage.ISTRUTTORE__IS_ATTIVO:
	    return IS_ATTIVO_EDEFAULT == null ? isAttivo != null : !IS_ATTIVO_EDEFAULT.equals(isAttivo);
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
	result.append(" (titolo: ");
	result.append(titolo);
	result.append(", isAttivo: ");
	result.append(isAttivo);
	result.append(')');
	return result.toString();
    }

} //IstruttoreImpl
