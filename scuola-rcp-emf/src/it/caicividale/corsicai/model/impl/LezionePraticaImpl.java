/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.LezionePratica;
import it.caicividale.corsicai.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lezione Pratica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezionePraticaImpl#getStaffIstruttoriLezione <em>Staff Istruttori Lezione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezionePraticaImpl#getLuogoRitrovo <em>Luogo Ritrovo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LezionePraticaImpl extends LezioneImpl implements LezionePratica {
	/**
	 * The cached value of the '{@link #getStaffIstruttoriLezione() <em>Staff Istruttori Lezione</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffIstruttoriLezione()
	 * @generated
	 * @ordered
	 */
	protected EList<Istruttore> staffIstruttoriLezione;

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
	public EList<Istruttore> getStaffIstruttoriLezione() {
		if (staffIstruttoriLezione == null) {
			staffIstruttoriLezione = new EObjectResolvingEList<Istruttore>(Istruttore.class, this,
					ModelPackage.LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE);
		}
		return staffIstruttoriLezione;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE:
			return getStaffIstruttoriLezione();
		case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
			return getLuogoRitrovo();
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
		case ModelPackage.LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE:
			getStaffIstruttoriLezione().clear();
			getStaffIstruttoriLezione().addAll((Collection<? extends Istruttore>) newValue);
			return;
		case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
			setLuogoRitrovo((String) newValue);
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
		case ModelPackage.LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE:
			getStaffIstruttoriLezione().clear();
			return;
		case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
			setLuogoRitrovo(LUOGO_RITROVO_EDEFAULT);
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
		case ModelPackage.LEZIONE_PRATICA__STAFF_ISTRUTTORI_LEZIONE:
			return staffIstruttoriLezione != null && !staffIstruttoriLezione.isEmpty();
		case ModelPackage.LEZIONE_PRATICA__LUOGO_RITROVO:
			return LUOGO_RITROVO_EDEFAULT == null ? luogoRitrovo != null : !LUOGO_RITROVO_EDEFAULT.equals(luogoRitrovo);
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
