/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Disjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.DissimilarityDisjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getDissimilarityDisjunction()
 * @model
 * @generated
 */
public interface DissimilarityDisjunction extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Dissimilarity Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.DissimilarityClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Clauses</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getDissimilarityDisjunction_DissimilarityClauses()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<DissimilarityClause> getDissimilarityClauses();

} // DissimilarityDisjunction
