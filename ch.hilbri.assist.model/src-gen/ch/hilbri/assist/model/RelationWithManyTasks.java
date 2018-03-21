/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation With Many Tasks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.RelationWithManyTasks#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getRelationWithManyTasks()
 * @model
 * @generated
 */
public interface RelationWithManyTasks extends SchedulingRestriction {
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
     * @see ch.hilbri.assist.model.ModelPackage#getRelationWithManyTasks_Tasks()
     * @model
     * @generated
     */
    EList<Task> getTasks();

} // RelationWithManyTasks
