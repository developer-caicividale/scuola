/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Iscrizioni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.ElencoIscrizioni#getElencoIscrizioni <em>Elenco Iscrizioni</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoIscrizioni()
 * @model
 * @generated
 */
public interface ElencoIscrizioni extends EObject {
    /**
     * Returns the value of the '<em><b>Elenco Iscrizioni</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Iscrizione}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Iscrizioni</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoIscrizioni_ElencoIscrizioni()
     * @model containment="true"
     * @generated
     */
    EList<Iscrizione> getElencoIscrizioni();

} // ElencoIscrizioni
