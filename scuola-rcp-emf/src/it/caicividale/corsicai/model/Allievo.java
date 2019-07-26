/**
 */
package it.caicividale.corsicai.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allievo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Allievo#getValutazioni <em>Valutazioni</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getAllievo()
 * @model
 * @generated
 */
public interface Allievo extends Persona {
	/**
	 * Returns the value of the '<em><b>Valutazioni</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Valutazione}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valutazioni</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getAllievo_Valutazioni()
	 * @model
	 * @generated
	 */
	EList<Valutazione> getValutazioni();

} // Allievo
