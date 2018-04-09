/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  **********************************************
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.CustomProperty#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.CustomProperty#getStringValue <em>String Value</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.CustomProperty#getIntValue <em>Int Value</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getCustomProperty()
 * @model
 * @generated
 */
public interface CustomProperty extends EObject {
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
     * @see ch.hilbri.assist.model.ModelPackage#getCustomProperty_Name()
     * @model default="" unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.CustomProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>String Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>String Value</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getCustomProperty_StringValue()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if ((this instanceof &lt;%ch.hilbri.assist.model.CustomStringProperty%&gt;))\n{\n\treturn ((&lt;%ch.hilbri.assist.model.CustomStringProperty%&gt;) this).getValue();\n}\nelse\n{\n\tif ((this instanceof &lt;%ch.hilbri.assist.model.CustomIntProperty%&gt;))\n\t{\n\t\treturn &lt;%java.lang.Integer%&gt;.valueOf(((&lt;%ch.hilbri.assist.model.CustomIntProperty%&gt;) this).getValue()).toString();\n\t}\n\telse\n\t{\n\t\treturn null;\n\t}\n}'"
     * @generated
     */
    String getStringValue();

    /**
     * Returns the value of the '<em><b>Int Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Int Value</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getCustomProperty_IntValue()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='if ((this instanceof &lt;%ch.hilbri.assist.model.CustomIntProperty%&gt;))\n{\n\treturn &lt;%java.lang.Integer%&gt;.valueOf(((&lt;%ch.hilbri.assist.model.CustomIntProperty%&gt;) this).getValue());\n}\nelse\n{\n\treturn null;\n}'"
     * @generated
     */
    Integer getIntValue();

} // CustomProperty
