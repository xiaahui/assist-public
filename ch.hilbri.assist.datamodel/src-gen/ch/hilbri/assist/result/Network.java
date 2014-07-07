/**
 * Copyright 2014 - Robert Hilbrich
 */
package ch.hilbri.assist.result;

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
 *   <li>{@link ch.hilbri.assist.result.Network#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Network#isIsBoardLocalNetwork <em>Is Board Local Network</em>}</li>
 *   <li>{@link ch.hilbri.assist.result.Network#getBoards <em>Boards</em>}</li>
 * </ul>
 * </p>
 *
 * @see ch.hilbri.assist.result.ResultPackage#getNetwork()
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
	 * @see ch.hilbri.assist.result.ResultPackage#getNetwork_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Network#getName <em>Name</em>}' attribute.
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
	 * @see ch.hilbri.assist.result.ResultPackage#getNetwork_BandwidthCapacity()
	 * @model unique="false"
	 * @generated
	 */
	int getBandwidthCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.result.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #getBandwidthCapacity()
	 * @generated
	 */
	void setBandwidthCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Is Board Local Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Board Local Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Board Local Network</em>' attribute.
	 * @see ch.hilbri.assist.result.ResultPackage#getNetwork_IsBoardLocalNetwork()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.result.Board%>> _boards = this.getBoards();\nint _size = _boards.size();\nreturn (_size <= 1);'"
	 * @generated
	 */
	boolean isIsBoardLocalNetwork();

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.result.Board}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.result.Board#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' reference list.
	 * @see ch.hilbri.assist.result.ResultPackage#getNetwork_Boards()
	 * @see ch.hilbri.assist.result.Board#getNetworks
	 * @model opposite="networks" lower="2"
	 * @generated
	 */
	EList<Board> getBoards();

} // Network
