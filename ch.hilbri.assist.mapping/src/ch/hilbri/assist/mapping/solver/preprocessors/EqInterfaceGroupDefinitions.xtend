package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition

class EqInterfaceGroupDefinitions extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "interface group definitions") }
	
	override execute() {
		for (g : model.eqInterfaceGroups.filter[!(it instanceof EqInterfaceGroupWithCombinedDefinition)]) {
				
				logger.info("    . Processing group " + g.name)
				
				// We have to explode all implicit group definitions
				for (implicitDefinitionElement : g.implicitGroupDefinitions) {
					var Iterable<EqInterface> interfaceList = model.eqInterfaces	
				
					// Go through all entries (they are concatenated by AND)
					for (entry : implicitDefinitionElement.entries) {
						switch (entry.attribute) {
						case NAME:			{ interfaceList = interfaceList.filter[it.name.equals(entry.value)			]}
						case SYSTEM: 		{ interfaceList = interfaceList.filter[it.system.equals(entry.value)		]}
						case SUBATA: 		{ interfaceList = interfaceList.filter[it.subAta.equals(entry.value)		]}
						case RESOURCE: 		{ interfaceList = interfaceList.filter[it.resource.equals(entry.value)		]}
						case LINENAME: 		{ interfaceList = interfaceList.filter[it.lineName.equals(entry.value)		]}
						case WIRINGLANE:	{ interfaceList = interfaceList.filter[it.wiringLane.equals(entry.value)	]}
						case GRPINFO: 		{ interfaceList = interfaceList.filter[it.grpInfo.equals(entry.value)		]}
						case ROUTE: 		{ interfaceList = interfaceList.filter[it.route.equals(entry.value)			]}
						case PWSUP1: 		{ interfaceList = interfaceList.filter[it.pwSup1.equals(entry.value)		]}
						case EMHZONE1: 		{ interfaceList = interfaceList.filter[it.emhZone1.equals(entry.value)		]}
						case IOTYPE: 		{ interfaceList = interfaceList.filter[it.ioType.equals(entry.value)		]}
					}
					
					// Add the remaining interfaces to the interface list of this group
					g.eqInterfaces.addAll(interfaceList)			
				}
			}
			
			if (g.eqInterfaces.length > 0)
				logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
			else 
				logger.info('''      [WARNING] Implicitly defined group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				
		} // for loop over all group
			
		return true		
	}
}