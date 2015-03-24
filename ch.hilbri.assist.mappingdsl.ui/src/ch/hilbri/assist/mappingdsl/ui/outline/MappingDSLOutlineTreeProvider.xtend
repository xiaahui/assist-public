/*
* generated by Xtext
*/
package ch.hilbri.assist.mappingdsl.ui.outline

import ch.hilbri.assist.datamodel.model.AssistModel
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class MappingDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	
	def _createChildren(IOutlineNode parentNode, AssistModel model) {
		
		val bundle = Platform.getBundle("ch.hilbri.assist.mappingdsl.ui");
		val imgfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outlineview_folder_16x16.png"), null));
		val imgsubfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outlineview_subfolder_16x16.png"), null));
		
		/* ---------- COMPARTMENTS ------------- */
		val compartmentsNode = new VirtualOutlineNode(parentNode, imgfolderDesc , "Compartments", false)
		for (compartment : model.compartments)
			createNode(compartmentsNode, compartment)
		
		/* ---------- INTERFACES AND GROUPS --------- */
		val interfaceNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Interfaces", false)
		for (iface : model.eqInterfaces) 
			createNode(interfaceNode, iface)
		
		if (!model.eqInterfaceGroups.empty) {
			val interfaceGroupNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Interface Groups", false)
			for (group : model.eqInterfaceGroups)
				createNode(interfaceGroupNode, group)
		}
		
		/* --------- RESTRICTION CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.colocalityRelations.empty || !model.validDeployments.empty || !model.invalidDeployments.empty) {
			val restrictionsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Restrictions", false)

			if (!model.dislocalityRelations.empty) {		
				val dislocalRelationNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Dislocality", false)
				for (r : model.dislocalityRelations) createNode(dislocalRelationNode, r)
			}
			
			if (!model.colocalityRelations.empty) {		
				val dissimRelationNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Colocality", false)
				for (r : model.colocalityRelations) createNode(dissimRelationNode, r)
			}
			
			if (!model.validDeployments.empty) {		
				val validDeploymentsNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Valid deployments", false)
				for (r : model.validDeployments) createNode(validDeploymentsNode, r)
			}
			
			if (!model.invalidDeployments.empty) {		
				val invalidDeploymentsNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Invalid deployments", false)
				for (r : model.invalidDeployments) createNode(invalidDeploymentsNode, r)
			}
		}
	}
}

