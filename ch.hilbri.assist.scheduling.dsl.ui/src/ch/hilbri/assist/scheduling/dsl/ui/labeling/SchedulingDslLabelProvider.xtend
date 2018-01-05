package ch.hilbri.assist.scheduling.dsl.ui.labeling

import ch.hilbri.assist.scheduling.model.Application
import ch.hilbri.assist.scheduling.model.AssistModelScheduling
import ch.hilbri.assist.scheduling.model.Board
import ch.hilbri.assist.scheduling.model.Box
import ch.hilbri.assist.scheduling.model.Compartment
import ch.hilbri.assist.scheduling.model.Core
import ch.hilbri.assist.scheduling.model.Processor
import ch.hilbri.assist.scheduling.model.Task
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class SchedulingDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}


	def text(AssistModelScheduling model) {
		model.getSystemName 
	}

	def image(AssistModelScheduling model) {
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
}
