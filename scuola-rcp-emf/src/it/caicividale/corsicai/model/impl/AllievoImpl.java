/**
 */
package it.caicividale.corsicai.model.impl;

import it.caicividale.corsicai.model.Allievo;
import it.caicividale.corsicai.model.ModelPackage;
import it.caicividale.corsicai.model.Valutazione;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allievo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.caicividale.corsicai.model.impl.AllievoImpl#getValutazioni <em>Valutazioni</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllievoImpl extends PersonaImpl implements Allievo {
	/**
	 * The cached value of the '{@link #getValutazioni() <em>Valutazioni</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValutazioni()
	 * @generated
	 * @ordered
	 */
	protected EList<Valutazione> valutazioni;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllievoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALLIEVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Valutazione> getValutazioni() {
		if (valutazioni == null) {
			valutazioni = new EObjectResolvingEList<Valutazione>(Valutazione.class, this,
					ModelPackage.ALLIEVO__VALUTAZIONI);
		}
		return valutazioni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.ALLIEVO__VALUTAZIONI:
			return getValutazioni();
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
		case ModelPackage.ALLIEVO__VALUTAZIONI:
			getValutazioni().clear();
			getValutazioni().addAll((Collection<? extends Valutazione>) newValue);
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
		case ModelPackage.ALLIEVO__VALUTAZIONI:
			getValutazioni().clear();
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
		case ModelPackage.ALLIEVO__VALUTAZIONI:
			return valutazioni != null && !valutazioni.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllievoImpl
