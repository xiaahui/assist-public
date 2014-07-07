/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.Core#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Core#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Core#getProcessor <em>Processor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.ResultPackage#getCore()
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
	 * @see ch.hilbri.assist.result.ResultPackage#getCore_Architecture()
	 * @model unique="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Core#getArchitecture <em>Architecture</em>}' attribute.
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
	 * @see ch.hilbri.assist.result.ResultPackage#getCore_Capacity()
	 * @model unique="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Core#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' container reference.
	 * @see #setProcessor(Processor)
	 * @see ch.hilbri.assist.result.ResultPackage#getCore_Processor()
	 * @see ch.hilbri.assist.result.Processor#getCores
	 * @model opposite="cores" transient="false"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Core#getProcessor <em>Processor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' container reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // Core
