/**
 */
package it.caicividale.scuola.emf.model;

import it.caicividale.scuola.emf.model.root.ExternalizableEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diz Materiale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.DizMateriale#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizMateriale#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizMateriale#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.DizMateriale#getQuotaNoleggio <em>Quota Noleggio</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getDizMateriale()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface DizMateriale extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizMateriale_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizMateriale#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Nome</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nome</em>' attribute.
     * @see #setNome(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizMateriale_Nome()
     * @model required="true"
     * @generated
     */
    String getNome();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizMateriale#getNome <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nome</em>' attribute.
     * @see #getNome()
     * @generated
     */
    void setNome(String value);

    /**
     * Returns the value of the '<em><b>Nota</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nota</em>' attribute.
     * @see #setNota(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizMateriale_Nota()
     * @model
     * @generated
     */
    String getNota();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizMateriale#getNota <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nota</em>' attribute.
     * @see #getNota()
     * @generated
     */
    void setNota(String value);

    /**
     * Returns the value of the '<em><b>Quota Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota Noleggio</em>' attribute.
     * @see #setQuotaNoleggio(float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getDizMateriale_QuotaNoleggio()
     * @model required="true"
     * @generated
     */
    float getQuotaNoleggio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.DizMateriale#getQuotaNoleggio <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quota Noleggio</em>' attribute.
     * @see #getQuotaNoleggio()
     * @generated
     */
    void setQuotaNoleggio(float value);

} // DizMateriale
