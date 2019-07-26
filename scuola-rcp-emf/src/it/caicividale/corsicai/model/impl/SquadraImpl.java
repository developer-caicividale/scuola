/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Squadra;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Squadra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.SquadraImpl#getCapiSquadra <em>Capi Squadra</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.SquadraImpl#getAllieviInSquadra <em>Allievi In Squadra</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.SquadraImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SquadraImpl extends ExternalizableEObjectImpl implements Squadra {
	/**
	 * The cached value of the '{@link #getCapiSquadra() <em>Capi Squadra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapiSquadra()
	 * @generated
	 * @ordered
	 */
	protected EList<Istruttore> capiSquadra;

	/**
	 * The cached value of the '{@link #getAllieviInSquadra() <em>Allievi In Squadra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllieviInSquadra()
	 * @generated
	 * @ordered
	 */
	protected EList<Allievo> allieviInSquadra;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquadraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SQUADRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Istruttore> getCapiSquadra() {
		if (capiSquadra == null) {
			capiSquadra = new EObjectResolvingEList<Istruttore>(Istruttore.class, this,
					ModelPackage.SQUADRA__CAPI_SQUADRA);
		}
		return capiSquadra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Allievo> getAllieviInSquadra() {
		if (allieviInSquadra == null) {
			allieviInSquadra = new EObjectResolvingEList<Allievo>(Allievo.class, this,
					ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA);
		}
		return allieviInSquadra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		Long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SQUADRA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.SQUADRA__CAPI_SQUADRA:
			return getCapiSquadra();
		case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
			return getAllieviInSquadra();
		case ModelPackage.SQUADRA__ID:
			return getId();
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
		case ModelPackage.SQUADRA__CAPI_SQUADRA:
			getCapiSquadra().clear();
			getCapiSquadra().addAll((Collection<? extends Istruttore>) newValue);
			return;
		case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
			getAllieviInSquadra().clear();
			getAllieviInSquadra().addAll((Collection<? extends Allievo>) newValue);
			return;
		case ModelPackage.SQUADRA__ID:
			setId((Long) newValue);
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
		case ModelPackage.SQUADRA__CAPI_SQUADRA:
			getCapiSquadra().clear();
			return;
		case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
			getAllieviInSquadra().clear();
			return;
		case ModelPackage.SQUADRA__ID:
			setId(ID_EDEFAULT);
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
		case ModelPackage.SQUADRA__CAPI_SQUADRA:
			return capiSquadra != null && !capiSquadra.isEmpty();
		case ModelPackage.SQUADRA__ALLIEVI_IN_SQUADRA:
			return allieviInSquadra != null && !allieviInSquadra.isEmpty();
		case ModelPackage.SQUADRA__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //SquadraImpl
