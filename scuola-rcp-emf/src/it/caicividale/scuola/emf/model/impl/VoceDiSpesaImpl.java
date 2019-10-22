/**
 */
package it.caicividale.scuola.emf.model.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import it.caicividale.scuola.emf.model.ETipoVoceDiSpesa;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.VoceDiSpesa;
import it.caicividale.scuola.emf.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voce Di Spesa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getTitolo <em>Titolo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getValore <em>Valore</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.VoceDiSpesaImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoceDiSpesaImpl extends ExternalizableEObjectImpl implements VoceDiSpesa {
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
     * The default value of the '{@link #getValore() <em>Valore</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValore()
     * @generated
     * @ordered
     */
    protected static final float VALORE_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getValore() <em>Valore</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValore()
     * @generated
     * @ordered
     */
    protected float valore = VALORE_EDEFAULT;

    /**
     * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTipo()
     * @generated
     * @ordered
     */
    protected static final ETipoVoceDiSpesa TIPO_EDEFAULT = ETipoVoceDiSpesa.ENTRATA;

    /**
     * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTipo()
     * @generated
     * @ordered
     */
    protected ETipoVoceDiSpesa tipo = TIPO_EDEFAULT;

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
     * The default value of the '{@link #getNota() <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNota()
     * @generated
     * @ordered
     */
    protected static final String NOTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNota() <em>Nota</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNota()
     * @generated
     * @ordered
     */
    protected String nota = NOTA_EDEFAULT;

    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final Date DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected Date data = DATA_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VoceDiSpesaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.VOCE_DI_SPESA;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__TITOLO, oldTitolo,
		    titolo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getValore() {
	return valore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValore(float newValore) {
	float oldValore = valore;
	valore = newValore;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__VALORE, oldValore,
		    valore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ETipoVoceDiSpesa getTipo() {
	return tipo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTipo(ETipoVoceDiSpesa newTipo) {
	ETipoVoceDiSpesa oldTipo = tipo;
	tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__TIPO, oldTipo, tipo));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNota() {
	return nota;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNota(String newNota) {
	String oldNota = nota;
	nota = newNota;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__NOTA, oldNota, nota));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getData() {
	return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setData(Date newData) {
	Date oldData = data;
	data = newData;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VOCE_DI_SPESA__DATA, oldData, data));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.VOCE_DI_SPESA__TITOLO:
	    return getTitolo();
	case ModelPackage.VOCE_DI_SPESA__VALORE:
	    return getValore();
	case ModelPackage.VOCE_DI_SPESA__TIPO:
	    return getTipo();
	case ModelPackage.VOCE_DI_SPESA__ID:
	    return getId();
	case ModelPackage.VOCE_DI_SPESA__NOTA:
	    return getNota();
	case ModelPackage.VOCE_DI_SPESA__DATA:
	    return getData();
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
	case ModelPackage.VOCE_DI_SPESA__TITOLO:
	    setTitolo((String) newValue);
	    return;
	case ModelPackage.VOCE_DI_SPESA__VALORE:
	    setValore((Float) newValue);
	    return;
	case ModelPackage.VOCE_DI_SPESA__TIPO:
	    setTipo((ETipoVoceDiSpesa) newValue);
	    return;
	case ModelPackage.VOCE_DI_SPESA__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.VOCE_DI_SPESA__NOTA:
	    setNota((String) newValue);
	    return;
	case ModelPackage.VOCE_DI_SPESA__DATA:
	    setData((Date) newValue);
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
	case ModelPackage.VOCE_DI_SPESA__TITOLO:
	    setTitolo(TITOLO_EDEFAULT);
	    return;
	case ModelPackage.VOCE_DI_SPESA__VALORE:
	    setValore(VALORE_EDEFAULT);
	    return;
	case ModelPackage.VOCE_DI_SPESA__TIPO:
	    setTipo(TIPO_EDEFAULT);
	    return;
	case ModelPackage.VOCE_DI_SPESA__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.VOCE_DI_SPESA__NOTA:
	    setNota(NOTA_EDEFAULT);
	    return;
	case ModelPackage.VOCE_DI_SPESA__DATA:
	    setData(DATA_EDEFAULT);
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
	case ModelPackage.VOCE_DI_SPESA__TITOLO:
	    return TITOLO_EDEFAULT == null ? titolo != null : !TITOLO_EDEFAULT.equals(titolo);
	case ModelPackage.VOCE_DI_SPESA__VALORE:
	    return valore != VALORE_EDEFAULT;
	case ModelPackage.VOCE_DI_SPESA__TIPO:
	    return tipo != TIPO_EDEFAULT;
	case ModelPackage.VOCE_DI_SPESA__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.VOCE_DI_SPESA__NOTA:
	    return NOTA_EDEFAULT == null ? nota != null : !NOTA_EDEFAULT.equals(nota);
	case ModelPackage.VOCE_DI_SPESA__DATA:
	    return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
	result.append(", valore: ");
	result.append(valore);
	result.append(", tipo: ");
	result.append(tipo);
	result.append(", id: ");
	result.append(id);
	result.append(", nota: ");
	result.append(nota);
	result.append(", data: ");
	result.append(data);
	result.append(')');
	return result.toString();
    }

} //VoceDiSpesaImpl
