/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation With Two Tasks And Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getTask1 <em>Task1</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getTask2 <em>Task2</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getRelationWithTwoTasksAndDelay()
 * @model
 * @generated
 */
public interface RelationWithTwoTasksAndDelay extends SchedulingRestriction {
    /**
     * Returns the value of the '<em><b>Task1</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task1</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task1</em>' reference.
     * @see #setTask1(Task)
     * @see ch.hilbri.assist.model.ModelPackage#getRelationWithTwoTasksAndDelay_Task1()
     * @model
     * @generated
     */
    Task getTask1();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getTask1 <em>Task1</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task1</em>' reference.
     * @see #getTask1()
     * @generated
     */
    void setTask1(Task value);

    /**
     * Returns the value of the '<em><b>Task2</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task2</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task2</em>' reference.
     * @see #setTask2(Task)
     * @see ch.hilbri.assist.model.ModelPackage#getRelationWithTwoTasksAndDelay_Task2()
     * @model
     * @generated
     */
    Task getTask2();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getTask2 <em>Task2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task2</em>' reference.
     * @see #getTask2()
     * @generated
     */
    void setTask2(Task value);

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
     * @see ch.hilbri.assist.model.ModelPackage#getRelationWithTwoTasksAndDelay_Delay()
     * @model unique="false"
     * @generated
     */
    int getDelay();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.RelationWithTwoTasksAndDelay#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay(int value);

} // RelationWithTwoTasksAndDelay
