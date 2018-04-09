/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  **************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.RestrictionAlternatives#getAlternatives <em>Alternatives</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getRestrictionAlternatives()
 * @model
 * @generated
 */
public interface RestrictionAlternatives extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.RestrictionAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternatives</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getRestrictionAlternatives_Alternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestrictionAlternative> getAlternatives();

} // RestrictionAlternatives
