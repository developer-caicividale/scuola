/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import it.caicividale.scuola.emf.model.root.ExternalizableEObject;

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
 * @extends ExternalizableEObject
 * @generated
 */
public interface ElencoCorsi extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Elenco Corsi</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Corso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Corsi</em>' reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoCorsi_ElencoCorsi()
     * @model
     * @generated
     */
    EList<Corso> getElencoCorsi();

} // ElencoCorsi
