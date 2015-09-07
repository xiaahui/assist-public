/**
 */
package ch.hilbri.assist.datamodel.result.mapping.impl;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Evaluation;
import ch.hilbri.assist.datamodel.result.mapping.MappingPackage;

import com.google.common.base.Objects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl#getAbsoluteScores <em>Absolute Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl#getScaledScores <em>Scaled Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl#getTotalScaledScore <em>Total Scaled Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.impl.EvaluationImpl#getMetricsUsed <em>Metrics Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation {
	/**
	 * The cached value of the '{@link #getAbsoluteScores() <em>Absolute Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteScores()
	 * @generated
	 * @ordered
	 */
	protected HashMap<AbstractMetric, Double> absoluteScores;

	/**
	 * The cached value of the '{@link #getScaledScores() <em>Scaled Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaledScores()
	 * @generated
	 * @ordered
	 */
	protected HashMap<AbstractMetric, Double> scaledScores;

	/**
	 * The default value of the '{@link #getTotalScaledScore() <em>Total Scaled Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalScaledScore()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_SCALED_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMetricsUsed() <em>Metrics Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMetric> metricsUsed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<AbstractMetric, Double> getAbsoluteScores() {
		return absoluteScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteScores(HashMap<AbstractMetric, Double> newAbsoluteScores) {
		HashMap<AbstractMetric, Double> oldAbsoluteScores = absoluteScores;
		absoluteScores = newAbsoluteScores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.EVALUATION__ABSOLUTE_SCORES, oldAbsoluteScores, absoluteScores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<AbstractMetric, Double> getScaledScores() {
		return scaledScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaledScores(HashMap<AbstractMetric, Double> newScaledScores) {
		HashMap<AbstractMetric, Double> oldScaledScores = scaledScores;
		scaledScores = newScaledScores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.EVALUATION__SCALED_SCORES, oldScaledScores, scaledScores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalScaledScore() {
		Double _xifexpression = null;
		boolean _or = false;
		HashMap<AbstractMetric, Double> _scaledScores = this.getScaledScores();
		boolean _equals = Objects.equal(_scaledScores, null);
		if (_equals) {
			_or = true;
		} else {
			HashMap<AbstractMetric, Double> _scaledScores_1 = this.getScaledScores();
			Set<AbstractMetric> _keySet = _scaledScores_1.keySet();
			int _size = _keySet.size();
			boolean _equals_1 = (_size == 0);
			_or = _equals_1;
		}
		if (_or) {
			return 0.0;
		}
		else {
			HashMap<AbstractMetric, Double> _scaledScores_2 = this.getScaledScores();
			Collection<Double> _values = _scaledScores_2.values();
			final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
				public Double apply(final Double i1, final Double i2) {
					return Double.valueOf(DoubleExtensions.operator_plus(i1, i2));
				}
			};
			_xifexpression = IterableExtensions.<Double>reduce(_values, _function);
		}
		return (_xifexpression).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMetric> getMetricsUsed() {
		if (metricsUsed == null) {
			metricsUsed = new EObjectResolvingEList<AbstractMetric>(AbstractMetric.class, this, MappingPackage.EVALUATION__METRICS_USED);
		}
		return metricsUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.EVALUATION__ABSOLUTE_SCORES:
				return getAbsoluteScores();
			case MappingPackage.EVALUATION__SCALED_SCORES:
				return getScaledScores();
			case MappingPackage.EVALUATION__TOTAL_SCALED_SCORE:
				return getTotalScaledScore();
			case MappingPackage.EVALUATION__METRICS_USED:
				return getMetricsUsed();
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
			case MappingPackage.EVALUATION__ABSOLUTE_SCORES:
				setAbsoluteScores((HashMap<AbstractMetric, Double>)newValue);
				return;
			case MappingPackage.EVALUATION__SCALED_SCORES:
				setScaledScores((HashMap<AbstractMetric, Double>)newValue);
				return;
			case MappingPackage.EVALUATION__METRICS_USED:
				getMetricsUsed().clear();
				getMetricsUsed().addAll((Collection<? extends AbstractMetric>)newValue);
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
			case MappingPackage.EVALUATION__ABSOLUTE_SCORES:
				setAbsoluteScores((HashMap<AbstractMetric, Double>)null);
				return;
			case MappingPackage.EVALUATION__SCALED_SCORES:
				setScaledScores((HashMap<AbstractMetric, Double>)null);
				return;
			case MappingPackage.EVALUATION__METRICS_USED:
				getMetricsUsed().clear();
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
			case MappingPackage.EVALUATION__ABSOLUTE_SCORES:
				return absoluteScores != null;
			case MappingPackage.EVALUATION__SCALED_SCORES:
				return scaledScores != null;
			case MappingPackage.EVALUATION__TOTAL_SCALED_SCORE:
				return getTotalScaledScore() != TOTAL_SCALED_SCORE_EDEFAULT;
			case MappingPackage.EVALUATION__METRICS_USED:
				return metricsUsed != null && !metricsUsed.isEmpty();
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
		result.append(" (absoluteScores: ");
		result.append(absoluteScores);
		result.append(", scaledScores: ");
		result.append(scaledScores);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
