/**
 */
package it.caicividale.corsicai.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import it.caicividale.corsicai.model.Bilancio;
import it.caicividale.corsicai.model.Cassa;
import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.DizMateriale;
import it.caicividale.corsicai.model.ESesso;
import it.caicividale.corsicai.model.ESiglaCorso;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.LezionePratica;
import it.caicividale.corsicai.model.LezioneTeorica;
import it.caicividale.corsicai.model.MaterialeNoleggiato;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Persona;
import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;
import it.caicividale.corsicai.ui.services.ModelManager;
import it.caicividale.corsicai.ui.services.UtilsService;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Corso</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getAnno
 * <em>Anno</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getQuotaIscrizione
 * <em>Quota Iscrizione</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getQuotaCaparra
 * <em>Quota Caparra</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getIsModulo <em>Is
 * Modulo</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getDirettore
 * <em>Direttore</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getVicedirettore
 * <em>Vicedirettore</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getSegretario
 * <em>Segretario</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getTesto
 * <em>Testo</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getBilancio
 * <em>Bilancio</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getCassa
 * <em>Cassa</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getIscrizioni
 * <em>Iscrizioni</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getDataInizio
 * <em>Data Inizio</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getDataFine <em>Data
 * Fine</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getStaffIstruttori
 * <em>Staff Istruttori</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNome
 * <em>Nome</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getSigla
 * <em>Sigla</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getEquipaggiamento
 * <em>Equipaggiamento</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllievi
 * <em>Numero Allievi</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviIscrizioneOk
 * <em>Numero Allievi Iscrizione Ok</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviIscrizioneKo
 * <em>Numero Allievi Iscrizione Ko</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviNuoviIscritti
 * <em>Numero Allievi Nuovi Iscritti</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviMaschi
 * <em>Numero Allievi Maschi</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviFemmine
 * <em>Numero Allievi Femmine</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getNumeroAllieviConNoleggio
 * <em>Numero Allievi Con Noleggio</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getListRiepilogonoleggio
 * <em>List Riepilogonoleggio</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getModuli
 * <em>Moduli</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getLezioniPratiche
 * <em>Lezioni Pratiche</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.CorsoImpl#getLezioniTeoriche
 * <em>Lezioni Teoriche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorsoImpl extends ExternalizableEObjectImpl implements Corso {
    /**
     * The default value of the '{@link #getAnno() <em>Anno</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnno()
     * @generated
     * @ordered
     */
    protected static final Integer ANNO_EDEFAULT = null;

    /**
     * The default value of the '{@link #getQuotaIscrizione() <em>Quota
     * Iscrizione</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getQuotaIscrizione()
     * @generated
     * @ordered
     */
    protected static final Float QUOTA_ISCRIZIONE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQuotaIscrizione() <em>Quota
     * Iscrizione</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getQuotaIscrizione()
     * @generated
     * @ordered
     */
    protected Float quotaIscrizione = QUOTA_ISCRIZIONE_EDEFAULT;

    /**
     * The default value of the '{@link #getQuotaCaparra() <em>Quota Caparra</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getQuotaCaparra()
     * @generated
     * @ordered
     */
    protected static final Float QUOTA_CAPARRA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQuotaCaparra() <em>Quota Caparra</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getQuotaCaparra()
     * @generated
     * @ordered
     */
    protected Float quotaCaparra = QUOTA_CAPARRA_EDEFAULT;

    /**
     * The default value of the '{@link #getIsModulo() <em>Is Modulo</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIsModulo()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_MODULO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsModulo() <em>Is Modulo</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIsModulo()
     * @generated
     * @ordered
     */
    protected Boolean isModulo = IS_MODULO_EDEFAULT;

    /**
     * The cached value of the '{@link #getDirettore() <em>Direttore</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDirettore()
     * @generated
     * @ordered
     */
    protected Istruttore direttore;

    /**
     * The cached value of the '{@link #getVicedirettore() <em>Vicedirettore</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVicedirettore()
     * @generated
     * @ordered
     */
    protected Istruttore vicedirettore;

    /**
     * The cached value of the '{@link #getSegretario() <em>Segretario</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSegretario()
     * @generated
     * @ordered
     */
    protected Persona segretario;

    /**
     * The default value of the '{@link #getTesto() <em>Testo</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTesto()
     * @generated
     * @ordered
     */
    protected static final String TESTO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTesto() <em>Testo</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTesto()
     * @generated
     * @ordered
     */
    protected String testo = TESTO_EDEFAULT;

    /**
     * The cached value of the '{@link #getBilancio() <em>Bilancio</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getBilancio()
     * @generated
     * @ordered
     */
    protected Bilancio bilancio;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final Long ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected Long id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getCassa() <em>Cassa</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getCassa()
     * @generated
     * @ordered
     */
    protected Cassa cassa;

    /**
     * The cached value of the '{@link #getIscrizioni() <em>Iscrizioni</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getIscrizioni()
     * @generated
     * @ordered
     */
    protected EList<Iscrizione> iscrizioni;

    /**
     * The default value of the '{@link #getDataInizio() <em>Data Inizio</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataInizio()
     * @generated
     * @ordered
     */
    protected static final Date DATA_INIZIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataInizio() <em>Data Inizio</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataInizio()
     * @generated
     * @ordered
     */
    protected Date dataInizio = DATA_INIZIO_EDEFAULT;

    /**
     * The default value of the '{@link #getDataFine() <em>Data Fine</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataFine()
     * @generated
     * @ordered
     */
    protected static final Date DATA_FINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataFine() <em>Data Fine</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDataFine()
     * @generated
     * @ordered
     */
    protected Date dataFine = DATA_FINE_EDEFAULT;

    /**
     * The cached value of the '{@link #getStaffIstruttori() <em>Staff
     * Istruttori</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getStaffIstruttori()
     * @generated
     * @ordered
     */
    protected EList<Istruttore> staffIstruttori;

    /**
     * The default value of the '{@link #getNome() <em>Nome</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected static final String NOME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected String nome = NOME_EDEFAULT;

    /**
     * The default value of the '{@link #getSigla() <em>Sigla</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSigla()
     * @generated
     * @ordered
     */
    protected static final ESiglaCorso SIGLA_EDEFAULT = ESiglaCorso.A1;

    /**
     * The cached value of the '{@link #getSigla() <em>Sigla</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSigla()
     * @generated
     * @ordered
     */
    protected ESiglaCorso sigla = SIGLA_EDEFAULT;

    /**
     * The default value of the '{@link #getEquipaggiamento()
     * <em>Equipaggiamento</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEquipaggiamento()
     * @generated
     * @ordered
     */
    protected static final String EQUIPAGGIAMENTO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEquipaggiamento()
     * <em>Equipaggiamento</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getEquipaggiamento()
     * @generated
     * @ordered
     */
    protected String equipaggiamento = EQUIPAGGIAMENTO_EDEFAULT;

    /**
     * The default value of the '{@link #getNumeroAllievi() <em>Numero
     * Allievi</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumeroAllievi()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviIscrizioneOk() <em>Numero
     * Allievi Iscrizione Ok</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumeroAllieviIscrizioneOk()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_ISCRIZIONE_OK_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviIscrizioneKo() <em>Numero
     * Allievi Iscrizione Ko</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumeroAllieviIscrizioneKo()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_ISCRIZIONE_KO_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviNuoviIscritti() <em>Numero
     * Allievi Nuovi Iscritti</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumeroAllieviNuoviIscritti()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_NUOVI_ISCRITTI_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviMaschi() <em>Numero Allievi
     * Maschi</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumeroAllieviMaschi()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_MASCHI_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviFemmine() <em>Numero
     * Allievi Femmine</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getNumeroAllieviFemmine()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_FEMMINE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getNumeroAllieviConNoleggio() <em>Numero
     * Allievi Con Noleggio</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getNumeroAllieviConNoleggio()
     * @generated
     * @ordered
     */
    protected static final Integer NUMERO_ALLIEVI_CON_NOLEGGIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModuli() <em>Moduli</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getModuli()
     * @generated
     * @ordered
     */
    protected EList<Corso> moduli;

    /**
     * The cached value of the '{@link #getLezioniPratiche() <em>Lezioni
     * Pratiche</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLezioniPratiche()
     * @generated
     * @ordered
     */
    protected EList<LezionePratica> lezioniPratiche;

    /**
     * The cached value of the '{@link #getLezioniTeoriche() <em>Lezioni
     * Teoriche</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLezioniTeoriche()
     * @generated
     * @ordered
     */
    protected EList<LezioneTeorica> lezioniTeoriche;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CorsoImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.CORSO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getAnno() {
	Integer anno = null;
	if (getDataInizio() != null) {
	    anno = UtilsService.getAnnoFromDate(getDataInizio());
	}
	return anno;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Float getQuotaIscrizione() {
	return quotaIscrizione;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setQuotaIscrizione(Float newQuotaIscrizione) {
	Float oldQuotaIscrizione = quotaIscrizione;
	quotaIscrizione = newQuotaIscrizione;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__QUOTA_ISCRIZIONE,
		    oldQuotaIscrizione, quotaIscrizione));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Float getQuotaCaparra() {
	return quotaCaparra;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setQuotaCaparra(Float newQuotaCaparra) {
	Float oldQuotaCaparra = quotaCaparra;
	quotaCaparra = newQuotaCaparra;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__QUOTA_CAPARRA, oldQuotaCaparra,
		    quotaCaparra));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Boolean getIsModulo() {
	return isModulo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setIsModulo(Boolean newIsModulo) {
	Boolean oldIsModulo = isModulo;
	isModulo = newIsModulo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__IS_MODULO, oldIsModulo,
		    isModulo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Istruttore getDirettore() {
	if (direttore != null && ((EObject) direttore).eIsProxy()) {
	    InternalEObject oldDirettore = (InternalEObject) direttore;
	    direttore = (Istruttore) eResolveProxy(oldDirettore);
	    if (direttore != oldDirettore) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CORSO__DIRETTORE,
			    oldDirettore, direttore));
	    }
	}
	return direttore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Istruttore basicGetDirettore() {
	return direttore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDirettore(Istruttore newDirettore) {
	Istruttore oldDirettore = direttore;
	direttore = newDirettore;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__DIRETTORE, oldDirettore,
		    direttore));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Istruttore getVicedirettore() {
	if (vicedirettore != null && ((EObject) vicedirettore).eIsProxy()) {
	    InternalEObject oldVicedirettore = (InternalEObject) vicedirettore;
	    vicedirettore = (Istruttore) eResolveProxy(oldVicedirettore);
	    if (vicedirettore != oldVicedirettore) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CORSO__VICEDIRETTORE,
			    oldVicedirettore, vicedirettore));
	    }
	}
	return vicedirettore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Istruttore basicGetVicedirettore() {
	return vicedirettore;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setVicedirettore(Istruttore newVicedirettore) {
	Istruttore oldVicedirettore = vicedirettore;
	vicedirettore = newVicedirettore;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__VICEDIRETTORE, oldVicedirettore,
		    vicedirettore));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Persona getSegretario() {
	if (segretario != null && ((EObject) segretario).eIsProxy()) {
	    InternalEObject oldSegretario = (InternalEObject) segretario;
	    segretario = (Persona) eResolveProxy(oldSegretario);
	    if (segretario != oldSegretario) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CORSO__SEGRETARIO,
			    oldSegretario, segretario));
	    }
	}
	return segretario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Persona basicGetSegretario() {
	return segretario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSegretario(Persona newSegretario) {
	Persona oldSegretario = segretario;
	segretario = newSegretario;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__SEGRETARIO, oldSegretario,
		    segretario));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTesto() {
	return testo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTesto(String newTesto) {
	String oldTesto = testo;
	testo = newTesto;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__TESTO, oldTesto, testo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Bilancio getBilancio() {
	if (bilancio != null && ((EObject) bilancio).eIsProxy()) {
	    InternalEObject oldBilancio = (InternalEObject) bilancio;
	    bilancio = (Bilancio) eResolveProxy(oldBilancio);
	    if (bilancio != oldBilancio) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CORSO__BILANCIO, oldBilancio,
			    bilancio));
	    }
	}
	return bilancio;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Bilancio basicGetBilancio() {
	return bilancio;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setBilancio(Bilancio newBilancio) {
	Bilancio oldBilancio = bilancio;
	bilancio = newBilancio;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__BILANCIO, oldBilancio, bilancio));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(Long newId) {
	Long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Cassa getCassa() {
	if (cassa != null && ((EObject) cassa).eIsProxy()) {
	    InternalEObject oldCassa = (InternalEObject) cassa;
	    cassa = (Cassa) eResolveProxy(oldCassa);
	    if (cassa != oldCassa) {
		if (eNotificationRequired())
		    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CORSO__CASSA, oldCassa,
			    cassa));
	    }
	}
	return cassa;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Cassa basicGetCassa() {
	return cassa;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCassa(Cassa newCassa) {
	Cassa oldCassa = cassa;
	cassa = newCassa;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__CASSA, oldCassa, cassa));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Iscrizione> getIscrizioni() {
	if (iscrizioni == null) {
	    iscrizioni = new EObjectResolvingEList<Iscrizione>(Iscrizione.class, this, ModelPackage.CORSO__ISCRIZIONI);
	}
	return iscrizioni;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Date getDataInizio() {
	return dataInizio;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataInizio(Date newDataInizio) {
	Date oldDataInizio = dataInizio;
	dataInizio = newDataInizio;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__DATA_INIZIO, oldDataInizio,
		    dataInizio));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Date getDataFine() {
	return dataFine;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataFine(Date newDataFine) {
	Date oldDataFine = dataFine;
	dataFine = newDataFine;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__DATA_FINE, oldDataFine,
		    dataFine));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Istruttore> getStaffIstruttori() {
	if (staffIstruttori == null) {
	    staffIstruttori = new EObjectResolvingEList<Istruttore>(Istruttore.class, this,
		    ModelPackage.CORSO__STAFF_ISTRUTTORI);
	}
	return staffIstruttori;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getNome() {
	return nome;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNome(String newNome) {
	String oldNome = nome;
	nome = newNome;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__NOME, oldNome, nome));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ESiglaCorso getSigla() {
	return sigla;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSigla(ESiglaCorso newSigla) {
	ESiglaCorso oldSigla = sigla;
	sigla = newSigla == null ? SIGLA_EDEFAULT : newSigla;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__SIGLA, oldSigla, sigla));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getEquipaggiamento() {
	return equipaggiamento;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setEquipaggiamento(String newEquipaggiamento) {
	String oldEquipaggiamento = equipaggiamento;
	equipaggiamento = newEquipaggiamento;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CORSO__EQUIPAGGIAMENTO,
		    oldEquipaggiamento, equipaggiamento));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllievi() {
	Integer numeroAllievi = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllievi = corso.getIscrizioni().size();
	}
	System.out.println("Numero allievi:" + numeroAllievi);
	return numeroAllievi;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviIscrizioneOk() {
	Integer numeroAllieviOk = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllieviOk = corso.getIscrizioni().stream().filter(i -> i.getIsIscrizioneOk())
		    .collect(Collectors.toList()).size();
	}
	System.out.println("Numero allievi Ok:" + numeroAllieviOk);
	return numeroAllieviOk;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviIscrizioneKo() {
	Integer numeroAllieviKo = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllieviKo = corso.getIscrizioni().stream().filter(i -> !i.getIsIscrizioneOk())
		    .collect(Collectors.toList()).size();
	}
	System.out.println("Numero allievi Ko:" + numeroAllieviKo);
	return numeroAllieviKo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviNuoviIscritti() {
	Integer numeroNuoviIscritti = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroNuoviIscritti = corso.getIscrizioni().stream().filter(i -> i.getIsNuovoAllievo())
		    .collect(Collectors.toList()).size();
	}
	System.out.println("Numero Nuovi Iscritti:" + numeroNuoviIscritti);
	return numeroNuoviIscritti;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviMaschi() {
	Integer numeroAllieviMaschi = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllieviMaschi = corso.getIscrizioni().stream()
		    .filter(i -> ESesso.MASCHIO.equals(i.getAllievo().getSesso())).collect(Collectors.toList()).size();
	}
	System.out.println("Numero maschi:" + numeroAllieviMaschi);
	return numeroAllieviMaschi;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviFemmine() {
	Integer numeroAllievefemmine = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllievefemmine = corso.getIscrizioni().stream()
		    .filter(i -> ESesso.FEMMINA.equals(i.getAllievo().getSesso())).collect(Collectors.toList()).size();
	}
	System.out.println("Numero femmine:" + numeroAllievefemmine);
	return numeroAllievefemmine;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Integer getNumeroAllieviConNoleggio() {
	Integer numeroAllieviConNoleggio = 0;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null) {
	    numeroAllieviConNoleggio = corso.getIscrizioni().stream().filter(i -> i.getIsNoleggio())
		    .collect(Collectors.toList()).size();
	}
	System.out.println("Numero allievi con noleggio:" + numeroAllieviConNoleggio);
	return numeroAllieviConNoleggio;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public EList getListRiepilogonoleggio() {
	EList<RiepilogoNoleggioBean> listRiepilogoNoleggioBean = new BasicEList<RiepilogoNoleggioBean>();

	List<MaterialeNoleggiato> listaMaterialeNoleggiato = new ArrayList<>();
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getIscrizioni() != null && !corso.getIscrizioni().isEmpty()) {
	    for (Iscrizione iscrizione : corso.getIscrizioni()) {
		if (iscrizione.getIsNoleggio()) {
		    listaMaterialeNoleggiato.addAll(EcoreUtil.copyAll(iscrizione.getMaterialeNoleggiato()));
		}
	    }
	    if (!listaMaterialeNoleggiato.isEmpty()) {
		List<DizMateriale> materiali = modelManager.getElencoDizMaterialeObservableList();
		for (DizMateriale dizMateriale : materiali) {
		    List<MaterialeNoleggiato> singoloMateriale = listaMaterialeNoleggiato.stream()
			    .filter(m -> m.getMateriale().getId().equals(dizMateriale.getId()))
			    .collect(Collectors.toList());
		    Long number = 0L;
		    for (MaterialeNoleggiato materialeNoleggiato : singoloMateriale) {
			number += materialeNoleggiato.getQuantita();
		    }
		    if (number > 0) {
			RiepilogoNoleggioBean bean = new RiepilogoNoleggioBean();
			bean.setMateriale(dizMateriale);
			bean.setNumeroMateriale(number);
			listRiepilogoNoleggioBean.add(bean);
		    }
		}
	    }

	}
	return listRiepilogoNoleggioBean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Corso> getModuli() {
	if (moduli == null) {
	    moduli = new EObjectResolvingEList<Corso>(Corso.class, this, ModelPackage.CORSO__MODULI);
	}
	return moduli;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<LezionePratica> getLezioniPratiche() {
	if (lezioniPratiche == null) {
	    lezioniPratiche = new EObjectResolvingEList<LezionePratica>(LezionePratica.class, this,
		    ModelPackage.CORSO__LEZIONI_PRATICHE);
	}
	return lezioniPratiche;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<LezioneTeorica> getLezioniTeoriche() {
	if (lezioniTeoriche == null) {
	    lezioniTeoriche = new EObjectResolvingEList<LezioneTeorica>(LezioneTeorica.class, this,
		    ModelPackage.CORSO__LEZIONI_TEORICHE);
	}
	return lezioniTeoriche;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.CORSO__ANNO:
	    return getAnno();
	case ModelPackage.CORSO__QUOTA_ISCRIZIONE:
	    return getQuotaIscrizione();
	case ModelPackage.CORSO__QUOTA_CAPARRA:
	    return getQuotaCaparra();
	case ModelPackage.CORSO__IS_MODULO:
	    return getIsModulo();
	case ModelPackage.CORSO__DIRETTORE:
	    if (resolve)
		return getDirettore();
	    return basicGetDirettore();
	case ModelPackage.CORSO__VICEDIRETTORE:
	    if (resolve)
		return getVicedirettore();
	    return basicGetVicedirettore();
	case ModelPackage.CORSO__SEGRETARIO:
	    if (resolve)
		return getSegretario();
	    return basicGetSegretario();
	case ModelPackage.CORSO__TESTO:
	    return getTesto();
	case ModelPackage.CORSO__BILANCIO:
	    if (resolve)
		return getBilancio();
	    return basicGetBilancio();
	case ModelPackage.CORSO__ID:
	    return getId();
	case ModelPackage.CORSO__CASSA:
	    if (resolve)
		return getCassa();
	    return basicGetCassa();
	case ModelPackage.CORSO__ISCRIZIONI:
	    return getIscrizioni();
	case ModelPackage.CORSO__DATA_INIZIO:
	    return getDataInizio();
	case ModelPackage.CORSO__DATA_FINE:
	    return getDataFine();
	case ModelPackage.CORSO__STAFF_ISTRUTTORI:
	    return getStaffIstruttori();
	case ModelPackage.CORSO__NOME:
	    return getNome();
	case ModelPackage.CORSO__SIGLA:
	    return getSigla();
	case ModelPackage.CORSO__EQUIPAGGIAMENTO:
	    return getEquipaggiamento();
	case ModelPackage.CORSO__NUMERO_ALLIEVI:
	    return getNumeroAllievi();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK:
	    return getNumeroAllieviIscrizioneOk();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO:
	    return getNumeroAllieviIscrizioneKo();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI:
	    return getNumeroAllieviNuoviIscritti();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_MASCHI:
	    return getNumeroAllieviMaschi();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_FEMMINE:
	    return getNumeroAllieviFemmine();
	case ModelPackage.CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO:
	    return getNumeroAllieviConNoleggio();
	case ModelPackage.CORSO__LIST_RIEPILOGONOLEGGIO:
	    return getListRiepilogonoleggio();
	case ModelPackage.CORSO__MODULI:
	    return getModuli();
	case ModelPackage.CORSO__LEZIONI_PRATICHE:
	    return getLezioniPratiche();
	case ModelPackage.CORSO__LEZIONI_TEORICHE:
	    return getLezioniTeoriche();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.CORSO__QUOTA_ISCRIZIONE:
	    setQuotaIscrizione((Float) newValue);
	    return;
	case ModelPackage.CORSO__QUOTA_CAPARRA:
	    setQuotaCaparra((Float) newValue);
	    return;
	case ModelPackage.CORSO__IS_MODULO:
	    setIsModulo((Boolean) newValue);
	    return;
	case ModelPackage.CORSO__DIRETTORE:
	    setDirettore((Istruttore) newValue);
	    return;
	case ModelPackage.CORSO__VICEDIRETTORE:
	    setVicedirettore((Istruttore) newValue);
	    return;
	case ModelPackage.CORSO__SEGRETARIO:
	    setSegretario((Persona) newValue);
	    return;
	case ModelPackage.CORSO__TESTO:
	    setTesto((String) newValue);
	    return;
	case ModelPackage.CORSO__BILANCIO:
	    setBilancio((Bilancio) newValue);
	    return;
	case ModelPackage.CORSO__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.CORSO__CASSA:
	    setCassa((Cassa) newValue);
	    return;
	case ModelPackage.CORSO__ISCRIZIONI:
	    getIscrizioni().clear();
	    getIscrizioni().addAll((Collection<? extends Iscrizione>) newValue);
	    return;
	case ModelPackage.CORSO__DATA_INIZIO:
	    setDataInizio((Date) newValue);
	    return;
	case ModelPackage.CORSO__DATA_FINE:
	    setDataFine((Date) newValue);
	    return;
	case ModelPackage.CORSO__STAFF_ISTRUTTORI:
	    getStaffIstruttori().clear();
	    getStaffIstruttori().addAll((Collection<? extends Istruttore>) newValue);
	    return;
	case ModelPackage.CORSO__NOME:
	    setNome((String) newValue);
	    return;
	case ModelPackage.CORSO__SIGLA:
	    setSigla((ESiglaCorso) newValue);
	    return;
	case ModelPackage.CORSO__EQUIPAGGIAMENTO:
	    setEquipaggiamento((String) newValue);
	    return;
	case ModelPackage.CORSO__MODULI:
	    getModuli().clear();
	    getModuli().addAll((Collection<? extends Corso>) newValue);
	    return;
	case ModelPackage.CORSO__LEZIONI_PRATICHE:
	    getLezioniPratiche().clear();
	    getLezioniPratiche().addAll((Collection<? extends LezionePratica>) newValue);
	    return;
	case ModelPackage.CORSO__LEZIONI_TEORICHE:
	    getLezioniTeoriche().clear();
	    getLezioniTeoriche().addAll((Collection<? extends LezioneTeorica>) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.CORSO__QUOTA_ISCRIZIONE:
	    setQuotaIscrizione(QUOTA_ISCRIZIONE_EDEFAULT);
	    return;
	case ModelPackage.CORSO__QUOTA_CAPARRA:
	    setQuotaCaparra(QUOTA_CAPARRA_EDEFAULT);
	    return;
	case ModelPackage.CORSO__IS_MODULO:
	    setIsModulo(IS_MODULO_EDEFAULT);
	    return;
	case ModelPackage.CORSO__DIRETTORE:
	    setDirettore((Istruttore) null);
	    return;
	case ModelPackage.CORSO__VICEDIRETTORE:
	    setVicedirettore((Istruttore) null);
	    return;
	case ModelPackage.CORSO__SEGRETARIO:
	    setSegretario((Persona) null);
	    return;
	case ModelPackage.CORSO__TESTO:
	    setTesto(TESTO_EDEFAULT);
	    return;
	case ModelPackage.CORSO__BILANCIO:
	    setBilancio((Bilancio) null);
	    return;
	case ModelPackage.CORSO__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.CORSO__CASSA:
	    setCassa((Cassa) null);
	    return;
	case ModelPackage.CORSO__ISCRIZIONI:
	    getIscrizioni().clear();
	    return;
	case ModelPackage.CORSO__DATA_INIZIO:
	    setDataInizio(DATA_INIZIO_EDEFAULT);
	    return;
	case ModelPackage.CORSO__DATA_FINE:
	    setDataFine(DATA_FINE_EDEFAULT);
	    return;
	case ModelPackage.CORSO__STAFF_ISTRUTTORI:
	    getStaffIstruttori().clear();
	    return;
	case ModelPackage.CORSO__NOME:
	    setNome(NOME_EDEFAULT);
	    return;
	case ModelPackage.CORSO__SIGLA:
	    setSigla(SIGLA_EDEFAULT);
	    return;
	case ModelPackage.CORSO__EQUIPAGGIAMENTO:
	    setEquipaggiamento(EQUIPAGGIAMENTO_EDEFAULT);
	    return;
	case ModelPackage.CORSO__MODULI:
	    getModuli().clear();
	    return;
	case ModelPackage.CORSO__LEZIONI_PRATICHE:
	    getLezioniPratiche().clear();
	    return;
	case ModelPackage.CORSO__LEZIONI_TEORICHE:
	    getLezioniTeoriche().clear();
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.CORSO__ANNO:
	    return ANNO_EDEFAULT == null ? getAnno() != null : !ANNO_EDEFAULT.equals(getAnno());
	case ModelPackage.CORSO__QUOTA_ISCRIZIONE:
	    return QUOTA_ISCRIZIONE_EDEFAULT == null ? quotaIscrizione != null
		    : !QUOTA_ISCRIZIONE_EDEFAULT.equals(quotaIscrizione);
	case ModelPackage.CORSO__QUOTA_CAPARRA:
	    return QUOTA_CAPARRA_EDEFAULT == null ? quotaCaparra != null : !QUOTA_CAPARRA_EDEFAULT.equals(quotaCaparra);
	case ModelPackage.CORSO__IS_MODULO:
	    return IS_MODULO_EDEFAULT == null ? isModulo != null : !IS_MODULO_EDEFAULT.equals(isModulo);
	case ModelPackage.CORSO__DIRETTORE:
	    return direttore != null;
	case ModelPackage.CORSO__VICEDIRETTORE:
	    return vicedirettore != null;
	case ModelPackage.CORSO__SEGRETARIO:
	    return segretario != null;
	case ModelPackage.CORSO__TESTO:
	    return TESTO_EDEFAULT == null ? testo != null : !TESTO_EDEFAULT.equals(testo);
	case ModelPackage.CORSO__BILANCIO:
	    return bilancio != null;
	case ModelPackage.CORSO__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.CORSO__CASSA:
	    return cassa != null;
	case ModelPackage.CORSO__ISCRIZIONI:
	    return iscrizioni != null && !iscrizioni.isEmpty();
	case ModelPackage.CORSO__DATA_INIZIO:
	    return DATA_INIZIO_EDEFAULT == null ? dataInizio != null : !DATA_INIZIO_EDEFAULT.equals(dataInizio);
	case ModelPackage.CORSO__DATA_FINE:
	    return DATA_FINE_EDEFAULT == null ? dataFine != null : !DATA_FINE_EDEFAULT.equals(dataFine);
	case ModelPackage.CORSO__STAFF_ISTRUTTORI:
	    return staffIstruttori != null && !staffIstruttori.isEmpty();
	case ModelPackage.CORSO__NOME:
	    return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
	case ModelPackage.CORSO__SIGLA:
	    return sigla != SIGLA_EDEFAULT;
	case ModelPackage.CORSO__EQUIPAGGIAMENTO:
	    return EQUIPAGGIAMENTO_EDEFAULT == null ? equipaggiamento != null
		    : !EQUIPAGGIAMENTO_EDEFAULT.equals(equipaggiamento);
	case ModelPackage.CORSO__NUMERO_ALLIEVI:
	    return NUMERO_ALLIEVI_EDEFAULT == null ? getNumeroAllievi() != null
		    : !NUMERO_ALLIEVI_EDEFAULT.equals(getNumeroAllievi());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK:
	    return NUMERO_ALLIEVI_ISCRIZIONE_OK_EDEFAULT == null ? getNumeroAllieviIscrizioneOk() != null
		    : !NUMERO_ALLIEVI_ISCRIZIONE_OK_EDEFAULT.equals(getNumeroAllieviIscrizioneOk());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO:
	    return NUMERO_ALLIEVI_ISCRIZIONE_KO_EDEFAULT == null ? getNumeroAllieviIscrizioneKo() != null
		    : !NUMERO_ALLIEVI_ISCRIZIONE_KO_EDEFAULT.equals(getNumeroAllieviIscrizioneKo());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI:
	    return NUMERO_ALLIEVI_NUOVI_ISCRITTI_EDEFAULT == null ? getNumeroAllieviNuoviIscritti() != null
		    : !NUMERO_ALLIEVI_NUOVI_ISCRITTI_EDEFAULT.equals(getNumeroAllieviNuoviIscritti());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_MASCHI:
	    return NUMERO_ALLIEVI_MASCHI_EDEFAULT == null ? getNumeroAllieviMaschi() != null
		    : !NUMERO_ALLIEVI_MASCHI_EDEFAULT.equals(getNumeroAllieviMaschi());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_FEMMINE:
	    return NUMERO_ALLIEVI_FEMMINE_EDEFAULT == null ? getNumeroAllieviFemmine() != null
		    : !NUMERO_ALLIEVI_FEMMINE_EDEFAULT.equals(getNumeroAllieviFemmine());
	case ModelPackage.CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO:
	    return NUMERO_ALLIEVI_CON_NOLEGGIO_EDEFAULT == null ? getNumeroAllieviConNoleggio() != null
		    : !NUMERO_ALLIEVI_CON_NOLEGGIO_EDEFAULT.equals(getNumeroAllieviConNoleggio());
	case ModelPackage.CORSO__LIST_RIEPILOGONOLEGGIO:
	    return getListRiepilogonoleggio() != null;
	case ModelPackage.CORSO__MODULI:
	    return moduli != null && !moduli.isEmpty();
	case ModelPackage.CORSO__LEZIONI_PRATICHE:
	    return lezioniPratiche != null && !lezioniPratiche.isEmpty();
	case ModelPackage.CORSO__LEZIONI_TEORICHE:
	    return lezioniTeoriche != null && !lezioniTeoriche.isEmpty();
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuilder result = new StringBuilder(super.toString());
	result.append(" (quotaIscrizione: ");
	result.append(quotaIscrizione);
	result.append(", quotaCaparra: ");
	result.append(quotaCaparra);
	result.append(", isModulo: ");
	result.append(isModulo);
	result.append(", testo: ");
	result.append(testo);
	result.append(", id: ");
	result.append(id);
	result.append(", dataInizio: ");
	result.append(dataInizio);
	result.append(", dataFine: ");
	result.append(dataFine);
	result.append(", nome: ");
	result.append(nome);
	result.append(", sigla: ");
	result.append(sigla);
	result.append(", equipaggiamento: ");
	result.append(equipaggiamento);
	result.append(')');
	return result.toString();
    }

} // CorsoImpl
