/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply1 <em>Power Supply1</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply2 <em>Power Supply2</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getSide <em>Side</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getRdcType <em>Rdc Type</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getEss <em>Ess</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getLocation <em>Location</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceX <em>Resource X</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceY <em>Resource Y</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getResourceZ <em>Resource Z</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link ch.hilbri.assist.datamodel.model.RDC#getConnectedPins <em>Connected Pins</em>}</li>
 * </ul>
 *
 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC()
 * @model
 * @generated
 */
public interface RDC extends HardwareElement {
	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Manufacturer()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Power Supply1</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply1</em>' attribute.
	 * @see #setPowerSupply1(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_PowerSupply1()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply1();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply1 <em>Power Supply1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply1</em>' attribute.
	 * @see #getPowerSupply1()
	 * @generated
	 */
	void setPowerSupply1(String value);

	/**
	 * Returns the value of the '<em><b>Power Supply2</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Supply2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Supply2</em>' attribute.
	 * @see #setPowerSupply2(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_PowerSupply2()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPowerSupply2();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getPowerSupply2 <em>Power Supply2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Supply2</em>' attribute.
	 * @see #getPowerSupply2()
	 * @generated
	 */
	void setPowerSupply2(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Side()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Rdc Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rdc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdc Type</em>' attribute.
	 * @see #setRdcType(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_RdcType()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getRdcType();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getRdcType <em>Rdc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdc Type</em>' attribute.
	 * @see #getRdcType()
	 * @generated
	 */
	void setRdcType(String value);

	/**
	 * Returns the value of the '<em><b>Ess</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ess</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ess</em>' attribute.
	 * @see #setEss(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Ess()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getEss();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getEss <em>Ess</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ess</em>' attribute.
	 * @see #getEss()
	 * @generated
	 */
	void setEss(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Location()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Resource X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource X</em>' attribute.
	 * @see #setResourceX(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceX()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceX();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceX <em>Resource X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource X</em>' attribute.
	 * @see #getResourceX()
	 * @generated
	 */
	void setResourceX(int value);

	/**
	 * Returns the value of the '<em><b>Resource Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Y</em>' attribute.
	 * @see #setResourceY(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceY()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceY();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceY <em>Resource Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Y</em>' attribute.
	 * @see #getResourceY()
	 * @generated
	 */
	void setResourceY(int value);

	/**
	 * Returns the value of the '<em><b>Resource Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Z</em>' attribute.
	 * @see #setResourceZ(int)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ResourceZ()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getResourceZ();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getResourceZ <em>Resource Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Z</em>' attribute.
	 * @see #getResourceZ()
	 * @generated
	 */
	void setResourceZ(int value);

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Compartment#getRdcs <em>Rdcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' container reference.
	 * @see #setCompartment(Compartment)
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Compartment()
	 * @see ch.hilbri.assist.datamodel.model.Compartment#getRdcs
	 * @model opposite="rdcs" transient="false"
	 * @generated
	 */
	Compartment getCompartment();

	/**
	 * Sets the value of the '{@link ch.hilbri.assist.datamodel.model.RDC#getCompartment <em>Compartment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment</em>' container reference.
	 * @see #getCompartment()
	 * @generated
	 */
	void setCompartment(Compartment value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.Connector}.
	 * It is bidirectional and its opposite is '{@link ch.hilbri.assist.datamodel.model.Connector#getRdc <em>Rdc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_Connectors()
	 * @see ch.hilbri.assist.datamodel.model.Connector#getRdc
	 * @model opposite="rdc" containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Connected Pins</b></em>' containment reference list.
	 * The list contents are of type {@link ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected Pins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Pins</em>' containment reference list.
	 * @see ch.hilbri.assist.datamodel.model.ModelPackage#getRDC_ConnectedPins()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternallyConnectedPinEntry> getConnectedPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getName();'"
	 * @generated
	 */
	String toString();

} // RDC
