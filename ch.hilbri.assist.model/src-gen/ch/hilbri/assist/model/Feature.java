/**
 */
package ch.hilbri.assist.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.model.Feature#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Feature#getUnits <em>Units</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Feature#isIsSynchronizedAccess <em>Is Synchronized Access</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Feature#isIsShared <em>Is Shared</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Feature#isIsExclusive <em>Is Exclusive</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.model.ModelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
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
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_Name()
     * @model default="" unique="false"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Feature#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Units</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see #setUnits(int)
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_Units()
     * @model default="0" unique="false"
     * @generated
     */
    int getUnits();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Feature#getUnits <em>Units</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Units</em>' attribute.
     * @see #getUnits()
     * @generated
     */
    void setUnits(int value);

    /**
     * Returns the value of the '<em><b>Is Synchronized Access</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Synchronized Access</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Synchronized Access</em>' attribute.
     * @see #setIsSynchronizedAccess(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_IsSynchronizedAccess()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isIsSynchronizedAccess();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Feature#isIsSynchronizedAccess <em>Is Synchronized Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Synchronized Access</em>' attribute.
     * @see #isIsSynchronizedAccess()
     * @generated
     */
    void setIsSynchronizedAccess(boolean value);

    /**
     * Returns the value of the '<em><b>Is Shared</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Shared</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Shared</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_IsShared()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='int _units = this.getUnits();\nreturn (_units == 0);'"
     * @generated
     */
    boolean isIsShared();

    /**
     * Returns the value of the '<em><b>Is Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exclusive</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Exclusive</em>' attribute.
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_IsExclusive()
     * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _isIsShared = this.isIsShared();\nreturn (!_isIsShared);'"
     * @generated
     */
    boolean isIsExclusive();

} // Feature
