/**
 */
package ch.hilbri.assist.scheduling.model.impl;

import ch.hilbri.assist.scheduling.model.AssistModelScheduling;
import ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult;
import ch.hilbri.assist.scheduling.model.ModelPackage;
import ch.hilbri.assist.scheduling.model.Task;
import ch.hilbri.assist.scheduling.model.TaskExecutionInstance;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assist Model Scheduling Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.AssistModelSchedulingResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.impl.AssistModelSchedulingResultImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssistModelSchedulingResultImpl extends MinimalEObjectImpl.Container implements AssistModelSchedulingResult {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected AssistModelScheduling model;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected HashMap<Task, List<TaskExecutionInstance>> schedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssistModelSchedulingResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ASSIST_MODEL_SCHEDULING_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModelScheduling getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (AssistModelScheduling)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssistModelScheduling basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(AssistModelScheduling newModel) {
		AssistModelScheduling oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<Task, List<TaskExecutionInstance>> getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(HashMap<Task, List<TaskExecutionInstance>> newSchedule) {
		HashMap<Task, List<TaskExecutionInstance>> oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE, oldSchedule, schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE:
				return getSchedule();
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
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL:
				setModel((AssistModelScheduling)newValue);
				return;
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE:
				setSchedule((HashMap<Task, List<TaskExecutionInstance>>)newValue);
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
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL:
				setModel((AssistModelScheduling)null);
				return;
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE:
				setSchedule((HashMap<Task, List<TaskExecutionInstance>>)null);
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
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__MODEL:
				return model != null;
			case ModelPackage.ASSIST_MODEL_SCHEDULING_RESULT__SCHEDULE:
				return schedule != null;
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
		result.append(" (schedule: ");
		result.append(schedule);
		result.append(')');
		return result.toString();
	}

} //AssistModelSchedulingResultImpl
