package ch.hilbri.assist.mapping.ui.multipageeditor

import org.eclipse.zest.core.viewers.IGraphEntityContentProvider
import org.eclipse.jface.viewers.ArrayContentProvider

class MappingResultTreeContentProvider extends ArrayContentProvider implements IGraphEntityContentProvider {
	
	override getConnectedTo(Object entity) {
		if (entity instanceof MappingResultTreeNode) {
			return entity.children
		}
		else
			throw new RuntimeException("Type unknown / not supported")
	}
}