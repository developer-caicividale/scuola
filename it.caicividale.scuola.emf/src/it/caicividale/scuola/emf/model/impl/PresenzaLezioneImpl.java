/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.PresenzaLezione;
import it.caicividale.scuola.emf.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presenza Lezione</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl#getAllieviPresenti <em>Allievi Presenti</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl#getIstruttoriPresenti <em>Istruttori Presenti</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenzaLezioneImpl extends ExternalizableEObjectImpl implements PresenzaLezione {
    /**
     * The cached value of the '{@link #getAllieviPresenti() <em>Allievi Presenti</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllieviPresenti()
     * @generated
     * @ordered
     */
    protected EList<Allievo> allieviPresenti;

    /**
     * The cached value of the '{@link #getIstruttoriPresenti() <em>Istruttori Presenti</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIstruttoriPresenti()
     * @generated
     * @ordered
     */
    protected EList<Istruttore> istruttoriPresenti;

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
    protected PresenzaLezioneImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.PRESENZA_LEZIONE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Allievo> getAllieviPresenti() {
	if (allieviPresenti == null) {
	    allieviPresenti = new EObjectResolvingEList<Allievo>(Allievo.class, this,
		    ModelPackage.PRESENZA_LEZIONE__ALLIEVI_PRESENTI);
	}
	return allieviPresenti;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Istruttore> getIstruttoriPresenti() {
	if (istruttoriPresenti == null) {
	    istruttoriPresenti = new EObjectResolvingEList<Istruttore>(Istruttore.class, this,
		    ModelPackage.PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI);
	}
	return istruttoriPresenti;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRESENZA_LEZIONE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.PRESENZA_LEZIONE__ALLIEVI_PRESENTI:
	    return getAllieviPresenti();
	case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI:
	    return getIstruttoriPresenti();
	case ModelPackage.PRESENZA_LEZIONE__ID:
	    return getId();
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
	case ModelPackage.PRESENZA_LEZIONE__ALLIEVI_PRESENTI:
	    getAllieviPresenti().clear();
	    getAllieviPresenti().addAll((Collection<? extends Allievo>) newValue);
	    return;
	case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI:
	    getIstruttoriPresenti().clear();
	    getIstruttoriPresenti().addAll((Collection<? extends Istruttore>) newValue);
	    return;
	case ModelPackage.PRESENZA_LEZIONE__ID:
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
	case ModelPackage.PRESENZA_LEZIONE__ALLIEVI_PRESENTI:
	    getAllieviPresenti().clear();
	    return;
	case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI:
	    getIstruttoriPresenti().clear();
	    return;
	case ModelPackage.PRESENZA_LEZIONE__ID:
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
	case ModelPackage.PRESENZA_LEZIONE__ALLIEVI_PRESENTI:
	    return allieviPresenti != null && !allieviPresenti.isEmpty();
	case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI:
	    return istruttoriPresenti != null && !istruttoriPresenti.isEmpty();
	case ModelPackage.PRESENZA_LEZIONE__ID:
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
	result.append(" (id: ");
	result.append(id);
	result.append(')');
	return result.toString();
    }

} //PresenzaLezioneImpl
