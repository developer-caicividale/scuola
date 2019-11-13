/**
 */
package it.caicividale.scuola.emf.model;

import java.time.LocalDate;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Materiale Noleggiato</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getMaterialeNoleggiato()
 * @model
 * @generated
 */
public interface MaterialeNoleggiato extends EObject {
    /**
     * Returns the value of the '<em><b>Materiale</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Materiale</em>' containment reference.
     * @see #setMateriale(DizMateriale)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getMaterialeNoleggiato_Materiale()
     * @model containment="true" required="true"
     * @generated
     */
    DizMateriale getMateriale();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getMateriale <em>Materiale</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Materiale</em>' containment reference.
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
     * @see it.caicividale.scuola.emf.model.ModelPackage#getMaterialeNoleggiato_Quantita()
     * @model required="true"
     * @generated
     */
    short getQuantita();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getQuantita <em>Quantita</em>}' attribute.
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
     * @see #setDataNoleggio(LocalDate)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getMaterialeNoleggiato_DataNoleggio()
     * @model dataType="it.caicividale.scuola.emf.model.ELocalDate" required="true"
     * @generated
     */
    LocalDate getDataNoleggio();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getDataNoleggio <em>Data Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Noleggio</em>' attribute.
     * @see #getDataNoleggio()
     * @generated
     */
    void setDataNoleggio(LocalDate value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getMaterialeNoleggiato_Id()
     * @model id="true" required="true"
     * @generated
     */
    long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.MaterialeNoleggiato#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(long value);

} // MaterialeNoleggiato
