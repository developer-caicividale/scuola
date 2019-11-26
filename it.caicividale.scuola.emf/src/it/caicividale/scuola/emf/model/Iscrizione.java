/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import java.time.LocalDate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iscrizione</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsModuloIscrizione <em>Is Modulo Iscrizione</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsConsensoInformato <em>Is Consenso Informato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsNuovoAllievo <em>Is Nuovo Allievo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getDataScadenzaCertificatoMedico <em>Data Scadenza Certificato Medico</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsBollinoAnnoCorso <em>Is Bollino Anno Corso</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getCaparra <em>Caparra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getSaldo <em>Saldo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getTotaleVersato <em>Totale Versato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getNote <em>Note</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsNoleggio <em>Is Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getMaterialeNoleggiato <em>Materiale Noleggiato</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsIscrizioneOk <em>Is Iscrizione Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggio <em>Quota Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedico <em>Is Certificato Medico</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedicoOk <em>Is Certificato Medico Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getIsQuotaVersataOk <em>Is Quota Versata Ok</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggioDaVersare <em>Quota Noleggio Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getTotaleDaVersare <em>Totale Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getDifferenzaTotaleVersatoTotaleDaVersare <em>Differenza Totale Versato Totale Da Versare</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getMessaggiErrore <em>Messaggi Errore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Iscrizione#getAllievo <em>Allievo</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione()
 * @model
 * @generated
 */
public interface Iscrizione extends EObject {
    /**
     * Returns the value of the '<em><b>Is Modulo Iscrizione</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Modulo Iscrizione</em>' attribute.
     * @see #setIsModuloIscrizione(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsModuloIscrizione()
     * @model default="False"
     * @generated
     */
    Boolean getIsModuloIscrizione();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsModuloIscrizione <em>Is Modulo Iscrizione</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Modulo Iscrizione</em>' attribute.
     * @see #getIsModuloIscrizione()
     * @generated
     */
    void setIsModuloIscrizione(Boolean value);

    /**
     * Returns the value of the '<em><b>Is Consenso Informato</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Consenso Informato</em>' attribute.
     * @see #setIsConsensoInformato(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsConsensoInformato()
     * @model default="False"
     * @generated
     */
    Boolean getIsConsensoInformato();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsConsensoInformato <em>Is Consenso Informato</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Consenso Informato</em>' attribute.
     * @see #getIsConsensoInformato()
     * @generated
     */
    void setIsConsensoInformato(Boolean value);

    /**
     * Returns the value of the '<em><b>Is Nuovo Allievo</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Nuovo Allievo</em>' attribute.
     * @see #setIsNuovoAllievo(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsNuovoAllievo()
     * @model default="False"
     * @generated
     */
    Boolean getIsNuovoAllievo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsNuovoAllievo <em>Is Nuovo Allievo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Nuovo Allievo</em>' attribute.
     * @see #getIsNuovoAllievo()
     * @generated
     */
    void setIsNuovoAllievo(Boolean value);

    /**
     * Returns the value of the '<em><b>Data Scadenza Certificato Medico</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Scadenza Certificato Medico</em>' attribute.
     * @see #setDataScadenzaCertificatoMedico(LocalDate)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_DataScadenzaCertificatoMedico()
     * @model dataType="it.caicividale.scuola.emf.model.ELocalDate"
     * @generated
     */
    LocalDate getDataScadenzaCertificatoMedico();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getDataScadenzaCertificatoMedico <em>Data Scadenza Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Scadenza Certificato Medico</em>' attribute.
     * @see #getDataScadenzaCertificatoMedico()
     * @generated
     */
    void setDataScadenzaCertificatoMedico(LocalDate value);

    /**
     * Returns the value of the '<em><b>Is Bollino Anno Corso</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Bollino Anno Corso</em>' attribute.
     * @see #setIsBollinoAnnoCorso(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsBollinoAnnoCorso()
     * @model default="False"
     * @generated
     */
    Boolean getIsBollinoAnnoCorso();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsBollinoAnnoCorso <em>Is Bollino Anno Corso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Bollino Anno Corso</em>' attribute.
     * @see #getIsBollinoAnnoCorso()
     * @generated
     */
    void setIsBollinoAnnoCorso(Boolean value);

    /**
     * Returns the value of the '<em><b>Caparra</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Caparra</em>' attribute.
     * @see #setCaparra(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_Caparra()
     * @model
     * @generated
     */
    Float getCaparra();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getCaparra <em>Caparra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Caparra</em>' attribute.
     * @see #getCaparra()
     * @generated
     */
    void setCaparra(Float value);

    /**
     * Returns the value of the '<em><b>Saldo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saldo</em>' attribute.
     * @see #setSaldo(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_Saldo()
     * @model
     * @generated
     */
    Float getSaldo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getSaldo <em>Saldo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saldo</em>' attribute.
     * @see #getSaldo()
     * @generated
     */
    void setSaldo(Float value);

