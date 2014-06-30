/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dislocality Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.DislocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getDislocalityRelation()
 * @model
 * @generated
 */
public interface DislocalityRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.AssistPackage#getDislocalityRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #setHardwareLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.AssistPackage#getDislocalityRelation_HardwareLevel()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #getHardwareLevel()
	 * @generated
	 */
	void setHardwareLevel(HardwareArchitectureLevelType value);

} // DislocalityRelation
