/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.CableWeightDataBlock;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock;
import ch.hilbri.assist.datamodel.model.GlobalBlock;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl#getCompatibleIoTypesBlock <em>Compatible Io Types Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl#getCableWeightDataBlock <em>Cable Weight Data Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.GlobalBlockImpl#getProtectionLevelDataBlock <em>Protection Level Data Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBlockImpl extends MinimalEObjectImpl.Container implements GlobalBlock {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompatibleIoTypesBlock() <em>Compatible Io Types Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleIoTypesBlock()
	 * @generated
	 * @ordered
	 */
	protected CompatibleIoTypesBlock compatibleIoTypesBlock;

	/**
	 * The cached value of the '{@link #getCableWeightDataBlock() <em>Cable Weight Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCableWeightDataBlock()
	 * @generated
	 * @ordered
	 */
	protected CableWeightDataBlock cableWeightDataBlock;

	/**
	 * The cached value of the '{@link #getProtectionLevelDataBlock() <em>Protection Level Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionLevelDataBlock()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevelDataBlock protectionLevelDataBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GLOBAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleIoTypesBlock getCompatibleIoTypesBlock() {
		return compatibleIoTypesBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompatibleIoTypesBlock(CompatibleIoTypesBlock newCompatibleIoTypesBlock, NotificationChain msgs) {
		CompatibleIoTypesBlock oldCompatibleIoTypesBlock = compatibleIoTypesBlock;
		compatibleIoTypesBlock = newCompatibleIoTypesBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK, oldCompatibleIoTypesBlock, newCompatibleIoTypesBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompatibleIoTypesBlock(CompatibleIoTypesBlock newCompatibleIoTypesBlock) {
		if (newCompatibleIoTypesBlock != compatibleIoTypesBlock) {
			NotificationChain msgs = null;
			if (compatibleIoTypesBlock != null)
				msgs = ((InternalEObject)compatibleIoTypesBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK, null, msgs);
			if (newCompatibleIoTypesBlock != null)
				msgs = ((InternalEObject)newCompatibleIoTypesBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK, null, msgs);
			msgs = basicSetCompatibleIoTypesBlock(newCompatibleIoTypesBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK, newCompatibleIoTypesBlock, newCompatibleIoTypesBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CableWeightDataBlock getCableWeightDataBlock() {
		return cableWeightDataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCableWeightDataBlock(CableWeightDataBlock newCableWeightDataBlock, NotificationChain msgs) {
		CableWeightDataBlock oldCableWeightDataBlock = cableWeightDataBlock;
		cableWeightDataBlock = newCableWeightDataBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK, oldCableWeightDataBlock, newCableWeightDataBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCableWeightDataBlock(CableWeightDataBlock newCableWeightDataBlock) {
		if (newCableWeightDataBlock != cableWeightDataBlock) {
			NotificationChain msgs = null;
			if (cableWeightDataBlock != null)
				msgs = ((InternalEObject)cableWeightDataBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK, null, msgs);
			if (newCableWeightDataBlock != null)
				msgs = ((InternalEObject)newCableWeightDataBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK, null, msgs);
			msgs = basicSetCableWeightDataBlock(newCableWeightDataBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK, newCableWeightDataBlock, newCableWeightDataBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionLevelDataBlock getProtectionLevelDataBlock() {
		return protectionLevelDataBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtectionLevelDataBlock(ProtectionLevelDataBlock newProtectionLevelDataBlock, NotificationChain msgs) {
		ProtectionLevelDataBlock oldProtectionLevelDataBlock = protectionLevelDataBlock;
		protectionLevelDataBlock = newProtectionLevelDataBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK, oldProtectionLevelDataBlock, newProtectionLevelDataBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectionLevelDataBlock(ProtectionLevelDataBlock newProtectionLevelDataBlock) {
		if (newProtectionLevelDataBlock != protectionLevelDataBlock) {
			NotificationChain msgs = null;
			if (protectionLevelDataBlock != null)
				msgs = ((InternalEObject)protectionLevelDataBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK, null, msgs);
			if (newProtectionLevelDataBlock != null)
				msgs = ((InternalEObject)newProtectionLevelDataBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK, null, msgs);
			msgs = basicSetProtectionLevelDataBlock(newProtectionLevelDataBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK, newProtectionLevelDataBlock, newProtectionLevelDataBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK:
				return basicSetCompatibleIoTypesBlock(null, msgs);
			case ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK:
				return basicSetCableWeightDataBlock(null, msgs);
			case ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK:
				return basicSetProtectionLevelDataBlock(null, msgs);
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
			case ModelPackage.GLOBAL_BLOCK__SYSTEM_NAME:
				return getSystemName();
			case ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK:
				return getCompatibleIoTypesBlock();
			case ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK:
				return getCableWeightDataBlock();
			case ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK:
				return getProtectionLevelDataBlock();
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
			case ModelPackage.GLOBAL_BLOCK__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK:
				setCompatibleIoTypesBlock((CompatibleIoTypesBlock)newValue);
				return;
			case ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK:
				setCableWeightDataBlock((CableWeightDataBlock)newValue);
				return;
			case ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK:
				setProtectionLevelDataBlock((ProtectionLevelDataBlock)newValue);
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
			case ModelPackage.GLOBAL_BLOCK__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK:
				setCompatibleIoTypesBlock((CompatibleIoTypesBlock)null);
				return;
			case ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK:
				setCableWeightDataBlock((CableWeightDataBlock)null);
				return;
			case ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK:
				setProtectionLevelDataBlock((ProtectionLevelDataBlock)null);
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
			case ModelPackage.GLOBAL_BLOCK__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case ModelPackage.GLOBAL_BLOCK__COMPATIBLE_IO_TYPES_BLOCK:
				return compatibleIoTypesBlock != null;
			case ModelPackage.GLOBAL_BLOCK__CABLE_WEIGHT_DATA_BLOCK:
				return cableWeightDataBlock != null;
			case ModelPackage.GLOBAL_BLOCK__PROTECTION_LEVEL_DATA_BLOCK:
				return protectionLevelDataBlock != null;
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(')');
		return result.toString();
	}

} //GlobalBlockImpl
