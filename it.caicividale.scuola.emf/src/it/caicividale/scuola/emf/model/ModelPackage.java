/**
 */
package it.caicividale.scuola.emf.model;

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
 * @see it.caicividale.scuola.emf.model.ModelFactory
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
    String eNS_URI = "http://it.caicividale.scuola.emf.model";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "it.caicividale.scuola.emf.model";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelPackage eINSTANCE = it.caicividale.scuola.emf.model.impl.ModelPackageImpl.init();

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.PersonaImpl <em>Persona</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.PersonaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getPersona()
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
     * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__NASCITA_DATA = 6;

    /**
     * The feature id for the '<em><b>Sezione Cai Appartenenza</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__SEZIONE_CAI_APPARTENENZA = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__ID = 8;

    /**
     * The feature id for the '<em><b>Is Staff Scuola</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__IS_STAFF_SCUOLA = 9;

    /**
     * The feature id for the '<em><b>Comune Residenza</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__COMUNE_RESIDENZA = 10;

    /**
     * The feature id for the '<em><b>Comune Nascita</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA__COMUNE_NASCITA = 11;

    /**
     * The number of structural features of the '<em>Persona</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_FEATURE_COUNT = 12;

    /**
     * The number of operations of the '<em>Persona</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PERSONA_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.AllievoImpl <em>Allievo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.AllievoImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getAllievo()
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
     * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLIEVO__NASCITA_DATA = PERSONA__NASCITA_DATA;

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
     * The feature id for the '<em><b>Comune Residenza</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLIEVO__COMUNE_RESIDENZA = PERSONA__COMUNE_RESIDENZA;

    /**
     * The feature id for the '<em><b>Comune Nascita</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLIEVO__COMUNE_NASCITA = PERSONA__COMUNE_NASCITA;

    /**
     * The feature id for the '<em><b>Is Diploma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLIEVO__IS_DIPLOMA = PERSONA_FEATURE_COUNT + 0;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.CorsoImpl <em>Corso</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.CorsoImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getCorso()
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
     * The feature id for the '<em><b>Is Modulo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__IS_MODULO = 3;

    /**
     * The feature id for the '<em><b>Direttore</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__DIRETTORE = 4;

    /**
     * The feature id for the '<em><b>Vice Direttore</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__VICE_DIRETTORE = 5;

    /**
     * The feature id for the '<em><b>Segretario</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__SEGRETARIO = 6;

    /**
     * The feature id for the '<em><b>Testo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__TESTO = 7;

    /**
     * The feature id for the '<em><b>Bilancio</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__BILANCIO = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__ID = 9;

    /**
     * The feature id for the '<em><b>Cassa</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__CASSA = 10;

    /**
     * The feature id for the '<em><b>Data Inizio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__DATA_INIZIO = 11;

    /**
     * The feature id for the '<em><b>Data Fine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__DATA_FINE = 12;

    /**
     * The feature id for the '<em><b>Staff Istruttori</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__STAFF_ISTRUTTORI = 13;

    /**
     * The feature id for the '<em><b>Nome</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NOME = 14;

    /**
     * The feature id for the '<em><b>Sigla</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__SIGLA = 15;

    /**
     * The feature id for the '<em><b>Equipaggiamento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__EQUIPAGGIAMENTO = 16;

    /**
     * The feature id for the '<em><b>Numero Allievi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI = 17;

    /**
     * The feature id for the '<em><b>Numero Allievi Iscrizione Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_ISCRIZIONE_OK = 18;

    /**
     * The feature id for the '<em><b>Numero Allievi Iscrizione Ko</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_ISCRIZIONE_KO = 19;

    /**
     * The feature id for the '<em><b>Numero Allievi Nuovi Iscritti</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_NUOVI_ISCRITTI = 20;

    /**
     * The feature id for the '<em><b>Numero Allievi Maschi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_MASCHI = 21;

    /**
     * The feature id for the '<em><b>Numero Allievi Femmine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_FEMMINE = 22;

    /**
     * The feature id for the '<em><b>Numero Allievi Con Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__NUMERO_ALLIEVI_CON_NOLEGGIO = 23;

    /**
     * The feature id for the '<em><b>List Riepilogo Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__LIST_RIEPILOGO_NOLEGGIO = 24;

    /**
     * The feature id for the '<em><b>Moduli</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__MODULI = 25;

    /**
     * The feature id for the '<em><b>Lezioni Pratiche</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__LEZIONI_PRATICHE = 26;

    /**
     * The feature id for the '<em><b>Lezioni Teoriche</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__LEZIONI_TEORICHE = 27;

    /**
     * The feature id for the '<em><b>Iscrizioni</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO__ISCRIZIONI = 28;

    /**
     * The number of structural features of the '<em>Corso</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO_FEATURE_COUNT = 29;

    /**
     * The number of operations of the '<em>Corso</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CORSO_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl <em>Iscrizione</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.IscrizioneImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getIscrizione()
     * @generated
     */
    int ISCRIZIONE = 3;

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
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__ID = 8;

    /**
     * The feature id for the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__NOTE = 9;

    /**
     * The feature id for the '<em><b>Is Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__IS_NOLEGGIO = 10;

    /**
     * The feature id for the '<em><b>Materiali Noleggiati</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__MATERIALI_NOLEGGIATI = 11;

    /**
     * The feature id for the '<em><b>Is Iscrizione Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__IS_ISCRIZIONE_OK = 12;

    /**
     * The feature id for the '<em><b>Quota Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__QUOTA_NOLEGGIO = 13;

    /**
     * The feature id for the '<em><b>Is Certificato Medico</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__IS_CERTIFICATO_MEDICO = 14;

    /**
     * The feature id for the '<em><b>Is Certificato Medico Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__IS_CERTIFICATO_MEDICO_OK = 15;

    /**
     * The feature id for the '<em><b>Is Quota Versata Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__IS_QUOTA_VERSATA_OK = 16;

    /**
     * The feature id for the '<em><b>Quota Noleggio Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__QUOTA_NOLEGGIO_DA_VERSARE = 17;

    /**
     * The feature id for the '<em><b>Totale Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__TOTALE_DA_VERSARE = 18;

    /**
     * The feature id for the '<em><b>Differenza Totale Versato Totale Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__DIFFERENZA_TOTALE_VERSATO_TOTALE_DA_VERSARE = 19;

    /**
     * The feature id for the '<em><b>Messaggi Errore</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__MESSAGGI_ERRORE = 20;

    /**
     * The feature id for the '<em><b>Allievo</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__ALLIEVO = 21;

    /**
     * The feature id for the '<em><b>Data Fine Corso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISCRIZIONE__DATA_FINE_CORSO = 22;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.LezioneImpl <em>Lezione</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.LezioneImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezione()
     * @generated
     */
    int LEZIONE = 4;

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
     * The feature id for the '<em><b>Presenza Lezione</b></em>' containment reference.
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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.LezioneTeoricaImpl <em>Lezione Teorica</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.LezioneTeoricaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezioneTeorica()
     * @generated
     */
    int LEZIONE_TEORICA = 5;

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
     * The feature id for the '<em><b>Presenza Lezione</b></em>' containment reference.
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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.LezionePraticaImpl <em>Lezione Pratica</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.LezionePraticaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezionePratica()
     * @generated
     */
    int LEZIONE_PRATICA = 6;

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
     * The feature id for the '<em><b>Presenza Lezione</b></em>' containment reference.
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
     * The feature id for the '<em><b>Luogo Ritrovo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEZIONE_PRATICA__LUOGO_RITROVO = LEZIONE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Squadre</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEZIONE_PRATICA__SQUADRE = LEZIONE_FEATURE_COUNT + 1;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.IstruttoreImpl <em>Istruttore</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.IstruttoreImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getIstruttore()
     * @generated
     */
    int ISTRUTTORE = 7;

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
     * The feature id for the '<em><b>Nascita Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE__NASCITA_DATA = PERSONA__NASCITA_DATA;

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
     * The feature id for the '<em><b>Comune Residenza</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE__COMUNE_RESIDENZA = PERSONA__COMUNE_RESIDENZA;

    /**
     * The feature id for the '<em><b>Comune Nascita</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE__COMUNE_NASCITA = PERSONA__COMUNE_NASCITA;

    /**
     * The feature id for the '<em><b>Titolo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE__TITOLO = PERSONA_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Is Attivo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE__IS_ATTIVO = PERSONA_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Istruttore</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE_FEATURE_COUNT = PERSONA_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Istruttore</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISTRUTTORE_OPERATION_COUNT = PERSONA_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.SquadraImpl <em>Squadra</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.SquadraImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getSquadra()
     * @generated
     */
    int SQUADRA = 8;

    /**
     * The feature id for the '<em><b>Capo Squadra</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQUADRA__CAPO_SQUADRA = 0;

    /**
     * The feature id for the '<em><b>Allievi In Squadra</b></em>' containment reference list.
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
     * The feature id for the '<em><b>Nome</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQUADRA__NOME = 3;

    /**
     * The feature id for the '<em><b>Staff Squadra</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQUADRA__STAFF_SQUADRA = 4;

    /**
     * The number of structural features of the '<em>Squadra</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQUADRA_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Squadra</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SQUADRA_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.BilancioImpl <em>Bilancio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.BilancioImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getBilancio()
     * @generated
     */
    int BILANCIO = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BILANCIO__ID = 0;

    /**
     * The feature id for the '<em><b>Voci Di Spesa</b></em>' containment reference list.
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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.CassaImpl <em>Cassa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.CassaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getCassa()
     * @generated
     */
    int CASSA = 10;

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
     * The feature id for the '<em><b>Ripartizioni Cassa</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASSA__RIPARTIZIONI_CASSA = 2;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl <em>Ripartizione Cassa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getRipartizioneCassa()
     * @generated
     */
    int RIPARTIZIONE_CASSA = 11;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl <em>Presenza Lezione</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getPresenzaLezione()
     * @generated
     */
    int PRESENZA_LEZIONE = 12;

    /**
     * The feature id for the '<em><b>Allievi Presenti</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENZA_LEZIONE__ALLIEVI_PRESENTI = 0;

    /**
     * The feature id for the '<em><b>Istruttori Presenti</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI = 1;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl <em>Diz Materiale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.DizMaterialeImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getDizMateriale()
     * @generated
     */
    int DIZ_MATERIALE = 13;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl <em>Materiale Noleggiato</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getMaterialeNoleggiato()
     * @generated
     */
    int MATERIALE_NOLEGGIATO = 14;

    /**
     * The feature id for the '<em><b>Materiale</b></em>' containment reference.
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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl <em>Voce Di Spesa</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getVoceDiSpesa()
     * @generated
     */
    int VOCE_DI_SPESA = 15;

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
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.ElencoCorsiImpl <em>Elenco Corsi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.ElencoCorsiImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoCorsi()
     * @generated
     */
    int ELENCO_CORSI = 16;

    /**
     * The feature id for the '<em><b>Elenco Corsi</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_CORSI__ELENCO_CORSI = 0;

    /**
     * The number of structural features of the '<em>Elenco Corsi</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_CORSI_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elenco Corsi</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_CORSI_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.ElencoIscrizioniImpl <em>Elenco Iscrizioni</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.ElencoIscrizioniImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoIscrizioni()
     * @generated
     */
    int ELENCO_ISCRIZIONI = 17;

    /**
     * The feature id for the '<em><b>Elenco Iscrizioni</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI = 0;

    /**
     * The number of structural features of the '<em>Elenco Iscrizioni</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISCRIZIONI_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elenco Iscrizioni</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISCRIZIONI_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.ElencoMaterialiImpl <em>Elenco Materiali</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.ElencoMaterialiImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoMateriali()
     * @generated
     */
    int ELENCO_MATERIALI = 18;

    /**
     * The feature id for the '<em><b>Elenco Materiali</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_MATERIALI__ELENCO_MATERIALI = 0;

    /**
     * The number of structural features of the '<em>Elenco Materiali</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_MATERIALI_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elenco Materiali</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_MATERIALI_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.ElencoIstruttoriImpl <em>Elenco Istruttori</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.ElencoIstruttoriImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoIstruttori()
     * @generated
     */
    int ELENCO_ISTRUTTORI = 19;

    /**
     * The feature id for the '<em><b>Elenco Istruttori</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI = 0;

    /**
     * The number of structural features of the '<em>Elenco Istruttori</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISTRUTTORI_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elenco Istruttori</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_ISTRUTTORI_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl <em>Diz Comune</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.DizComuneImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getDizComune()
     * @generated
     */
    int DIZ_COMUNE = 20;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__ID = 0;

    /**
     * The feature id for the '<em><b>Comune</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__COMUNE = 1;

    /**
     * The feature id for the '<em><b>Provincia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__PROVINCIA = 2;

    /**
     * The feature id for the '<em><b>Sigla</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__SIGLA = 3;

    /**
     * The feature id for the '<em><b>Regione</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__REGIONE = 4;

    /**
     * The feature id for the '<em><b>Cap</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE__CAP = 5;

    /**
     * The number of structural features of the '<em>Diz Comune</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Diz Comune</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIZ_COMUNE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.impl.ElencoComuniImpl <em>Elenco Comuni</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.impl.ElencoComuniImpl
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoComuni()
     * @generated
     */
    int ELENCO_COMUNI = 21;

    /**
     * The feature id for the '<em><b>Elenco Comuni</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_COMUNI__ELENCO_COMUNI = 0;

    /**
     * The number of structural features of the '<em>Elenco Comuni</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_COMUNI_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elenco Comuni</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELENCO_COMUNI_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.ESesso <em>ESesso</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.ESesso
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getESesso()
     * @generated
     */
    int ESESSO = 22;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.ETitoloIstruttore
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getETitoloIstruttore()
     * @generated
     */
    int ETITOLO_ISTRUTTORE = 23;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.TipoEsitoValutazione
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getTipoEsitoValutazione()
     * @generated
     */
    int TIPO_ESITO_VALUTAZIONE = 24;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.ESiglaCorso <em>ESigla Corso</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.ESiglaCorso
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getESiglaCorso()
     * @generated
     */
    int ESIGLA_CORSO = 25;

    /**
     * The meta object id for the '{@link it.caicividale.scuola.emf.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.ETipoVoceDiSpesa
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getETipoVoceDiSpesa()
     * @generated
     */
    int ETIPO_VOCE_DI_SPESA = 26;

    /**
     * The meta object id for the '<em>Numero Cellulare</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.valueobject.NumeroCellulare
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getNumeroCellulare()
     * @generated
     */
    int NUMERO_CELLULARE = 27;

    /**
     * The meta object id for the '<em>EMail</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.caicividale.scuola.emf.model.valueobject.EMail
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getEMail()
     * @generated
     */
    int EMAIL = 28;

    /**
     * The meta object id for the '<em>ELocal Date</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.LocalDate
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getELocalDate()
     * @generated
     */
    int ELOCAL_DATE = 29;

    /**
     * The meta object id for the '<em>ELocal Date Time</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.time.LocalDateTime
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getELocalDateTime()
     * @generated
     */
    int ELOCAL_DATE_TIME = 30;

    /**
     * The meta object id for the '<em>Equals And Hash Code</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lombok.EqualsAndHashCode
     * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getEqualsAndHashCode()
     * @generated
     */
    int EQUALS_AND_HASH_CODE = 31;

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Persona <em>Persona</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Persona</em>'.
     * @see it.caicividale.scuola.emf.model.Persona
     * @generated
     */
    EClass getPersona();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getNome <em>Nome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nome</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getNome()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_Nome();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getCognome <em>Cognome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cognome</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getCognome()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_Cognome();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getSesso <em>Sesso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sesso</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getSesso()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_Sesso();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getNumeroCellulare <em>Numero Cellulare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Cellulare</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getNumeroCellulare()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_NumeroCellulare();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getEMail <em>EMail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EMail</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getEMail()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_EMail();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getResidenzaVia <em>Residenza Via</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Residenza Via</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getResidenzaVia()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_ResidenzaVia();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getNascitaData <em>Nascita Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nascita Data</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getNascitaData()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_NascitaData();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getSezioneCaiAppartenenza <em>Sezione Cai Appartenenza</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sezione Cai Appartenenza</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getSezioneCaiAppartenenza()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_SezioneCaiAppartenenza();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getId()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Persona#getIsStaffScuola <em>Is Staff Scuola</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Staff Scuola</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getIsStaffScuola()
     * @see #getPersona()
     * @generated
     */
    EAttribute getPersona_IsStaffScuola();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Persona#getComuneResidenza <em>Comune Residenza</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Comune Residenza</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getComuneResidenza()
     * @see #getPersona()
     * @generated
     */
    EReference getPersona_ComuneResidenza();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Persona#getComuneNascita <em>Comune Nascita</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Comune Nascita</em>'.
     * @see it.caicividale.scuola.emf.model.Persona#getComuneNascita()
     * @see #getPersona()
     * @generated
     */
    EReference getPersona_ComuneNascita();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Allievo <em>Allievo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Allievo</em>'.
     * @see it.caicividale.scuola.emf.model.Allievo
     * @generated
     */
    EClass getAllievo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Allievo#getIsDiploma <em>Is Diploma</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Diploma</em>'.
     * @see it.caicividale.scuola.emf.model.Allievo#getIsDiploma()
     * @see #getAllievo()
     * @generated
     */
    EAttribute getAllievo_IsDiploma();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Corso <em>Corso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Corso</em>'.
     * @see it.caicividale.scuola.emf.model.Corso
     * @generated
     */
    EClass getCorso();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getAnno <em>Anno</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Anno</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getAnno()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Anno();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getQuotaIscrizione <em>Quota Iscrizione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota Iscrizione</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getQuotaIscrizione()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_QuotaIscrizione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getQuotaCaparra <em>Quota Caparra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota Caparra</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getQuotaCaparra()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_QuotaCaparra();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getIsModulo <em>Is Modulo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Modulo</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getIsModulo()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_IsModulo();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Corso#getDirettore <em>Direttore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Direttore</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getDirettore()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Direttore();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Corso#getViceDirettore <em>Vice Direttore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Vice Direttore</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getViceDirettore()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_ViceDirettore();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Corso#getSegretario <em>Segretario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Segretario</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getSegretario()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Segretario();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getTesto <em>Testo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Testo</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getTesto()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Testo();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Corso#getBilancio <em>Bilancio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bilancio</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getBilancio()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Bilancio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getId()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Id();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Corso#getCassa <em>Cassa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cassa</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getCassa()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Cassa();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Corso#getIscrizioni <em>Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Iscrizioni</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getIscrizioni()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Iscrizioni();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getDataInizio <em>Data Inizio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Inizio</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getDataInizio()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_DataInizio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getDataFine <em>Data Fine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Fine</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getDataFine()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_DataFine();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Corso#getStaffIstruttori <em>Staff Istruttori</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Staff Istruttori</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getStaffIstruttori()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_StaffIstruttori();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNome <em>Nome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nome</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNome()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Nome();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getSigla <em>Sigla</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sigla</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getSigla()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Sigla();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getEquipaggiamento <em>Equipaggiamento</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Equipaggiamento</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getEquipaggiamento()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_Equipaggiamento();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllievi <em>Numero Allievi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllievi()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllievi();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneOk <em>Numero Allievi Iscrizione Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Iscrizione Ok</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneOk()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviIscrizioneOk();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneKo <em>Numero Allievi Iscrizione Ko</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Iscrizione Ko</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneKo()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviIscrizioneKo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviNuoviIscritti <em>Numero Allievi Nuovi Iscritti</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Nuovi Iscritti</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviNuoviIscritti()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviNuoviIscritti();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviMaschi <em>Numero Allievi Maschi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Maschi</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviMaschi()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviMaschi();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviFemmine <em>Numero Allievi Femmine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Femmine</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviFemmine()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviFemmine();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviConNoleggio <em>Numero Allievi Con Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Numero Allievi Con Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getNumeroAllieviConNoleggio()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_NumeroAllieviConNoleggio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Corso#getListRiepilogoNoleggio <em>List Riepilogo Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List Riepilogo Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getListRiepilogoNoleggio()
     * @see #getCorso()
     * @generated
     */
    EAttribute getCorso_ListRiepilogoNoleggio();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Corso#getModuli <em>Moduli</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Moduli</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getModuli()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_Moduli();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Corso#getLezioniPratiche <em>Lezioni Pratiche</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lezioni Pratiche</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getLezioniPratiche()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_LezioniPratiche();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Corso#getLezioniTeoriche <em>Lezioni Teoriche</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Lezioni Teoriche</em>'.
     * @see it.caicividale.scuola.emf.model.Corso#getLezioniTeoriche()
     * @see #getCorso()
     * @generated
     */
    EReference getCorso_LezioniTeoriche();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Iscrizione <em>Iscrizione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Iscrizione</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione
     * @generated
     */
    EClass getIscrizione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsModuloIscrizione <em>Is Modulo Iscrizione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Modulo Iscrizione</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsModuloIscrizione()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsModuloIscrizione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsConsensoInformato <em>Is Consenso Informato</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Consenso Informato</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsConsensoInformato()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsConsensoInformato();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsNuovoAllievo <em>Is Nuovo Allievo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Nuovo Allievo</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsNuovoAllievo()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsNuovoAllievo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getDataScadenzaCertificatoMedico <em>Data Scadenza Certificato Medico</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Scadenza Certificato Medico</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getDataScadenzaCertificatoMedico()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_DataScadenzaCertificatoMedico();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsBollinoAnnoCorso <em>Is Bollino Anno Corso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Bollino Anno Corso</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsBollinoAnnoCorso()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsBollinoAnnoCorso();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getCaparra <em>Caparra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Caparra</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getCaparra()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_Caparra();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getSaldo <em>Saldo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Saldo</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getSaldo()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_Saldo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getTotaleVersato <em>Totale Versato</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Versato</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getTotaleVersato()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_TotaleVersato();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getId()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getNote <em>Note</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Note</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getNote()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_Note();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsNoleggio <em>Is Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsNoleggio()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsNoleggio();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Iscrizione#getMaterialiNoleggiati <em>Materiali Noleggiati</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Materiali Noleggiati</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getMaterialiNoleggiati()
     * @see #getIscrizione()
     * @generated
     */
    EReference getIscrizione_MaterialiNoleggiati();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsIscrizioneOk <em>Is Iscrizione Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Iscrizione Ok</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsIscrizioneOk()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsIscrizioneOk();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggio <em>Quota Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggio()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_QuotaNoleggio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedico <em>Is Certificato Medico</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Certificato Medico</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedico()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsCertificatoMedico();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedicoOk <em>Is Certificato Medico Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Certificato Medico Ok</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedicoOk()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsCertificatoMedicoOk();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsQuotaVersataOk <em>Is Quota Versata Ok</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Quota Versata Ok</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getIsQuotaVersataOk()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_IsQuotaVersataOk();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggioDaVersare <em>Quota Noleggio Da Versare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota Noleggio Da Versare</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggioDaVersare()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_QuotaNoleggioDaVersare();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getTotaleDaVersare <em>Totale Da Versare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Da Versare</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getTotaleDaVersare()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_TotaleDaVersare();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getDifferenzaTotaleVersatoTotaleDaVersare <em>Differenza Totale Versato Totale Da Versare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Differenza Totale Versato Totale Da Versare</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getDifferenzaTotaleVersatoTotaleDaVersare()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare();

    /**
     * Returns the meta object for the attribute list '{@link it.caicividale.scuola.emf.model.Iscrizione#getMessaggiErrore <em>Messaggi Errore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Messaggi Errore</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getMessaggiErrore()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_MessaggiErrore();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Iscrizione#getAllievo <em>Allievo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Allievo</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getAllievo()
     * @see #getIscrizione()
     * @generated
     */
    EReference getIscrizione_Allievo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Iscrizione#getDataFineCorso <em>Data Fine Corso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Fine Corso</em>'.
     * @see it.caicividale.scuola.emf.model.Iscrizione#getDataFineCorso()
     * @see #getIscrizione()
     * @generated
     */
    EAttribute getIscrizione_DataFineCorso();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Lezione <em>Lezione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lezione</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione
     * @generated
     */
    EClass getLezione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getTitolo <em>Titolo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Titolo</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getTitolo()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_Titolo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getDataSvolgimento <em>Data Svolgimento</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Svolgimento</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getDataSvolgimento()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_DataSvolgimento();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getLuogoSvolgimento <em>Luogo Svolgimento</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Luogo Svolgimento</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getLuogoSvolgimento()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_LuogoSvolgimento();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getDurata <em>Durata</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Durata</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getDurata()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_Durata();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getId()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_Id();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Lezione#getPresenzaLezione <em>Presenza Lezione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Presenza Lezione</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getPresenzaLezione()
     * @see #getLezione()
     * @generated
     */
    EReference getLezione_PresenzaLezione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Lezione#getArgomentiTrattati <em>Argomenti Trattati</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Argomenti Trattati</em>'.
     * @see it.caicividale.scuola.emf.model.Lezione#getArgomentiTrattati()
     * @see #getLezione()
     * @generated
     */
    EAttribute getLezione_ArgomentiTrattati();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.LezioneTeorica <em>Lezione Teorica</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lezione Teorica</em>'.
     * @see it.caicividale.scuola.emf.model.LezioneTeorica
     * @generated
     */
    EClass getLezioneTeorica();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.LezioneTeorica#getDocente <em>Docente</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Docente</em>'.
     * @see it.caicividale.scuola.emf.model.LezioneTeorica#getDocente()
     * @see #getLezioneTeorica()
     * @generated
     */
    EAttribute getLezioneTeorica_Docente();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.LezionePratica <em>Lezione Pratica</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Lezione Pratica</em>'.
     * @see it.caicividale.scuola.emf.model.LezionePratica
     * @generated
     */
    EClass getLezionePratica();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Luogo Ritrovo</em>'.
     * @see it.caicividale.scuola.emf.model.LezionePratica#getLuogoRitrovo()
     * @see #getLezionePratica()
     * @generated
     */
    EAttribute getLezionePratica_LuogoRitrovo();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.LezionePratica#getSquadre <em>Squadre</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Squadre</em>'.
     * @see it.caicividale.scuola.emf.model.LezionePratica#getSquadre()
     * @see #getLezionePratica()
     * @generated
     */
    EReference getLezionePratica_Squadre();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Istruttore <em>Istruttore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Istruttore</em>'.
     * @see it.caicividale.scuola.emf.model.Istruttore
     * @generated
     */
    EClass getIstruttore();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Istruttore#getTitolo <em>Titolo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Titolo</em>'.
     * @see it.caicividale.scuola.emf.model.Istruttore#getTitolo()
     * @see #getIstruttore()
     * @generated
     */
    EAttribute getIstruttore_Titolo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Istruttore#getIsAttivo <em>Is Attivo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Attivo</em>'.
     * @see it.caicividale.scuola.emf.model.Istruttore#getIsAttivo()
     * @see #getIstruttore()
     * @generated
     */
    EAttribute getIstruttore_IsAttivo();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Squadra <em>Squadra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Squadra</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra
     * @generated
     */
    EClass getSquadra();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.Squadra#getCapoSquadra <em>Capo Squadra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Capo Squadra</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra#getCapoSquadra()
     * @see #getSquadra()
     * @generated
     */
    EReference getSquadra_CapoSquadra();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Squadra#getAllieviInSquadra <em>Allievi In Squadra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Allievi In Squadra</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra#getAllieviInSquadra()
     * @see #getSquadra()
     * @generated
     */
    EReference getSquadra_AllieviInSquadra();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Squadra#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra#getId()
     * @see #getSquadra()
     * @generated
     */
    EAttribute getSquadra_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Squadra#getNome <em>Nome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nome</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra#getNome()
     * @see #getSquadra()
     * @generated
     */
    EAttribute getSquadra_Nome();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Squadra#getStaffSquadra <em>Staff Squadra</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Staff Squadra</em>'.
     * @see it.caicividale.scuola.emf.model.Squadra#getStaffSquadra()
     * @see #getSquadra()
     * @generated
     */
    EReference getSquadra_StaffSquadra();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Bilancio <em>Bilancio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bilancio</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio
     * @generated
     */
    EClass getBilancio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getId()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_Id();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Bilancio#getVociDiSpesa <em>Voci Di Spesa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Voci Di Spesa</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getVociDiSpesa()
     * @see #getBilancio()
     * @generated
     */
    EReference getBilancio_VociDiSpesa();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getNota <em>Nota</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nota</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getNota()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_Nota();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrate <em>Totale Entrate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Entrate</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrate()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_TotaleEntrate();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleUscite <em>Totale Uscite</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Uscite</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getTotaleUscite()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_TotaleUscite();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleIscrizioni <em>Totale Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Iscrizioni</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getTotaleIscrizioni()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_TotaleIscrizioni();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrateConIscrizioni <em>Totale Entrate Con Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale Entrate Con Iscrizioni</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrateConIscrizioni()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_TotaleEntrateConIscrizioni();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Bilancio#getAvanzoCorso <em>Avanzo Corso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Avanzo Corso</em>'.
     * @see it.caicividale.scuola.emf.model.Bilancio#getAvanzoCorso()
     * @see #getBilancio()
     * @generated
     */
    EAttribute getBilancio_AvanzoCorso();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.Cassa <em>Cassa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cassa</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa
     * @generated
     */
    EClass getCassa();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Cassa#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa#getId()
     * @see #getCassa()
     * @generated
     */
    EAttribute getCassa_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Cassa#getTotale <em>Totale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Totale</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa#getTotale()
     * @see #getCassa()
     * @generated
     */
    EAttribute getCassa_Totale();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.Cassa#getRipartizioniCassa <em>Ripartizioni Cassa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ripartizioni Cassa</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa#getRipartizioniCassa()
     * @see #getCassa()
     * @generated
     */
    EReference getCassa_RipartizioniCassa();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Cassa#getNota <em>Nota</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nota</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa#getNota()
     * @see #getCassa()
     * @generated
     */
    EAttribute getCassa_Nota();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.Cassa#getDifferenzaTotaleCasseEAvanzo <em>Differenza Totale Casse EAvanzo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Differenza Totale Casse EAvanzo</em>'.
     * @see it.caicividale.scuola.emf.model.Cassa#getDifferenzaTotaleCasseEAvanzo()
     * @see #getCassa()
     * @generated
     */
    EAttribute getCassa_DifferenzaTotaleCasseEAvanzo();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.RipartizioneCassa <em>Ripartizione Cassa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ripartizione Cassa</em>'.
     * @see it.caicividale.scuola.emf.model.RipartizioneCassa
     * @generated
     */
    EClass getRipartizioneCassa();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getSede <em>Sede</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sede</em>'.
     * @see it.caicividale.scuola.emf.model.RipartizioneCassa#getSede()
     * @see #getRipartizioneCassa()
     * @generated
     */
    EAttribute getRipartizioneCassa_Sede();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getQuota <em>Quota</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota</em>'.
     * @see it.caicividale.scuola.emf.model.RipartizioneCassa#getQuota()
     * @see #getRipartizioneCassa()
     * @generated
     */
    EAttribute getRipartizioneCassa_Quota();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.RipartizioneCassa#getId()
     * @see #getRipartizioneCassa()
     * @generated
     */
    EAttribute getRipartizioneCassa_Id();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.PresenzaLezione <em>Presenza Lezione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Presenza Lezione</em>'.
     * @see it.caicividale.scuola.emf.model.PresenzaLezione
     * @generated
     */
    EClass getPresenzaLezione();

    /**
     * Returns the meta object for the reference list '{@link it.caicividale.scuola.emf.model.PresenzaLezione#getAllieviPresenti <em>Allievi Presenti</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Allievi Presenti</em>'.
     * @see it.caicividale.scuola.emf.model.PresenzaLezione#getAllieviPresenti()
     * @see #getPresenzaLezione()
     * @generated
     */
    EReference getPresenzaLezione_AllieviPresenti();

    /**
     * Returns the meta object for the reference list '{@link it.caicividale.scuola.emf.model.PresenzaLezione#getIstruttoriPresenti <em>Istruttori Presenti</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Istruttori Presenti</em>'.
     * @see it.caicividale.scuola.emf.model.PresenzaLezione#getIstruttoriPresenti()
     * @see #getPresenzaLezione()
     * @generated
     */
    EReference getPresenzaLezione_IstruttoriPresenti();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.PresenzaLezione#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.PresenzaLezione#getId()
     * @see #getPresenzaLezione()
     * @generated
     */
    EAttribute getPresenzaLezione_Id();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.DizMateriale <em>Diz Materiale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diz Materiale</em>'.
     * @see it.caicividale.scuola.emf.model.DizMateriale
     * @generated
     */
    EClass getDizMateriale();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizMateriale#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.DizMateriale#getId()
     * @see #getDizMateriale()
     * @generated
     */
    EAttribute getDizMateriale_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizMateriale#getNome <em>Nome</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nome</em>'.
     * @see it.caicividale.scuola.emf.model.DizMateriale#getNome()
     * @see #getDizMateriale()
     * @generated
     */
    EAttribute getDizMateriale_Nome();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizMateriale#getNota <em>Nota</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nota</em>'.
     * @see it.caicividale.scuola.emf.model.DizMateriale#getNota()
     * @see #getDizMateriale()
     * @generated
     */
    EAttribute getDizMateriale_Nota();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizMateriale#getQuotaNoleggio <em>Quota Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quota Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.DizMateriale#getQuotaNoleggio()
     * @see #getDizMateriale()
     * @generated
     */
    EAttribute getDizMateriale_QuotaNoleggio();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato <em>Materiale Noleggiato</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Materiale Noleggiato</em>'.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato
     * @generated
     */
    EClass getMaterialeNoleggiato();

    /**
     * Returns the meta object for the containment reference '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Materiale</em>'.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato#getMateriale()
     * @see #getMaterialeNoleggiato()
     * @generated
     */
    EReference getMaterialeNoleggiato_Materiale();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Quantita</em>'.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato#getQuantita()
     * @see #getMaterialeNoleggiato()
     * @generated
     */
    EAttribute getMaterialeNoleggiato_Quantita();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Noleggio</em>'.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato#getDataNoleggio()
     * @see #getMaterialeNoleggiato()
     * @generated
     */
    EAttribute getMaterialeNoleggiato_DataNoleggio();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.MaterialeNoleggiato#getId()
     * @see #getMaterialeNoleggiato()
     * @generated
     */
    EAttribute getMaterialeNoleggiato_Id();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.VoceDiSpesa <em>Voce Di Spesa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Voce Di Spesa</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa
     * @generated
     */
    EClass getVoceDiSpesa();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTitolo <em>Titolo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Titolo</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getTitolo()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Titolo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getValore <em>Valore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Valore</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getValore()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Valore();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTipo <em>Tipo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tipo</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getTipo()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Tipo();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getId()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getNota <em>Nota</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nota</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getNota()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Nota();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see it.caicividale.scuola.emf.model.VoceDiSpesa#getData()
     * @see #getVoceDiSpesa()
     * @generated
     */
    EAttribute getVoceDiSpesa_Data();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.ElencoCorsi <em>Elenco Corsi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elenco Corsi</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoCorsi
     * @generated
     */
    EClass getElencoCorsi();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.ElencoCorsi#getElencoCorsi <em>Elenco Corsi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elenco Corsi</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoCorsi#getElencoCorsi()
     * @see #getElencoCorsi()
     * @generated
     */
    EReference getElencoCorsi_ElencoCorsi();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.ElencoIscrizioni <em>Elenco Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elenco Iscrizioni</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoIscrizioni
     * @generated
     */
    EClass getElencoIscrizioni();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.ElencoIscrizioni#getElencoIscrizioni <em>Elenco Iscrizioni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elenco Iscrizioni</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoIscrizioni#getElencoIscrizioni()
     * @see #getElencoIscrizioni()
     * @generated
     */
    EReference getElencoIscrizioni_ElencoIscrizioni();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.ElencoMateriali <em>Elenco Materiali</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elenco Materiali</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoMateriali
     * @generated
     */
    EClass getElencoMateriali();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.ElencoMateriali#getElencoMateriali <em>Elenco Materiali</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elenco Materiali</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoMateriali#getElencoMateriali()
     * @see #getElencoMateriali()
     * @generated
     */
    EReference getElencoMateriali_ElencoMateriali();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.ElencoIstruttori <em>Elenco Istruttori</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elenco Istruttori</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoIstruttori
     * @generated
     */
    EClass getElencoIstruttori();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.ElencoIstruttori#getElencoIstruttori <em>Elenco Istruttori</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elenco Istruttori</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoIstruttori#getElencoIstruttori()
     * @see #getElencoIstruttori()
     * @generated
     */
    EReference getElencoIstruttori_ElencoIstruttori();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.DizComune <em>Diz Comune</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diz Comune</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune
     * @generated
     */
    EClass getDizComune();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getId()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Id();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getComune <em>Comune</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Comune</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getComune()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Comune();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getProvincia <em>Provincia</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Provincia</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getProvincia()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Provincia();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getSigla <em>Sigla</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sigla</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getSigla()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Sigla();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getRegione <em>Regione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Regione</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getRegione()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Regione();

    /**
     * Returns the meta object for the attribute '{@link it.caicividale.scuola.emf.model.DizComune#getCap <em>Cap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cap</em>'.
     * @see it.caicividale.scuola.emf.model.DizComune#getCap()
     * @see #getDizComune()
     * @generated
     */
    EAttribute getDizComune_Cap();

    /**
     * Returns the meta object for class '{@link it.caicividale.scuola.emf.model.ElencoComuni <em>Elenco Comuni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elenco Comuni</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoComuni
     * @generated
     */
    EClass getElencoComuni();

    /**
     * Returns the meta object for the containment reference list '{@link it.caicividale.scuola.emf.model.ElencoComuni#getElencoComuni <em>Elenco Comuni</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elenco Comuni</em>'.
     * @see it.caicividale.scuola.emf.model.ElencoComuni#getElencoComuni()
     * @see #getElencoComuni()
     * @generated
     */
    EReference getElencoComuni_ElencoComuni();

    /**
     * Returns the meta object for enum '{@link it.caicividale.scuola.emf.model.ESesso <em>ESesso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ESesso</em>'.
     * @see it.caicividale.scuola.emf.model.ESesso
     * @generated
     */
    EEnum getESesso();

    /**
     * Returns the meta object for enum '{@link it.caicividale.scuola.emf.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ETitolo Istruttore</em>'.
     * @see it.caicividale.scuola.emf.model.ETitoloIstruttore
     * @generated
     */
    EEnum getETitoloIstruttore();

    /**
     * Returns the meta object for enum '{@link it.caicividale.scuola.emf.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Tipo Esito Valutazione</em>'.
     * @see it.caicividale.scuola.emf.model.TipoEsitoValutazione
     * @generated
     */
    EEnum getTipoEsitoValutazione();

    /**
     * Returns the meta object for enum '{@link it.caicividale.scuola.emf.model.ESiglaCorso <em>ESigla Corso</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ESigla Corso</em>'.
     * @see it.caicividale.scuola.emf.model.ESiglaCorso
     * @generated
     */
    EEnum getESiglaCorso();

    /**
     * Returns the meta object for enum '{@link it.caicividale.scuola.emf.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>ETipo Voce Di Spesa</em>'.
     * @see it.caicividale.scuola.emf.model.ETipoVoceDiSpesa
     * @generated
     */
    EEnum getETipoVoceDiSpesa();

    /**
     * Returns the meta object for data type '{@link it.caicividale.scuola.emf.model.valueobject.NumeroCellulare <em>Numero Cellulare</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Numero Cellulare</em>'.
     * @see it.caicividale.scuola.emf.model.valueobject.NumeroCellulare
     * @model instanceClass="it.caicividale.scuola.emf.model.valueobject.NumeroCellulare"
     * @generated
     */
    EDataType getNumeroCellulare();

    /**
     * Returns the meta object for data type '{@link it.caicividale.scuola.emf.model.valueobject.EMail <em>EMail</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>EMail</em>'.
     * @see it.caicividale.scuola.emf.model.valueobject.EMail
     * @model instanceClass="it.caicividale.scuola.emf.model.valueobject.EMail"
     * @generated
     */
    EDataType getEMail();

    /**
     * Returns the meta object for data type '{@link java.time.LocalDate <em>ELocal Date</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ELocal Date</em>'.
     * @see java.time.LocalDate
     * @model instanceClass="java.time.LocalDate"
     * @generated
     */
    EDataType getELocalDate();

    /**
     * Returns the meta object for data type '{@link java.time.LocalDateTime <em>ELocal Date Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>ELocal Date Time</em>'.
     * @see java.time.LocalDateTime
     * @model instanceClass="java.time.LocalDateTime"
     * @generated
     */
    EDataType getELocalDateTime();

    /**
     * Returns the meta object for data type '{@link lombok.EqualsAndHashCode <em>Equals And Hash Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Equals And Hash Code</em>'.
     * @see lombok.EqualsAndHashCode
     * @model instanceClass="lombok.EqualsAndHashCode"
     * @generated
     */
    EDataType getEqualsAndHashCode();

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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.PersonaImpl <em>Persona</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.PersonaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getPersona()
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
		 * The meta object literal for the '<em><b>Nascita Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute PERSONA__NASCITA_DATA = eINSTANCE.getPersona_NascitaData();

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
		 * The meta object literal for the '<em><b>Comune Residenza</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference PERSONA__COMUNE_RESIDENZA = eINSTANCE.getPersona_ComuneResidenza();

	/**
		 * The meta object literal for the '<em><b>Comune Nascita</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference PERSONA__COMUNE_NASCITA = eINSTANCE.getPersona_ComuneNascita();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.AllievoImpl <em>Allievo</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.AllievoImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getAllievo()
		 * @generated
		 */
	EClass ALLIEVO = eINSTANCE.getAllievo();

	/**
		 * The meta object literal for the '<em><b>Is Diploma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute ALLIEVO__IS_DIPLOMA = eINSTANCE.getAllievo_IsDiploma();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.CorsoImpl <em>Corso</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.CorsoImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getCorso()
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
		 * The meta object literal for the '<em><b>Is Modulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute CORSO__IS_MODULO = eINSTANCE.getCorso_IsModulo();

	/**
		 * The meta object literal for the '<em><b>Direttore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__DIRETTORE = eINSTANCE.getCorso_Direttore();

	/**
		 * The meta object literal for the '<em><b>Vice Direttore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__VICE_DIRETTORE = eINSTANCE.getCorso_ViceDirettore();

	/**
		 * The meta object literal for the '<em><b>Segretario</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Bilancio</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Cassa</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__CASSA = eINSTANCE.getCorso_Cassa();

	/**
		 * The meta object literal for the '<em><b>Iscrizioni</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Staff Istruttori</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>List Riepilogo Noleggio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute CORSO__LIST_RIEPILOGO_NOLEGGIO = eINSTANCE.getCorso_ListRiepilogoNoleggio();

	/**
		 * The meta object literal for the '<em><b>Moduli</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__MODULI = eINSTANCE.getCorso_Moduli();

	/**
		 * The meta object literal for the '<em><b>Lezioni Pratiche</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__LEZIONI_PRATICHE = eINSTANCE.getCorso_LezioniPratiche();

	/**
		 * The meta object literal for the '<em><b>Lezioni Teoriche</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CORSO__LEZIONI_TEORICHE = eINSTANCE.getCorso_LezioniTeoriche();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.IscrizioneImpl <em>Iscrizione</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.IscrizioneImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getIscrizione()
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
		 * The meta object literal for the '<em><b>Materiali Noleggiati</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ISCRIZIONE__MATERIALI_NOLEGGIATI = eINSTANCE.getIscrizione_MaterialiNoleggiati();

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
		 * The meta object literal for the '<em><b>Allievo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ISCRIZIONE__ALLIEVO = eINSTANCE.getIscrizione_Allievo();

	/**
		 * The meta object literal for the '<em><b>Data Fine Corso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute ISCRIZIONE__DATA_FINE_CORSO = eINSTANCE.getIscrizione_DataFineCorso();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.LezioneImpl <em>Lezione</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.LezioneImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezione()
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
		 * The meta object literal for the '<em><b>Presenza Lezione</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.LezioneTeoricaImpl <em>Lezione Teorica</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.LezioneTeoricaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezioneTeorica()
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.LezionePraticaImpl <em>Lezione Pratica</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.LezionePraticaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getLezionePratica()
		 * @generated
		 */
	EClass LEZIONE_PRATICA = eINSTANCE.getLezionePratica();

	/**
		 * The meta object literal for the '<em><b>Luogo Ritrovo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute LEZIONE_PRATICA__LUOGO_RITROVO = eINSTANCE.getLezionePratica_LuogoRitrovo();

	/**
		 * The meta object literal for the '<em><b>Squadre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference LEZIONE_PRATICA__SQUADRE = eINSTANCE.getLezionePratica_Squadre();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.IstruttoreImpl <em>Istruttore</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.IstruttoreImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getIstruttore()
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
		 * The meta object literal for the '<em><b>Is Attivo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute ISTRUTTORE__IS_ATTIVO = eINSTANCE.getIstruttore_IsAttivo();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.SquadraImpl <em>Squadra</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.SquadraImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getSquadra()
		 * @generated
		 */
	EClass SQUADRA = eINSTANCE.getSquadra();

	/**
		 * The meta object literal for the '<em><b>Capo Squadra</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference SQUADRA__CAPO_SQUADRA = eINSTANCE.getSquadra_CapoSquadra();

	/**
		 * The meta object literal for the '<em><b>Allievi In Squadra</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute SQUADRA__NOME = eINSTANCE.getSquadra_Nome();

	/**
		 * The meta object literal for the '<em><b>Staff Squadra</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference SQUADRA__STAFF_SQUADRA = eINSTANCE.getSquadra_StaffSquadra();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.BilancioImpl <em>Bilancio</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.BilancioImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getBilancio()
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
		 * The meta object literal for the '<em><b>Voci Di Spesa</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.CassaImpl <em>Cassa</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.CassaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getCassa()
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
		 * The meta object literal for the '<em><b>Ripartizioni Cassa</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference CASSA__RIPARTIZIONI_CASSA = eINSTANCE.getCassa_RipartizioniCassa();

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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl <em>Ripartizione Cassa</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.RipartizioneCassaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getRipartizioneCassa()
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl <em>Presenza Lezione</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.PresenzaLezioneImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getPresenzaLezione()
		 * @generated
		 */
	EClass PRESENZA_LEZIONE = eINSTANCE.getPresenzaLezione();

	/**
		 * The meta object literal for the '<em><b>Allievi Presenti</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference PRESENZA_LEZIONE__ALLIEVI_PRESENTI = eINSTANCE.getPresenzaLezione_AllieviPresenti();

	/**
		 * The meta object literal for the '<em><b>Istruttori Presenti</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference PRESENZA_LEZIONE__ISTRUTTORI_PRESENTI = eINSTANCE.getPresenzaLezione_IstruttoriPresenti();

	/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute PRESENZA_LEZIONE__ID = eINSTANCE.getPresenzaLezione_Id();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl <em>Diz Materiale</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.DizMaterialeImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getDizMateriale()
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl <em>Materiale Noleggiato</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.MaterialeNoleggiatoImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getMaterialeNoleggiato()
		 * @generated
		 */
	EClass MATERIALE_NOLEGGIATO = eINSTANCE.getMaterialeNoleggiato();

	/**
		 * The meta object literal for the '<em><b>Materiale</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl <em>Voce Di Spesa</em>}' class.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getVoceDiSpesa()
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
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.ElencoCorsiImpl <em>Elenco Corsi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.ElencoCorsiImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoCorsi()
		 * @generated
		 */
	EClass ELENCO_CORSI = eINSTANCE.getElencoCorsi();

	/**
		 * The meta object literal for the '<em><b>Elenco Corsi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ELENCO_CORSI__ELENCO_CORSI = eINSTANCE.getElencoCorsi_ElencoCorsi();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.ElencoIscrizioniImpl <em>Elenco Iscrizioni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.ElencoIscrizioniImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoIscrizioni()
		 * @generated
		 */
	EClass ELENCO_ISCRIZIONI = eINSTANCE.getElencoIscrizioni();

	/**
		 * The meta object literal for the '<em><b>Elenco Iscrizioni</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ELENCO_ISCRIZIONI__ELENCO_ISCRIZIONI = eINSTANCE.getElencoIscrizioni_ElencoIscrizioni();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.ElencoMaterialiImpl <em>Elenco Materiali</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.ElencoMaterialiImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoMateriali()
		 * @generated
		 */
	EClass ELENCO_MATERIALI = eINSTANCE.getElencoMateriali();

	/**
		 * The meta object literal for the '<em><b>Elenco Materiali</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ELENCO_MATERIALI__ELENCO_MATERIALI = eINSTANCE.getElencoMateriali_ElencoMateriali();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.ElencoIstruttoriImpl <em>Elenco Istruttori</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.ElencoIstruttoriImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoIstruttori()
		 * @generated
		 */
	EClass ELENCO_ISTRUTTORI = eINSTANCE.getElencoIstruttori();

	/**
		 * The meta object literal for the '<em><b>Elenco Istruttori</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ELENCO_ISTRUTTORI__ELENCO_ISTRUTTORI = eINSTANCE.getElencoIstruttori_ElencoIstruttori();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.DizComuneImpl <em>Diz Comune</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.DizComuneImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getDizComune()
		 * @generated
		 */
	EClass DIZ_COMUNE = eINSTANCE.getDizComune();

	/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__ID = eINSTANCE.getDizComune_Id();

	/**
		 * The meta object literal for the '<em><b>Comune</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__COMUNE = eINSTANCE.getDizComune_Comune();

	/**
		 * The meta object literal for the '<em><b>Provincia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__PROVINCIA = eINSTANCE.getDizComune_Provincia();

	/**
		 * The meta object literal for the '<em><b>Sigla</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__SIGLA = eINSTANCE.getDizComune_Sigla();

	/**
		 * The meta object literal for the '<em><b>Regione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__REGIONE = eINSTANCE.getDizComune_Regione();

	/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EAttribute DIZ_COMUNE__CAP = eINSTANCE.getDizComune_Cap();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.impl.ElencoComuniImpl <em>Elenco Comuni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.impl.ElencoComuniImpl
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getElencoComuni()
		 * @generated
		 */
	EClass ELENCO_COMUNI = eINSTANCE.getElencoComuni();

	/**
		 * The meta object literal for the '<em><b>Elenco Comuni</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
	EReference ELENCO_COMUNI__ELENCO_COMUNI = eINSTANCE.getElencoComuni_ElencoComuni();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.ESesso <em>ESesso</em>}' enum.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.ESesso
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getESesso()
		 * @generated
		 */
	EEnum ESESSO = eINSTANCE.getESesso();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.ETitoloIstruttore <em>ETitolo Istruttore</em>}' enum.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.ETitoloIstruttore
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getETitoloIstruttore()
		 * @generated
		 */
	EEnum ETITOLO_ISTRUTTORE = eINSTANCE.getETitoloIstruttore();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.TipoEsitoValutazione <em>Tipo Esito Valutazione</em>}' enum.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.TipoEsitoValutazione
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getTipoEsitoValutazione()
		 * @generated
		 */
	EEnum TIPO_ESITO_VALUTAZIONE = eINSTANCE.getTipoEsitoValutazione();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.ESiglaCorso <em>ESigla Corso</em>}' enum.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.ESiglaCorso
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getESiglaCorso()
		 * @generated
		 */
	EEnum ESIGLA_CORSO = eINSTANCE.getESiglaCorso();

	/**
		 * The meta object literal for the '{@link it.caicividale.scuola.emf.model.ETipoVoceDiSpesa <em>ETipo Voce Di Spesa</em>}' enum.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.ETipoVoceDiSpesa
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getETipoVoceDiSpesa()
		 * @generated
		 */
	EEnum ETIPO_VOCE_DI_SPESA = eINSTANCE.getETipoVoceDiSpesa();

	/**
		 * The meta object literal for the '<em>Numero Cellulare</em>' data type.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.valueobject.NumeroCellulare
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getNumeroCellulare()
		 * @generated
		 */
	EDataType NUMERO_CELLULARE = eINSTANCE.getNumeroCellulare();

	/**
		 * The meta object literal for the '<em>EMail</em>' data type.
		 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		 * @see it.caicividale.scuola.emf.model.valueobject.EMail
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getEMail()
		 * @generated
		 */
	EDataType EMAIL = eINSTANCE.getEMail();

	/**
		 * The meta object literal for the '<em>ELocal Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getELocalDate()
		 * @generated
		 */
	EDataType ELOCAL_DATE = eINSTANCE.getELocalDate();

	/**
		 * The meta object literal for the '<em>ELocal Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDateTime
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getELocalDateTime()
		 * @generated
		 */
	EDataType ELOCAL_DATE_TIME = eINSTANCE.getELocalDateTime();

	/**
		 * The meta object literal for the '<em>Equals And Hash Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lombok.EqualsAndHashCode
		 * @see it.caicividale.scuola.emf.model.impl.ModelPackageImpl#getEqualsAndHashCode()
		 * @generated
		 */
	EDataType EQUALS_AND_HASH_CODE = eINSTANCE.getEqualsAndHashCode();

    }

} //ModelPackage
