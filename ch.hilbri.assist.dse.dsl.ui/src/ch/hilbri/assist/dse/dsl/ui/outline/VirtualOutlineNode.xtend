package ch.hilbri.assist.dse.dsl.ui.outline

import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode

class VirtualOutlineNode extends AbstractOutlineNode {
	
	protected new(IOutlineNode parent, ImageDescriptor imgDesc, Object text, boolean isLeaf) {
		super(parent, imgDesc, text, isLeaf)
	}
	
}
