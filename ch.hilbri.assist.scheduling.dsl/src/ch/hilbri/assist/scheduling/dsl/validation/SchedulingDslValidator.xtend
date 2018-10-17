package ch.hilbri.assist.scheduling.dsl.validation

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.ComplexRelation
import ch.hilbri.assist.model.CustomProperty
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.model.SimpleRelation
import ch.hilbri.assist.model.SoftwareElement
import ch.hilbri.assist.model.Task
import org.eclipse.xtext.validation.Check

class SchedulingDslValidator extends AbstractSchedulingDslValidator {


    @Check
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
    
    
    @Check
    def checkProperties(AssistModel assistModel) {
        val allProperties = assistModel.properties.filter[!(it instanceof CustomProperty)].toList
        val propertiesList = allProperties.groupBy[class]
        val multipleProperties = propertiesList.filter[className, properties | properties.size > 1]
        for (classname : multipleProperties.keySet) {
            for (property : multipleProperties.get(classname)) {
                val propertyName = classname.name.split('\\.').last.split('Property').head
                val propertyValue = multipleProperties.get(classname).head.stringValue
                warning('''There are multiple definitions of the "«propertyName»" property in "Global" section. The value of the first definition ("«propertyValue»") will be used.''', 
                    assistModel, ModelPackage.Literals::ASSIST_MODEL__PROPERTIES, allProperties.indexOf(property)
                )
            }
        }
    }

    @Check
    def checkProperties(HardwareElement hwElem) {
        val allProperties = hwElem.properties.filter[!(it instanceof CustomProperty)].toList
        val propertiesList = allProperties.groupBy[class]
        val multipleProperties = propertiesList.filter[className, properties | properties.size > 1]
        for (classname : multipleProperties.keySet) {
            for (property : multipleProperties.get(classname)) {
                val propertyName = classname.name.split('\\.').last.split('Property').head
                val hwLevel = hwElem.class.name.split('\\.').last.split('Impl').head
                val propertyValue = multipleProperties.get(classname).head.stringValue
                warning('''There are multiple definitions of the "«propertyName»" property in «hwLevel» "«hwElem.name»". The value of the first definition ("«propertyValue»") will be used.''', 
                    hwElem, ModelPackage.Literals::HARDWARE_ELEMENT__PROPERTIES, allProperties.indexOf(property)
                )
            }
        }
    }
    
    @Check
    def checkProperties(SoftwareElement swElem) {
        val allProperties = swElem.properties.filter[!(it instanceof CustomProperty)].toList
        val propertiesList = allProperties.groupBy[class]
        val multipleProperties = propertiesList.filter[className, properties | properties.size > 1]
        for (classname : multipleProperties.keySet) {
            for (property : multipleProperties.get(classname)) {
                val propertyName = classname.name.split('\\.').last.split('Property').head
                val hwLevel = swElem.class.name.split('\\.').last.split('Impl').head
                val propertyValue = multipleProperties.get(classname).head.stringValue
                warning('''There are multiple definitions of the "«propertyName»" property in «hwLevel» "«swElem.name»". The value of the first definition ("«propertyValue»") will be used.''', 
                    swElem, ModelPackage.Literals::SOFTWARE_ELEMENT__PROPERTIES, allProperties.indexOf(property)
                )
            }
        }
    }

}
