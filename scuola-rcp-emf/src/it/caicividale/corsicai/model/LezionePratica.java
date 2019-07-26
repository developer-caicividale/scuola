/**
 */
package it.caicividale.corsicai.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lezione Pratica</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.LezionePratica#getStaffIstruttoriLezione <em>Staff Istruttori Lezione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getLezionePratica()
 * @model
 * @generated
 */
public interface LezionePratica extends Lezione {
	/**
	 * Returns the value of the '<em><b>Staff Istruttori Lezione</b></em>' reference list.
	 * The list contents are of type {@link it.caicividale.corsicai.model.Istruttore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Istruttori Lezione</em>' reference list.
	 * @see it.caicividale.corsicai.model.ModelPackage#getLezionePratica_StaffIstruttoriLezione()
	 * @model required="true"
	 * @generated
	 */
	EList<Istruttore> getStaffIstruttoriLezione();

	/**
	 * Returns the value of the '<em><b>Luogo Ritrovo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luogo Ritrovo</em>' attribute.
	 * @see #setLuogoRitrovo(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getLezionePratica_LuogoRitrovo()
	 * @model
	 * @generated
	 */
	String getLuogoRitrovo();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luogo Ritrovo</em>' attribute.
	 * @see #getLuogoRitrovo()
	 * @generated
	 */
	void setLuogoRitrovo(String value);

} // LezionePratica
