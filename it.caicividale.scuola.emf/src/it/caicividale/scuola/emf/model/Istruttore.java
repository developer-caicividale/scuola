/**
 */
package it.caicividale.scuola.emf.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Istruttore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.Istruttore#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.Istruttore#getIsAttivo <em>Is Attivo</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getIstruttore()
 * @model
 * @generated
 */
public interface Istruttore extends Persona {
    /**
     * Returns the value of the '<em><b>Titolo</b></em>' attribute.
     * The literals are from the enumeration {@link it.caicividale.scuola.emf.model.ETitoloIstruttore}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Titolo</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ETitoloIstruttore
     * @see #setTitolo(ETitoloIstruttore)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIstruttore_Titolo()
     * @model required="true"
     * @generated
     */
    ETitoloIstruttore getTitolo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Istruttore#getTitolo <em>Titolo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Titolo</em>' attribute.
     * @see it.caicividale.scuola.emf.model.ETitoloIstruttore
     * @see #getTitolo()
     * @generated
     */
    void setTitolo(ETitoloIstruttore value);

    /**
     * Returns the value of the '<em><b>Is Attivo</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Attivo</em>' attribute.
     * @see #setIsAttivo(Boolean)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getIstruttore_IsAttivo()
     * @model default="true" required="true"
     * @generated
     */
    Boolean getIsAttivo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.Istruttore#getIsAttivo <em>Is Attivo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Attivo</em>' attribute.
     * @see #getIsAttivo()
     * @generated
     */
    void setIsAttivo(Boolean value);

} // Istruttore
