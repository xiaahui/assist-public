/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Execution Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.TaskExecutionInstance#getBegin <em>Begin</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.TaskExecutionInstance#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getTaskExecutionInstance()
 * @model
 * @generated
 */
public interface TaskExecutionInstance extends EObject {
    /**
     * Returns the value of the '<em><b>Begin</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Begin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Begin</em>' attribute.
     * @see #setBegin(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTaskExecutionInstance_Begin()
     * @model default="-1" unique="false"
     * @generated
     */
    int getBegin();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.TaskExecutionInstance#getBegin <em>Begin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Begin</em>' attribute.
     * @see #getBegin()
     * @generated
     */
    void setBegin(int value);

    /**
     * Returns the value of the '<em><b>End</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' attribute.
     * @see #setEnd(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTaskExecutionInstance_End()
     * @model default="-1" unique="false"
     * @generated
     */
    int getEnd();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.TaskExecutionInstance#getEnd <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' attribute.
     * @see #getEnd()
     * @generated
     */
    void setEnd(int value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int _begin = this.getBegin();\n&lt;%java.lang.String%&gt; _plus = (\"[\" + &lt;%java.lang.Integer%&gt;.valueOf(_begin));\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + \", \");\nint _end = this.getEnd();\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + &lt;%java.lang.Integer%&gt;.valueOf(_end));\nreturn (_plus_2 + \"]\");'"
     * @generated
     */
    String toString();

} // TaskExecutionInstance
