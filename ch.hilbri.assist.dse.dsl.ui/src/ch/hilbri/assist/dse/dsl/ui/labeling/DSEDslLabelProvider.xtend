package ch.hilbri.assist.dse.dsl.ui.labeling

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.ApplicationAlternative
import ch.hilbri.assist.model.ApplicationAlternatives
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.BoardAlternative
import ch.hilbri.assist.model.BoardAlternatives
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.ColocalityRelation
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.DislocalityRelation
import ch.hilbri.assist.model.DissimilarityRelation
import ch.hilbri.assist.model.ExplorationCandidate
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.RestrictionAlternative
import ch.hilbri.assist.model.RestrictionAlternatives
import ch.hilbri.assist.model.Task
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class DSEDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(AssistModel model) {
		model.getSystemName
	}

	def image(AssistModel model) {
		'outlineview_system.png'
	}

	def text(Compartment comp) {
		'Compartment ' + comp.name
	}

	def image(Compartment comp) {
		'outlineview_hardware_node.gif'
	}

	def text(Box box) {
		'Box ' + box.name
	}

	def image(Box box) {
		'outlineview_hardware_node.gif'
	}

	def text(Board b) {
		'Board ' + b.name
	}

	def image(Board b) {
		'outlineview_hardware_node.gif'
	}

	def text(Processor p) {
		'Processor ' + p.name
	}

	def image(Processor p) {
		'outlineview_processor.gif'
	}

	def text(Core c) {
		'Core ' + c.name
	}

	def image(Core c) {
		'outlineview_core.gif'
	}

	def text(Task t) {
		'Task' + t.name
	}

	def image(Task t) {
		'outlineview_task.png'
	}

	def text(Application a) {
		'Application ' + a.name
	}

	def image(Application a) {
		'outlineview_application.gif'
	}

	def text(DislocalityRelation r) {
		val output = new StringBuilder()

		output.append("[")
		output.append(r.softwareElementNames)
		output.append("]")
		output.append(" dislocal up to ")
		output.append(r.hardwareLevel)
		output.append("-level ")

		return output.toString
	}

	def image(DislocalityRelation r) {
		'outlineview_constraint.png'
	}

	def text(DissimilarityRelation r) {
		val output = new StringBuilder()
		
		output.append("[")
		output.append(r.softwareElementNames)
		output.append("]")
		output.append(" dissimilar ")
		
		return output.toString
	}

	def image(DissimilarityRelation r) {
		'outlineview_constraint.png'
	}
	def text(ColocalityRelation r) {
		val output = new StringBuilder()

		output.append("[")
		output.append(r.softwareElementNames)
		output.append("]")
		output.append(" on same ")
		output.append(r.hardwareLevel)
		output.append(" ")

		return output.toString
	}

	def image(ColocalityRelation r) {
		'outlineview_constraint.png'
	}

	def image(BoardAlternatives ba) {
		'outlineview_alternatives.png'
	}
	
	def text(BoardAlternatives ba) {
		'Alternatives'
	}
	
	def image(BoardAlternative ba) {
		'outlineview_alternative.gif'
	}
	
	def image(ApplicationAlternatives a) {
		'outlineview_alternatives.png'
	}
	
	def text(ApplicationAlternatives ba) {
		'Alternatives'
	}
	
	def image(ApplicationAlternative a) {
		'outlineview_alternative.gif'
	}
	
	def image(RestrictionAlternatives a) {
		'outlineview_alternatives.png'
	}
	
	def text(RestrictionAlternatives ba) {
		'Alternatives'
	}
	
	def image(RestrictionAlternative a) {
		'outlineview_alternative.gif'
	}
	
	def text(ExplorationCandidate c) {
		c.name
	}
	
	def image(ExplorationCandidate c) {
		'outlineview_system.png'
	}

}
