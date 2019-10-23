/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import it.caicividale.scuola.emf.model.LezionePratica;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.Squadra;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lezione Pratica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.LezionePraticaImpl#getLuogoRitrovo <em>Luogo Ritrovo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.LezionePraticaImpl#getSquadre <em>Squadre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LezionePraticaImpl extends LezioneImpl implements LezionePratica {
    /**
     * The default value of the '{@link #getLuogoRitrovo() <em>Luogo Ritrovo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLuogoRitrovo()
     * @generated
     * @ordered
     */
    protected static final String LUOGO_RITROVO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLuogoRitrovo() <em>Luogo Ritrovo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLuogoRitrovo()
     * @generated
     * @ordered
     */
    protected String luogoRitrovo = LUOGO_RITROVO_EDEFAULT;

    /**
     * The cached value of the '{@link #getSquadre() <em>Squadre</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSquadre()
     * @generated
     * @ordered
     */
    protected EList<Squadra> squadre;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LezionePraticaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.LEZIONE_PRATICA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLuogoRitrovo() {
	return luogoRitrovo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLuogoRitrovo(String newLuogoRitrovo) {
	String oldLuogoRitrovo = luogoRitrovo;
	luogoRitrovo = newLuogoRitrovo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO,
		    oldLuogoRitrovo, luogoRitrovo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Squadra> getSquadre() {
	if (squadre == null) {
	    squadre = new EObjectResolvingEList<Squadra>(Squadra.class, this, ModelPackage.LEZIONE_PRATICA__SQUADRE);
	}
	return squadre;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
	    return getLuogoRitrovo();
	case ModelPackage.LEZIONE_PRATICA__SQUADRE:
	    return getSquadre();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
	    setLuogoRitrovo((String) newValue);
	    return;
	case ModelPackage.LEZIONE_PRATICA__SQUADRE:
	    getSquadre().clear();
	    getSquadre().addAll((Collection<? extends Squadra>) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
	    setLuogoRitrovo(LUOGO_RITROVO_EDEFAULT);
	    return;
	case ModelPackage.LEZIONE_PRATICA__SQUADRE:
	    getSquadre().clear();
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
	    return LUOGO_RITROVO_EDEFAULT == null ? luogoRitrovo != null : !LUOGO_RITROVO_EDEFAULT.equals(luogoRitrovo);
	case ModelPackage.LEZIONE_PRATICA__SQUADRE:
	    return squadre != null && !squadre.isEmpty();
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuilder result = new StringBuilder(super.toString());
	result.append(" (luogoRitrovo: ");
	result.append(luogoRitrovo);
	result.append(')');
	return result.toString();
    }

} //LezionePraticaImpl
