
package ch.hilbri.assist.scheduling.dsl.formatting2

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.MetricParameter
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SchedulingDslFormatter extends AbstractFormatter2 {
	
//	@Inject extension SchedulingDslGrammarAccess

	def dispatch void format(AssistModel assistModelScheduling, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Compartment compartment : assistModelScheduling.getCompartments()) {
			compartment.format;
		}
		for (Application application : assistModelScheduling.getApplications()) {
			application.format;
		}
	}

	def dispatch void format(Compartment compartment, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (MetricParameter metricParameter : compartment.getMetricParameters()) {
			metricParameter.format;
		}
		for (Box box : compartment.getBoxes()) {
			box.format;
		}
	}
	
	// TODO: implement for Application, Box, Board, Processor, Core, Task, HardwareElement
}
