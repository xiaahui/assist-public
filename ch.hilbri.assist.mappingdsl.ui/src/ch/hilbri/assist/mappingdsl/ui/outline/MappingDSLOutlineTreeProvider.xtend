/*
* generated by Xtext
*/
package ch.hilbri.assist.mappingdsl.ui.outline

import ch.hilbri.assist.model.AssistModel
import org.eclipse.core.runtime.Platform
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.ui.internal.util.BundleUtility
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
		val fullPathString = BundleUtility.find(bundle, "icons/outline_view_folder_16x16.png");
		val imgDesc = ImageDescriptor.createFromURL(fullPathString);
		
		val hardwareNode = new VirtualOutlineNode(parentNode, imgDesc , "Hardware", false)
		
		for (hw : model.hardwareContainer)
			createNode(hardwareNode, hw)
			
		val softwareNode = new VirtualOutlineNode(parentNode, imgDesc, "Software", false)
		
		for (sw : model.applications) 
			createNode(softwareNode, sw)
	}
	
}

