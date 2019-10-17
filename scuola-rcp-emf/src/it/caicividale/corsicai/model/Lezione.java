/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lezione</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getDataSvolgimento <em>Data Svolgimento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getLuogoSvolgimento <em>Luogo Svolgimento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getDurata <em>Durata</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getPresenzaLezione <em>Presenza Lezione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Lezione#getArgomentiTrattati <em>Argomenti Trattati</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getLezione()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Lezione extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Titolo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Titolo</em>' attribute.
     * @see #setTitolo(String)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_Titolo()
     * @model required="true"
     * @generated
     */
    String getTitolo();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getTitolo <em>Titolo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Titolo</em>' attribute.
     * @see #getTitolo()
     * @generated
     */
    void setTitolo(String value);

    /**
     * Returns the value of the '<em><b>Data Svolgimento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Svolgimento</em>' attribute.
     * @see #setDataSvolgimento(Date)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_DataSvolgimento()
     * @model
     * @generated
     */
    Date getDataSvolgimento();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getDataSvolgimento <em>Data Svolgimento</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Svolgimento</em>' attribute.
     * @see #getDataSvolgimento()
     * @generated
     */
    void setDataSvolgimento(Date value);

    /**
     * Returns the value of the '<em><b>Luogo Svolgimento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Luogo Svolgimento</em>' attribute.
     * @see #setLuogoSvolgimento(String)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_LuogoSvolgimento()
     * @model
     * @generated
     */
    String getLuogoSvolgimento();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getLuogoSvolgimento <em>Luogo Svolgimento</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Luogo Svolgimento</em>' attribute.
     * @see #getLuogoSvolgimento()
     * @generated
     */
    void setLuogoSvolgimento(String value);

    /**
     * Returns the value of the '<em><b>Durata</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Durata</em>' attribute.
     * @see #setDurata(Float)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_Durata()
     * @model
     * @generated
     */
    Float getDurata();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getDurata <em>Durata</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Durata</em>' attribute.
     * @see #getDurata()
     * @generated
     */
    void setDurata(Float value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Presenza Lezione</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Presenza Lezione</em>' reference.
     * @see #setPresenzaLezione(PresenzaLezione)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_PresenzaLezione()
     * @model required="true"
     * @generated
     */
    PresenzaLezione getPresenzaLezione();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getPresenzaLezione <em>Presenza Lezione</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Presenza Lezione</em>' reference.
     * @see #getPresenzaLezione()
     * @generated
     */
    void setPresenzaLezione(PresenzaLezione value);

    /**
     * Returns the value of the '<em><b>Argomenti Trattati</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Argomenti Trattati</em>' attribute.
     * @see #setArgomentiTrattati(String)
     * @see it.caicividale.corsicai.model.ModelPackage#getLezione_ArgomentiTrattati()
     * @model required="true"
     * @generated
     */
    String getArgomentiTrattati();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Lezione#getArgomentiTrattati <em>Argomenti Trattati</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Argomenti Trattati</em>' attribute.
     * @see #getArgomentiTrattati()
     * @generated
     */
    void setArgomentiTrattati(String value);

} // Lezione
