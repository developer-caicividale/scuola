/**
 */
package it.caicividale.corsicai.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lezione Teorica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.LezioneTeorica#getDocente <em>Docente</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getLezioneTeorica()
 * @model
 * @generated
 */
public interface LezioneTeorica extends Lezione {
	/**
	 * Returns the value of the '<em><b>Docente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docente</em>' attribute.
	 * @see #setDocente(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getLezioneTeorica_Docente()
	 * @model
	 * @generated
	 */
	String getDocente();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.LezioneTeorica#getDocente <em>Docente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docente</em>' attribute.
	 * @see #getDocente()
	 * @generated
	 */
	void setDocente(String value);

} // LezioneTeorica
