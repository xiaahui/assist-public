package ch.hilbri.assist.scheduling.dsl.validation

import ch.hilbri.assist.model.SchedulingRestriction
import ch.hilbri.assist.model.SimpleRelation
import ch.hilbri.assist.model.Task
import java.util.List
import org.eclipse.xtext.validation.Check
import ch.hilbri.assist.model.ComplexRelation
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ModelPackage

class SchedulingDslValidator extends AbstractSchedulingDslValidator {


    @Check(FAST)
    def checkPeriodsOfTasksInRestrictions(AssistModel model) {

        for (restriction : model.schedulingRestrictions) {
            var Iterable<Task> taskList

            if (restriction instanceof SimpleRelation)
                taskList = restriction.tasks

            else if (restriction instanceof ComplexRelation)
                taskList = restriction.tasks + #[restriction.otherTask]

            if (taskList.map[period].toSet.size > 1)
                error(
                    'Tasks referenced in scheduling restrictions need to have the same period',
                    model,
                    ModelPackage.Literals.ASSIST_MODEL__SCHEDULING_RESTRICTIONS,
                    model.schedulingRestrictions.indexOf(restriction)
                )
                
        }
    }

}
