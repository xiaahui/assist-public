package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

/**
 * @author Robert Hilbrich
 *
 */
public class ExportToText {

	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		if (editorPart == null) return false;
//		
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//				
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				
//				/* Wenn wir keine Lösungen haben, dann darf das nicht erlaubt sein. */
//				if (editor.getDetailedResultViewUiModel().getResults().size() == 0) return false;
//				
//				/* Nur wenn wir auch wirklich die Ergebnisse sehen, dann können wir exportieren */
//				if (editor.getActivePage() == 0) return false;
//				
//				return true;
//			}
//		}
		return false;
	}
	
	/**
	 */
	@Execute
	public Object execute(MApplication application, EModelService service, IProgressMonitor monitor) {
		
//		MPart editorPart = Helpers.getActiveEditor(application, service);
//		
//		if (editorPart.getObject() instanceof CompatibilityEditor) {
//			
//			CompatibilityEditor compEditor = (CompatibilityEditor) editorPart.getObject();
//		
//			if (compEditor.getEditor() instanceof MultiPageEditor) {
//			
//				MultiPageEditor editor = (MultiPageEditor) compEditor.getEditor();
//				editor.doSave(monitor);
//			
//				DetailedResultsViewUiModel detailedResultsViewUiModel = editor.getDetailedResultViewUiModel(); 
//				
//				FileDialog dialog = new FileDialog(editor.getSite().getShell(), SWT.SAVE);
//				dialog.setFilterExtensions(new String [] {"*.txt"});
//										
//				String newFileName = dialog.open();
//					
//				if (newFileName == null) return null; 
//					
//					
//				FileOutputStream out;
//				try {
//					out = new FileOutputStream(newFileName);
//					out.write(DeploymentTextReport.generateText(detailedResultsViewUiModel.getCurrentResult()).getBytes());
//					out.close();
//				} 
//				catch (FileNotFoundException e) {		e.printStackTrace();	} 
//				catch (IOException e) 			{		e.printStackTrace();	}
//						
//			}
//		}
		return null;	
	}
}
