package ch.hilbri.assist.dse.ui.wizards;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class GenerateMappingSpecificationWizardPage extends WizardPage {
    private Text txtFileName;
    private Text txtProjectName;

    private IProject preselectedProject;
    private String preselectedFileName;

    public GenerateMappingSpecificationWizardPage(IProject preselectedProject, String preselectedFileName) {
        super("wizardPage");
        setMessage("Please select the name and the project folder for the mapping specification.");
        setTitle("Create Mapping Specification");
        setDescription("Wizard Page description");
        this.preselectedProject = preselectedProject;
        this.preselectedFileName = preselectedFileName;
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        setControl(container);
        GridLayout gl_container = new GridLayout(3, false);
        gl_container.horizontalSpacing = 10;
        container.setLayout(gl_container);

        Label lblName = new Label(container, SWT.NONE);
        lblName.setText("File name:");

        txtFileName = new Text(container, SWT.BORDER);
        txtFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Label lblmdsl = new Label(container, SWT.NONE);
        lblmdsl.setText(".mdsl");

        Label lblFolder = new Label(container, SWT.NONE);
        lblFolder.setText("Project:");

        txtProjectName = new Text(container, SWT.BORDER);
        txtProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

        Button btnBrowse = new Button(container, SWT.NONE);
        btnBrowse.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),
                        ResourcesPlugin.getWorkspace().getRoot(), false, "Select project");
                if (dialog.open() == ContainerSelectionDialog.OK) {
                    Object[] result = dialog.getResult();
                    if (result.length == 1) {
                        Path path = (Path) result[0];
                        if (path.segmentCount() > 1)
                            path = (Path) path.removeLastSegments(path.segmentCount() - 1);
                        txtProjectName.setText(path.toString());
                    }
                }

            }
        });
        GridData gd_btnBrowse = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_btnBrowse.widthHint = 60;
        btnBrowse.setLayoutData(gd_btnBrowse);
        btnBrowse.setText("Browse");

        // Set the default values
        txtFileName.setText(FilenameUtils.removeExtension(preselectedFileName));
        txtProjectName.setText("/" + preselectedProject.getName());
    }

    public String getFileName() {
        String ext = FilenameUtils.getExtension(txtFileName.getText());
        if (ext.equals("mdsl"))
            return txtFileName.getText();
        else
            return txtFileName.getText() + ".mdsl";
    }

    public String getProjectName() {
        return txtProjectName.getText();
    }

}
