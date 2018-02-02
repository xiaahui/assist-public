/**
 */
package ch.hilbri.assist.scheduling.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getAssignedCore <em>Assigned Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getDuration <em>Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getEarlyTolerance <em>Early Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getLateTolerance <em>Late Tolerance</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getMaxStartTime <em>Max Start Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getMaxEndTime <em>Max End Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getAddInitTime <em>Add Init Time</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getSlices <em>Slices</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getMinSliceDuration <em>Min Slice Duration</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getPeriodicity <em>Periodicity</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getIoAdapterRequirements <em>Io Adapter Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Task#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ram Utilization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Utilization</em>' attribute.
	 * @see #setRamUtilization(int)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_RamUtilization()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRamUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getRamUtilization <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Utilization</em>' attribute.
	 * @see #getRamUtilization()
	 * @generated
	 */
	void setRamUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Rom Utilization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom Utilization</em>' attribute.
	 * @see #setRomUtilization(int)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_RomUtilization()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getRomUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getRomUtilization <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Utilization</em>' attribute.
	 * @see #getRomUtilization()
	 * @generated
	 */
	void setRomUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.scheduling.model.Application#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Application()
	 * @see ch.hilbri.assist.scheduling.model.Application#getTasks
	 * @model opposite="tasks" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_FullName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _name = this.getApplication().getName();\n&lt;%java.lang.String%&gt; _plus = (_name + \".\");\n&lt;%java.lang.String%&gt; _name_1 = this.getName();\nreturn (_plus + _name_1);'"
	 * @generated
	 */
	String getFullName();

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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_AssignedCore()
	 * @model required="true"
	 * @generated
	 */
	Core getAssignedCore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getAssignedCore <em>Assigned Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Core</em>' reference.
	 * @see #getAssignedCore()
	 * @generated
	 */
	void setAssignedCore(Core value);

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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Duration()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getDuration <em>Duration</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Period()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getPeriod <em>Period</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_EarlyTolerance()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getEarlyTolerance();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getEarlyTolerance <em>Early Tolerance</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_LateTolerance()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getLateTolerance();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getLateTolerance <em>Late Tolerance</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_MaxStartTime()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMaxStartTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getMaxStartTime <em>Max Start Time</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_MaxEndTime()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMaxEndTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getMaxEndTime <em>Max End Time</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_AddInitTime()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getAddInitTime();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getAddInitTime <em>Add Init Time</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Slices()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getSlices();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getSlices <em>Slices</em>}' attribute.
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
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_MinSliceDuration()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getMinSliceDuration();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getMinSliceDuration <em>Min Slice Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Slice Duration</em>' attribute.
	 * @see #getMinSliceDuration()
	 * @generated
	 */
	void setMinSliceDuration(int value);

	/**
	 * Returns the value of the '<em><b>Periodicity</b></em>' attribute.
	 * The default value is <code>"fixed"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.scheduling.model.PeriodicityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicity</em>' attribute.
	 * @see ch.hilbri.assist.scheduling.model.PeriodicityType
	 * @see #setPeriodicity(PeriodicityType)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_Periodicity()
	 * @model default="fixed" unique="false"
	 * @generated
	 */
	PeriodicityType getPeriodicity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Task#getPeriodicity <em>Periodicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity</em>' attribute.
	 * @see ch.hilbri.assist.scheduling.model.PeriodicityType
	 * @see #getPeriodicity()
	 * @generated
	 */
	void setPeriodicity(PeriodicityType value);

	/**
	 * Returns the value of the '<em><b>Io Adapter Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.scheduling.model.IOAdapterRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapter Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapter Requirements</em>' containment reference list.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_IoAdapterRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<IOAdapterRequirement> getIoAdapterRequirements();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.scheduling.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getTask_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

} // Task
