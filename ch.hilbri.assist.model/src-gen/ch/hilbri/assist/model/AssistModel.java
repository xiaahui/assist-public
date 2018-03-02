/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength <em>Min Hyp Period Length</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
    /**
     * Returns the value of the '<em><b>System Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System Name</em>' attribute.
     * @see #setSystemName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_SystemName()
     * @model default="" unique="false"
     * @generated
     */
    String getSystemName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System Name</em>' attribute.
     * @see #getSystemName()
     * @generated
     */
    void setSystemName(String value);

    /**
     * Returns the value of the '<em><b>Min Hyp Period Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Hyp Period Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Hyp Period Length</em>' attribute.
     * @see #setMinHypPeriodLength(int)
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_MinHypPeriodLength()
     * @model default="-1" unique="false"
     * @generated
     */
    int getMinHypPeriodLength();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength <em>Min Hyp Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Hyp Period Length</em>' attribute.
     * @see #getMinHypPeriodLength()
     * @generated
     */
    void setMinHypPeriodLength(int value);

    /**
     * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Compartment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compartments</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Compartments()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Compartment> getCompartments();

    /**
     * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Application}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applications</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Applications()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Application> getApplications();

    /**
     * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.DislocalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DislocalityRelations()
     * @model containment="true"
     * @generated
     */
    EList<DislocalityRelation> getDislocalityRelations();

    /**
     * Returns the value of the '<em><b>Colocality Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.ColocalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Colocality Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Colocality Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ColocalityRelations()
     * @model containment="true"
     * @generated
     */
    EList<ColocalityRelation> getColocalityRelations();

    /**
     * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.DissimilarityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DissimilarityRelations()
     * @model containment="true"
     * @generated
     */
    EList<DissimilarityRelation> getDissimilarityRelations();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getCompartments();'"
     * @generated
     */
    EList<Compartment> getAllCompartments();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Compartment%&gt; it)\n\t{\n\t\treturn it.getAllBoxes();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;&gt;&gt;map(this.getCompartments(), _function)));'"
     * @generated
     */
    EList<Box> getAllBoxes();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Compartment%&gt; it)\n\t{\n\t\treturn it.getAllBoards();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;&gt;&gt;map(this.getCompartments(), _function)));'"
     * @generated
     */
    EList<Board> getAllBoards();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Compartment%&gt; it)\n\t{\n\t\treturn it.getAllProcessors();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;&gt;&gt;map(this.getCompartments(), _function)));'"
     * @generated
     */
    EList<Processor> getAllProcessors();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Compartment%&gt; it)\n\t{\n\t\treturn it.getAllCores();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;&gt;&gt;map(this.getCompartments(), _function)));'"
     * @generated
     */
    EList<Core> getAllCores();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Application%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Application%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt;()\n{\n\tpublic &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt; apply(final &lt;%ch.hilbri.assist.model.Application%&gt; it)\n\t{\n\t\treturn it.getTasks();\n\t}\n};\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;toEList(&lt;%com.google.common.collect.Iterables%&gt;.&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;concat(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Application%&gt;, &lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt;map(this.getApplications(), _function)));'"
     * @generated
     */
    EList<Task> getAllTasks();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" levelUnique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _xifexpression = null;\nif ((level == 0))\n{\n\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Core%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;()\n\t{\n\t\tpublic &lt;%ch.hilbri.assist.model.HardwareElement%&gt; apply(final &lt;%ch.hilbri.assist.model.Core%&gt; it)\n\t\t{\n\t\t\treturn ((&lt;%ch.hilbri.assist.model.HardwareElement%&gt;) it);\n\t\t}\n\t};\n\t_xifexpression = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Core%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;map(this.getAllCores(), _function);\n}\nelse\n{\n\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _xifexpression_1 = null;\n\tif ((level == 1))\n\t{\n\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _function_1 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;()\n\t\t{\n\t\t\tpublic &lt;%ch.hilbri.assist.model.HardwareElement%&gt; apply(final &lt;%ch.hilbri.assist.model.Processor%&gt; it)\n\t\t\t{\n\t\t\t\treturn ((&lt;%ch.hilbri.assist.model.HardwareElement%&gt;) it);\n\t\t\t}\n\t\t};\n\t\t_xifexpression_1 = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Processor%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;map(this.getAllProcessors(), _function_1);\n\t}\n\telse\n\t{\n\t\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _xifexpression_2 = null;\n\t\tif ((level == 2))\n\t\t{\n\t\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _function_2 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;()\n\t\t\t{\n\t\t\t\tpublic &lt;%ch.hilbri.assist.model.HardwareElement%&gt; apply(final &lt;%ch.hilbri.assist.model.Board%&gt; it)\n\t\t\t\t{\n\t\t\t\t\treturn ((&lt;%ch.hilbri.assist.model.HardwareElement%&gt;) it);\n\t\t\t\t}\n\t\t\t};\n\t\t\t_xifexpression_2 = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Board%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;map(this.getAllBoards(), _function_2);\n\t\t}\n\t\telse\n\t\t{\n\t\t\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _xifexpression_3 = null;\n\t\t\tif ((level == 3))\n\t\t\t{\n\t\t\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _function_3 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Box%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;()\n\t\t\t\t{\n\t\t\t\t\tpublic &lt;%ch.hilbri.assist.model.HardwareElement%&gt; apply(final &lt;%ch.hilbri.assist.model.Box%&gt; it)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn ((&lt;%ch.hilbri.assist.model.HardwareElement%&gt;) it);\n\t\t\t\t\t}\n\t\t\t\t};\n\t\t\t\t_xifexpression_3 = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Box%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;map(this.getAllBoxes(), _function_3);\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _xifexpression_4 = null;\n\t\t\t\tif ((level == 4))\n\t\t\t\t{\n\t\t\t\t\tfinal &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt; _function_4 = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;()\n\t\t\t\t\t{\n\t\t\t\t\t\tpublic &lt;%ch.hilbri.assist.model.HardwareElement%&gt; apply(final &lt;%ch.hilbri.assist.model.Compartment%&gt; it)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn ((&lt;%ch.hilbri.assist.model.HardwareElement%&gt;) it);\n\t\t\t\t\t\t}\n\t\t\t\t\t};\n\t\t\t\t\t_xifexpression_4 = &lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.Compartment%&gt;, &lt;%ch.hilbri.assist.model.HardwareElement%&gt;&gt;map(this.getAllCompartments(), _function_4);\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\t_xifexpression_4 = null;\n\t\t\t\t}\n\t\t\t\t_xifexpression_3 = _xifexpression_4;\n\t\t\t}\n\t\t\t_xifexpression_2 = _xifexpression_3;\n\t\t}\n\t\t_xifexpression_1 = _xifexpression_2;\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;'"
     * @generated
     */
    EList<HardwareElement> getAllHardwareElements(int level);

} // AssistModel
