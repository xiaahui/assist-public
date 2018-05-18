/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getFeatures <em>Features</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.HardwareElement#getGetHardwareLevel <em>Get Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement()
 * @model
 * @generated
 */
public interface HardwareElement extends EObject {
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
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Name()
     * @model default="" unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.HardwareElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Manufacturer</em>' attribute.
     * @see #setManufacturer(String)
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Manufacturer()
     * @model default="" unique="false"
     * @generated
     */
    String getManufacturer();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.HardwareElement#getManufacturer <em>Manufacturer</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Manufacturer</em>' attribute.
     * @see #getManufacturer()
     * @generated
     */
    void setManufacturer(String value);

    /**
     * Returns the value of the '<em><b>Features</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.Feature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Features</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_Features()
     * @model containment="true"
     * @generated
     */
    EList<Feature> getFeatures();

    /**
     * Returns the value of the '<em><b>Custom Properties</b></em>' containment reference list.
     * The list contents are of type {@link ch.hilbri.assist.model.CustomProperty}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Properties</em>' containment reference list.
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_CustomProperties()
     * @model containment="true"
     * @generated
     */
    EList<CustomProperty> getCustomProperties();

    /**
     * Returns the value of the '<em><b>Get Hardware Level</b></em>' attribute.
     * The literals are from the enumeration {@link ch.hilbri.assist.model.HardwareArchitectureLevelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Get Hardware Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Get Hardware Level</em>' attribute.
     * @see ch.hilbri.assist.model.HardwareArchitectureLevelType
     * @see ch.hilbri.assist.model.ModelPackage#getHardwareElement_GetHardwareLevel()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt; _xifexpression = null;\nif ((this instanceof &lt;%ch.hilbri.assist.model.Compartment%&gt;))\n{\n\t_xifexpression = &lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt;.COMPARTMENT;\n}\nelse\n{\n\t&lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt; _xifexpression_1 = null;\n\tif ((this instanceof &lt;%ch.hilbri.assist.model.Box%&gt;))\n\t{\n\t\t_xifexpression_1 = &lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt;.BOX;\n\t}\n\telse\n\t{\n\t\t&lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt; _xifexpression_2 = null;\n\t\tif ((this instanceof &lt;%ch.hilbri.assist.model.Board%&gt;))\n\t\t{\n\t\t\t_xifexpression_2 = &lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt;.BOARD;\n\t\t}\n\t\telse\n\t\t{\n\t\t\t&lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt; _xifexpression_3 = null;\n\t\t\tif ((this instanceof &lt;%ch.hilbri.assist.model.Processor%&gt;))\n\t\t\t{\n\t\t\t\t_xifexpression_3 = &lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt;.PROCESSOR;\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\t&lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt; _xifexpression_4 = null;\n\t\t\t\tif ((this instanceof &lt;%ch.hilbri.assist.model.Core%&gt;))\n\t\t\t\t{\n\t\t\t\t\t_xifexpression_4 = &lt;%ch.hilbri.assist.model.HardwareArchitectureLevelType%&gt;.CORE;\n\t\t\t\t}\n\t\t\t\t_xifexpression_3 = _xifexpression_4;\n\t\t\t}\n\t\t\t_xifexpression_2 = _xifexpression_3;\n\t\t}\n\t\t_xifexpression_1 = _xifexpression_2;\n\t}\n\t_xifexpression = _xifexpression_1;\n}\nreturn _xifexpression;'"
     * @generated
     */
    HardwareArchitectureLevelType getGetHardwareLevel();

} // HardwareElement
