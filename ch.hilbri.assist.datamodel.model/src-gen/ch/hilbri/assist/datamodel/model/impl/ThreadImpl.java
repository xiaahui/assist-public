/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.IOAdapterProtectionLevelType;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.IOAdapterType;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import com.google.common.base.Objects;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getEarlyTolerance <em>Early Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getLateTolerance <em>Late Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getLatestStartTime <em>Latest Start Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getLatestEndTime <em>Latest End Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getInitTime <em>Init Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getMaxSlices <em>Max Slices</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getMinSliceDuration <em>Min Slice Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.ThreadImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements ch.hilbri.assist.datamodel.model.Thread {
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
	 * The default value of the '{@link #getCoreUtilization() <em>Core Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int CORE_UTILIZATION_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEarlyTolerance() <em>Early Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final int EARLY_TOLERANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEarlyTolerance() <em>Early Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarlyTolerance()
	 * @generated
	 * @ordered
	 */
	protected int earlyTolerance = EARLY_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLateTolerance() <em>Late Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final int LATE_TOLERANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLateTolerance() <em>Late Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateTolerance()
	 * @generated
	 * @ordered
	 */
	protected int lateTolerance = LATE_TOLERANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestStartTime() <em>Latest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_START_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestStartTime() <em>Latest Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestStartTime()
	 * @generated
	 * @ordered
	 */
	protected int latestStartTime = LATEST_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final int LATEST_END_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLatestEndTime() <em>Latest End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestEndTime()
	 * @generated
	 * @ordered
	 */
	protected int latestEndTime = LATEST_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitTime() <em>Init Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTime()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitTime() <em>Init Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitTime()
	 * @generated
	 * @ordered
	 */
	protected int initTime = INIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSlices() <em>Max Slices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlices()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SLICES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSlices() <em>Max Slices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSlices()
	 * @generated
	 * @ordered
	 */
	protected int maxSlices = MAX_SLICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSliceDuration() <em>Min Slice Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSliceDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SLICE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSliceDuration() <em>Min Slice Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSliceDuration()
	 * @generated
	 * @ordered
	 */
	protected int minSliceDuration = MIN_SLICE_DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Core location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		Application _application = this.getApplication();
		String _name = _application.getName();
		String _plus = (_name + "_");
		Application _application_1 = this.getApplication();
		EList<ch.hilbri.assist.datamodel.model.Thread> _threads = _application_1.getThreads();
		int _indexOf = _threads.indexOf(this);
		int _plus_1 = (_indexOf + 1);
		return (_plus + Integer.valueOf(_plus_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoreUtilization() {
		Application _application = this.getApplication();
		return _application.getCoreUtilization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != ModelPackage.THREAD__APPLICATION) return null;
		return (Application)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		if (eContainerFeatureID() != ModelPackage.THREAD__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, ModelPackage.THREAD__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != ModelPackage.THREAD__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, ModelPackage.APPLICATION__THREADS, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEarlyTolerance() {
		return earlyTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarlyTolerance(int newEarlyTolerance) {
		int oldEarlyTolerance = earlyTolerance;
		earlyTolerance = newEarlyTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__EARLY_TOLERANCE, oldEarlyTolerance, earlyTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLateTolerance() {
		return lateTolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLateTolerance(int newLateTolerance) {
		int oldLateTolerance = lateTolerance;
		lateTolerance = newLateTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__LATE_TOLERANCE, oldLateTolerance, lateTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestStartTime() {
		return latestStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestStartTime(int newLatestStartTime) {
		int oldLatestStartTime = latestStartTime;
		latestStartTime = newLatestStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__LATEST_START_TIME, oldLatestStartTime, latestStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLatestEndTime() {
		return latestEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestEndTime(int newLatestEndTime) {
		int oldLatestEndTime = latestEndTime;
		latestEndTime = newLatestEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__LATEST_END_TIME, oldLatestEndTime, latestEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitTime() {
		return initTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitTime(int newInitTime) {
		int oldInitTime = initTime;
		initTime = newInitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__INIT_TIME, oldInitTime, initTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSlices() {
		return maxSlices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSlices(int newMaxSlices) {
		int oldMaxSlices = maxSlices;
		maxSlices = newMaxSlices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__MAX_SLICES, oldMaxSlices, maxSlices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSliceDuration() {
		return minSliceDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSliceDuration(int newMinSliceDuration) {
		int oldMinSliceDuration = minSliceDuration;
		minSliceDuration = newMinSliceDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__MIN_SLICE_DURATION, oldMinSliceDuration, minSliceDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Core)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.THREAD__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Core newLocation) {
		Core oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.THREAD__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExclusiveAdapterRequestCount(final IOAdapterType paramAdapterType, final IOAdapterProtectionLevelType paramMinProtectionLevel) {
		Application _application = this.getApplication();
		IOAdapterProtectionLevelType _ioAdapterProtectionLevel = _application.getIoAdapterProtectionLevel();
		int _ordinal = _ioAdapterProtectionLevel.ordinal();
		int _ordinal_1 = paramMinProtectionLevel.ordinal();
		boolean _lessThan = (_ordinal < _ordinal_1);
		if (_lessThan) {
			return 0;
		}
		Application _application_1 = this.getApplication();
		EList<IOAdapterRequirement> _ioAdapterRequirements = _application_1.getIoAdapterRequirements();
		final Function1<IOAdapterRequirement, Boolean> _function = new Function1<IOAdapterRequirement, Boolean>() {
			public Boolean apply(final IOAdapterRequirement it) {
				return Boolean.valueOf(it.isIsExclusiveOnly());
			}
		};
		final Iterable<IOAdapterRequirement> exRequests = IterableExtensions.<IOAdapterRequirement>filter(_ioAdapterRequirements, _function);
		boolean _equals = Objects.equal(exRequests, null);
		if (_equals) {
			return 0;
		}
		final Function1<IOAdapterRequirement, Boolean> _function_1 = new Function1<IOAdapterRequirement, Boolean>() {
			public Boolean apply(final IOAdapterRequirement it) {
				IOAdapterType _adapterType = it.getAdapterType();
				return Boolean.valueOf(Objects.equal(_adapterType, paramAdapterType));
			}
		};
		final Iterable<IOAdapterRequirement> exRequestsWithCorrectType = IterableExtensions.<IOAdapterRequirement>filter(exRequests, _function_1);
		boolean _equals_1 = Objects.equal(exRequestsWithCorrectType, null);
		if (_equals_1) {
			return 0;
		}
		final Function1<IOAdapterRequirement, Integer> _function_2 = new Function1<IOAdapterRequirement, Integer>() {
			public Integer apply(final IOAdapterRequirement it) {
				return Integer.valueOf(it.getRequiredAdapterCount());
			}
		};
		final int[] exRequestsWithCorrectTypeAdapterCount = ((int[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(IterableExtensions.<IOAdapterRequirement, Integer>map(exRequestsWithCorrectType, _function_2), int.class));
		int _size = ((List<Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();
		boolean _greaterThan = (_size > 1);
		if (_greaterThan) {
			final Function2<Integer, Integer, Integer> _function_3 = new Function2<Integer, Integer, Integer>() {
				public Integer apply(final Integer p1, final Integer p2) {
					return Integer.valueOf(((p1).intValue() + (p2).intValue()));
				}
			};
			return (int) IterableExtensions.<Integer>reduce(((Iterable<? extends Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)), _function_3);
		}
		else {
			int _size_1 = ((List<Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();
			boolean _equals_2 = (_size_1 == 1);
			if (_equals_2) {
				return exRequestsWithCorrectTypeAdapterCount[0];
			}
			else {
				int _size_2 = ((List<Integer>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(exRequestsWithCorrectTypeAdapterCount)).size();
				boolean _equals_3 = (_size_2 == 0);
				if (_equals_3) {
					return 0;
				}
				else {
					return (-1);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.THREAD__APPLICATION:
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
			case ModelPackage.THREAD__APPLICATION:
				return basicSetApplication(null, msgs);
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
			case ModelPackage.THREAD__APPLICATION:
				return eInternalContainer().eInverseRemove(this, ModelPackage.APPLICATION__THREADS, Application.class, msgs);
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
			case ModelPackage.THREAD__NAME:
				return getName();
			case ModelPackage.THREAD__CORE_UTILIZATION:
				return getCoreUtilization();
			case ModelPackage.THREAD__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case ModelPackage.THREAD__DURATION:
				return getDuration();
			case ModelPackage.THREAD__PERIOD:
				return getPeriod();
			case ModelPackage.THREAD__EARLY_TOLERANCE:
				return getEarlyTolerance();
			case ModelPackage.THREAD__LATE_TOLERANCE:
				return getLateTolerance();
			case ModelPackage.THREAD__LATEST_START_TIME:
				return getLatestStartTime();
			case ModelPackage.THREAD__LATEST_END_TIME:
				return getLatestEndTime();
			case ModelPackage.THREAD__INIT_TIME:
				return getInitTime();
			case ModelPackage.THREAD__MAX_SLICES:
				return getMaxSlices();
			case ModelPackage.THREAD__MIN_SLICE_DURATION:
				return getMinSliceDuration();
			case ModelPackage.THREAD__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
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
			case ModelPackage.THREAD__APPLICATION:
				setApplication((Application)newValue);
				return;
			case ModelPackage.THREAD__DURATION:
				setDuration((Integer)newValue);
				return;
			case ModelPackage.THREAD__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case ModelPackage.THREAD__EARLY_TOLERANCE:
				setEarlyTolerance((Integer)newValue);
				return;
			case ModelPackage.THREAD__LATE_TOLERANCE:
				setLateTolerance((Integer)newValue);
				return;
			case ModelPackage.THREAD__LATEST_START_TIME:
				setLatestStartTime((Integer)newValue);
				return;
			case ModelPackage.THREAD__LATEST_END_TIME:
				setLatestEndTime((Integer)newValue);
				return;
			case ModelPackage.THREAD__INIT_TIME:
				setInitTime((Integer)newValue);
				return;
			case ModelPackage.THREAD__MAX_SLICES:
				setMaxSlices((Integer)newValue);
				return;
			case ModelPackage.THREAD__MIN_SLICE_DURATION:
				setMinSliceDuration((Integer)newValue);
				return;
			case ModelPackage.THREAD__LOCATION:
				setLocation((Core)newValue);
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
			case ModelPackage.THREAD__APPLICATION:
				setApplication((Application)null);
				return;
			case ModelPackage.THREAD__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ModelPackage.THREAD__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case ModelPackage.THREAD__EARLY_TOLERANCE:
				setEarlyTolerance(EARLY_TOLERANCE_EDEFAULT);
				return;
			case ModelPackage.THREAD__LATE_TOLERANCE:
				setLateTolerance(LATE_TOLERANCE_EDEFAULT);
				return;
			case ModelPackage.THREAD__LATEST_START_TIME:
				setLatestStartTime(LATEST_START_TIME_EDEFAULT);
				return;
			case ModelPackage.THREAD__LATEST_END_TIME:
				setLatestEndTime(LATEST_END_TIME_EDEFAULT);
				return;
			case ModelPackage.THREAD__INIT_TIME:
				setInitTime(INIT_TIME_EDEFAULT);
				return;
			case ModelPackage.THREAD__MAX_SLICES:
				setMaxSlices(MAX_SLICES_EDEFAULT);
				return;
			case ModelPackage.THREAD__MIN_SLICE_DURATION:
				setMinSliceDuration(MIN_SLICE_DURATION_EDEFAULT);
				return;
			case ModelPackage.THREAD__LOCATION:
				setLocation((Core)null);
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
			case ModelPackage.THREAD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ModelPackage.THREAD__CORE_UTILIZATION:
				return getCoreUtilization() != CORE_UTILIZATION_EDEFAULT;
			case ModelPackage.THREAD__APPLICATION:
				return basicGetApplication() != null;
			case ModelPackage.THREAD__DURATION:
				return duration != DURATION_EDEFAULT;
			case ModelPackage.THREAD__PERIOD:
				return period != PERIOD_EDEFAULT;
			case ModelPackage.THREAD__EARLY_TOLERANCE:
				return earlyTolerance != EARLY_TOLERANCE_EDEFAULT;
			case ModelPackage.THREAD__LATE_TOLERANCE:
				return lateTolerance != LATE_TOLERANCE_EDEFAULT;
			case ModelPackage.THREAD__LATEST_START_TIME:
				return latestStartTime != LATEST_START_TIME_EDEFAULT;
			case ModelPackage.THREAD__LATEST_END_TIME:
				return latestEndTime != LATEST_END_TIME_EDEFAULT;
			case ModelPackage.THREAD__INIT_TIME:
				return initTime != INIT_TIME_EDEFAULT;
			case ModelPackage.THREAD__MAX_SLICES:
				return maxSlices != MAX_SLICES_EDEFAULT;
			case ModelPackage.THREAD__MIN_SLICE_DURATION:
				return minSliceDuration != MIN_SLICE_DURATION_EDEFAULT;
			case ModelPackage.THREAD__LOCATION:
				return location != null;
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
			case ModelPackage.THREAD___GET_EXCLUSIVE_ADAPTER_REQUEST_COUNT__IOADAPTERTYPE_IOADAPTERPROTECTIONLEVELTYPE:
				return getExclusiveAdapterRequestCount((IOAdapterType)arguments.get(0), (IOAdapterProtectionLevelType)arguments.get(1));
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", period: ");
		result.append(period);
		result.append(", earlyTolerance: ");
		result.append(earlyTolerance);
		result.append(", lateTolerance: ");
		result.append(lateTolerance);
		result.append(", latestStartTime: ");
		result.append(latestStartTime);
		result.append(", latestEndTime: ");
		result.append(latestEndTime);
		result.append(", initTime: ");
		result.append(initTime);
		result.append(", maxSlices: ");
		result.append(maxSlices);
		result.append(", minSliceDuration: ");
		result.append(minSliceDuration);
		result.append(')');
		return result.toString();
	}

} //ThreadImpl
