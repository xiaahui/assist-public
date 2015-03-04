package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.datamodel.model.AssistModel;
import ch.hilbri.assist.datamodel.model.AvailableInterface;
import ch.hilbri.assist.datamodel.model.Compartment;
import ch.hilbri.assist.datamodel.model.Connector;
import ch.hilbri.assist.datamodel.model.Interface;
import ch.hilbri.assist.datamodel.model.InterfaceGroup;
import ch.hilbri.assist.datamodel.model.MetricParameter;
import ch.hilbri.assist.datamodel.model.ModelPackage;
import ch.hilbri.assist.datamodel.model.RDC;
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
			case ModelPackage.AVAILABLE_INTERFACE:
				if(context == grammarAccess.getAvailableInterfaceRule()) {
					sequence_AvailableInterface(context, (AvailableInterface) semanticObject); 
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
			case ModelPackage.INTERFACE:
				if(context == grammarAccess.getInterfaceRule()) {
					sequence_Interface(context, (Interface) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.INTERFACE_GROUP:
				if(context == grammarAccess.getInterfaceGroupRule()) {
					sequence_InterfaceGroup(context, (InterfaceGroup) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (systemName=STRING compartments+=Compartment+ interfaces+=Interface+ interfaceGroups+=InterfaceGroup)
	 */
	protected void sequence_AssistModel(EObject context, AssistModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INT interfaceType=InterfaceType)
	 */
	protected void sequence_AvailableInterface(EObject context, AvailableInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.AVAILABLE_INTERFACE__INTERFACE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.AVAILABLE_INTERFACE__INTERFACE_TYPE));
			if(transientValues.isValueTransient(semanticObject, ModelPackage.Literals.AVAILABLE_INTERFACE__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.AVAILABLE_INTERFACE__COUNT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAvailableInterfaceAccess().getCountINTTerminalRuleCall_0_0(), semanticObject.getCount());
		feeder.accept(grammarAccess.getAvailableInterfaceAccess().getInterfaceTypeInterfaceTypeEnumRuleCall_2_0(), semanticObject.getInterfaceType());
		feeder.finish();
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
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Compartment(EObject context, Compartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID availableInterfaces+=AvailableInterface*)
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interfaces+=[Interface|ID] interfaces+=[Interface|ID]+)
	 */
	protected void sequence_InterfaceGroup(EObject context, InterfaceGroup semanticObject) {
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
	 *         ioType=InterfaceType? 
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
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
	 *         metricParameters+=MetricParameter*
	 *     )
	 */
	protected void sequence_RDC(EObject context, RDC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
