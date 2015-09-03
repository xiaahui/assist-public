/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.HardwareElement#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getHardwareElement()
 * @model
 * @generated
 */
public interface HardwareElement extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getHardwareElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.HardwareElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.datamodel.model.HardwareElement)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getHardwareElement_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.datamodel.model.HardwareElement getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.HardwareElement#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.datamodel.model.HardwareElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value for the given parameter name - or -1 if this parameter was not found
	 * <!-- end-model-doc -->
	 * @model unique="false" parameterNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.HardwareElement%> _referenceObject = this.getReferenceObject();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.MetricParameter%>> _metricParameters = _referenceObject.getMetricParameters();\nfor (final <%ch.hilbri.assist.datamodel.model.MetricParameter%> parameter : _metricParameters)\n{\n\t<%java.lang.String%> _name = parameter.getName();\n\tboolean _equals = _name.equals(parameterName);\n\tif (_equals)\n\t{\n\t\treturn parameter.getValue();\n\t}\n}\nreturn (-1);'"
	 * @generated
	 */
	int getMetricParameterValue(String parameterName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

} // HardwareElement
