/**
 */
package ch.hilbri.assist.mapping.model.result;

import ch.hilbri.assist.mapping.model.DesignAssuranceLevelType;
import ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getCoreUtilization <em>Core Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getRamUtilization <em>Ram Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getRomUtilization <em>Rom Utilization</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getCriticalityLevel <em>Criticality Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getIoAdapterProtectionLevel <em>Io Adapter Protection Level</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getParallelThreads <em>Parallel Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getDevelopedBy <em>Developed By</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getIoAdapterRequirements <em>Io Adapter Requirements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getRestrictMappingToHardwareElements <em>Restrict Mapping To Hardware Elements</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getThreads <em>Threads</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.result.Application#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Core Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Utilization</em>' attribute.
	 * @see #setCoreUtilization(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_CoreUtilization()
	 * @model unique="false"
	 * @generated
	 */
	int getCoreUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getCoreUtilization <em>Core Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Utilization</em>' attribute.
	 * @see #getCoreUtilization()
	 * @generated
	 */
	void setCoreUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Ram Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram Utilization</em>' attribute.
	 * @see #setRamUtilization(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_RamUtilization()
	 * @model unique="false"
	 * @generated
	 */
	int getRamUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getRamUtilization <em>Ram Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Utilization</em>' attribute.
	 * @see #getRamUtilization()
	 * @generated
	 */
	void setRamUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Rom Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rom Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rom Utilization</em>' attribute.
	 * @see #setRomUtilization(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_RomUtilization()
	 * @model unique="false"
	 * @generated
	 */
	int getRomUtilization();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getRomUtilization <em>Rom Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rom Utilization</em>' attribute.
	 * @see #getRomUtilization()
	 * @generated
	 */
	void setRomUtilization(int value);

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
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_CriticalityLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	DesignAssuranceLevelType getCriticalityLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getCriticalityLevel <em>Criticality Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.DesignAssuranceLevelType
	 * @see #getCriticalityLevel()
	 * @generated
	 */
	void setCriticalityLevel(DesignAssuranceLevelType value);

	/**
	 * Returns the value of the '<em><b>Io Adapter Protection Level</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapter Protection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapter Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType
	 * @see #setIoAdapterProtectionLevel(IOAdapterProtectionLevelType)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_IoAdapterProtectionLevel()
	 * @model default="None" unique="false"
	 * @generated
	 */
	IOAdapterProtectionLevelType getIoAdapterProtectionLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getIoAdapterProtectionLevel <em>Io Adapter Protection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Adapter Protection Level</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.IOAdapterProtectionLevelType
	 * @see #getIoAdapterProtectionLevel()
	 * @generated
	 */
	void setIoAdapterProtectionLevel(IOAdapterProtectionLevelType value);

	/**
	 * Returns the value of the '<em><b>Parallel Threads</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Threads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Threads</em>' attribute.
	 * @see #setParallelThreads(int)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_ParallelThreads()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getParallelThreads();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getParallelThreads <em>Parallel Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Threads</em>' attribute.
	 * @see #getParallelThreads()
	 * @generated
	 */
	void setParallelThreads(int value);

	/**
	 * Returns the value of the '<em><b>Developed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developed By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed By</em>' attribute.
	 * @see #setDevelopedBy(String)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_DevelopedBy()
	 * @model unique="false"
	 * @generated
	 */
	String getDevelopedBy();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getDevelopedBy <em>Developed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developed By</em>' attribute.
	 * @see #getDevelopedBy()
	 * @generated
	 */
	void setDevelopedBy(String value);

	/**
	 * Returns the value of the '<em><b>Io Adapter Requirements</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.result.IOAdapterRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Adapter Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Adapter Requirements</em>' reference list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_IoAdapterRequirements()
	 * @model
	 * @generated
	 */
	EList<IOAdapterRequirement> getIoAdapterRequirements();

	/**
	 * Returns the value of the '<em><b>Restrict Mapping To Hardware Elements</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.result.HardwareElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrict Mapping To Hardware Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrict Mapping To Hardware Elements</em>' reference list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_RestrictMappingToHardwareElements()
	 * @model
	 * @generated
	 */
	EList<HardwareElement> getRestrictMappingToHardwareElements();

	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.result.Thread}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.result.Thread#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_Threads()
	 * @see ch.hilbri.assist.mapping.model.result.Thread#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<ch.hilbri.assist.mapping.model.result.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.mapping.model.Application)
	 * @see ch.hilbri.assist.mapping.model.result.ResultPackage#getApplication_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.mapping.model.Application getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.result.Application#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.mapping.model.Application value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value for the given parameter name - or -1 if this parameter was not found
	 * <!-- end-model-doc -->
	 * @model unique="false" parameterNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.mapping.model.Application%> _referenceObject = this.getReferenceObject();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.mapping.model.MetricParameter%>> _metricParameters = _referenceObject.getMetricParameters();\nfor (final <%ch.hilbri.assist.mapping.model.MetricParameter%> parameter : _metricParameters)\n{\n\t<%java.lang.String%> _name = parameter.getName();\n\tboolean _equals = _name.equals(parameterName);\n\tif (_equals)\n\t{\n\t\treturn parameter.getValue();\n\t}\n}\nreturn (-1);'"
	 * @generated
	 */
	int getMetricParameterValue(String parameterName);

} // Application
