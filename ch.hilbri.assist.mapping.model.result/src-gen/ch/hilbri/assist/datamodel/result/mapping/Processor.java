/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getCores <em>Cores</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getMetricParameters <em>Metric Parameters</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Processor#isNotUsed <em>Not Used</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Processor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Type</em>' attribute.
	 * @see #setProcessorType(String)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_ProcessorType()
	 * @model unique="false"
	 * @generated
	 */
	String getProcessorType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getProcessorType <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Type</em>' attribute.
	 * @see #getProcessorType()
	 * @generated
	 */
	void setProcessorType(String value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' container reference.
	 * @see #setBoard(Board)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_Board()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Board#getProcessors
	 * @model opposite="processors" transient="false"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Processor#getBoard <em>Board</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' container reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.result.mapping.Core}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_Cores()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Core#getProcessor
	 * @model opposite="processor" containment="true" required="true"
	 * @generated
	 */
	EList<Core> getCores();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.result.mapping.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

	/**
	 * Returns the value of the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this processor used? Does it contain any mapped threads?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Used</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getProcessor_NotUsed()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean result = false;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Core%>> _cores = this.getCores();\nfor (final <%ch.hilbri.assist.datamodel.result.mapping.Core%> c : _cores)\n{\n\tresult = (result || c.isNotUsed());\n}\nreturn result;'"
	 * @generated
	 */
	boolean isNotUsed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.PROCESSOR;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // Processor
