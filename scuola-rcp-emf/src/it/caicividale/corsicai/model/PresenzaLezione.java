/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presenza Lezione</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getAllievoPresente <em>Allievo Presente</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getIstruttorePresente <em>Istruttore Presente</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface PresenzaLezione extends ExternalizableEObject {
	/**
	 * Returns the value of the '<em><b>Allievo Presente</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Allievo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allievo Presente</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_AllievoPresente()
	 * @model
	 * @generated
	 */
	EList<Allievo> getAllievoPresente();

	/**
	 * Returns the value of the '<em><b>Istruttore Presente</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Istruttore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Istruttore Presente</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_IstruttorePresente()
	 * @model
	 * @generated
	 */
	EList<Istruttore> getIstruttorePresente();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.PresenzaLezione#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

} // PresenzaLezione
