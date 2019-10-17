/**
 */
package it.caicividale.corsicai.model.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import it.caicividale.corsicai.model.Bilancio;
import it.caicividale.corsicai.model.Corso;
import it.caicividale.corsicai.model.ETipoVoceDiSpesa;
import it.caicividale.corsicai.model.Iscrizione;
import it.caicividale.corsicai.model.ModelManager;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.VoceDiSpesa;
import it.caicividale.corsicai.model.root.ExternalizableEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Bilancio</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getVociDiSpesa
 * <em>Voci Di Spesa</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getNota
 * <em>Nota</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getTotaleEntrate
 * <em>Totale Entrate</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getTotaleUscite
 * <em>Totale Uscite</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getTotaleIscrizioni
 * <em>Totale Iscrizioni</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getTotaleEntrateConIscrizioni
 * <em>Totale Entrate Con Iscrizioni</em>}</li>
 * <li>{@link it.caicividale.corsicai.model.impl.BilancioImpl#getAvanzoCorso
 * <em>Avanzo Corso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BilancioImpl extends ExternalizableEObjectImpl implements Bilancio {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final Long ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getId()
     * @generated
     * @ordered
     */
    protected Long id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getVociDiSpesa() <em>Voci Di Spesa</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getVociDiSpesa()
     * @generated
     * @ordered
     */
    protected EList<VoceDiSpesa> vociDiSpesa;

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
     * The default value of the '{@link #getTotaleEntrate() <em>Totale
     * Entrate</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTotaleEntrate()
     * @generated
     * @ordered
     */
    protected static final float TOTALE_ENTRATE_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getTotaleUscite() <em>Totale Uscite</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTotaleUscite()
     * @generated
     * @ordered
     */
    protected static final float TOTALE_USCITE_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getTotaleIscrizioni() <em>Totale
     * Iscrizioni</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTotaleIscrizioni()
     * @generated
     * @ordered
     */
    protected static final float TOTALE_ISCRIZIONI_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getTotaleEntrateConIscrizioni() <em>Totale
     * Entrate Con Iscrizioni</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getTotaleEntrateConIscrizioni()
     * @generated
     * @ordered
     */
    protected static final float TOTALE_ENTRATE_CON_ISCRIZIONI_EDEFAULT = 0.0F;

    /**
     * The default value of the '{@link #getAvanzoCorso() <em>Avanzo Corso</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAvanzoCorso()
     * @generated
     * @ordered
     */
    protected static final float AVANZO_CORSO_EDEFAULT = 0.0F;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected BilancioImpl() {
	super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
	return ModelPackage.Literals.BILANCIO;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Long getId() {
	return id;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setId(Long newId) {
	Long oldId = id;
	id = newId;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BILANCIO__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<VoceDiSpesa> getVociDiSpesa() {
	if (vociDiSpesa == null) {
	    vociDiSpesa = new EObjectResolvingEList<VoceDiSpesa>(VoceDiSpesa.class, this,
		    ModelPackage.BILANCIO__VOCI_DI_SPESA);
	}
	return vociDiSpesa;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getNota() {
	return nota;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNota(String newNota) {
	String oldNota = nota;
	nota = newNota;
	if (eNotificationRequired())
	    eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BILANCIO__NOTA, oldNota, nota));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public float getTotaleEntrate() {
	Float totale = 0F;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getBilancio() != null && !corso.getBilancio().getVociDiSpesa().isEmpty()) {
	    List<VoceDiSpesa> vociDiSpesa = corso.getBilancio().getVociDiSpesa();
	    List<VoceDiSpesa> vociDiSpesaEntrate = vociDiSpesa.stream()
		    .filter(v -> v.getTipo().equals(ETipoVoceDiSpesa.ENTRATA)).collect(Collectors.toList());
	    for (VoceDiSpesa voceDiSpesa : vociDiSpesaEntrate) {
		totale += voceDiSpesa.getValore();
	    }
	}
	System.out.println("Totale entrate:" + totale);

	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public float getTotaleUscite() {
	Float totale = 0F;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getBilancio() != null && !corso.getBilancio().getVociDiSpesa().isEmpty()) {
	    List<VoceDiSpesa> vociDiSpesa = corso.getBilancio().getVociDiSpesa();
	    List<VoceDiSpesa> vociDiSpesaUscite = vociDiSpesa.stream()
		    .filter(v -> v.getTipo().equals(ETipoVoceDiSpesa.USCITA)).collect(Collectors.toList());
	    for (VoceDiSpesa voceDiSpesa : vociDiSpesaUscite) {
		totale += voceDiSpesa.getValore();
	    }
	}
	System.out.println("Totale uscite:" + totale);

	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public float getTotaleIscrizioni() {
	Float totale = 0F;
	ModelManager modelManager = ModelManager.getInstance();
	Corso corso = modelManager.getCorsoObservable().getValue();
	if (corso != null && corso.getBilancio() != null && !corso.getIscrizioni().isEmpty()) {
	    List<Iscrizione> iscrizioni = corso.getIscrizioni();
	    for (Iscrizione iscrizione : iscrizioni) {
		totale += iscrizione.getTotaleVersato();
	    }
	}
	System.out.println("Totale iscrizioni:" + totale);
	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public float getTotaleEntrateConIscrizioni() {
	Float totale = getTotaleIscrizioni() + getTotaleEntrate();
	System.out.println("Totale entrate con iscrizioni:" + totale);
	return totale;

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public float getAvanzoCorso() {
	Float totale = getTotaleEntrateConIscrizioni() - getTotaleUscite();
	System.out.println("Avanzo corso:" + totale);
	return totale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
	switch (featureID) {
	case ModelPackage.BILANCIO__ID:
	    return getId();
	case ModelPackage.BILANCIO__VOCI_DI_SPESA:
	    return getVociDiSpesa();
	case ModelPackage.BILANCIO__NOTA:
	    return getNota();
	case ModelPackage.BILANCIO__TOTALE_ENTRATE:
	    return getTotaleEntrate();
	case ModelPackage.BILANCIO__TOTALE_USCITE:
	    return getTotaleUscite();
	case ModelPackage.BILANCIO__TOTALE_ISCRIZIONI:
	    return getTotaleIscrizioni();
	case ModelPackage.BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI:
	    return getTotaleEntrateConIscrizioni();
	case ModelPackage.BILANCIO__AVANZO_CORSO:
	    return getAvanzoCorso();
	}
	return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
	switch (featureID) {
	case ModelPackage.BILANCIO__ID:
	    setId((Long) newValue);
	    return;
	case ModelPackage.BILANCIO__VOCI_DI_SPESA:
	    getVociDiSpesa().clear();
	    getVociDiSpesa().addAll((Collection<? extends VoceDiSpesa>) newValue);
	    return;
	case ModelPackage.BILANCIO__NOTA:
	    setNota((String) newValue);
	    return;
	}
	super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
	switch (featureID) {
	case ModelPackage.BILANCIO__ID:
	    setId(ID_EDEFAULT);
	    return;
	case ModelPackage.BILANCIO__VOCI_DI_SPESA:
	    getVociDiSpesa().clear();
	    return;
	case ModelPackage.BILANCIO__NOTA:
	    setNota(NOTA_EDEFAULT);
	    return;
	}
	super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
	switch (featureID) {
	case ModelPackage.BILANCIO__ID:
	    return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
	case ModelPackage.BILANCIO__VOCI_DI_SPESA:
	    return vociDiSpesa != null && !vociDiSpesa.isEmpty();
	case ModelPackage.BILANCIO__NOTA:
	    return NOTA_EDEFAULT == null ? nota != null : !NOTA_EDEFAULT.equals(nota);
	case ModelPackage.BILANCIO__TOTALE_ENTRATE:
	    return getTotaleEntrate() != TOTALE_ENTRATE_EDEFAULT;
	case ModelPackage.BILANCIO__TOTALE_USCITE:
	    return getTotaleUscite() != TOTALE_USCITE_EDEFAULT;
	case ModelPackage.BILANCIO__TOTALE_ISCRIZIONI:
	    return getTotaleIscrizioni() != TOTALE_ISCRIZIONI_EDEFAULT;
	case ModelPackage.BILANCIO__TOTALE_ENTRATE_CON_ISCRIZIONI:
	    return getTotaleEntrateConIscrizioni() != TOTALE_ENTRATE_CON_ISCRIZIONI_EDEFAULT;
	case ModelPackage.BILANCIO__AVANZO_CORSO:
	    return getAvanzoCorso() != AVANZO_CORSO_EDEFAULT;
	}
	return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
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

} // BilancioImpl
