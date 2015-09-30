package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.exporters.excel.ExcelOutputTransformator
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.MApplication
import org.eclipse.e4.ui.workbench.modeling.EModelService
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.ui.PlatformUI

class ExportToExcel {
	
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
			
			val detailedResultsViewUiModel = editor.getDetailedResultViewUiModel() 

			val dialog = new FileDialog(editor.getSite().getShell(), SWT.SAVE)
			dialog.setFilterExtensions(#["*.xlsx"])
			
			val filePath = dialog.open()
			if (filePath == null) return null
			
			val outputfile = ExcelOutputTransformator.createExcelOutput(filePath, detailedResultsViewUiModel.currentResult)	
			
			if (outputfile != null) {
				Display.getDefault().asyncExec(new Runnable() {
					override run() {MessageDialog.openInformation(PlatformUI.workbench.activeWorkbenchWindow.shell, "Export successful", "The current solution was successfully exported to the Excel file: '" + outputfile + "'.")}
				});
			}
					
		}			
		return null
	}
		
}