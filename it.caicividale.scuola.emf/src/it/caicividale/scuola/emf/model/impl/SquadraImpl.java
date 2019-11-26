/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Istruttore;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.Squadra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Squadra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.SquadraImpl#getCapoSquadra <em>Capo Squadra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.SquadraImpl#getAllieviInSquadra <em>Allievi In Squadra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.SquadraImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.SquadraImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.SquadraImpl#getStaffSquadra <em>Staff Squadra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquadraImpl extends MinimalEObjectImpl.Container implements Squadra {
    /**
     * The cached value of the '{@link #getCapoSquadra() <em>Capo Squadra</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapoSquadra()
     * @generated
     * @ordered
     */
    protected Istruttore capoSquadra;

    /**
     * The cached value of the '{@link #getAllieviInSquadra() <em>Allievi In Squadra</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllieviInSquadra()
     * @generated
     * @ordered
     */
    protected EList<Allievo> allieviInSquadra;

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
     * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected static final String NOME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected String nome = NOME_EDEFAULT;

    /**
     * The cached value of the '{@link #getStaffSquadra() <em>Staff Squadra</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaffSquadra()
     * @generated
     * @ordered
     */
    protected EList<Istruttore> staffSquadra;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SquadraImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.SQUADRA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Istruttore getCapoSquadra() {
	return capoSquadra;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapoSquadra(Istruttore newCapoSquadra) {
	Istruttore oldCapoSquadra = capoSquadra;
	capoSquadra = newCapoSquadra;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SQUADRA__CAPO_SQUADRA, oldCapoSquadra,
		    capoSquadra));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Allievo> getAllieviInSquadra() {
	if (allieviInSquadra == null) {
	    allieviInSquadra = new EObjectEList<Allievo>(Allievo.class, this, ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA);
	}
	return allieviInSquadra;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SQUADRA__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNome() {
	return nome;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNome(String newNome) {
	String oldNome = nome;
	nome = newNome;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SQUADRA__NOME, oldNome, nome));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Istruttore> getStaffSquadra() {
	if (staffSquadra == null) {
	    staffSquadra = new EObjectEList<Istruttore>(Istruttore.class, this, ModelPackage.SQUADRA__STAFF_SQUADRA);
	}
	return staffSquadra;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.SQUADRA__CAPO_SQUADRA:
	    return getCapoSquadra();
	case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
	    return getAllieviInSquadra();
	case ModelPackage.SQUADRA__ID:
	    return getId();
	case ModelPackage.SQUADRA__NOME:
	    return getNome();
	case ModelPackage.SQUADRA__STAFF_SQUADRA:
	    return getStaffSquadra();
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
	case ModelPackage.SQUADRA__CAPO_SQUADRA:
	    setCapoSquadra((Istruttore) newValue);
	    return;
	case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
	    getAllieviInSquadra().clear();
	    getAllieviInSquadra().addAll((Collection<? extends Allievo>) newValue);
	    return;
	case ModelPackage.SQUADRA__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.SQUADRA__NOME:
	    setNome((String) newValue);
	    return;
	case ModelPackage.SQUADRA__STAFF_SQUADRA:
	    getStaffSquadra().clear();
	    getStaffSquadra().addAll((Collection<? extends Istruttore>) newValue);
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
	case ModelPackage.SQUADRA__CAPO_SQUADRA:
	    setCapoSquadra((Istruttore) null);
	    return;
	case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
	    getAllieviInSquadra().clear();
	    return;
	case ModelPackage.SQUADRA__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.SQUADRA__NOME:
	    setNome(NOME_EDEFAULT);
	    return;
	case ModelPackage.SQUADRA__STAFF_SQUADRA:
	    getStaffSquadra().clear();
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
	case ModelPackage.SQUADRA__CAPO_SQUADRA:
	    return capoSquadra != null;
	case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
	    return allieviInSquadra != null && !allieviInSquadra.isEmpty();
	case ModelPackage.SQUADRA__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.SQUADRA__NOME:
	    return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
	case ModelPackage.SQUADRA__STAFF_SQUADRA:
	    return staffSquadra != null && !staffSquadra.isEmpty();
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
	result.append(", nome: ");
	result.append(nome);
	result.append(')');
	return result.toString();
    }

} //SquadraImpl
