/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.*;

import it.caicividale.corsicai.model.valueobject.EMail;
import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelFactory init() {
	try {
	    ModelFactory theModelFactory = (ModelFactory) EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
	    if (theModelFactory != null) {
		return theModelFactory;
	    }
	} catch (Exception exception) {
	    EcorePlugin.INSTANCE.log(exception);
	}
	return new ModelFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactoryImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
	switch (eClass.getClassifierID()) {
	case ModelPackage.PERSONA:
	    return (EObject) createPersona();
	case ModelPackage.ALLIEVO:
	    return (EObject) createAllievo();
	case ModelPackage.CORSO:
	    return (EObject) createCorso();
	case ModelPackage.ISCRIZIONE:
	    return (EObject) createIscrizione();
	case ModelPackage.LEZIONE:
	    return (EObject) createLezione();
	case ModelPackage.LEZIONE_TEORICA:
	    return (EObject) createLezioneTeorica();
	case ModelPackage.LEZIONE_PRATICA:
	    return (EObject) createLezionePratica();
	case ModelPackage.ISTRUTTORE:
	    return (EObject) createIstruttore();
	case ModelPackage.SQUADRA:
	    return (EObject) createSquadra();
	case ModelPackage.BILANCIO:
	    return (EObject) createBilancio();
	case ModelPackage.CASSA:
	    return (EObject) createCassa();
	case ModelPackage.RIPARTIZIONE_CASSA:
	    return (EObject) createRipartizioneCassa();
	case ModelPackage.PRESENZA_LEZIONE:
	    return (EObject) createPresenzaLezione();
	case ModelPackage.DIZ_MATERIALE:
	    return (EObject) createDizMateriale();
	case ModelPackage.MATERIALE_NOLEGGIATO:
	    return (EObject) createMaterialeNoleggiato();
	case ModelPackage.VOCE_DI_SPESA:
	    return (EObject) createVoceDiSpesa();
	case ModelPackage.ELENCO_CORSI:
	    return (EObject) createElencoCorsi();
	case ModelPackage.ELENCO_ISCRIZIONI:
	    return (EObject) createElencoIscrizioni();
	default:
	    throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
	switch (eDataType.getClassifierID()) {
	case ModelPackage.ESESSO:
	    return createESessoFromString(eDataType, initialValue);
	case ModelPackage.ETITOLO_ISTRUTTORE:
	    return createETitoloIstruttoreFromString(eDataType, initialValue);
	case ModelPackage.TIPO_ESITO_VALUTAZIONE:
	    return createTipoEsitoValutazioneFromString(eDataType, initialValue);
	case ModelPackage.ESIGLA_CORSO:
	    return createESiglaCorsoFromString(eDataType, initialValue);
	case ModelPackage.ETIPO_VOCE_DI_SPESA:
	    return createETipoVoceDiSpesaFromString(eDataType, initialValue);
	case ModelPackage.NUMERO_CELLULARE:
	    return createNumeroCellulareFromString(eDataType, initialValue);
	case ModelPackage.EMAIL:
	    return createEMailFromString(eDataType, initialValue);
	default:
	    throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
	switch (eDataType.getClassifierID()) {
	case ModelPackage.ESESSO:
	    return convertESessoToString(eDataType, instanceValue);
	case ModelPackage.ETITOLO_ISTRUTTORE:
	    return convertETitoloIstruttoreToString(eDataType, instanceValue);
	case ModelPackage.TIPO_ESITO_VALUTAZIONE:
	    return convertTipoEsitoValutazioneToString(eDataType, instanceValue);
	case ModelPackage.ESIGLA_CORSO:
	    return convertESiglaCorsoToString(eDataType, instanceValue);
	case ModelPackage.ETIPO_VOCE_DI_SPESA:
	    return convertETipoVoceDiSpesaToString(eDataType, instanceValue);
	case ModelPackage.NUMERO_CELLULARE:
	    return convertNumeroCellulareToString(eDataType, instanceValue);
	case ModelPackage.EMAIL:
	    return convertEMailToString(eDataType, instanceValue);
	default:
	    throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
	}
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Persona createPersona() {
	PersonaImpl persona = new PersonaImpl();
	return persona;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Allievo createAllievo() {
	AllievoImpl allievo = new AllievoImpl();
	return allievo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Corso createCorso() {
	CorsoImpl corso = new CorsoImpl();
	return corso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Iscrizione createIscrizione() {
	IscrizioneImpl iscrizione = new IscrizioneImpl();
	return iscrizione;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Lezione createLezione() {
	LezioneImpl lezione = new LezioneImpl();
	return lezione;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LezioneTeorica createLezioneTeorica() {
	LezioneTeoricaImpl lezioneTeorica = new LezioneTeoricaImpl();
	return lezioneTeorica;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LezionePratica createLezionePratica() {
	LezionePraticaImpl lezionePratica = new LezionePraticaImpl();
	return lezionePratica;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Istruttore createIstruttore() {
	IstruttoreImpl istruttore = new IstruttoreImpl();
	return istruttore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Squadra createSquadra() {
	SquadraImpl squadra = new SquadraImpl();
	return squadra;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bilancio createBilancio() {
	BilancioImpl bilancio = new BilancioImpl();
	return bilancio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cassa createCassa() {
	CassaImpl cassa = new CassaImpl();
	return cassa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RipartizioneCassa createRipartizioneCassa() {
	RipartizioneCassaImpl ripartizioneCassa = new RipartizioneCassaImpl();
	return ripartizioneCassa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PresenzaLezione createPresenzaLezione() {
	PresenzaLezioneImpl presenzaLezione = new PresenzaLezioneImpl();
	return presenzaLezione;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DizMateriale createDizMateriale() {
	DizMaterialeImpl dizMateriale = new DizMaterialeImpl();
	return dizMateriale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MaterialeNoleggiato createMaterialeNoleggiato() {
	MaterialeNoleggiatoImpl materialeNoleggiato = new MaterialeNoleggiatoImpl();
	return materialeNoleggiato;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoceDiSpesa createVoceDiSpesa() {
	VoceDiSpesaImpl voceDiSpesa = new VoceDiSpesaImpl();
	return voceDiSpesa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElencoCorsi createElencoCorsi() {
	ElencoCorsiImpl elencoCorsi = new ElencoCorsiImpl();
	return elencoCorsi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElencoIscrizioni createElencoIscrizioni() {
	ElencoIscrizioniImpl elencoIscrizioni = new ElencoIscrizioniImpl();
	return elencoIscrizioni;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ESesso createESessoFromString(EDataType eDataType, String initialValue) {
	ESesso result = ESesso.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException(
		    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertESessoToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ETitoloIstruttore createETitoloIstruttoreFromString(EDataType eDataType, String initialValue) {
	ETitoloIstruttore result = ETitoloIstruttore.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException(
		    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertETitoloIstruttoreToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TipoEsitoValutazione createTipoEsitoValutazioneFromString(EDataType eDataType, String initialValue) {
	TipoEsitoValutazione result = TipoEsitoValutazione.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException(
		    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTipoEsitoValutazioneToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ESiglaCorso createESiglaCorsoFromString(EDataType eDataType, String initialValue) {
	ESiglaCorso result = ESiglaCorso.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException(
		    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertESiglaCorsoToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ETipoVoceDiSpesa createETipoVoceDiSpesaFromString(EDataType eDataType, String initialValue) {
	ETipoVoceDiSpesa result = ETipoVoceDiSpesa.get(initialValue);
	if (result == null)
	    throw new IllegalArgumentException(
		    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
	return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertETipoVoceDiSpesaToString(EDataType eDataType, Object instanceValue) {
	return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumeroCellulare createNumeroCellulareFromString(EDataType eDataType, String initialValue) {
	return (NumeroCellulare) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNumeroCellulareToString(EDataType eDataType, Object instanceValue) {
	return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMail createEMailFromString(EDataType eDataType, String initialValue) {
	return (EMail) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEMailToString(EDataType eDataType, Object instanceValue) {
	return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelPackage getModelPackage() {
	return (ModelPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelPackage getPackage() {
	return ModelPackage.eINSTANCE;
    }

} //ModelFactoryImpl
