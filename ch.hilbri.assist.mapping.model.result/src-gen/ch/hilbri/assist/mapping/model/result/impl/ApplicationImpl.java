/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType;
import ch.hilbri.assist.mapping.model.MetricParameter;

import ch.hilbri.assist.mapping.model.result.Application;
import ch.hilbri.assist.mapping.model.result.HardwareElement;
import ch.hilbri.assist.mapping.model.result.IOAdapterRequirement;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getParallelThreads <em>Parallel Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getDevelopedBy <em>Developed By</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getIoAdapterRequirements <em>Io Adapter Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ApplicationImpl#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final DesignAssuranceLevelType CRITICALITY_LEVEL_EDEFAULT = DesignAssuranceLevelType.NONE;

	/**
	 * The cached value of the '{@link #getCriticalityLevel() <em>Criticality Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalityLevel()
	 * @generated
	 * @ordered
	 */
	protected DesignAssuranceLevelType criticalityLevel = CRITICALITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallelThreads() <em>Parallel Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int PARALLEL_THREADS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getParallelThreads() <em>Parallel Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelThreads()
	 * @generated
	 * @ordered
	 */
	protected int parallelThreads = PARALLEL_THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevelopedBy() <em>Developed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDevelopedBy() <em>Developed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedBy()
	 * @generated
	 * @ordered
	 */
	protected String developedBy = DEVELOPED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIoAdapterRequirements() <em>Io Adapter Requirements</em>}' reference list.
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
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ch.hilbri.assist.mapping.model.result.Thread> threads;

	/**
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.mapping.model.Application referenceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__CORE_UTILIZATION, oldCoreUtilization, coreUtilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__RAM_UTILIZATION, oldRamUtilization, ramUtilization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__ROM_UTILIZATION, oldRomUtilization, romUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignAssuranceLevelType getCriticalityLevel() {
		return criticalityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalityLevel(DesignAssuranceLevelType newCriticalityLevel) {
		DesignAssuranceLevelType oldCriticalityLevel = criticalityLevel;
		criticalityLevel = newCriticalityLevel == null ? CRITICALITY_LEVEL_EDEFAULT : newCriticalityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__CRITICALITY_LEVEL, oldCriticalityLevel, criticalityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParallelThreads() {
		return parallelThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelThreads(int newParallelThreads) {
		int oldParallelThreads = parallelThreads;
		parallelThreads = newParallelThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__PARALLEL_THREADS, oldParallelThreads, parallelThreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDevelopedBy() {
		return developedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopedBy(String newDevelopedBy) {
		String oldDevelopedBy = developedBy;
		developedBy = newDevelopedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__DEVELOPED_BY, oldDevelopedBy, developedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOAdapterRequirement> getIoAdapterRequirements() {
		if (ioAdapterRequirements == null) {
			ioAdapterRequirements = new EObjectResolvingEList<IOAdapterRequirement>(IOAdapterRequirement.class, this, ResultPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS);
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
			restrictMappingToHardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ResultPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
		}
		return restrictMappingToHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.mapping.model.result.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentWithInverseEList<ch.hilbri.assist.mapping.model.result.Thread>(ch.hilbri.assist.mapping.model.result.Thread.class, this, ResultPackage.APPLICATION__THREADS, ResultPackage.THREAD__APPLICATION);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.Application getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.mapping.model.Application)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.APPLICATION__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.mapping.model.Application basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.mapping.model.Application newReferenceObject) {
		ch.hilbri.assist.mapping.model.Application oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.APPLICATION__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMetricParameterValue(final String parameterName) {
		ch.hilbri.assist.mapping.model.Application _referenceObject = this.getReferenceObject();
		EList<MetricParameter> _metricParameters = _referenceObject.getMetricParameters();
		for (final MetricParameter parameter : _metricParameters) {
			String _name = parameter.getName();
			boolean _equals = _name.equals(parameterName);
			if (_equals) {
				return parameter.getValue();
			}
		}
		return (-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.APPLICATION__THREADS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreads()).basicAdd(otherEnd, msgs);
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
			case ResultPackage.APPLICATION__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.APPLICATION__NAME:
				return getName();
			case ResultPackage.APPLICATION__CORE_UTILIZATION:
				return getCoreUtilization();
			case ResultPackage.APPLICATION__RAM_UTILIZATION:
				return getRamUtilization();
			case ResultPackage.APPLICATION__ROM_UTILIZATION:
				return getRomUtilization();
			case ResultPackage.APPLICATION__CRITICALITY_LEVEL:
				return getCriticalityLevel();
			case ResultPackage.APPLICATION__PARALLEL_THREADS:
				return getParallelThreads();
			case ResultPackage.APPLICATION__DEVELOPED_BY:
				return getDevelopedBy();
			case ResultPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS:
				return getIoAdapterRequirements();
			case ResultPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return getRestrictMappingToHardwareElements();
			case ResultPackage.APPLICATION__THREADS:
				return getThreads();
			case ResultPackage.APPLICATION__REFERENCE_OBJECT:
				if (resolve) return getReferenceObject();
				return basicGetReferenceObject();
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
			case ResultPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case ResultPackage.APPLICATION__CORE_UTILIZATION:
				setCoreUtilization((Integer)newValue);
				return;
			case ResultPackage.APPLICATION__RAM_UTILIZATION:
				setRamUtilization((Integer)newValue);
				return;
			case ResultPackage.APPLICATION__ROM_UTILIZATION:
				setRomUtilization((Integer)newValue);
				return;
			case ResultPackage.APPLICATION__CRITICALITY_LEVEL:
				setCriticalityLevel((DesignAssuranceLevelType)newValue);
				return;
			case ResultPackage.APPLICATION__PARALLEL_THREADS:
				setParallelThreads((Integer)newValue);
				return;
			case ResultPackage.APPLICATION__DEVELOPED_BY:
				setDevelopedBy((String)newValue);
				return;
			case ResultPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS:
				getIoAdapterRequirements().clear();
				getIoAdapterRequirements().addAll((Collection<? extends IOAdapterRequirement>)newValue);
				return;
			case ResultPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				getRestrictMappingToHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case ResultPackage.APPLICATION__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ch.hilbri.assist.mapping.model.result.Thread>)newValue);
				return;
			case ResultPackage.APPLICATION__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.Application)newValue);
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
			case ResultPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__CORE_UTILIZATION:
				setCoreUtilization(CORE_UTILIZATION_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__RAM_UTILIZATION:
				setRamUtilization(RAM_UTILIZATION_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__ROM_UTILIZATION:
				setRomUtilization(ROM_UTILIZATION_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__CRITICALITY_LEVEL:
				setCriticalityLevel(CRITICALITY_LEVEL_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__PARALLEL_THREADS:
				setParallelThreads(PARALLEL_THREADS_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__DEVELOPED_BY:
				setDevelopedBy(DEVELOPED_BY_EDEFAULT);
				return;
			case ResultPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS:
				getIoAdapterRequirements().clear();
				return;
			case ResultPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				return;
			case ResultPackage.APPLICATION__THREADS:
				getThreads().clear();
				return;
			case ResultPackage.APPLICATION__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.mapping.model.Application)null);
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
			case ResultPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultPackage.APPLICATION__CORE_UTILIZATION:
				return coreUtilization != CORE_UTILIZATION_EDEFAULT;
			case ResultPackage.APPLICATION__RAM_UTILIZATION:
				return ramUtilization != RAM_UTILIZATION_EDEFAULT;
			case ResultPackage.APPLICATION__ROM_UTILIZATION:
				return romUtilization != ROM_UTILIZATION_EDEFAULT;
			case ResultPackage.APPLICATION__CRITICALITY_LEVEL:
				return criticalityLevel != CRITICALITY_LEVEL_EDEFAULT;
			case ResultPackage.APPLICATION__PARALLEL_THREADS:
				return parallelThreads != PARALLEL_THREADS_EDEFAULT;
			case ResultPackage.APPLICATION__DEVELOPED_BY:
				return DEVELOPED_BY_EDEFAULT == null ? developedBy != null : !DEVELOPED_BY_EDEFAULT.equals(developedBy);
			case ResultPackage.APPLICATION__IO_ADAPTER_REQUIREMENTS:
				return ioAdapterRequirements != null && !ioAdapterRequirements.isEmpty();
			case ResultPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return restrictMappingToHardwareElements != null && !restrictMappingToHardwareElements.isEmpty();
			case ResultPackage.APPLICATION__THREADS:
				return threads != null && !threads.isEmpty();
			case ResultPackage.APPLICATION__REFERENCE_OBJECT:
				return referenceObject != null;
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
			case ResultPackage.APPLICATION___GET_METRIC_PARAMETER_VALUE__STRING:
				return getMetricParameterValue((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", coreUtilization: ");
		result.append(coreUtilization);
		result.append(", ramUtilization: ");
		result.append(ramUtilization);
		result.append(", romUtilization: ");
		result.append(romUtilization);
		result.append(", criticalityLevel: ");
		result.append(criticalityLevel);
		result.append(", parallelThreads: ");
		result.append(parallelThreads);
		result.append(", developedBy: ");
		result.append(developedBy);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
