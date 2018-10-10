/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assist Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength <em>Min Hyp Period Length</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getTaskSwitchDelay <em>Task Switch Delay</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getApplications <em>Applications</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getColocalityRelations <em>Colocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getDissimilarityRelations <em>Dissimilarity Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getSchedulingRestrictions <em>Scheduling Restrictions</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getApplicationAlternatives <em>Application Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getRestrictionAlternatives <em>Restriction Alternatives</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.AssistModel#getExplorationCandidates <em>Exploration Candidates</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getAssistModel()
 * @model
 * @generated
 */
public interface AssistModel extends EObject {
    /**
     * Returns the value of the '<em><b>System Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System Name</em>' attribute.
     * @see #setSystemName(String)
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_SystemName()
     * @model default="" unique="false"
     * @generated
     */
    String getSystemName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getSystemName <em>System Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System Name</em>' attribute.
     * @see #getSystemName()
     * @generated
     */
    void setSystemName(String value);

    /**
     * Returns the value of the '<em><b>Min Hyp Period Length</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Hyp Period Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Hyp Period Length</em>' attribute.
     * @see #setMinHypPeriodLength(int)
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_MinHypPeriodLength()
     * @model default="-1" unique="false"
     * @generated
     */
    int getMinHypPeriodLength();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getMinHypPeriodLength <em>Min Hyp Period Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Hyp Period Length</em>' attribute.
     * @see #getMinHypPeriodLength()
     * @generated
     */
    void setMinHypPeriodLength(int value);

    /**
     * Returns the value of the '<em><b>Task Switch Delay</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Task Switch Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Task Switch Delay</em>' attribute.
     * @see #setTaskSwitchDelay(int)
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_TaskSwitchDelay()
     * @model default="0" unique="false"
     * @generated
     */
    int getTaskSwitchDelay();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.AssistModel#getTaskSwitchDelay <em>Task Switch Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Task Switch Delay</em>' attribute.
     * @see #getTaskSwitchDelay()
     * @generated
     */
    void setTaskSwitchDelay(int value);

    /**
     * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Compartment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Compartments</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Compartments()
     * @model containment="true"
     * @generated
     */
    EList<Compartment> getCompartments();

    /**
     * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Application}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applications</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_Applications()
     * @model containment="true"
     * @generated
     */
    EList<Application> getApplications();

    /**
     * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.DislocalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DislocalityRelations()
     * @model containment="true"
     * @generated
     */
    EList<DislocalityRelation> getDislocalityRelations();

    /**
     * Returns the value of the '<em><b>Colocality Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.ColocalityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Colocality Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Colocality Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ColocalityRelations()
     * @model containment="true"
     * @generated
     */
    EList<ColocalityRelation> getColocalityRelations();

    /**
     * Returns the value of the '<em><b>Dissimilarity Relations</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.DissimilarityRelation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dissimilarity Relations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dissimilarity Relations</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_DissimilarityRelations()
     * @model containment="true"
     * @generated
     */
    EList<DissimilarityRelation> getDissimilarityRelations();

    /**
     * Returns the value of the '<em><b>Scheduling Restrictions</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.SchedulingRestriction}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduling Restrictions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduling Restrictions</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_SchedulingRestrictions()
     * @model containment="true"
     * @generated
     */
    EList<SchedulingRestriction> getSchedulingRestrictions();

    /**
     * Returns the value of the '<em><b>Application Alternatives</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.ApplicationAlternatives}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Alternatives</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application Alternatives</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ApplicationAlternatives()
     * @model containment="true"
     * @generated
     */
    EList<ApplicationAlternatives> getApplicationAlternatives();

    /**
     * Returns the value of the '<em><b>Restriction Alternatives</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.RestrictionAlternatives}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restriction Alternatives</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restriction Alternatives</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_RestrictionAlternatives()
     * @model containment="true"
     * @generated
     */
    EList<RestrictionAlternatives> getRestrictionAlternatives();

    /**
     * Returns the value of the '<em><b>Exploration Candidates</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.ExplorationCandidate}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exploration Candidates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exploration Candidates</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getAssistModel_ExplorationCandidates()
     * @model containment="true"
     * @generated
     */
    EList<ExplorationCandidate> getExplorationCandidates();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Compartment> getAllCompartments();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Box> getAllBoxes();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Board> getAllBoards();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Processor> getAllProcessors();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Core> getAllCores();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<Task> getAllTasks();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model unique="false" levelUnique="false"
     * @generated
     */
    EList<HardwareElement> getAllHardwareElements(int level);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    EList<HardwareElement> getAllHardwareElements();

} // AssistModel
