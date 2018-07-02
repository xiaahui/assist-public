package ch.hilbri.assist.dse.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class GenerateMappingSpecificationWizardPage extends WizardPage {

    public GenerateMappingSpecificationWizardPage(IProject preselectedProject, String preselectedFileName) {
        super("wizardPage");
        setTitle("Generate Wizard Page Title");
        setDescription("Wizard Page description");
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        setControl(container);
    }

}
