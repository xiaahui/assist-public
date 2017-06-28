/**
 */
package ch.hilbri.assist.mapping.model.result.impl;

import ch.hilbri.assist.mapping.model.Application;
import ch.hilbri.assist.mapping.model.AssistModel;
import ch.hilbri.assist.mapping.model.Board;
import ch.hilbri.assist.mapping.model.Box;
import ch.hilbri.assist.mapping.model.Compartment;
import ch.hilbri.assist.mapping.model.Core;
import ch.hilbri.assist.mapping.model.Processor;
import ch.hilbri.assist.mapping.model.Task;

import ch.hilbri.assist.mapping.model.result.Result;
import ch.hilbri.assist.mapping.model.result.ResultPackage;

import java.lang.Iterable;

import java.util.List;
import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

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
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getTask2CoreMap <em>Task2 Core Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getTotalScore <em>Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.impl.ResultImpl#getDetailedMappingResults <em>Detailed Mapping Results</em>}</li>
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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected AssistModel model;

	/**
	 * The cached value of the '{@link #getTask2CoreMap() <em>Task2 Core Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask2CoreMap()
	 * @generated
	 * @ordered
	 */
	protected Map<Task, Core> task2CoreMap;

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
	 * The default value of the '{@link #getTotalScore() <em>Total Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalScore()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_SCORE_EDEFAULT = 1.0;

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
	public AssistModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (AssistModel)eResolveProxy(oldModel);
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
	public AssistModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(AssistModel newModel) {
		AssistModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Task, Core> getTask2CoreMap() {
		return task2CoreMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask2CoreMap(Map<Task, Core> newTask2CoreMap) {
		Map<Task, Core> oldTask2CoreMap = task2CoreMap;
		task2CoreMap = newTask2CoreMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__TASK2_CORE_MAP, oldTask2CoreMap, task2CoreMap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.RESULT__TOTAL_SCORE, oldTotalScore, totalScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List<String>> getDetailedMappingResults() {
		Map<Task, Core> _task2CoreMap = this.getTask2CoreMap();
		Set<Entry<Task, Core>> _entrySet = _task2CoreMap.entrySet();
		final Function1<Entry<Task, Core>, List<String>> _function = new Function1<Entry<Task, Core>, List<String>>() {
			public List<String> apply(final Entry<Task, Core> it) {
				Task _key = it.getKey();
				EObject _eContainer = _key.eContainer();
				String _name = ((Application) _eContainer).getName();
				Task _key_1 = it.getKey();
				String _name_1 = _key_1.getName();
				Core _value = it.getValue();
				String _name_2 = _value.getName();
				Core _value_1 = it.getValue();
				EObject _eContainer_1 = _value_1.eContainer();
				String _name_3 = ((Processor) _eContainer_1).getName();
				Core _value_2 = it.getValue();
				EObject _eContainer_2 = _value_2.eContainer();
				EObject _eContainer_3 = _eContainer_2.eContainer();
				String _name_4 = ((Board) _eContainer_3).getName();
				Core _value_3 = it.getValue();
				EObject _eContainer_4 = _value_3.eContainer();
				EObject _eContainer_5 = _eContainer_4.eContainer();
				EObject _eContainer_6 = _eContainer_5.eContainer();
				String _name_5 = ((Box) _eContainer_6).getName();
				Core _value_4 = it.getValue();
				EObject _eContainer_7 = _value_4.eContainer();
				EObject _eContainer_8 = _eContainer_7.eContainer();
				EObject _eContainer_9 = _eContainer_8.eContainer();
				EObject _eContainer_10 = _eContainer_9.eContainer();
				String _name_6 = ((Compartment) _eContainer_10).getName();
				return java.util.Collections.<String>unmodifiableList(org.eclipse.xtext.xbase.lib.CollectionLiterals.<String>newArrayList(_name, _name_1, _name_2, _name_3, _name_4, _name_5, _name_6));
			}
		};
		Iterable<List<String>> _map = IterableExtensions.<Entry<Task, Core>, List<String>>map(_entrySet, _function);
		return ECollections.<List<String>>toEList(_map);
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
			case ResultPackage.RESULT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				return getTask2CoreMap();
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				return isPartialSolution();
			case ResultPackage.RESULT__TOTAL_SCORE:
				return getTotalScore();
			case ResultPackage.RESULT__DETAILED_MAPPING_RESULTS:
				return getDetailedMappingResults();
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
			case ResultPackage.RESULT__MODEL:
				setModel((AssistModel)newValue);
				return;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				setTask2CoreMap((Map<Task, Core>)newValue);
				return;
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution((Boolean)newValue);
				return;
			case ResultPackage.RESULT__TOTAL_SCORE:
				setTotalScore((Double)newValue);
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
			case ResultPackage.RESULT__MODEL:
				setModel((AssistModel)null);
				return;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				setTask2CoreMap((Map<Task, Core>)null);
				return;
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				setPartialSolution(PARTIAL_SOLUTION_EDEFAULT);
				return;
			case ResultPackage.RESULT__TOTAL_SCORE:
				setTotalScore(TOTAL_SCORE_EDEFAULT);
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
			case ResultPackage.RESULT__MODEL:
				return model != null;
			case ResultPackage.RESULT__TASK2_CORE_MAP:
				return task2CoreMap != null;
			case ResultPackage.RESULT__PARTIAL_SOLUTION:
				return partialSolution != PARTIAL_SOLUTION_EDEFAULT;
			case ResultPackage.RESULT__TOTAL_SCORE:
				return totalScore != TOTAL_SCORE_EDEFAULT;
			case ResultPackage.RESULT__DETAILED_MAPPING_RESULTS:
				return !getDetailedMappingResults().isEmpty();
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
		result.append(", task2CoreMap: ");
		result.append(task2CoreMap);
		result.append(", partialSolution: ");
		result.append(partialSolution);
		result.append(", totalScore: ");
		result.append(totalScore);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