    /**
     * Returns the value of the '<em><b>Totale Versato</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Versato</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_TotaleVersato()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Float getTotaleVersato();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' attribute.
     * @see #setNote(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_Note()
     * @model
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' attribute.
     * @see #getNote()
     * @generated
     */
    void setNote(String value);

    /**
     * Returns the value of the '<em><b>Is Noleggio</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Noleggio</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsNoleggio()
     * @model default="False" unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Boolean getIsNoleggio();

    /**
     * Returns the value of the '<em><b>Materiale Noleggiato</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.MaterialeNoleggiato}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Materiale Noleggiato</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_MaterialeNoleggiato()
     * @model containment="true"
     * @generated
     */
    EList<MaterialeNoleggiato> getMaterialeNoleggiato();

    /**
     * Returns the value of the '<em><b>Is Iscrizione Ok</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Iscrizione Ok</em>' attribute.
     * @see #setIsIscrizioneOk(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsIscrizioneOk()
     * @model default="False" required="true"
     * @generated
     */
    Boolean getIsIscrizioneOk();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsIscrizioneOk <em>Is Iscrizione Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Iscrizione Ok</em>' attribute.
     * @see #getIsIscrizioneOk()
     * @generated
     */
    void setIsIscrizioneOk(Boolean value);

    /**
     * Returns the value of the '<em><b>Quota Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota Noleggio</em>' attribute.
     * @see #setQuotaNoleggio(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_QuotaNoleggio()
     * @model
     * @generated
     */
    Float getQuotaNoleggio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getQuotaNoleggio <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quota Noleggio</em>' attribute.
     * @see #getQuotaNoleggio()
     * @generated
     */
    void setQuotaNoleggio(Float value);

    /**
     * Returns the value of the '<em><b>Is Certificato Medico</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Certificato Medico</em>' attribute.
     * @see #setIsCertificatoMedico(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsCertificatoMedico()
     * @model default="False"
     * @generated
     */
    Boolean getIsCertificatoMedico();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedico <em>Is Certificato Medico</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Certificato Medico</em>' attribute.
     * @see #getIsCertificatoMedico()
     * @generated
     */
    void setIsCertificatoMedico(Boolean value);

    /**
     * Returns the value of the '<em><b>Is Certificato Medico Ok</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Certificato Medico Ok</em>' attribute.
     * @see #setIsCertificatoMedicoOk(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsCertificatoMedicoOk()
     * @model default="False"
     * @generated
     */
    Boolean getIsCertificatoMedicoOk();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getIsCertificatoMedicoOk <em>Is Certificato Medico Ok</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Certificato Medico Ok</em>' attribute.
     * @see #getIsCertificatoMedicoOk()
     * @generated
     */
    void setIsCertificatoMedicoOk(Boolean value);

    /**
     * Returns the value of the '<em><b>Is Quota Versata Ok</b></em>' attribute.
     * The default value is <code>"False"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Quota Versata Ok</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_IsQuotaVersataOk()
     * @model default="False" unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Boolean getIsQuotaVersataOk();

    /**
     * Returns the value of the '<em><b>Quota Noleggio Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota Noleggio Da Versare</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_QuotaNoleggioDaVersare()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Float getQuotaNoleggioDaVersare();

    /**
     * Returns the value of the '<em><b>Totale Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Da Versare</em>' attribute.
     * @see #setTotaleDaVersare(Float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_TotaleDaVersare()
     * @model
     * @generated
     */
    Float getTotaleDaVersare();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getTotaleDaVersare <em>Totale Da Versare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Totale Da Versare</em>' attribute.
     * @see #getTotaleDaVersare()
     * @generated
     */
    void setTotaleDaVersare(Float value);

    /**
     * Returns the value of the '<em><b>Differenza Totale Versato Totale Da Versare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Differenza Totale Versato Totale Da Versare</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_DifferenzaTotaleVersatoTotaleDaVersare()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    Float getDifferenzaTotaleVersatoTotaleDaVersare();

    /**
     * Returns the value of the '<em><b>Messaggi Errore</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Messaggi Errore</em>' attribute list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_MessaggiErrore()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    EList<String> getMessaggiErrore();

    /**
     * Returns the value of the '<em><b>Allievo</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allievo</em>' containment reference.
     * @see #setAllievo(Allievo)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIscrizione_Allievo()
     * @model containment="true" required="true"
     * @generated
     */
    Allievo getAllievo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Iscrizione#getAllievo <em>Allievo</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Allievo</em>' containment reference.
     * @see #getAllievo()
     * @generated
     */
    void setAllievo(Allievo value);

} // Iscrizione
