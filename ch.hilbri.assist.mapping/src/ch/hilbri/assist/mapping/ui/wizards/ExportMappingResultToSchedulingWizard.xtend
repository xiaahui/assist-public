package ch.hilbri.assist.mapping.ui.wizards

import ch.hilbri.assist.mapping.result.FactorySchedulingModelFromMappingSolution
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.scheduling.dsl.SchedulingDslStandaloneSetup
import java.io.IOException
import java.lang.reflect.InvocationTargetException
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
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
		page = new ExportMappingResultToSchedulingWizardPage(selection)
		addPage(page)
	}

	override performFinish() {
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
		monitor.beginTask("Exporting mapping solution to scheduling", 2);
		
		monitor.setTaskName("Creating scheduling model")
		val schedulingModel = FactorySchedulingModelFromMappingSolution.createAssistModel(mappingResult)
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
	}
}
