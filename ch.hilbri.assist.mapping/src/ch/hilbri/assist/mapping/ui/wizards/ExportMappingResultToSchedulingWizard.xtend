package ch.hilbri.assist.mapping.ui.wizards

import ch.hilbri.assist.mapping.exporter.DeploymentAsSchedulingModel
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.scheduling.dsl.SchedulingDslStandaloneSetup
import java.io.IOException
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard
import org.eclipse.xtext.resource.SaveOptions

class ExportMappingResultToSchedulingWizard extends BasicNewResourceWizard implements INewWizard {

	private ExportMappingResultToSchedulingWizardPage page
	private MappingResult mappingResult
	private ISelection selection

	new(MappingResult r) {
		super()
		setWindowTitle("Export Mapping Results to Scheduling Specification")
		mappingResult = r
		needsProgressMonitor = true
	}

	override init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}

	override addPages() {
		val mappingModelURI = EcoreUtil.getURI(mappingResult.model)
		val projectName 	= mappingModelURI.segment(1)
		val fileName 		= mappingModelURI.trimFileExtension.lastSegment + " - Mapping " + mappingResult.name 
		val systemName 		= mappingResult.model.systemName
		
		page = new ExportMappingResultToSchedulingWizardPage(selection, projectName, fileName, systemName)
		addPage(page)
	}

	override performFinish() {
		/* Retrieve the properties that were set in the wizard */
		val projectName = page.containerName
		val fileName = page.fileName + ".sdsl"
		val systemName = page.systemName

		val op = new IRunnableWithProgress() {
			override run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectName, fileName, systemName, mappingResult, monitor)
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
	def doFinish(String projectName, String fileName, String systemName, MappingResult mappingResult, IProgressMonitor monitor) {
		monitor.beginTask("Exporting mapping solution to scheduling", 3);
		
		monitor.setTaskName("Creating scheduling model")
		val schedulingModel = DeploymentAsSchedulingModel.create(mappingResult)
		schedulingModel.systemName = systemName
		val schedulingModelURI = URI.createPlatformResourceURI("/" + projectName + "/" + "Scheduling" + "/" + fileName, true)
		
		monitor.worked(1)
		
		monitor.setTaskName("Serializing scheduling model to " + fileName)
		val injector = (new SchedulingDslStandaloneSetup()).createInjectorAndDoEMFRegistration()
		val rs = injector.getInstance(ResourceSet)
		val r = rs.createResource(schedulingModelURI)
		r.contents.add(schedulingModel)
		try {
			r.save(SaveOptions.newBuilder.format.options.toOptionsMap)
		}
		catch (IOException e) {
			e.printStackTrace
		}
		monitor.worked(1)

		monitor.setTaskName("Opening exported file")
		getShell().getDisplay().asyncExec(new Runnable() {
			override run() {
				val page = PlatformUI.workbench.activeWorkbenchWindow.activePage
				try {
					val file = ResourcesPlugin.workspace.root.findMember(schedulingModelURI.toPlatformString(true)) as IFile
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
					e.printStackTrace
				}
			}
		})
		monitor.worked(1)
		
	}
}
