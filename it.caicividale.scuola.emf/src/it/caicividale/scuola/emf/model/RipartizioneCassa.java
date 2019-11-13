/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ripartizione Cassa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getSede <em>Sede</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getQuota <em>Quota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getRipartizioneCassa()
 * @model
 * @generated
 */
public interface RipartizioneCassa extends EObject {
    /**
     * Returns the value of the '<em><b>Sede</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sede</em>' attribute.
     * @see #setSede(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getRipartizioneCassa_Sede()
     * @model required="true"
     * @generated
     */
    String getSede();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getSede <em>Sede</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sede</em>' attribute.
     * @see #getSede()
     * @generated
     */
    void setSede(String value);

    /**
     * Returns the value of the '<em><b>Quota</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Quota</em>' attribute.
     * @see #setQuota(float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getRipartizioneCassa_Quota()
     * @model required="true"
     * @generated
     */
    float getQuota();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getQuota <em>Quota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Quota</em>' attribute.
     * @see #getQuota()
     * @generated
     */
    void setQuota(float value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getRipartizioneCassa_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.RipartizioneCassa#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

} // RipartizioneCassa
