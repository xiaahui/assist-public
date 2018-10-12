/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.ComplexRelation#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ComplexRelation#getOtherTask <em>Other Task</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ComplexRelation#getDelay <em>Delay</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.ComplexRelation#getTaskNames <em>Task Names</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getComplexRelation()
 * @model
 * @generated
 */
public interface ComplexRelation extends SchedulingRestriction {
    /**
     * Returns the value of the '<em><b>Tasks</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Task}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tasks</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getComplexRelation_Tasks()
     * @model required="true"
     * @generated
     */
    EList<Task> getTasks();

    /**
     * Returns the value of the '<em><b>Other Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Other Task</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Other Task</em>' reference.
     * @see #setOtherTask(Task)
     * @see ch.hilbri.assist.model.ModelPackage#getComplexRelation_OtherTask()
     * @model
     * @generated
     */
    Task getOtherTask();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ComplexRelation#getOtherTask <em>Other Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Other Task</em>' reference.
     * @see #getOtherTask()
     * @generated
     */
    void setOtherTask(Task value);

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(int)
     * @see ch.hilbri.assist.model.ModelPackage#getComplexRelation_Delay()
     * @model unique="false"
     * @generated
     */
    int getDelay();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.ComplexRelation#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(int value);

    /**
     * Returns the value of the '<em><b>Task Names</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Names</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Names</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getComplexRelation_TaskNames()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getTaskNames();

} // ComplexRelation
