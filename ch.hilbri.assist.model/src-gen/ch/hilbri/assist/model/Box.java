/**
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
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Box#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Box#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getBox()
 * @model
 * @generated
 */
public interface Box extends HardwareElement {
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
     * @model opposite="box" containment="true"
     * @generated
     */
    EList<Board> getBoards();

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getBox_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _fullName = this.getCompartment().getFullName();\n&lt;%java.lang.String%&gt; _plus = (_fullName + \".\");\n&lt;%java.lang.String%&gt; _name = this.getName();\nreturn (_plus + _name);'"
     * @generated
     */
    String getFullName();

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
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Board%&gt; it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt;map(this.getBoards(), _function)));'"
     * @generated
     */
    EList<Processor> getAllProcessors();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Board%&gt; it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt;map(this.getBoards(), _function)));'"
     * @generated
     */
    EList<Core> getAllCores();

} // Box
