/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implicit Eq Interface Member Definition Attributes And Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getImplicitEqInterfaceMemberDefinitionAttributesAndValues()
 * @model
 * @generated
 */
public interface ImplicitEqInterfaceMemberDefinitionAttributesAndValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute
	 * @see #setAttribute(ImplicitEqInterfaceMemberDefinitionAttribute)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Attribute()
	 * @model unique="false"
	 * @generated
	 */
	ImplicitEqInterfaceMemberDefinitionAttribute getAttribute();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttribute
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(ImplicitEqInterfaceMemberDefinitionAttribute value);

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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getImplicitEqInterfaceMemberDefinitionAttributesAndValues_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ImplicitEqInterfaceMemberDefinitionAttributesAndValues
