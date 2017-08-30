/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.Application#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Application#getDevelopedBy <em>Developed By</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Application#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Application#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends ApplicationOrApplicationGroup {
	/**
	 * Returns the value of the '<em><b>Criticality Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.DesignAssuranceLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see #setCriticalityLevel(DesignAssuranceLevelType)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication_CriticalityLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	DesignAssuranceLevelType getCriticalityLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Application#getCriticalityLevel <em>Criticality Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see #getCriticalityLevel()
	 * @generated
	 */
	void setCriticalityLevel(DesignAssuranceLevelType value);

	/**
	 * Returns the value of the '<em><b>Developed By</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed By</em>' attribute.
	 * @see #setDevelopedBy(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication_DevelopedBy()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getDevelopedBy();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Application#getDevelopedBy <em>Developed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed By</em>' attribute.
	 * @see #getDevelopedBy()
	 * @generated
	 */
	void setDevelopedBy(String value);

	/**
	 * Returns the value of the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrict Mapping To Hardware Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrict Mapping To Hardware Elements</em>' reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication_RestrictMappingToHardwareElements()
	 * @model
	 * @generated
	 */
	EList<HardwareElement> getRestrictMappingToHardwareElements();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getApplication_MetricParameters()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getTasks();'"
	 * @generated
	 */
	EList<Task> getAllTasks();

} // Application
