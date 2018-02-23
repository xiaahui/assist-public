/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.result.ResultPackage;
import ch.hilbri.assist.mapping.model.result.SingleMappingElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getTask <em>Task</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getCore <em>Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getBox <em>Box</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.SingleMappingElementImpl#getCompartment <em>Compartment</em>}</li>
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
	protected Object application;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Object task;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Object core;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Object processor;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Object board;

	/**
	 * The cached value of the '{@link #getBox() <em>Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBox()
	 * @generated
	 * @ordered
	 */
	protected Object box;

	/**
	 * The cached value of the '{@link #getCompartment() <em>Compartment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartment()
	 * @generated
	 * @ordered
	 */
	protected Object compartment;

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
		return ResultPackage.Literals.SINGLE_MAPPING_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getApplication() {
		if (application != null && ((EObject)application).eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject)application;
			application = (Object)eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION, oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Object newApplication) {
		Object oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTask() {
		if (task != null && ((EObject)task).eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Object)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Object newTask) {
		Object oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCore() {
		if (core != null && ((EObject)core).eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (Object)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Object newCore) {
		Object oldCore = core;
		core = newCore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__CORE, oldCore, core));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getProcessor() {
		if (processor != null && ((EObject)processor).eIsProxy()) {
			InternalEObject oldProcessor = (InternalEObject)processor;
			processor = (Object)eResolveProxy(oldProcessor);
			if (processor != oldProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR, oldProcessor, processor));
			}
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Object newProcessor) {
		Object oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBoard() {
		if (board != null && ((EObject)board).eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject)board;
			board = (Object)eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Object newBoard) {
		Object oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD, oldBoard, board));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBox() {
		if (box != null && ((EObject)box).eIsProxy()) {
			InternalEObject oldBox = (InternalEObject)box;
			box = (Object)eResolveProxy(oldBox);
			if (box != oldBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__BOX, oldBox, box));
			}
		}
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetBox() {
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBox(Object newBox) {
		Object oldBox = box;
		box = newBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__BOX, oldBox, box));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCompartment() {
		if (compartment != null && ((EObject)compartment).eIsProxy()) {
			InternalEObject oldCompartment = (InternalEObject)compartment;
			compartment = (Object)eResolveProxy(oldCompartment);
			if (compartment != oldCompartment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT, oldCompartment, compartment));
			}
		}
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetCompartment() {
		return compartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartment(Object newCompartment) {
		Object oldCompartment = compartment;
		compartment = newCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT, oldCompartment, compartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOX:
				if (resolve) return getBox();
				return basicGetBox();
			case ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
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
			case ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				setApplication(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__TASK:
				setTask(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__CORE:
				setCore(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				setProcessor(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				setBoard(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOX:
				setBox(newValue);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				setCompartment(newValue);
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
			case ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				setApplication((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__TASK:
				setTask((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__CORE:
				setCore((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				setProcessor((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				setBoard((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOX:
				setBox((Object)null);
				return;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				setCompartment((Object)null);
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
			case ResultPackage.SINGLE_MAPPING_ELEMENT__APPLICATION:
				return application != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__TASK:
				return task != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__CORE:
				return core != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__PROCESSOR:
				return processor != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOARD:
				return board != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__BOX:
				return box != null;
			case ResultPackage.SINGLE_MAPPING_ELEMENT__COMPARTMENT:
				return compartment != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleMappingElementImpl
