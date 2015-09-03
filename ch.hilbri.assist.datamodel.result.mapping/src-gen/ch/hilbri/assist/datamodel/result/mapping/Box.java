/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;

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
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Box#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Box#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getBox()
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getBox_Manufacturer()
	 * @model unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Box#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getBox_Compartment()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Compartment#getBoxes
	 * @model opposite="boxes" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Box#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.result.mapping.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getBox_Boards()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Board#getBox
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.result.mapping.Processor%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.result.mapping.Processor%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.datamodel.result.mapping.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Processor%>> _processors = b.getProcessors();\n\tlist.addAll(_processors);\n}\nreturn list;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.result.mapping.Core%>> list = new <%org.eclipse.emf.common.util.BasicEList%><<%ch.hilbri.assist.datamodel.result.mapping.Core%>>();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Board%>> _boards = this.getBoards();\nfor (final <%ch.hilbri.assist.datamodel.result.mapping.Board%> b : _boards)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Core%>> _allCores = b.getAllCores();\n\tlist.addAll(_allCores);\n}\nreturn list;'"
	 * @generated
	 */
	EList<Core> getAllCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType%>.BOX;'"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // Box
