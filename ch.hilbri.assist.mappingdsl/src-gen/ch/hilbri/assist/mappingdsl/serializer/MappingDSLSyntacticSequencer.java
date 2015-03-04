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
	protected AbstractElementAlias match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_Interface___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q;
	protected AbstractElementAlias match_RDC___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MappingDSLGrammarAccess) access;
		match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getGenericPropertiesKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getCompartmentAccess().getRightCurlyBracketKeyword_8_3()));
		match_Interface___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getInterfaceAccess().getGenericPropertiesKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_13_3()));
		match_RDC___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRDCAccess().getGenericPropertiesKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getRDCAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getRDCAccess().getRightCurlyBracketKeyword_8_3()));
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
			if(match_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_Compartment___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Interface___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q.equals(syntax))
				emit_Interface___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RDC___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_RDC___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	protected void emit_Interface___GenericPropertiesKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Generic properties' '{' '}')?
	 */
	protected void emit_RDC___GenericPropertiesKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
