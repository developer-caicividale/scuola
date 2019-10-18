/**
 */
package it.caicividale.corsicai.model.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import it.caicividale.corsicai.model.Cassa;
import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.ModelManager;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.RipartizioneCassa;
import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Cassa</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.CassaImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.CassaImpl#getTotale <em>Totale</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.CassaImpl#getRipartizioniCassa <em>Ripartizioni Cassa</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.CassaImpl#getNota <em>Nota</em>}</li>
 *   <li>{@link it.caicividale.corsicai.model.impl.CassaImpl#getDifferenzaTotaleCasseEAvanzo <em>Differenza Totale Casse EAvanzo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CassaImpl extends ExternalizableEObjectImpl implements Cassa {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final long ID_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected long id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getTotale() <em>Totale</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getTotale()
     * @generated
     * @ordered
     */
    protected static final float TOTALE_EDEFAULT = 0.0F;

    /**
     * The cached value of the '{@link #getRipartizioniCassa() <em>Ripartizioni Cassa</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getRipartizioniCassa()
     * @generated
     * @ordered
     */
    protected EList<RipartizioneCassa> ripartizioniCassa;

    /**
     * The default value of the '{@link #getNota() <em>Nota</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNota()
     * @generated
     * @ordered
     */
    protected static final String NOTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNota() <em>Nota</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNota()
     * @generated
     * @ordered
     */
    protected String nota = NOTA_EDEFAULT;

    /**
     * The default value of the '{@link #getDifferenzaTotaleCasseEAvanzo() <em>Differenza Totale Casse EAvanzo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDifferenzaTotaleCasseEAvanzo()
     * @generated
     * @ordered
     */
    protected static final float DIFFERENZA_TOTALE_CASSE_EAVANZO_EDEFAULT = 0.0F;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected CassaImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.CASSA;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setId(long newId) {
	long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CASSA__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public float getTotale() {
	Float totale = 0F;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getCassa() != null && !corso.getCassa().getRipartizioniCassa().isEmpty()) {
	    List<RipartizioneCassa> ripartizioniCassa = corso.getCassa().getRipartizioniCassa();
	    for (RipartizioneCassa ripartizioneCassa : ripartizioniCassa) {
		totale += ripartizioneCassa.getQuota();
	    }
	}
	System.out.println("Totale ripartizioni cassa:" + totale);
	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RipartizioneCassa> getRipartizioniCassa() {
	if (ripartizioniCassa == null) {
	    ripartizioniCassa = new EObjectResolvingEList<RipartizioneCassa>(RipartizioneCassa.class, this,
		    ModelPackage.CASSA__RIPARTIZIONI_CASSA);
	}
	return ripartizioniCassa;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getNota() {
	return nota;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNota(String newNota) {
	String oldNota = nota;
	nota = newNota;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CASSA__NOTA, oldNota, nota));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public float getDifferenzaTotaleCasseEAvanzo() {
	// TODO: implement this method to return the 'Differenza Totale Casse EAvanzo' attribute
	// Ensure that you remove @generated or mark it @generated NOT
	throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.CASSA__ID:
	    return getId();
	case ModelPackage.CASSA__TOTALE:
	    return getTotale();
	case ModelPackage.CASSA__RIPARTIZIONI_CASSA:
	    return getRipartizioniCassa();
	case ModelPackage.CASSA__NOTA:
	    return getNota();
	case ModelPackage.CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO:
	    return getDifferenzaTotaleCasseEAvanzo();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.CASSA__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.CASSA__RIPARTIZIONI_CASSA:
	    getRipartizioniCassa().clear();
	    getRipartizioniCassa().addAll((Collection<? extends RipartizioneCassa>) newValue);
	    return;
	case ModelPackage.CASSA__NOTA:
	    setNota((String) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.CASSA__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.CASSA__RIPARTIZIONI_CASSA:
	    getRipartizioniCassa().clear();
	    return;
	case ModelPackage.CASSA__NOTA:
	    setNota(NOTA_EDEFAULT);
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.CASSA__ID:
	    return id != ID_EDEFAULT;
	case ModelPackage.CASSA__TOTALE:
	    return getTotale() != TOTALE_EDEFAULT;
	case ModelPackage.CASSA__RIPARTIZIONI_CASSA:
	    return ripartizioniCassa != null && !ripartizioniCassa.isEmpty();
	case ModelPackage.CASSA__NOTA:
	    return NOTA_EDEFAULT == null ? nota != null : !NOTA_EDEFAULT.equals(nota);
	case ModelPackage.CASSA__DIFFERENZA_TOTALE_CASSE_EAVANZO:
	    return getDifferenzaTotaleCasseEAvanzo() != DIFFERENZA_TOTALE_CASSE_EAVANZO_EDEFAULT;
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	if (eIsProxy())
	    return super.toString();

	StringBuilder result = new StringBuilder(super.toString());
	result.append(" (id: ");
	result.append(id);
	result.append(", nota: ");
	result.append(nota);
	result.append(')');
	return result.toString();
    }

} // CassaImpl
