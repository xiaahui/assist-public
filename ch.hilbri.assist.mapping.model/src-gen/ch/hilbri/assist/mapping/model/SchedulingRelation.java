/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getRefBefore <em>Ref Before</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getRefAfter <em>Ref After</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getThreadBefore <em>Thread Before</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getThreadAfter <em>Thread After</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation()
 * @model
 * @generated
 */
public interface SchedulingRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Before</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.ReferencePointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Before</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ReferencePointType
	 * @see #setRefBefore(ReferencePointType)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation_RefBefore()
	 * @model unique="false"
	 * @generated
	 */
	ReferencePointType getRefBefore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getRefBefore <em>Ref Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Before</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ReferencePointType
	 * @see #getRefBefore()
	 * @generated
	 */
	void setRefBefore(ReferencePointType value);

	/**
	 * Returns the value of the '<em><b>Ref After</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.ReferencePointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref After</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ReferencePointType
	 * @see #setRefAfter(ReferencePointType)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation_RefAfter()
	 * @model unique="false"
	 * @generated
	 */
	ReferencePointType getRefAfter();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getRefAfter <em>Ref After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref After</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ReferencePointType
	 * @see #getRefAfter()
	 * @generated
	 */
	void setRefAfter(ReferencePointType value);

	/**
	 * Returns the value of the '<em><b>Thread Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Before</em>' reference.
	 * @see #setThreadBefore(ch.hilbri.assist.mapping.model.Thread)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation_ThreadBefore()
	 * @model required="true"
	 * @generated
	 */
	ch.hilbri.assist.mapping.model.Thread getThreadBefore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getThreadBefore <em>Thread Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Before</em>' reference.
	 * @see #getThreadBefore()
	 * @generated
	 */
	void setThreadBefore(ch.hilbri.assist.mapping.model.Thread value);

	/**
	 * Returns the value of the '<em><b>Thread After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread After</em>' reference.
	 * @see #setThreadAfter(ch.hilbri.assist.mapping.model.Thread)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation_ThreadAfter()
	 * @model required="true"
	 * @generated
	 */
	ch.hilbri.assist.mapping.model.Thread getThreadAfter();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getThreadAfter <em>Thread After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread After</em>' reference.
	 * @see #getThreadAfter()
	 * @generated
	 */
	void setThreadAfter(ch.hilbri.assist.mapping.model.Thread value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getSchedulingRelation_Delay()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.SchedulingRelation#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // SchedulingRelation
