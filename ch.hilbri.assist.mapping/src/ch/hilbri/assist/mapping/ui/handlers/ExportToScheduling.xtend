package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.model.application.ui.basic.MPart
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor

class ExportToScheduling {
	
	@CanExecute
	def boolean canExecute(MApplication application, EModelService service) {
		val part = service.find("org.eclipse.e4.ui.compatibility.editor", application) as MPart
		if (part === null) return false
		
		val compEditor = part.object as CompatibilityEditor
		if (compEditor === null) return false
		
		if (!(compEditor.editor instanceof MultiPageEditor)) return false
		
		val multiPageEditor = compEditor.editor as MultiPageEditor
		if (multiPageEditor.currentMappingResult === null) return false
		
		if (multiPageEditor.activePage > 0) return false
		
		true
	}
	
	@Execute
	def Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
	}
	
}