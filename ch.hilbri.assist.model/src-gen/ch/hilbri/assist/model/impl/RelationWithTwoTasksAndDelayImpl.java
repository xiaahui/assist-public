/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.RelationWithTwoTasksAndDelay;
import ch.hilbri.assist.model.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation With Two Tasks And Delay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.RelationWithTwoTasksAndDelayImpl#getTask1 <em>Task1</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.RelationWithTwoTasksAndDelayImpl#getTask2 <em>Task2</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.RelationWithTwoTasksAndDelayImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationWithTwoTasksAndDelayImpl extends SchedulingRestrictionImpl implements RelationWithTwoTasksAndDelay {
	/**
	 * The cached value of the '{@link #getTask1() <em>Task1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask1()
	 * @generated
	 * @ordered
	 */
	protected Task task1;

	/**
	 * The cached value of the '{@link #getTask2() <em>Task2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask2()
	 * @generated
	 * @ordered
	 */
	protected Task task2;

	/**
	 * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected int delay = DELAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationWithTwoTasksAndDelayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RELATION_WITH_TWO_TASKS_AND_DELAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask1() {
		if (task1 != null && task1.eIsProxy()) {
			InternalEObject oldTask1 = (InternalEObject)task1;
			task1 = (Task)eResolveProxy(oldTask1);
			if (task1 != oldTask1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1, oldTask1, task1));
			}
		}
		return task1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask1() {
		return task1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask1(Task newTask1) {
		Task oldTask1 = task1;
		task1 = newTask1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1, oldTask1, task1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask2() {
		if (task2 != null && task2.eIsProxy()) {
			InternalEObject oldTask2 = (InternalEObject)task2;
			task2 = (Task)eResolveProxy(oldTask2);
			if (task2 != oldTask2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2, oldTask2, task2));
			}
		}
		return task2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask2() {
		return task2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask2(Task newTask2) {
		Task oldTask2 = task2;
		task2 = newTask2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2, oldTask2, task2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(int newDelay) {
		int oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1:
				if (resolve) return getTask1();
				return basicGetTask1();
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2:
				if (resolve) return getTask2();
				return basicGetTask2();
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__DELAY:
				return getDelay();
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
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1:
				setTask1((Task)newValue);
				return;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2:
				setTask2((Task)newValue);
				return;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__DELAY:
				setDelay((Integer)newValue);
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
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1:
				setTask1((Task)null);
				return;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2:
				setTask2((Task)null);
				return;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__DELAY:
				setDelay(DELAY_EDEFAULT);
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
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK1:
				return task1 != null;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__TASK2:
				return task2 != null;
			case ModelPackage.RELATION_WITH_TWO_TASKS_AND_DELAY__DELAY:
				return delay != DELAY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //RelationWithTwoTasksAndDelayImpl
