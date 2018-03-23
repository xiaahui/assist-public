/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.DissimilarityClause;
import ch.hilbri.assist.model.DissimilarityRelation;
import ch.hilbri.assist.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.DissimilarityRelationImpl#getDissimilarityClause <em>Dissimilarity Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DissimilarityRelationImpl extends MappingRelationImpl implements DissimilarityRelation {
	/**
	 * The cached value of the '{@link #getDissimilarityClause() <em>Dissimilarity Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarityClause()
	 * @generated
	 * @ordered
	 */
	protected DissimilarityClause dissimilarityClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISSIMILARITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DissimilarityClause getDissimilarityClause() {
		return dissimilarityClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDissimilarityClause(DissimilarityClause newDissimilarityClause, NotificationChain msgs) {
		DissimilarityClause oldDissimilarityClause = dissimilarityClause;
		dissimilarityClause = newDissimilarityClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE, oldDissimilarityClause, newDissimilarityClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissimilarityClause(DissimilarityClause newDissimilarityClause) {
		if (newDissimilarityClause != dissimilarityClause) {
			NotificationChain msgs = null;
			if (dissimilarityClause != null)
				msgs = ((InternalEObject)dissimilarityClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE, null, msgs);
			if (newDissimilarityClause != null)
				msgs = ((InternalEObject)newDissimilarityClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE, null, msgs);
			msgs = basicSetDissimilarityClause(newDissimilarityClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE, newDissimilarityClause, newDissimilarityClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				return basicSetDissimilarityClause(null, msgs);
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
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				return getDissimilarityClause();
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
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				setDissimilarityClause((DissimilarityClause)newValue);
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
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				setDissimilarityClause((DissimilarityClause)null);
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
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				return dissimilarityClause != null;
		}
		return super.eIsSet(featureID);
	}

} //DissimilarityRelationImpl
