package ch.hilbri.assist.mapping.ui.wizards;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

import ch.hilbri.assist.mapping.exporter.ExportToAPP4MCModel;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.model.MappingResult;

public class ExportToAPP4MCWizard extends Wizard implements IExportWizard {

    private ExportToAPP4MCWizardPage page;
    private MultiPageEditor preSelectedMultiPageEditor = null;
    private int preSelectedSolutionIndex = -1;
    
    public ExportToAPP4MCWizard() {
        setWindowTitle("APP4MC Export Wizard"); // NON-NLS-1
    }
    
    public ExportToAPP4MCWizard(MultiPageEditor mpe, int solutionIndex) {
        this();
        this.preSelectedMultiPageEditor = mpe;
        this.preSelectedSolutionIndex = solutionIndex;
    }

    @Override
    public void addPages() {
        page = new ExportToAPP4MCWizardPage(preSelectedMultiPageEditor, preSelectedSolutionIndex);
        addPage(page);
    }

    @Override
    public boolean performFinish() {
        MappingResult result = page.getSelectedMappingResult();
        String exportFileName = page.getSelectedExportFilename();
        String amaltheaTemplatePath = page.getSelectedAmaltheaTemplate();

        /* Load the template */
        Amalthea amaltheaTemplate = null;
        if (amaltheaTemplatePath != null && amaltheaTemplatePath.length() > 0) 
            amaltheaTemplate = AmaltheaLoader.loadFromFileNamed(amaltheaTemplatePath);
        
        /* Create the new model */
        Amalthea exportedModel = ExportToAPP4MCModel.createModel(result, amaltheaTemplate);
        
        /* Serialize the new model */
        AmaltheaWriter.writeToFileNamed(exportedModel, exportFileName);
        
        return true;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("APP4MC Export Wizard"); // NON-NLS-1
        setNeedsProgressMonitor(true);
    }

}
