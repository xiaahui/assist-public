/**
 */
package ch.hilbri.assist.scheduling.model;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model Scheduling Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getHyperPeriodLength <em>Hyper Period Length</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getAssistModelSchedulingResult()
 * @model
 * @generated
 */
public interface AssistModelSchedulingResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getAssistModelSchedulingResult_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hyper Period Length</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyper Period Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyper Period Length</em>' attribute.
	 * @see #setHyperPeriodLength(int)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getAssistModelSchedulingResult_HyperPeriodLength()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getHyperPeriodLength();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getHyperPeriodLength <em>Hyper Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyper Period Length</em>' attribute.
	 * @see #getHyperPeriodLength()
	 * @generated
	 */
	void setHyperPeriodLength(int value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(AssistModelScheduling)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getAssistModelSchedulingResult_Model()
	 * @model
	 * @generated
	 */
	AssistModelScheduling getModel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(AssistModelScheduling value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(HashMap)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getAssistModelSchedulingResult_Schedule()
	 * @model unique="false" dataType="ch.hilbri.assist.scheduling.model.Task2ExecutionInstancesMapType"
	 * @generated
	 */
	HashMap<Task, List<TaskExecutionInstance>> getSchedule();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(HashMap<Task, List<TaskExecutionInstance>> value);

} // AssistModelSchedulingResult