/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diz Comune</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getComune <em>Comune</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getProvincia <em>Provincia</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getSigla <em>Sigla</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getRegione <em>Regione</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizComune#getCap <em>Cap</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune()
 * @model
 * @generated
 */
public interface DizComune extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Id()
     * @model id="true"
     * @generated
     */
    long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(long value);

    /**
     * Returns the value of the '<em><b>Comune</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comune</em>' attribute.
     * @see #setComune(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Comune()
     * @model
     * @generated
     */
    String getComune();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getComune <em>Comune</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comune</em>' attribute.
     * @see #getComune()
     * @generated
     */
    void setComune(String value);

    /**
     * Returns the value of the '<em><b>Provincia</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provincia</em>' attribute.
     * @see #setProvincia(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Provincia()
     * @model
     * @generated
     */
    String getProvincia();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getProvincia <em>Provincia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provincia</em>' attribute.
     * @see #getProvincia()
     * @generated
     */
    void setProvincia(String value);

    /**
     * Returns the value of the '<em><b>Sigla</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sigla</em>' attribute.
     * @see #setSigla(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Sigla()
     * @model
     * @generated
     */
    String getSigla();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getSigla <em>Sigla</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sigla</em>' attribute.
     * @see #getSigla()
     * @generated
     */
    void setSigla(String value);

    /**
     * Returns the value of the '<em><b>Regione</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regione</em>' attribute.
     * @see #setRegione(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Regione()
     * @model
     * @generated
     */
    String getRegione();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getRegione <em>Regione</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regione</em>' attribute.
     * @see #getRegione()
     * @generated
     */
    void setRegione(String value);

    /**
     * Returns the value of the '<em><b>Cap</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cap</em>' attribute.
     * @see #setCap(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizComune_Cap()
     * @model
     * @generated
     */
    String getCap();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizComune#getCap <em>Cap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cap</em>' attribute.
     * @see #getCap()
     * @generated
     */
    void setCap(String value);

} // DizComune
