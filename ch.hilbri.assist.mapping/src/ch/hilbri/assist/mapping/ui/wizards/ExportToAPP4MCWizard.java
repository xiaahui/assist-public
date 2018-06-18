package ch.hilbri.assist.mapping.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;

public class ExportToAPP4MCWizard extends Wizard implements IExportWizard {

    public ExportToAPP4MCWizard() {
        setWindowTitle("New Wizard");
    }

    @Override
    public void addPages() {
        addPage(new ExportToAPP4MCWizardPage());
    }

    @Override
    public boolean performFinish() {
        return true;
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("File Export Wizard"); // NON-NLS-1
        setNeedsProgressMonitor(true);
    }

}
