/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ReferencePointType;
import ch.hilbri.assist.datamodel.model.SchedulingRelation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl#getRefBefore <em>Ref Before</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl#getRefAfter <em>Ref After</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl#getThreadBefore <em>Thread Before</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl#getThreadAfter <em>Thread After</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.SchedulingRelationImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingRelationImpl extends MinimalEObjectImpl.Container implements SchedulingRelation {
	/**
	 * The default value of the '{@link #getRefBefore() <em>Ref Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBefore()
	 * @generated
	 * @ordered
	 */
	protected static final ReferencePointType REF_BEFORE_EDEFAULT = ReferencePointType.START;

	/**
	 * The cached value of the '{@link #getRefBefore() <em>Ref Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBefore()
	 * @generated
	 * @ordered
	 */
	protected ReferencePointType refBefore = REF_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefAfter() <em>Ref After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAfter()
	 * @generated
	 * @ordered
	 */
	protected static final ReferencePointType REF_AFTER_EDEFAULT = ReferencePointType.START;

	/**
	 * The cached value of the '{@link #getRefAfter() <em>Ref After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefAfter()
	 * @generated
	 * @ordered
	 */
	protected ReferencePointType refAfter = REF_AFTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreadBefore() <em>Thread Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadBefore()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.datamodel.model.Thread threadBefore;

	/**
	 * The cached value of the '{@link #getThreadAfter() <em>Thread After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadAfter()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.datamodel.model.Thread threadAfter;

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
	protected SchedulingRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SCHEDULING_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePointType getRefBefore() {
		return refBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBefore(ReferencePointType newRefBefore) {
		ReferencePointType oldRefBefore = refBefore;
		refBefore = newRefBefore == null ? REF_BEFORE_EDEFAULT : newRefBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RELATION__REF_BEFORE, oldRefBefore, refBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencePointType getRefAfter() {
		return refAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefAfter(ReferencePointType newRefAfter) {
		ReferencePointType oldRefAfter = refAfter;
		refAfter = newRefAfter == null ? REF_AFTER_EDEFAULT : newRefAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RELATION__REF_AFTER, oldRefAfter, refAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Thread getThreadBefore() {
		if (threadBefore != null && threadBefore.eIsProxy()) {
			InternalEObject oldThreadBefore = (InternalEObject)threadBefore;
			threadBefore = (ch.hilbri.assist.datamodel.model.Thread)eResolveProxy(oldThreadBefore);
			if (threadBefore != oldThreadBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE, oldThreadBefore, threadBefore));
			}
		}
		return threadBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Thread basicGetThreadBefore() {
		return threadBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadBefore(ch.hilbri.assist.datamodel.model.Thread newThreadBefore) {
		ch.hilbri.assist.datamodel.model.Thread oldThreadBefore = threadBefore;
		threadBefore = newThreadBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE, oldThreadBefore, threadBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Thread getThreadAfter() {
		if (threadAfter != null && threadAfter.eIsProxy()) {
			InternalEObject oldThreadAfter = (InternalEObject)threadAfter;
			threadAfter = (ch.hilbri.assist.datamodel.model.Thread)eResolveProxy(oldThreadAfter);
			if (threadAfter != oldThreadAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SCHEDULING_RELATION__THREAD_AFTER, oldThreadAfter, threadAfter));
			}
		}
		return threadAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Thread basicGetThreadAfter() {
		return threadAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadAfter(ch.hilbri.assist.datamodel.model.Thread newThreadAfter) {
		ch.hilbri.assist.datamodel.model.Thread oldThreadAfter = threadAfter;
		threadAfter = newThreadAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RELATION__THREAD_AFTER, oldThreadAfter, threadAfter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SCHEDULING_RELATION__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SCHEDULING_RELATION__REF_BEFORE:
				return getRefBefore();
			case ModelPackage.SCHEDULING_RELATION__REF_AFTER:
				return getRefAfter();
			case ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE:
				if (resolve) return getThreadBefore();
				return basicGetThreadBefore();
			case ModelPackage.SCHEDULING_RELATION__THREAD_AFTER:
				if (resolve) return getThreadAfter();
				return basicGetThreadAfter();
			case ModelPackage.SCHEDULING_RELATION__DELAY:
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
			case ModelPackage.SCHEDULING_RELATION__REF_BEFORE:
				setRefBefore((ReferencePointType)newValue);
				return;
			case ModelPackage.SCHEDULING_RELATION__REF_AFTER:
				setRefAfter((ReferencePointType)newValue);
				return;
			case ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE:
				setThreadBefore((ch.hilbri.assist.datamodel.model.Thread)newValue);
				return;
			case ModelPackage.SCHEDULING_RELATION__THREAD_AFTER:
				setThreadAfter((ch.hilbri.assist.datamodel.model.Thread)newValue);
				return;
			case ModelPackage.SCHEDULING_RELATION__DELAY:
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
			case ModelPackage.SCHEDULING_RELATION__REF_BEFORE:
				setRefBefore(REF_BEFORE_EDEFAULT);
				return;
			case ModelPackage.SCHEDULING_RELATION__REF_AFTER:
				setRefAfter(REF_AFTER_EDEFAULT);
				return;
			case ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE:
				setThreadBefore((ch.hilbri.assist.datamodel.model.Thread)null);
				return;
			case ModelPackage.SCHEDULING_RELATION__THREAD_AFTER:
				setThreadAfter((ch.hilbri.assist.datamodel.model.Thread)null);
				return;
			case ModelPackage.SCHEDULING_RELATION__DELAY:
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
			case ModelPackage.SCHEDULING_RELATION__REF_BEFORE:
				return refBefore != REF_BEFORE_EDEFAULT;
			case ModelPackage.SCHEDULING_RELATION__REF_AFTER:
				return refAfter != REF_AFTER_EDEFAULT;
			case ModelPackage.SCHEDULING_RELATION__THREAD_BEFORE:
				return threadBefore != null;
			case ModelPackage.SCHEDULING_RELATION__THREAD_AFTER:
				return threadAfter != null;
			case ModelPackage.SCHEDULING_RELATION__DELAY:
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
		result.append(" (refBefore: ");
		result.append(refBefore);
		result.append(", refAfter: ");
		result.append(refAfter);
		result.append(", delay: ");
		result.append(delay);
		result.append(')');
		return result.toString();
	}

} //SchedulingRelationImpl
