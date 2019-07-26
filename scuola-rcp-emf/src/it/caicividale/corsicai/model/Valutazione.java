/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valutazione</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Valutazione#getMateriaValutazione <em>Materia Valutazione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Valutazione#getTipoEsitoValutazione <em>Tipo Esito Valutazione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Valutazione#getIstruttoriValutatori <em>Istruttori Valutatori</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Valutazione#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getValutazione()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Valutazione extends ExternalizableEObject {
	/**
	 * Returns the value of the '<em><b>Materia Valutazione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materia Valutazione</em>' attribute.
	 * @see #setMateriaValutazione(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getValutazione_MateriaValutazione()
	 * @model dataType="it.caicividale.corsicai.model.DizMateriaValutazione"
	 * @generated
	 */
	String getMateriaValutazione();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Valutazione#getMateriaValutazione <em>Materia Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materia Valutazione</em>' attribute.
	 * @see #getMateriaValutazione()
	 * @generated
	 */
	void setMateriaValutazione(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Esito Valutazione</b></em>' attribute.
	 * The literals are from the enumeration {@link it.caicividale.corsicai.model.TipoEsitoValutazione}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Esito Valutazione</em>' attribute.
	 * @see it.caicividale.corsicai.model.TipoEsitoValutazione
	 * @see #setTipoEsitoValutazione(TipoEsitoValutazione)
	 * @see it.caicividale.corsicai.model.ModelPackage#getValutazione_TipoEsitoValutazione()
	 * @model
	 * @generated
	 */
	TipoEsitoValutazione getTipoEsitoValutazione();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Valutazione#getTipoEsitoValutazione <em>Tipo Esito Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Esito Valutazione</em>' attribute.
	 * @see it.caicividale.corsicai.model.TipoEsitoValutazione
	 * @see #getTipoEsitoValutazione()
	 * @generated
	 */
	void setTipoEsitoValutazione(TipoEsitoValutazione value);

	/**
	 * Returns the value of the '<em><b>Istruttori Valutatori</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Istruttore}.
	 * It is bidirectional and its opposite is '{@link it.caicividale.corsicai.model.Istruttore#getValutazioni <em>Valutazioni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Istruttori Valutatori</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getValutazione_IstruttoriValutatori()
	 * @see it.caicividale.corsicai.model.Istruttore#getValutazioni
	 * @model opposite="valutazioni"
	 * @generated
	 */
	EList<Istruttore> getIstruttoriValutatori();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see it.caicividale.corsicai.model.ModelPackage#getValutazione_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Valutazione#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

} // Valutazione
