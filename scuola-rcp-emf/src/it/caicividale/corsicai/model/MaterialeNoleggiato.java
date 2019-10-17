/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materiale Noleggiato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getMaterialeNoleggiato()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface MaterialeNoleggiato extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Materiale</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Materiale</em>' reference.
     * @see #setMateriale(DizMateriale)
     * @see it.caicividale.corsicai.model.ModelPackage#getMaterialeNoleggiato_Materiale()
     * @model required="true"
     * @generated
     */
    DizMateriale getMateriale();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Materiale</em>' reference.
     * @see #getMateriale()
     * @generated
     */
    void setMateriale(DizMateriale value);

    /**
     * Returns the value of the '<em><b>Quantita</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quantita</em>' attribute.
     * @see #setQuantita(short)
     * @see it.caicividale.corsicai.model.ModelPackage#getMaterialeNoleggiato_Quantita()
     * @model required="true"
     * @generated
     */
    short getQuantita();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quantita</em>' attribute.
     * @see #getQuantita()
     * @generated
     */
    void setQuantita(short value);

    /**
     * Returns the value of the '<em><b>Data Noleggio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Noleggio</em>' attribute.
     * @see #setDataNoleggio(Date)
     * @see it.caicividale.corsicai.model.ModelPackage#getMaterialeNoleggiato_DataNoleggio()
     * @model required="true"
     * @generated
     */
    Date getDataNoleggio();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Noleggio</em>' attribute.
     * @see #getDataNoleggio()
     * @generated
     */
    void setDataNoleggio(Date value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(long)
     * @see it.caicividale.corsicai.model.ModelPackage#getMaterialeNoleggiato_Id()
     * @model id="true" required="true"
     * @generated
     */
    long getId();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.MaterialeNoleggiato#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(long value);

} // MaterialeNoleggiato
