package ch.hilbri.assist.dse.ui.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class GenerateMappingSpecificationWizardPage extends WizardPage {
    private Text txtFileName;
    private Text txtProjectName;

    public GenerateMappingSpecificationWizardPage(IProject preselectedProject, String preselectedFileName) {
        super("wizardPage");
        setMessage("Please select the name and the project folder for the mapping specification.");
        setTitle("Create Mapping Specification");
        setDescription("Wizard Page description");
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        setControl(container);
        GridLayout gl_container = new GridLayout(3, false);
        gl_container.horizontalSpacing = 10;
        container.setLayout(gl_container);
        
        Label lblName = new Label(container, SWT.NONE);
        lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblName.setText("Name:");
        
        txtFileName = new Text(container, SWT.BORDER);
        txtFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        new Label(container, SWT.NONE);
        
        Label lblFolder = new Label(container, SWT.NONE);
        lblFolder.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        lblFolder.setText("Folder:");
        
        txtProjectName = new Text(container, SWT.BORDER);
        txtProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        
        Button btnBrowse = new Button(container, SWT.NONE);
        GridData gd_btnBrowse = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_btnBrowse.widthHint = 60;
        btnBrowse.setLayoutData(gd_btnBrowse);
        btnBrowse.setText("Browse");
    }

}
