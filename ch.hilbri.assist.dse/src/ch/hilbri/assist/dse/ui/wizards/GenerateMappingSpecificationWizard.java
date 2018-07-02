package ch.hilbri.assist.dse.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.Wizard;

import ch.hilbri.assist.model.AssistModel;

public class GenerateMappingSpecificationWizard extends Wizard {

    private AssistModel assistModel;
    private IProject preselectedProject;
    private String preselectedFileName;
    
    private GenerateMappingSpecificationWizardPage page;
    
    public GenerateMappingSpecificationWizard(AssistModel a, IProject p, String f) {
        setWindowTitle("Generate Mapping Specification");
        assistModel = a;
        preselectedProject = p;
        preselectedFileName = f;
    }

    @Override
    public void addPages() {
        page = new GenerateMappingSpecificationWizardPage(preselectedProject, preselectedFileName);
        addPage(page);
    }

    @Override
    public boolean performFinish() {
        if (assistModel != null) 
            return true;
        return false;
    }

}
