/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.ComplexRelation;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ComplexRelationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ComplexRelationImpl#getOtherTask <em>Other Task</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ComplexRelationImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexRelationImpl extends SchedulingRestrictionImpl implements ComplexRelation {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getOtherTask() <em>Other Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTask()
	 * @generated
	 * @ordered
	 */
	protected Task otherTask;

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
	protected ComplexRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPLEX_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectResolvingEList<Task>(Task.class, this, ModelPackage.COMPLEX_RELATION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getOtherTask() {
		if (otherTask != null && otherTask.eIsProxy()) {
			InternalEObject oldOtherTask = (InternalEObject)otherTask;
			otherTask = (Task)eResolveProxy(oldOtherTask);
			if (otherTask != oldOtherTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COMPLEX_RELATION__OTHER_TASK, oldOtherTask, otherTask));
			}
		}
		return otherTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetOtherTask() {
		return otherTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherTask(Task newOtherTask) {
		Task oldOtherTask = otherTask;
		otherTask = newOtherTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_RELATION__OTHER_TASK, oldOtherTask, otherTask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COMPLEX_RELATION__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COMPLEX_RELATION__TASKS:
				return getTasks();
			case ModelPackage.COMPLEX_RELATION__OTHER_TASK:
				if (resolve) return getOtherTask();
				return basicGetOtherTask();
			case ModelPackage.COMPLEX_RELATION__DELAY:
				return getDelay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.COMPLEX_RELATION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ModelPackage.COMPLEX_RELATION__OTHER_TASK:
				setOtherTask((Task)newValue);
				return;
			case ModelPackage.COMPLEX_RELATION__DELAY:
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
			case ModelPackage.COMPLEX_RELATION__TASKS:
				getTasks().clear();
				return;
			case ModelPackage.COMPLEX_RELATION__OTHER_TASK:
				setOtherTask((Task)null);
				return;
			case ModelPackage.COMPLEX_RELATION__DELAY:
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
			case ModelPackage.COMPLEX_RELATION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ModelPackage.COMPLEX_RELATION__OTHER_TASK:
				return otherTask != null;
			case ModelPackage.COMPLEX_RELATION__DELAY:
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

} //ComplexRelationImpl
