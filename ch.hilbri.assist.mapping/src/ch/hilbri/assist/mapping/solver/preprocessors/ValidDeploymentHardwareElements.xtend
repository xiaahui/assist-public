package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel

class ValidDeploymentHardwareElements extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "hardware elements for valid deployments") }
	
	override execute() {
		
		if (model.validDeployments.filter[it.implicitHardwareElements.length > 0].isNullOrEmpty) return false
		
		for (s : model.validDeployments.filter[it.implicitHardwareElements.length > 0]) {
				logger.info("    . Processing valid deployment for interfaces/groups: [" + s.allEqInterfaceOrGroupNames + "]")
				
				s.hardwareElements.addAll(s.implicitlyDefinedConnectors)			
				
				// We do not need to remove duplicate entries - this will be already done in the constraint
				
				// Check the result
				if (s.hardwareElements.length > 0)
					logger.info('''      Successfully created with «s.hardwareElements.length» hardware elements: «s.hardwareElements».''')
				else 
					logger.info('''      WARNING: valid deployment specification contains «s.hardwareElements.length» hardware elements. This may be unintended.''')
				
		}
			
		return true 
	}
}