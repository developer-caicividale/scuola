/**
 */
package it.caicividale.corsicai.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.caicividale.corsicai.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://corsicai.caicividale.it/hibernate/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "T";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = it.caicividale.corsicai.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.PersonaImpl <em>Persona</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.PersonaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getPersona()
	 * @generated
	 */
	int PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NOME = 0;

	/**
	 * The feature id for the '<em><b>Cognome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__COGNOME = 1;

	/**
	 * The feature id for the '<em><b>Sesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SESSO = 2;

	/**
	 * The feature id for the '<em><b>Numero Cellulare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NUMERO_CELLULARE = 3;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Residenza Via</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESIDENZA_VIA = 5;

	/**
	 * The feature id for the '<em><b>Residenza Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESIDENZA_CITTA = 6;

	/**
	 * The feature id for the '<em><b>Residenza Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESIDENZA_PROVINCIA = 7;

	/**
	 * The feature id for the '<em><b>Residenza Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__RESIDENZA_CAP = 8;

	/**
	 * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NASCITA_DATA = 9;

	/**
	 * The feature id for the '<em><b>Nascita Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NASCITA_CITTA = 10;

	/**
	 * The feature id for the '<em><b>Nascita Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__NASCITA_PROVINCIA = 11;

	/**
	 * The feature id for the '<em><b>Sezione Cai Appartenenza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__SEZIONE_CAI_APPARTENENZA = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__ID = 13;

	/**
	 * The feature id for the '<em><b>Is Staff Scuola</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA__IS_STAFF_SCUOLA = 14;

	/**
	 * The number of structural features of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Persona</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.AllievoImpl <em>Allievo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.AllievoImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getAllievo()
	 * @generated
	 */
	int ALLIEVO = 1;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__NOME = PERSONA__NOME;

	/**
	 * The feature id for the '<em><b>Cognome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__COGNOME = PERSONA__COGNOME;

	/**
	 * The feature id for the '<em><b>Sesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__SESSO = PERSONA__SESSO;

	/**
	 * The feature id for the '<em><b>Numero Cellulare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__NUMERO_CELLULARE = PERSONA__NUMERO_CELLULARE;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__EMAIL = PERSONA__EMAIL;

	/**
	 * The feature id for the '<em><b>Residenza Via</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__RESIDENZA_VIA = PERSONA__RESIDENZA_VIA;

	/**
	 * The feature id for the '<em><b>Residenza Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__RESIDENZA_CITTA = PERSONA__RESIDENZA_CITTA;

	/**
	 * The feature id for the '<em><b>Residenza Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__RESIDENZA_PROVINCIA = PERSONA__RESIDENZA_PROVINCIA;

	/**
	 * The feature id for the '<em><b>Residenza Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__RESIDENZA_CAP = PERSONA__RESIDENZA_CAP;

	/**
	 * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__NASCITA_DATA = PERSONA__NASCITA_DATA;

	/**
	 * The feature id for the '<em><b>Nascita Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__NASCITA_CITTA = PERSONA__NASCITA_CITTA;

	/**
	 * The feature id for the '<em><b>Nascita Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__NASCITA_PROVINCIA = PERSONA__NASCITA_PROVINCIA;

	/**
	 * The feature id for the '<em><b>Sezione Cai Appartenenza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__SEZIONE_CAI_APPARTENENZA = PERSONA__SEZIONE_CAI_APPARTENENZA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Is Staff Scuola</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__IS_STAFF_SCUOLA = PERSONA__IS_STAFF_SCUOLA;

	/**
	 * The feature id for the '<em><b>Valutazioni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO__VALUTAZIONI = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allievo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allievo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLIEVO_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.CorsoImpl <em>Corso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.CorsoImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getCorso()
	 * @generated
	 */
	int CORSO = 2;

	/**
	 * The feature id for the '<em><b>Anno</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__ANNO = 0;

	/**
	 * The feature id for the '<em><b>Quota Iscrizione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__QUOTA_ISCRIZIONE = 1;

	/**
	 * The feature id for the '<em><b>Quota Caparra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__QUOTA_CAPARRA = 2;

	/**
	 * The feature id for the '<em><b>Lezioni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__LEZIONI = 3;

	/**
	 * The feature id for the '<em><b>Is Modulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__IS_MODULO = 4;

	/**
	 * The feature id for the '<em><b>Direttore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__DIRETTORE = 5;

	/**
	 * The feature id for the '<em><b>Vicedirettore</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__VICEDIRETTORE = 6;

	/**
	 * The feature id for the '<em><b>Segretario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__SEGRETARIO = 7;

	/**
	 * The feature id for the '<em><b>Testo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__TESTO = 8;

	/**
	 * The feature id for the '<em><b>Bilancio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__BILANCIO = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__ID = 10;

	/**
	 * The feature id for the '<em><b>Cassa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__CASSA = 11;

	/**
	 * The feature id for the '<em><b>Iscrizioni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__ISCRIZIONI = 12;

	/**
	 * The feature id for the '<em><b>Data Inizio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__DATA_INIZIO = 13;

	/**
	 * The feature id for the '<em><b>Data Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__DATA_FINE = 14;

	/**
	 * The feature id for the '<em><b>Staff Istruttori</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__STAFF_ISTRUTTORI = 15;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NOME = 16;

	/**
	 * The feature id for the '<em><b>Sigla</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__SIGLA = 17;

	/**
	 * The feature id for the '<em><b>Equipaggiamento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__EQUIPAGGIAMENTO = 18;

	/**
	 * The feature id for the '<em><b>Numero Allievi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI = 19;

	/**
	 * The feature id for the '<em><b>Numero Allievi Iscrizione Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK = 20;

	/**
	 * The feature id for the '<em><b>Numero Allievi Iscrizione Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO = 21;

	/**
	 * The feature id for the '<em><b>Numero Allievi Nuovi Iscritti</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI = 22;

	/**
	 * The feature id for the '<em><b>Numero Allievi Maschi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_MASCHI = 23;

	/**
	 * The feature id for the '<em><b>Numero Allievi Femmine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_FEMMINE = 24;

	/**
	 * The feature id for the '<em><b>Numero Allievi Con Noleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO = 25;

	/**
	 * The feature id for the '<em><b>List Riepilogonoleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__LIST_RIEPILOGONOLEGGIO = 26;

	/**
	 * The feature id for the '<em><b>Moduli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO__MODULI = 27;

	/**
	 * The number of structural features of the '<em>Corso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO_FEATURE_COUNT = 28;

	/**
	 * The number of operations of the '<em>Corso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORSO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.DocumentoImpl <em>Documento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.DocumentoImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDocumento()
	 * @generated
	 */
	int DOCUMENTO = 3;

	/**
	 * The feature id for the '<em><b>Tipo Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__TIPO_DOCUMENTO = 0;

	/**
	 * The feature id for the '<em><b>Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__DOCUMENTO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO__ID = 2;

	/**
	 * The number of structural features of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Documento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.IscrizioneImpl <em>Iscrizione</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.IscrizioneImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getIscrizione()
	 * @generated
	 */
	int ISCRIZIONE = 4;

	/**
	 * The feature id for the '<em><b>Is Modulo Iscrizione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_MODULO_ISCRIZIONE = 0;

	/**
	 * The feature id for the '<em><b>Is Consenso Informato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_CONSENSO_INFORMATO = 1;

	/**
	 * The feature id for the '<em><b>Is Nuovo Allievo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_NUOVO_ALLIEVO = 2;

	/**
	 * The feature id for the '<em><b>Data Scadenza Certificato Medico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO = 3;

	/**
	 * The feature id for the '<em><b>Is Bollino Anno Corso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_BOLLINO_ANNO_CORSO = 4;

	/**
	 * The feature id for the '<em><b>Caparra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__CAPARRA = 5;

	/**
	 * The feature id for the '<em><b>Saldo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__SALDO = 6;

	/**
	 * The feature id for the '<em><b>Totale Versato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__TOTALE_VERSATO = 7;

	/**
	 * The feature id for the '<em><b>Documenti</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__DOCUMENTI = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__ID = 9;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__NOTE = 10;

	/**
	 * The feature id for the '<em><b>Is Noleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_NOLEGGIO = 11;

	/**
	 * The feature id for the '<em><b>Materiale Noleggiato</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__MATERIALE_NOLEGGIATO = 12;

	/**
	 * The feature id for the '<em><b>Is Iscrizione Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_ISCRIZIONE_OK = 13;

	/**
	 * The feature id for the '<em><b>Quota Noleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__QUOTA_NOLEGGIO = 14;

	/**
	 * The feature id for the '<em><b>Is Certificato Medico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_CERTIFICATO_MEDICO = 15;

	/**
	 * The feature id for the '<em><b>Is Certificato Medico Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK = 16;

	/**
	 * The feature id for the '<em><b>Is Quota Versata Ok</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__IS_QUOTA_VERSATA_OK = 17;

	/**
	 * The feature id for the '<em><b>Quota Noleggio Da Versare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE = 18;

	/**
	 * The feature id for the '<em><b>Totale Da Versare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__TOTALE_DA_VERSARE = 19;

	/**
	 * The feature id for the '<em><b>Differenza Totale Versato Totale Da Versare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE = 20;

	/**
	 * The feature id for the '<em><b>Messaggi Errore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__MESSAGGI_ERRORE = 21;

	/**
	 * The feature id for the '<em><b>Allievo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE__ALLIEVO = 22;

	/**
	 * The number of structural features of the '<em>Iscrizione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Iscrizione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISCRIZIONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.LezioneImpl <em>Lezione</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.LezioneImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezione()
	 * @generated
	 */
	int LEZIONE = 5;

	/**
	 * The feature id for the '<em><b>Titolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__TITOLO = 0;

	/**
	 * The feature id for the '<em><b>Data Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__DATA_SVOLGIMENTO = 1;

	/**
	 * The feature id for the '<em><b>Luogo Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__LUOGO_SVOLGIMENTO = 2;

	/**
	 * The feature id for the '<em><b>Durata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__DURATA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__ID = 4;

	/**
	 * The feature id for the '<em><b>Presenza Lezione</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__PRESENZA_LEZIONE = 5;

	/**
	 * The feature id for the '<em><b>Argomenti Trattati</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE__ARGOMENTI_TRATTATI = 6;

	/**
	 * The number of structural features of the '<em>Lezione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Lezione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.LezioneTeoricaImpl <em>Lezione Teorica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.LezioneTeoricaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezioneTeorica()
	 * @generated
	 */
	int LEZIONE_TEORICA = 6;

	/**
	 * The feature id for the '<em><b>Titolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__TITOLO = LEZIONE__TITOLO;

	/**
	 * The feature id for the '<em><b>Data Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__DATA_SVOLGIMENTO = LEZIONE__DATA_SVOLGIMENTO;

	/**
	 * The feature id for the '<em><b>Luogo Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__LUOGO_SVOLGIMENTO = LEZIONE__LUOGO_SVOLGIMENTO;

	/**
	 * The feature id for the '<em><b>Durata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__DURATA = LEZIONE__DURATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__ID = LEZIONE__ID;

	/**
	 * The feature id for the '<em><b>Presenza Lezione</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__PRESENZA_LEZIONE = LEZIONE__PRESENZA_LEZIONE;

	/**
	 * The feature id for the '<em><b>Argomenti Trattati</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__ARGOMENTI_TRATTATI = LEZIONE__ARGOMENTI_TRATTATI;

	/**
	 * The feature id for the '<em><b>Docente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA__DOCENTE = LEZIONE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lezione Teorica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA_FEATURE_COUNT = LEZIONE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lezione Teorica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_TEORICA_OPERATION_COUNT = LEZIONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.LezionePraticaImpl <em>Lezione Pratica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.LezionePraticaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezionePratica()
	 * @generated
	 */
	int LEZIONE_PRATICA = 7;

	/**
	 * The feature id for the '<em><b>Titolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__TITOLO = LEZIONE__TITOLO;

	/**
	 * The feature id for the '<em><b>Data Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__DATA_SVOLGIMENTO = LEZIONE__DATA_SVOLGIMENTO;

	/**
	 * The feature id for the '<em><b>Luogo Svolgimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__LUOGO_SVOLGIMENTO = LEZIONE__LUOGO_SVOLGIMENTO;

	/**
	 * The feature id for the '<em><b>Durata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__DURATA = LEZIONE__DURATA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__ID = LEZIONE__ID;

	/**
	 * The feature id for the '<em><b>Presenza Lezione</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__PRESENZA_LEZIONE = LEZIONE__PRESENZA_LEZIONE;

	/**
	 * The feature id for the '<em><b>Argomenti Trattati</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__ARGOMENTI_TRATTATI = LEZIONE__ARGOMENTI_TRATTATI;

	/**
	 * The feature id for the '<em><b>Staff Istruttori Lezione</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE = LEZIONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Luogo Ritrovo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA__LUOGO_RITROVO = LEZIONE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lezione Pratica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA_FEATURE_COUNT = LEZIONE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Lezione Pratica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEZIONE_PRATICA_OPERATION_COUNT = LEZIONE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.IstruttoreImpl <em>Istruttore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.IstruttoreImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getIstruttore()
	 * @generated
	 */
	int ISTRUTTORE = 8;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__NOME = PERSONA__NOME;

	/**
	 * The feature id for the '<em><b>Cognome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__COGNOME = PERSONA__COGNOME;

	/**
	 * The feature id for the '<em><b>Sesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__SESSO = PERSONA__SESSO;

	/**
	 * The feature id for the '<em><b>Numero Cellulare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__NUMERO_CELLULARE = PERSONA__NUMERO_CELLULARE;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__EMAIL = PERSONA__EMAIL;

	/**
	 * The feature id for the '<em><b>Residenza Via</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__RESIDENZA_VIA = PERSONA__RESIDENZA_VIA;

	/**
	 * The feature id for the '<em><b>Residenza Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__RESIDENZA_CITTA = PERSONA__RESIDENZA_CITTA;

	/**
	 * The feature id for the '<em><b>Residenza Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__RESIDENZA_PROVINCIA = PERSONA__RESIDENZA_PROVINCIA;

	/**
	 * The feature id for the '<em><b>Residenza Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__RESIDENZA_CAP = PERSONA__RESIDENZA_CAP;

	/**
	 * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__NASCITA_DATA = PERSONA__NASCITA_DATA;

	/**
	 * The feature id for the '<em><b>Nascita Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__NASCITA_CITTA = PERSONA__NASCITA_CITTA;

	/**
	 * The feature id for the '<em><b>Nascita Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__NASCITA_PROVINCIA = PERSONA__NASCITA_PROVINCIA;

	/**
	 * The feature id for the '<em><b>Sezione Cai Appartenenza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__SEZIONE_CAI_APPARTENENZA = PERSONA__SEZIONE_CAI_APPARTENENZA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__ID = PERSONA__ID;

	/**
	 * The feature id for the '<em><b>Is Staff Scuola</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__IS_STAFF_SCUOLA = PERSONA__IS_STAFF_SCUOLA;

	/**
	 * The feature id for the '<em><b>Titolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__TITOLO = PERSONA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valutazioni</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__VALUTAZIONI = PERSONA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Attivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE__IS_ATTIVO = PERSONA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Istruttore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Istruttore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTRUTTORE_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.SquadraImpl <em>Squadra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.SquadraImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getSquadra()
	 * @generated
	 */
	int SQUADRA = 9;

	/**
	 * The feature id for the '<em><b>Capi Squadra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUADRA__CAPI_SQUADRA = 0;

	/**
	 * The feature id for the '<em><b>Allievi In Squadra</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUADRA__ALLIEVI_IN_SQUADRA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUADRA__ID = 2;

	/**
	 * The number of structural features of the '<em>Squadra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUADRA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Squadra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUADRA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.ValutazioneImpl <em>Valutazione</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.ValutazioneImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getValutazione()
	 * @generated
	 */
	int VALUTAZIONE = 10;

	/**
	 * The feature id for the '<em><b>Materia Valutazione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE__MATERIA_VALUTAZIONE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Esito Valutazione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE__TIPO_ESITO_VALUTAZIONE = 1;

	/**
	 * The feature id for the '<em><b>Istruttori Valutatori</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE__ISTRUTTORI_VALUTATORI = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE__ID = 3;

	/**
	 * The number of structural features of the '<em>Valutazione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Valutazione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUTAZIONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.BilancioImpl <em>Bilancio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.BilancioImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getBilancio()
	 * @generated
	 */
	int BILANCIO = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__ID = 0;

	/**
	 * The feature id for the '<em><b>Voci Di Spesa</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__VOCI_DI_SPESA = 1;

	/**
	 * The feature id for the '<em><b>Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__NOTA = 2;

	/**
	 * The feature id for the '<em><b>Totale Entrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__TOTALE_ENTRATE = 3;

	/**
	 * The feature id for the '<em><b>Totale Uscite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__TOTALE_USCITE = 4;

	/**
	 * The feature id for the '<em><b>Totale Iscrizioni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__TOTALE_ISCRIZIONI = 5;

	/**
	 * The feature id for the '<em><b>Totale Entrate Con Iscrizioni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI = 6;

	/**
	 * The feature id for the '<em><b>Avanzo Corso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO__AVANZO_CORSO = 7;

	/**
	 * The number of structural features of the '<em>Bilancio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Bilancio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILANCIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.CassaImpl <em>Cassa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.CassaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getCassa()
	 * @generated
	 */
	int CASSA = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA__ID = 0;

	/**
	 * The feature id for the '<em><b>Totale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA__TOTALE = 1;

	/**
	 * The feature id for the '<em><b>Ripartizione Cassa</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA__RIPARTIZIONE_CASSA = 2;

	/**
	 * The feature id for the '<em><b>Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA__NOTA = 3;

	/**
	 * The feature id for the '<em><b>Differenza Totale Casse EAvanzo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO = 4;

	/**
	 * The number of structural features of the '<em>Cassa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cassa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.RipartizioneCassaImpl <em>Ripartizione Cassa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.RipartizioneCassaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getRipartizioneCassa()
	 * @generated
	 */
	int RIPARTIZIONE_CASSA = 13;

	/**
	 * The feature id for the '<em><b>Sede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIPARTIZIONE_CASSA__SEDE = 0;

	/**
	 * The feature id for the '<em><b>Quota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIPARTIZIONE_CASSA__QUOTA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIPARTIZIONE_CASSA__ID = 2;

	/**
	 * The number of structural features of the '<em>Ripartizione Cassa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIPARTIZIONE_CASSA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ripartizione Cassa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIPARTIZIONE_CASSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.PresenzaLezioneImpl <em>Presenza Lezione</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.PresenzaLezioneImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getPresenzaLezione()
	 * @generated
	 */
	int PRESENZA_LEZIONE = 14;

	/**
	 * The feature id for the '<em><b>Allievo Presente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENZA_LEZIONE__ALLIEVO_PRESENTE = 0;

	/**
	 * The feature id for the '<em><b>Istruttore Presente</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENZA_LEZIONE__ID = 2;

	/**
	 * The number of structural features of the '<em>Presenza Lezione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENZA_LEZIONE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Presenza Lezione</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENZA_LEZIONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.DizMaterialeImpl <em>Diz Materiale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.DizMaterialeImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDizMateriale()
	 * @generated
	 */
	int DIZ_MATERIALE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE__NOME = 1;

	/**
	 * The feature id for the '<em><b>Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE__NOTA = 2;

	/**
	 * The feature id for the '<em><b>Quota Noleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE__QUOTA_NOLEGGIO = 3;

	/**
	 * The number of structural features of the '<em>Diz Materiale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diz Materiale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIZ_MATERIALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.MaterialeNoleggiatoImpl <em>Materiale Noleggiato</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.MaterialeNoleggiatoImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getMaterialeNoleggiato()
	 * @generated
	 */
	int MATERIALE_NOLEGGIATO = 16;

	/**
	 * The feature id for the '<em><b>Materiale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO__MATERIALE = 0;

	/**
	 * The feature id for the '<em><b>Quantita</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO__QUANTITA = 1;

	/**
	 * The feature id for the '<em><b>Data Noleggio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO__DATA_NOLEGGIO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO__ID = 3;

	/**
	 * The number of structural features of the '<em>Materiale Noleggiato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Materiale Noleggiato</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIALE_NOLEGGIATO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.impl.VoceDiSpesaImpl <em>Voce Di Spesa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.impl.VoceDiSpesaImpl
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getVoceDiSpesa()
	 * @generated
	 */
	int VOCE_DI_SPESA = 17;

	/**
	 * The feature id for the '<em><b>Titolo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__TITOLO = 0;

	/**
	 * The feature id for the '<em><b>Valore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__VALORE = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__ID = 3;

	/**
	 * The feature id for the '<em><b>Nota</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__NOTA = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA__DATA = 5;

	/**
	 * The number of structural features of the '<em>Voce Di Spesa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Voce Di Spesa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOCE_DI_SPESA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.ESesso <em>ESesso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.ESesso
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getESesso()
	 * @generated
	 */
	int ESESSO = 18;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.ETipoDocumento <em>ETipo Documento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.ETipoDocumento
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETipoDocumento()
	 * @generated
	 */
	int ETIPO_DOCUMENTO = 19;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.ETitoloIstruttore
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETitoloIstruttore()
	 * @generated
	 */
	int ETITOLO_ISTRUTTORE = 20;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.TipoEsitoValutazione
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getTipoEsitoValutazione()
	 * @generated
	 */
	int TIPO_ESITO_VALUTAZIONE = 21;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.ESiglaCorso <em>ESigla Corso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.ESiglaCorso
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getESiglaCorso()
	 * @generated
	 */
	int ESIGLA_CORSO = 22;

	/**
	 * The meta object id for the '{@link it.caicividale.corsicai.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.ETipoVoceDiSpesa
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETipoVoceDiSpesa()
	 * @generated
	 */
	int ETIPO_VOCE_DI_SPESA = 23;

	/**
	 * The meta object id for the '<em>Numero Cellulare</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.valueobject.NumeroCellulare
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getNumeroCellulare()
	 * @generated
	 */
	int NUMERO_CELLULARE = 24;

	/**
	 * The meta object id for the '<em>EMail</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.caicividale.corsicai.model.valueobject.EMail
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getEMail()
	 * @generated
	 */
	int EMAIL = 25;

	/**
	 * The meta object id for the '<em>Diz Materia Valutazione</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDizMateriaValutazione()
	 * @generated
	 */
	int DIZ_MATERIA_VALUTAZIONE = 26;

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Persona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona</em>'.
	 * @see it.caicividale.corsicai.model.Persona
	 * @generated
	 */
	EClass getPersona();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getNome()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Nome();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getCognome <em>Cognome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cognome</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getCognome()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Cognome();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getSesso <em>Sesso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sesso</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getSesso()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Sesso();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getNumeroCellulare <em>Numero Cellulare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Cellulare</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getNumeroCellulare()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NumeroCellulare();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getEMail()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_EMail();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getResidenzaVia <em>Residenza Via</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residenza Via</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getResidenzaVia()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ResidenzaVia();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getResidenzaCitta <em>Residenza Citta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residenza Citta</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getResidenzaCitta()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ResidenzaCitta();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getResidenzaProvincia <em>Residenza Provincia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residenza Provincia</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getResidenzaProvincia()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ResidenzaProvincia();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getResidenzaCap <em>Residenza Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residenza Cap</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getResidenzaCap()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_ResidenzaCap();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getNascitaData <em>Nascita Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nascita Data</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getNascitaData()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NascitaData();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getNascitaCitta <em>Nascita Citta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nascita Citta</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getNascitaCitta()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NascitaCitta();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getNascitaProvincia <em>Nascita Provincia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nascita Provincia</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getNascitaProvincia()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_NascitaProvincia();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getSezioneCaiAppartenenza <em>Sezione Cai Appartenenza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sezione Cai Appartenenza</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getSezioneCaiAppartenenza()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_SezioneCaiAppartenenza();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getId()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Persona#getIsStaffScuola <em>Is Staff Scuola</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Staff Scuola</em>'.
	 * @see it.caicividale.corsicai.model.Persona#getIsStaffScuola()
	 * @see #getPersona()
	 * @generated
	 */
	EAttribute getPersona_IsStaffScuola();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Allievo <em>Allievo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allievo</em>'.
	 * @see it.caicividale.corsicai.model.Allievo
	 * @generated
	 */
	EClass getAllievo();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Allievo#getValutazioni <em>Valutazioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valutazioni</em>'.
	 * @see it.caicividale.corsicai.model.Allievo#getValutazioni()
	 * @see #getAllievo()
	 * @generated
	 */
	EReference getAllievo_Valutazioni();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Corso <em>Corso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corso</em>'.
	 * @see it.caicividale.corsicai.model.Corso
	 * @generated
	 */
	EClass getCorso();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getAnno <em>Anno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anno</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getAnno()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Anno();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getQuotaIscrizione <em>Quota Iscrizione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Iscrizione</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getQuotaIscrizione()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_QuotaIscrizione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getQuotaCaparra <em>Quota Caparra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Caparra</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getQuotaCaparra()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_QuotaCaparra();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Corso#getLezioni <em>Lezioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lezioni</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getLezioni()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Lezioni();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getIsModulo <em>Is Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modulo</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getIsModulo()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_IsModulo();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Corso#getDirettore <em>Direttore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Direttore</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getDirettore()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Direttore();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Corso#getVicedirettore <em>Vicedirettore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vicedirettore</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getVicedirettore()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Vicedirettore();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Corso#getSegretario <em>Segretario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Segretario</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getSegretario()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Segretario();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getTesto <em>Testo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testo</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getTesto()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Testo();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Corso#getBilancio <em>Bilancio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bilancio</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getBilancio()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Bilancio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getId()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Id();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Corso#getCassa <em>Cassa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cassa</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getCassa()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Cassa();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Corso#getIscrizioni <em>Iscrizioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iscrizioni</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getIscrizioni()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Iscrizioni();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getDataInizio <em>Data Inizio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Inizio</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getDataInizio()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_DataInizio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getDataFine <em>Data Fine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Fine</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getDataFine()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_DataFine();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Corso#getStaffIstruttori <em>Staff Istruttori</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff Istruttori</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getStaffIstruttori()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_StaffIstruttori();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNome()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Nome();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getSigla <em>Sigla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sigla</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getSigla()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Sigla();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getEquipaggiamento <em>Equipaggiamento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equipaggiamento</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getEquipaggiamento()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_Equipaggiamento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllievi <em>Numero Allievi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllievi()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllievi();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviIscrizioneOk <em>Numero Allievi Iscrizione Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Iscrizione Ok</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviIscrizioneOk()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviIscrizioneOk();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviIscrizioneKo <em>Numero Allievi Iscrizione Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Iscrizione Ko</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviIscrizioneKo()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviIscrizioneKo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviNuoviIscritti <em>Numero Allievi Nuovi Iscritti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Nuovi Iscritti</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviNuoviIscritti()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviNuoviIscritti();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviMaschi <em>Numero Allievi Maschi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Maschi</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviMaschi()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviMaschi();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviFemmine <em>Numero Allievi Femmine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Femmine</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviFemmine()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviFemmine();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getNumeroAllieviConNoleggio <em>Numero Allievi Con Noleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Allievi Con Noleggio</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getNumeroAllieviConNoleggio()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_NumeroAllieviConNoleggio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Corso#getListRiepilogonoleggio <em>List Riepilogonoleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Riepilogonoleggio</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getListRiepilogonoleggio()
	 * @see #getCorso()
	 * @generated
	 */
	EAttribute getCorso_ListRiepilogonoleggio();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Corso#getModuli <em>Moduli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Moduli</em>'.
	 * @see it.caicividale.corsicai.model.Corso#getModuli()
	 * @see #getCorso()
	 * @generated
	 */
	EReference getCorso_Moduli();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Documento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documento</em>'.
	 * @see it.caicividale.corsicai.model.Documento
	 * @generated
	 */
	EClass getDocumento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Documento#getTipoDocumento <em>Tipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Documento</em>'.
	 * @see it.caicividale.corsicai.model.Documento#getTipoDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_TipoDocumento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Documento#getDocumento <em>Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documento</em>'.
	 * @see it.caicividale.corsicai.model.Documento#getDocumento()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Documento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Documento#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Documento#getId()
	 * @see #getDocumento()
	 * @generated
	 */
	EAttribute getDocumento_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Iscrizione <em>Iscrizione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iscrizione</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione
	 * @generated
	 */
	EClass getIscrizione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsModuloIscrizione <em>Is Modulo Iscrizione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modulo Iscrizione</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsModuloIscrizione()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsModuloIscrizione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsConsensoInformato <em>Is Consenso Informato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Consenso Informato</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsConsensoInformato()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsConsensoInformato();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsNuovoAllievo <em>Is Nuovo Allievo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nuovo Allievo</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsNuovoAllievo()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsNuovoAllievo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getDataScadenzaCertificatoMedico <em>Data Scadenza Certificato Medico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Scadenza Certificato Medico</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getDataScadenzaCertificatoMedico()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_DataScadenzaCertificatoMedico();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsBollinoAnnoCorso <em>Is Bollino Anno Corso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bollino Anno Corso</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsBollinoAnnoCorso()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsBollinoAnnoCorso();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getCaparra <em>Caparra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caparra</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getCaparra()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_Caparra();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getSaldo <em>Saldo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saldo</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getSaldo()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_Saldo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getTotaleVersato <em>Totale Versato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Versato</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getTotaleVersato()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_TotaleVersato();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Iscrizione#getDocumenti <em>Documenti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documenti</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getDocumenti()
	 * @see #getIscrizione()
	 * @generated
	 */
	EReference getIscrizione_Documenti();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getId()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getNote()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_Note();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsNoleggio <em>Is Noleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Noleggio</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsNoleggio()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsNoleggio();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Iscrizione#getMaterialeNoleggiato <em>Materiale Noleggiato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Materiale Noleggiato</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getMaterialeNoleggiato()
	 * @see #getIscrizione()
	 * @generated
	 */
	EReference getIscrizione_MaterialeNoleggiato();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsIscrizioneOk <em>Is Iscrizione Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Iscrizione Ok</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsIscrizioneOk()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsIscrizioneOk();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getQuotaNoleggio <em>Quota Noleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Noleggio</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getQuotaNoleggio()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_QuotaNoleggio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsCertificatoMedico <em>Is Certificato Medico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Certificato Medico</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsCertificatoMedico()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsCertificatoMedico();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsCertificatoMedicoOk <em>Is Certificato Medico Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Certificato Medico Ok</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsCertificatoMedicoOk()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsCertificatoMedicoOk();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getIsQuotaVersataOk <em>Is Quota Versata Ok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Quota Versata Ok</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getIsQuotaVersataOk()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_IsQuotaVersataOk();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getQuotaNoleggioDaVersare <em>Quota Noleggio Da Versare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Noleggio Da Versare</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getQuotaNoleggioDaVersare()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_QuotaNoleggioDaVersare();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getTotaleDaVersare <em>Totale Da Versare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Da Versare</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getTotaleDaVersare()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_TotaleDaVersare();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Iscrizione#getDifferenzaTotaleVersatoTotaleDaVersare <em>Differenza Totale Versato Totale Da Versare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Differenza Totale Versato Totale Da Versare</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getDifferenzaTotaleVersatoTotaleDaVersare()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare();

	/**
	 * Returns the meta object for the attribute list '{@link it.caicividale.corsicai.model.Iscrizione#getMessaggiErrore <em>Messaggi Errore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Messaggi Errore</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getMessaggiErrore()
	 * @see #getIscrizione()
	 * @generated
	 */
	EAttribute getIscrizione_MessaggiErrore();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Iscrizione#getAllievo <em>Allievo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allievo</em>'.
	 * @see it.caicividale.corsicai.model.Iscrizione#getAllievo()
	 * @see #getIscrizione()
	 * @generated
	 */
	EReference getIscrizione_Allievo();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Lezione <em>Lezione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lezione</em>'.
	 * @see it.caicividale.corsicai.model.Lezione
	 * @generated
	 */
	EClass getLezione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getTitolo <em>Titolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titolo</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getTitolo()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_Titolo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getDataSvolgimento <em>Data Svolgimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Svolgimento</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getDataSvolgimento()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_DataSvolgimento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getLuogoSvolgimento <em>Luogo Svolgimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luogo Svolgimento</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getLuogoSvolgimento()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_LuogoSvolgimento();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getDurata <em>Durata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Durata</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getDurata()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_Durata();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getId()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_Id();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.Lezione#getPresenzaLezione <em>Presenza Lezione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presenza Lezione</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getPresenzaLezione()
	 * @see #getLezione()
	 * @generated
	 */
	EReference getLezione_PresenzaLezione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Lezione#getArgomentiTrattati <em>Argomenti Trattati</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argomenti Trattati</em>'.
	 * @see it.caicividale.corsicai.model.Lezione#getArgomentiTrattati()
	 * @see #getLezione()
	 * @generated
	 */
	EAttribute getLezione_ArgomentiTrattati();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.LezioneTeorica <em>Lezione Teorica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lezione Teorica</em>'.
	 * @see it.caicividale.corsicai.model.LezioneTeorica
	 * @generated
	 */
	EClass getLezioneTeorica();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.LezioneTeorica#getDocente <em>Docente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docente</em>'.
	 * @see it.caicividale.corsicai.model.LezioneTeorica#getDocente()
	 * @see #getLezioneTeorica()
	 * @generated
	 */
	EAttribute getLezioneTeorica_Docente();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.LezionePratica <em>Lezione Pratica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lezione Pratica</em>'.
	 * @see it.caicividale.corsicai.model.LezionePratica
	 * @generated
	 */
	EClass getLezionePratica();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.LezionePratica#getStaffIstruttoriLezione <em>Staff Istruttori Lezione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff Istruttori Lezione</em>'.
	 * @see it.caicividale.corsicai.model.LezionePratica#getStaffIstruttoriLezione()
	 * @see #getLezionePratica()
	 * @generated
	 */
	EReference getLezionePratica_StaffIstruttoriLezione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luogo Ritrovo</em>'.
	 * @see it.caicividale.corsicai.model.LezionePratica#getLuogoRitrovo()
	 * @see #getLezionePratica()
	 * @generated
	 */
	EAttribute getLezionePratica_LuogoRitrovo();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Istruttore <em>Istruttore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Istruttore</em>'.
	 * @see it.caicividale.corsicai.model.Istruttore
	 * @generated
	 */
	EClass getIstruttore();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Istruttore#getTitolo <em>Titolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titolo</em>'.
	 * @see it.caicividale.corsicai.model.Istruttore#getTitolo()
	 * @see #getIstruttore()
	 * @generated
	 */
	EAttribute getIstruttore_Titolo();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Istruttore#getValutazioni <em>Valutazioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valutazioni</em>'.
	 * @see it.caicividale.corsicai.model.Istruttore#getValutazioni()
	 * @see #getIstruttore()
	 * @generated
	 */
	EReference getIstruttore_Valutazioni();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Istruttore#getIsAttivo <em>Is Attivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Attivo</em>'.
	 * @see it.caicividale.corsicai.model.Istruttore#getIsAttivo()
	 * @see #getIstruttore()
	 * @generated
	 */
	EAttribute getIstruttore_IsAttivo();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Squadra <em>Squadra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Squadra</em>'.
	 * @see it.caicividale.corsicai.model.Squadra
	 * @generated
	 */
	EClass getSquadra();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Squadra#getCapiSquadra <em>Capi Squadra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Capi Squadra</em>'.
	 * @see it.caicividale.corsicai.model.Squadra#getCapiSquadra()
	 * @see #getSquadra()
	 * @generated
	 */
	EReference getSquadra_CapiSquadra();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Squadra#getAllieviInSquadra <em>Allievi In Squadra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allievi In Squadra</em>'.
	 * @see it.caicividale.corsicai.model.Squadra#getAllieviInSquadra()
	 * @see #getSquadra()
	 * @generated
	 */
	EReference getSquadra_AllieviInSquadra();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Squadra#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Squadra#getId()
	 * @see #getSquadra()
	 * @generated
	 */
	EAttribute getSquadra_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Valutazione <em>Valutazione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valutazione</em>'.
	 * @see it.caicividale.corsicai.model.Valutazione
	 * @generated
	 */
	EClass getValutazione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Valutazione#getMateriaValutazione <em>Materia Valutazione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Materia Valutazione</em>'.
	 * @see it.caicividale.corsicai.model.Valutazione#getMateriaValutazione()
	 * @see #getValutazione()
	 * @generated
	 */
	EAttribute getValutazione_MateriaValutazione();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Valutazione#getTipoEsitoValutazione <em>Tipo Esito Valutazione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Esito Valutazione</em>'.
	 * @see it.caicividale.corsicai.model.Valutazione#getTipoEsitoValutazione()
	 * @see #getValutazione()
	 * @generated
	 */
	EAttribute getValutazione_TipoEsitoValutazione();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Valutazione#getIstruttoriValutatori <em>Istruttori Valutatori</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Istruttori Valutatori</em>'.
	 * @see it.caicividale.corsicai.model.Valutazione#getIstruttoriValutatori()
	 * @see #getValutazione()
	 * @generated
	 */
	EReference getValutazione_IstruttoriValutatori();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Valutazione#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Valutazione#getId()
	 * @see #getValutazione()
	 * @generated
	 */
	EAttribute getValutazione_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Bilancio <em>Bilancio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bilancio</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio
	 * @generated
	 */
	EClass getBilancio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getId()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_Id();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Bilancio#getVociDiSpesa <em>Voci Di Spesa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voci Di Spesa</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getVociDiSpesa()
	 * @see #getBilancio()
	 * @generated
	 */
	EReference getBilancio_VociDiSpesa();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getNota <em>Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nota</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getNota()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_Nota();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getTotaleEntrate <em>Totale Entrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Entrate</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getTotaleEntrate()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_TotaleEntrate();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getTotaleUscite <em>Totale Uscite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Uscite</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getTotaleUscite()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_TotaleUscite();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getTotaleIscrizioni <em>Totale Iscrizioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Iscrizioni</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getTotaleIscrizioni()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_TotaleIscrizioni();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getTotaleEntrateConIscrizioni <em>Totale Entrate Con Iscrizioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale Entrate Con Iscrizioni</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getTotaleEntrateConIscrizioni()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_TotaleEntrateConIscrizioni();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Bilancio#getAvanzoCorso <em>Avanzo Corso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avanzo Corso</em>'.
	 * @see it.caicividale.corsicai.model.Bilancio#getAvanzoCorso()
	 * @see #getBilancio()
	 * @generated
	 */
	EAttribute getBilancio_AvanzoCorso();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.Cassa <em>Cassa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cassa</em>'.
	 * @see it.caicividale.corsicai.model.Cassa
	 * @generated
	 */
	EClass getCassa();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Cassa#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.Cassa#getId()
	 * @see #getCassa()
	 * @generated
	 */
	EAttribute getCassa_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Cassa#getTotale <em>Totale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totale</em>'.
	 * @see it.caicividale.corsicai.model.Cassa#getTotale()
	 * @see #getCassa()
	 * @generated
	 */
	EAttribute getCassa_Totale();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.Cassa#getRipartizioneCassa <em>Ripartizione Cassa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ripartizione Cassa</em>'.
	 * @see it.caicividale.corsicai.model.Cassa#getRipartizioneCassa()
	 * @see #getCassa()
	 * @generated
	 */
	EReference getCassa_RipartizioneCassa();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Cassa#getNota <em>Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nota</em>'.
	 * @see it.caicividale.corsicai.model.Cassa#getNota()
	 * @see #getCassa()
	 * @generated
	 */
	EAttribute getCassa_Nota();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.Cassa#getDifferenzaTotaleCasseEAvanzo <em>Differenza Totale Casse EAvanzo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Differenza Totale Casse EAvanzo</em>'.
	 * @see it.caicividale.corsicai.model.Cassa#getDifferenzaTotaleCasseEAvanzo()
	 * @see #getCassa()
	 * @generated
	 */
	EAttribute getCassa_DifferenzaTotaleCasseEAvanzo();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.RipartizioneCassa <em>Ripartizione Cassa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ripartizione Cassa</em>'.
	 * @see it.caicividale.corsicai.model.RipartizioneCassa
	 * @generated
	 */
	EClass getRipartizioneCassa();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.RipartizioneCassa#getSede <em>Sede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sede</em>'.
	 * @see it.caicividale.corsicai.model.RipartizioneCassa#getSede()
	 * @see #getRipartizioneCassa()
	 * @generated
	 */
	EAttribute getRipartizioneCassa_Sede();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.RipartizioneCassa#getQuota <em>Quota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota</em>'.
	 * @see it.caicividale.corsicai.model.RipartizioneCassa#getQuota()
	 * @see #getRipartizioneCassa()
	 * @generated
	 */
	EAttribute getRipartizioneCassa_Quota();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.RipartizioneCassa#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.RipartizioneCassa#getId()
	 * @see #getRipartizioneCassa()
	 * @generated
	 */
	EAttribute getRipartizioneCassa_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.PresenzaLezione <em>Presenza Lezione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presenza Lezione</em>'.
	 * @see it.caicividale.corsicai.model.PresenzaLezione
	 * @generated
	 */
	EClass getPresenzaLezione();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.PresenzaLezione#getAllievoPresente <em>Allievo Presente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allievo Presente</em>'.
	 * @see it.caicividale.corsicai.model.PresenzaLezione#getAllievoPresente()
	 * @see #getPresenzaLezione()
	 * @generated
	 */
	EReference getPresenzaLezione_AllievoPresente();

	/**
	 * Returns the meta object for the reference list '{@link it.caicividale.corsicai.model.PresenzaLezione#getIstruttorePresente <em>Istruttore Presente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Istruttore Presente</em>'.
	 * @see it.caicividale.corsicai.model.PresenzaLezione#getIstruttorePresente()
	 * @see #getPresenzaLezione()
	 * @generated
	 */
	EReference getPresenzaLezione_IstruttorePresente();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.PresenzaLezione#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.PresenzaLezione#getId()
	 * @see #getPresenzaLezione()
	 * @generated
	 */
	EAttribute getPresenzaLezione_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.DizMateriale <em>Diz Materiale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diz Materiale</em>'.
	 * @see it.caicividale.corsicai.model.DizMateriale
	 * @generated
	 */
	EClass getDizMateriale();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.DizMateriale#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.DizMateriale#getId()
	 * @see #getDizMateriale()
	 * @generated
	 */
	EAttribute getDizMateriale_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.DizMateriale#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see it.caicividale.corsicai.model.DizMateriale#getNome()
	 * @see #getDizMateriale()
	 * @generated
	 */
	EAttribute getDizMateriale_Nome();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.DizMateriale#getNota <em>Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nota</em>'.
	 * @see it.caicividale.corsicai.model.DizMateriale#getNota()
	 * @see #getDizMateriale()
	 * @generated
	 */
	EAttribute getDizMateriale_Nota();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.DizMateriale#getQuotaNoleggio <em>Quota Noleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Noleggio</em>'.
	 * @see it.caicividale.corsicai.model.DizMateriale#getQuotaNoleggio()
	 * @see #getDizMateriale()
	 * @generated
	 */
	EAttribute getDizMateriale_QuotaNoleggio();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.MaterialeNoleggiato <em>Materiale Noleggiato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Materiale Noleggiato</em>'.
	 * @see it.caicividale.corsicai.model.MaterialeNoleggiato
	 * @generated
	 */
	EClass getMaterialeNoleggiato();

	/**
	 * Returns the meta object for the reference '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Materiale</em>'.
	 * @see it.caicividale.corsicai.model.MaterialeNoleggiato#getMateriale()
	 * @see #getMaterialeNoleggiato()
	 * @generated
	 */
	EReference getMaterialeNoleggiato_Materiale();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantita</em>'.
	 * @see it.caicividale.corsicai.model.MaterialeNoleggiato#getQuantita()
	 * @see #getMaterialeNoleggiato()
	 * @generated
	 */
	EAttribute getMaterialeNoleggiato_Quantita();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Noleggio</em>'.
	 * @see it.caicividale.corsicai.model.MaterialeNoleggiato#getDataNoleggio()
	 * @see #getMaterialeNoleggiato()
	 * @generated
	 */
	EAttribute getMaterialeNoleggiato_DataNoleggio();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.MaterialeNoleggiato#getId()
	 * @see #getMaterialeNoleggiato()
	 * @generated
	 */
	EAttribute getMaterialeNoleggiato_Id();

	/**
	 * Returns the meta object for class '{@link it.caicividale.corsicai.model.VoceDiSpesa <em>Voce Di Spesa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voce Di Spesa</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa
	 * @generated
	 */
	EClass getVoceDiSpesa();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getTitolo <em>Titolo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titolo</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getTitolo()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Titolo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getValore <em>Valore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valore</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getValore()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Valore();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getTipo()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getId()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getNota <em>Nota</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nota</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getNota()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Nota();

	/**
	 * Returns the meta object for the attribute '{@link it.caicividale.corsicai.model.VoceDiSpesa#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see it.caicividale.corsicai.model.VoceDiSpesa#getData()
	 * @see #getVoceDiSpesa()
	 * @generated
	 */
	EAttribute getVoceDiSpesa_Data();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.ESesso <em>ESesso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESesso</em>'.
	 * @see it.caicividale.corsicai.model.ESesso
	 * @generated
	 */
	EEnum getESesso();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.ETipoDocumento <em>ETipo Documento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETipo Documento</em>'.
	 * @see it.caicividale.corsicai.model.ETipoDocumento
	 * @generated
	 */
	EEnum getETipoDocumento();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETitolo Istruttore</em>'.
	 * @see it.caicividale.corsicai.model.ETitoloIstruttore
	 * @generated
	 */
	EEnum getETitoloIstruttore();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Esito Valutazione</em>'.
	 * @see it.caicividale.corsicai.model.TipoEsitoValutazione
	 * @generated
	 */
	EEnum getTipoEsitoValutazione();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.ESiglaCorso <em>ESigla Corso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESigla Corso</em>'.
	 * @see it.caicividale.corsicai.model.ESiglaCorso
	 * @generated
	 */
	EEnum getESiglaCorso();

	/**
	 * Returns the meta object for enum '{@link it.caicividale.corsicai.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETipo Voce Di Spesa</em>'.
	 * @see it.caicividale.corsicai.model.ETipoVoceDiSpesa
	 * @generated
	 */
	EEnum getETipoVoceDiSpesa();

	/**
	 * Returns the meta object for data type '{@link it.caicividale.corsicai.model.valueobject.NumeroCellulare <em>Numero Cellulare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Numero Cellulare</em>'.
	 * @see it.caicividale.corsicai.model.valueobject.NumeroCellulare
	 * @model instanceClass="it.caicividale.corsicai.model.valueobject.NumeroCellulare"
	 * @generated
	 */
	EDataType getNumeroCellulare();

	/**
	 * Returns the meta object for data type '{@link it.caicividale.corsicai.model.valueobject.EMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMail</em>'.
	 * @see it.caicividale.corsicai.model.valueobject.EMail
	 * @model instanceClass="it.caicividale.corsicai.model.valueobject.EMail"
	 * @generated
	 */
	EDataType getEMail();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Diz Materia Valutazione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Diz Materia Valutazione</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDizMateriaValutazione();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.PersonaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getPersona()
		 * @generated
		 */
		EClass PERSONA = eINSTANCE.getPersona();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NOME = eINSTANCE.getPersona_Nome();

		/**
		 * The meta object literal for the '<em><b>Cognome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__COGNOME = eINSTANCE.getPersona_Cognome();

		/**
		 * The meta object literal for the '<em><b>Sesso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__SESSO = eINSTANCE.getPersona_Sesso();

		/**
		 * The meta object literal for the '<em><b>Numero Cellulare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NUMERO_CELLULARE = eINSTANCE.getPersona_NumeroCellulare();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__EMAIL = eINSTANCE.getPersona_EMail();

		/**
		 * The meta object literal for the '<em><b>Residenza Via</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__RESIDENZA_VIA = eINSTANCE.getPersona_ResidenzaVia();

		/**
		 * The meta object literal for the '<em><b>Residenza Citta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__RESIDENZA_CITTA = eINSTANCE.getPersona_ResidenzaCitta();

		/**
		 * The meta object literal for the '<em><b>Residenza Provincia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__RESIDENZA_PROVINCIA = eINSTANCE.getPersona_ResidenzaProvincia();

		/**
		 * The meta object literal for the '<em><b>Residenza Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__RESIDENZA_CAP = eINSTANCE.getPersona_ResidenzaCap();

		/**
		 * The meta object literal for the '<em><b>Nascita Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NASCITA_DATA = eINSTANCE.getPersona_NascitaData();

		/**
		 * The meta object literal for the '<em><b>Nascita Citta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NASCITA_CITTA = eINSTANCE.getPersona_NascitaCitta();

		/**
		 * The meta object literal for the '<em><b>Nascita Provincia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__NASCITA_PROVINCIA = eINSTANCE.getPersona_NascitaProvincia();

		/**
		 * The meta object literal for the '<em><b>Sezione Cai Appartenenza</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__SEZIONE_CAI_APPARTENENZA = eINSTANCE.getPersona_SezioneCaiAppartenenza();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__ID = eINSTANCE.getPersona_Id();

		/**
		 * The meta object literal for the '<em><b>Is Staff Scuola</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONA__IS_STAFF_SCUOLA = eINSTANCE.getPersona_IsStaffScuola();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.AllievoImpl <em>Allievo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.AllievoImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getAllievo()
		 * @generated
		 */
		EClass ALLIEVO = eINSTANCE.getAllievo();

		/**
		 * The meta object literal for the '<em><b>Valutazioni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLIEVO__VALUTAZIONI = eINSTANCE.getAllievo_Valutazioni();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.CorsoImpl <em>Corso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.CorsoImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getCorso()
		 * @generated
		 */
		EClass CORSO = eINSTANCE.getCorso();

		/**
		 * The meta object literal for the '<em><b>Anno</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__ANNO = eINSTANCE.getCorso_Anno();

		/**
		 * The meta object literal for the '<em><b>Quota Iscrizione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__QUOTA_ISCRIZIONE = eINSTANCE.getCorso_QuotaIscrizione();

		/**
		 * The meta object literal for the '<em><b>Quota Caparra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__QUOTA_CAPARRA = eINSTANCE.getCorso_QuotaCaparra();

		/**
		 * The meta object literal for the '<em><b>Lezioni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__LEZIONI = eINSTANCE.getCorso_Lezioni();

		/**
		 * The meta object literal for the '<em><b>Is Modulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__IS_MODULO = eINSTANCE.getCorso_IsModulo();

		/**
		 * The meta object literal for the '<em><b>Direttore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__DIRETTORE = eINSTANCE.getCorso_Direttore();

		/**
		 * The meta object literal for the '<em><b>Vicedirettore</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__VICEDIRETTORE = eINSTANCE.getCorso_Vicedirettore();

		/**
		 * The meta object literal for the '<em><b>Segretario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__SEGRETARIO = eINSTANCE.getCorso_Segretario();

		/**
		 * The meta object literal for the '<em><b>Testo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__TESTO = eINSTANCE.getCorso_Testo();

		/**
		 * The meta object literal for the '<em><b>Bilancio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__BILANCIO = eINSTANCE.getCorso_Bilancio();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__ID = eINSTANCE.getCorso_Id();

		/**
		 * The meta object literal for the '<em><b>Cassa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__CASSA = eINSTANCE.getCorso_Cassa();

		/**
		 * The meta object literal for the '<em><b>Iscrizioni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__ISCRIZIONI = eINSTANCE.getCorso_Iscrizioni();

		/**
		 * The meta object literal for the '<em><b>Data Inizio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__DATA_INIZIO = eINSTANCE.getCorso_DataInizio();

		/**
		 * The meta object literal for the '<em><b>Data Fine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__DATA_FINE = eINSTANCE.getCorso_DataFine();

		/**
		 * The meta object literal for the '<em><b>Staff Istruttori</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__STAFF_ISTRUTTORI = eINSTANCE.getCorso_StaffIstruttori();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NOME = eINSTANCE.getCorso_Nome();

		/**
		 * The meta object literal for the '<em><b>Sigla</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__SIGLA = eINSTANCE.getCorso_Sigla();

		/**
		 * The meta object literal for the '<em><b>Equipaggiamento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__EQUIPAGGIAMENTO = eINSTANCE.getCorso_Equipaggiamento();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI = eINSTANCE.getCorso_NumeroAllievi();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Iscrizione Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK = eINSTANCE.getCorso_NumeroAllieviIscrizioneOk();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Iscrizione Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO = eINSTANCE.getCorso_NumeroAllieviIscrizioneKo();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Nuovi Iscritti</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI = eINSTANCE.getCorso_NumeroAllieviNuoviIscritti();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Maschi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_MASCHI = eINSTANCE.getCorso_NumeroAllieviMaschi();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Femmine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_FEMMINE = eINSTANCE.getCorso_NumeroAllieviFemmine();

		/**
		 * The meta object literal for the '<em><b>Numero Allievi Con Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO = eINSTANCE.getCorso_NumeroAllieviConNoleggio();

		/**
		 * The meta object literal for the '<em><b>List Riepilogonoleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORSO__LIST_RIEPILOGONOLEGGIO = eINSTANCE.getCorso_ListRiepilogonoleggio();

		/**
		 * The meta object literal for the '<em><b>Moduli</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORSO__MODULI = eINSTANCE.getCorso_Moduli();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.DocumentoImpl <em>Documento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.DocumentoImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDocumento()
		 * @generated
		 */
		EClass DOCUMENTO = eINSTANCE.getDocumento();

		/**
		 * The meta object literal for the '<em><b>Tipo Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__TIPO_DOCUMENTO = eINSTANCE.getDocumento_TipoDocumento();

		/**
		 * The meta object literal for the '<em><b>Documento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__DOCUMENTO = eINSTANCE.getDocumento_Documento();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTO__ID = eINSTANCE.getDocumento_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.IscrizioneImpl <em>Iscrizione</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.IscrizioneImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getIscrizione()
		 * @generated
		 */
		EClass ISCRIZIONE = eINSTANCE.getIscrizione();

		/**
		 * The meta object literal for the '<em><b>Is Modulo Iscrizione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_MODULO_ISCRIZIONE = eINSTANCE.getIscrizione_IsModuloIscrizione();

		/**
		 * The meta object literal for the '<em><b>Is Consenso Informato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_CONSENSO_INFORMATO = eINSTANCE.getIscrizione_IsConsensoInformato();

		/**
		 * The meta object literal for the '<em><b>Is Nuovo Allievo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_NUOVO_ALLIEVO = eINSTANCE.getIscrizione_IsNuovoAllievo();

		/**
		 * The meta object literal for the '<em><b>Data Scadenza Certificato Medico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__DATA_SCADENZA_CERTIFICATO_MEDICO = eINSTANCE
				.getIscrizione_DataScadenzaCertificatoMedico();

		/**
		 * The meta object literal for the '<em><b>Is Bollino Anno Corso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_BOLLINO_ANNO_CORSO = eINSTANCE.getIscrizione_IsBollinoAnnoCorso();

		/**
		 * The meta object literal for the '<em><b>Caparra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__CAPARRA = eINSTANCE.getIscrizione_Caparra();

		/**
		 * The meta object literal for the '<em><b>Saldo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__SALDO = eINSTANCE.getIscrizione_Saldo();

		/**
		 * The meta object literal for the '<em><b>Totale Versato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__TOTALE_VERSATO = eINSTANCE.getIscrizione_TotaleVersato();

		/**
		 * The meta object literal for the '<em><b>Documenti</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISCRIZIONE__DOCUMENTI = eINSTANCE.getIscrizione_Documenti();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__ID = eINSTANCE.getIscrizione_Id();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__NOTE = eINSTANCE.getIscrizione_Note();

		/**
		 * The meta object literal for the '<em><b>Is Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_NOLEGGIO = eINSTANCE.getIscrizione_IsNoleggio();

		/**
		 * The meta object literal for the '<em><b>Materiale Noleggiato</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISCRIZIONE__MATERIALE_NOLEGGIATO = eINSTANCE.getIscrizione_MaterialeNoleggiato();

		/**
		 * The meta object literal for the '<em><b>Is Iscrizione Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_ISCRIZIONE_OK = eINSTANCE.getIscrizione_IsIscrizioneOk();

		/**
		 * The meta object literal for the '<em><b>Quota Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__QUOTA_NOLEGGIO = eINSTANCE.getIscrizione_QuotaNoleggio();

		/**
		 * The meta object literal for the '<em><b>Is Certificato Medico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_CERTIFICATO_MEDICO = eINSTANCE.getIscrizione_IsCertificatoMedico();

		/**
		 * The meta object literal for the '<em><b>Is Certificato Medico Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK = eINSTANCE.getIscrizione_IsCertificatoMedicoOk();

		/**
		 * The meta object literal for the '<em><b>Is Quota Versata Ok</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__IS_QUOTA_VERSATA_OK = eINSTANCE.getIscrizione_IsQuotaVersataOk();

		/**
		 * The meta object literal for the '<em><b>Quota Noleggio Da Versare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE = eINSTANCE.getIscrizione_QuotaNoleggioDaVersare();

		/**
		 * The meta object literal for the '<em><b>Totale Da Versare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__TOTALE_DA_VERSARE = eINSTANCE.getIscrizione_TotaleDaVersare();

		/**
		 * The meta object literal for the '<em><b>Differenza Totale Versato Totale Da Versare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE = eINSTANCE
				.getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare();

		/**
		 * The meta object literal for the '<em><b>Messaggi Errore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISCRIZIONE__MESSAGGI_ERRORE = eINSTANCE.getIscrizione_MessaggiErrore();

		/**
		 * The meta object literal for the '<em><b>Allievo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISCRIZIONE__ALLIEVO = eINSTANCE.getIscrizione_Allievo();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.LezioneImpl <em>Lezione</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.LezioneImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezione()
		 * @generated
		 */
		EClass LEZIONE = eINSTANCE.getLezione();

		/**
		 * The meta object literal for the '<em><b>Titolo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__TITOLO = eINSTANCE.getLezione_Titolo();

		/**
		 * The meta object literal for the '<em><b>Data Svolgimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__DATA_SVOLGIMENTO = eINSTANCE.getLezione_DataSvolgimento();

		/**
		 * The meta object literal for the '<em><b>Luogo Svolgimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__LUOGO_SVOLGIMENTO = eINSTANCE.getLezione_LuogoSvolgimento();

		/**
		 * The meta object literal for the '<em><b>Durata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__DURATA = eINSTANCE.getLezione_Durata();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__ID = eINSTANCE.getLezione_Id();

		/**
		 * The meta object literal for the '<em><b>Presenza Lezione</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEZIONE__PRESENZA_LEZIONE = eINSTANCE.getLezione_PresenzaLezione();

		/**
		 * The meta object literal for the '<em><b>Argomenti Trattati</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE__ARGOMENTI_TRATTATI = eINSTANCE.getLezione_ArgomentiTrattati();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.LezioneTeoricaImpl <em>Lezione Teorica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.LezioneTeoricaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezioneTeorica()
		 * @generated
		 */
		EClass LEZIONE_TEORICA = eINSTANCE.getLezioneTeorica();

		/**
		 * The meta object literal for the '<em><b>Docente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE_TEORICA__DOCENTE = eINSTANCE.getLezioneTeorica_Docente();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.LezionePraticaImpl <em>Lezione Pratica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.LezionePraticaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getLezionePratica()
		 * @generated
		 */
		EClass LEZIONE_PRATICA = eINSTANCE.getLezionePratica();

		/**
		 * The meta object literal for the '<em><b>Staff Istruttori Lezione</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE = eINSTANCE.getLezionePratica_StaffIstruttoriLezione();

		/**
		 * The meta object literal for the '<em><b>Luogo Ritrovo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEZIONE_PRATICA__LUOGO_RITROVO = eINSTANCE.getLezionePratica_LuogoRitrovo();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.IstruttoreImpl <em>Istruttore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.IstruttoreImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getIstruttore()
		 * @generated
		 */
		EClass ISTRUTTORE = eINSTANCE.getIstruttore();

		/**
		 * The meta object literal for the '<em><b>Titolo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTRUTTORE__TITOLO = eINSTANCE.getIstruttore_Titolo();

		/**
		 * The meta object literal for the '<em><b>Valutazioni</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISTRUTTORE__VALUTAZIONI = eINSTANCE.getIstruttore_Valutazioni();

		/**
		 * The meta object literal for the '<em><b>Is Attivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISTRUTTORE__IS_ATTIVO = eINSTANCE.getIstruttore_IsAttivo();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.SquadraImpl <em>Squadra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.SquadraImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getSquadra()
		 * @generated
		 */
		EClass SQUADRA = eINSTANCE.getSquadra();

		/**
		 * The meta object literal for the '<em><b>Capi Squadra</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUADRA__CAPI_SQUADRA = eINSTANCE.getSquadra_CapiSquadra();

		/**
		 * The meta object literal for the '<em><b>Allievi In Squadra</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQUADRA__ALLIEVI_IN_SQUADRA = eINSTANCE.getSquadra_AllieviInSquadra();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUADRA__ID = eINSTANCE.getSquadra_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.ValutazioneImpl <em>Valutazione</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.ValutazioneImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getValutazione()
		 * @generated
		 */
		EClass VALUTAZIONE = eINSTANCE.getValutazione();

		/**
		 * The meta object literal for the '<em><b>Materia Valutazione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUTAZIONE__MATERIA_VALUTAZIONE = eINSTANCE.getValutazione_MateriaValutazione();

		/**
		 * The meta object literal for the '<em><b>Tipo Esito Valutazione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUTAZIONE__TIPO_ESITO_VALUTAZIONE = eINSTANCE.getValutazione_TipoEsitoValutazione();

		/**
		 * The meta object literal for the '<em><b>Istruttori Valutatori</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUTAZIONE__ISTRUTTORI_VALUTATORI = eINSTANCE.getValutazione_IstruttoriValutatori();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUTAZIONE__ID = eINSTANCE.getValutazione_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.BilancioImpl <em>Bilancio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.BilancioImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getBilancio()
		 * @generated
		 */
		EClass BILANCIO = eINSTANCE.getBilancio();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__ID = eINSTANCE.getBilancio_Id();

		/**
		 * The meta object literal for the '<em><b>Voci Di Spesa</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILANCIO__VOCI_DI_SPESA = eINSTANCE.getBilancio_VociDiSpesa();

		/**
		 * The meta object literal for the '<em><b>Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__NOTA = eINSTANCE.getBilancio_Nota();

		/**
		 * The meta object literal for the '<em><b>Totale Entrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__TOTALE_ENTRATE = eINSTANCE.getBilancio_TotaleEntrate();

		/**
		 * The meta object literal for the '<em><b>Totale Uscite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__TOTALE_USCITE = eINSTANCE.getBilancio_TotaleUscite();

		/**
		 * The meta object literal for the '<em><b>Totale Iscrizioni</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__TOTALE_ISCRIZIONI = eINSTANCE.getBilancio_TotaleIscrizioni();

		/**
		 * The meta object literal for the '<em><b>Totale Entrate Con Iscrizioni</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI = eINSTANCE.getBilancio_TotaleEntrateConIscrizioni();

		/**
		 * The meta object literal for the '<em><b>Avanzo Corso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILANCIO__AVANZO_CORSO = eINSTANCE.getBilancio_AvanzoCorso();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.CassaImpl <em>Cassa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.CassaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getCassa()
		 * @generated
		 */
		EClass CASSA = eINSTANCE.getCassa();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSA__ID = eINSTANCE.getCassa_Id();

		/**
		 * The meta object literal for the '<em><b>Totale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSA__TOTALE = eINSTANCE.getCassa_Totale();

		/**
		 * The meta object literal for the '<em><b>Ripartizione Cassa</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASSA__RIPARTIZIONE_CASSA = eINSTANCE.getCassa_RipartizioneCassa();

		/**
		 * The meta object literal for the '<em><b>Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSA__NOTA = eINSTANCE.getCassa_Nota();

		/**
		 * The meta object literal for the '<em><b>Differenza Totale Casse EAvanzo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO = eINSTANCE.getCassa_DifferenzaTotaleCasseEAvanzo();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.RipartizioneCassaImpl <em>Ripartizione Cassa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.RipartizioneCassaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getRipartizioneCassa()
		 * @generated
		 */
		EClass RIPARTIZIONE_CASSA = eINSTANCE.getRipartizioneCassa();

		/**
		 * The meta object literal for the '<em><b>Sede</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIPARTIZIONE_CASSA__SEDE = eINSTANCE.getRipartizioneCassa_Sede();

		/**
		 * The meta object literal for the '<em><b>Quota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIPARTIZIONE_CASSA__QUOTA = eINSTANCE.getRipartizioneCassa_Quota();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIPARTIZIONE_CASSA__ID = eINSTANCE.getRipartizioneCassa_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.PresenzaLezioneImpl <em>Presenza Lezione</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.PresenzaLezioneImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getPresenzaLezione()
		 * @generated
		 */
		EClass PRESENZA_LEZIONE = eINSTANCE.getPresenzaLezione();

		/**
		 * The meta object literal for the '<em><b>Allievo Presente</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENZA_LEZIONE__ALLIEVO_PRESENTE = eINSTANCE.getPresenzaLezione_AllievoPresente();

		/**
		 * The meta object literal for the '<em><b>Istruttore Presente</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE = eINSTANCE.getPresenzaLezione_IstruttorePresente();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENZA_LEZIONE__ID = eINSTANCE.getPresenzaLezione_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.DizMaterialeImpl <em>Diz Materiale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.DizMaterialeImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDizMateriale()
		 * @generated
		 */
		EClass DIZ_MATERIALE = eINSTANCE.getDizMateriale();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIZ_MATERIALE__ID = eINSTANCE.getDizMateriale_Id();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIZ_MATERIALE__NOME = eINSTANCE.getDizMateriale_Nome();

		/**
		 * The meta object literal for the '<em><b>Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIZ_MATERIALE__NOTA = eINSTANCE.getDizMateriale_Nota();

		/**
		 * The meta object literal for the '<em><b>Quota Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIZ_MATERIALE__QUOTA_NOLEGGIO = eINSTANCE.getDizMateriale_QuotaNoleggio();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.MaterialeNoleggiatoImpl <em>Materiale Noleggiato</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.MaterialeNoleggiatoImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getMaterialeNoleggiato()
		 * @generated
		 */
		EClass MATERIALE_NOLEGGIATO = eINSTANCE.getMaterialeNoleggiato();

		/**
		 * The meta object literal for the '<em><b>Materiale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIALE_NOLEGGIATO__MATERIALE = eINSTANCE.getMaterialeNoleggiato_Materiale();

		/**
		 * The meta object literal for the '<em><b>Quantita</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIALE_NOLEGGIATO__QUANTITA = eINSTANCE.getMaterialeNoleggiato_Quantita();

		/**
		 * The meta object literal for the '<em><b>Data Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIALE_NOLEGGIATO__DATA_NOLEGGIO = eINSTANCE.getMaterialeNoleggiato_DataNoleggio();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIALE_NOLEGGIATO__ID = eINSTANCE.getMaterialeNoleggiato_Id();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.impl.VoceDiSpesaImpl <em>Voce Di Spesa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.impl.VoceDiSpesaImpl
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getVoceDiSpesa()
		 * @generated
		 */
		EClass VOCE_DI_SPESA = eINSTANCE.getVoceDiSpesa();

		/**
		 * The meta object literal for the '<em><b>Titolo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__TITOLO = eINSTANCE.getVoceDiSpesa_Titolo();

		/**
		 * The meta object literal for the '<em><b>Valore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__VALORE = eINSTANCE.getVoceDiSpesa_Valore();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__TIPO = eINSTANCE.getVoceDiSpesa_Tipo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__ID = eINSTANCE.getVoceDiSpesa_Id();

		/**
		 * The meta object literal for the '<em><b>Nota</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__NOTA = eINSTANCE.getVoceDiSpesa_Nota();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOCE_DI_SPESA__DATA = eINSTANCE.getVoceDiSpesa_Data();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.ESesso <em>ESesso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.ESesso
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getESesso()
		 * @generated
		 */
		EEnum ESESSO = eINSTANCE.getESesso();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.ETipoDocumento <em>ETipo Documento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.ETipoDocumento
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETipoDocumento()
		 * @generated
		 */
		EEnum ETIPO_DOCUMENTO = eINSTANCE.getETipoDocumento();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.ETitoloIstruttore
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETitoloIstruttore()
		 * @generated
		 */
		EEnum ETITOLO_ISTRUTTORE = eINSTANCE.getETitoloIstruttore();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.TipoEsitoValutazione
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getTipoEsitoValutazione()
		 * @generated
		 */
		EEnum TIPO_ESITO_VALUTAZIONE = eINSTANCE.getTipoEsitoValutazione();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.ESiglaCorso <em>ESigla Corso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.ESiglaCorso
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getESiglaCorso()
		 * @generated
		 */
		EEnum ESIGLA_CORSO = eINSTANCE.getESiglaCorso();

		/**
		 * The meta object literal for the '{@link it.caicividale.corsicai.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.ETipoVoceDiSpesa
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getETipoVoceDiSpesa()
		 * @generated
		 */
		EEnum ETIPO_VOCE_DI_SPESA = eINSTANCE.getETipoVoceDiSpesa();

		/**
		 * The meta object literal for the '<em>Numero Cellulare</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.valueobject.NumeroCellulare
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getNumeroCellulare()
		 * @generated
		 */
		EDataType NUMERO_CELLULARE = eINSTANCE.getNumeroCellulare();

		/**
		 * The meta object literal for the '<em>EMail</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.corsicai.model.valueobject.EMail
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getEMail()
		 * @generated
		 */
		EDataType EMAIL = eINSTANCE.getEMail();

		/**
		 * The meta object literal for the '<em>Diz Materia Valutazione</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see it.caicividale.corsicai.model.impl.ModelPackageImpl#getDizMateriaValutazione()
		 * @generated
		 */
		EDataType DIZ_MATERIA_VALUTAZIONE = eINSTANCE.getDizMateriaValutazione();

	}

} //ModelPackage
