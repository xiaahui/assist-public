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
 *   <li>{@link ch.hilbri.assist.model.MappingRelation#getSoftwareElements <em>Software Elements</em>}</li>
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
     * Returns the value of the '<em><b>Software Elements</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.SoftwareElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Software Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Elements</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingRelation_SoftwareElements()
     * @model
     * @generated
     */
    EList<SoftwareElement> getSoftwareElements();

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
     * @generated
     */
    String getSoftwareElementNames();

} // MappingRelation
