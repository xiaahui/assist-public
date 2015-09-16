/*
 * generated by Xtext
 */
package ch.hilbri.assist.mappingdsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;

public class MappingDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private MappingDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal.InternalMappingDSLParser createParser() {
		ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal.InternalMappingDSLParser result = new ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal.InternalMappingDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCableWeightEntryAccess().getAlternatives_0(), "rule__CableWeightEntry__Alternatives_0");
					put(grammarAccess.getEqInterfaceGroupAccess().getAlternatives_3(), "rule__EqInterfaceGroup__Alternatives_3");
					put(grammarAccess.getEqInterfaceGroupAccess().getAlternatives_4_1(), "rule__EqInterfaceGroup__Alternatives_4_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getAlternatives_6_2(), "rule__EqInterfaceGroup__Alternatives_6_2");
					put(grammarAccess.getEqInterfaceGroupAccess().getAlternatives_6_3_1(), "rule__EqInterfaceGroup__Alternatives_6_3_1");
					put(grammarAccess.getValidDeploymentAccess().getAlternatives_3(), "rule__ValidDeployment__Alternatives_3");
					put(grammarAccess.getValidDeploymentAccess().getAlternatives_5(), "rule__ValidDeployment__Alternatives_5");
					put(grammarAccess.getValidDeploymentAccess().getAlternatives_6_1(), "rule__ValidDeployment__Alternatives_6_1");
					put(grammarAccess.getInvalidDeploymentAccess().getAlternatives_3(), "rule__InvalidDeployment__Alternatives_3");
					put(grammarAccess.getInvalidDeploymentAccess().getAlternatives_5(), "rule__InvalidDeployment__Alternatives_5");
					put(grammarAccess.getInvalidDeploymentAccess().getAlternatives_6_1(), "rule__InvalidDeployment__Alternatives_6_1");
					put(grammarAccess.getProtectionLevelTypeAccess().getAlternatives(), "rule__ProtectionLevelType__Alternatives");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributeAccess().getAlternatives(), "rule__ImplicitEqInterfaceMemberDefinitionAttribute__Alternatives");
					put(grammarAccess.getHardwareArchitectureLevelTypeAccess().getAlternatives(), "rule__HardwareArchitectureLevelType__Alternatives");
					put(grammarAccess.getDeploymentImplicitDefinitionAttributeAccess().getAlternatives(), "rule__DeploymentImplicitDefinitionAttribute__Alternatives");
					put(grammarAccess.getGlobalBlockAccess().getGroup(), "rule__GlobalBlock__Group__0");
					put(grammarAccess.getGlobalBlockAccess().getGroup_3_0(), "rule__GlobalBlock__Group_3_0__0");
					put(grammarAccess.getCompatibleIoTypesBlockAccess().getGroup(), "rule__CompatibleIoTypesBlock__Group__0");
					put(grammarAccess.getCompatibleIoTypeEntryAccess().getGroup(), "rule__CompatibleIoTypeEntry__Group__0");
					put(grammarAccess.getCompatibleIoTypeEntryAccess().getGroup_3(), "rule__CompatibleIoTypeEntry__Group_3__0");
					put(grammarAccess.getCableWeightDataBlockAccess().getGroup(), "rule__CableWeightDataBlock__Group__0");
					put(grammarAccess.getCableWeightEntryAccess().getGroup(), "rule__CableWeightEntry__Group__0");
					put(grammarAccess.getProtectionLevelDataBlockAccess().getGroup(), "rule__ProtectionLevelDataBlock__Group__0");
					put(grammarAccess.getProtectionLevelEntryAccess().getGroup(), "rule__ProtectionLevelEntry__Group__0");
					put(grammarAccess.getProtectionLevelEntryAccess().getGroup_9(), "rule__ProtectionLevelEntry__Group_9__0");
					put(grammarAccess.getCompartmentAccess().getGroup(), "rule__Compartment__Group__0");
					put(grammarAccess.getCompartmentAccess().getGroup_3_0(), "rule__Compartment__Group_3_0__0");
					put(grammarAccess.getCompartmentAccess().getGroup_3_1(), "rule__Compartment__Group_3_1__0");
					put(grammarAccess.getCompartmentAccess().getGroup_3_2(), "rule__Compartment__Group_3_2__0");
					put(grammarAccess.getCompartmentAccess().getGroup_3_3(), "rule__Compartment__Group_3_3__0");
					put(grammarAccess.getRDCAccess().getGroup(), "rule__RDC__Group__0");
					put(grammarAccess.getRDCAccess().getGroup_3_0(), "rule__RDC__Group_3_0__0");
					put(grammarAccess.getRDCAccess().getGroup_3_1(), "rule__RDC__Group_3_1__0");
					put(grammarAccess.getRDCAccess().getGroup_3_2(), "rule__RDC__Group_3_2__0");
					put(grammarAccess.getRDCAccess().getGroup_3_3(), "rule__RDC__Group_3_3__0");
					put(grammarAccess.getRDCAccess().getGroup_3_4(), "rule__RDC__Group_3_4__0");
					put(grammarAccess.getRDCAccess().getGroup_3_5(), "rule__RDC__Group_3_5__0");
					put(grammarAccess.getRDCAccess().getGroup_3_6(), "rule__RDC__Group_3_6__0");
					put(grammarAccess.getRDCAccess().getGroup_3_7(), "rule__RDC__Group_3_7__0");
					put(grammarAccess.getRDCAccess().getGroup_3_9(), "rule__RDC__Group_3_9__0");
					put(grammarAccess.getInternallyConnectedPinEntryAccess().getGroup(), "rule__InternallyConnectedPinEntry__Group__0");
					put(grammarAccess.getInternallyConnectedPinEntryAccess().getGroup_3(), "rule__InternallyConnectedPinEntry__Group_3__0");
					put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
					put(grammarAccess.getAvailableEqInterfaceAccess().getGroup(), "rule__AvailableEqInterface__Group__0");
					put(grammarAccess.getAvailableEqInterfaceAccess().getGroup_0(), "rule__AvailableEqInterface__Group_0__0");
					put(grammarAccess.getAvailableEqInterfaceAccess().getGroup_4(), "rule__AvailableEqInterface__Group_4__0");
					put(grammarAccess.getEqInterfaceGroupAccess().getGroup(), "rule__EqInterfaceGroup__Group__0");
					put(grammarAccess.getEqInterfaceGroupAccess().getGroup_4(), "rule__EqInterfaceGroup__Group_4__0");
					put(grammarAccess.getEqInterfaceGroupAccess().getGroup_6(), "rule__EqInterfaceGroup__Group_6__0");
					put(grammarAccess.getEqInterfaceGroupAccess().getGroup_6_3(), "rule__EqInterfaceGroup__Group_6_3__0");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getGroup(), "rule__ImplicitEqInterfaceMemberDefinition__Group__0");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getGroup_2(), "rule__ImplicitEqInterfaceMemberDefinition__Group_2__0");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getGroup(), "rule__ImplicitEqInterfaceMemberDefinitionAttributesAndValues__Group__0");
					put(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroup(), "rule__EqInterfaceGroupWithCombinedDefinition__Group__0");
					put(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getGroup_4(), "rule__EqInterfaceGroupWithCombinedDefinition__Group_4__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup(), "rule__EqInterface__Group__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_0(), "rule__EqInterface__Group_3_0__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_1(), "rule__EqInterface__Group_3_1__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_2(), "rule__EqInterface__Group_3_2__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_3(), "rule__EqInterface__Group_3_3__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_4(), "rule__EqInterface__Group_3_4__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_5(), "rule__EqInterface__Group_3_5__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_6(), "rule__EqInterface__Group_3_6__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_7(), "rule__EqInterface__Group_3_7__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_8(), "rule__EqInterface__Group_3_8__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_9(), "rule__EqInterface__Group_3_9__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_10(), "rule__EqInterface__Group_3_10__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_11(), "rule__EqInterface__Group_3_11__0");
					put(grammarAccess.getEqInterfaceAccess().getGroup_3_12(), "rule__EqInterface__Group_3_12__0");
					put(grammarAccess.getDislocalityRelationAccess().getGroup(), "rule__DislocalityRelation__Group__0");
					put(grammarAccess.getDislocalityRelationAccess().getGroup_1(), "rule__DislocalityRelation__Group_1__0");
					put(grammarAccess.getColocalityRelationAccess().getGroup(), "rule__ColocalityRelation__Group__0");
					put(grammarAccess.getColocalityRelationAccess().getGroup_1(), "rule__ColocalityRelation__Group_1__0");
					put(grammarAccess.getValidDeploymentAccess().getGroup(), "rule__ValidDeployment__Group__0");
					put(grammarAccess.getValidDeploymentAccess().getGroup_2(), "rule__ValidDeployment__Group_2__0");
					put(grammarAccess.getValidDeploymentAccess().getGroup_6(), "rule__ValidDeployment__Group_6__0");
					put(grammarAccess.getInvalidDeploymentAccess().getGroup(), "rule__InvalidDeployment__Group__0");
					put(grammarAccess.getInvalidDeploymentAccess().getGroup_2(), "rule__InvalidDeployment__Group_2__0");
					put(grammarAccess.getInvalidDeploymentAccess().getGroup_6(), "rule__InvalidDeployment__Group_6__0");
					put(grammarAccess.getDeploymentImplicitDefinitionAccess().getGroup(), "rule__DeploymentImplicitDefinition__Group__0");
					put(grammarAccess.getDeploymentImplicitDefinitionAccess().getGroup_2(), "rule__DeploymentImplicitDefinition__Group_2__0");
					put(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getGroup(), "rule__DeploymentImplicitDefinitionAttributeAndValue__Group__0");
					put(grammarAccess.getMetricParameterAccess().getGroup(), "rule__MetricParameter__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSIGNEDINTAccess().getGroup(), "rule__SIGNEDINT__Group__0");
					put(grammarAccess.getAssistModelAccess().getGlobalBlockAssignment(), "rule__AssistModel__GlobalBlockAssignment");
					put(grammarAccess.getGlobalBlockAccess().getSystemNameAssignment_3_0_2(), "rule__GlobalBlock__SystemNameAssignment_3_0_2");
					put(grammarAccess.getGlobalBlockAccess().getCompatibleIoTypesBlockAssignment_3_1(), "rule__GlobalBlock__CompatibleIoTypesBlockAssignment_3_1");
					put(grammarAccess.getGlobalBlockAccess().getCableWeightDataBlockAssignment_3_2(), "rule__GlobalBlock__CableWeightDataBlockAssignment_3_2");
					put(grammarAccess.getGlobalBlockAccess().getProtectionLevelDataBlockAssignment_3_3(), "rule__GlobalBlock__ProtectionLevelDataBlockAssignment_3_3");
					put(grammarAccess.getCompatibleIoTypesBlockAccess().getCompatibleIoTypesAssignment_2(), "rule__CompatibleIoTypesBlock__CompatibleIoTypesAssignment_2");
					put(grammarAccess.getCompatibleIoTypeEntryAccess().getEqInterfaceIoTypeAssignment_0(), "rule__CompatibleIoTypeEntry__EqInterfaceIoTypeAssignment_0");
					put(grammarAccess.getCompatibleIoTypeEntryAccess().getPinInterfaceIoTypesAssignment_2(), "rule__CompatibleIoTypeEntry__PinInterfaceIoTypesAssignment_2");
					put(grammarAccess.getCompatibleIoTypeEntryAccess().getPinInterfaceIoTypesAssignment_3_1(), "rule__CompatibleIoTypeEntry__PinInterfaceIoTypesAssignment_3_1");
					put(grammarAccess.getCableWeightDataBlockAccess().getCableWeightEntriesAssignment_2(), "rule__CableWeightDataBlock__CableWeightEntriesAssignment_2");
					put(grammarAccess.getCableWeightEntryAccess().getEqInterfaceIoTypeAssignment_0_0(), "rule__CableWeightEntry__EqInterfaceIoTypeAssignment_0_0");
					put(grammarAccess.getCableWeightEntryAccess().getDefaultEntryAssignment_0_1(), "rule__CableWeightEntry__DefaultEntryAssignment_0_1");
					put(grammarAccess.getCableWeightEntryAccess().getWeightAssignment_2(), "rule__CableWeightEntry__WeightAssignment_2");
					put(grammarAccess.getProtectionLevelDataBlockAccess().getProtectionLevelEntriesAssignment_2(), "rule__ProtectionLevelDataBlock__ProtectionLevelEntriesAssignment_2");
					put(grammarAccess.getProtectionLevelEntryAccess().getRdcLocationAssignment_2(), "rule__ProtectionLevelEntry__RdcLocationAssignment_2");
					put(grammarAccess.getProtectionLevelEntryAccess().getEmhZone1Assignment_6(), "rule__ProtectionLevelEntry__EmhZone1Assignment_6");
					put(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelAssignment_8(), "rule__ProtectionLevelEntry__ProtectionLevelAssignment_8");
					put(grammarAccess.getProtectionLevelEntryAccess().getProtectionLevelAssignment_9_1(), "rule__ProtectionLevelEntry__ProtectionLevelAssignment_9_1");
					put(grammarAccess.getCompartmentAccess().getNameAssignment_1(), "rule__Compartment__NameAssignment_1");
					put(grammarAccess.getCompartmentAccess().getManufacturerAssignment_3_0_2(), "rule__Compartment__ManufacturerAssignment_3_0_2");
					put(grammarAccess.getCompartmentAccess().getPowerSupplyAssignment_3_1_2(), "rule__Compartment__PowerSupplyAssignment_3_1_2");
					put(grammarAccess.getCompartmentAccess().getSideAssignment_3_2_2(), "rule__Compartment__SideAssignment_3_2_2");
					put(grammarAccess.getCompartmentAccess().getZoneAssignment_3_3_2(), "rule__Compartment__ZoneAssignment_3_3_2");
					put(grammarAccess.getCompartmentAccess().getRdcsAssignment_3_4(), "rule__Compartment__RdcsAssignment_3_4");
					put(grammarAccess.getRDCAccess().getNameAssignment_1(), "rule__RDC__NameAssignment_1");
					put(grammarAccess.getRDCAccess().getManufacturerAssignment_3_0_2(), "rule__RDC__ManufacturerAssignment_3_0_2");
					put(grammarAccess.getRDCAccess().getPowerSupplyAssignment_3_1_2(), "rule__RDC__PowerSupplyAssignment_3_1_2");
					put(grammarAccess.getRDCAccess().getRdcTypeAssignment_3_2_2(), "rule__RDC__RdcTypeAssignment_3_2_2");
					put(grammarAccess.getRDCAccess().getEssAssignment_3_3_2(), "rule__RDC__EssAssignment_3_3_2");
					put(grammarAccess.getRDCAccess().getLocationAssignment_3_4_2(), "rule__RDC__LocationAssignment_3_4_2");
					put(grammarAccess.getRDCAccess().getResourceXAssignment_3_5_2(), "rule__RDC__ResourceXAssignment_3_5_2");
					put(grammarAccess.getRDCAccess().getResourceYAssignment_3_6_2(), "rule__RDC__ResourceYAssignment_3_6_2");
					put(grammarAccess.getRDCAccess().getResourceZAssignment_3_7_2(), "rule__RDC__ResourceZAssignment_3_7_2");
					put(grammarAccess.getRDCAccess().getConnectorsAssignment_3_8(), "rule__RDC__ConnectorsAssignment_3_8");
					put(grammarAccess.getRDCAccess().getConnectedPinsAssignment_3_9_2(), "rule__RDC__ConnectedPinsAssignment_3_9_2");
					put(grammarAccess.getInternallyConnectedPinEntryAccess().getPinsAssignment_0(), "rule__InternallyConnectedPinEntry__PinsAssignment_0");
					put(grammarAccess.getInternallyConnectedPinEntryAccess().getPinsAssignment_2(), "rule__InternallyConnectedPinEntry__PinsAssignment_2");
					put(grammarAccess.getInternallyConnectedPinEntryAccess().getPinsAssignment_3_1(), "rule__InternallyConnectedPinEntry__PinsAssignment_3_1");
					put(grammarAccess.getConnectorAccess().getNameAssignment_1(), "rule__Connector__NameAssignment_1");
					put(grammarAccess.getConnectorAccess().getAvailableEqInterfacesAssignment_3(), "rule__Connector__AvailableEqInterfacesAssignment_3");
					put(grammarAccess.getAvailableEqInterfaceAccess().getNameAssignment_0_2(), "rule__AvailableEqInterface__NameAssignment_0_2");
					put(grammarAccess.getAvailableEqInterfaceAccess().getEqInterfaceTypeAssignment_1(), "rule__AvailableEqInterface__EqInterfaceTypeAssignment_1");
					put(grammarAccess.getAvailableEqInterfaceAccess().getCountAssignment_3(), "rule__AvailableEqInterface__CountAssignment_3");
					put(grammarAccess.getAvailableEqInterfaceAccess().getProtectionLevelAssignment_4_1(), "rule__AvailableEqInterface__ProtectionLevelAssignment_4_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getNameAssignment_1(), "rule__EqInterfaceGroup__NameAssignment_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_3_0(), "rule__EqInterfaceGroup__EqInterfacesAssignment_3_0");
					put(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsAssignment_3_1(), "rule__EqInterfaceGroup__ImplicitMemberDefinitionsAssignment_3_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getEqInterfacesAssignment_4_1_0(), "rule__EqInterfaceGroup__EqInterfacesAssignment_4_1_0");
					put(grammarAccess.getEqInterfaceGroupAccess().getImplicitMemberDefinitionsAssignment_4_1_1(), "rule__EqInterfaceGroup__ImplicitMemberDefinitionsAssignment_4_1_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesAssignment_6_2_0(), "rule__EqInterfaceGroup__WithoutEqInterfacesAssignment_6_2_0");
					put(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsAssignment_6_2_1(), "rule__EqInterfaceGroup__WithoutImplicitMemberDefinitionsAssignment_6_2_1");
					put(grammarAccess.getEqInterfaceGroupAccess().getWithoutEqInterfacesAssignment_6_3_1_0(), "rule__EqInterfaceGroup__WithoutEqInterfacesAssignment_6_3_1_0");
					put(grammarAccess.getEqInterfaceGroupAccess().getWithoutImplicitMemberDefinitionsAssignment_6_3_1_1(), "rule__EqInterfaceGroup__WithoutImplicitMemberDefinitionsAssignment_6_3_1_1");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesAssignment_1(), "rule__ImplicitEqInterfaceMemberDefinition__EntriesAssignment_1");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAccess().getEntriesAssignment_2_1(), "rule__ImplicitEqInterfaceMemberDefinition__EntriesAssignment_2_1");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getAttributeAssignment_0(), "rule__ImplicitEqInterfaceMemberDefinitionAttributesAndValues__AttributeAssignment_0");
					put(grammarAccess.getImplicitEqInterfaceMemberDefinitionAttributesAndValuesAccess().getValueAssignment_2(), "rule__ImplicitEqInterfaceMemberDefinitionAttributesAndValues__ValueAssignment_2");
					put(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getNameAssignment_1(), "rule__EqInterfaceGroupWithCombinedDefinition__NameAssignment_1");
					put(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsAssignment_3(), "rule__EqInterfaceGroupWithCombinedDefinition__CombinedGroupsAssignment_3");
					put(grammarAccess.getEqInterfaceGroupWithCombinedDefinitionAccess().getCombinedGroupsAssignment_4_1(), "rule__EqInterfaceGroupWithCombinedDefinition__CombinedGroupsAssignment_4_1");
					put(grammarAccess.getEqInterfaceAccess().getNameAssignment_1(), "rule__EqInterface__NameAssignment_1");
					put(grammarAccess.getEqInterfaceAccess().getSystemAssignment_3_0_2(), "rule__EqInterface__SystemAssignment_3_0_2");
					put(grammarAccess.getEqInterfaceAccess().getSubAtaAssignment_3_1_2(), "rule__EqInterface__SubAtaAssignment_3_1_2");
					put(grammarAccess.getEqInterfaceAccess().getResourceAssignment_3_2_2(), "rule__EqInterface__ResourceAssignment_3_2_2");
					put(grammarAccess.getEqInterfaceAccess().getLineNameAssignment_3_3_2(), "rule__EqInterface__LineNameAssignment_3_3_2");
					put(grammarAccess.getEqInterfaceAccess().getWiringLaneAssignment_3_4_2(), "rule__EqInterface__WiringLaneAssignment_3_4_2");
					put(grammarAccess.getEqInterfaceAccess().getGrpInfoAssignment_3_5_2(), "rule__EqInterface__GrpInfoAssignment_3_5_2");
					put(grammarAccess.getEqInterfaceAccess().getRouteAssignment_3_6_2(), "rule__EqInterface__RouteAssignment_3_6_2");
					put(grammarAccess.getEqInterfaceAccess().getPwSup1Assignment_3_7_2(), "rule__EqInterface__PwSup1Assignment_3_7_2");
					put(grammarAccess.getEqInterfaceAccess().getEmhZone1Assignment_3_8_2(), "rule__EqInterface__EmhZone1Assignment_3_8_2");
					put(grammarAccess.getEqInterfaceAccess().getIoTypeAssignment_3_9_2(), "rule__EqInterface__IoTypeAssignment_3_9_2");
					put(grammarAccess.getEqInterfaceAccess().getResourceXAssignment_3_10_2(), "rule__EqInterface__ResourceXAssignment_3_10_2");
					put(grammarAccess.getEqInterfaceAccess().getResourceYAssignment_3_11_2(), "rule__EqInterface__ResourceYAssignment_3_11_2");
					put(grammarAccess.getEqInterfaceAccess().getResourceZAssignment_3_12_2(), "rule__EqInterface__ResourceZAssignment_3_12_2");
					put(grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsAssignment_0(), "rule__DislocalityRelation__EqInterfaceOrGroupsAssignment_0");
					put(grammarAccess.getDislocalityRelationAccess().getEqInterfaceOrGroupsAssignment_1_1(), "rule__DislocalityRelation__EqInterfaceOrGroupsAssignment_1_1");
					put(grammarAccess.getDislocalityRelationAccess().getHardwareLevelAssignment_3(), "rule__DislocalityRelation__HardwareLevelAssignment_3");
					put(grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsAssignment_0(), "rule__ColocalityRelation__EqInterfaceOrGroupsAssignment_0");
					put(grammarAccess.getColocalityRelationAccess().getEqInterfaceOrGroupsAssignment_1_1(), "rule__ColocalityRelation__EqInterfaceOrGroupsAssignment_1_1");
					put(grammarAccess.getColocalityRelationAccess().getHardwareLevelAssignment_3(), "rule__ColocalityRelation__HardwareLevelAssignment_3");
					put(grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsAssignment_1(), "rule__ValidDeployment__EqInterfaceOrGroupsAssignment_1");
					put(grammarAccess.getValidDeploymentAccess().getEqInterfaceOrGroupsAssignment_2_1(), "rule__ValidDeployment__EqInterfaceOrGroupsAssignment_2_1");
					put(grammarAccess.getValidDeploymentAccess().getHardwareElementsAssignment_5_0(), "rule__ValidDeployment__HardwareElementsAssignment_5_0");
					put(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsAssignment_5_1(), "rule__ValidDeployment__ImplicitHardwareElementsAssignment_5_1");
					put(grammarAccess.getValidDeploymentAccess().getHardwareElementsAssignment_6_1_0(), "rule__ValidDeployment__HardwareElementsAssignment_6_1_0");
					put(grammarAccess.getValidDeploymentAccess().getImplicitHardwareElementsAssignment_6_1_1(), "rule__ValidDeployment__ImplicitHardwareElementsAssignment_6_1_1");
					put(grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsAssignment_1(), "rule__InvalidDeployment__EqInterfaceOrGroupsAssignment_1");
					put(grammarAccess.getInvalidDeploymentAccess().getEqInterfaceOrGroupsAssignment_2_1(), "rule__InvalidDeployment__EqInterfaceOrGroupsAssignment_2_1");
					put(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsAssignment_5_0(), "rule__InvalidDeployment__HardwareElementsAssignment_5_0");
					put(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsAssignment_5_1(), "rule__InvalidDeployment__ImplicitHardwareElementsAssignment_5_1");
					put(grammarAccess.getInvalidDeploymentAccess().getHardwareElementsAssignment_6_1_0(), "rule__InvalidDeployment__HardwareElementsAssignment_6_1_0");
					put(grammarAccess.getInvalidDeploymentAccess().getImplicitHardwareElementsAssignment_6_1_1(), "rule__InvalidDeployment__ImplicitHardwareElementsAssignment_6_1_1");
					put(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesAssignment_1(), "rule__DeploymentImplicitDefinition__EntriesAssignment_1");
					put(grammarAccess.getDeploymentImplicitDefinitionAccess().getEntriesAssignment_2_1(), "rule__DeploymentImplicitDefinition__EntriesAssignment_2_1");
					put(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getAttributeAssignment_0(), "rule__DeploymentImplicitDefinitionAttributeAndValue__AttributeAssignment_0");
					put(grammarAccess.getDeploymentImplicitDefinitionAttributeAndValueAccess().getValueAssignment_2(), "rule__DeploymentImplicitDefinitionAttributeAndValue__ValueAssignment_2");
					put(grammarAccess.getMetricParameterAccess().getNameAssignment_0(), "rule__MetricParameter__NameAssignment_0");
					put(grammarAccess.getMetricParameterAccess().getValueAssignment_2(), "rule__MetricParameter__ValueAssignment_2");
					put(grammarAccess.getGlobalBlockAccess().getUnorderedGroup_3(), "rule__GlobalBlock__UnorderedGroup_3");
					put(grammarAccess.getCompartmentAccess().getUnorderedGroup_3(), "rule__Compartment__UnorderedGroup_3");
					put(grammarAccess.getRDCAccess().getUnorderedGroup_3(), "rule__RDC__UnorderedGroup_3");
					put(grammarAccess.getEqInterfaceAccess().getUnorderedGroup_3(), "rule__EqInterface__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal.InternalMappingDSLParser typedParser = (ch.hilbri.assist.mappingdsl.ui.contentassist.antlr.internal.InternalMappingDSLParser) parser;
			typedParser.entryRuleAssistModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MappingDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MappingDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
