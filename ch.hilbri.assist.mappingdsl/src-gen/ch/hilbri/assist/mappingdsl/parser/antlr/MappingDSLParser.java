/*
* generated by Xtext
*/
package ch.hilbri.assist.mappingdsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess;

public class MappingDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MappingDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected ch.hilbri.assist.mappingdsl.parser.antlr.internal.InternalMappingDSLParser createParser(XtextTokenStream stream) {
		return new ch.hilbri.assist.mappingdsl.parser.antlr.internal.InternalMappingDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "AssistModel";
	}
	
	public MappingDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MappingDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
