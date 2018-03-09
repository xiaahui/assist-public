package ch.hilbri.assist.mapping.ui.multipageeditor

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Task
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.zest.core.viewers.EntityConnectionData

class MappingResultTreeLabelProvider  extends LabelProvider {
	
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
}