/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable Weight Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#isDefaultEntry <em>Default Entry</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightEntry()
 * @model
 * @generated
 */
public interface CableWeightEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Entry</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Entry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Entry</em>' attribute.
	 * @see #setDefaultEntry(boolean)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightEntry_DefaultEntry()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDefaultEntry();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#isDefaultEntry <em>Default Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Entry</em>' attribute.
	 * @see #isDefaultEntry()
	 * @generated
	 */
	void setDefaultEntry(boolean value);

	/**
	 * Returns the value of the '<em><b>Eq Interface Io Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq Interface Io Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq Interface Io Type</em>' attribute.
	 * @see #setEqInterfaceIoType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightEntry_EqInterfaceIoType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEqInterfaceIoType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getEqInterfaceIoType <em>Eq Interface Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq Interface Io Type</em>' attribute.
	 * @see #getEqInterfaceIoType()
	 * @generated
	 */
	void setEqInterfaceIoType(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getCableWeightEntry_Weight()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.CableWeightEntry#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

} // CableWeightEntry
