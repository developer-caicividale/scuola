/**
 */
package it.caicividale.scuola.emf.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import it.caicividale.scuola.emf.model.DizMateriale;
import it.caicividale.scuola.emf.model.ModelPackage;
import it.caicividale.scuola.emf.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diz Materiale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.scuola.emf.model.impl.DizMaterialeImpl#getQuotaNoleggio <em>Quota Noleggio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DizMaterialeImpl extends ExternalizableEObjectImpl implements DizMateriale {
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
     * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected static final String NOME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNome()
     * @generated
     * @ordered
     */
    protected String nome = NOME_EDEFAULT;

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
     * The default value of the '{@link #getQuotaNoleggio() <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuotaNoleggio()
     * @generated
     * @ordered
     */
    protected static final float QUOTA_NOLEGGIO_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getQuotaNoleggio() <em>Quota Noleggio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQuotaNoleggio()
     * @generated
     * @ordered
     */
    protected float quotaNoleggio = QUOTA_NOLEGGIO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DizMaterialeImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.DIZ_MATERIALE;
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_MATERIALE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNome() {
	return nome;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNome(String newNome) {
	String oldNome = nome;
	nome = newNome;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_MATERIALE__NOME, oldNome, nome));
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
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_MATERIALE__NOTA, oldNota, nota));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getQuotaNoleggio() {
	return quotaNoleggio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQuotaNoleggio(float newQuotaNoleggio) {
	float oldQuotaNoleggio = quotaNoleggio;
	quotaNoleggio = newQuotaNoleggio;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIZ_MATERIALE__QUOTA_NOLEGGIO,
		    oldQuotaNoleggio, quotaNoleggio));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.DIZ_MATERIALE__ID:
	    return getId();
	case ModelPackage.DIZ_MATERIALE__NOME:
	    return getNome();
	case ModelPackage.DIZ_MATERIALE__NOTA:
	    return getNota();
	case ModelPackage.DIZ_MATERIALE__QUOTA_NOLEGGIO:
	    return getQuotaNoleggio();
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
	case ModelPackage.DIZ_MATERIALE__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.DIZ_MATERIALE__NOME:
	    setNome((String) newValue);
	    return;
	case ModelPackage.DIZ_MATERIALE__NOTA:
	    setNota((String) newValue);
	    return;
	case ModelPackage.DIZ_MATERIALE__QUOTA_NOLEGGIO:
	    setQuotaNoleggio((Float) newValue);
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
	case ModelPackage.DIZ_MATERIALE__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.DIZ_MATERIALE__NOME:
	    setNome(NOME_EDEFAULT);
	    return;
	case ModelPackage.DIZ_MATERIALE__NOTA:
	    setNota(NOTA_EDEFAULT);
	    return;
	case ModelPackage.DIZ_MATERIALE__QUOTA_NOLEGGIO:
	    setQuotaNoleggio(QUOTA_NOLEGGIO_EDEFAULT);
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
	case ModelPackage.DIZ_MATERIALE__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.DIZ_MATERIALE__NOME:
	    return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
	case ModelPackage.DIZ_MATERIALE__NOTA:
	    return NOTA_EDEFAULT == null ? nota != null : !NOTA_EDEFAULT.equals(nota);
	case ModelPackage.DIZ_MATERIALE__QUOTA_NOLEGGIO:
	    return quotaNoleggio != QUOTA_NOLEGGIO_EDEFAULT;
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
	result.append(", nome: ");
	result.append(nome);
	result.append(", nota: ");
	result.append(nota);
	result.append(", quotaNoleggio: ");
	result.append(quotaNoleggio);
	result.append(')');
	return result.toString();
    }

} //DizMaterialeImpl
