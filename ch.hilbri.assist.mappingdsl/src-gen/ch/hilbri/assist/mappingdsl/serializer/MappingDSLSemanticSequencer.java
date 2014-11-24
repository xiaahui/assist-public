package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.datamodel.model.Application;
import ch.hilbri.assist.datamodel.model.ApplicationGroup;
import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.Board;
import ch.hilbri.assist.datamodel.model.Box;
import ch.hilbri.assist.datamodel.model.CommunicationRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Core;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.DissimilarityConjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityDisjunction;
import ch.hilbri.assist.datamodel.model.DissimilarityEntry;
import ch.hilbri.assist.datamodel.model.DissimilarityRelation;
import ch.hilbri.assist.datamodel.model.IOAdapter;
import ch.hilbri.assist.datamodel.model.IOAdapterRequirement;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.Network;
import ch.hilbri.assist.datamodel.model.Processor;
import ch.hilbri.assist.datamodel.model.ProximityRelation;
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
			case ModelPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule()) {
					sequence_Application(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.APPLICATION_GROUP:
				if(context == grammarAccess.getApplicationGroupRule()) {
					sequence_ApplicationGroup(context, (ApplicationGroup) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.ASSIST_MODEL:
				if(context == grammarAccess.getAssistModelRule()) {
					sequence_AssistModel(context, (AssistModel) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.BOARD:
				if(context == grammarAccess.getBoardRule() ||
				   context == grammarAccess.getHardwareElementContainerRule()) {
					sequence_Board(context, (Board) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.BOX:
				if(context == grammarAccess.getBoxRule() ||
				   context == grammarAccess.getHardwareElementContainerRule()) {
					sequence_Box(context, (Box) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.COMMUNICATION_RELATION:
				if(context == grammarAccess.getCommunicationRelationRule()) {
					sequence_CommunicationRelation(context, (CommunicationRelation) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.COMPARTMENT:
				if(context == grammarAccess.getCompartmentRule() ||
				   context == grammarAccess.getHardwareElementContainerRule()) {
					sequence_Compartment(context, (Compartment) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.CORE:
				if(context == grammarAccess.getCoreRule()) {
					sequence_Core(context, (Core) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISLOCALITY_RELATION:
				if(context == grammarAccess.getDislocalityRelationRule()) {
					sequence_DislocalityRelation(context, (DislocalityRelation) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISSIMILARITY_CONJUNCTION:
				if(context == grammarAccess.getDissimilarityClauseRule() ||
				   context == grammarAccess.getDissimilarityConjunctionRule()) {
					sequence_DissimilarityConjunction(context, (DissimilarityConjunction) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISSIMILARITY_DISJUNCTION:
				if(context == grammarAccess.getDissimilarityClauseRule() ||
				   context == grammarAccess.getDissimilarityDisjunctionRule()) {
					sequence_DissimilarityDisjunction(context, (DissimilarityDisjunction) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISSIMILARITY_ENTRY:
				if(context == grammarAccess.getDissimilarityClauseRule() ||
				   context == grammarAccess.getDissimilarityEntryRule()) {
					sequence_DissimilarityEntry(context, (DissimilarityEntry) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.DISSIMILARITY_RELATION:
				if(context == grammarAccess.getDissimilarityRelationRule()) {
					sequence_DissimilarityRelation(context, (DissimilarityRelation) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IO_ADAPTER:
				if(context == grammarAccess.getIOAdapterRule()) {
					sequence_IOAdapter(context, (IOAdapter) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.IO_ADAPTER_REQUIREMENT:
				if(context == grammarAccess.getIOAdapterRequirementRule()) {
					sequence_IOAdapterRequirement(context, (IOAdapterRequirement) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.METRIC_PARAMETER:
				if(context == grammarAccess.getMetricParameterRule()) {
					sequence_MetricParameter(context, (MetricParameter) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.NETWORK:
				if(context == grammarAccess.getNetworkRule()) {
					sequence_Network(context, (Network) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.PROCESSOR:
				if(context == grammarAccess.getProcessorRule()) {
					sequence_Processor(context, (Processor) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.PROXIMITY_RELATION:
				if(context == grammarAccess.getProximityRelationRule()) {
					sequence_ProximityRelation(context, (ProximityRelation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID applicationsOrGroups+=[ApplicationOrApplicationGroup|ID] applicationsOrGroups+=[ApplicationOrApplicationGroup|ID]+)
	 */
	protected void sequence_ApplicationGroup(EObject context, ApplicationGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         coreUtilization=INT? 
	 *         ramUtilization=INT? 
	 *         romUtilization=INT? 
	 *         criticalityLevel=DesignAssuranceLevelType? 
	 *         ioAdapterProtectionLevel=IOAdapterProtectionLevelType? 
	 *         parallelThreads=INT? 
	 *         developedBy=STRING? 
	 *         ioAdapterRequirements+=IOAdapterRequirement* 
	 *         (restrictMappingToHardwareElements+=[HardwareElement|QualifiedName] restrictMappingToHardwareElements+=[HardwareElement|QualifiedName]*)? 
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Application(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         systemName=STRING 
	 *         hardwareContainer+=HardwareElementContainer+ 
	 *         networks+=Network* 
	 *         applications+=Application+ 
	 *         applicationGroups+=ApplicationGroup* 
	 *         (dissimilarityRelations+=DissimilarityRelation* dislocalityRelations+=DislocalityRelation* proximityRelations+=ProximityRelation*)? 
	 *         communicationRelations+=CommunicationRelation*
	 *     )
	 */
	protected void sequence_AssistModel(EObject context, AssistModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         manufacturer=STRING? 
	 *         boardType=STRING? 
	 *         powerSupply=STRING? 
	 *         assuranceLevel=DesignAssuranceLevelType? 
	 *         processors+=Processor+ 
	 *         ramCapacity=INT? 
	 *         romCapacity=INT? 
	 *         ioAdapters+=IOAdapter* 
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Board(EObject context, Board semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID manufacturer=STRING? boards+=Board+ metricParameters+=MetricParameter*)
	 */
	protected void sequence_Box(EObject context, Box semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (applicationsOrGroups+=[ApplicationOrApplicationGroup|ID] applicationsOrGroups+=[ApplicationOrApplicationGroup|ID]* bandwidthUtilization=INT)
	 */
	protected void sequence_CommunicationRelation(EObject context, CommunicationRelation semanticObject) {
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
	 *         boxes+=Box+ 
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Compartment(EObject context, Compartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID capacity=INT architecture=STRING? metricParameters+=MetricParameter*)
	 */
	protected void sequence_Core(EObject context, Core semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID] 
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID]* 
	 *         hardwareLevel=HardwareArchitectureLevelType
	 *     )
	 */
	protected void sequence_DislocalityRelation(EObject context, DislocalityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dissimilarityClauses+=DissimilarityClause dissimilarityClauses+=DissimilarityClause+)
	 */
	protected void sequence_DissimilarityConjunction(EObject context, DissimilarityConjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dissimilarityClauses+=DissimilarityClause dissimilarityClauses+=DissimilarityClause+)
	 */
	protected void sequence_DissimilarityDisjunction(EObject context, DissimilarityDisjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (compartmentAttribute=CompartmentAttributes | boxAttribute=BoxAttributes | boardAttribute=BoardAttributes | processorAttribute=ProcessorAttributes)
	 */
	protected void sequence_DissimilarityEntry(EObject context, DissimilarityEntry semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID] 
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID]+ 
	 *         dissimilarityClause=DissimilarityClause
	 *     )
	 */
	protected void sequence_DissimilarityRelation(EObject context, DissimilarityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (requiredAdapterCount=INT adapterType=IOAdapterType (isExclusiveOnly?='exclusive' | isSharedAllowed?='shared'))
	 */
	protected void sequence_IOAdapterRequirement(EObject context, IOAdapterRequirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adapterType=IOAdapterType totalCount=INT protectionLevel=IOAdapterProtectionLevelType?)
	 */
	protected void sequence_IOAdapter(EObject context, IOAdapter semanticObject) {
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
	 *         bandwidthCapacity=INT 
	 *         boards+=[Board|QualifiedName] 
	 *         boards+=[Board|QualifiedName] 
	 *         boards+=[Board|QualifiedName]* 
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Network(EObject context, Network semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID manufacturer=STRING? processorType=STRING? cores+=Core+ metricParameters+=MetricParameter*)
	 */
	protected void sequence_Processor(EObject context, Processor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID] 
	 *         applicationsOrGroups+=[ApplicationOrApplicationGroup|ID]* 
	 *         hardwareLevel=HardwareArchitectureLevelType
	 *     )
	 */
	protected void sequence_ProximityRelation(EObject context, ProximityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
