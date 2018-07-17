/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.MappingRelation#getAbstractSoftwareElements <em>Abstract Software Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingRelation#getHardwareLevel <em>Hardware Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingRelation#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingRelation#getSoftwareElementNames <em>Software Element Names</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation()
 * @model
 * @generated
 */
public interface MappingRelation extends EObject {
    /**
     * Returns the value of the '<em><b>Abstract Software Elements</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.AbstractSoftwareElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Software Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Software Elements</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation_AbstractSoftwareElements()
     * @model
     * @generated
     */
    EList<AbstractSoftwareElement> getAbstractSoftwareElements();

    /**
     * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see #setHardwareLevel(HardwareArchitectureLevelType)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation_HardwareLevel()
     * @model unique="false"
     * @generated
     */
    HardwareArchitectureLevelType getHardwareLevel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingRelation#getHardwareLevel <em>Hardware Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see #getHardwareLevel()
     * @generated
     */
    void setHardwareLevel(HardwareArchitectureLevelType value);

    /**
     * Returns the value of the '<em><b>All Tasks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>All Tasks</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>All Tasks</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation_AllTasks()
     * @model unique="false" dataType="ch.hilbri.assist.model.ListOfTaskLists" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final &lt;%java.util.List%&gt;&lt;&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt; list = &lt;%org.eclipse.xtext.xbase.lib.CollectionLiterals%&gt;.&lt;&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt;newArrayList();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt;&gt; _abstractSoftwareElements = this.getAbstractSoftwareElements();\nfor (final &lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt; ase : _abstractSoftwareElements)\n{\n\t{\n\t\tif ((ase instanceof &lt;%ch.hilbri.assist.model.Application%&gt;))\n\t\t{\n\t\t\tlist.add(((&lt;%ch.hilbri.assist.model.Application%&gt;)ase).getTasks());\n\t\t}\n\t\tif ((ase instanceof &lt;%ch.hilbri.assist.model.Task%&gt;))\n\t\t{\n\t\t\tlist.add(&lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;toEList(java.util.Collections.&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;newArrayList(((&lt;%ch.hilbri.assist.model.Task%&gt;)ase)))));\n\t\t}\n\t}\n}\nreturn &lt;%org.eclipse.emf.common.util.ECollections%&gt;.&lt;&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.Task%&gt;&gt;&gt;toEList(list);'"
     * @generated
     */
    EList<EList<Task>> getAllTasks();

    /**
     * Returns the value of the '<em><b>Software Element Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Software Element Names</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Element Names</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation_SoftwareElementNames()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final &lt;%java.lang.StringBuilder%&gt; output = new &lt;%java.lang.StringBuilder%&gt;();\n&lt;%org.eclipse.emf.common.util.EList%&gt;&lt;&lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt;&gt; _abstractSoftwareElements = this.getAbstractSoftwareElements();\nfor (final &lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt; ase : _abstractSoftwareElements)\n{\n\t{\n\t\tif ((ase instanceof &lt;%ch.hilbri.assist.model.Application%&gt;))\n\t\t{\n\t\t\toutput.append(((&lt;%ch.hilbri.assist.model.Application%&gt;)ase).getName());\n\t\t}\n\t\tif ((ase instanceof &lt;%ch.hilbri.assist.model.Task%&gt;))\n\t\t{\n\t\t\toutput.append(((&lt;%ch.hilbri.assist.model.Task%&gt;)ase).getName());\n\t\t}\n\t\t&lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt; _last = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.&lt;&lt;%ch.hilbri.assist.model.AbstractSoftwareElement%&gt;&gt;last(this.getAbstractSoftwareElements());\n\t\tboolean _notEquals = (!&lt;%com.google.common.base.Objects%&gt;.equal(ase, _last));\n\t\tif (_notEquals)\n\t\t{\n\t\t\toutput.append(\", \");\n\t\t}\n\t}\n}\nreturn output.toString();'"
     * @generated
     */
    String getSoftwareElementNames();

} // MappingRelation
