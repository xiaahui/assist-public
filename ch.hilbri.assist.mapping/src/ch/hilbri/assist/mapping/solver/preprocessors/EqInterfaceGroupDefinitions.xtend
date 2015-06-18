package ch.hilbri.assist.mapping.solver.preprocessors

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.EqInterfaceGroupWithCombinedDefinition
import java.util.ArrayList
import java.util.List

class EqInterfaceGroupDefinitions extends AbstractModelPreprocessor {
	
	new(AssistModel model) { 
		super(model, "interface group definitions")
	}
	
	override execute() {
		
		if (model.eqInterfaceGroups.filter[!implicitMemberDefinitions.nullOrEmpty || !withoutImplicitMemberDefinitions.nullOrEmpty || !withoutEqInterfaces.nullOrEmpty]
								   .filter[!(it instanceof EqInterfaceGroupWithCombinedDefinition)]
								   .isNullOrEmpty
		) return false
		
		for (g : model.eqInterfaceGroups.filter[!implicitMemberDefinitions.nullOrEmpty || !withoutImplicitMemberDefinitions.nullOrEmpty || !withoutEqInterfaces.nullOrEmpty ]
			                			.filter[!(it instanceof EqInterfaceGroupWithCombinedDefinition)]) 
		{
			logger.info("    . Processing group " + g.name)

			// Get the EqInterfaces which are implicitly defined and 
			// add them if they are not already in that list
			val List<EqInterface> helperList = new ArrayList
			helperList.addAll(g.eqInterfaces) 					// save what is already in there
			helperList.addAll(g.implicitlyDefinedEqInterfaces)	// what is implicitly defined?	

			g.eqInterfaces.clear
			g.eqInterfaces.addAll(helperList.toSet.toList)		// store only unique elements
		
			// Removing elements - if requested
			g.eqInterfaces.removeAll(g.withoutEqInterfaces)			
			g.eqInterfaces.removeAll(g.withoutImplicitlyDefinedEqInterfaces)
		
			// Check the interfaces - groups should not be empty
			if (g.eqInterfaces.length > 0)
				logger.info('''      Successfully created with «g.eqInterfaces.length» interfaces: «g.eqInterfaces».''')
			else 
				logger.info('''      [WARNING] Implicitly defined group "«g.name»" contains «g.eqInterfaces.length» interfaces. This may be unintended.''')
				
		} // for loop over all group
			
		return true		
	}
}