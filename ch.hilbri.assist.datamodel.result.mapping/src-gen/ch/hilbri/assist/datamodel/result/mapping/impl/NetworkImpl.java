/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.model.MetricParameter;

import ch.hilbri.assist.datamodel.result.mapping.Board;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;
import ch.hilbri.assist.datamodel.result.mapping.Network;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.NetworkImpl#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.NetworkImpl#isIsBoardLocalNetwork <em>Is Board Local Network</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.NetworkImpl#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.NetworkImpl#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
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
	 * The default value of the '{@link #getBandwidthCapacity() <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int BANDWIDTH_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBandwidthCapacity() <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidthCapacity()
	 * @generated
	 * @ordered
	 */
	protected int bandwidthCapacity = BANDWIDTH_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBoardLocalNetwork() <em>Is Board Local Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoardLocalNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOARD_LOCAL_NETWORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected EList<Board> boards;

	/**
	 * The cached value of the '{@link #getReferenceObject() <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceObject()
	 * @generated
	 * @ordered
	 */
	protected ch.hilbri.assist.datamodel.model.Network referenceObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBandwidthCapacity() {
		return bandwidthCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwidthCapacity(int newBandwidthCapacity) {
		int oldBandwidthCapacity = bandwidthCapacity;
		bandwidthCapacity = newBandwidthCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.NETWORK__BANDWIDTH_CAPACITY, oldBandwidthCapacity, bandwidthCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBoardLocalNetwork() {
		EList<Board> _boards = this.getBoards();
		int _size = _boards.size();
		return (_size <= 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Board> getBoards() {
		if (boards == null) {
			boards = new EObjectWithInverseResolvingEList.ManyInverse<Board>(Board.class, this, MappingPackage.NETWORK__BOARDS, MappingPackage.BOARD__NETWORKS);
		}
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Network getReferenceObject() {
		if (referenceObject != null && referenceObject.eIsProxy()) {
			InternalEObject oldReferenceObject = (InternalEObject)referenceObject;
			referenceObject = (ch.hilbri.assist.datamodel.model.Network)eResolveProxy(oldReferenceObject);
			if (referenceObject != oldReferenceObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.NETWORK__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
			}
		}
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ch.hilbri.assist.datamodel.model.Network basicGetReferenceObject() {
		return referenceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceObject(ch.hilbri.assist.datamodel.model.Network newReferenceObject) {
		ch.hilbri.assist.datamodel.model.Network oldReferenceObject = referenceObject;
		referenceObject = newReferenceObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.NETWORK__REFERENCE_OBJECT, oldReferenceObject, referenceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMetricParameterValue(final String parameterName) {
		ch.hilbri.assist.datamodel.model.Network _referenceObject = this.getReferenceObject();
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
			case MappingPackage.NETWORK__BOARDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoards()).basicAdd(otherEnd, msgs);
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
			case MappingPackage.NETWORK__BOARDS:
				return ((InternalEList<?>)getBoards()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.NETWORK__NAME:
				return getName();
			case MappingPackage.NETWORK__BANDWIDTH_CAPACITY:
				return getBandwidthCapacity();
			case MappingPackage.NETWORK__IS_BOARD_LOCAL_NETWORK:
				return isIsBoardLocalNetwork();
			case MappingPackage.NETWORK__BOARDS:
				return getBoards();
			case MappingPackage.NETWORK__REFERENCE_OBJECT:
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
			case MappingPackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case MappingPackage.NETWORK__BANDWIDTH_CAPACITY:
				setBandwidthCapacity((Integer)newValue);
				return;
			case MappingPackage.NETWORK__BOARDS:
				getBoards().clear();
				getBoards().addAll((Collection<? extends Board>)newValue);
				return;
			case MappingPackage.NETWORK__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.datamodel.model.Network)newValue);
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
			case MappingPackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MappingPackage.NETWORK__BANDWIDTH_CAPACITY:
				setBandwidthCapacity(BANDWIDTH_CAPACITY_EDEFAULT);
				return;
			case MappingPackage.NETWORK__BOARDS:
				getBoards().clear();
				return;
			case MappingPackage.NETWORK__REFERENCE_OBJECT:
				setReferenceObject((ch.hilbri.assist.datamodel.model.Network)null);
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
			case MappingPackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MappingPackage.NETWORK__BANDWIDTH_CAPACITY:
				return bandwidthCapacity != BANDWIDTH_CAPACITY_EDEFAULT;
			case MappingPackage.NETWORK__IS_BOARD_LOCAL_NETWORK:
				return isIsBoardLocalNetwork() != IS_BOARD_LOCAL_NETWORK_EDEFAULT;
			case MappingPackage.NETWORK__BOARDS:
				return boards != null && !boards.isEmpty();
			case MappingPackage.NETWORK__REFERENCE_OBJECT:
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
			case MappingPackage.NETWORK___GET_METRIC_PARAMETER_VALUE__STRING:
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
		result.append(", bandwidthCapacity: ");
		result.append(bandwidthCapacity);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
