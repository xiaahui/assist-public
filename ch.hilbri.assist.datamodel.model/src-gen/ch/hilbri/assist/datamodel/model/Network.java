/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Network#getName <em>Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Network#getBoards <em>Boards</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Network#getMetricParameters <em>Metric Parameters</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.Network#isIsBoardLocal <em>Is Board Local</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
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
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bandwidth Capacity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #setBandwidthCapacity(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork_BandwidthCapacity()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getBandwidthCapacity();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.Network#getBandwidthCapacity <em>Bandwidth Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth Capacity</em>' attribute.
	 * @see #getBandwidthCapacity()
	 * @generated
	 */
	void setBandwidthCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Boards</b></em>' reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Board}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boards</em>' reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork_Boards()
	 * @model required="true"
	 * @generated
	 */
	EList<Board> getBoards();

	/**
	 * Returns the value of the '<em><b>Metric Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.MetricParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Parameters</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork_MetricParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetricParameter> getMetricParameters();

	/**
	 * Returns the value of the '<em><b>Is Board Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Board Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Board Local</em>' attribute.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getNetwork_IsBoardLocal()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='<%org.eclipse.emf.common.util.EList%><<%ch.hilbri.assist.datamodel.model.Board%>> _boards = this.getBoards();\nint _size = _boards.size();\nboolean _equals = (_size == 1);\nif (_equals)\n{\n\treturn true;\n}\nelse\n{\n\treturn false;\n}'"
	 * @generated
	 */
	boolean isIsBoardLocal();

} // Network
