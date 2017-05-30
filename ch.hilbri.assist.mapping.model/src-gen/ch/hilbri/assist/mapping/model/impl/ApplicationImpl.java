/**
 */
package ch.hilbri.assist.mapping.model.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.ApplicationOrApplicationGroup;
import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType;
import ch.hilbri.assist.mapping.model.HardwareElement;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl#getDevelopedBy <em>Developed By</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.impl.ApplicationImpl#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends ApplicationOrApplicationGroupImpl implements Application {
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
	 * The default value of the '{@link #getDevelopedBy() <em>Developed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVELOPED_BY_EDEFAULT = "";

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
	 * The cached value of the '{@link #getRestrictMappingToHardwareElements() <em>Restrict Mapping To Hardware Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictMappingToHardwareElements()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareElement> restrictMappingToHardwareElements;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

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
		return ModelPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION__CRITICALITY_LEVEL, oldCriticalityLevel, criticalityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.APPLICATION__DEVELOPED_BY, oldDevelopedBy, developedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareElement> getRestrictMappingToHardwareElements() {
		if (restrictMappingToHardwareElements == null) {
			restrictMappingToHardwareElements = new EObjectResolvingEList<HardwareElement>(HardwareElement.class, this, ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS);
		}
		return restrictMappingToHardwareElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, ModelPackage.APPLICATION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricParameter> getMetricParameters() {
		if (metricParameters == null) {
			metricParameters = new EObjectContainmentEList<MetricParameter>(MetricParameter.class, this, ModelPackage.APPLICATION__METRIC_PARAMETERS);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.APPLICATION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
				return getCriticalityLevel();
			case ModelPackage.APPLICATION__DEVELOPED_BY:
				return getDevelopedBy();
			case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return getRestrictMappingToHardwareElements();
			case ModelPackage.APPLICATION__TASKS:
				return getTasks();
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
			case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
				setCriticalityLevel((DesignAssuranceLevelType)newValue);
				return;
			case ModelPackage.APPLICATION__DEVELOPED_BY:
				setDevelopedBy((String)newValue);
				return;
			case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				getRestrictMappingToHardwareElements().addAll((Collection<? extends HardwareElement>)newValue);
				return;
			case ModelPackage.APPLICATION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
			case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
				setCriticalityLevel(CRITICALITY_LEVEL_EDEFAULT);
				return;
			case ModelPackage.APPLICATION__DEVELOPED_BY:
				setDevelopedBy(DEVELOPED_BY_EDEFAULT);
				return;
			case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				getRestrictMappingToHardwareElements().clear();
				return;
			case ModelPackage.APPLICATION__TASKS:
				getTasks().clear();
				return;
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
			case ModelPackage.APPLICATION__CRITICALITY_LEVEL:
				return criticalityLevel != CRITICALITY_LEVEL_EDEFAULT;
			case ModelPackage.APPLICATION__DEVELOPED_BY:
				return DEVELOPED_BY_EDEFAULT == null ? developedBy != null : !DEVELOPED_BY_EDEFAULT.equals(developedBy);
			case ModelPackage.APPLICATION__RESTRICT_MAPPING_TO_HARDWARE_ELEMENTS:
				return restrictMappingToHardwareElements != null && !restrictMappingToHardwareElements.isEmpty();
			case ModelPackage.APPLICATION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ModelPackage.APPLICATION__METRIC_PARAMETERS:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ApplicationOrApplicationGroup.class) {
			switch (baseOperationID) {
				case ModelPackage.APPLICATION_OR_APPLICATION_GROUP___TO_STRING: return ModelPackage.APPLICATION___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.APPLICATION___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplicationImpl
