package ch.hilbri.assist.mappingdsl.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.swt.graphics.Image

class VirtualOutlineNode extends AbstractOutlineNode {
	
	protected new(IOutlineNode parent, Image image, Object text, boolean isLeaf) {
		super(parent, image, text, isLeaf)
	}
	
}