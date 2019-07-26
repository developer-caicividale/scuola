/**
 */
package it.caicividale.corsicai.model;

import it.caicividale.corsicai.model.root.ExternalizableEObject;

import it.caicividale.corsicai.model.valueobject.EMail;
import it.caicividale.corsicai.model.valueobject.NumeroCellulare;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persona</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getCognome <em>Cognome</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getSesso <em>Sesso</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getNumeroCellulare <em>Numero Cellulare</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getEMail <em>EMail</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getResidenzaVia <em>Residenza Via</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getResidenzaCitta <em>Residenza Citta</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getResidenzaProvincia <em>Residenza Provincia</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getResidenzaCap <em>Residenza Cap</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getNascitaData <em>Nascita Data</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getNascitaCitta <em>Nascita Citta</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getNascitaProvincia <em>Nascita Provincia</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getSezioneCaiAppartenenza <em>Sezione Cai Appartenenza</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.Persona#getIsStaffScuola <em>Is Staff Scuola</em>}</li>
 * </ul>
 *
 * @see it.caicividale.corsicai.model.ModelPackage#getPersona()
 * @model
 * @extends ExternalizableEObject
 * @generated
 */
public interface Persona extends ExternalizableEObject {
	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_Nome()
	 * @model required="true"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Cognome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cognome</em>' attribute.
	 * @see #setCognome(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_Cognome()
	 * @model required="true"
	 * @generated
	 */
	String getCognome();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getCognome <em>Cognome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cognome</em>' attribute.
	 * @see #getCognome()
	 * @generated
	 */
	void setCognome(String value);

	/**
	 * Returns the value of the '<em><b>Sesso</b></em>' attribute.
	 * The literals are from the enumeration {@link it.caicividale.corsicai.model.ESesso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sesso</em>' attribute.
	 * @see it.caicividale.corsicai.model.ESesso
	 * @see #setSesso(ESesso)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_Sesso()
	 * @model
	 * @generated
	 */
	ESesso getSesso();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getSesso <em>Sesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sesso</em>' attribute.
	 * @see it.caicividale.corsicai.model.ESesso
	 * @see #getSesso()
	 * @generated
	 */
	void setSesso(ESesso value);

	/**
	 * Returns the value of the '<em><b>Numero Cellulare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Cellulare</em>' attribute.
	 * @see #setNumeroCellulare(NumeroCellulare)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_NumeroCellulare()
	 * @model dataType="it.caicividale.corsicai.model.NumeroCellulare"
	 * @generated
	 */
	NumeroCellulare getNumeroCellulare();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getNumeroCellulare <em>Numero Cellulare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Cellulare</em>' attribute.
	 * @see #getNumeroCellulare()
	 * @generated
	 */
	void setNumeroCellulare(NumeroCellulare value);

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(EMail)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_EMail()
	 * @model dataType="it.caicividale.corsicai.model.EMail"
	 * @generated
	 */
	EMail getEMail();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(EMail value);

	/**
	 * Returns the value of the '<em><b>Residenza Via</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residenza Via</em>' attribute.
	 * @see #setResidenzaVia(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_ResidenzaVia()
	 * @model required="true"
	 * @generated
	 */
	String getResidenzaVia();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getResidenzaVia <em>Residenza Via</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residenza Via</em>' attribute.
	 * @see #getResidenzaVia()
	 * @generated
	 */
	void setResidenzaVia(String value);

	/**
	 * Returns the value of the '<em><b>Residenza Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residenza Citta</em>' attribute.
	 * @see #setResidenzaCitta(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_ResidenzaCitta()
	 * @model required="true"
	 * @generated
	 */
	String getResidenzaCitta();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getResidenzaCitta <em>Residenza Citta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residenza Citta</em>' attribute.
	 * @see #getResidenzaCitta()
	 * @generated
	 */
	void setResidenzaCitta(String value);

	/**
	 * Returns the value of the '<em><b>Residenza Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residenza Provincia</em>' attribute.
	 * @see #setResidenzaProvincia(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_ResidenzaProvincia()
	 * @model required="true"
	 * @generated
	 */
	String getResidenzaProvincia();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getResidenzaProvincia <em>Residenza Provincia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residenza Provincia</em>' attribute.
	 * @see #getResidenzaProvincia()
	 * @generated
	 */
	void setResidenzaProvincia(String value);

	/**
	 * Returns the value of the '<em><b>Residenza Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residenza Cap</em>' attribute.
	 * @see #setResidenzaCap(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_ResidenzaCap()
	 * @model required="true"
	 * @generated
	 */
	String getResidenzaCap();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getResidenzaCap <em>Residenza Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residenza Cap</em>' attribute.
	 * @see #getResidenzaCap()
	 * @generated
	 */
	void setResidenzaCap(String value);

	/**
	 * Returns the value of the '<em><b>Nascita Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nascita Data</em>' attribute.
	 * @see #setNascitaData(Date)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_NascitaData()
	 * @model required="true"
	 * @generated
	 */
	Date getNascitaData();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getNascitaData <em>Nascita Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nascita Data</em>' attribute.
	 * @see #getNascitaData()
	 * @generated
	 */
	void setNascitaData(Date value);

	/**
	 * Returns the value of the '<em><b>Nascita Citta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nascita Citta</em>' attribute.
	 * @see #setNascitaCitta(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_NascitaCitta()
	 * @model
	 * @generated
	 */
	String getNascitaCitta();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getNascitaCitta <em>Nascita Citta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nascita Citta</em>' attribute.
	 * @see #getNascitaCitta()
	 * @generated
	 */
	void setNascitaCitta(String value);

	/**
	 * Returns the value of the '<em><b>Nascita Provincia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nascita Provincia</em>' attribute.
	 * @see #setNascitaProvincia(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_NascitaProvincia()
	 * @model
	 * @generated
	 */
	String getNascitaProvincia();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getNascitaProvincia <em>Nascita Provincia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nascita Provincia</em>' attribute.
	 * @see #getNascitaProvincia()
	 * @generated
	 */
	void setNascitaProvincia(String value);

	/**
	 * Returns the value of the '<em><b>Sezione Cai Appartenenza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sezione Cai Appartenenza</em>' attribute.
	 * @see #setSezioneCaiAppartenenza(String)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_SezioneCaiAppartenenza()
	 * @model required="true"
	 * @generated
	 */
	String getSezioneCaiAppartenenza();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getSezioneCaiAppartenenza <em>Sezione Cai Appartenenza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sezione Cai Appartenenza</em>' attribute.
	 * @see #getSezioneCaiAppartenenza()
	 * @generated
	 */
	void setSezioneCaiAppartenenza(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Is Staff Scuola</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Staff Scuola</em>' attribute.
	 * @see #setIsStaffScuola(Boolean)
	 * @see it.caicividale.corsicai.model.ModelPackage#getPersona_IsStaffScuola()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsStaffScuola();

	/**
	 * Sets the value of the '{@link it.caicividale.corsicai.model.Persona#getIsStaffScuola <em>Is Staff Scuola</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Staff Scuola</em>' attribute.
	 * @see #getIsStaffScuola()
	 * @generated
	 */
	void setIsStaffScuola(Boolean value);

} // Persona
