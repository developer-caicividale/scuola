/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Materiali</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.ElencoMateriali#getElencoMateriali <em>Elenco Materiali</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoMateriali()
 * @model
 * @generated
 */
public interface ElencoMateriali extends EObject {
    /**
     * Returns the value of the '<em><b>Elenco Materiali</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.DizMateriale}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Materiali</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoMateriali_ElencoMateriali()
     * @model containment="true"
     * @generated
     */
    EList<DizMateriale> getElencoMateriali();

} // ElencoMateriali
