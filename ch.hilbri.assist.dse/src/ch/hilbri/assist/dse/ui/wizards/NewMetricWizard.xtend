package ch.hilbri.assist.dse.ui.wizards

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.PartInitException
import org.eclipse.ui.ide.IDE

class NewMetricWizard extends Wizard implements INewWizard {
	IWorkbench workbench
	IStructuredSelection selection
	NewMetricWizardPage pageOne

	override void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench
		this.selection = selection
		this.pageOne = new NewMetricWizardPage()
		this.pageOne.init(selection)
		this.pageOne.setDescription("Create a custom metric")
		this.pageOne.setTitle("Metric")
		this.addPage(pageOne)
		setNeedsProgressMonitor(true)
		setWindowTitle("New Custom Metric")
	}

	override boolean performFinish() {
		
		/* Create the new file */
		val IResource resource = pageOne.getModifiedResource()
		if (resource instanceof IFile) {
			val IFile file = (resource as IFile)
			var InputStream stream = openContentStream()
			try {
				/* Fill the file with some default content */
				if (file.exists()) {
					file.setContents(stream, true, true, null)
				} else {
					file.create(stream, true, null)
				}
				stream.close()
			} catch (IOException e) {
				e.printStackTrace()
			} catch (CoreException e) {
				e.printStackTrace()
			}

			/* Open the newly created file */
			val IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage()
			if (activePage !== null) {
				val Display display = getShell().getDisplay()
				if (display !== null) {
					display.asyncExec([
						try {
							IDE.openEditor(activePage, file, true)
						} catch (PartInitException e) {
							e.printStackTrace()
						}
					])
				}
			}
		}
		return true
	}

	def private InputStream openContentStream() {
		val fileName = pageOne.getTypeName
		val contents = '''
package «pageOne.getPackageText»;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.model.impl.AbstractDSEMetricImpl;

public class «fileName» extends AbstractDSEMetricImpl { 
	public «fileName»() {
		setName("Metric Name");
		setHigherScoreIsBetter(true);
	}
 
	@Override
	public double computeAbsoluteScore(AssistModel candidateModel) {
 
		double score = 0;
 
		return score;
	}
}'''
		return new ByteArrayInputStream(contents.getBytes())
	}

	/*
	 * Returns the selection which was passed to <code>init</code>.
	 * 
	 * @return the selection
	 */
	def IStructuredSelection getSelection() {
		return selection
	}

	/** 
	 * Returns the workbench which was passed to <code>init</code>.
	 * @return the workbench
	 */
	def IWorkbench getWorkbench() {
		return workbench
	}
}
