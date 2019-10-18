/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.Bilancio;
import it.caicividale.corsicai.model.Cassa;
import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.DizMateriale;
import it.caicividale.corsicai.model.ESesso;
import it.caicividale.corsicai.model.ESiglaCorso;
import it.caicividale.corsicai.model.ETipoVoceDiSpesa;
import it.caicividale.corsicai.model.ETitoloIstruttore;
import it.caicividale.corsicai.model.ElencoCorsi;
import it.caicividale.corsicai.model.ElencoIscrizioni;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.Lezione;
import it.caicividale.corsicai.model.LezionePratica;
import it.caicividale.corsicai.model.LezioneTeorica;
import it.caicividale.corsicai.model.MaterialeNoleggiato;
import it.caicividale.corsicai.model.ModelFactory;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Persona;
import it.caicividale.corsicai.model.PresenzaLezione;
import it.caicividale.corsicai.model.RipartizioneCassa;
import it.caicividale.corsicai.model.Squadra;
import it.caicividale.corsicai.model.TipoEsitoValutazione;
import it.caicividale.corsicai.model.VoceDiSpesa;

import it.caicividale.corsicai.model.valueobject.EMail;
import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass personaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allievoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass corsoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iscrizioneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lezioneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lezioneTeoricaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lezionePraticaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass istruttoreEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass squadraEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bilancioEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cassaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ripartizioneCassaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass presenzaLezioneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dizMaterialeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass materialeNoleggiatoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voceDiSpesaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elencoCorsiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elencoIscrizioniEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eSessoEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eTitoloIstruttoreEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tipoEsitoValutazioneEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eSiglaCorsoEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eTipoVoceDiSpesaEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType numeroCellulareEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eMailEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see it.caicividale.corsicai.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl() {
	super(eNS_URI, ModelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init() {
	if (isInited)
	    return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

	// Obtain or create and register package
	Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
	ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
		? (ModelPackageImpl) registeredModelPackage
		: new ModelPackageImpl();

	isInited = true;

	// Create package meta-data objects
	theModelPackage.createPackageContents();

	// Initialize created meta-data
	theModelPackage.initializePackageContents();

	// Mark meta-data to indicate it can't be changed
	theModelPackage.freeze();

	// Update the registry and return the package
	EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
	return theModelPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPersona() {
	return personaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_Nome() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_Cognome() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_Sesso() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_NumeroCellulare() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_EMail() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_ResidenzaVia() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_ResidenzaCitta() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_ResidenzaProvincia() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_ResidenzaCap() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_NascitaData() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_NascitaCitta() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_NascitaProvincia() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_SezioneCaiAppartenenza() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_Id() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPersona_IsStaffScuola() {
	return (EAttribute) personaEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAllievo() {
	return allievoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAllievo_IsDiploma() {
	return (EAttribute) allievoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCorso() {
	return corsoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Anno() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_QuotaIscrizione() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_QuotaCaparra() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_IsModulo() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Direttore() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Vicedirettore() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Segretario() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Testo() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Bilancio() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Id() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Cassa() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Iscrizioni() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_DataInizio() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_DataFine() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_StaffIstruttori() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Nome() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Sigla() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_Equipaggiamento() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllievi() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviIscrizioneOk() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviIscrizioneKo() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviNuoviIscritti() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviMaschi() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviFemmine() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_NumeroAllieviConNoleggio() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCorso_ListRiepilogonoleggio() {
	return (EAttribute) corsoEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_Moduli() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_LezioniPratiche() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCorso_LezioniTeoriche() {
	return (EReference) corsoEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIscrizione() {
	return iscrizioneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsModuloIscrizione() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsConsensoInformato() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsNuovoAllievo() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_DataScadenzaCertificatoMedico() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsBollinoAnnoCorso() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_Caparra() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_Saldo() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_TotaleVersato() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_Id() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_Note() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsNoleggio() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIscrizione_MaterialeNoleggiato() {
	return (EReference) iscrizioneEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsIscrizioneOk() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_QuotaNoleggio() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsCertificatoMedico() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsCertificatoMedicoOk() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_IsQuotaVersataOk() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_QuotaNoleggioDaVersare() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_TotaleDaVersare() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIscrizione_MessaggiErrore() {
	return (EAttribute) iscrizioneEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIscrizione_Allievo() {
	return (EReference) iscrizioneEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLezione() {
	return lezioneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_Titolo() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_DataSvolgimento() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_LuogoSvolgimento() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_Durata() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_Id() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLezione_PresenzaLezione() {
	return (EReference) lezioneEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezione_ArgomentiTrattati() {
	return (EAttribute) lezioneEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLezioneTeorica() {
	return lezioneTeoricaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezioneTeorica_Docente() {
	return (EAttribute) lezioneTeoricaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLezionePratica() {
	return lezionePraticaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLezionePratica_LuogoRitrovo() {
	return (EAttribute) lezionePraticaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLezionePratica_Squadre() {
	return (EReference) lezionePraticaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIstruttore() {
	return istruttoreEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIstruttore_Titolo() {
	return (EAttribute) istruttoreEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIstruttore_IsAttivo() {
	return (EAttribute) istruttoreEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSquadra() {
	return squadraEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSquadra_CapoSquadra() {
	return (EReference) squadraEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSquadra_AllieviInSquadra() {
	return (EReference) squadraEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSquadra_Id() {
	return (EAttribute) squadraEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSquadra_Nome() {
	return (EAttribute) squadraEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSquadra_StaffSquadra() {
	return (EReference) squadraEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBilancio() {
	return bilancioEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_Id() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBilancio_VociDiSpesa() {
	return (EReference) bilancioEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_Nota() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_TotaleEntrate() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_TotaleUscite() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_TotaleIscrizioni() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_TotaleEntrateConIscrizioni() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBilancio_AvanzoCorso() {
	return (EAttribute) bilancioEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCassa() {
	return cassaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCassa_Id() {
	return (EAttribute) cassaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCassa_Totale() {
	return (EAttribute) cassaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCassa_RipartizioniCassa() {
	return (EReference) cassaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCassa_Nota() {
	return (EAttribute) cassaEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCassa_DifferenzaTotaleCasseEAvanzo() {
	return (EAttribute) cassaEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRipartizioneCassa() {
	return ripartizioneCassaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRipartizioneCassa_Sede() {
	return (EAttribute) ripartizioneCassaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRipartizioneCassa_Quota() {
	return (EAttribute) ripartizioneCassaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRipartizioneCassa_Id() {
	return (EAttribute) ripartizioneCassaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPresenzaLezione() {
	return presenzaLezioneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenzaLezione_AllieviPresenti() {
	return (EReference) presenzaLezioneEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPresenzaLezione_IstruttoriPresenti() {
	return (EReference) presenzaLezioneEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPresenzaLezione_Id() {
	return (EAttribute) presenzaLezioneEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDizMateriale() {
	return dizMaterialeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDizMateriale_Id() {
	return (EAttribute) dizMaterialeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDizMateriale_Nome() {
	return (EAttribute) dizMaterialeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDizMateriale_Nota() {
	return (EAttribute) dizMaterialeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDizMateriale_QuotaNoleggio() {
	return (EAttribute) dizMaterialeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMaterialeNoleggiato() {
	return materialeNoleggiatoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMaterialeNoleggiato_Materiale() {
	return (EReference) materialeNoleggiatoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMaterialeNoleggiato_Quantita() {
	return (EAttribute) materialeNoleggiatoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMaterialeNoleggiato_DataNoleggio() {
	return (EAttribute) materialeNoleggiatoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMaterialeNoleggiato_Id() {
	return (EAttribute) materialeNoleggiatoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVoceDiSpesa() {
	return voceDiSpesaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Titolo() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Valore() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Tipo() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Id() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Nota() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoceDiSpesa_Data() {
	return (EAttribute) voceDiSpesaEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getElencoCorsi() {
	return elencoCorsiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getElencoCorsi_ElencoCorsi() {
	return (EReference) elencoCorsiEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getElencoIscrizioni() {
	return elencoIscrizioniEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getElencoIscrizioni_ElencoIscrizioni() {
	return (EReference) elencoIscrizioniEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getESesso() {
	return eSessoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getETitoloIstruttore() {
	return eTitoloIstruttoreEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getTipoEsitoValutazione() {
	return tipoEsitoValutazioneEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getESiglaCorso() {
	return eSiglaCorsoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getETipoVoceDiSpesa() {
	return eTipoVoceDiSpesaEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getNumeroCellulare() {
	return numeroCellulareEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getEMail() {
	return eMailEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelFactory getModelFactory() {
	return (ModelFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
	if (isCreated)
	    return;
	isCreated = true;

	// Create classes and their features
	personaEClass = createEClass(PERSONA);
	createEAttribute(personaEClass, PERSONA__NOME);
	createEAttribute(personaEClass, PERSONA__COGNOME);
	createEAttribute(personaEClass, PERSONA__SESSO);
	createEAttribute(personaEClass, PERSONA__NUMERO_CELLULARE);
	createEAttribute(personaEClass, PERSONA__EMAIL);
	createEAttribute(personaEClass, PERSONA__RESIDENZA_VIA);
	createEAttribute(personaEClass, PERSONA__RESIDENZA_CITTA);
	createEAttribute(personaEClass, PERSONA__RESIDENZA_PROVINCIA);
	createEAttribute(personaEClass, PERSONA__RESIDENZA_CAP);
	createEAttribute(personaEClass, PERSONA__NASCITA_DATA);
	createEAttribute(personaEClass, PERSONA__NASCITA_CITTA);
	createEAttribute(personaEClass, PERSONA__NASCITA_PROVINCIA);
	createEAttribute(personaEClass, PERSONA__SEZIONE_CAI_APPARTENENZA);
	createEAttribute(personaEClass, PERSONA__ID);
	createEAttribute(personaEClass, PERSONA__IS_STAFF_SCUOLA);

	allievoEClass = createEClass(ALLIEVO);
	createEAttribute(allievoEClass, ALLIEVO__IS_DIPLOMA);

	corsoEClass = createEClass(CORSO);
	createEAttribute(corsoEClass, CORSO__ANNO);
	createEAttribute(corsoEClass, CORSO__QUOTA_ISCRIZIONE);
	createEAttribute(corsoEClass, CORSO__QUOTA_CAPARRA);
	createEAttribute(corsoEClass, CORSO__IS_MODULO);
	createEReference(corsoEClass, CORSO__DIRETTORE);
	createEReference(corsoEClass, CORSO__VICEDIRETTORE);
	createEReference(corsoEClass, CORSO__SEGRETARIO);
	createEAttribute(corsoEClass, CORSO__TESTO);
	createEReference(corsoEClass, CORSO__BILANCIO);
	createEAttribute(corsoEClass, CORSO__ID);
	createEReference(corsoEClass, CORSO__CASSA);
	createEReference(corsoEClass, CORSO__ISCRIZIONI);
	createEAttribute(corsoEClass, CORSO__DATA_INIZIO);
	createEAttribute(corsoEClass, CORSO__DATA_FINE);
	createEReference(corsoEClass, CORSO__STAFF_ISTRUTTORI);
	createEAttribute(corsoEClass, CORSO__NOME);
	createEAttribute(corsoEClass, CORSO__SIGLA);
	createEAttribute(corsoEClass, CORSO__EQUIPAGGIAMENTO);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_MASCHI);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_FEMMINE);
	createEAttribute(corsoEClass, CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO);
	createEAttribute(corsoEClass, CORSO__LIST_RIEPILOGONOLEGGIO);
	createEReference(corsoEClass, CORSO__MODULI);
	createEReference(corsoEClass, CORSO__LEZIONI_PRATICHE);
	createEReference(corsoEClass, CORSO__LEZIONI_TEORICHE);

	iscrizioneEClass = createEClass(ISCRIZIONE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_MODULO_ISCRIZIONE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_CONSENSO_INFORMATO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_NUOVO_ALLIEVO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_BOLLINO_ANNO_CORSO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__CAPARRA);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__SALDO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__TOTALE_VERSATO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__ID);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__NOTE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_NOLEGGIO);
	createEReference(iscrizioneEClass, ISCRIZIONE__MATERIALE_NOLEGGIATO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_ISCRIZIONE_OK);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__QUOTA_NOLEGGIO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_CERTIFICATO_MEDICO);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__IS_QUOTA_VERSATA_OK);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__TOTALE_DA_VERSARE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE);
	createEAttribute(iscrizioneEClass, ISCRIZIONE__MESSAGGI_ERRORE);
	createEReference(iscrizioneEClass, ISCRIZIONE__ALLIEVO);

	lezioneEClass = createEClass(LEZIONE);
	createEAttribute(lezioneEClass, LEZIONE__TITOLO);
	createEAttribute(lezioneEClass, LEZIONE__DATA_SVOLGIMENTO);
	createEAttribute(lezioneEClass, LEZIONE__LUOGO_SVOLGIMENTO);
	createEAttribute(lezioneEClass, LEZIONE__DURATA);
	createEAttribute(lezioneEClass, LEZIONE__ID);
	createEReference(lezioneEClass, LEZIONE__PRESENZA_LEZIONE);
	createEAttribute(lezioneEClass, LEZIONE__ARGOMENTI_TRATTATI);

	lezioneTeoricaEClass = createEClass(LEZIONE_TEORICA);
	createEAttribute(lezioneTeoricaEClass, LEZIONE_TEORICA__DOCENTE);

	lezionePraticaEClass = createEClass(LEZIONE_PRATICA);
	createEAttribute(lezionePraticaEClass, LEZIONE_PRATICA__LUOGO_RITROVO);
	createEReference(lezionePraticaEClass, LEZIONE_PRATICA__SQUADRE);

	istruttoreEClass = createEClass(ISTRUTTORE);
	createEAttribute(istruttoreEClass, ISTRUTTORE__TITOLO);
	createEAttribute(istruttoreEClass, ISTRUTTORE__IS_ATTIVO);

	squadraEClass = createEClass(SQUADRA);
	createEReference(squadraEClass, SQUADRA__CAPO_SQUADRA);
	createEReference(squadraEClass, SQUADRA__ALLIEVI_IN_SQUADRA);
	createEAttribute(squadraEClass, SQUADRA__ID);
	createEAttribute(squadraEClass, SQUADRA__NOME);
	createEReference(squadraEClass, SQUADRA__STAFF_SQUADRA);

	bilancioEClass = createEClass(BILANCIO);
	createEAttribute(bilancioEClass, BILANCIO__ID);
	createEReference(bilancioEClass, BILANCIO__VOCI_DI_SPESA);
	createEAttribute(bilancioEClass, BILANCIO__NOTA);
	createEAttribute(bilancioEClass, BILANCIO__TOTALE_ENTRATE);
	createEAttribute(bilancioEClass, BILANCIO__TOTALE_USCITE);
	createEAttribute(bilancioEClass, BILANCIO__TOTALE_ISCRIZIONI);
	createEAttribute(bilancioEClass, BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI);
	createEAttribute(bilancioEClass, BILANCIO__AVANZO_CORSO);

	cassaEClass = createEClass(CASSA);
	createEAttribute(cassaEClass, CASSA__ID);
	createEAttribute(cassaEClass, CASSA__TOTALE);
	createEReference(cassaEClass, CASSA__RIPARTIZIONI_CASSA);
	createEAttribute(cassaEClass, CASSA__NOTA);
	createEAttribute(cassaEClass, CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO);

	ripartizioneCassaEClass = createEClass(RIPARTIZIONE_CASSA);
	createEAttribute(ripartizioneCassaEClass, RIPARTIZIONE_CASSA__SEDE);
	createEAttribute(ripartizioneCassaEClass, RIPARTIZIONE_CASSA__QUOTA);
	createEAttribute(ripartizioneCassaEClass, RIPARTIZIONE_CASSA__ID);

	presenzaLezioneEClass = createEClass(PRESENZA_LEZIONE);
	createEReference(presenzaLezioneEClass, PRESENZA_LEZIONE__ALLIEVI_PRESENTI);
	createEReference(presenzaLezioneEClass, PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI);
	createEAttribute(presenzaLezioneEClass, PRESENZA_LEZIONE__ID);

	dizMaterialeEClass = createEClass(DIZ_MATERIALE);
	createEAttribute(dizMaterialeEClass, DIZ_MATERIALE__ID);
	createEAttribute(dizMaterialeEClass, DIZ_MATERIALE__NOME);
	createEAttribute(dizMaterialeEClass, DIZ_MATERIALE__NOTA);
	createEAttribute(dizMaterialeEClass, DIZ_MATERIALE__QUOTA_NOLEGGIO);

	materialeNoleggiatoEClass = createEClass(MATERIALE_NOLEGGIATO);
	createEReference(materialeNoleggiatoEClass, MATERIALE_NOLEGGIATO__MATERIALE);
	createEAttribute(materialeNoleggiatoEClass, MATERIALE_NOLEGGIATO__QUANTITA);
	createEAttribute(materialeNoleggiatoEClass, MATERIALE_NOLEGGIATO__DATA_NOLEGGIO);
	createEAttribute(materialeNoleggiatoEClass, MATERIALE_NOLEGGIATO__ID);

	voceDiSpesaEClass = createEClass(VOCE_DI_SPESA);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__TITOLO);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__VALORE);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__TIPO);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__ID);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__NOTA);
	createEAttribute(voceDiSpesaEClass, VOCE_DI_SPESA__DATA);

	elencoCorsiEClass = createEClass(ELENCO_CORSI);
	createEReference(elencoCorsiEClass, ELENCO_CORSI__ELENCO_CORSI);

	elencoIscrizioniEClass = createEClass(ELENCO_ISCRIZIONI);
	createEReference(elencoIscrizioniEClass, ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI);

	// Create enums
	eSessoEEnum = createEEnum(ESESSO);
	eTitoloIstruttoreEEnum = createEEnum(ETITOLO_ISTRUTTORE);
	tipoEsitoValutazioneEEnum = createEEnum(TIPO_ESITO_VALUTAZIONE);
	eSiglaCorsoEEnum = createEEnum(ESIGLA_CORSO);
	eTipoVoceDiSpesaEEnum = createEEnum(ETIPO_VOCE_DI_SPESA);

	// Create data types
	numeroCellulareEDataType = createEDataType(NUMERO_CELLULARE);
	eMailEDataType = createEDataType(EMAIL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
	if (isInitialized)
	    return;
	isInitialized = true;

	// Initialize package
	setName(eNAME);
	setNsPrefix(eNS_PREFIX);
	setNsURI(eNS_URI);

	// Create type parameters

	// Set bounds for type parameters

	// Add supertypes to classes
	allievoEClass.getESuperTypes().add(this.getPersona());
	lezioneTeoricaEClass.getESuperTypes().add(this.getLezione());
	lezionePraticaEClass.getESuperTypes().add(this.getLezione());
	istruttoreEClass.getESuperTypes().add(this.getPersona());

	// Initialize classes, features, and operations; add parameters
	initEClass(personaEClass, Persona.class, "Persona", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getPersona_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Persona.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_Cognome(), ecorePackage.getEString(), "cognome", null, 1, 1, Persona.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_Sesso(), this.getESesso(), "sesso", null, 0, 1, Persona.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_NumeroCellulare(), this.getNumeroCellulare(), "numeroCellulare", null, 0, 1,
		Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_EMail(), this.getEMail(), "eMail", null, 0, 1, Persona.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_ResidenzaVia(), ecorePackage.getEString(), "residenzaVia", null, 1, 1, Persona.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_ResidenzaCitta(), ecorePackage.getEString(), "residenzaCitta", null, 1, 1,
		Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_ResidenzaProvincia(), ecorePackage.getEString(), "residenzaProvincia", null, 1, 1,
		Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_ResidenzaCap(), ecorePackage.getEString(), "residenzaCap", null, 1, 1, Persona.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_NascitaData(), ecorePackage.getEDate(), "nascitaData", null, 1, 1, Persona.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_NascitaCitta(), ecorePackage.getEString(), "nascitaCitta", null, 0, 1, Persona.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_NascitaProvincia(), ecorePackage.getEString(), "nascitaProvincia", null, 0, 1,
		Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_SezioneCaiAppartenenza(), ecorePackage.getEString(), "sezioneCaiAppartenenza", null,
		1, 1, Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Persona.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPersona_IsStaffScuola(), ecorePackage.getEBooleanObject(), "isStaffScuola", "false", 1, 1,
		Persona.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(allievoEClass, Allievo.class, "Allievo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getAllievo_IsDiploma(), ecorePackage.getEBooleanObject(), "isDiploma", "false", 0, 1,
		Allievo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(corsoEClass, Corso.class, "Corso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getCorso_Anno(), ecorePackage.getEIntegerObject(), "anno", null, 1, 1, Corso.class, IS_TRANSIENT,
		IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_QuotaIscrizione(), ecorePackage.getEFloatObject(), "quotaIscrizione", null, 1, 1,
		Corso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
		IS_ORDERED);
	initEAttribute(getCorso_QuotaCaparra(), ecorePackage.getEFloatObject(), "quotaCaparra", null, 1, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_IsModulo(), ecorePackage.getEBooleanObject(), "isModulo", "False", 1, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_Direttore(), this.getIstruttore(), null, "direttore", null, 1, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_Vicedirettore(), this.getIstruttore(), null, "vicedirettore", null, 0, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_Segretario(), this.getPersona(), null, "segretario", null, 1, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_Testo(), ecorePackage.getEString(), "testo", null, 0, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_Bilancio(), this.getBilancio(), null, "bilancio", null, 0, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_Cassa(), this.getCassa(), null, "cassa", null, 0, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
		IS_ORDERED);
	initEReference(getCorso_Iscrizioni(), this.getIscrizione(), null, "iscrizioni", null, 0, -1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_DataInizio(), ecorePackage.getEDate(), "dataInizio", null, 1, 1, Corso.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_DataFine(), ecorePackage.getEDate(), "dataFine", null, 1, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_StaffIstruttori(), this.getIstruttore(), null, "staffIstruttori", null, 0, -1,
		Corso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_Sigla(), this.getESiglaCorso(), "sigla", null, 1, 1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCorso_Equipaggiamento(), ecorePackage.getEString(), "equipaggiamento", null, 0, 1,
		Corso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
		IS_ORDERED);
	initEAttribute(getCorso_NumeroAllievi(), ecorePackage.getEIntegerObject(), "numeroAllievi", null, 1, 1,
		Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED,
		!IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviIscrizioneOk(), ecorePackage.getEIntegerObject(),
		"numeroAllieviIscrizioneOk", null, 1, 1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
		!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviIscrizioneKo(), ecorePackage.getEIntegerObject(),
		"numeroAllieviIscrizioneKo", null, 1, 1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
		!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviNuoviIscritti(), ecorePackage.getEIntegerObject(),
		"numeroAllieviNuoviIscritti", null, 1, 1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
		!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviMaschi(), ecorePackage.getEIntegerObject(), "numeroAllieviMaschi", null, 1,
		1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviFemmine(), ecorePackage.getEIntegerObject(), "numeroAllieviFemmine", null,
		1, 1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_NumeroAllieviConNoleggio(), ecorePackage.getEIntegerObject(),
		"numeroAllieviConNoleggio", null, 1, 1, Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
		!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getCorso_ListRiepilogonoleggio(), ecorePackage.getEEList(), "listRiepilogonoleggio", null, 0, 1,
		Corso.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED,
		!IS_ORDERED);
	initEReference(getCorso_Moduli(), this.getCorso(), null, "moduli", null, 0, -1, Corso.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
		IS_ORDERED);
	initEReference(getCorso_LezioniPratiche(), this.getLezionePratica(), null, "lezioniPratiche", null, 0, -1,
		Corso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getCorso_LezioniTeoriche(), this.getLezioneTeorica(), null, "lezioniTeoriche", null, 0, -1,
		Corso.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(iscrizioneEClass, Iscrizione.class, "Iscrizione", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getIscrizione_IsModuloIscrizione(), ecorePackage.getEBooleanObject(), "isModuloIscrizione",
		"False", 0, 1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsConsensoInformato(), ecorePackage.getEBooleanObject(), "isConsensoInformato",
		"False", 0, 1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsNuovoAllievo(), ecorePackage.getEBooleanObject(), "isNuovoAllievo", "False", 0,
		1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_DataScadenzaCertificatoMedico(), ecorePackage.getEDate(),
		"dataScadenzaCertificatoMedico", null, 0, 1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE,
		IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsBollinoAnnoCorso(), ecorePackage.getEBooleanObject(), "isBollinoAnnoCorso",
		"False", 0, 1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_Caparra(), ecorePackage.getEFloatObject(), "caparra", null, 0, 1, Iscrizione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_Saldo(), ecorePackage.getEFloatObject(), "saldo", null, 0, 1, Iscrizione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_TotaleVersato(), ecorePackage.getEFloatObject(), "totaleVersato", null, 0, 1,
		Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Iscrizione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_Note(), ecorePackage.getEString(), "note", null, 0, 1, Iscrizione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsNoleggio(), ecorePackage.getEBooleanObject(), "isNoleggio", "False", 0, 1,
		Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEReference(getIscrizione_MaterialeNoleggiato(), this.getMaterialeNoleggiato(), null, "materialeNoleggiato",
		null, 0, -1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
		IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsIscrizioneOk(), ecorePackage.getEBooleanObject(), "isIscrizioneOk", "False", 1,
		1, Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_QuotaNoleggio(), ecorePackage.getEFloatObject(), "quotaNoleggio", null, 0, 1,
		Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsCertificatoMedico(), ecorePackage.getEBooleanObject(), "isCertificatoMedico",
		"False", 0, 1, Iscrizione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIscrizione_IsCertificatoMedicoOk(), ecorePackage.getEBooleanObject(), "isCertificatoMedicoOk",
		"False", 0, 1, Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		!IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_IsQuotaVersataOk(), ecorePackage.getEBooleanObject(), "isQuotaVersataOk", "False",
		0, 1, Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_QuotaNoleggioDaVersare(), ecorePackage.getEFloatObject(), "quotaNoleggioDaVersare",
		null, 0, 1, Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		!IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_TotaleDaVersare(), ecorePackage.getEFloatObject(), "totaleDaVersare", null, 0, 1,
		Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare(), ecorePackage.getEFloatObject(),
		"differenzaTotaleVersatoTotaleDaVersare", null, 0, 1, Iscrizione.class, IS_TRANSIENT, IS_VOLATILE,
		!IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getIscrizione_MessaggiErrore(), ecorePackage.getEString(), "messaggiErrore", null, 0, -1,
		Iscrizione.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEReference(getIscrizione_Allievo(), this.getAllievo(), null, "allievo", null, 1, 1, Iscrizione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(lezioneEClass, Lezione.class, "Lezione", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getLezione_Titolo(), ecorePackage.getEString(), "titolo", null, 1, 1, Lezione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getLezione_DataSvolgimento(), ecorePackage.getEDate(), "dataSvolgimento", null, 0, 1,
		Lezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getLezione_LuogoSvolgimento(), ecorePackage.getEString(), "luogoSvolgimento", null, 0, 1,
		Lezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getLezione_Durata(), ecorePackage.getEFloatObject(), "durata", null, 0, 1, Lezione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getLezione_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Lezione.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getLezione_PresenzaLezione(), this.getPresenzaLezione(), null, "presenzaLezione", null, 1, 1,
		Lezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getLezione_ArgomentiTrattati(), ecorePackage.getEString(), "argomentiTrattati", null, 1, 1,
		Lezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(lezioneTeoricaEClass, LezioneTeorica.class, "LezioneTeorica", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getLezioneTeorica_Docente(), ecorePackage.getEString(), "Docente", null, 0, 1,
		LezioneTeorica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(lezionePraticaEClass, LezionePratica.class, "LezionePratica", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getLezionePratica_LuogoRitrovo(), ecorePackage.getEString(), "luogoRitrovo", null, 0, 1,
		LezionePratica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEReference(getLezionePratica_Squadre(), this.getSquadra(), null, "squadre", null, 1, -1,
		LezionePratica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(istruttoreEClass, Istruttore.class, "Istruttore", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getIstruttore_Titolo(), this.getETitoloIstruttore(), "titolo", null, 1, 1, Istruttore.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getIstruttore_IsAttivo(), ecorePackage.getEBooleanObject(), "isAttivo", "true", 1, 1,
		Istruttore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(squadraEClass, Squadra.class, "Squadra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEReference(getSquadra_CapoSquadra(), this.getIstruttore(), null, "capoSquadra", null, 1, 1, Squadra.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getSquadra_AllieviInSquadra(), this.getAllievo(), null, "allieviInSquadra", null, 1, -1,
		Squadra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getSquadra_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Squadra.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getSquadra_Nome(), ecorePackage.getEString(), "nome", null, 0, 1, Squadra.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getSquadra_StaffSquadra(), this.getIstruttore(), null, "staffSquadra", null, 0, -1,
		Squadra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(bilancioEClass, Bilancio.class, "Bilancio", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getBilancio_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, Bilancio.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getBilancio_VociDiSpesa(), this.getVoceDiSpesa(), null, "vociDiSpesa", null, 0, -1,
		Bilancio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getBilancio_Nota(), ecorePackage.getEString(), "nota", null, 0, 1, Bilancio.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getBilancio_TotaleEntrate(), ecorePackage.getEFloat(), "totaleEntrate", null, 1, 1,
		Bilancio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getBilancio_TotaleUscite(), ecorePackage.getEFloat(), "totaleUscite", null, 1, 1, Bilancio.class,
		IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getBilancio_TotaleIscrizioni(), ecorePackage.getEFloat(), "totaleIscrizioni", null, 1, 1,
		Bilancio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
		IS_DERIVED, !IS_ORDERED);
	initEAttribute(getBilancio_TotaleEntrateConIscrizioni(), ecorePackage.getEFloat(), "totaleEntrateConIscrizioni",
		null, 1, 1, Bilancio.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		!IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEAttribute(getBilancio_AvanzoCorso(), ecorePackage.getEFloat(), "avanzoCorso", null, 1, 1, Bilancio.class,
		IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

	initEClass(cassaEClass, Cassa.class, "Cassa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getCassa_Id(), ecorePackage.getELong(), "id", null, 1, 1, Cassa.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCassa_Totale(), ecorePackage.getEFloat(), "totale", null, 1, 1, Cassa.class, IS_TRANSIENT,
		IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
	initEReference(getCassa_RipartizioniCassa(), this.getRipartizioneCassa(), null, "ripartizioniCassa", null, 0,
		-1, Cassa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCassa_Nota(), ecorePackage.getEString(), "nota", null, 0, 1, Cassa.class, !IS_TRANSIENT,
		!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getCassa_DifferenzaTotaleCasseEAvanzo(), ecorePackage.getEFloat(),
		"differenzaTotaleCasseEAvanzo", null, 1, 1, Cassa.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
		!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

	initEClass(ripartizioneCassaEClass, RipartizioneCassa.class, "RipartizioneCassa", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getRipartizioneCassa_Sede(), ecorePackage.getEString(), "sede", null, 1, 1,
		RipartizioneCassa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getRipartizioneCassa_Quota(), ecorePackage.getEFloat(), "quota", null, 1, 1,
		RipartizioneCassa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);
	initEAttribute(getRipartizioneCassa_Id(), ecorePackage.getELongObject(), "id", null, 1, 1,
		RipartizioneCassa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(presenzaLezioneEClass, PresenzaLezione.class, "PresenzaLezione", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEReference(getPresenzaLezione_AllieviPresenti(), this.getAllievo(), null, "allieviPresenti", null, 0, -1,
		PresenzaLezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEReference(getPresenzaLezione_IstruttoriPresenti(), this.getIstruttore(), null, "istruttoriPresenti", null,
		0, -1, PresenzaLezione.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
		IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getPresenzaLezione_Id(), ecorePackage.getELong(), "id", null, 1, 1, PresenzaLezione.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(dizMaterialeEClass, DizMateriale.class, "DizMateriale", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getDizMateriale_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, DizMateriale.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getDizMateriale_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, DizMateriale.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getDizMateriale_Nota(), ecorePackage.getEString(), "nota", null, 0, 1, DizMateriale.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getDizMateriale_QuotaNoleggio(), ecorePackage.getEFloat(), "quotaNoleggio", null, 1, 1,
		DizMateriale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(materialeNoleggiatoEClass, MaterialeNoleggiato.class, "MaterialeNoleggiato", !IS_ABSTRACT,
		!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	initEReference(getMaterialeNoleggiato_Materiale(), this.getDizMateriale(), null, "materiale", null, 1, 1,
		MaterialeNoleggiato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
		IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getMaterialeNoleggiato_Quantita(), ecorePackage.getEShort(), "quantita", null, 1, 1,
		MaterialeNoleggiato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getMaterialeNoleggiato_DataNoleggio(), ecorePackage.getEDate(), "dataNoleggio", null, 1, 1,
		MaterialeNoleggiato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
		IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getMaterialeNoleggiato_Id(), ecorePackage.getELong(), "id", null, 1, 1,
		MaterialeNoleggiato.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
		!IS_DERIVED, IS_ORDERED);

	initEClass(voceDiSpesaEClass, VoceDiSpesa.class, "VoceDiSpesa", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEAttribute(getVoceDiSpesa_Titolo(), ecorePackage.getEString(), "titolo", null, 1, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getVoceDiSpesa_Valore(), ecorePackage.getEFloat(), "valore", null, 1, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getVoceDiSpesa_Tipo(), this.getETipoVoceDiSpesa(), "tipo", null, 1, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getVoceDiSpesa_Id(), ecorePackage.getELongObject(), "id", null, 1, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getVoceDiSpesa_Nota(), ecorePackage.getEString(), "nota", null, 0, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	initEAttribute(getVoceDiSpesa_Data(), ecorePackage.getEDate(), "data", null, 1, 1, VoceDiSpesa.class,
		!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(elencoCorsiEClass, ElencoCorsi.class, "ElencoCorsi", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEReference(getElencoCorsi_ElencoCorsi(), this.getCorso(), null, "elencoCorsi", null, 0, -1,
		ElencoCorsi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
		!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	initEClass(elencoIscrizioniEClass, ElencoIscrizioni.class, "ElencoIscrizioni", !IS_ABSTRACT, !IS_INTERFACE,
		IS_GENERATED_INSTANCE_CLASS);
	initEReference(getElencoIscrizioni_ElencoIscrizioni(), this.getIscrizione(), null, "elencoIscrizioni", null, 0,
		-1, ElencoIscrizioni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
		IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

	// Initialize enums and add enum literals
	initEEnum(eSessoEEnum, ESesso.class, "ESesso");
	addEEnumLiteral(eSessoEEnum, ESesso.MASCHIO);
	addEEnumLiteral(eSessoEEnum, ESesso.FEMMINA);

	initEEnum(eTitoloIstruttoreEEnum, ETitoloIstruttore.class, "ETitoloIstruttore");
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_SEZIONALE);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_ALPINISMO);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_SCIALPINISMO);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_SCI_FONDO_ESCURSIONISMO);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_NAZIONALE_ALPINISMO);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_NAZIONALE_SCIALPINISMO);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ASPIRANTE_ISTRUTTORE);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_ARRAMPICATA_LIBERA);
	addEEnumLiteral(eTitoloIstruttoreEEnum, ETitoloIstruttore.ISTRUTTORE_NAZIONALE_ARRAMPICATA_LIBERA);

	initEEnum(tipoEsitoValutazioneEEnum, TipoEsitoValutazione.class, "TipoEsitoValutazione");
	addEEnumLiteral(tipoEsitoValutazioneEEnum, TipoEsitoValutazione.OTTIMO);
	addEEnumLiteral(tipoEsitoValutazioneEEnum, TipoEsitoValutazione.BUONO);
	addEEnumLiteral(tipoEsitoValutazioneEEnum, TipoEsitoValutazione.SUFFICIENTE);
	addEEnumLiteral(tipoEsitoValutazioneEEnum, TipoEsitoValutazione.INSUFFICIENTE);

	initEEnum(eSiglaCorsoEEnum, ESiglaCorso.class, "ESiglaCorso");
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.A1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.A1N);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.A1R);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.A1G);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.SA1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.SA2);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AR1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AR2);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AG1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AG2);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.ACG1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AL1);
	addEEnumLiteral(eSiglaCorsoEEnum, ESiglaCorso.AL2);

	initEEnum(eTipoVoceDiSpesaEEnum, ETipoVoceDiSpesa.class, "ETipoVoceDiSpesa");
	addEEnumLiteral(eTipoVoceDiSpesaEEnum, ETipoVoceDiSpesa.ENTRATA);
	addEEnumLiteral(eTipoVoceDiSpesaEEnum, ETipoVoceDiSpesa.USCITA);

	// Initialize data types
	initEDataType(numeroCellulareEDataType, NumeroCellulare.class, "NumeroCellulare", IS_SERIALIZABLE,
		!IS_GENERATED_INSTANCE_CLASS);
	initEDataType(eMailEDataType, EMail.class, "EMail", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

	// Create resource
	createResource(eNS_URI);
    }

} //ModelPackageImpl
