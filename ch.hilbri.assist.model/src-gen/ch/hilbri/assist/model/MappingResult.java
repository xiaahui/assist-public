/**
 */
package ch.hilbri.assist.model;

import java.lang.Comparable;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getIndex <em>Index</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getTask2CoreMap <em>Task2 Core Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getModel <em>Model</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getMetricAbsoluteScoresMap <em>Metric Absolute Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getMetricScaledScoresMap <em>Metric Scaled Scores Map</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#isPartialSolution <em>Partial Solution</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getAbsoluteTotalScore <em>Absolute Total Score</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.MappingResult#getScaledTotalScore <em>Scaled Total Score</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getMappingResult()
 * @model superTypes="ch.hilbri.assist.model.Comparable"
 * @generated
 */
public interface MappingResult extends EObject, Comparable<MappingResult> {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_Name()
     * @model unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingResult#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Index</em>' attribute.
     * @see #setIndex(int)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_Index()
     * @model unique="false"
     * @generated
     */
    int getIndex();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingResult#getIndex <em>Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Index</em>' attribute.
     * @see #getIndex()
     * @generated
     */
    void setIndex(int value);

    /**
     * Returns the value of the '<em><b>Task2 Core Map</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task2 Core Map</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task2 Core Map</em>' attribute.
     * @see #setTask2CoreMap(HashMap)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_Task2CoreMap()
     * @model unique="false" dataType="ch.hilbri.assist.model.Task2CoreMapType"
     * @generated
     */
    HashMap<Task, Core> getTask2CoreMap();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingResult#getTask2CoreMap <em>Task2 Core Map</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task2 Core Map</em>' attribute.
     * @see #getTask2CoreMap()
     * @generated
     */
    void setTask2CoreMap(HashMap<Task, Core> value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' reference.
     * @see #setModel(AssistModel)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_Model()
     * @model
     * @generated
     */
    AssistModel getModel();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingResult#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(AssistModel value);

    /**
     * Returns the value of the '<em><b>Metric Absolute Scores Map</b></em>' map.
     * The key is of type {@link ch.hilbri.assist.model.AbstractMappingMetric},
     * and the value is of type {@link java.lang.Double},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metric Absolute Scores Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metric Absolute Scores Map</em>' map.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_MetricAbsoluteScoresMap()
     * @model mapType="ch.hilbri.assist.model.MetricScorePair&lt;ch.hilbri.assist.model.AbstractMappingMetric, org.eclipse.emf.ecore.EDoubleObject&gt;"
     * @generated
     */
    EMap<AbstractMappingMetric, Double> getMetricAbsoluteScoresMap();

    /**
     * Returns the value of the '<em><b>Metric Scaled Scores Map</b></em>' map.
     * The key is of type {@link ch.hilbri.assist.model.AbstractMappingMetric},
     * and the value is of type {@link java.lang.Double},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Metric Scaled Scores Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Metric Scaled Scores Map</em>' map.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_MetricScaledScoresMap()
     * @model mapType="ch.hilbri.assist.model.MetricScorePair&lt;ch.hilbri.assist.model.AbstractMappingMetric, org.eclipse.emf.ecore.EDoubleObject&gt;"
     * @generated
     */
    EMap<AbstractMappingMetric, Double> getMetricScaledScoresMap();

    /**
     * Returns the value of the '<em><b>Partial Solution</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Partial Solution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Partial Solution</em>' attribute.
     * @see #setPartialSolution(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_PartialSolution()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isPartialSolution();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.MappingResult#isPartialSolution <em>Partial Solution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Partial Solution</em>' attribute.
     * @see #isPartialSolution()
     * @generated
     */
    void setPartialSolution(boolean value);

    /**
     * Returns the value of the '<em><b>Absolute Total Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Absolute Total Score</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Absolute Total Score</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_AbsoluteTotalScore()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    double getAbsoluteTotalScore();

    /**
     * Returns the value of the '<em><b>Scaled Total Score</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scaled Total Score</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scaled Total Score</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getMappingResult_ScaledTotalScore()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    double getScaledTotalScore();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" coreUnique="false"
     * @generated
     */
    EList<Task> getMappedTasksForCore(Core core);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" coreUnique="false"
     * @generated
     */
    int getAbsoluteCoreUtilization(Core core);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" coreUnique="false"
     * @generated
     */
    double getRelativeCoreUtilization(Core core);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  Return the hardware element of the level level that the task task is being mapped to
     * <!-- end-model-doc -->
     * @model unique="false" taskUnique="false" levelUnique="false"
     * @generated
     */
    HardwareElement getHardwareElementForTask(Task task, int level);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This creates the list of mapping elements; each elements contains all hardware / software elements
     * <!-- end-model-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<SingleMappingElement> getMappingElements();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" oUnique="false"
     * @generated
     */
    int compareTo(MappingResult o);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false"
     * @generated
     */
    String toString();

} // MappingResult
