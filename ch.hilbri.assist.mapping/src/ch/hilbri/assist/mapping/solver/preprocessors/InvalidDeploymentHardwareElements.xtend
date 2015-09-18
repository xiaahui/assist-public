package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel

class InvalidDeploymentHardwareElements extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "hardware elements for invalid deployments") }
	
	override execute() {
			
			if (model.invalidDeployments == null)
				return false
				
			if (model.invalidDeployments.filter[it.implicitHardwareElements.length > 0].isNullOrEmpty) return false
			
			for (s : model.invalidDeployments.filter[it.implicitHardwareElements.length > 0]) {
			
				logger.info("    . Processing invalid deployment for interfaces/groups " + s.eqInterfaceOrGroups)
			
				s.hardwareElements.addAll(s.implicitlyDefinedConnectors)			
				
				// We do not need to remove duplicate entries - this will be already done in the constraint
				
				// Check the result
				if (s.hardwareElements.length > 0)
					logger.info('''      Successfully created with «s.hardwareElements.length» hardware elements: «s.hardwareElements».''')
				else 
					logger.info('''      WARNING: invalid deployment specification contains «s.hardwareElements.length» hardware elements. This may be unintended.''')
		}
			
		return true 
	}
	
}