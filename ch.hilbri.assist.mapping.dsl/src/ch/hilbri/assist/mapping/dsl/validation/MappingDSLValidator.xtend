package ch.hilbri.assist.mapping.dsl.validation

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.IntProperty
import ch.hilbri.assist.model.ModelPackage
import ch.hilbri.assist.model.Property
import ch.hilbri.assist.model.StringProperty
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
    def checkProperties(Compartment compartment) {
        val allProperties = compartment.properties
        val propertiesList = allProperties.groupBy[class]
        val multipleProperties = propertiesList.filter[className, properties|properties.size > 1]
        for (classname : multipleProperties.keySet) {
            for (property : multipleProperties.get(classname)) {
                warning('''There are multiple definitions of this property - using the value of the first definition: «multipleProperties.get(classname).head.value»''', 
                    compartment, ModelPackage.Literals::HARDWARE_ELEMENT__PROPERTIES, allProperties.indexOf(property)
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
