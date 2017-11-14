package ch.hilbri.assist.dse.dsl.ui.outline

import ch.hilbri.assist.dse.model.AssistModelDSE
import ch.hilbri.assist.dse.model.RestrictionAlternative
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.osgi.framework.FrameworkUtil

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

	def _createChildren(IOutlineNode parentNode, AssistModelDSE model) {

		/* ---------- HARDWARE ------------- */
		val hardwareNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Hardware", false)
		for (hw : model.compartments)
			createNode(hardwareNode, hw)

		/* ---------- APPLICATIONS AND GROUPS --------- */
		val applicationsNode = new VirtualOutlineNode(parentNode, imgfolderDesc, "Applications", false)
		for (sw : model.applications)
			createNode(applicationsNode, sw)
		for (a : model.applicationAlternatives)
			createNode(applicationsNode, a)

		/* --------- CONSTRAINTS -------------- */
		if (!model.dislocalityRelations.empty || !model.colocalityRelations.empty) {
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

			if (!model.restrictionAlternatives.empty) {
				for (a : model.restrictionAlternatives)
					createNode(restrictionsNode, a)
			}

		}
	}

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
	}

}
