/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Documento#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Documento#getDocumento <em>Documento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Documento#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getDocumento()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Documento extends ExternalizableEObject {
	/**
	 * Returns the value of the '<em><b>Tipo Documento</b></em>' attribute.
	 * The literals are from the enumeration {@link it.caicividale.corsicai.model.ETipoDocumento}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Documento</em>' attribute.
	 * @see it.caicividale.corsicai.model.ETipoDocumento
	 * @see #setTipoDocumento(ETipoDocumento)
	 * @see it.caicividale.corsicai.model.ModelPackage#getDocumento_TipoDocumento()
	 * @model required="true"
	 * @generated
	 */
	ETipoDocumento getTipoDocumento();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Documento#getTipoDocumento <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Documento</em>' attribute.
	 * @see it.caicividale.corsicai.model.ETipoDocumento
	 * @see #getTipoDocumento()
	 * @generated
	 */
	void setTipoDocumento(ETipoDocumento value);

	/**
	 * Returns the value of the '<em><b>Documento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documento</em>' attribute.
	 * @see #setDocumento(byte[])
	 * @see it.caicividale.corsicai.model.ModelPackage#getDocumento_Documento()
	 * @model
	 * @generated
	 */
	byte[] getDocumento();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Documento#getDocumento <em>Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documento</em>' attribute.
	 * @see #getDocumento()
	 * @generated
	 */
	void setDocumento(byte[] value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see it.caicividale.corsicai.model.ModelPackage#getDocumento_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Documento#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // Documento
