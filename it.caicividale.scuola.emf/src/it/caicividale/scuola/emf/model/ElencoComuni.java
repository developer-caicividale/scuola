/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Comuni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.ElencoComuni#getElencoComuni <em>Elenco Comuni</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoComuni()
 * @model
 * @generated
 */
public interface ElencoComuni extends EObject {
    /**
     * Returns the value of the '<em><b>Elenco Comuni</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.DizComune}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Comuni</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoComuni_ElencoComuni()
     * @model containment="true"
     * @generated
     */
    EList<DizComune> getElencoComuni();

} // ElencoComuni
