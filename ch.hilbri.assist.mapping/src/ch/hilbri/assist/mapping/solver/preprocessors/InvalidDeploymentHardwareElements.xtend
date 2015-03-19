package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Connector

class InvalidDeploymentHardwareElements extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "hardware elements for invalid deployments") }
	
	override execute() {
			for (s : model.invalidDeployments.filter[it.implicitHardwareElements.length > 0]) {
			
				logger.info("    . Processing invalid deployment for interfaces/groups " + s.eqInterfaceOrGroups)
			
				for (definition : s.implicitHardwareElements) {
					var Iterable<Connector> connectorList = model.allConnectors
	
					for (entry : definition.entries) {
						switch (entry.attribute) {
							case COMPARTMENT_NAME:			{ connectorList = connectorList.filter[it.rdc.compartment.name.equals(entry.value)			]}
							case COMPARTMENT_MANUFACTURER:	{ connectorList = connectorList.filter[it.rdc.compartment.manufacturer.equals(entry.value)	]}
							case COMPARTMENT_POWERSUPPLY:	{ connectorList = connectorList.filter[it.rdc.compartment.powerSupply.equals(entry.value)	]}
							case COMPARTMENT_SIDE:			{ connectorList = connectorList.filter[it.rdc.compartment.side.equals(entry.value)			]}
							case COMPARTMENT_ZONE:			{ connectorList = connectorList.filter[it.rdc.compartment.zone.equals(entry.value)			]}
							case RDC_NAME:					{ connectorList = connectorList.filter[it.rdc.name.equals(entry.value)						]}
							case RDC_MANUFACTURER: 			{ connectorList = connectorList.filter[it.rdc.manufacturer.equals(entry.value)				]}
							case RDC_POWERSUPPLY: 			{ connectorList = connectorList.filter[it.rdc.powerSupply.equals(entry.value)				]}
							case RDC_SIDE: 					{ connectorList = connectorList.filter[it.rdc.side.equals(entry.value)						]}
							case RDC_TYPE: 					{ connectorList = connectorList.filter[it.rdc.rdcType.equals(entry.value)					]}
							case RDC_ESS: 					{ connectorList = connectorList.filter[it.rdc.ess.equals(entry.value)						]}
							case CONNECTOR_NAME:			{ connectorList = connectorList.filter[it.name.equals(entry.value)							]}
						}
					}
					s.hardwareElements.addAll(connectorList)
				}
				
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