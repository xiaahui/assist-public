package ch.hilbri.assist.mapping.ui.wizards

import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard

class ExportMappingResultToSchedulingWizard extends BasicNewResourceWizard implements INewWizard {
	
	private ExportMappingResultToSchedulingWizardPage page
	private ISelection selection
	
	new() {
		super()
		needsProgressMonitor = true
	}
	
	new(IWorkbench workbench, IStructuredSelection selection) {
		super()
		init(workbench, selection)
		setWindowTitle("Export Mapping Results to Scheduling Specification")
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
		true
	}
	
}