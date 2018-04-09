/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.SimpleRelation#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getSimpleRelation()
 * @model
 * @generated
 */
public interface SimpleRelation extends SchedulingRestriction {
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
	 * @see ch.hilbri.assist.model.ModelPackage#getSimpleRelation_Tasks()
	 * @model lower="2"
	 * @generated
	 */
	EList<Task> getTasks();

} // SimpleRelation
