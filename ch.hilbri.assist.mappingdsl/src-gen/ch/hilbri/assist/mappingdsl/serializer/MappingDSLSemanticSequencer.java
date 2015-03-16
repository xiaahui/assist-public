package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DeploymentImplicitDefinition;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithImplicitDefinition;
import ch.hilbri.assist.datamodel.model.ImplicitEqInterfaceGroupDefinition;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.InvalidDeploymentImplicit;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;
import ch.hilbri.assist.datamodel.model.ValidDeployment;
import ch.hilbri.assist.datamodel.model.ValidDeploymentImplicit;
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
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ModelPackage.ASSIST_MODEL:
				if(context == grammarAccess.getAssistModelRule()) {
					sequence_AssistModel(context, (AssistModel) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.AVAILABLE_EQ_INTERFACE:
				if(context == grammarAccess.getAvailableEqInterfaceRule()) {
					sequence_AvailableEqInterface(context, (AvailableEqInterface) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.COLOCALITY_RELATION:
				if(context == grammarAccess.getColocalityRelationRule()) {
					sequence_ColocalityRelation(context, (ColocalityRelation) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.COMPARTMENT:
				if(context == grammarAccess.getCompartmentRule()) {
					sequence_Compartment(context, (Compartment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.CONNECTOR:
				if(context == grammarAccess.getConnectorRule()) {
					sequence_Connector(context, (Connector) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DEPLOYMENT_IMPLICIT_DEFINITION:
				if(context == grammarAccess.getDeploymentImplicitDefinitionRule()) {
					sequence_DeploymentImplicitDefinition(context, (DeploymentImplicitDefinition) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISLOCALITY_RELATION:
				if(context == grammarAccess.getDislocalityRelationRule()) {
					sequence_DislocalityRelation(context, (DislocalityRelation) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.EQ_INTERFACE:
				if(context == grammarAccess.getEqInterfaceRule()) {
					sequence_EqInterface(context, (EqInterface) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.EQ_INTERFACE_GROUP:
				if(context == grammarAccess.getEqInterfaceGroupRule()) {
					sequence_EqInterfaceGroup(context, (EqInterfaceGroup) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_COMBINED_DEFINITION:
				if(context == grammarAccess.getEqInterfaceGroupWithCombinedDefinitionRule()) {
					sequence_EqInterfaceGroupWithCombinedDefinition(context, (EqInterfaceGroupWithCombinedDefinition) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.EQ_INTERFACE_GROUP_WITH_IMPLICIT_DEFINITION:
				if(context == grammarAccess.getEqInterfaceGroupWithImplicitDefinitionRule()) {
					sequence_EqInterfaceGroupWithImplicitDefinition(context, (EqInterfaceGroupWithImplicitDefinition) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IMPLICIT_EQ_INTERFACE_GROUP_DEFINITION:
				if(context == grammarAccess.getImplicitEqInterfaceGroupDefinitionRule()) {
					sequence_ImplicitEqInterfaceGroupDefinition(context, (ImplicitEqInterfaceGroupDefinition) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.INVALID_DEPLOYMENT:
				if(context == grammarAccess.getInvalidDeploymentRule()) {
					sequence_InvalidDeployment(context, (InvalidDeployment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.INVALID_DEPLOYMENT_IMPLICIT:
				if(context == grammarAccess.getInvalidDeploymentImplicitRule()) {
					sequence_InvalidDeploymentImplicit(context, (InvalidDeploymentImplicit) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.METRIC_PARAMETER:
				if(context == grammarAccess.getMetricParameterRule()) {
					sequence_MetricParameter(context, (MetricParameter) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.RDC:
				if(context == grammarAccess.getRDCRule()) {
					sequence_RDC(context, (RDC) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.VALID_DEPLOYMENT:
				if(context == grammarAccess.getValidDeploymentRule()) {
					sequence_ValidDeployment(context, (ValidDeployment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.VALID_DEPLOYMENT_IMPLICIT:
				if(context == grammarAccess.getValidDeploymentImplicitRule()) {
					sequence_ValidDeploymentImplicit(context, (ValidDeploymentImplicit) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         systemName=STRING 
	 *         compartments+=Compartment+ 
	 *         eqInterfaces+=EqInterface* 
	 *         (
	 *             eqInterfaceGroups+=EqInterfaceGroup | 
	 *             eqInterfaceGroups+=EqInterfaceGroupWithImplicitDefinition | 
	 *             eqInterfaceGroups+=EqInterfaceGroupWithCombinedDefinition
	 *         )* 
	 *         (
	 *             dislocalityRelations+=DislocalityRelation | 
	 *             colocalityRelations+=ColocalityRelation | 
	 *             validDeployments+=ValidDeployment | 
	 *             validDeployments+=ValidDeploymentImplicit | 
	 *             invalidDeployments+=InvalidDeployment | 
	 *             invalidDeployments+=InvalidDeploymentImplicit
	 *         )*
	 *     )
	 */
	protected void sequence_AssistModel(EObject context, AssistModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eqInterfaceType=STRING count=INT)
	 */
	protected void sequence_AvailableEqInterface(EObject context, AvailableEqInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.AVAILABLE_EQ_INTERFACE__EQ_INTERFACE_TYPE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.AVAILABLE_EQ_INTERFACE__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.AVAILABLE_EQ_INTERFACE__COUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeSTRINGTerminalRuleCall_0_0(), semanticObject.getEqInterfaceType());
		feeder.accept(grammarAccess.getAvailableEqInterfaceAccess().getCountINTTerminalRuleCall_2_0(), semanticObject.getCount());
		feeder.finish();
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
	 *     (name=ID availableEqInterfaces+=AvailableEqInterface*)
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=DeploymentImplicitDefinitionAttribute value=STRING)
	 */
	protected void sequence_DeploymentImplicitDefinition(EObject context, DeploymentImplicitDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.DEPLOYMENT_IMPLICIT_DEFINITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeploymentImplicitDefinitionAccess().getAttributeDeploymentImplicitDefinitionAttributeEnumRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getDeploymentImplicitDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
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
	 *     (name=ID definitions+=ImplicitEqInterfaceGroupDefinition definitions+=ImplicitEqInterfaceGroupDefinition*)
	 */
	protected void sequence_EqInterfaceGroupWithImplicitDefinition(EObject context, EqInterfaceGroupWithImplicitDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID eqInterfaces+=[EqInterface|ID] eqInterfaces+=[EqInterface|ID]*)
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
	 *     )
	 */
	protected void sequence_EqInterface(EObject context, EqInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attribute=ImplicitEqInterfaceGroupDefinitionAttribute value=STRING)
	 */
	protected void sequence_ImplicitEqInterfaceGroupDefinition(EObject context, ImplicitEqInterfaceGroupDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_GROUP_DEFINITION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_GROUP_DEFINITION__ATTRIBUTE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_GROUP_DEFINITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICIT_EQ_INTERFACE_GROUP_DEFINITION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicitEqInterfaceGroupDefinitionAccess().getAttributeImplicitEqInterfaceGroupDefinitionAttributeEnumRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getImplicitEqInterfaceGroupDefinitionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] 
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* 
	 *         definitions+=DeploymentImplicitDefinition 
	 *         definitions+=DeploymentImplicitDefinition*
	 *     )
	 */
	protected void sequence_InvalidDeploymentImplicit(EObject context, InvalidDeploymentImplicit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] 
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* 
	 *         hardwareElements+=[HardwareElement|QualifiedName] 
	 *         hardwareElements+=[HardwareElement|QualifiedName]*
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
	 *     (
	 *         name=ID 
	 *         manufacturer=STRING? 
	 *         powerSupply=STRING? 
	 *         rdcType=STRING? 
	 *         ess=STRING? 
	 *         connectors+=Connector+
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
	 *         definitions+=DeploymentImplicitDefinition 
	 *         definitions+=DeploymentImplicitDefinition*
	 *     )
	 */
	protected void sequence_ValidDeploymentImplicit(EObject context, ValidDeploymentImplicit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID] 
	 *         eqInterfaceOrGroups+=[EqInterfaceOrGroup|ID]* 
	 *         hardwareElements+=[HardwareElement|QualifiedName] 
	 *         hardwareElements+=[HardwareElement|QualifiedName]*
	 *     )
	 */
	protected void sequence_ValidDeployment(EObject context, ValidDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
