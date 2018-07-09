package ch.hilbri.assist.dse.ui.wizards

import ch.hilbri.assist.mapping.dsl.MappingDSLStandaloneSetup
import ch.hilbri.assist.model.AssistModel
import java.io.IOException
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import org.eclipse.xtext.resource.SaveOptions

class GenerateMappingSpecificationWizard extends Wizard {
	AssistModel assistModel
	IProject preselectedProject
	String preselectedFileName
	GenerateMappingSpecificationWizardPage page

	new(AssistModel a, IProject p, String f) {
		setWindowTitle("Generate Mapping Specification")
		assistModel = a
		preselectedProject = p
		preselectedFileName = f
	}

	override void addPages() {
		page = new GenerateMappingSpecificationWizardPage(preselectedProject, preselectedFileName)
		addPage(page)
	}

	override boolean performFinish() {
		val String projectPath = page.getProjectName()
		val String fileName = page.getFileName()

		val op = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectPath, fileName, assistModel, monitor)
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		}

		try {
			container.run(true, false, op)
		} catch (InterruptedException e) {
			return false
		} catch (InvocationTargetException e) {
			MessageDialog.openError(getShell(), "Error", e.targetException.message)
			return false
		}
		return true
	}

	/* Async worker method that is actually doing all the hard stuff */
	def doFinish(String projectName, String fileName, AssistModel assistModel, IProgressMonitor monitor) {
		monitor.beginTask("Creating mapping specification", 3);

		val modelURI = URI.createPlatformResourceURI("/" + projectName + "/" + "Mapping" + "/" + fileName, true)
		monitor.worked(1)

		monitor.setTaskName("Serializing model to " + fileName)
		val injector = (new MappingDSLStandaloneSetup()).createInjectorAndDoEMFRegistration()
		val rs = injector.getInstance(ResourceSet)
		val r = rs.createResource(modelURI)
		r.contents.add(assistModel)
		try {
			r.save(SaveOptions.newBuilder.format.options.toOptionsMap)
		} catch (IOException e) {
			e.printStackTrace
		}
		monitor.worked(1)

		monitor.setTaskName("Opening exported file")
		getShell().getDisplay().asyncExec(new Runnable() {
			override run() {
				val page = PlatformUI.workbench.activeWorkbenchWindow.activePage
				try {
					val file = ResourcesPlugin.workspace.root.findMember(modelURI.toPlatformString(true)) as IFile
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
					e.printStackTrace
				}
			}
		})
		monitor.worked(1)
	}

}
