package ch.hilbri.assist.dse.dsl.formatting2

//import ch.hilbri.assist.dse.dsl.services.DSEDslGrammarAccess
import ch.hilbri.assist.dse.model.AssistModelDSE
import ch.hilbri.assist.mapping.model.Compartment
//import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class DSEDslFormatter extends AbstractFormatter2 {
	
//	@Inject extension DSEDslGrammarAccess

	def dispatch void format(AssistModelDSE assistModelDSE, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Compartment compartment : assistModelDSE.getCompartments()) {
			compartment.format;
		}
	}
	
	// TODO: implement for 
}
