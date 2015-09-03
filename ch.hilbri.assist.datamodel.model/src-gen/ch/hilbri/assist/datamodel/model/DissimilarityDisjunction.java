/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDissimilarityDisjunction()
 * @model
 * @generated
 */
public interface DissimilarityDisjunction extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Dissimilarity Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.DissimilarityClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Clauses</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDissimilarityDisjunction_DissimilarityClauses()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<DissimilarityClause> getDissimilarityClauses();

} // DissimilarityDisjunction
