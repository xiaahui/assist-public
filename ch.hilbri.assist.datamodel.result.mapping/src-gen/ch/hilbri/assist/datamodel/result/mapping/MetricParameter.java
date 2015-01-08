/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.MetricParameter#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.MetricParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getMetricParameter()
 * @model
 * @generated
 */
public interface MetricParameter extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getMetricParameter_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.MetricParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getMetricParameter_Value()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.MetricParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // MetricParameter
