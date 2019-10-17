/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presenza Lezione</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getAllieviPresenti <em>Allievi Presenti</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getIstruttoriPresenti <em>Istruttori Presenti</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.PresenzaLezione#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface PresenzaLezione extends ExternalizableEObject {
    /**
     * Returns the value of the '<em><b>Allievi Presenti</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.corsicai.model.Allievo}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Allievi Presenti</em>' reference list.
     * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_AllieviPresenti()
     * @model
     * @generated
     */
    EList<Allievo> getAllieviPresenti();

    /**
     * Returns the value of the '<em><b>Istruttori Presenti</b></em>' reference list.
     * The list contents are of type {@link it.caicividale.corsicai.model.Istruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Istruttori Presenti</em>' reference list.
     * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_IstruttoriPresenti()
     * @model
     * @generated
     */
    EList<Istruttore> getIstruttoriPresenti();

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(long)
     * @see it.caicividale.corsicai.model.ModelPackage#getPresenzaLezione_Id()
     * @model id="true" required="true"
     * @generated
     */
    long getId();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.PresenzaLezione#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(long value);

} // PresenzaLezione
