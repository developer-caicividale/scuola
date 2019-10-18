/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Iscrizioni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.ElencoIscrizioni#getElencoIscrizioni <em>Elenco Iscrizioni</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getElencoIscrizioni()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface ElencoIscrizioni extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Elenco Iscrizioni</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.corsicai.model.Iscrizione}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Iscrizioni</em>' reference list.
     * @see it.caicividale.corsicai.model.ModelPackage#getElencoIscrizioni_ElencoIscrizioni()
     * @model
     * @generated
     */
    EList<Iscrizione> getElencoIscrizioni();

} // ElencoIscrizioni
