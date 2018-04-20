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
 *   <li>{@link ch.hilbri.assist.model.Feature#isSynchronizedAccess <em>Synchronized Access</em>}</li>
 *   <li>{@link ch.hilbri.assist.model.Feature#isShared <em>Shared</em>}</li>
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
     * The default value is <code>"-1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Units</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Units</em>' attribute.
     * @see #setUnits(int)
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_Units()
     * @model default="-1" unique="false"
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
     * Returns the value of the '<em><b>Synchronized Access</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronized Access</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronized Access</em>' attribute.
     * @see #setSynchronizedAccess(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_SynchronizedAccess()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isSynchronizedAccess();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Feature#isSynchronizedAccess <em>Synchronized Access</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronized Access</em>' attribute.
     * @see #isSynchronizedAccess()
     * @generated
     */
    void setSynchronizedAccess(boolean value);

    /**
     * Returns the value of the '<em><b>Shared</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shared</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shared</em>' attribute.
     * @see #setShared(boolean)
     * @see ch.hilbri.assist.model.ModelPackage#getFeature_Shared()
     * @model default="false" unique="false"
     * @generated
     */
    boolean isShared();

    /**
     * Sets the value of the '{@link ch.hilbri.assist.model.Feature#isShared <em>Shared</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shared</em>' attribute.
     * @see #isShared()
     * @generated
     */
    void setShared(boolean value);

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
     *        annotation="http://www.eclipse.org/emf/2002/GenModel get='boolean _isShared = this.isShared();\nreturn (!_isShared);'"
     * @generated
     */
    boolean isIsExclusive();

} // Feature
