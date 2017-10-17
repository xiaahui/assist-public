package ch.hilbri.assist.mapping.dsl.ui.outline

import ch.hilbri.assist.mapping.model.AssistModel
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.osgi.framework.FrameworkUtil

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class MappingDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
//	def _isLeaf(DissimilarityRelation r) {
//		true
//	}

	def _createChildren(IOutlineNode parentNode, AssistModel model) {
		val bundle = FrameworkUtil.getBundle(MappingDSLOutlineTreeProvider)
		val imgfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outlineview_folder.png"), null));
		val imgsubfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outlineview_category.png"), null));
		
		/* ---------- HARDWARE ------------- */
		val hardwareNode = new VirtualOutlineNode(parentNode, imgfolderDesc , "Hardware", false)
		for (hw : model.compartments)
			createNode(hardwareNode, hw)
		
		/* ---------- APPLICATIONS AND GROUPS --------- */
		val applicationsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Applications", false)
		for (sw : model.applications) createNode(applicationsNode, sw)
		for (al : model.applicationAlternatives) createNode(applicationsNode, al)
		
//		if (!model.applicationGroups.empty) {
//			val appGroupNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Application Groups", false)
//			for (group : model.applicationGroups)createNode(appGroupNode, group)
//		}
		
		/* --------- CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.colocalityRelations.empty) {
			val contraintsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Restrictions", false)

			if (!model.dislocalityRelations.empty) {		
				val dislocalRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Dislocality", false)
				for (r : model.dislocalityRelations) createNode(dislocalRelationNode, r)
			}

//			if (!model.dissimilarityRelations.empty) {		
//				val dissimRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Dissimilarity", false)
//				for (r : model.dissimilarityRelations) createNode(dissimRelationNode, r)
//			}
			
			if (!model.colocalityRelations.empty) {
				val proximityRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Proximity", false)
				for (r : model.colocalityRelations) createNode(proximityRelationNode, r)
			}
			
		}
	}
	
}
