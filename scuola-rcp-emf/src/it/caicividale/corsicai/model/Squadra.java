/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Squadra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Squadra#getCapiSquadra <em>Capi Squadra</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Squadra#getAllieviInSquadra <em>Allievi In Squadra</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Squadra#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getSquadra()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Squadra extends ExternalizableEObject {
	/**
	 * Returns the value of the '<em><b>Capi Squadra</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Istruttore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capi Squadra</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getSquadra_CapiSquadra()
	 * @model required="true"
	 * @generated
	 */
	EList<Istruttore> getCapiSquadra();

	/**
	 * Returns the value of the '<em><b>Allievi In Squadra</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Allievo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allievi In Squadra</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getSquadra_AllieviInSquadra()
	 * @model required="true"
	 * @generated
	 */
	EList<Allievo> getAllieviInSquadra();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see it.caicividale.corsicai.model.ModelPackage#getSquadra_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Squadra#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // Squadra
