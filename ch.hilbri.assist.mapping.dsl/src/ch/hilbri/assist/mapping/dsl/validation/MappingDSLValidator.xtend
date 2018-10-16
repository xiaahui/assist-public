package ch.hilbri.assist.mapping.dsl.validation

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.CustomProperty
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.HardwareElement
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.model.SoftwareElement
import org.eclipse.xtext.validation.Check

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
