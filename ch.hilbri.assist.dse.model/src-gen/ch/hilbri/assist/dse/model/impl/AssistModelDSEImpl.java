/**
 */
package ch.hilbri.assist.dse.model.impl;

import ch.hilbri.assist.dse.model.ApplicationAlternatives;
import ch.hilbri.assist.dse.model.AssistModelDSE;
import ch.hilbri.assist.dse.model.ExplorationCandidate;
import ch.hilbri.assist.dse.model.ModelPackage;
import ch.hilbri.assist.dse.model.RestrictionAlternatives;

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
 *   <li>{@link ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.impl.AssistModelDSEImpl#getExplorationCandidates <em>Exploration Candidates</em>}</li>
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
	 * The cached value of the '{@link #getRestrictionAlternatives() <em>Restriction Alternatives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionAlternatives()
	 * @generated
	 * @ordered
	 */
	protected EList<RestrictionAlternatives> restrictionAlternatives;

	/**
	 * The cached value of the '{@link #getExplorationCandidates() <em>Exploration Candidates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplorationCandidates()
	 * @generated
	 * @ordered
	 */
	protected EList<ExplorationCandidate> explorationCandidates;

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
	public EList<RestrictionAlternatives> getRestrictionAlternatives() {
		if (restrictionAlternatives == null) {
			restrictionAlternatives = new EObjectContainmentEList<RestrictionAlternatives>(RestrictionAlternatives.class, this, ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES);
		}
		return restrictionAlternatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExplorationCandidate> getExplorationCandidates() {
		if (explorationCandidates == null) {
			explorationCandidates = new EObjectContainmentEList<ExplorationCandidate>(ExplorationCandidate.class, this, ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES);
		}
		return explorationCandidates;
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
			case ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES:
				return ((InternalEList<?>)getRestrictionAlternatives()).basicRemove(otherEnd, msgs);
			case ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES:
				return ((InternalEList<?>)getExplorationCandidates()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES:
				return getRestrictionAlternatives();
			case ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES:
				return getExplorationCandidates();
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
			case ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES:
				getRestrictionAlternatives().clear();
				getRestrictionAlternatives().addAll((Collection<? extends RestrictionAlternatives>)newValue);
				return;
			case ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES:
				getExplorationCandidates().clear();
				getExplorationCandidates().addAll((Collection<? extends ExplorationCandidate>)newValue);
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
			case ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES:
				getRestrictionAlternatives().clear();
				return;
			case ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES:
				getExplorationCandidates().clear();
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
			case ModelPackage.ASSIST_MODEL_DSE__RESTRICTION_ALTERNATIVES:
				return restrictionAlternatives != null && !restrictionAlternatives.isEmpty();
			case ModelPackage.ASSIST_MODEL_DSE__EXPLORATION_CANDIDATES:
				return explorationCandidates != null && !explorationCandidates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssistModelDSEImpl
