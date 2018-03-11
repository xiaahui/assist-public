package ch.hilbri.assist.mapping.ui.multipageeditor

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Task
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.Label
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.swt.graphics.Color
import org.eclipse.zest.core.viewers.EntityConnectionData
import org.eclipse.zest.core.viewers.IEntityStyleProvider

class MappingResultTreeLabelProvider  extends LabelProvider implements IEntityStyleProvider {
	
	override String getText(Object element) {
		if (element instanceof MappingResultTreeNode) {
			val data = element.data
			if (data instanceof AssistModel)	return data.systemName
			if (data instanceof Compartment)	return data.name
			if (data instanceof Box)			return data.name		
			if (data instanceof Board)			return data.name
			if (data instanceof Processor)		return data.name
			if (data instanceof Core)			return data.name
			if (data instanceof Task)			return data.name
			
			throw new RuntimeException("Unexpected data type: " + data.class)
		}
		 if (element instanceof EntityConnectionData) {
            return ""
        }
		throw new RuntimeException("Wrong type: " + element.class)
	}
	
	override fisheyeNode(Object arg0) {
		return false
	}
	
	override Color getForegroundColour(Object arg0) {
		null
	}

	override Color getBackgroundColour(Object arg0) {
		null
	}

	override Color getNodeHighlightColor(Object arg0) {
		null
	}

	override Color getBorderColor(Object arg0) {
		null
	}
	
	override Color getBorderHighlightColor(Object arg0) {
		null
	}
	
	override int getBorderWidth(Object arg0) {
		return 5
	}
	
	override IFigure getTooltip(Object arg0) {
		new Label("Hallo Welt")
	}
	
}