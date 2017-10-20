/**
 */
package ch.hilbri.assist.dse.model;

import ch.hilbri.assist.mapping.model.AssistModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model DSE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.dse.model.AssistModelDSE#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.AssistModelDSE#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.dse.model.ModelPackage#getAssistModelDSE()
 * @model
 * @generated
 */
public interface AssistModelDSE extends AssistModel {
	/**
	 * Returns the value of the '<em><b>Application Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.dse.model.ApplicationAlternatives}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Alternatives</em>' containment reference list.
	 * @see ch.hilbri.assist.dse.model.ModelPackage#getAssistModelDSE_ApplicationAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationAlternatives> getApplicationAlternatives();

	/**
	 * Returns the value of the '<em><b>Restriction Alternatives</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.dse.model.RestrictionAlternatives}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Alternatives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Alternatives</em>' containment reference list.
	 * @see ch.hilbri.assist.dse.model.ModelPackage#getAssistModelDSE_RestrictionAlternatives()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestrictionAlternatives> getRestrictionAlternatives();

} // AssistModelDSE
