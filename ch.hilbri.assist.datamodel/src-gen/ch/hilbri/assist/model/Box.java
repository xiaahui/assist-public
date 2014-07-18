/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Box#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElementContainer {
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
	 * @see ch.hilbri.assist.model.ModelPackage#getBox_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.Box#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.model.ModelPackage#getBox_Compartment()
	 * @see ch.hilbri.assist.model.Compartment#getBoxes
	 * @model opposite="boxes" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getBox_Boards()
	 * @see ch.hilbri.assist.model.Board#getBox
	 * @model opposite="box" containment="true" required="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.model.ModelPackage#getBox_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all processors in this box
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Processor%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Processor%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.model.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Processor%>> _processors = b.getProcessors();\n\tlist.addAll(_processors);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of all cores in this box
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.model.Core%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.model.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.model.Core%>> _allCores = b.getAllCores();\n\tlist.addAll(_allCores);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Box
