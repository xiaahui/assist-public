/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.DissimilarityClause;
import ch.hilbri.assist.mapping.model.DissimilarityRelation;
import ch.hilbri.assist.mapping.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.DissimilarityRelationImpl#getDissimilarityClause <em>Dissimilarity Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DissimilarityRelationImpl extends MinimalEObjectImpl.Container implements DissimilarityRelation {
	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

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
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectResolvingEList<Application>(Application.class, this, ModelPackage.DISSIMILARITY_RELATION__APPLICATIONS);
		}
		return applications;
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
			case ModelPackage.DISSIMILARITY_RELATION__APPLICATIONS:
				return getApplications();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DISSIMILARITY_RELATION__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
				return;
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
			case ModelPackage.DISSIMILARITY_RELATION__APPLICATIONS:
				getApplications().clear();
				return;
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
			case ModelPackage.DISSIMILARITY_RELATION__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case ModelPackage.DISSIMILARITY_RELATION__DISSIMILARITY_CLAUSE:
				return dissimilarityClause != null;
		}
		return super.eIsSet(featureID);
	}

} //DissimilarityRelationImpl
