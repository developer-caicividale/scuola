/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.PresenzaLezione;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presenza Lezione</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.PresenzaLezioneImpl#getAllievoPresente <em>Allievo Presente</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PresenzaLezioneImpl#getIstruttorePresente <em>Istruttore Presente</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.PresenzaLezioneImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresenzaLezioneImpl extends ExternalizableEObjectImpl implements PresenzaLezione {
	/**
	 * The cached value of the '{@link #getAllievoPresente() <em>Allievo Presente</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllievoPresente()
	 * @generated
	 * @ordered
	 */
	protected EList<Allievo> allievoPresente;

	/**
	 * The cached value of the '{@link #getIstruttorePresente() <em>Istruttore Presente</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIstruttorePresente()
	 * @generated
	 * @ordered
	 */
	protected EList<Istruttore> istruttorePresente;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresenzaLezioneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRESENZA_LEZIONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Allievo> getAllievoPresente() {
		if (allievoPresente == null) {
			allievoPresente = new EObjectResolvingEList<Allievo>(Allievo.class, this,
					ModelPackage.PRESENZA_LEZIONE__ALLIEVO_PRESENTE);
		}
		return allievoPresente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Istruttore> getIstruttorePresente() {
		if (istruttorePresente == null) {
			istruttorePresente = new EObjectResolvingEList<Istruttore>(Istruttore.class, this,
					ModelPackage.PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE);
		}
		return istruttorePresente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRESENZA_LEZIONE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.PRESENZA_LEZIONE__ALLIEVO_PRESENTE:
			return getAllievoPresente();
		case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE:
			return getIstruttorePresente();
		case ModelPackage.PRESENZA_LEZIONE__ID:
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
		case ModelPackage.PRESENZA_LEZIONE__ALLIEVO_PRESENTE:
			getAllievoPresente().clear();
			getAllievoPresente().addAll((Collection<? extends Allievo>) newValue);
			return;
		case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE:
			getIstruttorePresente().clear();
			getIstruttorePresente().addAll((Collection<? extends Istruttore>) newValue);
			return;
		case ModelPackage.PRESENZA_LEZIONE__ID:
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
		case ModelPackage.PRESENZA_LEZIONE__ALLIEVO_PRESENTE:
			getAllievoPresente().clear();
			return;
		case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE:
			getIstruttorePresente().clear();
			return;
		case ModelPackage.PRESENZA_LEZIONE__ID:
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
		case ModelPackage.PRESENZA_LEZIONE__ALLIEVO_PRESENTE:
			return allievoPresente != null && !allievoPresente.isEmpty();
		case ModelPackage.PRESENZA_LEZIONE__ISTRUTTORE_PRESENTE:
			return istruttorePresente != null && !istruttorePresente.isEmpty();
		case ModelPackage.PRESENZA_LEZIONE__ID:
			return id != ID_EDEFAULT;
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

} //PresenzaLezioneImpl
