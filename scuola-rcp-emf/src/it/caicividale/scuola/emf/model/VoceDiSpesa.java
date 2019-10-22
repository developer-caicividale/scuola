/**
 */
package it.caicividale.scuola.emf.model;

import java.util.Date;

import it.caicividale.scuola.emf.model.root.ExternalizableEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voce Di Spesa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getValore <em>Valore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTipo <em>Tipo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface VoceDiSpesa extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Titolo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Titolo</em>' attribute.
     * @see #setTitolo(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Titolo()
     * @model required="true"
     * @generated
     */
    String getTitolo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTitolo <em>Titolo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Titolo</em>' attribute.
     * @see #getTitolo()
     * @generated
     */
    void setTitolo(String value);

    /**
     * Returns the value of the '<em><b>Valore</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Valore</em>' attribute.
     * @see #setValore(float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Valore()
     * @model required="true"
     * @generated
     */
    float getValore();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getValore <em>Valore</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Valore</em>' attribute.
     * @see #getValore()
     * @generated
     */
    void setValore(float value);

    /**
     * Returns the value of the '<em><b>Tipo</b></em>' attribute.
     * The literals are from the enumeration {@link it.caicividale.scuola.emf.model.ETipoVoceDiSpesa}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tipo</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ETipoVoceDiSpesa
     * @see #setTipo(ETipoVoceDiSpesa)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Tipo()
     * @model required="true"
     * @generated
     */
    ETipoVoceDiSpesa getTipo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getTipo <em>Tipo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tipo</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ETipoVoceDiSpesa
     * @see #getTipo()
     * @generated
     */
    void setTipo(ETipoVoceDiSpesa value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Nota</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nota</em>' attribute.
     * @see #setNota(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Nota()
     * @model
     * @generated
     */
    String getNota();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getNota <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nota</em>' attribute.
     * @see #getNota()
     * @generated
     */
    void setNota(String value);

    /**
     * Returns the value of the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data</em>' attribute.
     * @see #setData(Date)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getVoceDiSpesa_Data()
     * @model required="true"
     * @generated
     */
    Date getData();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.VoceDiSpesa#getData <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data</em>' attribute.
     * @see #getData()
     * @generated
     */
    void setData(Date value);

} // VoceDiSpesa
