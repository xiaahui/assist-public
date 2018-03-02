/**
 */
package ch.hilbri.assist.model.impl;

import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.Application;
import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.Board;
import ch.hilbri.assist.model.Box;
import ch.hilbri.assist.model.Compartment;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.HardwareElement;
import ch.hilbri.assist.model.MappingResult;
import ch.hilbri.assist.model.ModelFactory;
import ch.hilbri.assist.model.ModelPackage;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.SingleMappingElement;
import ch.hilbri.assist.model.Task;

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;

import java.util.Map.Entry;

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

import org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions;

import org.eclipse.xtext.xbase.lib.DoubleExtensions;

import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getTask2CoreMap <em>Task2 Core Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getAbsoluteTotalScore <em>Absolute Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.impl.MappingResultImpl#getScaledTotalScore <em>Scaled Total Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingResultImpl extends MinimalEObjectImpl.Container implements MappingResult {
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
    protected AssistModel model;

    /**
     * The cached value of the '{@link #getTask2CoreMap() <em>Task2 Core Map</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTask2CoreMap()
     * @generated
     * @ordered
     */
    protected HashMap<Task, Core> task2CoreMap;

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
    protected MappingResultImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.MAPPING_RESULT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RESULT__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RESULT__INDEX, oldIndex, index));
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MAPPING_RESULT__MODEL, oldModel, model));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RESULT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HashMap<Task, Core> getTask2CoreMap() {
        return task2CoreMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask2CoreMap(HashMap<Task, Core> newTask2CoreMap) {
        HashMap<Task, Core> oldTask2CoreMap = task2CoreMap;
        task2CoreMap = newTask2CoreMap;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP, oldTask2CoreMap, task2CoreMap));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<AbstractMetric, Double> getMetricAbsoluteScoresMap() {
        if (metricAbsoluteScoresMap == null) {
            metricAbsoluteScoresMap = new EcoreEMap<AbstractMetric,Double>(ModelPackage.Literals.METRIC_SCORE_PAIR, MetricScorePairImpl.class, this, ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP);
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
            metricScaledScoresMap = new EcoreEMap<AbstractMetric,Double>(ModelPackage.Literals.METRIC_SCORE_PAIR, MetricScorePairImpl.class, this, ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP);
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION, oldPartialSolution, partialSolution));
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
    public EList<Task> getMappedTasksForCore(final Core core) {
        final Function1<Task, Boolean> _function = new Function1<Task, Boolean>() {
            public Boolean apply(final Task it) {
                Core _get = MappingResultImpl.this.getTask2CoreMap().get(it);
                return Boolean.valueOf(Objects.equal(_get, core));
            }
        };
        return ECollections.<Task>toEList(IterableExtensions.<Task>filter(this.getTask2CoreMap().keySet(), _function));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAbsoluteCoreUtilization(final Core core) {
        Integer _xblockexpression = null;
        {
            final EList<Task> taskList = this.getMappedTasksForCore(core);
            Integer _xifexpression = null;
            boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(taskList);
            boolean _not = (!_isNullOrEmpty);
            if (_not) {
                final Function1<Task, Integer> _function = new Function1<Task, Integer>() {
                    public Integer apply(final Task it) {
                        return Integer.valueOf(it.getCoreUtilization());
                    }
                };
                final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
                    public Integer apply(final Integer p1, final Integer p2) {
                        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
                    }
                };
                _xifexpression = IterableExtensions.<Integer>reduce(XcoreEListExtensions.<Task, Integer>map(taskList, _function), _function_1);
            }
            else {
                _xifexpression = Integer.valueOf(0);
            }
            _xblockexpression = _xifexpression;
        }
        return (_xblockexpression).intValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getRelativeCoreUtilization(final Core core) {
        double _xifexpression = (double) 0;
        int _capacity = core.getCapacity();
        boolean _greaterThan = (_capacity > 0);
        if (_greaterThan) {
            int _absoluteCoreUtilization = this.getAbsoluteCoreUtilization(core);
            Double _double = new Double(_absoluteCoreUtilization);
            int _capacity_1 = core.getCapacity();
            Double _double_1 = new Double(_capacity_1);
            _xifexpression = DoubleExtensions.operator_divide(_double, _double_1);
        }
        else {
            _xifexpression = (-1.0);
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HardwareElement getHardwareElementForTask(final Task task, final int level) {
        HardwareElement _xifexpression = null;
        if ((level == 0)) {
            _xifexpression = this.getTask2CoreMap().get(task);
        }
        else {
            HardwareElement _xifexpression_1 = null;
            if ((level == 1)) {
                _xifexpression_1 = this.getTask2CoreMap().get(task).getProcessor();
            }
            else {
                HardwareElement _xifexpression_2 = null;
                if ((level == 2)) {
                    _xifexpression_2 = this.getTask2CoreMap().get(task).getProcessor().getBoard();
                }
                else {
                    HardwareElement _xifexpression_3 = null;
                    if ((level == 3)) {
                        _xifexpression_3 = this.getTask2CoreMap().get(task).getProcessor().getBoard().getBox();
                    }
                    else {
                        Compartment _xifexpression_4 = null;
                        if ((level == 4)) {
                            _xifexpression_4 = this.getTask2CoreMap().get(task).getProcessor().getBoard().getBox().getCompartment();
                        }
                        else {
                            _xifexpression_4 = null;
                        }
                        _xifexpression_3 = _xifexpression_4;
                    }
                    _xifexpression_2 = _xifexpression_3;
                }
                _xifexpression_1 = _xifexpression_2;
            }
            _xifexpression = _xifexpression_1;
        }
        return _xifexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SingleMappingElement> getMappingElements() {
        final Function1<Entry<Task, Core>, SingleMappingElement> _function = new Function1<Entry<Task, Core>, SingleMappingElement>() {
            public SingleMappingElement apply(final Entry<Task, Core> it) {
                SingleMappingElement _xblockexpression = null;
                {
                    EObject _eContainer = it.getKey().eContainer();
                    final Application application = ((Application) _eContainer);
                    final Task task = it.getKey();
                    final Core core = it.getValue();
                    EObject _eContainer_1 = it.getValue().eContainer();
                    final Processor processor = ((Processor) _eContainer_1);
                    EObject _eContainer_2 = it.getValue().eContainer().eContainer();
                    final Board board = ((Board) _eContainer_2);
                    EObject _eContainer_3 = it.getValue().eContainer().eContainer().eContainer();
                    final Box box = ((Box) _eContainer_3);
                    EObject _eContainer_4 = it.getValue().eContainer().eContainer().eContainer().eContainer();
                    final Compartment compartment = ((Compartment) _eContainer_4);
                    SingleMappingElement _createSingleMappingElement = ModelFactory.eINSTANCE.createSingleMappingElement();
                    final Procedure1<SingleMappingElement> _function = new Procedure1<SingleMappingElement>() {
                        public void apply(final SingleMappingElement it) {
                            it.setApplication(application);
                            it.setTask(task);
                            it.setCore(core);
                            it.setProcessor(processor);
                            it.setBoard(board);
                            it.setBox(box);
                            it.setCompartment(compartment);
                        }
                    };
                    _xblockexpression = ObjectExtensions.<SingleMappingElement>operator_doubleArrow(_createSingleMappingElement, _function);
                }
                return _xblockexpression;
            }
        };
        return ECollections.<SingleMappingElement>toEList(IterableExtensions.<Entry<Task, Core>, SingleMappingElement>map(this.getTask2CoreMap().entrySet(), _function));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int compareTo(final MappingResult o) {
        return Double.compare(o.getScaledTotalScore(), this.getScaledTotalScore());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String toString() {
        String _xblockexpression = null;
        {
            final StringBuilder sb = new StringBuilder();
            String _name = this.getName();
            String _plus = ("Result        : " + _name);
            String _plus_1 = (_plus + " (");
            int _index = this.getIndex();
            String _plus_2 = (_plus_1 + Integer.valueOf(_index));
            String _plus_3 = (_plus_2 + ")\n");
            sb.append(_plus_3);
            double _absoluteTotalScore = this.getAbsoluteTotalScore();
            String _plus_4 = ("Absolute Score: " + Double.valueOf(_absoluteTotalScore));
            String _plus_5 = (_plus_4 + "\n");
            sb.append(_plus_5);
            double _scaledTotalScore = this.getScaledTotalScore();
            String _plus_6 = ("Relative Score: " + Double.valueOf(_scaledTotalScore));
            String _plus_7 = (_plus_6 + "\n");
            sb.append(_plus_7);
            EList<Task> _allTasks = this.getModel().getAllTasks();
            for (final Task task : _allTasks) {
                String _fullName = task.getFullName();
                String _plus_8 = (_fullName + "\t->\t");
                String _fullName_1 = this.getTask2CoreMap().get(task).getFullName();
                String _plus_9 = (_plus_8 + _fullName_1);
                String _plus_10 = (_plus_9 + "\n");
                sb.append(_plus_10);
            }
            _xblockexpression = sb.toString();
        }
        return _xblockexpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
                return ((InternalEList<?>)getMetricAbsoluteScoresMap()).basicRemove(otherEnd, msgs);
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
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
            case ModelPackage.MAPPING_RESULT__NAME:
                return getName();
            case ModelPackage.MAPPING_RESULT__INDEX:
                return getIndex();
            case ModelPackage.MAPPING_RESULT__MODEL:
                if (resolve) return getModel();
                return basicGetModel();
            case ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP:
                return getTask2CoreMap();
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
                if (coreType) return getMetricAbsoluteScoresMap();
                else return getMetricAbsoluteScoresMap().map();
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
                if (coreType) return getMetricScaledScoresMap();
                else return getMetricScaledScoresMap().map();
            case ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION:
                return isPartialSolution();
            case ModelPackage.MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE:
                return getAbsoluteTotalScore();
            case ModelPackage.MAPPING_RESULT__SCALED_TOTAL_SCORE:
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
            case ModelPackage.MAPPING_RESULT__NAME:
                setName((String)newValue);
                return;
            case ModelPackage.MAPPING_RESULT__INDEX:
                setIndex((Integer)newValue);
                return;
            case ModelPackage.MAPPING_RESULT__MODEL:
                setModel((AssistModel)newValue);
                return;
            case ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP:
                setTask2CoreMap((HashMap<Task, Core>)newValue);
                return;
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
                ((EStructuralFeature.Setting)getMetricAbsoluteScoresMap()).set(newValue);
                return;
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
                ((EStructuralFeature.Setting)getMetricScaledScoresMap()).set(newValue);
                return;
            case ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION:
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
            case ModelPackage.MAPPING_RESULT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.MAPPING_RESULT__INDEX:
                setIndex(INDEX_EDEFAULT);
                return;
            case ModelPackage.MAPPING_RESULT__MODEL:
                setModel((AssistModel)null);
                return;
            case ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP:
                setTask2CoreMap((HashMap<Task, Core>)null);
                return;
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
                getMetricAbsoluteScoresMap().clear();
                return;
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
                getMetricScaledScoresMap().clear();
                return;
            case ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION:
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
            case ModelPackage.MAPPING_RESULT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.MAPPING_RESULT__INDEX:
                return index != INDEX_EDEFAULT;
            case ModelPackage.MAPPING_RESULT__MODEL:
                return model != null;
            case ModelPackage.MAPPING_RESULT__TASK2_CORE_MAP:
                return task2CoreMap != null;
            case ModelPackage.MAPPING_RESULT__METRIC_ABSOLUTE_SCORES_MAP:
                return metricAbsoluteScoresMap != null && !metricAbsoluteScoresMap.isEmpty();
            case ModelPackage.MAPPING_RESULT__METRIC_SCALED_SCORES_MAP:
                return metricScaledScoresMap != null && !metricScaledScoresMap.isEmpty();
            case ModelPackage.MAPPING_RESULT__PARTIAL_SOLUTION:
                return partialSolution != PARTIAL_SOLUTION_EDEFAULT;
            case ModelPackage.MAPPING_RESULT__ABSOLUTE_TOTAL_SCORE:
                return getAbsoluteTotalScore() != ABSOLUTE_TOTAL_SCORE_EDEFAULT;
            case ModelPackage.MAPPING_RESULT__SCALED_TOTAL_SCORE:
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
            case ModelPackage.MAPPING_RESULT___GET_MAPPED_TASKS_FOR_CORE__CORE:
                return getMappedTasksForCore((Core)arguments.get(0));
            case ModelPackage.MAPPING_RESULT___GET_ABSOLUTE_CORE_UTILIZATION__CORE:
                return getAbsoluteCoreUtilization((Core)arguments.get(0));
            case ModelPackage.MAPPING_RESULT___GET_RELATIVE_CORE_UTILIZATION__CORE:
                return getRelativeCoreUtilization((Core)arguments.get(0));
            case ModelPackage.MAPPING_RESULT___GET_HARDWARE_ELEMENT_FOR_TASK__TASK_INT:
                return getHardwareElementForTask((Task)arguments.get(0), (Integer)arguments.get(1));
            case ModelPackage.MAPPING_RESULT___GET_MAPPING_ELEMENTS:
                return getMappingElements();
            case ModelPackage.MAPPING_RESULT___COMPARE_TO__MAPPINGRESULT:
                return compareTo((MappingResult)arguments.get(0));
            case ModelPackage.MAPPING_RESULT___TO_STRING:
                return toString();
        }
        return super.eInvoke(operationID, arguments);
    }

} //MappingResultImpl
