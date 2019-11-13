/**
 */
package it.caicividale.scuola.emf.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bilancio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getVociDiSpesa <em>Voci Di Spesa</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrate <em>Totale Entrate</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleUscite <em>Totale Uscite</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleIscrizioni <em>Totale Iscrizioni</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleEntrateConIscrizioni <em>Totale Entrate Con Iscrizioni</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Bilancio#getAvanzoCorso <em>Avanzo Corso</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio()
 * @model
 * @generated
 */
public interface Bilancio extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(Long)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_Id()
     * @model id="true" required="true"
     * @generated
     */
    Long getId();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Bilancio#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(Long value);

    /**
     * Returns the value of the '<em><b>Voci Di Spesa</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.VoceDiSpesa}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voci Di Spesa</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_VociDiSpesa()
     * @model containment="true"
     * @generated
     */
    EList<VoceDiSpesa> getVociDiSpesa();

    /**
     * Returns the value of the '<em><b>Nota</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nota</em>' attribute.
     * @see #setNota(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_Nota()
     * @model
     * @generated
     */
    String getNota();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Bilancio#getNota <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nota</em>' attribute.
     * @see #getNota()
     * @generated
     */
    void setNota(String value);

    /**
     * Returns the value of the '<em><b>Totale Entrate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Entrate</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_TotaleEntrate()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getTotaleEntrate();

    /**
     * Returns the value of the '<em><b>Totale Uscite</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Uscite</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_TotaleUscite()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getTotaleUscite();

    /**
     * Returns the value of the '<em><b>Totale Iscrizioni</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Iscrizioni</em>' attribute.
     * @see #setTotaleIscrizioni(float)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_TotaleIscrizioni()
     * @model required="true"
     * @generated
     */
    float getTotaleIscrizioni();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Bilancio#getTotaleIscrizioni <em>Totale Iscrizioni</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Totale Iscrizioni</em>' attribute.
     * @see #getTotaleIscrizioni()
     * @generated
     */
    void setTotaleIscrizioni(float value);

    /**
     * Returns the value of the '<em><b>Totale Entrate Con Iscrizioni</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Totale Entrate Con Iscrizioni</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_TotaleEntrateConIscrizioni()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getTotaleEntrateConIscrizioni();

    /**
     * Returns the value of the '<em><b>Avanzo Corso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Avanzo Corso</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getBilancio_AvanzoCorso()
     * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
     * @generated
     */
    float getAvanzoCorso();

} // Bilancio
