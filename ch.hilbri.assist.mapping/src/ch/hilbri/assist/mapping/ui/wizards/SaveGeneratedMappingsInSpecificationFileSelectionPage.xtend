package ch.hilbri.assist.mapping.ui.wizards

import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.dialogs.WizardNewFileCreationPage

class SaveGeneratedMappingsInSpecificationFileSelectionPage extends WizardNewFileCreationPage {
	
	new(IStructuredSelection selection, String suggestedFilename) {
		super("NewFileSelectionPage", selection)
		title = "Mapping Specification"
		description = "Please provide file name for the duplicated specification and selected mappings"
		fileName = suggestedFilename
		fileExtension = "mdsl"
		allowExistingResources = false
	}
	
	override void createControl(Composite parent) {
		super.createControl(parent)
		validatePage
	}
	
	override boolean isPageComplete() {
		return !this.fileName.nullOrEmpty && validatePage
	}
	
	
}