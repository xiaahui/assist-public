/**
 */
package ch.hilbri.assist.scheduling.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Core#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Core#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Core#getProcessor <em>Processor</em>}</li>
 *   <li>{@link ch.hilbri.assist.scheduling.model.Core#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getCore_Architecture()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Core#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getCore_Capacity()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Core#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.scheduling.model.Processor#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' container reference.
	 * @see #setProcessor(Processor)
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getCore_Processor()
	 * @see ch.hilbri.assist.scheduling.model.Processor#getCores
	 * @model opposite="cores" transient="false"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.scheduling.model.Core#getProcessor <em>Processor</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' container reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see ch.hilbri.assist.scheduling.model.ModelPackage#getCore_FullName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _name = this.getProcessor().getBoard().getBox().getCompartment().getName();\n&lt;%java.lang.String%&gt; _plus = (_name + \".\");\n&lt;%java.lang.String%&gt; _name_1 = this.getProcessor().getBoard().getBox().getName();\n&lt;%java.lang.String%&gt; _plus_1 = (_plus + _name_1);\n&lt;%java.lang.String%&gt; _plus_2 = (_plus_1 + \".\");\n&lt;%java.lang.String%&gt; _name_2 = this.getProcessor().getBoard().getName();\n&lt;%java.lang.String%&gt; _plus_3 = (_plus_2 + _name_2);\n&lt;%java.lang.String%&gt; _plus_4 = (_plus_3 + \".\");\n&lt;%java.lang.String%&gt; _name_3 = this.getProcessor().getName();\n&lt;%java.lang.String%&gt; _plus_5 = (_plus_4 + _name_3);\n&lt;%java.lang.String%&gt; _plus_6 = (_plus_5 + \".\");\n&lt;%java.lang.String%&gt; _name_4 = this.getName();\nreturn (_plus_6 + _name_4);'"
	 * @generated
	 */
	String getFullName();

} // Core
