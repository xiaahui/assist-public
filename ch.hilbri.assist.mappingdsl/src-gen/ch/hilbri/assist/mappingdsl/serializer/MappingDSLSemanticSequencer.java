/*
 * generated by Xtext
 */
package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.CableWeightDataBlock;
import ch.hilbri.assist.datamodel.model.CableWeightEntry;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypeEntry;
import ch.hilbri.assist.datamodel.model.CompatibleIoTypesBlock;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinitionAttributeAndValue;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition;
import ch.hilbri.assist.datamodel.model.GlobalBlock;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinition;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceMemberDefinitionAttributesAndValues;
import ch.hilbri.assist.datamodel.model.InternallyConnectedPinEntry;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.ProtectionLevelDataBlock;
import ch.hilbri.assist.datamodel.model.ProtectionLevelEntry;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.model.ValidDeployment;
import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MappingDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MappingDSLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ASSIST_MODEL:
				sequence_AssistModel(context, (AssistModel) semanticObject); 
				return; 
			case ModelPackage.AVAILABLE_EQ_INTERFACE:
				sequence_AvailableEqInterface(context, (AvailableEqInterface) semanticObject); 
				return; 
			case ModelPackage.CABLE_WEIGHT_DATA_BLOCK:
				sequence_CableWeightDataBlock(context, (CableWeightDataBlock) semanticObject); 
				return; 
			case ModelPackage.CABLE_WEIGHT_ENTRY:
				sequence_CableWeightEntry(context, (CableWeightEntry) semanticObject); 
				return; 
			case ModelPackage.COLOCALITY_RELATION:
				sequence_ColocalityRelation(context, (ColocalityRelation) semanticObject); 
				return; 
			case ModelPackage.COMPARTMENT:
				sequence_Compartment(context, (Compartment) semanticObject); 
				return; 
			case ModelPackage.COMPATIBLE_IO_TYPE_ENTRY:
				sequence_CompatibleIoTypeEntry(context, (CompatibleIoTypeEntry) semanticObject); 
				return; 
			case ModelPackage.COMPATIBLE_IO_TYPES_BLOCK:
				sequence_CompatibleIoTypesBlock(context, (CompatibleIoTypesBlock) semanticObject); 
				return; 
			case ModelPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION:
				sequence_DeploymentImplicitDefinition(context, (DeploymentImplicitDefinition) semanticObject); 
				return; 
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE:
				sequence_DeploymentImplicitDefinitionAttributeAndValue(context, (DeploymentImplicitDefinitionAttributeAndValue) semanticObject); 
				return; 
			case ModelPackage.DISLOCALITY_RELATION:
				sequence_DislocalityRelation(context, (DislocalityRelation) semanticObject); 
				return; 
			case ModelPackage.EQ_INTERFACE:
				sequence_EqInterface(context, (EqInterface) semanticObject); 
				return; 
			case ModelPackage.EQ_INTERFACE_GROUP:
				sequence_EqInterfaceGroup(context, (EqInterfaceGroup) semanticObject); 
				return; 
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION:
				sequence_EqInterfaceGroupWithCombinedDefinition(context, (EqInterfaceGroupWithCombinedDefinition) semanticObject); 
				return; 
			case ModelPackage.GLOBAL_BLOCK:
				sequence_GlobalBlock(context, (GlobalBlock) semanticObject); 
				return; 
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION:
				sequence_ImplicitEqInterfaceMemberDefinition(context, (ImplicitEqInterfaceMemberDefinition) semanticObject); 
				return; 
			case ModelPackage.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES:
				sequence_ImplicitEqInterfaceMemberDefinitionAttributesAndValues(context, (ImplicitEqInterfaceMemberDefinitionAttributesAndValues) semanticObject); 
				return; 
			case ModelPackage.INTERNALLY_CONNECTED_PIN_ENTRY:
				sequence_InternallyConnectedPinEntry(context, (InternallyConnectedPinEntry) semanticObject); 
				return; 
			case ModelPackage.INVALID_DEPLOYMENT:
				sequence_InvalidDeployment(context, (InvalidDeployment) semanticObject); 
				return; 
			case ModelPackage.METRIC_PARAMETER:
				sequence_MetricParameter(context, (MetricParameter) semanticObject); 
				return; 
			case ModelPackage.PROTECTION_LEVEL_DATA_BLOCK:
				sequence_ProtectionLevelDataBlock(context, (ProtectionLevelDataBlock) semanticObject); 
				return; 
			case ModelPackage.PROTECTION_LEVEL_ENTRY:
				sequence_ProtectionLevelEntry(context, (ProtectionLevelEntry) semanticObject); 
				return; 
			case ModelPackage.RDC:
				sequence_RDC(context, (RDC) semanticObject); 
				return; 
			case ModelPackage.VALID_DEPLOYMENT:
				sequence_ValidDeployment(context, (ValidDeployment) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     globalBlock=GlobalBlock
	 */
	protected void sequence_AssistModel(EObject context, AssistModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? eqInterfaceType=STRING count=INT protectionLevel=ProtectionLevelType?)
	 */
	protected void sequence_AvailableEqInterface(EObject context, AvailableEqInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cableWeightEntries+=CableWeightEntry+
	 */
	protected void sequence_CableWeightDataBlock(EObject context, CableWeightDataBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((eqInterfaceIoType=STRING | defaultEntry?='default') weight=Double)
	 */
	protected void sequence_CableWeightEntry(EObject context, CableWeightEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* hardwareLevel=HardwareArchitectureLevelType)
	 */
	protected void sequence_ColocalityRelation(EObject context, ColocalityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         manufacturer=STRING? 
	 *         powerSupply=STRING? 
	 *         side=STRING? 
	 *         zone=STRING? 
	 *         rdcs+=RDC+
	 *     )
	 */
	protected void sequence_Compartment(EObject context, Compartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eqInterfaceIoType=STRING pinInterfaceIoTypes+=STRING pinInterfaceIoTypes+=STRING*)
	 */
	protected void sequence_CompatibleIoTypeEntry(EObject context, CompatibleIoTypeEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     compatibleIoTypes+=CompatibleIoTypeEntry+
	 */
	protected void sequence_CompatibleIoTypesBlock(EObject context, CompatibleIoTypesBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID availableEqInterfaces+=AvailableEqInterface*)
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=DeploymentImplicitDefinitionAttribute value=STRING)
	 */
	protected void sequence_DeploymentImplicitDefinitionAttributeAndValue(EObject context, DeploymentImplicitDefinitionAttributeAndValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION_ATTRIBUTE_AND_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=DeploymentImplicitDefinitionAttributeAndValue entries+=DeploymentImplicitDefinitionAttributeAndValue*)
	 */
	protected void sequence_DeploymentImplicitDefinition(EObject context, DeploymentImplicitDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* hardwareLevel=HardwareArchitectureLevelType)
	 */
	protected void sequence_DislocalityRelation(EObject context, DislocalityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID combinedGroups+=[EqInterfaceGroup|ID] combinedGroups+=[EqInterfaceGroup|ID]*)
	 */
	protected void sequence_EqInterfaceGroupWithCombinedDefinition(EObject context, EqInterfaceGroupWithCombinedDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (eqInterfaces+=[EqInterface|ID] | implicitMemberDefinitions+=ImplicitEqInterfaceMemberDefinition) 
	 *         (eqInterfaces+=[EqInterface|ID] | implicitMemberDefinitions+=ImplicitEqInterfaceMemberDefinition)* 
	 *         (
	 *             (withoutEqInterfaces+=[EqInterface|ID] | withoutImplicitMemberDefinitions+=ImplicitEqInterfaceMemberDefinition) 
	 *             (withoutEqInterfaces+=[EqInterface|ID] | withoutImplicitMemberDefinitions+=ImplicitEqInterfaceMemberDefinition)*
	 *         )?
	 *     )
	 */
	protected void sequence_EqInterfaceGroup(EObject context, EqInterfaceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         system=STRING? 
	 *         subAta=STRING? 
	 *         resource=STRING? 
	 *         lineName=STRING? 
	 *         wiringLane=STRING? 
	 *         grpInfo=STRING? 
	 *         route=STRING? 
	 *         pwSup1=STRING? 
	 *         emhZone1=STRING? 
	 *         ioType=STRING? 
	 *         resourceX=SIGNEDINT? 
	 *         resourceY=SIGNEDINT? 
	 *         resourceZ=SIGNEDINT?
	 *     )
	 */
	protected void sequence_EqInterface(EObject context, EqInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         systemName=STRING? 
	 *         compatibleIoTypesBlock=CompatibleIoTypesBlock? 
	 *         cableWeightDataBlock=CableWeightDataBlock? 
	 *         protectionLevelDataBlock=ProtectionLevelDataBlock?
	 *     )
	 */
	protected void sequence_GlobalBlock(EObject context, GlobalBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=ImplicitEqInterfaceMemberDefinitionAttribute value=STRING)
	 */
	protected void sequence_ImplicitEqInterfaceMemberDefinitionAttributesAndValues(EObject context, ImplicitEqInterfaceMemberDefinitionAttributesAndValues semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_MEMBER_DEFINITION_ATTRIBUTES_AND_VALUES__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeImplicitEqInterfaceMemberDefinitionAttributeEnumRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entries+=ImplicitEqInterfaceMemberDefinitionAttributesAndValues entries+=ImplicitEqInterfaceMemberDefinitionAttributesAndValues*)
	 */
	protected void sequence_ImplicitEqInterfaceMemberDefinition(EObject context, ImplicitEqInterfaceMemberDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pins+=[AvailableEqInterface|QualifiedName] pins+=[AvailableEqInterface|QualifiedName] pins+=[AvailableEqInterface|QualifiedName]?)
	 */
	protected void sequence_InternallyConnectedPinEntry(EObject context, InternallyConnectedPinEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] 
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* 
	 *         (hardwareElements+=[HardwareElement|QualifiedName] | implicitHardwareElements+=DeploymentImplicitDefinition) 
	 *         (hardwareElements+=[HardwareElement|QualifiedName] | implicitHardwareElements+=DeploymentImplicitDefinition)*
	 *     )
	 */
	protected void sequence_InvalidDeployment(EObject context, InvalidDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=INT)
	 */
	protected void sequence_MetricParameter(EObject context, MetricParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.METRIC_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.METRIC_PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.METRIC_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.METRIC_PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetricParameterAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMetricParameterAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     protectionLevelEntries+=ProtectionLevelEntry+
	 */
	protected void sequence_ProtectionLevelDataBlock(EObject context, ProtectionLevelDataBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rdcLocation=STRING emhZone1=STRING protectionLevel+=ProtectionLevelType protectionLevel+=ProtectionLevelType*)
	 */
	protected void sequence_ProtectionLevelEntry(EObject context, ProtectionLevelEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         manufacturer=STRING? 
	 *         powerSupply=STRING? 
	 *         rdcType=STRING? 
	 *         ess=STRING? 
	 *         location=STRING? 
	 *         resourceX=SIGNEDINT? 
	 *         resourceY=SIGNEDINT? 
	 *         resourceZ=SIGNEDINT? 
	 *         connectors+=Connector+ 
	 *         connectedPins+=InternallyConnectedPinEntry*
	 *     )
	 */
	protected void sequence_RDC(EObject context, RDC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] 
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* 
	 *         (hardwareElements+=[HardwareElement|QualifiedName] | implicitHardwareElements+=DeploymentImplicitDefinition) 
	 *         (hardwareElements+=[HardwareElement|QualifiedName] | implicitHardwareElements+=DeploymentImplicitDefinition)*
	 *     )
	 */
	protected void sequence_ValidDeployment(EObject context, ValidDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
