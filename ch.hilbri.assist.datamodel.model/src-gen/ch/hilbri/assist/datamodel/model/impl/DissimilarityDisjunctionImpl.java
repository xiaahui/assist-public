/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.DissimilarityClause;
import ch.hilbri.assist.datamodel.model.DissimilarityDisjunction;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Disjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.DissimilarityDisjunctionImpl#getDissimilarityClauses <em>Dissimilarity Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DissimilarityDisjunctionImpl extends DissimilarityClauseImpl implements DissimilarityDisjunction {
	/**
	 * The cached value of the '{@link #getDissimilarityClauses() <em>Dissimilarity Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissimilarityClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<DissimilarityClause> dissimilarityClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DissimilarityDisjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISSIMILARITY_DISJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DissimilarityClause> getDissimilarityClauses() {
		if (dissimilarityClauses == null) {
			dissimilarityClauses = new EObjectContainmentEList<DissimilarityClause>(DissimilarityClause.class, this, ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES);
		}
		return dissimilarityClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES:
				return ((InternalEList<?>)getDissimilarityClauses()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES:
				return getDissimilarityClauses();
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
			case ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES:
				getDissimilarityClauses().clear();
				getDissimilarityClauses().addAll((Collection<? extends DissimilarityClause>)newValue);
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
			case ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES:
				getDissimilarityClauses().clear();
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
			case ModelPackage.DISSIMILARITY_DISJUNCTION__DISSIMILARITY_CLAUSES:
				return dissimilarityClauses != null && !dissimilarityClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DissimilarityDisjunctionImpl
