/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Pin;
import ch.hilbri.assist.datamodel.model.ProtectionLevelType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.PinImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.PinImpl#getEqInterfaceType <em>Eq Interface Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.PinImpl#getProtectionLevel <em>Protection Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PinImpl extends HardwareElementImpl implements Pin {
	/**
	 * The default value of the '{@link #getEqInterfaceType() <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final String EQ_INTERFACE_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getEqInterfaceType() <em>Eq Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected String eqInterfaceType = EQ_INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionLevelType PROTECTION_LEVEL_EDEFAULT = ProtectionLevelType.NONE;

	/**
	 * The cached value of the '{@link #getProtectionLevel() <em>Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevel()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevelType protectionLevel = PROTECTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (eContainerFeatureID() != ModelPackage.PIN__CONNECTOR) return null;
		return (Connector)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		if (eContainerFeatureID() != ModelPackage.PIN__CONNECTOR) return null;
		return (Connector)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConnector, ModelPackage.PIN__CONNECTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PIN__CONNECTOR && newConnector != null)) {
			if (EcoreUtil.isAncestor(this, newConnector))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, ModelPackage.CONNECTOR__PINS, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PIN__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEqInterfaceType() {
		return eqInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqInterfaceType(String newEqInterfaceType) {
		String oldEqInterfaceType = eqInterfaceType;
		eqInterfaceType = newEqInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PIN__EQ_INTERFACE_TYPE, oldEqInterfaceType, eqInterfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelType getProtectionLevel() {
		return protectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionLevel(ProtectionLevelType newProtectionLevel) {
		ProtectionLevelType oldProtectionLevel = protectionLevel;
		protectionLevel = newProtectionLevel == null ? PROTECTION_LEVEL_EDEFAULT : newProtectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PIN__PROTECTION_LEVEL, oldProtectionLevel, protectionLevel));
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
			case ModelPackage.PIN__CONNECTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
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
			case ModelPackage.PIN__CONNECTOR:
				return basicSetConnector(null, msgs);
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
			case ModelPackage.PIN__CONNECTOR:
				return eInternalContainer().eInverseRemove(this, ModelPackage.CONNECTOR__PINS, Connector.class, msgs);
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
			case ModelPackage.PIN__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
			case ModelPackage.PIN__EQ_INTERFACE_TYPE:
				return getEqInterfaceType();
			case ModelPackage.PIN__PROTECTION_LEVEL:
				return getProtectionLevel();
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
			case ModelPackage.PIN__CONNECTOR:
				setConnector((Connector)newValue);
				return;
			case ModelPackage.PIN__EQ_INTERFACE_TYPE:
				setEqInterfaceType((String)newValue);
				return;
			case ModelPackage.PIN__PROTECTION_LEVEL:
				setProtectionLevel((ProtectionLevelType)newValue);
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
			case ModelPackage.PIN__CONNECTOR:
				setConnector((Connector)null);
				return;
			case ModelPackage.PIN__EQ_INTERFACE_TYPE:
				setEqInterfaceType(EQ_INTERFACE_TYPE_EDEFAULT);
				return;
			case ModelPackage.PIN__PROTECTION_LEVEL:
				setProtectionLevel(PROTECTION_LEVEL_EDEFAULT);
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
			case ModelPackage.PIN__CONNECTOR:
				return basicGetConnector() != null;
			case ModelPackage.PIN__EQ_INTERFACE_TYPE:
				return EQ_INTERFACE_TYPE_EDEFAULT == null ? eqInterfaceType != null : !EQ_INTERFACE_TYPE_EDEFAULT.equals(eqInterfaceType);
			case ModelPackage.PIN__PROTECTION_LEVEL:
				return protectionLevel != PROTECTION_LEVEL_EDEFAULT;
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
			case ModelPackage.PIN___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //PinImpl
