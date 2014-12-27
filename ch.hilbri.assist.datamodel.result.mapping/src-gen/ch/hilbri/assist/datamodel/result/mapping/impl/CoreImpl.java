/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;

import ch.hilbri.assist.datamodel.result.mapping.Core;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Processor;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getRelativeUtilization <em>Relative Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#isNotUsed <em>Not Used</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getRemainingAbsoluteCapacity <em>Remaining Absolute Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.CoreImpl#getRemainingRelativeCapacity <em>Remaining Relative Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreImpl extends HardwareElementImpl implements Core {
	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected int utilization = UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeUtilization() <em>Relative Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_UTILIZATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<ch.hilbri.assist.datamodel.result.mapping.Thread> threads;

	/**
	 * The default value of the '{@link #isNotUsed() <em>Not Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_USED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRemainingAbsoluteCapacity() <em>Remaining Absolute Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingAbsoluteCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int REMAINING_ABSOLUTE_CAPACITY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRemainingRelativeCapacity() <em>Remaining Relative Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingRelativeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final double REMAINING_RELATIVE_CAPACITY_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CORE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CORE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(int newUtilization) {
		int oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CORE__UTILIZATION, oldUtilization, utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeUtilization() {
		int _capacity = this.getCapacity();
		return ((((double) this.getUtilization()) * 100.0) / ((double) _capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		if (eContainerFeatureID() != MappingPackage.CORE__PROCESSOR) return null;
		return (Processor)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor basicGetProcessor() {
		if (eContainerFeatureID() != MappingPackage.CORE__PROCESSOR) return null;
		return (Processor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessor(Processor newProcessor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessor, MappingPackage.CORE__PROCESSOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		if (newProcessor != eInternalContainer() || (eContainerFeatureID() != MappingPackage.CORE__PROCESSOR && newProcessor != null)) {
			if (EcoreUtil.isAncestor(this, newProcessor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessor != null)
				msgs = ((InternalEObject)newProcessor).eInverseAdd(this, MappingPackage.PROCESSOR__CORES, Processor.class, msgs);
			msgs = basicSetProcessor(newProcessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.CORE__PROCESSOR, newProcessor, newProcessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ch.hilbri.assist.datamodel.result.mapping.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectResolvingEList<ch.hilbri.assist.datamodel.result.mapping.Thread>(ch.hilbri.assist.datamodel.result.mapping.Thread.class, this, MappingPackage.CORE__THREADS);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotUsed() {
		EList<ch.hilbri.assist.datamodel.result.mapping.Thread> _threads = this.getThreads();
		return _threads.isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRemainingAbsoluteCapacity() {
		int _capacity = this.getCapacity();
		int _utilization = this.getUtilization();
		return (_capacity - _utilization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRemainingRelativeCapacity() {
		int _remainingAbsoluteCapacity = this.getRemainingAbsoluteCapacity();
		int _capacity = this.getCapacity();
		return (((double) _remainingAbsoluteCapacity) / ((double) _capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareArchitectureLevelType getHardwareLevel() {
		return HardwareArchitectureLevelType.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.CORE__PROCESSOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessor((Processor)otherEnd, msgs);
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
			case MappingPackage.CORE__PROCESSOR:
				return basicSetProcessor(null, msgs);
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
			case MappingPackage.CORE__PROCESSOR:
				return eInternalContainer().eInverseRemove(this, MappingPackage.PROCESSOR__CORES, Processor.class, msgs);
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
			case MappingPackage.CORE__ARCHITECTURE:
				return getArchitecture();
			case MappingPackage.CORE__CAPACITY:
				return getCapacity();
			case MappingPackage.CORE__UTILIZATION:
				return getUtilization();
			case MappingPackage.CORE__RELATIVE_UTILIZATION:
				return getRelativeUtilization();
			case MappingPackage.CORE__PROCESSOR:
				if (resolve) return getProcessor();
				return basicGetProcessor();
			case MappingPackage.CORE__THREADS:
				return getThreads();
			case MappingPackage.CORE__NOT_USED:
				return isNotUsed();
			case MappingPackage.CORE__REMAINING_ABSOLUTE_CAPACITY:
				return getRemainingAbsoluteCapacity();
			case MappingPackage.CORE__REMAINING_RELATIVE_CAPACITY:
				return getRemainingRelativeCapacity();
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
			case MappingPackage.CORE__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case MappingPackage.CORE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case MappingPackage.CORE__UTILIZATION:
				setUtilization((Integer)newValue);
				return;
			case MappingPackage.CORE__PROCESSOR:
				setProcessor((Processor)newValue);
				return;
			case MappingPackage.CORE__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends ch.hilbri.assist.datamodel.result.mapping.Thread>)newValue);
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
			case MappingPackage.CORE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case MappingPackage.CORE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case MappingPackage.CORE__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case MappingPackage.CORE__PROCESSOR:
				setProcessor((Processor)null);
				return;
			case MappingPackage.CORE__THREADS:
				getThreads().clear();
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
			case MappingPackage.CORE__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case MappingPackage.CORE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case MappingPackage.CORE__UTILIZATION:
				return utilization != UTILIZATION_EDEFAULT;
			case MappingPackage.CORE__RELATIVE_UTILIZATION:
				return getRelativeUtilization() != RELATIVE_UTILIZATION_EDEFAULT;
			case MappingPackage.CORE__PROCESSOR:
				return basicGetProcessor() != null;
			case MappingPackage.CORE__THREADS:
				return threads != null && !threads.isEmpty();
			case MappingPackage.CORE__NOT_USED:
				return isNotUsed() != NOT_USED_EDEFAULT;
			case MappingPackage.CORE__REMAINING_ABSOLUTE_CAPACITY:
				return getRemainingAbsoluteCapacity() != REMAINING_ABSOLUTE_CAPACITY_EDEFAULT;
			case MappingPackage.CORE__REMAINING_RELATIVE_CAPACITY:
				return getRemainingRelativeCapacity() != REMAINING_RELATIVE_CAPACITY_EDEFAULT;
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
			case MappingPackage.CORE___GET_HARDWARE_LEVEL:
				return getHardwareLevel();
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
