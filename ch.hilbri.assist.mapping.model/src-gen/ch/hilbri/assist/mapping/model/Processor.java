/**
 */
package ch.hilbri.assist.mapping.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.mapping.model.Processor#getProcessorType <em>Processor Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Processor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Processor#getBoard <em>Board</em>}</li>
 *   <li>{@link ch.hilbri.assist.mapping.model.Processor#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.mapping.model.ModelPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Processor Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Type</em>' attribute.
	 * @see #setProcessorType(String)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getProcessor_ProcessorType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getProcessorType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Processor#getProcessorType <em>Processor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Type</em>' attribute.
	 * @see #getProcessorType()
	 * @generated
	 */
	void setProcessorType(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getProcessor_FullName()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='&lt;%java.lang.String%&gt; _fullName = this.getBoard().getFullName();\n&lt;%java.lang.String%&gt; _plus = (_fullName + \".\");\n&lt;%java.lang.String%&gt; _name = this.getName();\nreturn (_plus + _name);'"
	 * @generated
	 */
	String getFullName();

	/**
	 * Returns the value of the '<em><b>Board</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Board#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' container reference.
	 * @see #setBoard(Board)
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getProcessor_Board()
	 * @see ch.hilbri.assist.mapping.model.Board#getProcessors
	 * @model opposite="processors" transient="false"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.mapping.model.Processor#getBoard <em>Board</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' container reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.mapping.model.Core}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.mapping.model.Core#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference list.
	 * @see ch.hilbri.assist.mapping.model.ModelPackage#getProcessor_Cores()
	 * @see ch.hilbri.assist.mapping.model.Core#getProcessor
	 * @model opposite="processor" containment="true" required="true"
	 * @generated
	 */
	EList<Core> getCores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getCores();'"
	 * @generated
	 */
	EList<Core> getAllCores();

} // Processor
