/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Corsi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.ElencoCorsi#getElencoCorsi <em>Elenco Corsi</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getElencoCorsi()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface ElencoCorsi extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Elenco Corsi</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.corsicai.model.Corso}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Corsi</em>' reference list.
     * @see it.caicividale.corsicai.model.ModelPackage#getElencoCorsi_ElencoCorsi()
     * @model
     * @generated
     */
    EList<Corso> getElencoCorsi();

} // ElencoCorsi
