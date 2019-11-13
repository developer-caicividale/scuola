/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cassa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Cassa#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Cassa#getTotale <em>Totale</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Cassa#getRipartizioniCassa <em>Ripartizioni Cassa</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Cassa#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Cassa#getDifferenzaTotaleCasseEAvanzo <em>Differenza Totale Casse EAvanzo</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa()
 * @model
 * @generated
 */
public interface Cassa extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa_Id()
     * @model id="true" required="true"
     * @generated
     */
    long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Cassa#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(long value);

    /**
     * Returns the value of the '<em><b>Totale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa_Totale()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getTotale();

    /**
     * Returns the value of the '<em><b>Ripartizioni Cassa</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.RipartizioneCassa}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ripartizioni Cassa</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa_RipartizioniCassa()
     * @model containment="true"
     * @generated
     */
    EList<RipartizioneCassa> getRipartizioniCassa();

    /**
     * Returns the value of the '<em><b>Nota</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nota</em>' attribute.
     * @see #setNota(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa_Nota()
     * @model
     * @generated
     */
    String getNota();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Cassa#getNota <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nota</em>' attribute.
     * @see #getNota()
     * @generated
     */
    void setNota(String value);

    /**
     * Returns the value of the '<em><b>Differenza Totale Casse EAvanzo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Differenza Totale Casse EAvanzo</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getCassa_DifferenzaTotaleCasseEAvanzo()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getDifferenzaTotaleCasseEAvanzo();

} // Cassa
