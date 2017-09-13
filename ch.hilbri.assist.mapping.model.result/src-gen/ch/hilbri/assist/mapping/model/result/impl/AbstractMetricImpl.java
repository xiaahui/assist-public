/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl#isBuiltIn <em>Built In</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl#isHigherScoreIsBetter <em>Higher Score Is Better</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.AbstractMetricImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMetricImpl extends MinimalEObjectImpl.Container implements AbstractMetric {
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
	 * The default value of the '{@link #isBuiltIn() <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuiltIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUILT_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuiltIn() <em>Built In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuiltIn()
	 * @generated
	 * @ordered
	 */
	protected boolean builtIn = BUILT_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isHigherScoreIsBetter() <em>Higher Score Is Better</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHigherScoreIsBetter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGHER_SCORE_IS_BETTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHigherScoreIsBetter() <em>Higher Score Is Better</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHigherScoreIsBetter()
	 * @generated
	 * @ordered
	 */
	protected boolean higherScoreIsBetter = HIGHER_SCORE_IS_BETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.ABSTRACT_METRIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ABSTRACT_METRIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuiltIn() {
		return builtIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuiltIn(boolean newBuiltIn) {
		boolean oldBuiltIn = builtIn;
		builtIn = newBuiltIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ABSTRACT_METRIC__BUILT_IN, oldBuiltIn, builtIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHigherScoreIsBetter() {
		return higherScoreIsBetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHigherScoreIsBetter(boolean newHigherScoreIsBetter) {
		boolean oldHigherScoreIsBetter = higherScoreIsBetter;
		higherScoreIsBetter = newHigherScoreIsBetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER, oldHigherScoreIsBetter, higherScoreIsBetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ABSTRACT_METRIC__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double computeAbsoluteScore(Result result) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResultPackage.ABSTRACT_METRIC__NAME:
				return getName();
			case ResultPackage.ABSTRACT_METRIC__BUILT_IN:
				return isBuiltIn();
			case ResultPackage.ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER:
				return isHigherScoreIsBetter();
			case ResultPackage.ABSTRACT_METRIC__WEIGHT:
				return getWeight();
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
			case ResultPackage.ABSTRACT_METRIC__NAME:
				setName((String)newValue);
				return;
			case ResultPackage.ABSTRACT_METRIC__BUILT_IN:
				setBuiltIn((Boolean)newValue);
				return;
			case ResultPackage.ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER:
				setHigherScoreIsBetter((Boolean)newValue);
				return;
			case ResultPackage.ABSTRACT_METRIC__WEIGHT:
				setWeight((Integer)newValue);
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
			case ResultPackage.ABSTRACT_METRIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultPackage.ABSTRACT_METRIC__BUILT_IN:
				setBuiltIn(BUILT_IN_EDEFAULT);
				return;
			case ResultPackage.ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER:
				setHigherScoreIsBetter(HIGHER_SCORE_IS_BETTER_EDEFAULT);
				return;
			case ResultPackage.ABSTRACT_METRIC__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case ResultPackage.ABSTRACT_METRIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultPackage.ABSTRACT_METRIC__BUILT_IN:
				return builtIn != BUILT_IN_EDEFAULT;
			case ResultPackage.ABSTRACT_METRIC__HIGHER_SCORE_IS_BETTER:
				return higherScoreIsBetter != HIGHER_SCORE_IS_BETTER_EDEFAULT;
			case ResultPackage.ABSTRACT_METRIC__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
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
			case ResultPackage.ABSTRACT_METRIC___COMPUTE_ABSOLUTE_SCORE__RESULT:
				return computeAbsoluteScore((Result)arguments.get(0));
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
		result.append(", builtIn: ");
		result.append(builtIn);
		result.append(", higherScoreIsBetter: ");
		result.append(higherScoreIsBetter);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //AbstractMetricImpl
