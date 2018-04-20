package ch.hilbri.assist.mapping.dsl.validation

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.FeatureRequirement
import ch.hilbri.assist.model.ModelPackage
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
}
