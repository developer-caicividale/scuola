/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import java.time.LocalDate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getAnno <em>Anno</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getQuotaIscrizione <em>Quota Iscrizione</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getQuotaCaparra <em>Quota Caparra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getIsModulo <em>Is Modulo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getDirettore <em>Direttore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getViceDirettore <em>Vice Direttore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getSegretario <em>Segretario</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getTesto <em>Testo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getBilancio <em>Bilancio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getCassa <em>Cassa</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getDataInizio <em>Data Inizio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getDataFine <em>Data Fine</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getStaffIstruttori <em>Staff Istruttori</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getSigla <em>Sigla</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getEquipaggiamento <em>Equipaggiamento</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllievi <em>Numero Allievi</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneOk <em>Numero Allievi Iscrizione Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviIscrizioneKo <em>Numero Allievi Iscrizione Ko</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviNuoviIscritti <em>Numero Allievi Nuovi Iscritti</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviMaschi <em>Numero Allievi Maschi</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviFemmine <em>Numero Allievi Femmine</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getNumeroAllieviConNoleggio <em>Numero Allievi Con Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getListRiepilogoNoleggio <em>List Riepilogo Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getModuli <em>Moduli</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getLezioniPratiche <em>Lezioni Pratiche</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getLezioniTeoriche <em>Lezioni Teoriche</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getIscrizioni <em>Iscrizioni</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso()
 * @model
 * @generated
 */
public interface Corso extends EObject {
    /**
     * Returns the value of the '<em><b>Anno</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Anno</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Anno()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getAnno();

    /**
     * Returns the value of the '<em><b>Quota Iscrizione</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota Iscrizione</em>' attribute.
     * @see #setQuotaIscrizione(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_QuotaIscrizione()
     * @model required="true"
     * @generated
     */
    Float getQuotaIscrizione();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getQuotaIscrizione <em>Quota Iscrizione</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quota Iscrizione</em>' attribute.
     * @see #getQuotaIscrizione()
     * @generated
     */
    void setQuotaIscrizione(Float value);

    /**
     * Returns the value of the '<em><b>Quota Caparra</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota Caparra</em>' attribute.
     * @see #setQuotaCaparra(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_QuotaCaparra()
     * @model required="true"
     * @generated
     */
    Float getQuotaCaparra();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getQuotaCaparra <em>Quota Caparra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quota Caparra</em>' attribute.
     * @see #getQuotaCaparra()
     * @generated
     */
    void setQuotaCaparra(Float value);

    /**
     * Returns the value of the '<em><b>Is Modulo</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Modulo</em>' attribute.
     * @see #setIsModulo(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_IsModulo()
     * @model default="False" required="true"
     * @generated
     */
    Boolean getIsModulo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getIsModulo <em>Is Modulo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Modulo</em>' attribute.
     * @see #getIsModulo()
     * @generated
     */
    void setIsModulo(Boolean value);

    /**
     * Returns the value of the '<em><b>Direttore</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direttore</em>' containment reference.
     * @see #setDirettore(Istruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Direttore()
     * @model containment="true" required="true"
     * @generated
     */
    Istruttore getDirettore();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDirettore <em>Direttore</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direttore</em>' containment reference.
     * @see #getDirettore()
     * @generated
     */
    void setDirettore(Istruttore value);

    /**
     * Returns the value of the '<em><b>Vice Direttore</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vice Direttore</em>' containment reference.
     * @see #setViceDirettore(Istruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_ViceDirettore()
     * @model containment="true"
     * @generated
     */
    Istruttore getViceDirettore();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getViceDirettore <em>Vice Direttore</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vice Direttore</em>' containment reference.
     * @see #getViceDirettore()
     * @generated
     */
    void setViceDirettore(Istruttore value);

    /**
     * Returns the value of the '<em><b>Segretario</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Segretario</em>' containment reference.
     * @see #setSegretario(Persona)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Segretario()
     * @model containment="true" required="true"
     * @generated
     */
    Persona getSegretario();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getSegretario <em>Segretario</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Segretario</em>' containment reference.
     * @see #getSegretario()
     * @generated
     */
    void setSegretario(Persona value);

    /**
     * Returns the value of the '<em><b>Testo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Testo</em>' attribute.
     * @see #setTesto(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Testo()
     * @model
     * @generated
     */
    String getTesto();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getTesto <em>Testo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Testo</em>' attribute.
     * @see #getTesto()
     * @generated
     */
    void setTesto(String value);

