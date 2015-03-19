package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithImplicitDefinition

class EqInterfaceGroupDefinitions extends AbstractModelPreprocessor {
	
	new(AssistModel model) { super(model, "interface group definitions") }
	
	override execute() {
		if (!model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithImplicitDefinition].isNullOrEmpty) {
			for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithImplicitDefinition]) {
				logger.info("    . Creating implicitly defined group " + g.name)
				var Iterable<EqInterface> interfaceList = model.eqInterfaces	
				for (definition : (g as EqInterfaceGroupWithImplicitDefinition).definitions) {
						switch (definition.attribute) {
						case NAME:			{ interfaceList = interfaceList.filter[it.name.equals(definition.value)			]}
						case SYSTEM: 		{ interfaceList = interfaceList.filter[it.system.equals(definition.value)		]}
						case SUBATA: 		{ interfaceList = interfaceList.filter[it.subAta.equals(definition.value)		]}
						case RESOURCE: 		{ interfaceList = interfaceList.filter[it.resource.equals(definition.value)		]}
						case LINENAME: 		{ interfaceList = interfaceList.filter[it.lineName.equals(definition.value)		]}
						case WIRINGLANE:	{ interfaceList = interfaceList.filter[it.wiringLane.equals(definition.value)	]}
						case GRPINFO: 		{ interfaceList = interfaceList.filter[it.grpInfo.equals(definition.value)		]}
						case ROUTE: 		{ interfaceList = interfaceList.filter[it.route.equals(definition.value)		]}
						case PWSUP1: 		{ interfaceList = interfaceList.filter[it.pwSup1.equals(definition.value)		]}
						case EMHZONE1: 		{ interfaceList = interfaceList.filter[it.emhZone1.equals(definition.value)		]}
						case IOTYPE: 		{ interfaceList = interfaceList.filter[it.ioType.equals(definition.value)		]}
					}
				}
				g.eqInterfaces.addAll(interfaceList)
				if (g.eqInterfaces.length > 0)
					logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
				else {
					logger.info('''      WARNING: Implicitly defined group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				}
			}
			return true
		}
		else {
			return false
		}
	}
	
}