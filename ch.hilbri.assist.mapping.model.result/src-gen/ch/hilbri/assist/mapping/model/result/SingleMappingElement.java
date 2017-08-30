/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.Processor;
import ch.hilbri.assist.mapping.model.Task;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getTask <em>Task</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCore <em>Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement()
 * @model
 * @generated
 */
public interface SingleMappingElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(Core)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Core()
	 * @model
	 * @generated
	 */
	Core getCore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Processor()
	 * @model
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' reference.
	 * @see #setBoard(Board)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Board()
	 * @model
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBoard <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Box</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' reference.
	 * @see #setBox(Box)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Box()
	 * @model
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getBox <em>Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getSingleMappingElement_Compartment()
	 * @model
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.SingleMappingElement#getCompartment <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

} // SingleMappingElement
