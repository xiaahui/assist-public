/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RestrictionsBlock;
import ch.hilbri.assist.datamodel.model.ValidDeployment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restrictions Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl#getValidDeployments <em>Valid Deployments</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.RestrictionsBlockImpl#getInvalidDeployments <em>Invalid Deployments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestrictionsBlockImpl extends MinimalEObjectImpl.Container implements RestrictionsBlock {
	/**
	 * The cached value of the '{@link #getDislocalityRelations() <em>Dislocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDislocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<DislocalityRelation> dislocalityRelations;

	/**
	 * The cached value of the '{@link #getColocalityRelations() <em>Colocality Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColocalityRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ColocalityRelation> colocalityRelations;

	/**
	 * The cached value of the '{@link #getValidDeployments() <em>Valid Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<ValidDeployment> validDeployments;

	/**
	 * The cached value of the '{@link #getInvalidDeployments() <em>Invalid Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<InvalidDeployment> invalidDeployments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionsBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESTRICTIONS_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DislocalityRelation> getDislocalityRelations() {
		if (dislocalityRelations == null) {
			dislocalityRelations = new EObjectContainmentEList<DislocalityRelation>(DislocalityRelation.class, this, ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS);
		}
		return dislocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColocalityRelation> getColocalityRelations() {
		if (colocalityRelations == null) {
			colocalityRelations = new EObjectContainmentEList<ColocalityRelation>(ColocalityRelation.class, this, ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS);
		}
		return colocalityRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValidDeployment> getValidDeployments() {
		if (validDeployments == null) {
			validDeployments = new EObjectContainmentEList<ValidDeployment>(ValidDeployment.class, this, ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS);
		}
		return validDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvalidDeployment> getInvalidDeployments() {
		if (invalidDeployments == null) {
			invalidDeployments = new EObjectContainmentEList<InvalidDeployment>(InvalidDeployment.class, this, ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS);
		}
		return invalidDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS:
				return ((InternalEList<?>)getDislocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS:
				return ((InternalEList<?>)getColocalityRelations()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS:
				return ((InternalEList<?>)getValidDeployments()).basicRemove(otherEnd, msgs);
			case ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS:
				return ((InternalEList<?>)getInvalidDeployments()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS:
				return getDislocalityRelations();
			case ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS:
				return getColocalityRelations();
			case ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS:
				return getValidDeployments();
			case ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS:
				return getInvalidDeployments();
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
			case ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				getDislocalityRelations().addAll((Collection<? extends DislocalityRelation>)newValue);
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
				getColocalityRelations().addAll((Collection<? extends ColocalityRelation>)newValue);
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS:
				getValidDeployments().clear();
				getValidDeployments().addAll((Collection<? extends ValidDeployment>)newValue);
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS:
				getInvalidDeployments().clear();
				getInvalidDeployments().addAll((Collection<? extends InvalidDeployment>)newValue);
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
			case ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS:
				getDislocalityRelations().clear();
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS:
				getColocalityRelations().clear();
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS:
				getValidDeployments().clear();
				return;
			case ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS:
				getInvalidDeployments().clear();
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
			case ModelPackage.RESTRICTIONS_BLOCK__DISLOCALITY_RELATIONS:
				return dislocalityRelations != null && !dislocalityRelations.isEmpty();
			case ModelPackage.RESTRICTIONS_BLOCK__COLOCALITY_RELATIONS:
				return colocalityRelations != null && !colocalityRelations.isEmpty();
			case ModelPackage.RESTRICTIONS_BLOCK__VALID_DEPLOYMENTS:
				return validDeployments != null && !validDeployments.isEmpty();
			case ModelPackage.RESTRICTIONS_BLOCK__INVALID_DEPLOYMENTS:
				return invalidDeployments != null && !invalidDeployments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RestrictionsBlockImpl
