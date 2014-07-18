/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.MetricParameter;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.ProcessorImpl#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorImpl extends HardwareElementImpl implements Processor {
	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorType() <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorType()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorType() <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorType()
	 * @generated
	 * @ordered
	 */
	protected String processorType = PROCESSOR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

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
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCESSOR__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessorType() {
		return processorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorType(String newProcessorType) {
		String oldProcessorType = processorType;
		processorType = newProcessorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCESSOR__PROCESSOR_TYPE, oldProcessorType, processorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board getBoard() {
		if (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD) return null;
		return (Board)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Board basicGetBoard() {
		if (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD) return null;
		return (Board)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoard, ModelPackage.PROCESSOR__BOARD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Board newBoard) {
		if (newBoard != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROCESSOR__BOARD && newBoard != null)) {
			if (EcoreUtil.isAncestor(this, newBoard))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, ModelPackage.BOARD__PROCESSORS, Board.class, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCESSOR__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectContainmentWithInverseEList<Core>(Core.class, this, ModelPackage.PROCESSOR__CORES, ModelPackage.CORE__PROCESSOR);
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricParameter> getMetricParameters() {
		if (metricParameters == null) {
			metricParameters = new EObjectContainmentEList<MetricParameter>(MetricParameter.class, this, ModelPackage.PROCESSOR__METRIC_PARAMETERS);
		}
		return metricParameters;
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
			case ModelPackage.PROCESSOR__BOARD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoard((Board)otherEnd, msgs);
			case ModelPackage.PROCESSOR__CORES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCores()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.PROCESSOR__BOARD:
				return basicSetBoard(null, msgs);
			case ModelPackage.PROCESSOR__CORES:
				return ((InternalEList<?>)getCores()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROCESSOR__METRIC_PARAMETERS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.PROCESSOR__BOARD:
				return eInternalContainer().eInverseRemove(this, ModelPackage.BOARD__PROCESSORS, Board.class, msgs);
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
			case ModelPackage.PROCESSOR__MANUFACTURER:
				return getManufacturer();
			case ModelPackage.PROCESSOR__PROCESSOR_TYPE:
				return getProcessorType();
			case ModelPackage.PROCESSOR__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case ModelPackage.PROCESSOR__CORES:
				return getCores();
			case ModelPackage.PROCESSOR__METRIC_PARAMETERS:
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
			case ModelPackage.PROCESSOR__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case ModelPackage.PROCESSOR__PROCESSOR_TYPE:
				setProcessorType((String)newValue);
				return;
			case ModelPackage.PROCESSOR__BOARD:
				setBoard((Board)newValue);
				return;
			case ModelPackage.PROCESSOR__CORES:
				getCores().clear();
				getCores().addAll((Collection<? extends Core>)newValue);
				return;
			case ModelPackage.PROCESSOR__METRIC_PARAMETERS:
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
			case ModelPackage.PROCESSOR__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case ModelPackage.PROCESSOR__PROCESSOR_TYPE:
				setProcessorType(PROCESSOR_TYPE_EDEFAULT);
				return;
			case ModelPackage.PROCESSOR__BOARD:
				setBoard((Board)null);
				return;
			case ModelPackage.PROCESSOR__CORES:
				getCores().clear();
				return;
			case ModelPackage.PROCESSOR__METRIC_PARAMETERS:
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
			case ModelPackage.PROCESSOR__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case ModelPackage.PROCESSOR__PROCESSOR_TYPE:
				return PROCESSOR_TYPE_EDEFAULT == null ? processorType != null : !PROCESSOR_TYPE_EDEFAULT.equals(processorType);
			case ModelPackage.PROCESSOR__BOARD:
				return basicGetBoard() != null;
			case ModelPackage.PROCESSOR__CORES:
				return cores != null && !cores.isEmpty();
			case ModelPackage.PROCESSOR__METRIC_PARAMETERS:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (manufacturer: ");
		result.append(manufacturer);
		result.append(", processorType: ");
		result.append(processorType);
		result.append(')');
		return result.toString();
	}

} //ProcessorImpl
