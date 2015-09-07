/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Implicit Definition Attribute And Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentImplicitDefinitionAttributeAndValue()
 * @model
 * @generated
 */
public interface DeploymentImplicitDefinitionAttributeAndValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute
	 * @see #setAttribute(DeploymentImplicitDefinitionAttribute)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentImplicitDefinitionAttributeAndValue_Attribute()
	 * @model unique="false"
	 * @generated
	 */
	DeploymentImplicitDefinitionAttribute getAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttribute
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(DeploymentImplicitDefinitionAttribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDeploymentImplicitDefinitionAttributeAndValue_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DeploymentImplicitDefinitionAttributeAndValue
