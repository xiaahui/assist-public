package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MappingDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MappingDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a__a;
	protected AbstractElementAlias match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a;
	protected AbstractElementAlias match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___or_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a_RightCurlyBracketKeyword_2_2_3__q___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a__a__;
	protected AbstractElementAlias match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a__a;
	protected AbstractElementAlias match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a;
	protected AbstractElementAlias match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___or_____CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a_RightCurlyBracketKeyword_2_1_3__q___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a__a__;
	protected AbstractElementAlias match_AssistModel___InterfaceGroupsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_AssistModel___RestrictionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_AssistModel___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a;
	protected AbstractElementAlias match_AssistModel___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a;
	protected AbstractElementAlias match_AssistModel_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___or___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3____a;
	protected AbstractElementAlias match_InvalidDeployment_AreKeyword_3_1_or_IsKeyword_3_0;
	protected AbstractElementAlias match_ValidDeployment_AreKeyword_3_1_or_IsKeyword_3_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MappingDSLGrammarAccess) access;
		match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())));
		match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()));
		match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___or_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a_RightCurlyBracketKeyword_2_2_3__q___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a__a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1())), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1())))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()))));
		match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())));
		match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()));
		match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___or_____CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a_RightCurlyBracketKeyword_2_1_3__q___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a__a__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1())), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1())))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()))));
		match_AssistModel___InterfaceGroupsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getInterfaceGroupsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_6_3()));
		match_AssistModel___RestrictionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_7_3()));
		match_AssistModel___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()));
		match_AssistModel___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()));
		match_AssistModel_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___or___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCableWeightsKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_2_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getCompatibleInterfaceTypesKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_2_1_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_2_1_3())));
		match_InvalidDeployment_AreKeyword_3_1_or_IsKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInvalidDeploymentAccess().getAreKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getInvalidDeploymentAccess().getIsKeyword_3_0()));
		match_ValidDeployment_AreKeyword_3_1_or_IsKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValidDeploymentAccess().getAreKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getValidDeploymentAccess().getIsKeyword_3_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a__a.equals(syntax))
				emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a.equals(syntax))
				emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___or_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a_RightCurlyBracketKeyword_2_2_3__q___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a__a__.equals(syntax))
				emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___or_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a_RightCurlyBracketKeyword_2_2_3__q___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a__a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a__a.equals(syntax))
				emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a.equals(syntax))
				emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___or_____CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a_RightCurlyBracketKeyword_2_1_3__q___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a__a__.equals(syntax))
				emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___or_____CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a_RightCurlyBracketKeyword_2_1_3__q___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a__a__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___InterfaceGroupsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_AssistModel___InterfaceGroupsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___RestrictionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_AssistModel___RestrictionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a.equals(syntax))
				emit_AssistModel___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a.equals(syntax))
				emit_AssistModel___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___or___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3____a.equals(syntax))
				emit_AssistModel_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___or___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InvalidDeployment_AreKeyword_3_1_or_IsKeyword_3_0.equals(syntax))
				emit_InvalidDeployment_AreKeyword_3_1_or_IsKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValidDeployment_AreKeyword_3_1_or_IsKeyword_3_0.equals(syntax))
				emit_ValidDeployment_AreKeyword_3_1_or_IsKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('Cable Weights' '{' '}' ('Compatible Interface Types' '{' '}')*)*
	 */
	protected void emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Cable Weights' '{' '}')*
	 */
	protected void emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('Cable Weights' '{' ('}' 'Cable Weights' '{')*) | 
	     (
	         ('Cable Weights' '{' ('}' 'Cable Weights' '{')* '}')? 
	         ('Compatible Interface Types' '{' '}')+ 
	         'Cable Weights' 
	         '{' 
	         ('}' 'Cable Weights' '{')* 
	         ('}' ('Compatible Interface Types' '{' '}')+ 'Cable Weights' '{' ('}' 'Cable Weights' '{')*)*
	     )
	 )
	 */
	protected void emit_AssistModel___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___or_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a_RightCurlyBracketKeyword_2_2_3__q___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__p_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1___RightCurlyBracketKeyword_2_2_3_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a__a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Compatible Interface Types' '{' '}' ('Cable Weights' '{' '}')*)*
	 */
	protected void emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Compatible Interface Types' '{' '}')*
	 */
	protected void emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ('Compatible Interface Types' '{' ('}' 'Compatible Interface Types' '{')*) | 
	     (
	         ('Compatible Interface Types' '{' ('}' 'Compatible Interface Types' '{')* '}')? 
	         ('Cable Weights' '{' '}')+ 
	         'Compatible Interface Types' 
	         '{' 
	         ('}' 'Compatible Interface Types' '{')* 
	         ('}' ('Cable Weights' '{' '}')+ 'Compatible Interface Types' '{' ('}' 'Compatible Interface Types' '{')*)*
	     )
	 )
	 */
	protected void emit_AssistModel___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___or_____CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a_RightCurlyBracketKeyword_2_1_3__q___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__p_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1___RightCurlyBracketKeyword_2_1_3_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a__a__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('InterfaceGroups' '{' '}')?
	 */
	protected void emit_AssistModel___InterfaceGroupsKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Restrictions' '{' '}')?
	 */
	protected void emit_AssistModel___RestrictionsKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' ('Cable Weights' '{' '}')* 'Compatible Interface Types' '{')*
	 */
	protected void emit_AssistModel___RightCurlyBracketKeyword_2_1_3___CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3__a_CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' ('Compatible Interface Types' '{' '}')* 'Cable Weights' '{')*
	 */
	protected void emit_AssistModel___RightCurlyBracketKeyword_2_2_3___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3__a_CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('Compatible Interface Types' '{' '}') | ('Cable Weights' '{' '}'))*
	 */
	protected void emit_AssistModel_____CableWeightsKeyword_2_2_0_LeftCurlyBracketKeyword_2_2_1_RightCurlyBracketKeyword_2_2_3___or___CompatibleInterfaceTypesKeyword_2_1_0_LeftCurlyBracketKeyword_2_1_1_RightCurlyBracketKeyword_2_1_3____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is' | 'are'
	 */
	protected void emit_InvalidDeployment_AreKeyword_3_1_or_IsKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is' | 'are'
	 */
	protected void emit_ValidDeployment_AreKeyword_3_1_or_IsKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
