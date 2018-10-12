package ch.hilbri.assist.dse.dsl.ui.outline

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.RestrictionAlternative
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.osgi.framework.FrameworkUtil
import ch.hilbri.assist.model.Task

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class DSEDslOutlineTreeProvider extends DefaultOutlineTreeProvider {

	val bundle = FrameworkUtil.getBundle(class)
	val imgfolderDesc = ImageDescriptor.createFromURL(
		FileLocator.find(bundle, new Path("icons/outlineview_folder.png"), null));
	val imgsubfolderDesc = ImageDescriptor.createFromURL(
		FileLocator.find(bundle, new Path("icons/outlineview_category.png"), null));
    val imgAlternativesDesc = ImageDescriptor.createFromURL(
        FileLocator.find(bundle, new Path("icons/outlineview_alternatives.png"), null));

	def _createChildren(IOutlineNode parentNode, AssistModel model) {

		/* ---------- HARDWARE ------------- */
		val hardwareNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Hardware", false)
		for (hw : model.compartments)
			createNode(hardwareNode, hw)

		/* ---------- APPLICATIONS AND GROUPS --------- */
		val applicationsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Applications", false)
		for (sw : model.applications)
			createNode(applicationsNode, sw)
		if (!model.applicationAlternatives.empty) {
		    val applicationAlternatives = new VirtualOutlineNode(applicationsNode, imgAlternativesDesc, "Alternatives", false)
    		for (a : model.applicationAlternatives)
            createNode(applicationAlternatives, a)
		}
		
		/* --------- CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.colocalityRelations.empty || !model.dissimilarityRelations.empty || !model.restrictionAlternatives.empty) {
			val restrictionsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Restrictions", false)

			if (!model.dislocalityRelations.empty) {
				val dislocalRelationNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Dislocality",
					false)
				for (r : model.dislocalityRelations)
					createNode(dislocalRelationNode, r)
			}

			if (!model.colocalityRelations.empty) {
				val proximityRelationNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc, "Proximity",
					false)
				for (r : model.colocalityRelations)
					createNode(proximityRelationNode, r)
			}

			if (!model.dissimilarityRelations.empty) {
				val dissimilarityRelationNode = new VirtualOutlineNode(restrictionsNode, imgsubfolderDesc,
					"Dissimilarity", false)
				for (r : model.dissimilarityRelations)
					createNode(dissimilarityRelationNode, r)
			}

			if (!model.restrictionAlternatives.empty) {
		         val restrictionAlternativesNode = new VirtualOutlineNode(restrictionsNode, imgAlternativesDesc, "Alternatives", false)
			     for (a : model.restrictionAlternatives)
					createNode(restrictionAlternativesNode, a)
			}
		}

		/* ------- CANDIDATES -------------- */
		if (!model.explorationCandidates.empty) {
			val candidatesNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Exploration Candidates", false)
			for (c : model.explorationCandidates)
				createNode(candidatesNode, c)
		}
	}

    /* Hardware */	
	def _createChildren(IOutlineNode parentNode, Compartment compartment) {
        for (box : compartment.allBoxes) createNode(parentNode, box)
	}
	
	def _createChildren(IOutlineNode parentNode, Box box) {
	    for (board : box.allBoards) createNode(parentNode, board)
	    
	    if (!box.boardAlternatives.empty) {
	        val boardAlternativesNode = new VirtualOutlineNode(parentNode, imgAlternativesDesc, "Alternatives", false)
	        for (a : box.boardAlternatives)
	           createNode(boardAlternativesNode, a)
	    }
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
        for (swElem : application.tasks) createNode(parentNode, swElem)
    }
    
    def _isLeaf(Task task) { true }
    
    
    /* Restriction Alternatives */
	def _createChildren(IOutlineNode parentNode, RestrictionAlternative alternative) {
		if (!alternative.dislocalityRelations.empty) {
			val dislocalRelationNode = new VirtualOutlineNode(parentNode, imgsubfolderDesc, "Dislocality", false)
			for (r : alternative.dislocalityRelations)
				createNode(dislocalRelationNode, r)
		}

		if (!alternative.colocalityRelations.empty) {
			val proximityRelationNode = new VirtualOutlineNode(parentNode, imgsubfolderDesc, "Proximity", false)
			for (r : alternative.colocalityRelations)
				createNode(proximityRelationNode, r)
		}
		
		if (!alternative.dissimilarityRelations.empty) {
            val dissimilarityRelationNode = new VirtualOutlineNode(parentNode, imgsubfolderDesc, "Dissimilarity", false)
            for (r : alternative.dissimilarityRelations)
                createNode(dissimilarityRelationNode, r)
        }
	}

}
