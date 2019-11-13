/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Squadra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Squadra#getCapoSquadra <em>Capo Squadra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Squadra#getAllieviInSquadra <em>Allievi In Squadra</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Squadra#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Squadra#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Squadra#getStaffSquadra <em>Staff Squadra</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra()
 * @model
 * @generated
 */
public interface Squadra extends EObject {
    /**
     * Returns the value of the '<em><b>Capo Squadra</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capo Squadra</em>' containment reference.
     * @see #setCapoSquadra(Istruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra_CapoSquadra()
     * @model containment="true" required="true"
     * @generated
     */
    Istruttore getCapoSquadra();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Squadra#getCapoSquadra <em>Capo Squadra</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capo Squadra</em>' containment reference.
     * @see #getCapoSquadra()
     * @generated
     */
    void setCapoSquadra(Istruttore value);

    /**
     * Returns the value of the '<em><b>Allievi In Squadra</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Allievo}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allievi In Squadra</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra_AllieviInSquadra()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Allievo> getAllieviInSquadra();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Squadra#getId <em>Id</em>}' attribute.
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
     * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra_Nome()
     * @model
     * @generated
     */
    String getNome();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Squadra#getNome <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nome</em>' attribute.
     * @see #getNome()
     * @generated
     */
    void setNome(String value);

    /**
     * Returns the value of the '<em><b>Staff Squadra</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Istruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Staff Squadra</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getSquadra_StaffSquadra()
     * @model containment="true"
     * @generated
     */
    EList<Istruttore> getStaffSquadra();

} // Squadra
