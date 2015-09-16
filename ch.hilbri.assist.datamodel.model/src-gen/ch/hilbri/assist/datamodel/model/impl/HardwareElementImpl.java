/**
 */
package ch.hilbri.assist.datamodel.model.impl;

import ch.hilbri.assist.datamodel.model.HardwareElement;
import ch.hilbri.assist.datamodel.model.MetricParametersBlock;
import ch.hilbri.assist.datamodel.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.impl.HardwareElementImpl#getMetricParametersBlock <em>Metric Parameters Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwareElementImpl extends MinimalEObjectImpl.Container implements HardwareElement {
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
	 * The cached value of the '{@link #getMetricParametersBlock() <em>Metric Parameters Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricParametersBlock()
	 * @generated
	 * @ordered
	 */
	protected MetricParametersBlock metricParametersBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HARDWARE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HARDWARE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricParametersBlock getMetricParametersBlock() {
		return metricParametersBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetricParametersBlock(MetricParametersBlock newMetricParametersBlock, NotificationChain msgs) {
		MetricParametersBlock oldMetricParametersBlock = metricParametersBlock;
		metricParametersBlock = newMetricParametersBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK, oldMetricParametersBlock, newMetricParametersBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricParametersBlock(MetricParametersBlock newMetricParametersBlock) {
		if (newMetricParametersBlock != metricParametersBlock) {
			NotificationChain msgs = null;
			if (metricParametersBlock != null)
				msgs = ((InternalEObject)metricParametersBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK, null, msgs);
			if (newMetricParametersBlock != null)
				msgs = ((InternalEObject)newMetricParametersBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK, null, msgs);
			msgs = basicSetMetricParametersBlock(newMetricParametersBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK, newMetricParametersBlock, newMetricParametersBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK:
				return basicSetMetricParametersBlock(null, msgs);
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
			case ModelPackage.HARDWARE_ELEMENT__NAME:
				return getName();
			case ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK:
				return getMetricParametersBlock();
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
			case ModelPackage.HARDWARE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK:
				setMetricParametersBlock((MetricParametersBlock)newValue);
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
			case ModelPackage.HARDWARE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK:
				setMetricParametersBlock((MetricParametersBlock)null);
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
			case ModelPackage.HARDWARE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.HARDWARE_ELEMENT__METRIC_PARAMETERS_BLOCK:
				return metricParametersBlock != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HardwareElementImpl
