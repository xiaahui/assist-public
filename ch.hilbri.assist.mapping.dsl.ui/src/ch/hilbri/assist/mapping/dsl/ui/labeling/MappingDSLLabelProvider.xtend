package ch.hilbri.assist.mapping.dsl.ui.labeling

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.ApplicationGroup
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Board
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.ColocalityRelation
import ch.hilbri.assist.mapping.model.Compartment
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.DislocalityRelation
import ch.hilbri.assist.mapping.model.DissimilarityRelation
import ch.hilbri.assist.mapping.model.Processor
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import ch.hilbri.assist.mapping.model.Task

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class MappingDSLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	def text(AssistModel model) {
		'System ' + model.systemName 
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
	
	def text(ApplicationGroup g) {
		'Group ' + g.name + ' ' + g.applicationsOrGroups
	}
	
	def image(ApplicationGroup g) {
		'outlineview_application_group.gif'
	}
	
	

	def text(DislocalityRelation r) {
		val output = new StringBuilder()
		
		output.append("[")
		for (aog : r.applicationsOrGroups) {
			if (aog instanceof Application) output.append(aog.name)
			if (aog instanceof ApplicationGroup) output.append(aog.name)
			if (r.applicationsOrGroups.last != aog) output.append(", ")
		}
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
		for (aog : r.applicationsOrGroups) {
			if (aog instanceof Application) output.append(aog.name)
			if (aog instanceof ApplicationGroup) output.append(aog.name)
			if (r.applicationsOrGroups.last != aog) output.append(", ")
		}
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
		for (aog : r.applicationsOrGroups) {
			if (aog instanceof Application) output.append(aog.name)
			if (aog instanceof ApplicationGroup) output.append(aog.name)
			if (r.applicationsOrGroups.last != aog) output.append(", ")
		}
		output.append("]")
		output.append(" on same ")
		output.append(r.hardwareLevel)
		output.append(" ")
		
		return output.toString
	}

	def image(ColocalityRelation r) {
		'outlineview_constraint.png'
	}

//	def text(Network n) {
//		n.name + " connects " + n.boards 
//	}
//	
//	def image(Network n) {
//		'outline_view_network_16x16.png'
//	}
//	
}
