/**
 */
package ch.hilbri.assist.scheduling.model;

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
 *   <li>{@link ch.hilbri.assist.scheduling.model.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Box#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.scheduling.model.Compartment#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getBox_Compartment()
	 * @see ch.hilbri.assist.scheduling.model.Compartment#getBoxes
	 * @model opposite="boxes" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Box#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.scheduling.model.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.scheduling.model.Board#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' containment reference list.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getBox_Boards()
	 * @see ch.hilbri.assist.scheduling.model.Board#getBox
	 * @model opposite="box" containment="true"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt; apply(final &lt;%ch.hilbri.assist.scheduling.model.Board%&gt; it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Processor%&gt;&gt;&gt;map(this.getBoards(), _function)));'"
	 * @generated
	 */
	EList<Processor> getAllProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt; apply(final &lt;%ch.hilbri.assist.scheduling.model.Board%&gt; it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.scheduling.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.scheduling.model.Core%&gt;&gt;&gt;map(this.getBoards(), _function)));'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Box