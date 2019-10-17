/**
 */
package it.caicividale.corsicai.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allievo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Allievo#getIsDiploma <em>Is Diploma</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getAllievo()
 * @model
 * @generated
 */
public interface Allievo extends Persona {
    /**
     * Returns the value of the '<em><b>Is Diploma</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Diploma</em>' attribute.
     * @see #setIsDiploma(Boolean)
     * @see it.caicividale.corsicai.model.ModelPackage#getAllievo_IsDiploma()
     * @model default="false"
     * @generated
     */
    Boolean getIsDiploma();

    /**
     * Sets the value of the '{@link it.caicividale.corsicai.model.Allievo#getIsDiploma <em>Is Diploma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Diploma</em>' attribute.
     * @see #getIsDiploma()
     * @generated
     */
    void setIsDiploma(Boolean value);

} // Allievo
