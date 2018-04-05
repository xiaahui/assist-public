/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.DissimilarityRelation#getDissimilarityClause <em>Dissimilarity Clause</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getDissimilarityRelation()
 * @model
 * @generated
 */
public interface DissimilarityRelation extends MappingRelation {
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
