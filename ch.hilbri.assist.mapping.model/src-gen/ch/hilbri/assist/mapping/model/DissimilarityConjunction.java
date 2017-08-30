/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dissimilarity Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.DissimilarityConjunction#getDissimilarityClauses <em>Dissimilarity Clauses</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityConjunction()
 * @model
 * @generated
 */
public interface DissimilarityConjunction extends DissimilarityClause {
	/**
	 * Returns the value of the '<em><b>Dissimilarity Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.DissimilarityClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissimilarity Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissimilarity Clauses</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getDissimilarityConjunction_DissimilarityClauses()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<DissimilarityClause> getDissimilarityClauses();

} // DissimilarityConjunction
