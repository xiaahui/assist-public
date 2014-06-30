/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.HardwareElement#getLevel <em>Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getHardwareElement()
 * @model
 * @generated
 */
public interface HardwareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.AssistPackage#getHardwareElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.HardwareElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #setLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.AssistPackage#getHardwareElement_Level()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.HardwareElement#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see ch.hilbri.assist.HardwareArchitectureLevelType
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(HardwareArchitectureLevelType value);

} // HardwareElement
