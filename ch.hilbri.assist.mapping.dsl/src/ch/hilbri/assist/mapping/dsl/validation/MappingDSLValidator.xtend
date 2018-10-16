package ch.hilbri.assist.mapping.dsl.validation

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.IntProperty
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.model.Property
import ch.hilbri.assist.model.StringProperty
import org.eclipse.xtext.validation.Check
import ch.hilbri.assist.model.HardwareElement

class MappingDSLValidator extends AbstractMappingDSLValidator {

    @Check
    def checkFeatureRequirements(FeatureRequirement featureReq) {
        val assistModel = featureReq.eContainer.eContainer.eContainer as AssistModel
        val hardwareElements = assistModel.getAllHardwareElements(featureReq.hardwareLevel.value)
        val allowedElements = hardwareElements.filter [
            !features.filter[it.isShared == featureReq.isShared && it.name == featureReq.name].nullOrEmpty
        ]
        if (allowedElements.isNullOrEmpty) {
            warning('''There are no suitable features with the name «featureReq.name» on the «featureReq.hardwareLevel»-level available.''',
                featureReq, ModelPackage.Literals::FEATURE_REQUIREMENT__NAME)
        }
    }

    @Check
    def checkProperties(HardwareElement hwElem) {
        val allProperties = hwElem.properties
        val propertiesList = allProperties.groupBy[class]
        val multipleProperties = propertiesList.filter[className, properties | properties.size > 1]
        for (classname : multipleProperties.keySet) {
            for (property : multipleProperties.get(classname)) {
                val propertyName = classname.name.split('\\.').last.split('Property').head
                val hwLevel = hwElem.class.name.split('\\.').last.split('Impl').head
                val propertyValue = multipleProperties.get(classname).head.value
                warning('''There are multiple definitions of the "«propertyName»" property in «hwLevel» "«hwElem.name»". The value of the first definition ("«propertyValue»") will be used.''', 
                    hwElem, ModelPackage.Literals::HARDWARE_ELEMENT__PROPERTIES, allProperties.indexOf(property)
                )
            }
        }
    }
    
    private def String getValue(Property property) {
        if (property instanceof StringProperty) 
            return (property as StringProperty).value
        if (property instanceof IntProperty)
            return (property as IntProperty).value.toString
    }

}
