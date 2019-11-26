/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import it.caicividale.scuola.emf.model.Allievo;
import it.caicividale.scuola.emf.model.Iscrizione;
import it.caicividale.scuola.emf.model.MaterialeNoleggiato;
import it.caicividale.scuola.emf.model.ModelPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Iscrizione</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsModuloIscrizione <em>Is Modulo Iscrizione</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsConsensoInformato <em>Is Consenso Informato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsNuovoAllievo <em>Is Nuovo Allievo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getDataScadenzaCertificatoMedico <em>Data Scadenza Certificato Medico</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsBollinoAnnoCorso <em>Is Bollino Anno Corso</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getCaparra <em>Caparra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getSaldo <em>Saldo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getTotaleVersato <em>Totale Versato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getNote <em>Note</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsNoleggio <em>Is Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getMaterialeNoleggiato <em>Materiale Noleggiato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsIscrizioneOk <em>Is Iscrizione Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getQuotaNoleggio <em>Quota Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsCertificatoMedico <em>Is Certificato Medico</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsCertificatoMedicoOk <em>Is Certificato Medico Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getIsQuotaVersataOk <em>Is Quota Versata Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getQuotaNoleggioDaVersare <em>Quota Noleggio Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getTotaleDaVersare <em>Totale Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getDifferenzaTotaleVersatoTotaleDaVersare <em>Differenza Totale Versato Totale Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getMessaggiErrore <em>Messaggi Errore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl#getAllievo <em>Allievo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IscrizioneImpl extends MinimalEObjectImpl.Container implements Iscrizione {
    /**
     * The default value of the '{@link #getIsModuloIscrizione() <em>Is Modulo Iscrizione</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsModuloIscrizione()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_MODULO_ISCRIZIONE_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsModuloIscrizione() <em>Is Modulo Iscrizione</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsModuloIscrizione()
     * @generated
     * @ordered
     */
    protected Boolean isModuloIscrizione = IS_MODULO_ISCRIZIONE_EDEFAULT;

    /**
     * The default value of the '{@link #getIsConsensoInformato() <em>Is Consenso Informato</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsConsensoInformato()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_CONSENSO_INFORMATO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsConsensoInformato() <em>Is Consenso Informato</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsConsensoInformato()
     * @generated
     * @ordered
     */
    protected Boolean isConsensoInformato = IS_CONSENSO_INFORMATO_EDEFAULT;

    /**
     * The default value of the '{@link #getIsNuovoAllievo() <em>Is Nuovo Allievo</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsNuovoAllievo()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_NUOVO_ALLIEVO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsNuovoAllievo() <em>Is Nuovo Allievo</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsNuovoAllievo()
     * @generated
     * @ordered
     */
    protected Boolean isNuovoAllievo = IS_NUOVO_ALLIEVO_EDEFAULT;

    /**
     * The default value of the '{@link #getDataScadenzaCertificatoMedico() <em>Data Scadenza Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDataScadenzaCertificatoMedico()
     * @generated
     * @ordered
     */
    protected static final LocalDate DATA_SCADENZA_CERTIFICATO_MEDICO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataScadenzaCertificatoMedico() <em>Data Scadenza Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getDataScadenzaCertificatoMedico()
     * @generated
     * @ordered
     */
    protected LocalDate dataScadenzaCertificatoMedico = DATA_SCADENZA_CERTIFICATO_MEDICO_EDEFAULT;

    /**
     * The default value of the '{@link #getIsBollinoAnnoCorso() <em>Is Bollino Anno Corso</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsBollinoAnnoCorso()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_BOLLINO_ANNO_CORSO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsBollinoAnnoCorso() <em>Is Bollino Anno Corso</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsBollinoAnnoCorso()
     * @generated
     * @ordered
     */
    protected Boolean isBollinoAnnoCorso = IS_BOLLINO_ANNO_CORSO_EDEFAULT;

    /**
     * The default value of the '{@link #getCaparra() <em>Caparra</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCaparra()
     * @generated
     * @ordered
     */
    protected static final Float CAPARRA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCaparra() <em>Caparra</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getCaparra()
     * @generated
     * @ordered
     */
    protected Float caparra = CAPARRA_EDEFAULT;

    /**
     * The default value of the '{@link #getSaldo() <em>Saldo</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSaldo()
     * @generated
     * @ordered
     */
    protected static final Float SALDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSaldo() <em>Saldo</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSaldo()
     * @generated
     * @ordered
     */
    protected Float saldo = SALDO_EDEFAULT;

    /**
     * The default value of the '{@link #getTotaleVersato() <em>Totale Versato</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTotaleVersato()
     * @generated
     * @ordered
     */
    protected static final Float TOTALE_VERSATO_EDEFAULT = null;

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
     * The default value of the '{@link #getNote() <em>Note</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected static final String NOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNote() <em>Note</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNote()
     * @generated
     * @ordered
     */
    protected String note = NOTE_EDEFAULT;

    /**
     * The default value of the '{@link #getIsNoleggio() <em>Is Noleggio</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsNoleggio()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_NOLEGGIO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getMaterialeNoleggiato() <em>Materiale
     * Noleggiato</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getMaterialeNoleggiato()
     * @generated
     * @ordered
     */
    protected EList<MaterialeNoleggiato> materialeNoleggiato;

    /**
     * The default value of the '{@link #getIsIscrizioneOk() <em>Is Iscrizione Ok</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsIscrizioneOk()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ISCRIZIONE_OK_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsIscrizioneOk() <em>Is Iscrizione Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsIscrizioneOk()
     * @generated
     * @ordered
     */
    protected Boolean isIscrizioneOk = IS_ISCRIZIONE_OK_EDEFAULT;

    /**
     * The default value of the '{@link #getQuotaNoleggio() <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getQuotaNoleggio()
     * @generated
     * @ordered
     */
    protected static final Float QUOTA_NOLEGGIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQuotaNoleggio() <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getQuotaNoleggio()
     * @generated
     * @ordered
     */
    protected Float quotaNoleggio = QUOTA_NOLEGGIO_EDEFAULT;

    /**
     * The default value of the '{@link #getIsCertificatoMedico() <em>Is Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsCertificatoMedico()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_CERTIFICATO_MEDICO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsCertificatoMedico() <em>Is Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsCertificatoMedico()
     * @generated
     * @ordered
     */
    protected Boolean isCertificatoMedico = IS_CERTIFICATO_MEDICO_EDEFAULT;

    /**
     * The default value of the '{@link #getIsCertificatoMedicoOk() <em>Is Certificato Medico Ok</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIsCertificatoMedicoOk()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_CERTIFICATO_MEDICO_OK_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getIsCertificatoMedicoOk() <em>Is Certificato Medico Ok</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getIsCertificatoMedicoOk()
     * @generated
     * @ordered
     */
    protected Boolean isCertificatoMedicoOk = IS_CERTIFICATO_MEDICO_OK_EDEFAULT;

    /**
     * The default value of the '{@link #getIsQuotaVersataOk() <em>Is Quota Versata Ok</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getIsQuotaVersataOk()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_QUOTA_VERSATA_OK_EDEFAULT = Boolean.FALSE;

    /**
     * The default value of the '{@link #getQuotaNoleggioDaVersare() <em>Quota Noleggio Da Versare</em>}' attribute.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @see #getQuotaNoleggioDaVersare()
     * @generated
     * @ordered
     */
    protected static final Float QUOTA_NOLEGGIO_DA_VERSARE_EDEFAULT = null;

    /**
     * The default value of the '{@link #getTotaleDaVersare() <em>Totale Da Versare</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTotaleDaVersare()
     * @generated
     * @ordered
     */
    protected static final Float TOTALE_DA_VERSARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTotaleDaVersare() <em>Totale Da Versare</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTotaleDaVersare()
     * @generated
     * @ordered
     */
    protected Float totaleDaVersare = TOTALE_DA_VERSARE_EDEFAULT;

    /**
     * The default value of the '{@link #getDifferenzaTotaleVersatoTotaleDaVersare()
     * <em>Differenza Totale Versato Totale Da Versare</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getDifferenzaTotaleVersatoTotaleDaVersare()
     * @generated
     * @ordered
     */
    protected static final Float DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAllievo() <em>Allievo</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getAllievo()
     * @generated
     * @ordered
     */
    protected Allievo allievo;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected IscrizioneImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.ISCRIZIONE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsModuloIscrizione() {
	return isModuloIscrizione;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsModuloIscrizione(Boolean newIsModuloIscrizione) {
	Boolean oldIsModuloIscrizione = isModuloIscrizione;
	isModuloIscrizione = newIsModuloIscrizione;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_MODULO_ISCRIZIONE,
		    oldIsModuloIscrizione, isModuloIscrizione));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsConsensoInformato() {
	return isConsensoInformato;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsConsensoInformato(Boolean newIsConsensoInformato) {
	Boolean oldIsConsensoInformato = isConsensoInformato;
	isConsensoInformato = newIsConsensoInformato;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_CONSENSO_INFORMATO,
		    oldIsConsensoInformato, isConsensoInformato));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsNuovoAllievo() {
	return isNuovoAllievo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsNuovoAllievo(Boolean newIsNuovoAllievo) {
	Boolean oldIsNuovoAllievo = isNuovoAllievo;
	isNuovoAllievo = newIsNuovoAllievo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_NUOVO_ALLIEVO,
		    oldIsNuovoAllievo, isNuovoAllievo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LocalDate getDataScadenzaCertificatoMedico() {
	return dataScadenzaCertificatoMedico;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataScadenzaCertificatoMedico(LocalDate newDataScadenzaCertificatoMedico) {
	LocalDate oldDataScadenzaCertificatoMedico = dataScadenzaCertificatoMedico;
	dataScadenzaCertificatoMedico = newDataScadenzaCertificatoMedico;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET,
		    ModelPackage.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO, oldDataScadenzaCertificatoMedico,
		    dataScadenzaCertificatoMedico));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsBollinoAnnoCorso() {
	return isBollinoAnnoCorso;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsBollinoAnnoCorso(Boolean newIsBollinoAnnoCorso) {
	Boolean oldIsBollinoAnnoCorso = isBollinoAnnoCorso;
	isBollinoAnnoCorso = newIsBollinoAnnoCorso;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO,
		    oldIsBollinoAnnoCorso, isBollinoAnnoCorso));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCaparra() {
	return caparra;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCaparra(Float newCaparra) {
	Float oldCaparra = caparra;
	caparra = newCaparra;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__CAPARRA, oldCaparra,
		    caparra));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSaldo() {
	return saldo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSaldo(Float newSaldo) {
	Float oldSaldo = saldo;
	saldo = newSaldo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__SALDO, oldSaldo, saldo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Float getTotaleVersato() {
	Float totale = Optional.ofNullable(getCaparra()).orElse(0F) + Optional.ofNullable(getSaldo()).orElse(0F)
		+ Optional.ofNullable(getQuotaNoleggio()).orElse(0F);
	System.out.println("totale calcolato in iscrizione:" + totale);
	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(Long newId) {
	Long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNote() {
	return note;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNote(String newNote) {
	String oldNote = note;
	note = newNote;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__NOTE, oldNote, note));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Boolean getIsNoleggio() {
	Boolean isNoleggio = !getMaterialeNoleggiato().isEmpty();
	System.out.println("Is noleggio:" + isNoleggio);
	return isNoleggio;

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<MaterialeNoleggiato> getMaterialeNoleggiato() {
	if (materialeNoleggiato == null) {
	    materialeNoleggiato = new EObjectEList<MaterialeNoleggiato>(MaterialeNoleggiato.class, this,
		    ModelPackage.ISCRIZIONE__MATERIALE_NOLEGGIATO);
	}
	return materialeNoleggiato;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Boolean getIsIscrizioneOk() {
	Boolean isIscrizioneOk = false;

	// verifico i documenti
	if (getIsBollinoAnnoCorso() && getIsConsensoInformato() && getIsModuloIscrizione()) {
	    // verifico il certificato medico
	    if (getIsCertificatoMedicoOk()) {
		// verifico le quote di iscrizione
		if (getIsQuotaVersataOk()) {
		    isIscrizioneOk = true;

		}
	    }
	}
	System.out.println("Is Iscrizione Ok:" + isIscrizioneOk);
	return isIscrizioneOk;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsIscrizioneOk(Boolean newIsIscrizioneOk) {
	Boolean oldIsIscrizioneOk = isIscrizioneOk;
	isIscrizioneOk = newIsIscrizioneOk;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_ISCRIZIONE_OK,
		    oldIsIscrizioneOk, isIscrizioneOk));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQuotaNoleggio() {
	return quotaNoleggio;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuotaNoleggio(Float newQuotaNoleggio) {
	Float oldQuotaNoleggio = quotaNoleggio;
	quotaNoleggio = newQuotaNoleggio;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO,
		    oldQuotaNoleggio, quotaNoleggio));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsCertificatoMedico() {
	return isCertificatoMedico;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsCertificatoMedico(Boolean newIsCertificatoMedico) {
	Boolean oldIsCertificatoMedico = isCertificatoMedico;
	isCertificatoMedico = newIsCertificatoMedico;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO,
		    oldIsCertificatoMedico, isCertificatoMedico));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsCertificatoMedicoOk() {
	return isCertificatoMedicoOk;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsCertificatoMedicoOk(Boolean newIsCertificatoMedicoOk) {
	Boolean oldIsCertificatoMedicoOk = isCertificatoMedicoOk;
	isCertificatoMedicoOk = newIsCertificatoMedicoOk;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK,
		    oldIsCertificatoMedicoOk, isCertificatoMedicoOk));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Boolean getIsQuotaVersataOk() {
	this.eAdapters();
	// this.

	return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Float getQuotaNoleggioDaVersare() {
	Float quota = 0.0F;
	if (getIsNoleggio()) {
	    for (MaterialeNoleggiato materiale : getMaterialeNoleggiato()) {
		quota += materiale.getMateriale().getQuotaNoleggio() * materiale.getQuantita();
	    }
	}
	System.out.println("Quota Noleggio Da Versare:" + quota);
	return quota;

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTotaleDaVersare() {
	return totaleDaVersare;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotaleDaVersare(Float newTotaleDaVersare) {
	Float oldTotaleDaVersare = totaleDaVersare;
	totaleDaVersare = newTotaleDaVersare;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__TOTALE_DA_VERSARE,
		    oldTotaleDaVersare, totaleDaVersare));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Float getDifferenzaTotaleVersatoTotaleDaVersare() {
	Float differenza = getTotaleVersato() - getTotaleDaVersare();
	System.out.println("Differenza:" + differenza);
	return differenza;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public EList<String> getMessaggiErrore() {
	List<String> messaggiList = new ArrayList<String>();
	if (!getIsModuloIscrizione()) {
	    messaggiList.add("Modello iscrizione non presente");
	}
	if (!getIsConsensoInformato()) {
	    messaggiList.add("Consenso informato non presente");
	}
	if (!getIsBollinoAnnoCorso()) {
	    messaggiList.add("Bollino per l'anno in corso non presente");
	}
	if (!getIsCertificatoMedico()) {
	    messaggiList.add("Certificato medico non presente");
	} else {
	    if (!getIsCertificatoMedicoOk()) {
		messaggiList.add("Data scadenza certificato medico inferiore alla data di fine corso o non presente");
	    }
	}
	if (!getIsQuotaVersataOk()) {
	    messaggiList.add("Quota versata non corretta");
	}
	EList<String> messaggi = new BasicEList<String>(messaggiList);
	return messaggi;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Allievo getAllievo() {
	return allievo;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAllievo(Allievo newAllievo) {
	Allievo oldAllievo = allievo;
	allievo = newAllievo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ISCRIZIONE__ALLIEVO, oldAllievo,
		    allievo));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.ISCRIZIONE__IS_MODULO_ISCRIZIONE:
	    return getIsModuloIscrizione();
	case ModelPackage.ISCRIZIONE__IS_CONSENSO_INFORMATO:
	    return getIsConsensoInformato();
	case ModelPackage.ISCRIZIONE__IS_NUOVO_ALLIEVO:
	    return getIsNuovoAllievo();
	case ModelPackage.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO:
	    return getDataScadenzaCertificatoMedico();
	case ModelPackage.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO:
	    return getIsBollinoAnnoCorso();
	case ModelPackage.ISCRIZIONE__CAPARRA:
	    return getCaparra();
	case ModelPackage.ISCRIZIONE__SALDO:
	    return getSaldo();
	case ModelPackage.ISCRIZIONE__TOTALE_VERSATO:
	    return getTotaleVersato();
	case ModelPackage.ISCRIZIONE__ID:
	    return getId();
	case ModelPackage.ISCRIZIONE__NOTE:
	    return getNote();
	case ModelPackage.ISCRIZIONE__IS_NOLEGGIO:
	    return getIsNoleggio();
	case ModelPackage.ISCRIZIONE__MATERIALE_NOLEGGIATO:
	    return getMaterialeNoleggiato();
	case ModelPackage.ISCRIZIONE__IS_ISCRIZIONE_OK:
	    return getIsIscrizioneOk();
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO:
	    return getQuotaNoleggio();
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO:
	    return getIsCertificatoMedico();
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK:
	    return getIsCertificatoMedicoOk();
	case ModelPackage.ISCRIZIONE__IS_QUOTA_VERSATA_OK:
	    return getIsQuotaVersataOk();
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE:
	    return getQuotaNoleggioDaVersare();
	case ModelPackage.ISCRIZIONE__TOTALE_DA_VERSARE:
	    return getTotaleDaVersare();
	case ModelPackage.ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE:
	    return getDifferenzaTotaleVersatoTotaleDaVersare();
	case ModelPackage.ISCRIZIONE__MESSAGGI_ERRORE:
	    return getMessaggiErrore();
	case ModelPackage.ISCRIZIONE__ALLIEVO:
	    return getAllievo();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.ISCRIZIONE__IS_MODULO_ISCRIZIONE:
	    setIsModuloIscrizione((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CONSENSO_INFORMATO:
	    setIsConsensoInformato((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_NUOVO_ALLIEVO:
	    setIsNuovoAllievo((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO:
	    setDataScadenzaCertificatoMedico((LocalDate) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO:
	    setIsBollinoAnnoCorso((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__CAPARRA:
	    setCaparra((Float) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__SALDO:
	    setSaldo((Float) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__NOTE:
	    setNote((String) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__MATERIALE_NOLEGGIATO:
	    getMaterialeNoleggiato().clear();
	    getMaterialeNoleggiato().addAll((Collection<? extends MaterialeNoleggiato>) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_ISCRIZIONE_OK:
	    setIsIscrizioneOk((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO:
	    setQuotaNoleggio((Float) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO:
	    setIsCertificatoMedico((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK:
	    setIsCertificatoMedicoOk((Boolean) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__TOTALE_DA_VERSARE:
	    setTotaleDaVersare((Float) newValue);
	    return;
	case ModelPackage.ISCRIZIONE__ALLIEVO:
	    setAllievo((Allievo) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.ISCRIZIONE__IS_MODULO_ISCRIZIONE:
	    setIsModuloIscrizione(IS_MODULO_ISCRIZIONE_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CONSENSO_INFORMATO:
	    setIsConsensoInformato(IS_CONSENSO_INFORMATO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__IS_NUOVO_ALLIEVO:
	    setIsNuovoAllievo(IS_NUOVO_ALLIEVO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO:
	    setDataScadenzaCertificatoMedico(DATA_SCADENZA_CERTIFICATO_MEDICO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO:
	    setIsBollinoAnnoCorso(IS_BOLLINO_ANNO_CORSO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__CAPARRA:
	    setCaparra(CAPARRA_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__SALDO:
	    setSaldo(SALDO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__NOTE:
	    setNote(NOTE_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__MATERIALE_NOLEGGIATO:
	    getMaterialeNoleggiato().clear();
	    return;
	case ModelPackage.ISCRIZIONE__IS_ISCRIZIONE_OK:
	    setIsIscrizioneOk(IS_ISCRIZIONE_OK_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO:
	    setQuotaNoleggio(QUOTA_NOLEGGIO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO:
	    setIsCertificatoMedico(IS_CERTIFICATO_MEDICO_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK:
	    setIsCertificatoMedicoOk(IS_CERTIFICATO_MEDICO_OK_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__TOTALE_DA_VERSARE:
	    setTotaleDaVersare(TOTALE_DA_VERSARE_EDEFAULT);
	    return;
	case ModelPackage.ISCRIZIONE__ALLIEVO:
	    setAllievo((Allievo) null);
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.ISCRIZIONE__IS_MODULO_ISCRIZIONE:
	    return IS_MODULO_ISCRIZIONE_EDEFAULT == null ? isModuloIscrizione != null
		    : !IS_MODULO_ISCRIZIONE_EDEFAULT.equals(isModuloIscrizione);
	case ModelPackage.ISCRIZIONE__IS_CONSENSO_INFORMATO:
	    return IS_CONSENSO_INFORMATO_EDEFAULT == null ? isConsensoInformato != null
		    : !IS_CONSENSO_INFORMATO_EDEFAULT.equals(isConsensoInformato);
	case ModelPackage.ISCRIZIONE__IS_NUOVO_ALLIEVO:
	    return IS_NUOVO_ALLIEVO_EDEFAULT == null ? isNuovoAllievo != null
		    : !IS_NUOVO_ALLIEVO_EDEFAULT.equals(isNuovoAllievo);
	case ModelPackage.ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO:
	    return DATA_SCADENZA_CERTIFICATO_MEDICO_EDEFAULT == null ? dataScadenzaCertificatoMedico != null
		    : !DATA_SCADENZA_CERTIFICATO_MEDICO_EDEFAULT.equals(dataScadenzaCertificatoMedico);
	case ModelPackage.ISCRIZIONE__IS_BOLLINO_ANNO_CORSO:
	    return IS_BOLLINO_ANNO_CORSO_EDEFAULT == null ? isBollinoAnnoCorso != null
		    : !IS_BOLLINO_ANNO_CORSO_EDEFAULT.equals(isBollinoAnnoCorso);
	case ModelPackage.ISCRIZIONE__CAPARRA:
	    return CAPARRA_EDEFAULT == null ? caparra != null : !CAPARRA_EDEFAULT.equals(caparra);
	case ModelPackage.ISCRIZIONE__SALDO:
	    return SALDO_EDEFAULT == null ? saldo != null : !SALDO_EDEFAULT.equals(saldo);
	case ModelPackage.ISCRIZIONE__TOTALE_VERSATO:
	    return TOTALE_VERSATO_EDEFAULT == null ? getTotaleVersato() != null
		    : !TOTALE_VERSATO_EDEFAULT.equals(getTotaleVersato());
	case ModelPackage.ISCRIZIONE__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.ISCRIZIONE__NOTE:
	    return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
	case ModelPackage.ISCRIZIONE__IS_NOLEGGIO:
	    return IS_NOLEGGIO_EDEFAULT == null ? getIsNoleggio() != null
		    : !IS_NOLEGGIO_EDEFAULT.equals(getIsNoleggio());
	case ModelPackage.ISCRIZIONE__MATERIALE_NOLEGGIATO:
	    return materialeNoleggiato != null && !materialeNoleggiato.isEmpty();
	case ModelPackage.ISCRIZIONE__IS_ISCRIZIONE_OK:
	    return IS_ISCRIZIONE_OK_EDEFAULT == null ? isIscrizioneOk != null
		    : !IS_ISCRIZIONE_OK_EDEFAULT.equals(isIscrizioneOk);
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO:
	    return QUOTA_NOLEGGIO_EDEFAULT == null ? quotaNoleggio != null
		    : !QUOTA_NOLEGGIO_EDEFAULT.equals(quotaNoleggio);
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO:
	    return IS_CERTIFICATO_MEDICO_EDEFAULT == null ? isCertificatoMedico != null
		    : !IS_CERTIFICATO_MEDICO_EDEFAULT.equals(isCertificatoMedico);
	case ModelPackage.ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK:
	    return IS_CERTIFICATO_MEDICO_OK_EDEFAULT == null ? isCertificatoMedicoOk != null
		    : !IS_CERTIFICATO_MEDICO_OK_EDEFAULT.equals(isCertificatoMedicoOk);
	case ModelPackage.ISCRIZIONE__IS_QUOTA_VERSATA_OK:
	    return IS_QUOTA_VERSATA_OK_EDEFAULT == null ? getIsQuotaVersataOk() != null
		    : !IS_QUOTA_VERSATA_OK_EDEFAULT.equals(getIsQuotaVersataOk());
	case ModelPackage.ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE:
	    return QUOTA_NOLEGGIO_DA_VERSARE_EDEFAULT == null ? getQuotaNoleggioDaVersare() != null
		    : !QUOTA_NOLEGGIO_DA_VERSARE_EDEFAULT.equals(getQuotaNoleggioDaVersare());
	case ModelPackage.ISCRIZIONE__TOTALE_DA_VERSARE:
	    return TOTALE_DA_VERSARE_EDEFAULT == null ? totaleDaVersare != null
		    : !TOTALE_DA_VERSARE_EDEFAULT.equals(totaleDaVersare);
	case ModelPackage.ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE:
	    return DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE_EDEFAULT == null
		    ? getDifferenzaTotaleVersatoTotaleDaVersare() != null
		    : !DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE_EDEFAULT
			    .equals(getDifferenzaTotaleVersatoTotaleDaVersare());
	case ModelPackage.ISCRIZIONE__MESSAGGI_ERRORE:
	    return !getMessaggiErrore().isEmpty();
	case ModelPackage.ISCRIZIONE__ALLIEVO:
	    return allievo != null;
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuilder result = new StringBuilder(super.toString());
	result.append(" (isModuloIscrizione: ");
	result.append(isModuloIscrizione);
	result.append(", isConsensoInformato: ");
	result.append(isConsensoInformato);
	result.append(", isNuovoAllievo: ");
	result.append(isNuovoAllievo);
	result.append(", dataScadenzaCertificatoMedico: ");
	result.append(dataScadenzaCertificatoMedico);
	result.append(", isBollinoAnnoCorso: ");
	result.append(isBollinoAnnoCorso);
	result.append(", caparra: ");
	result.append(caparra);
	result.append(", saldo: ");
	result.append(saldo);
	result.append(", id: ");
	result.append(id);
	result.append(", note: ");
	result.append(note);
	result.append(", isIscrizioneOk: ");
	result.append(isIscrizioneOk);
	result.append(", quotaNoleggio: ");
	result.append(quotaNoleggio);
	result.append(", isCertificatoMedico: ");
	result.append(isCertificatoMedico);
	result.append(", isCertificatoMedicoOk: ");
	result.append(isCertificatoMedicoOk);
	result.append(", totaleDaVersare: ");
	result.append(totaleDaVersare);
	result.append(')');
	return result.toString();
    }

} // IscrizioneImpl
