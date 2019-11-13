/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elenco Istruttori</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.ElencoIstruttori#getElencoIstruttori <em>Elenco Istruttori</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoIstruttori()
 * @model
 * @generated
 */
public interface ElencoIstruttori extends EObject {
    /**
     * Returns the value of the '<em><b>Elenco Istruttori</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Istruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elenco Istruttori</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getElencoIstruttori_ElencoIstruttori()
     * @model containment="true"
     * @generated
     */
    EList<Istruttore> getElencoIstruttori();

} // ElencoIstruttori
