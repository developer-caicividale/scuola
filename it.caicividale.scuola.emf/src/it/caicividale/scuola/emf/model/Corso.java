/**
 */
package it.caicividale.scuola.emf.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import it.caicividale.scuola.emf.model.root.ExternalizableEObject;

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
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getVicedirettore <em>Vicedirettore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getSegretario <em>Segretario</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getTesto <em>Testo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getBilancio <em>Bilancio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getCassa <em>Cassa</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getIscrizioni <em>Iscrizioni</em>}</li>
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
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getListRiepilogonoleggio <em>List Riepilogonoleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getModuli <em>Moduli</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getLezioniPratiche <em>Lezioni Pratiche</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Corso#getLezioniTeoriche <em>Lezioni Teoriche</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Corso extends ExternalizableEObject {
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
     * Returns the value of the '<em><b>Direttore</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direttore</em>' reference.
     * @see #setDirettore(Istruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Direttore()
     * @model required="true"
     * @generated
     */
    Istruttore getDirettore();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDirettore <em>Direttore</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direttore</em>' reference.
     * @see #getDirettore()
     * @generated
     */
    void setDirettore(Istruttore value);

    /**
     * Returns the value of the '<em><b>Vicedirettore</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vicedirettore</em>' reference.
     * @see #setVicedirettore(Istruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Vicedirettore()
     * @model
     * @generated
     */
    Istruttore getVicedirettore();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getVicedirettore <em>Vicedirettore</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vicedirettore</em>' reference.
     * @see #getVicedirettore()
     * @generated
     */
    void setVicedirettore(Istruttore value);

    /**
     * Returns the value of the '<em><b>Segretario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Segretario</em>' reference.
     * @see #setSegretario(Persona)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Segretario()
     * @model required="true"
     * @generated
     */
    Persona getSegretario();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getSegretario <em>Segretario</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Segretario</em>' reference.
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
     * Returns the value of the '<em><b>Bilancio</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilancio</em>' reference.
     * @see #setBilancio(Bilancio)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Bilancio()
     * @model
     * @generated
     */
    Bilancio getBilancio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getBilancio <em>Bilancio</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bilancio</em>' reference.
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
     * Returns the value of the '<em><b>Cassa</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cassa</em>' reference.
     * @see #setCassa(Cassa)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Cassa()
     * @model
     * @generated
     */
    Cassa getCassa();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getCassa <em>Cassa</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cassa</em>' reference.
     * @see #getCassa()
     * @generated
     */
    void setCassa(Cassa value);

    /**
     * Returns the value of the '<em><b>Iscrizioni</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Iscrizione}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Iscrizioni</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Iscrizioni()
     * @model
     * @generated
     */
    EList<Iscrizione> getIscrizioni();

    /**
     * Returns the value of the '<em><b>Data Inizio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Inizio</em>' attribute.
     * @see #setDataInizio(Date)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_DataInizio()
     * @model required="true"
     * @generated
     */
    Date getDataInizio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDataInizio <em>Data Inizio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Inizio</em>' attribute.
     * @see #getDataInizio()
     * @generated
     */
    void setDataInizio(Date value);

    /**
     * Returns the value of the '<em><b>Data Fine</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Fine</em>' attribute.
     * @see #setDataFine(Date)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_DataFine()
     * @model required="true"
     * @generated
     */
    Date getDataFine();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Corso#getDataFine <em>Data Fine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Fine</em>' attribute.
     * @see #getDataFine()
     * @generated
     */
    void setDataFine(Date value);

    /**
     * Returns the value of the '<em><b>Staff Istruttori</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Istruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Staff Istruttori</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_StaffIstruttori()
     * @model
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
     * Returns the value of the '<em><b>List Riepilogonoleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>List Riepilogonoleggio</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_ListRiepilogonoleggio()
     * @model unique="false" many="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList getListRiepilogonoleggio();

    /**
     * Returns the value of the '<em><b>Moduli</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Corso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Moduli</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_Moduli()
     * @model
     * @generated
     */
    EList<Corso> getModuli();

    /**
     * Returns the value of the '<em><b>Lezioni Pratiche</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.LezionePratica}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lezioni Pratiche</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_LezioniPratiche()
     * @model
     * @generated
     */
    EList<LezionePratica> getLezioniPratiche();

    /**
     * Returns the value of the '<em><b>Lezioni Teoriche</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.LezioneTeorica}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lezioni Teoriche</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCorso_LezioniTeoriche()
     * @model
     * @generated
     */
    EList<LezioneTeorica> getLezioniTeoriche();

} // Corso
