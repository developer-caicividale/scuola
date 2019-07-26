/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Documento;
import it.caicividale.corsicai.model.ETipoDocumento;
import it.caicividale.corsicai.model.ModelPackage;

import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.DocumentoImpl#getTipoDocumento <em>Tipo Documento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.DocumentoImpl#getDocumento <em>Documento</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.DocumentoImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentoImpl extends ExternalizableEObjectImpl implements Documento {
	/**
	 * The default value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final ETipoDocumento TIPO_DOCUMENTO_EDEFAULT = ETipoDocumento.CONSENSO_INFORMATO;

	/**
	 * The cached value of the '{@link #getTipoDocumento() <em>Tipo Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDocumento()
	 * @generated
	 * @ordered
	 */
	protected ETipoDocumento tipoDocumento = TIPO_DOCUMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumento() <em>Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DOCUMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumento() <em>Documento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumento()
	 * @generated
	 * @ordered
	 */
	protected byte[] documento = DOCUMENTO_EDEFAULT;

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
	protected DocumentoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoDocumento(ETipoDocumento newTipoDocumento) {
		ETipoDocumento oldTipoDocumento = tipoDocumento;
		tipoDocumento = newTipoDocumento == null ? TIPO_DOCUMENTO_EDEFAULT : newTipoDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENTO__TIPO_DOCUMENTO,
					oldTipoDocumento, tipoDocumento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getDocumento() {
		return documento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumento(byte[] newDocumento) {
		byte[] oldDocumento = documento;
		documento = newDocumento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENTO__DOCUMENTO, oldDocumento,
					documento));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DOCUMENTO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.DOCUMENTO__TIPO_DOCUMENTO:
			return getTipoDocumento();
		case ModelPackage.DOCUMENTO__DOCUMENTO:
			return getDocumento();
		case ModelPackage.DOCUMENTO__ID:
			return getId();
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
		case ModelPackage.DOCUMENTO__TIPO_DOCUMENTO:
			setTipoDocumento((ETipoDocumento) newValue);
			return;
		case ModelPackage.DOCUMENTO__DOCUMENTO:
			setDocumento((byte[]) newValue);
			return;
		case ModelPackage.DOCUMENTO__ID:
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
		case ModelPackage.DOCUMENTO__TIPO_DOCUMENTO:
			setTipoDocumento(TIPO_DOCUMENTO_EDEFAULT);
			return;
		case ModelPackage.DOCUMENTO__DOCUMENTO:
			setDocumento(DOCUMENTO_EDEFAULT);
			return;
		case ModelPackage.DOCUMENTO__ID:
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
		case ModelPackage.DOCUMENTO__TIPO_DOCUMENTO:
			return tipoDocumento != TIPO_DOCUMENTO_EDEFAULT;
		case ModelPackage.DOCUMENTO__DOCUMENTO:
			return DOCUMENTO_EDEFAULT == null ? documento != null : !DOCUMENTO_EDEFAULT.equals(documento);
		case ModelPackage.DOCUMENTO__ID:
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
		result.append(" (tipoDocumento: ");
		result.append(tipoDocumento);
		result.append(", documento: ");
		result.append(documento);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DocumentoImpl
