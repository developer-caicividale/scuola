/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Istruttore;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.TipoEsitoValutazione;
import it.caicividale.corsicai.model.Valutazione;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valutazione</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.ValutazioneImpl#getMateriaValutazione <em>Materia Valutazione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.ValutazioneImpl#getTipoEsitoValutazione <em>Tipo Esito Valutazione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.ValutazioneImpl#getIstruttoriValutatori <em>Istruttori Valutatori</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.ValutazioneImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValutazioneImpl extends ExternalizableEObjectImpl implements Valutazione {
	/**
	 * The default value of the '{@link #getMateriaValutazione() <em>Materia Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMateriaValutazione()
	 * @generated
	 * @ordered
	 */
	protected static final String MATERIA_VALUTAZIONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMateriaValutazione() <em>Materia Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMateriaValutazione()
	 * @generated
	 * @ordered
	 */
	protected String materiaValutazione = MATERIA_VALUTAZIONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoEsitoValutazione() <em>Tipo Esito Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEsitoValutazione()
	 * @generated
	 * @ordered
	 */
	protected static final TipoEsitoValutazione TIPO_ESITO_VALUTAZIONE_EDEFAULT = TipoEsitoValutazione.OTTIMO;

	/**
	 * The cached value of the '{@link #getTipoEsitoValutazione() <em>Tipo Esito Valutazione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoEsitoValutazione()
	 * @generated
	 * @ordered
	 */
	protected TipoEsitoValutazione tipoEsitoValutazione = TIPO_ESITO_VALUTAZIONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIstruttoriValutatori() <em>Istruttori Valutatori</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIstruttoriValutatori()
	 * @generated
	 * @ordered
	 */
	protected EList<Istruttore> istruttoriValutatori;

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
	protected ValutazioneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VALUTAZIONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMateriaValutazione() {
		return materiaValutazione;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMateriaValutazione(String newMateriaValutazione) {
		String oldMateriaValutazione = materiaValutazione;
		materiaValutazione = newMateriaValutazione;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUTAZIONE__MATERIA_VALUTAZIONE,
					oldMateriaValutazione, materiaValutazione));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TipoEsitoValutazione getTipoEsitoValutazione() {
		return tipoEsitoValutazione;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoEsitoValutazione(TipoEsitoValutazione newTipoEsitoValutazione) {
		TipoEsitoValutazione oldTipoEsitoValutazione = tipoEsitoValutazione;
		tipoEsitoValutazione = newTipoEsitoValutazione == null ? TIPO_ESITO_VALUTAZIONE_EDEFAULT
				: newTipoEsitoValutazione;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUTAZIONE__TIPO_ESITO_VALUTAZIONE,
					oldTipoEsitoValutazione, tipoEsitoValutazione));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Istruttore> getIstruttoriValutatori() {
		if (istruttoriValutatori == null) {
			istruttoriValutatori = new EObjectWithInverseResolvingEList.ManyInverse<Istruttore>(Istruttore.class, this,
					ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI, ModelPackage.ISTRUTTORE__VALUTAZIONI);
		}
		return istruttoriValutatori;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUTAZIONE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIstruttoriValutatori()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			return ((InternalEList<?>) getIstruttoriValutatori()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.VALUTAZIONE__MATERIA_VALUTAZIONE:
			return getMateriaValutazione();
		case ModelPackage.VALUTAZIONE__TIPO_ESITO_VALUTAZIONE:
			return getTipoEsitoValutazione();
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			return getIstruttoriValutatori();
		case ModelPackage.VALUTAZIONE__ID:
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
		case ModelPackage.VALUTAZIONE__MATERIA_VALUTAZIONE:
			setMateriaValutazione((String) newValue);
			return;
		case ModelPackage.VALUTAZIONE__TIPO_ESITO_VALUTAZIONE:
			setTipoEsitoValutazione((TipoEsitoValutazione) newValue);
			return;
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			getIstruttoriValutatori().clear();
			getIstruttoriValutatori().addAll((Collection<? extends Istruttore>) newValue);
			return;
		case ModelPackage.VALUTAZIONE__ID:
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
		case ModelPackage.VALUTAZIONE__MATERIA_VALUTAZIONE:
			setMateriaValutazione(MATERIA_VALUTAZIONE_EDEFAULT);
			return;
		case ModelPackage.VALUTAZIONE__TIPO_ESITO_VALUTAZIONE:
			setTipoEsitoValutazione(TIPO_ESITO_VALUTAZIONE_EDEFAULT);
			return;
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			getIstruttoriValutatori().clear();
			return;
		case ModelPackage.VALUTAZIONE__ID:
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
		case ModelPackage.VALUTAZIONE__MATERIA_VALUTAZIONE:
			return MATERIA_VALUTAZIONE_EDEFAULT == null ? materiaValutazione != null
					: !MATERIA_VALUTAZIONE_EDEFAULT.equals(materiaValutazione);
		case ModelPackage.VALUTAZIONE__TIPO_ESITO_VALUTAZIONE:
			return tipoEsitoValutazione != TIPO_ESITO_VALUTAZIONE_EDEFAULT;
		case ModelPackage.VALUTAZIONE__ISTRUTTORI_VALUTATORI:
			return istruttoriValutatori != null && !istruttoriValutatori.isEmpty();
		case ModelPackage.VALUTAZIONE__ID:
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
		result.append(" (materiaValutazione: ");
		result.append(materiaValutazione);
		result.append(", tipoEsitoValutazione: ");
		result.append(tipoEsitoValutazione);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ValutazioneImpl
