/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.DissimilarityClause;
import ch.hilbri.assist.mapping.model.DissimilarityConjunction;
import ch.hilbri.assist.mapping.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dissimilarity Conjunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.DissimilarityConjunctionImpl#getDissimilarityClauses <em>Dissimilarity Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DissimilarityConjunctionImpl extends DissimilarityClauseImpl implements DissimilarityConjunction {
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
	protected DissimilarityConjunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DISSIMILARITY_CONJUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DissimilarityClause> getDissimilarityClauses() {
		if (dissimilarityClauses == null) {
			dissimilarityClauses = new EObjectContainmentEList<DissimilarityClause>(DissimilarityClause.class, this, ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES);
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
			case ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES:
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
			case ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES:
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
			case ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES:
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
			case ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES:
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
			case ModelPackage.DISSIMILARITY_CONJUNCTION__DISSIMILARITY_CLAUSES:
				return dissimilarityClauses != null && !dissimilarityClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DissimilarityConjunctionImpl
