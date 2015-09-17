package ch.hilbri.assist.mapping.ui.wizards

import ch.hilbri.assist.datamodel.model.AssistModel
import ch.hilbri.assist.datamodel.model.Connector
import ch.hilbri.assist.datamodel.model.EqInterface
import ch.hilbri.assist.datamodel.model.ModelFactory
import ch.hilbri.assist.datamodel.model.Pin
import ch.hilbri.assist.datamodel.model.ValidDeployment
import java.io.IOException
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ide.IDE
import org.eclipse.xtext.resource.SaveOptions

class SaveGeneratedMappingsInSpecificationWizard extends Wizard implements INewWizard  {

    private IStructuredSelection selection
    
    private SaveGeneratedMappingsInSpecificationFileSelectionPage fileSelectionPage
    private SaveGeneratedMappingsInSpecificationIfaceSelectionPage interfaceSelectionPage
    private Map<EqInterface, Pin> mapping
    private AssistModel model
    
    private String filenameSuggestion
	
	new(String p_filenameSuggestion, Map<EqInterface, Pin> p_mapping, AssistModel p_model) {
		super()
		setWindowTitle("Save Generated Mappings in Specification")
		filenameSuggestion = p_filenameSuggestion
		mapping = p_mapping
		model = p_model
	}
	
	override void init(IWorkbench workbench, IStructuredSelection selection) {
	    this.selection = selection
	}
	
	override void addPages() {
		
		interfaceSelectionPage = new SaveGeneratedMappingsInSpecificationIfaceSelectionPage(mapping)
		addPage(interfaceSelectionPage)
		
		fileSelectionPage = new SaveGeneratedMappingsInSpecificationFileSelectionPage(selection, filenameSuggestion)
		addPage(fileSelectionPage)
	}
	
	
	override boolean performFinish() {
		
		
		// file should be created
		val newFile = fileSelectionPage.createNewFile()
		
		
		// Get Interfaces
		val List<EqInterface> selectedInterfaces = interfaceSelectionPage.getSelectedInterfaces.map[it as EqInterface]
		
		// We have to update the current model with the valid restrictions; 
		// if we do a copy of the model, then all comments are lost
		// other option: make comments explicit in the grammar - but this is a bit overkill
		// thats why we add some valid restrictions, persist to the disk and take them back afterwards					
		
		// Update model
		val f = ModelFactory.eINSTANCE

		val addedValidDeploymentsForLaterRemoval = new ArrayList<ValidDeployment>	

		for (iface : selectedInterfaces) {
			val vd = f.createValidDeployment
			vd.eqInterfaceOrGroups.add(iface)
			vd.hardwareElements.add(mapping.get(iface))
			
			// Check if we already have that exact statement
			if (model.validDeployments.filter[it.eqInterfaceOrGroups.contains(iface) && it.eqInterfaceOrGroups.length == 1]
									  .filter[it.hardwareElements.contains(mapping.get(iface)) && it.hardwareElements.length == 1]
									  .isNullOrEmpty) 
			{
				model.validDeployments.add(vd)
				addedValidDeploymentsForLaterRemoval.add(vd)
			}
		}
		
		// Persist updated model
		val resSet = new ResourceSetImpl
		val resource = resSet.createResource(URI.createFileURI(newFile.fullPath.toPortableString))
		resource.contents.clear
		resource.contents.add(model)
		
		try {
			val opt = SaveOptions.newBuilder.format.options.toOptionsMap
			resource.save(opt)
		} catch (IOException e) {
			e.printStackTrace
		}

		// restore old model
		model.validDeployments.removeAll(addedValidDeploymentsForLaterRemoval)
		
		// Finally, open the newly generated file
		getShell.getDisplay.asyncExec(new Runnable() {
			override void run() {
				val page = PlatformUI.getWorkbench.getActiveWorkbenchWindow.getActivePage
				try { IDE.openEditor(page, newFile, true); } catch (PartInitException e) {	}
			}
		})
		
		return true;
	}
	
	
	override boolean canFinish()
	{
		if (container.currentPage == interfaceSelectionPage) return false
		else if ((container.currentPage == fileSelectionPage) && (container.currentPage.isPageComplete)) return true
			 else return false
	}
}