/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Task#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getFeatureRequirements <em>Feature Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getAssignedCore <em>Assigned Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends SoftwareElement {
    /**
     * Returns the value of the '<em><b>Application</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link ch.hilbri.assist.model.Application#getTasks <em>Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Application</em>' container reference.
     * @see #setApplication(Application)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Application()
     * @see ch.hilbri.assist.model.Application#getTasks
     * @model opposite="tasks" transient="false"
     * @generated
     */
    Application getApplication();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getApplication <em>Application</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Application</em>' container reference.
     * @see #getApplication()
     * @generated
     */
    void setApplication(Application value);

    /**
     * Returns the value of the '<em><b>Feature Requirements</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.FeatureRequirement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Requirements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Requirements</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getTask_FeatureRequirements()
     * @model containment="true"
     * @generated
     */
    EList<FeatureRequirement> getFeatureRequirements();

    /**
     * Returns the value of the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.HardwareElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restrict Mapping To Hardware Elements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restrict Mapping To Hardware Elements</em>' reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getTask_RestrictMappingToHardwareElements()
     * @model
     * @generated
     */
    EList<HardwareElement> getRestrictMappingToHardwareElements();

    /**
     * Returns the value of the '<em><b>Assigned Core</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assigned Core</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assigned Core</em>' reference.
     * @see #setAssignedCore(Core)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_AssignedCore()
     * @model
     * @generated
     */
    Core getAssignedCore();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getAssignedCore <em>Assigned Core</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assigned Core</em>' reference.
     * @see #getAssignedCore()
     * @generated
     */
    void setAssignedCore(Core value);

    /**
     * Returns the value of the '<em><b>Full Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Name</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getTask_FullName()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    String getFullName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getCoreUtilization();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setCoreUtilization(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getRamUtilization();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setRamUtilization(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getRomUtilization();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setRomUtilization(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getDuration();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setDuration(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getPeriod();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setPeriod(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getEarlyTolerance();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setEarlyTolerance(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getLateTolerance();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setLateTolerance(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getMaxStartTime();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setMaxStartTime(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getMaxEndTime();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setMaxEndTime(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getAddInitTime();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setAddInitTime(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getSlices();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setSlices(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    int getMinSliceDuration();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setMinSliceDuration(int newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    PeriodicityType getPeriodicity();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setPeriodicity(PeriodicityType newValue);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" unique="false"
     * @generated
     */
    Color getColor();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model newValueUnique="false"
     * @generated
     */
    void setColor(Color newValue);

} // Task
