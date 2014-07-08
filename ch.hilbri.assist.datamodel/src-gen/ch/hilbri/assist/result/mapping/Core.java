/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getRelativeUtilization <em>Relative Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#isNotUsed <em>Not Used</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getRemainingAbsoluteCapacity <em>Remaining Absolute Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Core#getRemainingRelativeCapacity <em>Remaining Relative Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore()
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_Architecture()
	 * @model unique="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Core#getArchitecture <em>Architecture</em>}' attribute.
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_Capacity()
	 * @model unique="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Core#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(int)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_Utilization()
	 * @model unique="false"
	 * @generated
	 */
	int getUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Core#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Relative Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Utilization</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_RelativeUtilization()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int _capacity = this.getCapacity();\nreturn ((((double) this.getUtilization()) * 100.0) / ((double) _capacity));'"
	 * @generated
	 */
	double getRelativeUtilization();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' container reference.
	 * @see #setProcessor(Processor)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_Processor()
	 * @see ch.hilbri.assist.result.mapping.Processor#getCores
	 * @model opposite="cores" transient="false"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Core#getProcessor <em>Processor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' container reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_Threads()
	 * @model
	 * @generated
	 */
	EList<ch.hilbri.assist.result.mapping.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this core used? Does it contain any mapped threads?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Used</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_NotUsed()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.mapping.Thread%>> _threads = this.getThreads();\nreturn _threads.isEmpty();'"
	 * @generated
	 */
	boolean isNotUsed();

	/**
	 * Returns the value of the '<em><b>Remaining Absolute Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How much absolute capacity of this core is left unused?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Absolute Capacity</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_RemainingAbsoluteCapacity()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int _capacity = this.getCapacity();\nint _utilization = this.getUtilization();\nreturn (_capacity - _utilization);'"
	 * @generated
	 */
	int getRemainingAbsoluteCapacity();

	/**
	 * Returns the value of the '<em><b>Remaining Relative Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How much relative capacity of this core is left unused?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Relative Capacity</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getCore_RemainingRelativeCapacity()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int _remainingAbsoluteCapacity = this.getRemainingAbsoluteCapacity();\nint _capacity = this.getCapacity();\nreturn (((double) _remainingAbsoluteCapacity) / ((double) _capacity));'"
	 * @generated
	 */
	double getRemainingRelativeCapacity();

} // Core
