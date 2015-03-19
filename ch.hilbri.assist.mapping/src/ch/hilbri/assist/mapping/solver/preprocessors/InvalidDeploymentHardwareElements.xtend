package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.InvalidDeploymentImplicit
import ch.hilbri.assist.datamodel.model.RDC

class InvalidDeploymentHardwareElements extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "hardware elements for invalid deployments") }
	
	override execute() {
		if (!model.invalidDeployments.filter[it instanceof InvalidDeploymentImplicit].isNullOrEmpty) {
			for (s : model.invalidDeployments.filter[it instanceof InvalidDeploymentImplicit]) {
				logger.info("    . Creating implicitly defined RDC group for interfaces/groups " + s.eqInterfaceOrGroups)
				var Iterable<RDC> rdcList = model.allRDCs
				for (definition : (s as InvalidDeploymentImplicit).definitions) {
					switch (definition.attribute) {
						case RDC_NAME:			{ rdcList = rdcList.filter[name.equals(definition.value)			]}
						case RDC_MANUFACTURER: 	{ rdcList = rdcList.filter[manufacturer.equals(definition.value)	]}
						case RDC_POWERSUPPLY: 	{ rdcList = rdcList.filter[powerSupply.equals(definition.value)		]}
						case RDC_SIDE: 			{ rdcList = rdcList.filter[side.equals(definition.value)			]}
						case RDC_TYPE: 			{ rdcList = rdcList.filter[rdcType.equals(definition.value)			]}
						case RDC_ESS: 			{ rdcList = rdcList.filter[ess.equals(definition.value)				]}
					}
				}
				s.hardwareElements.addAll(rdcList)
				if (s.hardwareElements.length > 0)
					logger.info('''      Successfully created with «s.hardwareElements.length» RDCs: «s.hardwareElements».''')
				else {
					logger.info('''      WARNING: Implicitly defined deployment contains «s.hardwareElements.length» RDCs. This may be unintended.''')
				}
			}
			return true
		}
		else {
			return false
		}
	}
	
}