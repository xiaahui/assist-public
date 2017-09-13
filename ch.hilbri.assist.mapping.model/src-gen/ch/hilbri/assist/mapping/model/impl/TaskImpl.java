/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.HardwareElement;
import ch.hilbri.assist.mapping.model.IOAdapterRequirement;
import ch.hilbri.assist.mapping.model.MetricParameter;
import ch.hilbri.assist.mapping.model.ModelPackage;
import ch.hilbri.assist.mapping.model.Task;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getIoAdapterRequirements <em>Io Adapter Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.TaskImpl#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoreUtilization() <em>Core Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCoreUtilization() <em>Core Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreUtilization()
	 * @generated
	 * @ordered
	 */
	protected int coreUtilization = CORE_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int RAM_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRamUtilization() <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamUtilization()
	 * @generated
	 * @ordered
	 */
	protected int ramUtilization = RAM_UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int ROM_UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRomUtilization() <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRomUtilization()
	 * @generated
	 * @ordered
	 */
	protected int romUtilization = ROM_UTILIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIoAdapterRequirements() <em>Io Adapter Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoAdapterRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<IOAdapterRequirement> ioAdapterRequirements;

	/**
	 * The cached value of the '{@link #getRestrictMappingToHardwareElements() <em>Restrict Mapping To Hardware Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictMappingToHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElement> restrictMappingToHardwareElements;

	/**
	 * The cached value of the '{@link #getMetricParameters() <em>Metric Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricParameter> metricParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreUtilization() {
		return coreUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreUtilization(int newCoreUtilization) {
		int oldCoreUtilization = coreUtilization;
		coreUtilization = newCoreUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__CORE_UTILIZATION, oldCoreUtilization, coreUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRamUtilization() {
		return ramUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamUtilization(int newRamUtilization) {
		int oldRamUtilization = ramUtilization;
		ramUtilization = newRamUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__RAM_UTILIZATION, oldRamUtilization, ramUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRomUtilization() {
		return romUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRomUtilization(int newRomUtilization) {
		int oldRomUtilization = romUtilization;
		romUtilization = newRomUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__ROM_UTILIZATION, oldRomUtilization, romUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != ModelPackage.TASK__APPLICATION) return null;
		return (Application)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		if (eContainerFeatureID() != ModelPackage.TASK__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, ModelPackage.TASK__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != ModelPackage.TASK__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, ModelPackage.APPLICATION__TASKS, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOAdapterRequirement> getIoAdapterRequirements() {
		if (ioAdapterRequirements == null) {
			ioAdapterRequirements = new EObjectContainmentEList<IOAdapterRequirement>(IOAdapterRequirement.class, this, ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS);
		}
		return ioAdapterRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getRestrictMappingToHardwareElements() {
		if (restrictMappingToHardwareElements == null) {
			restrictMappingToHardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
		}
		return restrictMappingToHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricParameter> getMetricParameters() {
		if (metricParameters == null) {
			metricParameters = new EObjectContainmentEList<MetricParameter>(MetricParameter.class, this, ModelPackage.TASK__METRIC_PARAMETERS);
		}
		return metricParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return this.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TASK__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TASK__APPLICATION:
				return basicSetApplication(null, msgs);
			case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
				return ((InternalEList<?>)getIoAdapterRequirements()).basicRemove(otherEnd, msgs);
			case ModelPackage.TASK__METRIC_PARAMETERS:
				return ((InternalEList<?>)getMetricParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.TASK__APPLICATION:
				return eInternalContainer().eInverseRemove(this, ModelPackage.APPLICATION__TASKS, Application.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TASK__NAME:
				return getName();
			case ModelPackage.TASK__CORE_UTILIZATION:
				return getCoreUtilization();
			case ModelPackage.TASK__RAM_UTILIZATION:
				return getRamUtilization();
			case ModelPackage.TASK__ROM_UTILIZATION:
				return getRomUtilization();
			case ModelPackage.TASK__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
				return getIoAdapterRequirements();
			case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return getRestrictMappingToHardwareElements();
			case ModelPackage.TASK__METRIC_PARAMETERS:
				return getMetricParameters();
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
			case ModelPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.TASK__CORE_UTILIZATION:
				setCoreUtilization((Integer)newValue);
				return;
			case ModelPackage.TASK__RAM_UTILIZATION:
				setRamUtilization((Integer)newValue);
				return;
			case ModelPackage.TASK__ROM_UTILIZATION:
				setRomUtilization((Integer)newValue);
				return;
			case ModelPackage.TASK__APPLICATION:
				setApplication((Application)newValue);
				return;
			case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
				getIoAdapterRequirements().clear();
				getIoAdapterRequirements().addAll((Collection<? extends IOAdapterRequirement>)newValue);
				return;
			case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				getRestrictMappingToHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case ModelPackage.TASK__METRIC_PARAMETERS:
				getMetricParameters().clear();
				getMetricParameters().addAll((Collection<? extends MetricParameter>)newValue);
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
			case ModelPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.TASK__CORE_UTILIZATION:
				setCoreUtilization(CORE_UTILIZATION_EDEFAULT);
				return;
			case ModelPackage.TASK__RAM_UTILIZATION:
				setRamUtilization(RAM_UTILIZATION_EDEFAULT);
				return;
			case ModelPackage.TASK__ROM_UTILIZATION:
				setRomUtilization(ROM_UTILIZATION_EDEFAULT);
				return;
			case ModelPackage.TASK__APPLICATION:
				setApplication((Application)null);
				return;
			case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
				getIoAdapterRequirements().clear();
				return;
			case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				return;
			case ModelPackage.TASK__METRIC_PARAMETERS:
				getMetricParameters().clear();
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
			case ModelPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.TASK__CORE_UTILIZATION:
				return coreUtilization != CORE_UTILIZATION_EDEFAULT;
			case ModelPackage.TASK__RAM_UTILIZATION:
				return ramUtilization != RAM_UTILIZATION_EDEFAULT;
			case ModelPackage.TASK__ROM_UTILIZATION:
				return romUtilization != ROM_UTILIZATION_EDEFAULT;
			case ModelPackage.TASK__APPLICATION:
				return basicGetApplication() != null;
			case ModelPackage.TASK__IO_ADAPTER_REQUIREMENTS:
				return ioAdapterRequirements != null && !ioAdapterRequirements.isEmpty();
			case ModelPackage.TASK__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return restrictMappingToHardwareElements != null && !restrictMappingToHardwareElements.isEmpty();
			case ModelPackage.TASK__METRIC_PARAMETERS:
				return metricParameters != null && !metricParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.TASK___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskImpl
