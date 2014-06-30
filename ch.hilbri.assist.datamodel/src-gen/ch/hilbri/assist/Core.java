/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.Core#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.Core#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.Core#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.Core#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see ch.hilbri.assist.AssistPackage#getCore_Architecture()
	 * @model unique="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Core#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see ch.hilbri.assist.AssistPackage#getCore_Capacity()
	 * @model unique="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Core#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' container reference.
	 * @see #setProcessor(Processor)
	 * @see ch.hilbri.assist.AssistPackage#getCore_Processor()
	 * @see ch.hilbri.assist.Processor#getCores
	 * @model opposite="cores" transient="false"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Core#getProcessor <em>Processor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' container reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getCore_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

} // Core
