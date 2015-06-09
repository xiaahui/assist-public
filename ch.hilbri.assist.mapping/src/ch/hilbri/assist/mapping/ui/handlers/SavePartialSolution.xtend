package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.datamodel.model.ModelFactory
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import java.io.ByteArrayInputStream
import java.io.IOException
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.resource.SaveOptions

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
	def Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
		
		val editor = PlatformUI.getWorkbench.activeWorkbenchWindow.activePage.activeEditor
		if (editor == null) return null
		
		if (editor instanceof MultiPageEditor) {
			/* Wenn wir keine Lösungen haben, dann darf das nicht erlaubt sein. */
			if (editor.detailedResultViewUiModel.results.length == 0) return null
				
			/* Nur wenn wir auch wirklich die Ergebnisse *sehen*, dann können wir exportieren */
			if (editor.activePage == 0) return null

			val input = editor.getEditorInput
			if (input instanceof IFileEditorInput) {

					val detailedResultsViewUiModel = editor.getDetailedResultViewUiModel() 
				
					val inputFile = input as IFileEditorInput
					val newfilename = inputFile.file.name.substring(0, inputFile.file.name.length - (inputFile.file.fileExtension.length + 1)) + 
								   " - " + 
								   detailedResultsViewUiModel.currentResult.name + 
								   ".mdsl"
					
					val root = ResourcesPlugin.getWorkspace.getRoot
					val folder = root.getFolder(inputFile.file.parent.fullPath)
					val newFile = folder.getFile(newfilename)
					
					if (newFile.exists) {
						Display.getDefault().asyncExec(new Runnable() {
							override run() {MessageDialog.openError(PlatformUI.workbench.activeWorkbenchWindow.shell, "Error", "The file: '" + newfilename + "' already exists.")}
						})
						return null
					}
					
					newFile.create(new ByteArrayInputStream("".bytes), IResource.NONE, null)

					// We have to update the current model with the valid restrictions; 
					// if we do a copy of the model, then all comments are lost
					// other option: make comments explicit in the grammar - but this is a bit overkill
					// thats why we add some valid restrictions, persist to the disk and take them back afterwards					
					val model = detailedResultsViewUiModel.currentResult.model
					
					val f = ModelFactory.eINSTANCE

					// Update model
					val vd = f.createValidDeployment
					vd.eqInterfaceOrGroups.add(model.eqInterfaceGroups.get(0))
					vd.hardwareElements.add(model.allRDCs.get(0))
										
					model.validDeployments.add(vd)
					
					// Persist updated model
					val resSet = new ResourceSetImpl
					val resource = resSet.createResource(URI.createFileURI(newFile.fullPath.toPortableString))
					resource.contents.clear
					resource.contents.add(model)
					
					try {
						resource.save(SaveOptions.newBuilder.format.options.toOptionsMap)
					} catch (IOException e) {
						e.printStackTrace
					}
					
					// restore old model
					model.validDeployments.remove(vd)
			}
			
			

					
		}			
		return null
	}
}