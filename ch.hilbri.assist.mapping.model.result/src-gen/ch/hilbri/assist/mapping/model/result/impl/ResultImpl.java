/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.result.AbstractMetric;
import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.ResultPackage;
import ch.hilbri.assist.mapping.model.result.SingleMappingElement;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getTask2CoreMap <em>Task2 Core Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getAbsoluteTotalScore <em>Absolute Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getScaledTotalScore <em>Scaled Total Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultImpl extends MinimalEObjectImpl.Container implements Result {
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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Object model;

	/**
	 * The cached value of the '{@link #getTask2CoreMap() <em>Task2 Core Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask2CoreMap()
	 * @generated
	 * @ordered
	 */
	protected HashMap<Object, Object> task2CoreMap;

	/**
	 * The cached value of the '{@link #getMetricAbsoluteScoresMap() <em>Metric Absolute Scores Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricAbsoluteScoresMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<AbstractMetric, Double> metricAbsoluteScoresMap;

	/**
	 * The cached value of the '{@link #getMetricScaledScoresMap() <em>Metric Scaled Scores Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricScaledScoresMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<AbstractMetric, Double> metricScaledScoresMap;

	/**
	 * The default value of the '{@link #isPartialSolution() <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialSolution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_SOLUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartialSolution() <em>Partial Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialSolution()
	 * @generated
	 * @ordered
	 */
	protected boolean partialSolution = PARTIAL_SOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsoluteTotalScore() <em>Absolute Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteTotalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double ABSOLUTE_TOTAL_SCORE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getScaledTotalScore() <em>Scaled Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaledTotalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALED_TOTAL_SCORE_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.RESULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getModel() {
		if (model != null && ((EObject)model).eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Object)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.RESULT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Object newModel) {
		Object oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<Object, Object> getTask2CoreMap() {
		return task2CoreMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask2CoreMap(HashMap<Object, Object> newTask2CoreMap) {
		HashMap<Object, Object> oldTask2CoreMap = task2CoreMap;
		task2CoreMap = newTask2CoreMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__TASK2_CORE_MAP, oldTask2CoreMap, task2CoreMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<AbstractMetric, Double> getMetricAbsoluteScoresMap() {
		if (metricAbsoluteScoresMap == null) {
			metricAbsoluteScoresMap = new EcoreEMap<AbstractMetric,Double>(ResultPackage.Literals.METRIC_SCORE_PAIR, MetricScorePairImpl.class, this, ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP);
		}
		return metricAbsoluteScoresMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<AbstractMetric, Double> getMetricScaledScoresMap() {
		if (metricScaledScoresMap == null) {
			metricScaledScoresMap = new EcoreEMap<AbstractMetric,Double>(ResultPackage.Literals.METRIC_SCORE_PAIR, MetricScorePairImpl.class, this, ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP);
		}
		return metricScaledScoresMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartialSolution() {
		return partialSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialSolution(boolean newPartialSolution) {
		boolean oldPartialSolution = partialSolution;
		partialSolution = newPartialSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__PARTIAL_SOLUTION, oldPartialSolution, partialSolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAbsoluteTotalScore() {
		Double _xifexpression = null;
		boolean _isEmpty = this.getMetricAbsoluteScoresMap().keySet().isEmpty();
		if (_isEmpty) {
			_xifexpression = Double.valueOf(0.0);
		}
		else {
			final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
				public Double apply(final Double p1, final Double p2) {
					return Double.valueOf(DoubleExtensions.operator_plus(p1, p2));
				}
			};
			_xifexpression = IterableExtensions.<Double>reduce(this.getMetricAbsoluteScoresMap().values(), _function);
		}
		return (_xifexpression).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScaledTotalScore() {
		Double _xifexpression = null;
		boolean _isEmpty = this.getMetricScaledScoresMap().keySet().isEmpty();
		if (_isEmpty) {
			_xifexpression = Double.valueOf(0.0);
		}
		else {
			final Function2<Double, Double, Double> _function = new Function2<Double, Double, Double>() {
				public Double apply(final Double p1, final Double p2) {
					return Double.valueOf(DoubleExtensions.operator_plus(p1, p2));
				}
			};
			_xifexpression = IterableExtensions.<Double>reduce(this.getMetricScaledScoresMap().values(), _function);
		}
		return (_xifexpression).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getMappedTasksForCore(final Object core) {
		final Function1<Object, Boolean> _function = new Function1<Object, Boolean>() {
			public Boolean apply(final Object it) {
				Object _get = ResultImpl.this.getTask2CoreMap().get(it);
				return Boolean.valueOf(Objects.equal(_get, core));
			}
		};
		return ECollections.<Object>toEList(IterableExtensions.<Object>filter(this.getTask2CoreMap().keySet(), _function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAbsoluteCoreUtilization(final Object core) {
		throw new Error("Unresolved compilation problems: The method or field coreUtilization is undefined for the type Object");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativeCoreUtilization(final Object core) {
		throw new Error("Unresolved compilation problems: The method or field capacity is undefined for the type Object");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getHardwareElementForTask(final Object task, final int level) {
		throw new Error("Unresolved compilation problems: The method or field processor is undefined for the type Object");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleMappingElement> getMappingElements() {
		throw new Error("Unresolved compilation problems: Application cannot be resolved to a type.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int compareTo(final Result o) {
		return Double.compare(o.getScaledTotalScore(), this.getScaledTotalScore());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		throw new Error("Unresolved compilation problems: The method or field allTasks is undefined for the type Object");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP:
				return ((InternalEList<?>)getMetricAbsoluteScoresMap()).basicRemove(otherEnd, msgs);
			case ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP:
				return ((InternalEList<?>)getMetricScaledScoresMap()).basicRemove(otherEnd, msgs);
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
			case ResultPackage.RESULT__NAME:
				return getName();
			case ResultPackage.RESULT__INDEX:
				return getIndex();
			case ResultPackage.RESULT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				return getTask2CoreMap();
			case ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP:
				if (coreType) return getMetricAbsoluteScoresMap();
				else return getMetricAbsoluteScoresMap().map();
			case ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP:
				if (coreType) return getMetricScaledScoresMap();
				else return getMetricScaledScoresMap().map();
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				return isPartialSolution();
			case ResultPackage.RESULT__ABSOLUTE_TOTAL_SCORE:
				return getAbsoluteTotalScore();
			case ResultPackage.RESULT__SCALED_TOTAL_SCORE:
				return getScaledTotalScore();
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
			case ResultPackage.RESULT__NAME:
				setName((String)newValue);
				return;
			case ResultPackage.RESULT__INDEX:
				setIndex((Integer)newValue);
				return;
			case ResultPackage.RESULT__MODEL:
				setModel(newValue);
				return;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				setTask2CoreMap((HashMap<Object, Object>)newValue);
				return;
			case ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP:
				((EStructuralFeature.Setting)getMetricAbsoluteScoresMap()).set(newValue);
				return;
			case ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP:
				((EStructuralFeature.Setting)getMetricScaledScoresMap()).set(newValue);
				return;
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution((Boolean)newValue);
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
			case ResultPackage.RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ResultPackage.RESULT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ResultPackage.RESULT__MODEL:
				setModel((Object)null);
				return;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				setTask2CoreMap((HashMap<Object, Object>)null);
				return;
			case ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP:
				getMetricAbsoluteScoresMap().clear();
				return;
			case ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP:
				getMetricScaledScoresMap().clear();
				return;
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution(PARTIAL_SOLUTION_EDEFAULT);
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
			case ResultPackage.RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ResultPackage.RESULT__INDEX:
				return index != INDEX_EDEFAULT;
			case ResultPackage.RESULT__MODEL:
				return model != null;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				return task2CoreMap != null;
			case ResultPackage.RESULT__METRIC_ABSOLUTE_SCORES_MAP:
				return metricAbsoluteScoresMap != null && !metricAbsoluteScoresMap.isEmpty();
			case ResultPackage.RESULT__METRIC_SCALED_SCORES_MAP:
				return metricScaledScoresMap != null && !metricScaledScoresMap.isEmpty();
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				return partialSolution != PARTIAL_SOLUTION_EDEFAULT;
			case ResultPackage.RESULT__ABSOLUTE_TOTAL_SCORE:
				return getAbsoluteTotalScore() != ABSOLUTE_TOTAL_SCORE_EDEFAULT;
			case ResultPackage.RESULT__SCALED_TOTAL_SCORE:
				return getScaledTotalScore() != SCALED_TOTAL_SCORE_EDEFAULT;
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
			case ResultPackage.RESULT___GET_MAPPED_TASKS_FOR_CORE__OBJECT:
				return getMappedTasksForCore(arguments.get(0));
			case ResultPackage.RESULT___GET_ABSOLUTE_CORE_UTILIZATION__OBJECT:
				return getAbsoluteCoreUtilization(arguments.get(0));
			case ResultPackage.RESULT___GET_RELATIVE_CORE_UTILIZATION__OBJECT:
				return getRelativeCoreUtilization(arguments.get(0));
			case ResultPackage.RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__OBJECT_INT:
				return getHardwareElementForTask(arguments.get(0), (Integer)arguments.get(1));
			case ResultPackage.RESULT___GET_MAPPING_ELEMENTS:
				return getMappingElements();
			case ResultPackage.RESULT___COMPARE_TO__RESULT:
				return compareTo((Result)arguments.get(0));
			case ResultPackage.RESULT___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ResultImpl
