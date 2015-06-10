package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import ch.hilbri.assist.mapping.ui.wizards.SaveSolutionToSpecificationWizard
import javax.inject.Named
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.core.di.annotations.Optional
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.services.IServiceConstants
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.PlatformUI

class SavePartialSolution {
	

	@CanExecute
	def boolean canExecute(MApplication application, EModelService service) {
		
		val editorPart = PlatformUI.getWorkbench.activeWorkbenchWindow.activePage.activeEditor;
		if (editorPart == null) return false;
		
		if (editorPart instanceof MultiPageEditor) {
			/* Wenn wir keine Lösungen haben, dann darf das nicht erlaubt sein. */
			if (editorPart.detailedResultViewUiModel.results.length == 0) return false;
				
			/* Nur wenn wir auch wirklich die Ergebnisse *sehen*, dann können wir exportieren */
			if (editorPart.activePage == 0) return false;
				
			return true;
		}
		else return false;
	}
	
	@Execute
	def Object execute(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection selection) {
		
		val editor = PlatformUI.getWorkbench.activeWorkbenchWindow.activePage.activeEditor
		if (editor == null) return null
		
		if (editor instanceof MultiPageEditor) {
			/* Wenn wir keine Lösungen haben, dann darf das nicht erlaubt sein. */
			if (editor.detailedResultViewUiModel.results.length == 0) return null
				
			/* Nur wenn wir auch wirklich die Ergebnisse *sehen*, dann können wir exportieren */
			if (editor.activePage == 0) return null

			val input = editor.getEditorInput
			if (input instanceof IFileEditorInput) {
					val inputFile = input as IFileEditorInput
					val detailedResultsViewUiModel = editor.getDetailedResultViewUiModel() 
					val newfilename = inputFile.file.name.substring(0, inputFile.file.name.length - (inputFile.file.fileExtension.length + 1)) + 
								   " - " + 
								   detailedResultsViewUiModel.currentResult.name + 
								   ".mdsl"
					
					val root = ResourcesPlugin.getWorkspace.getRoot
					val folder = root.getFolder(inputFile.file.parent.fullPath)
					val model = detailedResultsViewUiModel.currentResult.model
					
					val solutionWizard = new SaveSolutionToSpecificationWizard(newfilename, detailedResultsViewUiModel.currentResult.mapping, model)
					
					if (selection != null)
						solutionWizard.init(PlatformUI.getWorkbench, selection)
					else {
						val sselection = new StructuredSelection(folder)
						solutionWizard.init(PlatformUI.getWorkbench, sselection)
					}
					val dialogSolutionWizard = new WizardDialog(editor.getSite.getShell, solutionWizard)
					dialogSolutionWizard.open
			}
		}			
		return null
	}
}