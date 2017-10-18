package ch.hilbri.assist.mapping.dsl.formatting2

//import ch.hilbri.assist.mapping.dsl.services.MappingDSLGrammarAccess
import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.ColocalityRelation
import ch.hilbri.assist.mapping.model.Compartment
import ch.hilbri.assist.mapping.model.DislocalityRelation
import ch.hilbri.assist.mapping.model.MetricParameter
//import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class MappingDSLFormatter extends AbstractFormatter2 {
	
//	@Inject extension MappingDSLGrammarAccess

	def dispatch void format(AssistModel assistModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Compartment compartment : assistModel.getCompartments()) {
			compartment.format;
		}
		for (Application application : assistModel.getApplications()) {
			application.format;
		}
		for (DislocalityRelation dislocalityRelation : assistModel.getDislocalityRelations()) {
			dislocalityRelation.format;
		}
		for (ColocalityRelation colocalityRelation : assistModel.getColocalityRelations()) {
			colocalityRelation.format;
		}
	}

	def dispatch void format(Compartment compartment, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Box box : compartment.getBoxes()) {
			box.format;
		}
		for (MetricParameter metricParameter : compartment.getMetricParameters()) {
			metricParameter.format;
		}
	}
	
	// TODO: implement for Box, Board, Processor, Core, Application, Task
}
