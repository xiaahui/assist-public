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
import ch.hilbri.assist.mapping.ui.wizards.ExportToAPP4MCWizardPage.ExportMode;
import ch.hilbri.assist.model.MappingResult;

public class ExportToAPP4MCWizard extends Wizard implements IExportWizard {

    private ExportToAPP4MCWizardPage page;
    private MultiPageEditor preSelectedMultiPageEditor;
    private MappingResult preSelectedSolution;

    public ExportToAPP4MCWizard() {
        setWindowTitle("APP4MC Export Wizard"); // NON-NLS-1
    }

    public ExportToAPP4MCWizard(MultiPageEditor mpe, MappingResult solution) {
        this();
        this.preSelectedMultiPageEditor = mpe;
        this.preSelectedSolution = solution;
    }

    @Override
    public void addPages() {
        page = new ExportToAPP4MCWizardPage(preSelectedMultiPageEditor, preSelectedSolution);
        addPage(page);
    }

    @Override
    public boolean performFinish() {
        MappingResult result = page.getSelectedMappingResult();
        String fileName = page.getSelectedFileName();
        ExportMode exportMode = page.getSelectedExportMode();

        Amalthea exportedModel;
        if (exportMode == ExportMode.CREATE_NEW_MODEL) {
            exportedModel = ExportToAPP4MCModel.createModel(result);
        }
        else if (exportMode == ExportMode.ADD_TO_EXISTING_MODEL) {
            Amalthea amaltheaTemplate = AmaltheaLoader.loadFromFileNamed(fileName);
            exportedModel = ExportToAPP4MCModel.createModel(result, amaltheaTemplate);
        } else {
            /* We should only have the two modes */
            return false;
        }
        
        /* Serialize the new model */
        return AmaltheaWriter.writeToFileNamed(exportedModel, fileName);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("APP4MC Export Wizard"); // NON-NLS-1
        setNeedsProgressMonitor(true);
    }

}
