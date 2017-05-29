/**
 */
package ch.hilbri.assist.mapping.model;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Box#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBox_Compartment()
	 * @see ch.hilbri.assist.mapping.model.Compartment#getBoxes
	 * @model opposite="boxes" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Box#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getBox_Boards()
	 * @see ch.hilbri.assist.mapping.model.Board#getBox
	 * @model opposite="box" containment="true" required="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBoards();'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _boards = this.getBoards();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> apply(final <%ch.hilbri.assist.mapping.model.Board%> it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>map(_boards, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Processor%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Processor%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Processor%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> _boards = this.getBoards();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> apply(final <%ch.hilbri.assist.mapping.model.Board%> it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Board%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>map(_boards, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Core%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Core%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Core%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Box
