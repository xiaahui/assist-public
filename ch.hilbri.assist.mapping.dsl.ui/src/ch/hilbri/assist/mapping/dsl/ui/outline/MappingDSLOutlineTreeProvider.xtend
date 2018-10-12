package ch.hilbri.assist.mapping.dsl.ui.outline

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Task
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.osgi.framework.FrameworkUtil

class MappingDSLOutlineTreeProvider extends DefaultOutlineTreeProvider {

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
		
		
		/* --------- CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.colocalityRelations.empty) {
			val contraintsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Restrictions", false)

			if (!model.dislocalityRelations.empty) {		
				val dislocalRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Dislocality", false)
				for (r : model.dislocalityRelations) createNode(dislocalRelationNode, r)
			}

			if (!model.dissimilarityRelations.empty) {		
				val dissimRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Dissimilarity", false)
				for (r : model.dissimilarityRelations) createNode(dissimRelationNode, r)
			}
			
			if (!model.colocalityRelations.empty) {
				val proximityRelationNode = new VirtualOutlineNode(contraintsNode, imgsubfolderDesc, "Proximity", false)
				for (r : model.colocalityRelations) createNode(proximityRelationNode, r)
			}
		}
	}

     /* Hardware */ 
    def _createChildren(IOutlineNode parentNode, Compartment compartment) {
        for (box : compartment.allBoxes) createNode(parentNode, box)
    }
    
    def _createChildren(IOutlineNode parentNode, Box box) {
        for (board : box.allBoards) createNode(parentNode, board)
    }

    def _createChildren(IOutlineNode parentNode, Board board) {
        for (processor : board.allProcessors) createNode(parentNode, processor)
    }   
    
    def _createChildren(IOutlineNode parentNode, Processor processor) {
        for (core : processor.allCores) createNode(parentNode, core)
    }
    
    def _isLeaf(Core core) { true }

    /* Software */
    def _createChildren(IOutlineNode parentNode, Application application) {
        for (task : application.tasks) createNode(parentNode, task)
    }
    
    def _isLeaf(Task task) { true }
}
