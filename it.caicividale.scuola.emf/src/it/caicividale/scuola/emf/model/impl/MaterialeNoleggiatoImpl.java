/**
 */
package it.caicividale.scuola.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelPackage;
import java.time.LocalDate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materiale Noleggiato</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl#getMateriale <em>Materiale</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl#getQuantita <em>Quantita</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl#getDataNoleggio <em>Data Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialeNoleggiatoImpl extends MinimalEObjectImpl.Container implements MaterialeNoleggiato {
    /**
     * The cached value of the '{@link #getMateriale() <em>Materiale</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMateriale()
     * @generated
     * @ordered
     */
    protected DizMateriale materiale;

    /**
     * The default value of the '{@link #getQuantita() <em>Quantita</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantita()
     * @generated
     * @ordered
     */
    protected static final short QUANTITA_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getQuantita() <em>Quantita</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuantita()
     * @generated
     * @ordered
     */
    protected short quantita = QUANTITA_EDEFAULT;

    /**
     * The default value of the '{@link #getDataNoleggio() <em>Data Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataNoleggio()
     * @generated
     * @ordered
     */
    protected static final LocalDate DATA_NOLEGGIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataNoleggio() <em>Data Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataNoleggio()
     * @generated
     * @ordered
     */
    protected LocalDate dataNoleggio = DATA_NOLEGGIO_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final long ID_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected long id = ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaterialeNoleggiatoImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.MATERIALE_NOLEGGIATO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DizMateriale getMateriale() {
	return materiale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMateriale(DizMateriale newMateriale) {
	DizMateriale oldMateriale = materiale;
	materiale = newMateriale;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIALE_NOLEGGIATO__MATERIALE,
		    oldMateriale, materiale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public short getQuantita() {
	return quantita;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuantita(short newQuantita) {
	short oldQuantita = quantita;
	quantita = newQuantita;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIALE_NOLEGGIATO__QUANTITA,
		    oldQuantita, quantita));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalDate getDataNoleggio() {
	return dataNoleggio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataNoleggio(LocalDate newDataNoleggio) {
	LocalDate oldDataNoleggio = dataNoleggio;
	dataNoleggio = newDataNoleggio;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO,
		    oldDataNoleggio, dataNoleggio));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(long newId) {
	long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MATERIALE_NOLEGGIATO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.MATERIALE_NOLEGGIATO__MATERIALE:
	    return getMateriale();
	case ModelPackage.MATERIALE_NOLEGGIATO__QUANTITA:
	    return getQuantita();
	case ModelPackage.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO:
	    return getDataNoleggio();
	case ModelPackage.MATERIALE_NOLEGGIATO__ID:
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
	case ModelPackage.MATERIALE_NOLEGGIATO__MATERIALE:
	    setMateriale((DizMateriale) newValue);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__QUANTITA:
	    setQuantita((Short) newValue);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO:
	    setDataNoleggio((LocalDate) newValue);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__ID:
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
	case ModelPackage.MATERIALE_NOLEGGIATO__MATERIALE:
	    setMateriale((DizMateriale) null);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__QUANTITA:
	    setQuantita(QUANTITA_EDEFAULT);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO:
	    setDataNoleggio(DATA_NOLEGGIO_EDEFAULT);
	    return;
	case ModelPackage.MATERIALE_NOLEGGIATO__ID:
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
	case ModelPackage.MATERIALE_NOLEGGIATO__MATERIALE:
	    return materiale != null;
	case ModelPackage.MATERIALE_NOLEGGIATO__QUANTITA:
	    return quantita != QUANTITA_EDEFAULT;
	case ModelPackage.MATERIALE_NOLEGGIATO__DATA_NOLEGGIO:
	    return DATA_NOLEGGIO_EDEFAULT == null ? dataNoleggio != null : !DATA_NOLEGGIO_EDEFAULT.equals(dataNoleggio);
	case ModelPackage.MATERIALE_NOLEGGIATO__ID:
	    return id != ID_EDEFAULT;
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
	result.append(" (quantita: ");
	result.append(quantita);
	result.append(", dataNoleggio: ");
	result.append(dataNoleggio);
	result.append(", id: ");
	result.append(id);
	result.append(')');
	return result.toString();
    }

} //MaterialeNoleggiatoImpl
