/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result.impl;

import ch.hilbri.assist.result.AbstractMetric;
import ch.hilbri.assist.result.Evaluation;
import ch.hilbri.assist.result.ResultPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.hilbri.assist.result.impl.EvaluationImpl#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.EvaluationImpl#getIndividualScores <em>Individual Scores</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.impl.EvaluationImpl#getMetricsUsed <em>Metrics Used</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation {
	/**
	 * The default value of the '{@link #getTotalScore() <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalScore() <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalScore()
	 * @generated
	 * @ordered
	 */
	protected double totalScore = TOTAL_SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndividualScores() <em>Individual Scores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualScores()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> individualScores;

	/**
	 * The cached value of the '{@link #getMetricsUsed() <em>Metrics Used</em>}' containment reference list.
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
		return ResultPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalScore() {
		return totalScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalScore(double newTotalScore) {
		double oldTotalScore = totalScore;
		totalScore = newTotalScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.EVALUATION__TOTAL_SCORE, oldTotalScore, totalScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getIndividualScores() {
		if (individualScores == null) {
			individualScores = new EDataTypeEList<Double>(Double.class, this, ResultPackage.EVALUATION__INDIVIDUAL_SCORES);
		}
		return individualScores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMetric> getMetricsUsed() {
		if (metricsUsed == null) {
			metricsUsed = new EObjectContainmentEList<AbstractMetric>(AbstractMetric.class, this, ResultPackage.EVALUATION__METRICS_USED);
		}
		return metricsUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.EVALUATION__METRICS_USED:
				return ((InternalEList<?>)getMetricsUsed()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.EVALUATION__TOTAL_SCORE:
				return getTotalScore();
			case ResultPackage.EVALUATION__INDIVIDUAL_SCORES:
				return getIndividualScores();
			case ResultPackage.EVALUATION__METRICS_USED:
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
			case ResultPackage.EVALUATION__TOTAL_SCORE:
				setTotalScore((Double)newValue);
				return;
			case ResultPackage.EVALUATION__INDIVIDUAL_SCORES:
				getIndividualScores().clear();
				getIndividualScores().addAll((Collection<? extends Double>)newValue);
				return;
			case ResultPackage.EVALUATION__METRICS_USED:
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
			case ResultPackage.EVALUATION__TOTAL_SCORE:
				setTotalScore(TOTAL_SCORE_EDEFAULT);
				return;
			case ResultPackage.EVALUATION__INDIVIDUAL_SCORES:
				getIndividualScores().clear();
				return;
			case ResultPackage.EVALUATION__METRICS_USED:
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
			case ResultPackage.EVALUATION__TOTAL_SCORE:
				return totalScore != TOTAL_SCORE_EDEFAULT;
			case ResultPackage.EVALUATION__INDIVIDUAL_SCORES:
				return individualScores != null && !individualScores.isEmpty();
			case ResultPackage.EVALUATION__METRICS_USED:
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
		result.append(" (totalScore: ");
		result.append(totalScore);
		result.append(", individualScores: ");
		result.append(individualScores);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
