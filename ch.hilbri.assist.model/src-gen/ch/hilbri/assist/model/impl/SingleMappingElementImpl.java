/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Mapping Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getCore <em>Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.SingleMappingElementImpl#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleMappingElementImpl extends MinimalEObjectImpl.Container implements SingleMappingElement {
	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Core core;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getBox() <em>Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBox()
	 * @generated
	 * @ordered
	 */
	protected Box box;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected Compartment compartment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleMappingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SINGLE_MAPPING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject)application;
			application = (Application)eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getCore() {
		if (core != null && core.eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (Core)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Core newCore) {
		Core oldCore = core;
		core = newCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__CORE, oldCore, core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		if (processor != null && processor.eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Processor)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject)board;
			board = (Board)eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box getBox() {
		if (box != null && box.eIsProxy()) {
			InternalEObject oldBox = (InternalEObject)box;
			box = (Box)eResolveProxy(oldBox);
			if (box != oldBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__BOX, oldBox, box));
			}
		}
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box basicGetBox() {
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBox(Box newBox) {
		Box oldBox = box;
		box = newBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__BOX, oldBox, box));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		if (compartment != null && compartment.eIsProxy()) {
			InternalEObject oldCompartment = (InternalEObject)compartment;
			compartment = (Compartment)eResolveProxy(oldCompartment);
			if (compartment != oldCompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT, oldCompartment, compartment));
			}
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment basicGetCompartment() {
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Compartment newCompartment) {
		Compartment oldCompartment = compartment;
		compartment = newCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT, oldCompartment, compartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOX:
				if (resolve) return getBox();
				return basicGetBox();
			case ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				if (resolve) return getCompartment();
				return basicGetCompartment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				setApplication((Application)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__TASK:
				setTask((Task)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__CORE:
				setCore((Core)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				setProcessor((Processor)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				setBoard((Board)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOX:
				setBox((Box)newValue);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				setCompartment((Compartment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				setApplication((Application)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__TASK:
				setTask((Task)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__CORE:
				setCore((Core)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				setProcessor((Processor)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				setBoard((Board)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOX:
				setBox((Box)null);
				return;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				setCompartment((Compartment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				return application != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__TASK:
				return task != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__CORE:
				return core != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				return processor != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				return board != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__BOX:
				return box != null;
			case ModelPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				return compartment != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleMappingElementImpl
