package ch.hilbri.assist.mapping.dsl.ui.labeling

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.ApplicationGroup
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Board
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.CommunicationRelation
import ch.hilbri.assist.mapping.model.Compartment
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.DislocalityRelation
import ch.hilbri.assist.mapping.model.DissimilarityRelation
import ch.hilbri.assist.mapping.model.Network
import ch.hilbri.assist.mapping.model.Processor
import ch.hilbri.assist.mapping.model.ProximityRelation
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

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
		'outline_view_system_16x16.png'
	}

	def text(Compartment comp) {
		'Compartment ' + comp.name
	}

	def image(Compartment comp) {
		'outline_view_compartment_16x16.png'
	}

	def text(Box box) {
		'Box ' + box.name
	}

	def image(Box box) {
		'outline_view_box_16x16.png'
	}

	def text(Board b) {
		'Board ' + b.name
	}

	def image(Board b) {
		'outline_view_board_16x16.png'
	}

	def text(Processor p) {
		'Processor ' + p.name
	}

	def image(Processor p) {
		'outline_view_processor_16x16.png'
	}

	def text(Core c) {
		'Core ' + c.name
	}

	def image(Core c) {
		'outline_view_core_16x16.png'
	}

	def text(Application a) {
		'Application ' + a.name
	}

	def image(Application a) {
		'outline_view_application2_16x16.png'
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
		'outline_view_relation_16x16.png'
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
		'outline_view_relation_16x16.png'
	}

	def text(ProximityRelation r) {
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

	def image(ProximityRelation r) {
		'outline_view_relation_16x16.png'
	}

	def text(CommunicationRelation r) {
		r.applicationsOrGroups + " with bandwidth " + r.bandwidthUtilization
	}

	def image(CommunicationRelation r) {
		'outline_view_communication_16x16.png'
	}
	
	def text(Network n) {
		n.name + " connects " + n.boards 
	}
	
	def image(Network n) {
		'outline_view_network_16x16.png'
	}
	
	def text(ApplicationGroup g) {
		g.name + " contains " + g.applicationsOrGroups
	}
	
	def image(ApplicationGroup g) {
		'outline_view_application_group_16x16.png'
	}
}