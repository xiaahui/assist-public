/**
 */
package ch.hilbri.assist.datamodel.model;

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
 *   <li>{@link ch.hilbri.assist.datamodel.model.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParametersBlock <em>Metric Parameters Block</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getHardwareElement()
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getHardwareElement_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.HardwareElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metric Parameters Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters Block</em>' containment reference.
	 * @see #setMetricParametersBlock(MetricParametersBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getHardwareElement_MetricParametersBlock()
	 * @model containment="true"
	 * @generated
	 */
	MetricParametersBlock getMetricParametersBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.HardwareElement#getMetricParametersBlock <em>Metric Parameters Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Parameters Block</em>' containment reference.
	 * @see #getMetricParametersBlock()
	 * @generated
	 */
	void setMetricParametersBlock(MetricParametersBlock value);

} // HardwareElement
