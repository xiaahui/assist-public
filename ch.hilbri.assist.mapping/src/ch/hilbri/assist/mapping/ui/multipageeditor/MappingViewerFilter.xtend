package ch.hilbri.assist.mapping.ui.multipageeditor

import ch.hilbri.assist.model.SingleMappingElement
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter

class MappingViewerFilter extends ViewerFilter {

	String filterString

	def void setFilterText(String s) {
		filterString = ".*" + s + ".*"
	}

	override select(Viewer viewer, Object parentElement, Object element) {

		if (filterString.isNullOrEmpty) return true

		else if (element instanceof SingleMappingElement) {
				if (element.application.getName.matches(filterString) 	||
					element.task.getName.matches(filterString) 		||
					element.core.name.matches(filterString) 		||
					element.processor.name.matches(filterString)	||
					element.board.name.matches(filterString)		||
					element.box.name.matches(filterString)			||
					element.compartment.name.matches(filterString))
				return true
		}
		
		return false
	}
}
