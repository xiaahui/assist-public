/**
 */
package ch.hilbri.assist.datamodel.result.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getApplication <em>Application</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getCore <em>Core</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getReferenceObject <em>Reference Object</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.result.mapping.Application#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getThread_Application()
	 * @see ch.hilbri.assist.datamodel.result.mapping.Application#getThreads
	 * @model opposite="threads" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(Core)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getThread_Core()
	 * @model
	 * @generated
	 */
	Core getCore();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core value);

	/**
	 * Returns the value of the '<em><b>Reference Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Object</em>' reference.
	 * @see #setReferenceObject(ch.hilbri.assist.datamodel.model.Thread)
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getThread_ReferenceObject()
	 * @model
	 * @generated
	 */
	ch.hilbri.assist.datamodel.model.Thread getReferenceObject();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.result.mapping.Thread#getReferenceObject <em>Reference Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Object</em>' reference.
	 * @see #getReferenceObject()
	 * @generated
	 */
	void setReferenceObject(ch.hilbri.assist.datamodel.model.Thread value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.result.mapping.MappingPackage#getThread_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%ch.hilbri.assist.datamodel.result.mapping.Application%> _application = this.getApplication();\n<%java.lang.String%> _name = _application.getName();\n<%java.lang.String%> _plus = (_name + \"_\");\n<%ch.hilbri.assist.datamodel.result.mapping.Application%> _application_1 = this.getApplication();\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.result.mapping.Thread%>> _threads = _application_1.getThreads();\nint _indexOf = _threads.indexOf(this);\nreturn (_plus + <%java.lang.Integer%>.valueOf(_indexOf));'"
	 * @generated
	 */
	String getName();

} // Thread
