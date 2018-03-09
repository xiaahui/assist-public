package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import ch.hilbri.assist.mapping.ui.wizards.ExportMappingResultToSchedulingWizard
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.contexts.Active
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.ui.basic.MPart
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor

class ExportToScheduling {
	
	@CanExecute
	def boolean canExecute(@Active MPart part) {
		
		/* Check if we can use the part provided by the @Active annotation */
		if ((part === null) || (!(part.object instanceof CompatibilityEditor))) 					return false
		
		val compEditor = part.object as CompatibilityEditor
		if ((compEditor === null) || (!(compEditor.editor instanceof MultiPageEditor))) 			return false
		
		val multiPageEditor = compEditor.editor as MultiPageEditor
		if ((multiPageEditor.currentMappingResult === null) || (multiPageEditor.activePage != 1)) 	return false
		
		true
	}	
	
	@Execute
	def Object execute(@Active MPart part, IProgressMonitor monitor, Shell shell) {
		val compEditor = part.object as CompatibilityEditor
		val multiPageEditor = compEditor.editor as MultiPageEditor
		val result = multiPageEditor.currentMappingResult

		val dialog = new WizardDialog(shell, new ExportMappingResultToSchedulingWizard(result))
		dialog.open
	}
	
	
	
}