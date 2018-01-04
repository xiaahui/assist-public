/**
 */
package ch.hilbri.assist.scheduling.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.scheduling.model.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.HardwareElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.HardwareElement#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getHardwareElement()
 * @model
 * @generated
 */
public interface HardwareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getHardwareElement_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.HardwareElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getHardwareElement_Manufacturer()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.HardwareElement#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.scheduling.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getHardwareElement_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

} // HardwareElement