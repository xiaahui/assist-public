package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.AvailableEqInterface;
import ch.hilbri.assist.datamodel.model.ColocalityRelation;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.DislocalityRelation;
import ch.hilbri.assist.datamodel.model.EqInterface;
import ch.hilbri.assist.datamodel.model.EqInterfaceGroup;
import ch.hilbri.assist.datamodel.model.InvalidDeployment;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;
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
			case ModelPackage.INVALID_DEPLOYMENT:
				if(context == grammarAccess.getInvalidDeploymentRule()) {
					sequence_InvalidDeployment(context, (InvalidDeployment) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         systemName=STRING 
	 *         compartments+=Compartment+ 
	 *         eqInterfaces+=EqInterface* 
	 *         eqInterfaceGroups+=EqInterfaceGroup* 
	 *         (
	 *             dislocalityRelations+=DislocalityRelation | 
	 *             colocalityRelations+=ColocalityRelation | 
	 *             validDeployments+=ValidDeployment | 
	 *             invalidDeployments+=InvalidDeployment
	 *         )*
	 *     )
	 */
	protected void sequence_AssistModel(EObject context, AssistModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eqInterfaceType=EqInterfaceType count=INT)
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
		feeder.accept(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeEqInterfaceTypeEnumRuleCall_0_0(), semanticObject.getEqInterfaceType());
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
	 *     (
	 *         (eqInterfaceGroup=[EqInterfaceGroup|ID] | (eqInterfaces+=[EqInterface|ID] eqInterfaces+=[EqInterface|ID]+)) 
	 *         hardwareLevel=HardwareArchitectureLevelType
	 *     )
	 */
	protected void sequence_DislocalityRelation(EObject context, DislocalityRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID eqInterfaces+=[EqInterface|ID] eqInterfaces+=[EqInterface|ID]+)
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
	 *         ioType=EqInterfaceType?
	 *     )
	 */
	protected void sequence_EqInterface(EObject context, EqInterface semanticObject) {
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
	 *         hardwareElements+=[HardwareElement|QualifiedName] 
	 *         hardwareElements+=[HardwareElement|QualifiedName]*
	 *     )
	 */
	protected void sequence_ValidDeployment(EObject context, ValidDeployment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
