package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.result.mapping.Result
import org.eclipse.core.runtime.FileLocator
import org.eclipse.core.runtime.Path
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.jface.viewers.BaseLabelProvider
import org.eclipse.jface.viewers.ILabelProvider
import org.eclipse.swt.graphics.Image
import org.osgi.framework.FrameworkUtil

class InterfaceLabelProvider extends BaseLabelProvider implements ILabelProvider {
	
	Image image
	Result result

	new(Result result) {
		val bundle = FrameworkUtil.getBundle(InterfaceLabelProvider)
    	val url = FileLocator.find(bundle, new Path("icons/treeview/treeview_interface_16x16.png"), null)
     	val imageDcr = ImageDescriptor.createFromURL(url)
    	this.image = imageDcr.createImage()
    	this.result = result
	}

	override getText(Object element) {
		val iface = (element as EqInterface)
		val conn = result.mapping.get(iface)
		
		return '''«iface.name» -> «conn.rdc.compartment».«conn.rdc».«conn» «IF (!iface.system.empty) || (!iface.ioType.empty)»(«IF !iface.system.empty»System = «iface.system», «ENDIF»«IF !iface.ioType.empty»Type = «iface.ioType»)«ENDIF»«ENDIF»'''
	}

	override getImage(Object element) {	image }
}
