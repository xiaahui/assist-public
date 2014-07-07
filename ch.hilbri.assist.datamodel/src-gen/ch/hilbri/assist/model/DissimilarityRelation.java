/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ** RELATIONS  ***
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityRelation()
 * @model
 * @generated
 */
public interface DissimilarityRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * Returns the value of the '<em><b>Dissimilarity Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Clause</em>' containment reference.
	 * @see #setDissimilarityClause(DissimilarityClause)
	 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityRelation_DissimilarityClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DissimilarityClause getDissimilarityClause();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissimilarity Clause</em>' containment reference.
	 * @see #getDissimilarityClause()
	 * @generated
	 */
	void setDissimilarityClause(DissimilarityClause value);

} // DissimilarityRelation
