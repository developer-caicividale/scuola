/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Corsi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.ElencoCorsi#getElencoCorsi <em>Elenco Corsi</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoCorsi()
 * @model
 * @generated
 */
public interface ElencoCorsi extends EObject {
    /**
     * Returns the value of the '<em><b>Elenco Corsi</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Corso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Corsi</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoCorsi_ElencoCorsi()
     * @model containment="true"
     * @generated
     */
    EList<Corso> getElencoCorsi();

} // ElencoCorsi
