package ch.hilbri.assist.scheduling.dsl.ui.labeling

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.RestrictionFinishAtTheSameTime
import ch.hilbri.assist.model.RestrictionStartAfterOtherFinished
import ch.hilbri.assist.model.RestrictionStartAfterOtherStarted
import ch.hilbri.assist.model.RestrictionStartAtTheSameTime
import ch.hilbri.assist.model.Task
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import ch.hilbri.assist.model.RestrictionDisjointExecution

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
        'Task ' + t.getName
    }

    def image(Task t) {
        'outlineview_task.png'
    }

    def text(Application a) {
        'Application ' + a.getName
    }

    def image(Application a) {
        'outlineview_application.gif'
    }

    def text(RestrictionStartAtTheSameTime r) {
        'Start [' +  r.taskNames + '] together'
    }

    def image(RestrictionStartAtTheSameTime r) {
        'outlineview_constraint.png'
    }

    def text(RestrictionFinishAtTheSameTime r) {
        'Finish [' + r.taskNames + ']  together'
    }

    def image(RestrictionFinishAtTheSameTime r) {
        'outlineview_constraint.png'
    }

    def text(RestrictionStartAfterOtherFinished r) {
        'Start [' + r.taskNames + '] after [' + r.otherTask.getName + '] finished'
    }

    def image(RestrictionStartAfterOtherFinished r) {
        'outlineview_constraint.png'
    }

    def text(RestrictionStartAfterOtherStarted r) {
        'Start [' + r.taskNames + '] after [' + r.otherTask.getName + '] started'
    }

    def image(RestrictionStartAfterOtherStarted r) {
        'outlineview_constraint.png'
    }

    def text(RestrictionDisjointExecution r) {
        'Disjoint execution for [' + r.taskNames + ']'
    }

    def image(RestrictionDisjointExecution r) {
        'outlineview_constraint.png'
    }


}
