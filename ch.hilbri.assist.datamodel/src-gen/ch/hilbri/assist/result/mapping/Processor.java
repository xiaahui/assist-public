/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.mapping.Processor#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Processor#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Processor#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Processor#getCores <em>Cores</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.mapping.Processor#isNotUsed <em>Not Used</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor()
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Processor#getManufacturer <em>Manufacturer</em>}' attribute.
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
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor_ProcessorType()
	 * @model unique="false"
	 * @generated
	 */
	String getProcessorType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Processor#getProcessorType <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Type</em>' attribute.
	 * @see #getProcessorType()
	 * @generated
	 */
	void setProcessorType(String value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' container reference.
	 * @see #setBoard(Board)
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor_Board()
	 * @see ch.hilbri.assist.result.mapping.Board#getProcessors
	 * @model opposite="processors" transient="false"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.mapping.Processor#getBoard <em>Board</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' container reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.mapping.Core}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.mapping.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor_Cores()
	 * @see ch.hilbri.assist.result.mapping.Core#getProcessor
	 * @model opposite="processor" containment="true" required="true"
	 * @generated
	 */
	EList<Core> getCores();

	/**
	 * Returns the value of the '<em><b>Not Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this processor used? Does it contain any mapped threads?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Used</em>' attribute.
	 * @see ch.hilbri.assist.result.mapping.MappingPackage#getProcessor_NotUsed()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean result = false;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.mapping.Core%>> _cores = this.getCores();\nfor (final <%ch.hilbri.assist.result.mapping.Core%> c : _cores)\n{\n\tboolean _or = false;\n\tif (result)\n\t{\n\t\t_or = true;\n\t} else\n\t{\n\t\tboolean _isNotUsed = c.isNotUsed();\n\t\t_or = _isNotUsed;\n\t}\n\tresult = _or;\n}\nreturn result;'"
	 * @generated
	 */
	boolean isNotUsed();

} // Processor
