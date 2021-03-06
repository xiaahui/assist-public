package ch.hilbri.assist.scheduling.ui.wizards;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.SaveOptions;

import com.google.inject.Injector;

import ch.hilbri.assist.model.AssistModel;
import ch.hilbri.assist.scheduling.dsl.SchedulingDslStandaloneSetup;
import ch.hilbri.assist.scheduling.importer.ImportAPP4MCModel;

public class ImportAPP4MCWizard extends Wizard implements IImportWizard {

    ImportAPP4MCWizardPage mainPage;

    public ImportAPP4MCWizard() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    public boolean performFinish() {
        // Create an empty file
        IFile file = mainPage.createNewFile();
        if (file == null)
            return false;

        // Load the APP4MC Model
        String app4mcModel = mainPage.getAPP4MCModel();

        // Create the new ASSIST model
        AssistModel model = ImportAPP4MCModel.createAssistModel(app4mcModel);

        // Serialize the model to the file
        URI modelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

        Injector injector = (new SchedulingDslStandaloneSetup()).createInjectorAndDoEMFRegistration();
        ResourceSet rs = injector.getInstance(ResourceSet.class);
        Resource r = rs.createResource(modelURI);
        r.getContents().add(model);
        try {
            r.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Open the newly created file in the editor
        IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        try {
            IDE.openEditor(workbenchPage, file, true);
        } catch (PartInitException e) {
            e.printStackTrace();
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
     * org.eclipse.jface.viewers.IStructuredSelection)
     */
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("File Import Wizard"); // NON-NLS-1
        setNeedsProgressMonitor(true);
        mainPage = new ImportAPP4MCWizardPage("Import AMALTHEA 0.9.0 Model to Scheduling", selection); // NON-NLS-1
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages();
        addPage(mainPage);
    }

}
