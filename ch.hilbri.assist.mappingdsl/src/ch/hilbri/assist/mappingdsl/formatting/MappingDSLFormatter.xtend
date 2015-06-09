/*
 * generated by Xtext
 */
package ch.hilbri.assist.mappingdsl.formatting

import ch.hilbri.assist.mappingdsl.services.MappingDSLGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class MappingDSLFormatter extends AbstractDeclarativeFormatter {

	@Inject extension MappingDSLGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		
		val f = getGrammarAccess

    	for (pair : f.findKeywordPairs("(", ")")) {
      		c.setNoSpace.after(pair.getFirst)
      		c.setNoSpace.before(pair.getSecond)
    	}
    
    	for (comma : f.findKeywords(",")) {
      		c.setNoSpace().before(comma);
    	}
    	
    	for (semi : f.findKeywords(";")) {
    		c.setNoSpace.before(semi)
    		c.setLinewrap.after(semi)
    	}

		for (pair : f.findKeywordPairs("{", "}")) {
				
			c.setLinewrap.after(pair.first)
			c.setIndentationIncrement.after(pair.first)
			c.setLinewrap.before(pair.second)
			c.setIndentationDecrement.before(pair.second)
			c.setLinewrap.after(pair.second)
		}    
	
		// No linewrap after group definitions
		c.setNoLinewrap.after(eqInterfaceGroupAccess.leftCurlyBracketKeyword_2)
		c.setNoLinewrap.before(eqInterfaceGroupAccess.rightCurlyBracketKeyword_5)
	
		// No linewrap after valid/invalid definitions
		c.setNoLinewrap.after(validDeploymentAccess.leftCurlyBracketKeyword_4)
		c.setNoLinewrap.before(validDeploymentAccess.rightCurlyBracketKeyword_7)
		c.setNoLinewrap.after(invalidDeploymentAccess.leftCurlyBracketKeyword_4)
		c.setNoLinewrap.before(invalidDeploymentAccess.rightCurlyBracketKeyword_7)
		
		// Linewrap after sections in the ASSIST rule
		c.setLinewrap(2).after(assistModelAccess.rightCurlyBracketKeyword_6)
		c.setLinewrap(2).after(assistModelAccess.compartmentsAssignment_7)
		c.setLinewrap(2).after(assistModelAccess.rightCurlyBracketKeyword_8_3)
		c.setLinewrap(2).after(assistModelAccess.rightCurlyBracketKeyword_9_3)
		
	
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		
		
		
	}
}
