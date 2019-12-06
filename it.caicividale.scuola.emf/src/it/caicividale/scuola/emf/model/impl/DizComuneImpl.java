/**
 */
package it.caicividale.scuola.emf.model.impl;

import it.caicividale.scuola.emf.model.DizComune;
import it.caicividale.scuola.emf.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diz Comune</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getComune <em>Comune</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getProvincia <em>Provincia</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getSigla <em>Sigla</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getRegione <em>Regione</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl#getCap <em>Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DizComuneImpl extends MinimalEObjectImpl.Container implements DizComune {
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
     * The default value of the '{@link #getComune() <em>Comune</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComune()
     * @generated
     * @ordered
     */
    protected static final String COMUNE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComune() <em>Comune</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComune()
     * @generated
     * @ordered
     */
    protected String comune = COMUNE_EDEFAULT;

    /**
     * The default value of the '{@link #getProvincia() <em>Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvincia()
     * @generated
     * @ordered
     */
    protected static final String PROVINCIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProvincia() <em>Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvincia()
     * @generated
     * @ordered
     */
    protected String provincia = PROVINCIA_EDEFAULT;

    /**
     * The default value of the '{@link #getSigla() <em>Sigla</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSigla()
     * @generated
     * @ordered
     */
    protected static final String SIGLA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSigla() <em>Sigla</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSigla()
     * @generated
     * @ordered
     */
    protected String sigla = SIGLA_EDEFAULT;

    /**
     * The default value of the '{@link #getRegione() <em>Regione</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegione()
     * @generated
     * @ordered
     */
    protected static final String REGIONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegione() <em>Regione</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegione()
     * @generated
     * @ordered
     */
    protected String regione = REGIONE_EDEFAULT;

    /**
     * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCap()
     * @generated
     * @ordered
     */
    protected static final String CAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCap() <em>Cap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCap()
     * @generated
     * @ordered
     */
    protected String cap = CAP_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DizComuneImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.DIZ_COMUNE;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getComune() {
	return comune;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setComune(String newComune) {
	String oldComune = comune;
	comune = newComune;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__COMUNE, oldComune, comune));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProvincia() {
	return provincia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProvincia(String newProvincia) {
	String oldProvincia = provincia;
	provincia = newProvincia;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__PROVINCIA, oldProvincia,
		    provincia));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSigla() {
	return sigla;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSigla(String newSigla) {
	String oldSigla = sigla;
	sigla = newSigla;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__SIGLA, oldSigla, sigla));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRegione() {
	return regione;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRegione(String newRegione) {
	String oldRegione = regione;
	regione = newRegione;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__REGIONE, oldRegione,
		    regione));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCap() {
	return cap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCap(String newCap) {
	String oldCap = cap;
	cap = newCap;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_COMUNE__CAP, oldCap, cap));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.DIZ_COMUNE__ID:
	    return getId();
	case ModelPackage.DIZ_COMUNE__COMUNE:
	    return getComune();
	case ModelPackage.DIZ_COMUNE__PROVINCIA:
	    return getProvincia();
	case ModelPackage.DIZ_COMUNE__SIGLA:
	    return getSigla();
	case ModelPackage.DIZ_COMUNE__REGIONE:
	    return getRegione();
	case ModelPackage.DIZ_COMUNE__CAP:
	    return getCap();
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
	case ModelPackage.DIZ_COMUNE__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.DIZ_COMUNE__COMUNE:
	    setComune((String) newValue);
	    return;
	case ModelPackage.DIZ_COMUNE__PROVINCIA:
	    setProvincia((String) newValue);
	    return;
	case ModelPackage.DIZ_COMUNE__SIGLA:
	    setSigla((String) newValue);
	    return;
	case ModelPackage.DIZ_COMUNE__REGIONE:
	    setRegione((String) newValue);
	    return;
	case ModelPackage.DIZ_COMUNE__CAP:
	    setCap((String) newValue);
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
	case ModelPackage.DIZ_COMUNE__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.DIZ_COMUNE__COMUNE:
	    setComune(COMUNE_EDEFAULT);
	    return;
	case ModelPackage.DIZ_COMUNE__PROVINCIA:
	    setProvincia(PROVINCIA_EDEFAULT);
	    return;
	case ModelPackage.DIZ_COMUNE__SIGLA:
	    setSigla(SIGLA_EDEFAULT);
	    return;
	case ModelPackage.DIZ_COMUNE__REGIONE:
	    setRegione(REGIONE_EDEFAULT);
	    return;
	case ModelPackage.DIZ_COMUNE__CAP:
	    setCap(CAP_EDEFAULT);
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
	case ModelPackage.DIZ_COMUNE__ID:
	    return id != ID_EDEFAULT;
	case ModelPackage.DIZ_COMUNE__COMUNE:
	    return COMUNE_EDEFAULT == null ? comune != null : !COMUNE_EDEFAULT.equals(comune);
	case ModelPackage.DIZ_COMUNE__PROVINCIA:
	    return PROVINCIA_EDEFAULT == null ? provincia != null : !PROVINCIA_EDEFAULT.equals(provincia);
	case ModelPackage.DIZ_COMUNE__SIGLA:
	    return SIGLA_EDEFAULT == null ? sigla != null : !SIGLA_EDEFAULT.equals(sigla);
	case ModelPackage.DIZ_COMUNE__REGIONE:
	    return REGIONE_EDEFAULT == null ? regione != null : !REGIONE_EDEFAULT.equals(regione);
	case ModelPackage.DIZ_COMUNE__CAP:
	    return CAP_EDEFAULT == null ? cap != null : !CAP_EDEFAULT.equals(cap);
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
	result.append(", comune: ");
	result.append(comune);
	result.append(", provincia: ");
	result.append(provincia);
	result.append(", sigla: ");
	result.append(sigla);
	result.append(", regione: ");
	result.append(regione);
	result.append(", cap: ");
	result.append(cap);
	result.append(')');
	return result.toString();
    }

} //DizComuneImpl
