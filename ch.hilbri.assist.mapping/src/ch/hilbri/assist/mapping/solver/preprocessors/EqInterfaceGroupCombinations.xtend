package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
import java.util.ArrayList
import java.util.List

class EqInterfaceGroupCombinations extends AbstractModelPreprocessor {
	
	new (AssistModel model) { super(model, "interface group combinations") }
	
	override execute() {
		/* Combined Interface groups have to be processed after regular groups! */
		if (!model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition].isNullOrEmpty) {
			
			logger.info(" - Creating interface groups which combine other interface groups")
			
			for (g : model.eqInterfaceGroups.filter[it instanceof EqInterfaceGroupWithCombinedDefinition]) {
			
				logger.info("    . Creating combined group " + g.name)
			
				val List<EqInterface> interfaceList = new ArrayList
			
				for (combinedGroup : (g as EqInterfaceGroupWithCombinedDefinition).combinedGroups) {
					interfaceList.addAll(combinedGroup.eqInterfaces)
				}
				
				g.eqInterfaces.addAll(interfaceList.toSet.toList)

				if (g.eqInterfaces.length > 0)
					logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
				else {
					logger.info('''      WARNING: Group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				}
			}
			return true
				
		}
		
		else {
			return false
		}
		
	}
	
	
}