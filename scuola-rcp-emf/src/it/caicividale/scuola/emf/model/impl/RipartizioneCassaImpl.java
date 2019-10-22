/**
 */
package it.caicividale.scuola.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.RipartizioneCassa;
import it.caicividale.scuola.emf.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ripartizione Cassa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl#getSede <em>Sede</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl#getQuota <em>Quota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RipartizioneCassaImpl extends ExternalizableEObjectImpl implements RipartizioneCassa {
    /**
     * The default value of the '{@link #getSede() <em>Sede</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSede()
     * @generated
     * @ordered
     */
    protected static final String SEDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSede() <em>Sede</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSede()
     * @generated
     * @ordered
     */
    protected String sede = SEDE_EDEFAULT;

    /**
     * The default value of the '{@link #getQuota() <em>Quota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuota()
     * @generated
     * @ordered
     */
    protected static final float QUOTA_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getQuota() <em>Quota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuota()
     * @generated
     * @ordered
     */
    protected float quota = QUOTA_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final Long ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected Long id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RipartizioneCassaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.RIPARTIZIONE_CASSA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSede() {
	return sede;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSede(String newSede) {
	String oldSede = sede;
	sede = newSede;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RIPARTIZIONE_CASSA__SEDE, oldSede,
		    sede));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getQuota() {
	return quota;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuota(float newQuota) {
	float oldQuota = quota;
	quota = newQuota;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RIPARTIZIONE_CASSA__QUOTA, oldQuota,
		    quota));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(Long newId) {
	Long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RIPARTIZIONE_CASSA__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.RIPARTIZIONE_CASSA__SEDE:
	    return getSede();
	case ModelPackage.RIPARTIZIONE_CASSA__QUOTA:
	    return getQuota();
	case ModelPackage.RIPARTIZIONE_CASSA__ID:
	    return getId();
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
	case ModelPackage.RIPARTIZIONE_CASSA__SEDE:
	    setSede((String) newValue);
	    return;
	case ModelPackage.RIPARTIZIONE_CASSA__QUOTA:
	    setQuota((Float) newValue);
	    return;
	case ModelPackage.RIPARTIZIONE_CASSA__ID:
	    setId((Long) newValue);
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
	case ModelPackage.RIPARTIZIONE_CASSA__SEDE:
	    setSede(SEDE_EDEFAULT);
	    return;
	case ModelPackage.RIPARTIZIONE_CASSA__QUOTA:
	    setQuota(QUOTA_EDEFAULT);
	    return;
	case ModelPackage.RIPARTIZIONE_CASSA__ID:
	    setId(ID_EDEFAULT);
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
	case ModelPackage.RIPARTIZIONE_CASSA__SEDE:
	    return SEDE_EDEFAULT == null ? sede != null : !SEDE_EDEFAULT.equals(sede);
	case ModelPackage.RIPARTIZIONE_CASSA__QUOTA:
	    return quota != QUOTA_EDEFAULT;
	case ModelPackage.RIPARTIZIONE_CASSA__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
	result.append(" (sede: ");
	result.append(sede);
	result.append(", quota: ");
	result.append(quota);
	result.append(", id: ");
	result.append(id);
	result.append(')');
	return result.toString();
    }

} //RipartizioneCassaImpl
