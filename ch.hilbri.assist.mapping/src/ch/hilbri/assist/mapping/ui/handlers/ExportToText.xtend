package ch.hilbri.assist.mapping.ui.handlers

import ch.hilbri.assist.mapping.export.DeploymentAsText
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor
import java.io.FileNotFoundException
import java.io.FileOutputStream
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.e4.core.contexts.Active
import org.eclipse.e4.core.di.annotations.CanExecute
import org.eclipse.e4.core.di.annotations.Execute
import org.eclipse.e4.ui.model.application.ui.basic.MPart
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor
import org.eclipse.jface.dialogs.MessageDialog

/** 
 * @author Robert Hilbrich
 */
class ExportToText {

    @CanExecute
    def boolean canExecute(@Active MPart part) {

        /* Check if we can use the part provided by the @Active annotation */
        if((part === null) || (!(part.object instanceof CompatibilityEditor))) return false

        val compEditor = part.object as CompatibilityEditor
        if((compEditor === null) || (!(compEditor.editor instanceof MultiPageEditor))) return false

        /* It should have a current mapping result and we should see it (activePage) */
        val multiPageEditor = compEditor.editor as MultiPageEditor
        if((multiPageEditor.currentMappingResult === null) || (multiPageEditor.activePage != 1)) return false

        true
    }

    @Execute
    def execute(@Active MPart part, IProgressMonitor monitor, Shell shell) {
        val compEditor = part.object as CompatibilityEditor
        val multiPageEditor = compEditor.editor as MultiPageEditor
        val result = multiPageEditor.currentMappingResult

        val dialog = new FileDialog(shell, SWT.SAVE)
        dialog.setFilterExtensions(#["*.txt", "*.csv"]);
        val fileName = dialog.open();

        if(fileName === null) return null;

        val out = new FileOutputStream(fileName)
        try {
            out.write(DeploymentAsText.generate(result).getBytes());
            out.close();
            MessageDialog.openInformation(shell,
                "Export successful", 
                '''The result with the name '«result.name»' was successfully exported to file '«fileName»'.''')
        } catch (FileNotFoundException e) {
            e.printStackTrace
        }
    }
}
