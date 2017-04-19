package ch.hilbri.assist.mapping.dsl.ui.outline

import ch.hilbri.assist.mapping.model.AssistModel
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Platform
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class MappingDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _createChildren(IOutlineNode parentNode, AssistModel model) {
		
		val bundle = Platform.getBundle("ch.hilbri.assist.mappingdsl.ui");
		val imgfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outline_view_folder_16x16.png"), null));
		val imgsubfolderDesc = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path("icons/outline_view_subfolder_16x16.png"), null));
		
		/* ---------- HARDWARE ------------- */
		val hardwareNode = new VirtualOutlineNode(parentNode, imgfolderDesc , "Hardware", false)
		for (hw : model.hardwareContainer)
			createNode(hardwareNode, hw)
		
		/* ---------- APPLICATIONS AND GROUPS --------- */
		val applicationsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Applications", false)
		for (sw : model.applications) createNode(applicationsNode, sw)
		
		if (!model.applicationGroups.empty) {
			val appGroupNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Application Groups", false)
			for (group : model.applicationGroups)createNode(appGroupNode, group)
		}
		
		/* --------- SAFETY CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.dissimilarityRelations.empty) {
			val safetyRelationNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Safety", false)

			if (!model.dislocalityRelations.empty) {		
				val dislocalRelationNode = new VirtualOutlineNode(safetyRelationNode, imgsubfolderDesc, "Dislocality Constraints", false)
				for (r : model.dislocalityRelations) createNode(dislocalRelationNode, r)
			}

			if (!model.dissimilarityRelations.empty) {		
				val dissimRelationNode = new VirtualOutlineNode(safetyRelationNode, imgsubfolderDesc, "Dissimilarity Constraints", false)
				for (r : model.dissimilarityRelations) createNode(dissimRelationNode, r)
			}
		}
		
		/* --------- NETWORKING ---------------------- */
		if (!model.networks.empty || !model.communicationRelations.empty) {
			val networkNode = new VirtualOutlineNode(parentNode, imgfolderDesc , "Networks and Communication", false)

			if (!model.networks.empty) {
				val physNetworksNode = new VirtualOutlineNode(networkNode, imgsubfolderDesc, "Physical Networks", false)
				for (n : model.networks) createNode(physNetworksNode, n)
			}

			if (!model.communicationRelations.empty) {
				val commRelationNode = new VirtualOutlineNode(networkNode, imgsubfolderDesc, "Logical Communication", false)
				for (r : model.communicationRelations) createNode(commRelationNode, r)
			}
		}

		/* ---------- PROXIMITY REQUIREMENTS --------- */
		if (!model.proximityRelations.empty) {
			val proximityRelationNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Proximity", false)
			for (r : model.proximityRelations) createNode(proximityRelationNode, r)
		}
		
		
		
		
	}
	
}