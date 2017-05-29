/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.result.Application;
import ch.hilbri.assist.mapping.model.result.Core;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ThreadImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ThreadImpl#getCore <em>Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ThreadImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements ch.hilbri.assist.mapping.model.result.Thread {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
		return ResultPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != ResultPackage.THREAD__APPLICATION) return null;
		return (Application)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		if (eContainerFeatureID() != ResultPackage.THREAD__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, ResultPackage.THREAD__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != ResultPackage.THREAD__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, ResultPackage.APPLICATION__THREADS, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.THREAD__APPLICATION, newApplication, newApplication));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.THREAD__CORE, oldCore, core));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.THREAD__CORE, oldCore, core));
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
		EList<ch.hilbri.assist.mapping.model.result.Thread> _threads = _application_1.getThreads();
		int _indexOf = _threads.indexOf(this);
		return (_plus + Integer.valueOf(_indexOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.THREAD__APPLICATION:
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
			case ResultPackage.THREAD__APPLICATION:
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
			case ResultPackage.THREAD__APPLICATION:
				return eInternalContainer().eInverseRemove(this, ResultPackage.APPLICATION__THREADS, Application.class, msgs);
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
			case ResultPackage.THREAD__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case ResultPackage.THREAD__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case ResultPackage.THREAD__NAME:
				return getName();
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
			case ResultPackage.THREAD__APPLICATION:
				setApplication((Application)newValue);
				return;
			case ResultPackage.THREAD__CORE:
				setCore((Core)newValue);
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
			case ResultPackage.THREAD__APPLICATION:
				setApplication((Application)null);
				return;
			case ResultPackage.THREAD__CORE:
				setCore((Core)null);
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
			case ResultPackage.THREAD__APPLICATION:
				return basicGetApplication() != null;
			case ResultPackage.THREAD__CORE:
				return core != null;
			case ResultPackage.THREAD__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //ThreadImpl