    /**
     * Returns the value of the '<em><b>Bilancio</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilancio</em>' containment reference.
     * @see #setBilancio(Bilancio)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Bilancio()
     * @model containment="true"
     * @generated
     */
    Bilancio getBilancio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getBilancio <em>Bilancio</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bilancio</em>' containment reference.
     * @see #getBilancio()
     * @generated
     */
    void setBilancio(Bilancio value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Cassa</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cassa</em>' containment reference.
     * @see #setCassa(Cassa)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Cassa()
     * @model containment="true"
     * @generated
     */
    Cassa getCassa();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getCassa <em>Cassa</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cassa</em>' containment reference.
     * @see #getCassa()
     * @generated
     */
    void setCassa(Cassa value);

    /**
     * Returns the value of the '<em><b>Iscrizioni</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Iscrizione}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iscrizioni</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Iscrizioni()
     * @model containment="true"
     * @generated
     */
    EList<Iscrizione> getIscrizioni();

    /**
     * Returns the value of the '<em><b>Data Inizio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Inizio</em>' attribute.
     * @see #setDataInizio(LocalDate)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_DataInizio()
     * @model dataType="it.caicividale.scuola.emf.model.ELocalDate" required="true"
     * @generated
     */
    LocalDate getDataInizio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDataInizio <em>Data Inizio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Inizio</em>' attribute.
     * @see #getDataInizio()
     * @generated
     */
    void setDataInizio(LocalDate value);

    /**
     * Returns the value of the '<em><b>Data Fine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Fine</em>' attribute.
     * @see #setDataFine(LocalDate)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_DataFine()
     * @model dataType="it.caicividale.scuola.emf.model.ELocalDate" required="true"
     * @generated
     */
    LocalDate getDataFine();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDataFine <em>Data Fine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Fine</em>' attribute.
     * @see #getDataFine()
     * @generated
     */
    void setDataFine(LocalDate value);

    /**
     * Returns the value of the '<em><b>Staff Istruttori</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Istruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Staff Istruttori</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_StaffIstruttori()
     * @model containment="true"
     * @generated
     */
    EList<Istruttore> getStaffIstruttori();

    /**
     * Returns the value of the '<em><b>Nome</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nome</em>' attribute.
     * @see #setNome(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Nome()
     * @model required="true"
     * @generated
     */
    String getNome();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getNome <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nome</em>' attribute.
     * @see #getNome()
     * @generated
     */
    void setNome(String value);

    /**
     * Returns the value of the '<em><b>Sigla</b></em>' attribute.
     * The literals are from the enumeration {@link it.caicividale.scuola.emf.model.ESiglaCorso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sigla</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ESiglaCorso
     * @see #setSigla(ESiglaCorso)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Sigla()
     * @model required="true"
     * @generated
     */
    ESiglaCorso getSigla();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getSigla <em>Sigla</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sigla</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ESiglaCorso
     * @see #getSigla()
     * @generated
     */
    void setSigla(ESiglaCorso value);

    /**
     * Returns the value of the '<em><b>Equipaggiamento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipaggiamento</em>' attribute.
     * @see #setEquipaggiamento(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Equipaggiamento()
     * @model
     * @generated
     */
    String getEquipaggiamento();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getEquipaggiamento <em>Equipaggiamento</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equipaggiamento</em>' attribute.
     * @see #getEquipaggiamento()
     * @generated
     */
    void setEquipaggiamento(String value);

    /**
     * Returns the value of the '<em><b>Numero Allievi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllievi()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllievi();

    /**
     * Returns the value of the '<em><b>Numero Allievi Iscrizione Ok</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Iscrizione Ok</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviIscrizioneOk()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviIscrizioneOk();

    /**
     * Returns the value of the '<em><b>Numero Allievi Iscrizione Ko</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Iscrizione Ko</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviIscrizioneKo()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviIscrizioneKo();

    /**
     * Returns the value of the '<em><b>Numero Allievi Nuovi Iscritti</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Nuovi Iscritti</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviNuoviIscritti()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviNuoviIscritti();

    /**
     * Returns the value of the '<em><b>Numero Allievi Maschi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Maschi</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviMaschi()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviMaschi();

    /**
     * Returns the value of the '<em><b>Numero Allievi Femmine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Femmine</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviFemmine()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviFemmine();

    /**
     * Returns the value of the '<em><b>Numero Allievi Con Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Numero Allievi Con Noleggio</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_NumeroAllieviConNoleggio()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Integer getNumeroAllieviConNoleggio();

    /**
     * Returns the value of the '<em><b>List Riepilogo Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Riepilogo Noleggio</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_ListRiepilogoNoleggio()
     * @model unique="false" many="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList getListRiepilogoNoleggio();

    /**
     * Returns the value of the '<em><b>Moduli</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Corso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Moduli</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Moduli()
     * @model containment="true"
     * @generated
     */
    EList<Corso> getModuli();

    /**
     * Returns the value of the '<em><b>Lezioni Pratiche</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.LezionePratica}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lezioni Pratiche</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_LezioniPratiche()
     * @model containment="true"
     * @generated
     */
    EList<LezionePratica> getLezioniPratiche();

    /**
     * Returns the value of the '<em><b>Lezioni Teoriche</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.LezioneTeorica}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lezioni Teoriche</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_LezioniTeoriche()
     * @model containment="true"
     * @generated
     */
    EList<LezioneTeorica> getLezioniTeoriche();

} // Corso
