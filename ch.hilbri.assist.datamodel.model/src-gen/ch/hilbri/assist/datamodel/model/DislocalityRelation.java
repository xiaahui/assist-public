/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dislocality Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getApplicationsOrGroups <em>Applications Or Groups</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDislocalityRelation()
 * @model
 * @generated
 */
public interface DislocalityRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications Or Groups</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications Or Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications Or Groups</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDislocalityRelation_ApplicationsOrGroups()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationOrApplicationGroup> getApplicationsOrGroups();

	/**
	 * Returns the value of the '<em><b>Hardware Level</b></em>' attribute.
	 * The literals are from the enumeration {@link ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see #setHardwareLevel(HardwareArchitectureLevelType)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getDislocalityRelation_HardwareLevel()
	 * @model unique="false"
	 * @generated
	 */
	HardwareArchitectureLevelType getHardwareLevel();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.DislocalityRelation#getHardwareLevel <em>Hardware Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Level</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
	 * @see #getHardwareLevel()
	 * @generated
	 */
	void setHardwareLevel(HardwareArchitectureLevelType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int ctr = 0;\n<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%>> _applicationsOrGroups = this.getApplicationsOrGroups();\nfor (final <%ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup%> aog : _applicationsOrGroups)\n{\n\t{\n\t\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.Application%>))\n\t\t{\n\t\t\tctr++;\n\t\t}\n\t\tif ((aog instanceof <%ch.hilbri.assist.datamodel.model.ApplicationGroup%>))\n\t\t{\n\t\t\tint _ctr = ctr;\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Application%>> _allApplications = ((<%ch.hilbri.assist.datamodel.model.ApplicationGroup%>)aog).getAllApplications();\n\t\t\tint _size = _allApplications.size();\n\t\t\tctr = (_ctr + _size);\n\t\t}\n\t}\n}\nreturn ctr;'"
	 * @generated
	 */
	int getApplicationCount();

} // DislocalityRelation
