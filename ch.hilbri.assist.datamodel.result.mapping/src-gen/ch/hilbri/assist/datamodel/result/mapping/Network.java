/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Network#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Network#isIsBoardLocalNetwork <em>Is Board Local Network</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Network#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Network#getReferenceObject <em>Reference Object</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bandwidth Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #setBandwidthCapacity(int)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork_BandwidthCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getBandwidthCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #getBandwidthCapacity()
	 * @generated
	 */
	void setBandwidthCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Is Board Local Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Board Local Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Board Local Network</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork_IsBoardLocalNetwork()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Board%>> _boards = this.getBoards();\nint _size = _boards.size();\nreturn (_size <= 1);'"
	 * @generated
	 */
	boolean isIsBoardLocalNetwork();

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.result.mapping.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Board#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork_Boards()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Board#getNetworks
	 * @model opposite="networks" lower="2"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.datamodel.model.Network)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getNetwork_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.datamodel.model.Network getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Network#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.datamodel.model.Network value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value for the given parameter name - or -1 if this parameter was not found
	 * <!-- end-model-doc -->
	 * @model unique="false" parameterNameUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%ch.hilbri.assist.datamodel.model.Network%> _referenceObject = this.getReferenceObject();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.MetricParameter%>> _metricParameters = _referenceObject.getMetricParameters();\nfor (final <%ch.hilbri.assist.datamodel.model.MetricParameter%> parameter : _metricParameters)\n{\n\t<%java.lang.String%> _name = parameter.getName();\n\tboolean _equals = _name.equals(parameterName);\n\tif (_equals)\n\t{\n\t\treturn parameter.getValue();\n\t}\n}\nreturn (-1);'"
	 * @generated
	 */
	int getMetricParameterValue(String parameterName);

} // Network
