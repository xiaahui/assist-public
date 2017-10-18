/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.ApplicationAlternatives;
import ch.hilbri.assist.dse.model.AssistModelDSE;
import ch.hilbri.assist.dse.model.ModelPackage;

import ch.hilbri.assist.mapping.model.impl.AssistModelImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assist Model DSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssistModelDSEImpl extends AssistModelImpl implements AssistModelDSE {
	/**
	 * The cached value of the '{@link #getApplicationAlternatives() <em>Application Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationAlternatives> applicationAlternatives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelDSEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ASSIST_MODEL_DSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationAlternatives> getApplicationAlternatives() {
		if (applicationAlternatives == null) {
			applicationAlternatives = new EObjectContainmentEList<ApplicationAlternatives>(ApplicationAlternatives.class, this, ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES);
		}
		return applicationAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES:
				return ((InternalEList<?>)getApplicationAlternatives()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES:
				return getApplicationAlternatives();
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
			case ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES:
				getApplicationAlternatives().clear();
				getApplicationAlternatives().addAll((Collection<? extends ApplicationAlternatives>)newValue);
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
			case ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES:
				getApplicationAlternatives().clear();
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
			case ModelPackage.ASSIST_MODEL_DSE__APPLICATION_ALTERNATIVES:
				return applicationAlternatives != null && !applicationAlternatives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssistModelDSEImpl
