/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.Compartment#getPowerSupply <em>Power Supply</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Compartment#getBoxes <em>Boxes</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Power Supply</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply</em>' attribute.
	 * @see #setPowerSupply(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getCompartment_PowerSupply()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Compartment#getPowerSupply <em>Power Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply</em>' attribute.
	 * @see #getPowerSupply()
	 * @generated
	 */
	void setPowerSupply(String value);

	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Box}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Box#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getCompartment_Boxes()
	 * @see ch.hilbri.assist.mapping.model.Box#getCompartment
	 * @model opposite="compartment" containment="true" required="true"
	 * @generated
	 */
	EList<Box> getBoxes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getBoxes();'"
	 * @generated
	 */
	EList<Box> getAllBoxes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _boxes = this.getBoxes();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>> apply(final <%ch.hilbri.assist.mapping.model.Box%> it)\n\t{\n\t\treturn it.getAllBoards();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Board%>>>map(_boxes, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Board%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Board%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Board%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _boxes = this.getBoxes();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>> apply(final <%ch.hilbri.assist.mapping.model.Box%> it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Processor%>>>map(_boxes, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Processor%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Processor%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Processor%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Box%>> _boxes = this.getBoxes();\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>()\n{\n\tpublic <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>> apply(final <%ch.hilbri.assist.mapping.model.Box%> it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\n<%org.eclipse.emf.common.util.EList%><<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>> _map = <%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%>.<<%ch.hilbri.assist.mapping.model.Box%>, <%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.Core%>>>map(_boxes, _function);\n<%java.lang.Iterable%><<%ch.hilbri.assist.mapping.model.Core%>> _flatten = <%com.google.common.collect.Iterables%>.<<%ch.hilbri.assist.mapping.model.Core%>>concat(_map);\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%ch.hilbri.assist.mapping.model.Core%>>toEList(_flatten);'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Compartment
