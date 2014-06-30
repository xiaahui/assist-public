/**
 */
package ch.hilbri.assist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ch.hilbri.assist.Network#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.Network#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.Network#getMetricParameters <em>Metric Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.AssistPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
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
	 * @see ch.hilbri.assist.AssistPackage#getNetwork_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bandwidth Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #setBandwidthCapacity(int)
	 * @see ch.hilbri.assist.AssistPackage#getNetwork_BandwidthCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getBandwidthCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #getBandwidthCapacity()
	 * @generated
	 */
	void setBandwidthCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.Board}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' reference list.
	 * @see ch.hilbri.assist.AssistPackage#getNetwork_Boards()
	 * @model lower="2"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.AssistPackage#getNetwork_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

} // Network
