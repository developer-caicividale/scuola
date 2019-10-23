/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import it.caicividale.scuola.emf.model.root.ExternalizableEObject;

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
 * @extends ExternalizableEObject
 * @generated
 */
public interface ElencoIscrizioni extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Elenco Iscrizioni</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Iscrizione}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Iscrizioni</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoIscrizioni_ElencoIscrizioni()
     * @model
     * @generated
     */
    EList<Iscrizione> getElencoIscrizioni();

} // ElencoIscrizioni
