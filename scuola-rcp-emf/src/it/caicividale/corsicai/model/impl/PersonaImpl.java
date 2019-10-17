/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.ESesso;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Persona;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import it.caicividale.corsicai.model.valueobject.EMail;
import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getCognome <em>Cognome</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getSesso <em>Sesso</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getNumeroCellulare <em>Numero Cellulare</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getResidenzaVia <em>Residenza Via</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getResidenzaCitta <em>Residenza Citta</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getResidenzaProvincia <em>Residenza Provincia</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getResidenzaCap <em>Residenza Cap</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getNascitaData <em>Nascita Data</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getNascitaCitta <em>Nascita Citta</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getNascitaProvincia <em>Nascita Provincia</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getSezioneCaiAppartenenza <em>Sezione Cai Appartenenza</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PersonaImpl#getIsStaffScuola <em>Is Staff Scuola</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonaImpl extends ExternalizableEObjectImpl implements Persona {
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
     * The default value of the '{@link #getCognome() <em>Cognome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCognome()
     * @generated
     * @ordered
     */
    protected static final String COGNOME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCognome() <em>Cognome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCognome()
     * @generated
     * @ordered
     */
    protected String cognome = COGNOME_EDEFAULT;

    /**
     * The default value of the '{@link #getSesso() <em>Sesso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSesso()
     * @generated
     * @ordered
     */
    protected static final ESesso SESSO_EDEFAULT = ESesso.MASCHIO;

    /**
     * The cached value of the '{@link #getSesso() <em>Sesso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSesso()
     * @generated
     * @ordered
     */
    protected ESesso sesso = SESSO_EDEFAULT;

    /**
     * The default value of the '{@link #getNumeroCellulare() <em>Numero Cellulare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumeroCellulare()
     * @generated
     * @ordered
     */
    protected static final NumeroCellulare NUMERO_CELLULARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumeroCellulare() <em>Numero Cellulare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumeroCellulare()
     * @generated
     * @ordered
     */
    protected NumeroCellulare numeroCellulare = NUMERO_CELLULARE_EDEFAULT;

    /**
     * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEMail()
     * @generated
     * @ordered
     */
    protected static final EMail EMAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEMail() <em>EMail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEMail()
     * @generated
     * @ordered
     */
    protected EMail eMail = EMAIL_EDEFAULT;

    /**
     * The default value of the '{@link #getResidenzaVia() <em>Residenza Via</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaVia()
     * @generated
     * @ordered
     */
    protected static final String RESIDENZA_VIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResidenzaVia() <em>Residenza Via</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaVia()
     * @generated
     * @ordered
     */
    protected String residenzaVia = RESIDENZA_VIA_EDEFAULT;

    /**
     * The default value of the '{@link #getResidenzaCitta() <em>Residenza Citta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaCitta()
     * @generated
     * @ordered
     */
    protected static final String RESIDENZA_CITTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResidenzaCitta() <em>Residenza Citta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaCitta()
     * @generated
     * @ordered
     */
    protected String residenzaCitta = RESIDENZA_CITTA_EDEFAULT;

    /**
     * The default value of the '{@link #getResidenzaProvincia() <em>Residenza Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaProvincia()
     * @generated
     * @ordered
     */
    protected static final String RESIDENZA_PROVINCIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResidenzaProvincia() <em>Residenza Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaProvincia()
     * @generated
     * @ordered
     */
    protected String residenzaProvincia = RESIDENZA_PROVINCIA_EDEFAULT;

    /**
     * The default value of the '{@link #getResidenzaCap() <em>Residenza Cap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaCap()
     * @generated
     * @ordered
     */
    protected static final String RESIDENZA_CAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResidenzaCap() <em>Residenza Cap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResidenzaCap()
     * @generated
     * @ordered
     */
    protected String residenzaCap = RESIDENZA_CAP_EDEFAULT;

    /**
     * The default value of the '{@link #getNascitaData() <em>Nascita Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaData()
     * @generated
     * @ordered
     */
    protected static final Date NASCITA_DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNascitaData() <em>Nascita Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaData()
     * @generated
     * @ordered
     */
    protected Date nascitaData = NASCITA_DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getNascitaCitta() <em>Nascita Citta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaCitta()
     * @generated
     * @ordered
     */
    protected static final String NASCITA_CITTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNascitaCitta() <em>Nascita Citta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaCitta()
     * @generated
     * @ordered
     */
    protected String nascitaCitta = NASCITA_CITTA_EDEFAULT;

    /**
     * The default value of the '{@link #getNascitaProvincia() <em>Nascita Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaProvincia()
     * @generated
     * @ordered
     */
    protected static final String NASCITA_PROVINCIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNascitaProvincia() <em>Nascita Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNascitaProvincia()
     * @generated
     * @ordered
     */
    protected String nascitaProvincia = NASCITA_PROVINCIA_EDEFAULT;

    /**
     * The default value of the '{@link #getSezioneCaiAppartenenza() <em>Sezione Cai Appartenenza</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSezioneCaiAppartenenza()
     * @generated
     * @ordered
     */
    protected static final String SEZIONE_CAI_APPARTENENZA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSezioneCaiAppartenenza() <em>Sezione Cai Appartenenza</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSezioneCaiAppartenenza()
     * @generated
     * @ordered
     */
    protected String sezioneCaiAppartenenza = SEZIONE_CAI_APPARTENENZA_EDEFAULT;

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
     * The default value of the '{@link #getIsStaffScuola() <em>Is Staff Scuola</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStaffScuola()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_STAFF_SCUOLA_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsStaffScuola() <em>Is Staff Scuola</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStaffScuola()
     * @generated
     * @ordered
     */
    protected Boolean isStaffScuola = IS_STAFF_SCUOLA_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.PERSONA;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__NOME, oldNome, nome));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCognome() {
	return cognome;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCognome(String newCognome) {
	String oldCognome = cognome;
	cognome = newCognome;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__COGNOME, oldCognome, cognome));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ESesso getSesso() {
	return sesso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSesso(ESesso newSesso) {
	ESesso oldSesso = sesso;
	sesso = newSesso == null ? SESSO_EDEFAULT : newSesso;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__SESSO, oldSesso, sesso));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumeroCellulare getNumeroCellulare() {
	return numeroCellulare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumeroCellulare(NumeroCellulare newNumeroCellulare) {
	NumeroCellulare oldNumeroCellulare = numeroCellulare;
	numeroCellulare = newNumeroCellulare;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__NUMERO_CELLULARE,
		    oldNumeroCellulare, numeroCellulare));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EMail getEMail() {
	return eMail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEMail(EMail newEMail) {
	EMail oldEMail = eMail;
	eMail = newEMail;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__EMAIL, oldEMail, eMail));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResidenzaVia() {
	return residenzaVia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResidenzaVia(String newResidenzaVia) {
	String oldResidenzaVia = residenzaVia;
	residenzaVia = newResidenzaVia;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__RESIDENZA_VIA, oldResidenzaVia,
		    residenzaVia));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResidenzaCitta() {
	return residenzaCitta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResidenzaCitta(String newResidenzaCitta) {
	String oldResidenzaCitta = residenzaCitta;
	residenzaCitta = newResidenzaCitta;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__RESIDENZA_CITTA,
		    oldResidenzaCitta, residenzaCitta));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResidenzaProvincia() {
	return residenzaProvincia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResidenzaProvincia(String newResidenzaProvincia) {
	String oldResidenzaProvincia = residenzaProvincia;
	residenzaProvincia = newResidenzaProvincia;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__RESIDENZA_PROVINCIA,
		    oldResidenzaProvincia, residenzaProvincia));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResidenzaCap() {
	return residenzaCap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResidenzaCap(String newResidenzaCap) {
	String oldResidenzaCap = residenzaCap;
	residenzaCap = newResidenzaCap;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__RESIDENZA_CAP, oldResidenzaCap,
		    residenzaCap));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getNascitaData() {
	return nascitaData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNascitaData(Date newNascitaData) {
	Date oldNascitaData = nascitaData;
	nascitaData = newNascitaData;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__NASCITA_DATA, oldNascitaData,
		    nascitaData));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNascitaCitta() {
	return nascitaCitta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNascitaCitta(String newNascitaCitta) {
	String oldNascitaCitta = nascitaCitta;
	nascitaCitta = newNascitaCitta;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__NASCITA_CITTA, oldNascitaCitta,
		    nascitaCitta));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNascitaProvincia() {
	return nascitaProvincia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNascitaProvincia(String newNascitaProvincia) {
	String oldNascitaProvincia = nascitaProvincia;
	nascitaProvincia = newNascitaProvincia;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__NASCITA_PROVINCIA,
		    oldNascitaProvincia, nascitaProvincia));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSezioneCaiAppartenenza() {
	return sezioneCaiAppartenenza;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSezioneCaiAppartenenza(String newSezioneCaiAppartenenza) {
	String oldSezioneCaiAppartenenza = sezioneCaiAppartenenza;
	sezioneCaiAppartenenza = newSezioneCaiAppartenenza;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__SEZIONE_CAI_APPARTENENZA,
		    oldSezioneCaiAppartenenza, sezioneCaiAppartenenza));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsStaffScuola() {
	return isStaffScuola;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsStaffScuola(Boolean newIsStaffScuola) {
	Boolean oldIsStaffScuola = isStaffScuola;
	isStaffScuola = newIsStaffScuola;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSONA__IS_STAFF_SCUOLA,
		    oldIsStaffScuola, isStaffScuola));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.PERSONA__NOME:
	    return getNome();
	case ModelPackage.PERSONA__COGNOME:
	    return getCognome();
	case ModelPackage.PERSONA__SESSO:
	    return getSesso();
	case ModelPackage.PERSONA__NUMERO_CELLULARE:
	    return getNumeroCellulare();
	case ModelPackage.PERSONA__EMAIL:
	    return getEMail();
	case ModelPackage.PERSONA__RESIDENZA_VIA:
	    return getResidenzaVia();
	case ModelPackage.PERSONA__RESIDENZA_CITTA:
	    return getResidenzaCitta();
	case ModelPackage.PERSONA__RESIDENZA_PROVINCIA:
	    return getResidenzaProvincia();
	case ModelPackage.PERSONA__RESIDENZA_CAP:
	    return getResidenzaCap();
	case ModelPackage.PERSONA__NASCITA_DATA:
	    return getNascitaData();
	case ModelPackage.PERSONA__NASCITA_CITTA:
	    return getNascitaCitta();
	case ModelPackage.PERSONA__NASCITA_PROVINCIA:
	    return getNascitaProvincia();
	case ModelPackage.PERSONA__SEZIONE_CAI_APPARTENENZA:
	    return getSezioneCaiAppartenenza();
	case ModelPackage.PERSONA__ID:
	    return getId();
	case ModelPackage.PERSONA__IS_STAFF_SCUOLA:
	    return getIsStaffScuola();
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
	case ModelPackage.PERSONA__NOME:
	    setNome((String) newValue);
	    return;
	case ModelPackage.PERSONA__COGNOME:
	    setCognome((String) newValue);
	    return;
	case ModelPackage.PERSONA__SESSO:
	    setSesso((ESesso) newValue);
	    return;
	case ModelPackage.PERSONA__NUMERO_CELLULARE:
	    setNumeroCellulare((NumeroCellulare) newValue);
	    return;
	case ModelPackage.PERSONA__EMAIL:
	    setEMail((EMail) newValue);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_VIA:
	    setResidenzaVia((String) newValue);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_CITTA:
	    setResidenzaCitta((String) newValue);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_PROVINCIA:
	    setResidenzaProvincia((String) newValue);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_CAP:
	    setResidenzaCap((String) newValue);
	    return;
	case ModelPackage.PERSONA__NASCITA_DATA:
	    setNascitaData((Date) newValue);
	    return;
	case ModelPackage.PERSONA__NASCITA_CITTA:
	    setNascitaCitta((String) newValue);
	    return;
	case ModelPackage.PERSONA__NASCITA_PROVINCIA:
	    setNascitaProvincia((String) newValue);
	    return;
	case ModelPackage.PERSONA__SEZIONE_CAI_APPARTENENZA:
	    setSezioneCaiAppartenenza((String) newValue);
	    return;
	case ModelPackage.PERSONA__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.PERSONA__IS_STAFF_SCUOLA:
	    setIsStaffScuola((Boolean) newValue);
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
	case ModelPackage.PERSONA__NOME:
	    setNome(NOME_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__COGNOME:
	    setCognome(COGNOME_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__SESSO:
	    setSesso(SESSO_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__NUMERO_CELLULARE:
	    setNumeroCellulare(NUMERO_CELLULARE_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__EMAIL:
	    setEMail(EMAIL_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_VIA:
	    setResidenzaVia(RESIDENZA_VIA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_CITTA:
	    setResidenzaCitta(RESIDENZA_CITTA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_PROVINCIA:
	    setResidenzaProvincia(RESIDENZA_PROVINCIA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__RESIDENZA_CAP:
	    setResidenzaCap(RESIDENZA_CAP_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__NASCITA_DATA:
	    setNascitaData(NASCITA_DATA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__NASCITA_CITTA:
	    setNascitaCitta(NASCITA_CITTA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__NASCITA_PROVINCIA:
	    setNascitaProvincia(NASCITA_PROVINCIA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__SEZIONE_CAI_APPARTENENZA:
	    setSezioneCaiAppartenenza(SEZIONE_CAI_APPARTENENZA_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.PERSONA__IS_STAFF_SCUOLA:
	    setIsStaffScuola(IS_STAFF_SCUOLA_EDEFAULT);
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
	case ModelPackage.PERSONA__NOME:
	    return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
	case ModelPackage.PERSONA__COGNOME:
	    return COGNOME_EDEFAULT == null ? cognome != null : !COGNOME_EDEFAULT.equals(cognome);
	case ModelPackage.PERSONA__SESSO:
	    return sesso != SESSO_EDEFAULT;
	case ModelPackage.PERSONA__NUMERO_CELLULARE:
	    return NUMERO_CELLULARE_EDEFAULT == null ? numeroCellulare != null
		    : !NUMERO_CELLULARE_EDEFAULT.equals(numeroCellulare);
	case ModelPackage.PERSONA__EMAIL:
	    return EMAIL_EDEFAULT == null ? eMail != null : !EMAIL_EDEFAULT.equals(eMail);
	case ModelPackage.PERSONA__RESIDENZA_VIA:
	    return RESIDENZA_VIA_EDEFAULT == null ? residenzaVia != null : !RESIDENZA_VIA_EDEFAULT.equals(residenzaVia);
	case ModelPackage.PERSONA__RESIDENZA_CITTA:
	    return RESIDENZA_CITTA_EDEFAULT == null ? residenzaCitta != null
		    : !RESIDENZA_CITTA_EDEFAULT.equals(residenzaCitta);
	case ModelPackage.PERSONA__RESIDENZA_PROVINCIA:
	    return RESIDENZA_PROVINCIA_EDEFAULT == null ? residenzaProvincia != null
		    : !RESIDENZA_PROVINCIA_EDEFAULT.equals(residenzaProvincia);
	case ModelPackage.PERSONA__RESIDENZA_CAP:
	    return RESIDENZA_CAP_EDEFAULT == null ? residenzaCap != null : !RESIDENZA_CAP_EDEFAULT.equals(residenzaCap);
	case ModelPackage.PERSONA__NASCITA_DATA:
	    return NASCITA_DATA_EDEFAULT == null ? nascitaData != null : !NASCITA_DATA_EDEFAULT.equals(nascitaData);
	case ModelPackage.PERSONA__NASCITA_CITTA:
	    return NASCITA_CITTA_EDEFAULT == null ? nascitaCitta != null : !NASCITA_CITTA_EDEFAULT.equals(nascitaCitta);
	case ModelPackage.PERSONA__NASCITA_PROVINCIA:
	    return NASCITA_PROVINCIA_EDEFAULT == null ? nascitaProvincia != null
		    : !NASCITA_PROVINCIA_EDEFAULT.equals(nascitaProvincia);
	case ModelPackage.PERSONA__SEZIONE_CAI_APPARTENENZA:
	    return SEZIONE_CAI_APPARTENENZA_EDEFAULT == null ? sezioneCaiAppartenenza != null
		    : !SEZIONE_CAI_APPARTENENZA_EDEFAULT.equals(sezioneCaiAppartenenza);
	case ModelPackage.PERSONA__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.PERSONA__IS_STAFF_SCUOLA:
	    return IS_STAFF_SCUOLA_EDEFAULT == null ? isStaffScuola != null
		    : !IS_STAFF_SCUOLA_EDEFAULT.equals(isStaffScuola);
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
	result.append(" (nome: ");
	result.append(nome);
	result.append(", cognome: ");
	result.append(cognome);
	result.append(", sesso: ");
	result.append(sesso);
	result.append(", numeroCellulare: ");
	result.append(numeroCellulare);
	result.append(", eMail: ");
	result.append(eMail);
	result.append(", residenzaVia: ");
	result.append(residenzaVia);
	result.append(", residenzaCitta: ");
	result.append(residenzaCitta);
	result.append(", residenzaProvincia: ");
	result.append(residenzaProvincia);
	result.append(", residenzaCap: ");
	result.append(residenzaCap);
	result.append(", nascitaData: ");
	result.append(nascitaData);
	result.append(", nascitaCitta: ");
	result.append(nascitaCitta);
	result.append(", nascitaProvincia: ");
	result.append(nascitaProvincia);
	result.append(", sezioneCaiAppartenenza: ");
	result.append(sezioneCaiAppartenenza);
	result.append(", id: ");
	result.append(id);
	result.append(", isStaffScuola: ");
	result.append(isStaffScuola);
	result.append(')');
	return result.toString();
    }

} //PersonaImpl
