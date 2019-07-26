/**
 */
package it.caicividale.corsicai.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Istruttore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Istruttore#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Istruttore#getValutazioni <em>Valutazioni</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Istruttore#getIsAttivo <em>Is Attivo</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getIstruttore()
 * @model
 * @generated
 */
public interface Istruttore extends Persona {
	/**
	 * Returns the value of the '<em><b>Titolo</b></em>' attribute.
	 * The literals are from the enumeration {@link it.caicividale.corsicai.model.ETitoloIstruttore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titolo</em>' attribute.
	 * @see it.caicividale.corsicai.model.ETitoloIstruttore
	 * @see #setTitolo(ETitoloIstruttore)
	 * @see it.caicividale.corsicai.model.ModelPackage#getIstruttore_Titolo()
	 * @model required="true"
	 * @generated
	 */
	ETitoloIstruttore getTitolo();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Istruttore#getTitolo <em>Titolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titolo</em>' attribute.
	 * @see it.caicividale.corsicai.model.ETitoloIstruttore
	 * @see #getTitolo()
	 * @generated
	 */
	void setTitolo(ETitoloIstruttore value);

	/**
	 * Returns the value of the '<em><b>Valutazioni</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Valutazione}.
	 * It is bidirectional and its opposite is '{@link it.caicividale.corsicai.model.Valutazione#getIstruttoriValutatori <em>Istruttori Valutatori</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valutazioni</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getIstruttore_Valutazioni()
	 * @see it.caicividale.corsicai.model.Valutazione#getIstruttoriValutatori
	 * @model opposite="istruttoriValutatori" required="true"
	 * @generated
	 */
	EList<Valutazione> getValutazioni();

	/**
	 * Returns the value of the '<em><b>Is Attivo</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attivo</em>' attribute.
	 * @see #setIsAttivo(Boolean)
	 * @see it.caicividale.corsicai.model.ModelPackage#getIstruttore_IsAttivo()
	 * @model default="true" required="true"
	 * @generated
	 */
	Boolean getIsAttivo();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Istruttore#getIsAttivo <em>Is Attivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attivo</em>' attribute.
	 * @see #getIsAttivo()
	 * @generated
	 */
	void setIsAttivo(Boolean value);

} // Istruttore
