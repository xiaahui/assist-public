package ch.hilbri.assist.mappingdsl.serializer;

import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MappingDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MappingDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Application___GenericPropertiesKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q;
	protected AbstractElementAlias match_AssistModel___RestrictionsKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_6__q;
	protected AbstractElementAlias match_Board___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q;
	protected AbstractElementAlias match_Box___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_Core___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Network___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q;
	protected AbstractElementAlias match_Processor___GenericPropertiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MappingDSLGrammarAccess) access;
		match_Application___GenericPropertiesKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getApplicationAccess().getGenericPropertiesKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_12_3()));
		match_AssistModel___RestrictionsKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRestrictionsKeyword_17_0()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getLeftCurlyBracketKeyword_17_1()), new TokenAlias(false, false, grammarAccess.getAssistModelAccess().getRightCurlyBracketKeyword_17_6()));
		match_Board___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBoardAccess().getGenericPropertiesKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_13_3()));
		match_Box___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getBoxAccess().getGenericPropertiesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getBoxAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getBoxAccess().getRightCurlyBracketKeyword_5_3()));
		match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3()));
		match_Core___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCoreAccess().getGenericPropertiesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getCoreAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getCoreAccess().getRightCurlyBracketKeyword_5_3()));
		match_Network___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNetworkAccess().getGenericPropertiesKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_13_3()));
		match_Processor___GenericPropertiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getProcessorAccess().getGenericPropertiesKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getProcessorAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getProcessorAccess().getRightCurlyBracketKeyword_6_3()));
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
			if(match_Application___GenericPropertiesKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q.equals(syntax))
				emit_Application___GenericPropertiesKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AssistModel___RestrictionsKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_6__q.equals(syntax))
				emit_AssistModel___RestrictionsKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Board___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q.equals(syntax))
				emit_Board___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Box___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Box___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Core___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Core___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Network___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q.equals(syntax))
				emit_Network___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Processor___GenericPropertiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Processor___GenericPropertiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Application___GenericPropertiesKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Restrictions' '{' '}')?
	 */
	protected void emit_AssistModel___RestrictionsKeyword_17_0_LeftCurlyBracketKeyword_17_1_RightCurlyBracketKeyword_17_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Board___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Box___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Core___GenericPropertiesKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Network___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_Processor___GenericPropertiesKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
