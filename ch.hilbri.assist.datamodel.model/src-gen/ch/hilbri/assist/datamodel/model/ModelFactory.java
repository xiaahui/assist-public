/**
 */
package ch.hilbri.assist.datamodel.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ch.hilbri.assist.datamodel.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = ch.hilbri.assist.datamodel.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assist Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assist Model</em>'.
	 * @generated
	 */
	AssistModel createAssistModel();

	/**
	 * Returns a new object of class '<em>Global Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Block</em>'.
	 * @generated
	 */
	GlobalBlock createGlobalBlock();

	/**
	 * Returns a new object of class '<em>Compatible Io Types Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compatible Io Types Block</em>'.
	 * @generated
	 */
	CompatibleIoTypesBlock createCompatibleIoTypesBlock();

	/**
	 * Returns a new object of class '<em>Compatible Io Type Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compatible Io Type Entry</em>'.
	 * @generated
	 */
	CompatibleIoTypeEntry createCompatibleIoTypeEntry();

	/**
	 * Returns a new object of class '<em>Cable Weight Data Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Weight Data Block</em>'.
	 * @generated
	 */
	CableWeightDataBlock createCableWeightDataBlock();

	/**
	 * Returns a new object of class '<em>Cable Weight Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cable Weight Entry</em>'.
	 * @generated
	 */
	CableWeightEntry createCableWeightEntry();

	/**
	 * Returns a new object of class '<em>Protection Level Data Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Level Data Block</em>'.
	 * @generated
	 */
	ProtectionLevelDataBlock createProtectionLevelDataBlock();

	/**
	 * Returns a new object of class '<em>Protection Level Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protection Level Entry</em>'.
	 * @generated
	 */
	ProtectionLevelEntry createProtectionLevelEntry();

	/**
	 * Returns a new object of class '<em>Compartments Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartments Block</em>'.
	 * @generated
	 */
	CompartmentsBlock createCompartmentsBlock();

	/**
	 * Returns a new object of class '<em>Hardware Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Element</em>'.
	 * @generated
	 */
	HardwareElement createHardwareElement();

	/**
	 * Returns a new object of class '<em>Metric Parameters Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Parameters Block</em>'.
	 * @generated
	 */
	MetricParametersBlock createMetricParametersBlock();

	/**
	 * Returns a new object of class '<em>Metric Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Parameter</em>'.
	 * @generated
	 */
	MetricParameter createMetricParameter();

	/**
	 * Returns a new object of class '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment</em>'.
	 * @generated
	 */
	Compartment createCompartment();

	/**
	 * Returns a new object of class '<em>RDC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDC</em>'.
	 * @generated
	 */
	RDC createRDC();

	/**
	 * Returns a new object of class '<em>Internal Connected Pin Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Connected Pin Block</em>'.
	 * @generated
	 */
	InternalConnectedPinBlock createInternalConnectedPinBlock();

	/**
	 * Returns a new object of class '<em>Connected Pin Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connected Pin Entry</em>'.
	 * @generated
	 */
	ConnectedPinEntry createConnectedPinEntry();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Interfaces Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interfaces Block</em>'.
	 * @generated
	 */
	InterfacesBlock createInterfacesBlock();

	/**
	 * Returns a new object of class '<em>Eq Interface Or Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Interface Or Group</em>'.
	 * @generated
	 */
	EqInterfaceOrGroup createEqInterfaceOrGroup();

	/**
	 * Returns a new object of class '<em>Eq Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Interface</em>'.
	 * @generated
	 */
	EqInterface createEqInterface();

	/**
	 * Returns a new object of class '<em>Interface Groups Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Groups Block</em>'.
	 * @generated
	 */
	InterfaceGroupsBlock createInterfaceGroupsBlock();

	/**
	 * Returns a new object of class '<em>Eq Interface Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Interface Group</em>'.
	 * @generated
	 */
	EqInterfaceGroup createEqInterfaceGroup();

	/**
	 * Returns a new object of class '<em>Implicit Eq Interface Member Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Eq Interface Member Definition</em>'.
	 * @generated
	 */
	ImplicitEqInterfaceMemberDefinition createImplicitEqInterfaceMemberDefinition();

	/**
	 * Returns a new object of class '<em>Implicit Eq Interface Member Definition Attributes And Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Eq Interface Member Definition Attributes And Values</em>'.
	 * @generated
	 */
	ImplicitEqInterfaceMemberDefinitionAttributesAndValues createImplicitEqInterfaceMemberDefinitionAttributesAndValues();

	/**
	 * Returns a new object of class '<em>Eq Interface Group With Combined Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eq Interface Group With Combined Definition</em>'.
	 * @generated
	 */
	EqInterfaceGroupWithCombinedDefinition createEqInterfaceGroupWithCombinedDefinition();

	/**
	 * Returns a new object of class '<em>Restrictions Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restrictions Block</em>'.
	 * @generated
	 */
	RestrictionsBlock createRestrictionsBlock();

	/**
	 * Returns a new object of class '<em>Dislocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dislocality Relation</em>'.
	 * @generated
	 */
	DislocalityRelation createDislocalityRelation();

	/**
	 * Returns a new object of class '<em>Colocality Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colocality Relation</em>'.
	 * @generated
	 */
	ColocalityRelation createColocalityRelation();

	/**
	 * Returns a new object of class '<em>Deployment Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Specification</em>'.
	 * @generated
	 */
	DeploymentSpecification createDeploymentSpecification();

	/**
	 * Returns a new object of class '<em>Deployment Implicit Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Implicit Definition</em>'.
	 * @generated
	 */
	DeploymentImplicitDefinition createDeploymentImplicitDefinition();

	/**
	 * Returns a new object of class '<em>Deployment Implicit Definition Attribute And Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Implicit Definition Attribute And Value</em>'.
	 * @generated
	 */
	DeploymentImplicitDefinitionAttributeAndValue createDeploymentImplicitDefinitionAttributeAndValue();

	/**
	 * Returns a new object of class '<em>Valid Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Deployment</em>'.
	 * @generated
	 */
	ValidDeployment createValidDeployment();

	/**
	 * Returns a new object of class '<em>Invalid Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invalid Deployment</em>'.
	 * @generated
	 */
	InvalidDeployment createInvalidDeployment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
