/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Box#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Box#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElement {
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getBox_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Box#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.result.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getBox_Compartment()
	 * @see ch.hilbri.assist.mapping.model.result.Compartment#getBoxes
	 * @model opposite="boxes" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Box#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.result.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.result.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getBox_Boards()
	 * @see ch.hilbri.assist.mapping.model.result.Board#getBox
	 * @model opposite="box" containment="true" required="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a list of all processors on this box
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.result.Processor%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.result.Processor%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.result.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.mapping.model.result.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.result.Processor%>> _processors = b.getProcessors();\n\tlist.addAll(_processors);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a list of all cores on this box
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.result.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.mapping.model.result.Core%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.result.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.mapping.model.result.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.result.Core%>> _allCores = b.getAllCores();\n\tlist.addAll(_allCores);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%ch.hilbri.assist.mapping.model.HardwareArchitectureLevelType%>.BOX;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // Box
