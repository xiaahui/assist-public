/**
 */
package ch.hilbri.assist.dse.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getDislocalityRelations <em>Dislocality Relations</em>}</li>
 *   <li>{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getColocalityRelations <em>Colocality Relations</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.dse.model.ModelPackage#getRestrictionAlternative()
 * @model
 * @generated
 */
public interface RestrictionAlternative extends EObject {
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
	 * @see ch.hilbri.assist.dse.model.ModelPackage#getRestrictionAlternative_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.dse.model.RestrictionAlternative#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dislocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dislocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dislocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.dse.model.ModelPackage#getRestrictionAlternative_DislocalityRelations()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" containment="true"
	 * @generated
	 */
	EList<Object> getDislocalityRelations();

	/**
	 * Returns the value of the '<em><b>Colocality Relations</b></em>' containment reference list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colocality Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colocality Relations</em>' containment reference list.
	 * @see ch.hilbri.assist.dse.model.ModelPackage#getRestrictionAlternative_ColocalityRelations()
	 * @model type="org.eclipse.emf.ecore.EJavaObject" containment="true"
	 * @generated
	 */
	EList<Object> getColocalityRelations();

} // RestrictionAlternative
