/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Lezione;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.PresenzaLezione;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lezione</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getDataSvolgimento <em>Data Svolgimento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getLuogoSvolgimento <em>Luogo Svolgimento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getDurata <em>Durata</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getPresenzaLezione <em>Presenza Lezione</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.LezioneImpl#getArgomentiTrattati <em>Argomenti Trattati</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LezioneImpl extends ExternalizableEObjectImpl implements Lezione {
	/**
	 * The default value of the '{@link #getTitolo() <em>Titolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitolo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITOLO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitolo() <em>Titolo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitolo()
	 * @generated
	 * @ordered
	 */
	protected String titolo = TITOLO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSvolgimento() <em>Data Svolgimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSvolgimento()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_SVOLGIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSvolgimento() <em>Data Svolgimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSvolgimento()
	 * @generated
	 * @ordered
	 */
	protected Date dataSvolgimento = DATA_SVOLGIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuogoSvolgimento() <em>Luogo Svolgimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuogoSvolgimento()
	 * @generated
	 * @ordered
	 */
	protected static final String LUOGO_SVOLGIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuogoSvolgimento() <em>Luogo Svolgimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuogoSvolgimento()
	 * @generated
	 * @ordered
	 */
	protected String luogoSvolgimento = LUOGO_SVOLGIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurata() <em>Durata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurata()
	 * @generated
	 * @ordered
	 */
	protected static final Float DURATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDurata() <em>Durata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurata()
	 * @generated
	 * @ordered
	 */
	protected Float durata = DURATA_EDEFAULT;

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
	 * The cached value of the '{@link #getPresenzaLezione() <em>Presenza Lezione</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresenzaLezione()
	 * @generated
	 * @ordered
	 */
	protected PresenzaLezione presenzaLezione;

	/**
	 * The default value of the '{@link #getArgomentiTrattati() <em>Argomenti Trattati</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgomentiTrattati()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGOMENTI_TRATTATI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgomentiTrattati() <em>Argomenti Trattati</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgomentiTrattati()
	 * @generated
	 * @ordered
	 */
	protected String argomentiTrattati = ARGOMENTI_TRATTATI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LezioneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LEZIONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitolo() {
		return titolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitolo(String newTitolo) {
		String oldTitolo = titolo;
		titolo = newTitolo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__TITOLO, oldTitolo, titolo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDataSvolgimento() {
		return dataSvolgimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSvolgimento(Date newDataSvolgimento) {
		Date oldDataSvolgimento = dataSvolgimento;
		dataSvolgimento = newDataSvolgimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__DATA_SVOLGIMENTO,
					oldDataSvolgimento, dataSvolgimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLuogoSvolgimento() {
		return luogoSvolgimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLuogoSvolgimento(String newLuogoSvolgimento) {
		String oldLuogoSvolgimento = luogoSvolgimento;
		luogoSvolgimento = newLuogoSvolgimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__LUOGO_SVOLGIMENTO,
					oldLuogoSvolgimento, luogoSvolgimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDurata() {
		return durata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurata(Float newDurata) {
		Float oldDurata = durata;
		durata = newDurata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__DURATA, oldDurata, durata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresenzaLezione getPresenzaLezione() {
		if (presenzaLezione != null && ((EObject) presenzaLezione).eIsProxy()) {
			InternalEObject oldPresenzaLezione = (InternalEObject) presenzaLezione;
			presenzaLezione = (PresenzaLezione) eResolveProxy(oldPresenzaLezione);
			if (presenzaLezione != oldPresenzaLezione) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.LEZIONE__PRESENZA_LEZIONE,
							oldPresenzaLezione, presenzaLezione));
			}
		}
		return presenzaLezione;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresenzaLezione basicGetPresenzaLezione() {
		return presenzaLezione;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresenzaLezione(PresenzaLezione newPresenzaLezione) {
		PresenzaLezione oldPresenzaLezione = presenzaLezione;
		presenzaLezione = newPresenzaLezione;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__PRESENZA_LEZIONE,
					oldPresenzaLezione, presenzaLezione));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgomentiTrattati() {
		return argomentiTrattati;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgomentiTrattati(String newArgomentiTrattati) {
		String oldArgomentiTrattati = argomentiTrattati;
		argomentiTrattati = newArgomentiTrattati;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LEZIONE__ARGOMENTI_TRATTATI,
					oldArgomentiTrattati, argomentiTrattati));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.LEZIONE__TITOLO:
			return getTitolo();
		case ModelPackage.LEZIONE__DATA_SVOLGIMENTO:
			return getDataSvolgimento();
		case ModelPackage.LEZIONE__LUOGO_SVOLGIMENTO:
			return getLuogoSvolgimento();
		case ModelPackage.LEZIONE__DURATA:
			return getDurata();
		case ModelPackage.LEZIONE__ID:
			return getId();
		case ModelPackage.LEZIONE__PRESENZA_LEZIONE:
			if (resolve)
				return getPresenzaLezione();
			return basicGetPresenzaLezione();
		case ModelPackage.LEZIONE__ARGOMENTI_TRATTATI:
			return getArgomentiTrattati();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.LEZIONE__TITOLO:
			setTitolo((String) newValue);
			return;
		case ModelPackage.LEZIONE__DATA_SVOLGIMENTO:
			setDataSvolgimento((Date) newValue);
			return;
		case ModelPackage.LEZIONE__LUOGO_SVOLGIMENTO:
			setLuogoSvolgimento((String) newValue);
			return;
		case ModelPackage.LEZIONE__DURATA:
			setDurata((Float) newValue);
			return;
		case ModelPackage.LEZIONE__ID:
			setId((Long) newValue);
			return;
		case ModelPackage.LEZIONE__PRESENZA_LEZIONE:
			setPresenzaLezione((PresenzaLezione) newValue);
			return;
		case ModelPackage.LEZIONE__ARGOMENTI_TRATTATI:
			setArgomentiTrattati((String) newValue);
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
		case ModelPackage.LEZIONE__TITOLO:
			setTitolo(TITOLO_EDEFAULT);
			return;
		case ModelPackage.LEZIONE__DATA_SVOLGIMENTO:
			setDataSvolgimento(DATA_SVOLGIMENTO_EDEFAULT);
			return;
		case ModelPackage.LEZIONE__LUOGO_SVOLGIMENTO:
			setLuogoSvolgimento(LUOGO_SVOLGIMENTO_EDEFAULT);
			return;
		case ModelPackage.LEZIONE__DURATA:
			setDurata(DURATA_EDEFAULT);
			return;
		case ModelPackage.LEZIONE__ID:
			setId(ID_EDEFAULT);
			return;
		case ModelPackage.LEZIONE__PRESENZA_LEZIONE:
			setPresenzaLezione((PresenzaLezione) null);
			return;
		case ModelPackage.LEZIONE__ARGOMENTI_TRATTATI:
			setArgomentiTrattati(ARGOMENTI_TRATTATI_EDEFAULT);
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
		case ModelPackage.LEZIONE__TITOLO:
			return TITOLO_EDEFAULT == null ? titolo != null : !TITOLO_EDEFAULT.equals(titolo);
		case ModelPackage.LEZIONE__DATA_SVOLGIMENTO:
			return DATA_SVOLGIMENTO_EDEFAULT == null ? dataSvolgimento != null
					: !DATA_SVOLGIMENTO_EDEFAULT.equals(dataSvolgimento);
		case ModelPackage.LEZIONE__LUOGO_SVOLGIMENTO:
			return LUOGO_SVOLGIMENTO_EDEFAULT == null ? luogoSvolgimento != null
					: !LUOGO_SVOLGIMENTO_EDEFAULT.equals(luogoSvolgimento);
		case ModelPackage.LEZIONE__DURATA:
			return DURATA_EDEFAULT == null ? durata != null : !DURATA_EDEFAULT.equals(durata);
		case ModelPackage.LEZIONE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ModelPackage.LEZIONE__PRESENZA_LEZIONE:
			return presenzaLezione != null;
		case ModelPackage.LEZIONE__ARGOMENTI_TRATTATI:
			return ARGOMENTI_TRATTATI_EDEFAULT == null ? argomentiTrattati != null
					: !ARGOMENTI_TRATTATI_EDEFAULT.equals(argomentiTrattati);
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
		result.append(" (titolo: ");
		result.append(titolo);
		result.append(", dataSvolgimento: ");
		result.append(dataSvolgimento);
		result.append(", luogoSvolgimento: ");
		result.append(luogoSvolgimento);
		result.append(", durata: ");
		result.append(durata);
		result.append(", id: ");
		result.append(id);
		result.append(", argomentiTrattati: ");
		result.append(argomentiTrattati);
		result.append(')');
		return result.toString();
	}

} //LezioneImpl
