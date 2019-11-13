/**
 */
package it.caicividale.scuola.emf.model;

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
 *   <li>{@link it.caicividale.scuola.emf.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.LezionePratica#getSquadre <em>Squadre</em>}</li>
 * </ul>
 *
 * @see it.caicividale.scuola.emf.model.ModelPackage#getLezionePratica()
 * @model
 * @generated
 */
public interface LezionePratica extends Lezione {
    /**
     * Returns the value of the '<em><b>Luogo Ritrovo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Luogo Ritrovo</em>' attribute.
     * @see #setLuogoRitrovo(String)
     * @see it.caicividale.scuola.emf.model.ModelPackage#getLezionePratica_LuogoRitrovo()
     * @model
     * @generated
     */
    String getLuogoRitrovo();

    /**
     * Sets the value of the '{@link it.caicividale.scuola.emf.model.LezionePratica#getLuogoRitrovo <em>Luogo Ritrovo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Luogo Ritrovo</em>' attribute.
     * @see #getLuogoRitrovo()
     * @generated
     */
    void setLuogoRitrovo(String value);

    /**
     * Returns the value of the '<em><b>Squadre</b></em>' containment reference list.
     * The list contents are of type {@link it.caicividale.scuola.emf.model.Squadra}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Squadre</em>' containment reference list.
     * @see it.caicividale.scuola.emf.model.ModelPackage#getLezionePratica_Squadre()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Squadra> getSquadre();

} // LezionePratica
