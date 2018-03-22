/**
 */
package ch.hilbri.assist.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation With Many Tasks And Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.RelationWithManyTasksAndDelay#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getRelationWithManyTasksAndDelay()
 * @model
 * @generated
 */
public interface RelationWithManyTasksAndDelay extends RelationWithManyTasks {
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
	 * @see ch.hilbri.assist.model.ModelPackage#getRelationWithManyTasksAndDelay_Delay()
	 * @model unique="false"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.model.RelationWithManyTasksAndDelay#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // RelationWithManyTasksAndDelay
