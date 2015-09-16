/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getSystemName <em>System Name</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCompatibleIoTypesBlock <em>Compatible Io Types Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCableWeightDataBlock <em>Cable Weight Data Block</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getProtectionLevelDataBlock <em>Protection Level Data Block</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getGlobalBlock()
 * @model
 * @generated
 */
public interface GlobalBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getGlobalBlock_SystemName()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Compatible Io Types Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatible Io Types Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Io Types Block</em>' containment reference.
	 * @see #setCompatibleIoTypesBlock(CompatibleIoTypesBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getGlobalBlock_CompatibleIoTypesBlock()
	 * @model containment="true"
	 * @generated
	 */
	CompatibleIoTypesBlock getCompatibleIoTypesBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCompatibleIoTypesBlock <em>Compatible Io Types Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatible Io Types Block</em>' containment reference.
	 * @see #getCompatibleIoTypesBlock()
	 * @generated
	 */
	void setCompatibleIoTypesBlock(CompatibleIoTypesBlock value);

	/**
	 * Returns the value of the '<em><b>Cable Weight Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cable Weight Data Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cable Weight Data Block</em>' containment reference.
	 * @see #setCableWeightDataBlock(CableWeightDataBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getGlobalBlock_CableWeightDataBlock()
	 * @model containment="true"
	 * @generated
	 */
	CableWeightDataBlock getCableWeightDataBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getCableWeightDataBlock <em>Cable Weight Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cable Weight Data Block</em>' containment reference.
	 * @see #getCableWeightDataBlock()
	 * @generated
	 */
	void setCableWeightDataBlock(CableWeightDataBlock value);

	/**
	 * Returns the value of the '<em><b>Protection Level Data Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Level Data Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Level Data Block</em>' containment reference.
	 * @see #setProtectionLevelDataBlock(ProtectionLevelDataBlock)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getGlobalBlock_ProtectionLevelDataBlock()
	 * @model containment="true"
	 * @generated
	 */
	ProtectionLevelDataBlock getProtectionLevelDataBlock();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.GlobalBlock#getProtectionLevelDataBlock <em>Protection Level Data Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protection Level Data Block</em>' containment reference.
	 * @see #getProtectionLevelDataBlock()
	 * @generated
	 */
	void setProtectionLevelDataBlock(ProtectionLevelDataBlock value);

} // GlobalBlock
