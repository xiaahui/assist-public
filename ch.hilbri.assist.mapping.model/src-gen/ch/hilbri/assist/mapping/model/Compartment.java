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
 *   <li>{@link ch.hilbri.assist.mapping.model.Compartment#getFullName <em>Full Name</em>}</li>
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
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getCompartment_FullName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return this.getName();'"
	 * @generated
	 */
	String getFullName();

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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt; apply(final &lt;%ch.hilbri.assist.mapping.model.Box%&gt; it)\n\t{\n\t\treturn it.getAllBoards();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Board%&gt;&gt;&gt;map(this.getBoxes(), _function)));'"
	 * @generated
	 */
	EList<Board> getAllBoards();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt; apply(final &lt;%ch.hilbri.assist.mapping.model.Box%&gt; it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Processor%&gt;&gt;&gt;map(this.getBoxes(), _function)));'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt; apply(final &lt;%ch.hilbri.assist.mapping.model.Box%&gt; it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.mapping.model.Box%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.mapping.model.Core%&gt;&gt;&gt;map(this.getBoxes(), _function)));'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Compartment
