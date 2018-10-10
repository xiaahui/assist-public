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
 *   <li>{@link ch.hilbri.assist.model.Task#getDuration <em>Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getEarlyTolerance <em>Early Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getLateTolerance <em>Late Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getMaxStartTime <em>Max Start Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getMaxEndTime <em>Max End Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getAddInitTime <em>Add Init Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getSlices <em>Slices</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getMinSliceDuration <em>Min Slice Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Task#getColor <em>Color</em>}</li>
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
     * Returns the value of the '<em><b>Duration</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duration</em>' attribute.
     * @see #setDuration(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Duration()
     * @model default="-1" unique="false"
     * @generated
     */
    int getDuration();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getDuration <em>Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duration</em>' attribute.
     * @see #getDuration()
     * @generated
     */
    void setDuration(int value);

    /**
     * Returns the value of the '<em><b>Period</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Period</em>' attribute.
     * @see #setPeriod(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Period()
     * @model default="-1" unique="false"
     * @generated
     */
    int getPeriod();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getPeriod <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Period</em>' attribute.
     * @see #getPeriod()
     * @generated
     */
    void setPeriod(int value);

    /**
     * Returns the value of the '<em><b>Early Tolerance</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Early Tolerance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Early Tolerance</em>' attribute.
     * @see #setEarlyTolerance(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_EarlyTolerance()
     * @model default="-1" unique="false"
     * @generated
     */
    int getEarlyTolerance();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getEarlyTolerance <em>Early Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Early Tolerance</em>' attribute.
     * @see #getEarlyTolerance()
     * @generated
     */
    void setEarlyTolerance(int value);

    /**
     * Returns the value of the '<em><b>Late Tolerance</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Late Tolerance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Late Tolerance</em>' attribute.
     * @see #setLateTolerance(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_LateTolerance()
     * @model default="-1" unique="false"
     * @generated
     */
    int getLateTolerance();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getLateTolerance <em>Late Tolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Late Tolerance</em>' attribute.
     * @see #getLateTolerance()
     * @generated
     */
    void setLateTolerance(int value);

    /**
     * Returns the value of the '<em><b>Max Start Time</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Start Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Start Time</em>' attribute.
     * @see #setMaxStartTime(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_MaxStartTime()
     * @model default="-1" unique="false"
     * @generated
     */
    int getMaxStartTime();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getMaxStartTime <em>Max Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Start Time</em>' attribute.
     * @see #getMaxStartTime()
     * @generated
     */
    void setMaxStartTime(int value);

    /**
     * Returns the value of the '<em><b>Max End Time</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max End Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max End Time</em>' attribute.
     * @see #setMaxEndTime(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_MaxEndTime()
     * @model default="-1" unique="false"
     * @generated
     */
    int getMaxEndTime();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getMaxEndTime <em>Max End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max End Time</em>' attribute.
     * @see #getMaxEndTime()
     * @generated
     */
    void setMaxEndTime(int value);

    /**
     * Returns the value of the '<em><b>Add Init Time</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Add Init Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Add Init Time</em>' attribute.
     * @see #setAddInitTime(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_AddInitTime()
     * @model default="-1" unique="false"
     * @generated
     */
    int getAddInitTime();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getAddInitTime <em>Add Init Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Add Init Time</em>' attribute.
     * @see #getAddInitTime()
     * @generated
     */
    void setAddInitTime(int value);

    /**
     * Returns the value of the '<em><b>Slices</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slices</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slices</em>' attribute.
     * @see #setSlices(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Slices()
     * @model default="-1" unique="false"
     * @generated
     */
    int getSlices();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getSlices <em>Slices</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slices</em>' attribute.
     * @see #getSlices()
     * @generated
     */
    void setSlices(int value);

    /**
     * Returns the value of the '<em><b>Min Slice Duration</b></em>' attribute.
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Slice Duration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Slice Duration</em>' attribute.
     * @see #setMinSliceDuration(int)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_MinSliceDuration()
     * @model default="-1" unique="false"
     * @generated
     */
    int getMinSliceDuration();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getMinSliceDuration <em>Min Slice Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Slice Duration</em>' attribute.
     * @see #getMinSliceDuration()
     * @generated
     */
    void setMinSliceDuration(int value);

    /**
     * Returns the value of the '<em><b>Periodicity</b></em>' attribute.
     * The default value is <code>"strict"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.PeriodicityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Periodicity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Periodicity</em>' attribute.
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see #setPeriodicity(PeriodicityType)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Periodicity()
     * @model default="strict" unique="false"
     * @generated
     */
    PeriodicityType getPeriodicity();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getPeriodicity <em>Periodicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Periodicity</em>' attribute.
     * @see ch.hilbri.assist.model.PeriodicityType
     * @see #getPeriodicity()
     * @generated
     */
    void setPeriodicity(PeriodicityType value);

    /**
     * Returns the value of the '<em><b>Color</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.Color}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Color</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Color</em>' attribute.
     * @see ch.hilbri.assist.model.Color
     * @see #setColor(Color)
     * @see ch.hilbri.assist.model.ModelPackage#getTask_Color()
     * @model default="none" unique="false"
     * @generated
     */
    Color getColor();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Task#getColor <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Color</em>' attribute.
     * @see ch.hilbri.assist.model.Color
     * @see #getColor()
     * @generated
     */
    void setColor(Color value);

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

} // Task
