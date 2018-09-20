package ch.hilbri.assist.scheduling.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.core.JavaElement;
import org.eclipse.jdt.internal.ui.packageview.PackageFragmentRootContainer;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (sdsl).
 */

public class NewSchedulingSpecificationWizardPage extends WizardPage {

    private Text containerText;
    private Text fileText;
    private ISelection selection;

    /**
     * Constructor
     * 
     * @param pageName
     */
    public NewSchedulingSpecificationWizardPage(ISelection selection) {
        super("Create Specification");
        setTitle("Create a new scheduling specification");
        setDescription("This wizard creates a new scheduling specification file with *.sdsl extension.");
        this.selection = selection;
    }

    /**
     * @see IDialogPage#createControl(Composite)
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 3;
        layout.verticalSpacing = 9;

        Label fileNameLabel = new Label(container, SWT.NULL);
        fileNameLabel.setText("&File name:");

        fileText = new Text(container, SWT.BORDER | SWT.SINGLE);

        fileText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        fileText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                dialogChanged();
            }
        });

        Label fileNameExtensionLabel = new Label(container, SWT.NULL);
        fileNameExtensionLabel.setText(".sdsl");

        Label projectLabel = new Label(container, SWT.NULL);
        projectLabel.setText("&Project:");

        containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
        containerText.setEditable(false);
        containerText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        containerText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                dialogChanged();
            }
        });

        Button button = new Button(container, SWT.PUSH);
        button.setText("Browse...");
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
            }
        });

        initialize();
        dialogChanged();
        setControl(container);
    }

    /**
     * Tests if the current workbench selection is a suitable container to use.
     */
    private void initialize() {
        if (selection.isEmpty()) {
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            selection = window.getSelectionService().getSelection("org.eclipse.ui.navigator.ProjectExplorer");
        }

        if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
            IStructuredSelection ssel = (IStructuredSelection) selection;
            if (ssel.size() > 1)
                return;
            Object obj = ssel.getFirstElement();
            IContainer container;

            // If a project or a file is preselected
            if (obj instanceof IResource) {
                if (obj instanceof IContainer)
                    container = (IContainer) obj;
                else
                    container = ((IResource) obj).getProject();

                // No leading "/"
                containerText.setText(container.getFullPath().toString().substring(1));

            }

            // If a package (subfolder) is preselected)
            else if (obj instanceof JavaElement) {
                container = ((JavaElement) obj).getResource().getProject();

                // No leading "/"
                containerText.setText(container.getFullPath().toString().substring(1));
            }
            
            // If the classpath container got selected
            else if (obj instanceof PackageFragmentRootContainer) {
                container = ((PackageFragmentRootContainer) obj).getJavaProject().getProject();

                // No leading "/"
                containerText.setText(container.getFullPath().toString().substring(1));
            }

        }

        fileText.setText("newSpecification");
    }

    /**
     * Uses the standard container selection dialog to choose the new value for the
     * container field.
     */

    private void handleBrowse() {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),
                ResourcesPlugin.getWorkspace().getRoot(), false, "Select project");
        if (dialog.open() == ContainerSelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length == 1) {
                Path path = (Path) result[0];
                if (path.segmentCount() > 1)
                    path = (Path) path.removeLastSegments(path.segmentCount() - 1);

                // No leading "/"
                containerText.setText(path.toString().substring(1));
            }
        }
    }

    /**
     * Ensures that both text fields are set.
     */
    private void dialogChanged() {
        IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
        String fileName = getFileName();

        if (getContainerName().length() == 0) {
            updateStatus("Project must be specified");
            return;
        }
        if (container == null || (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
            updateStatus("Project must exist");
            return;
        }
        if (!container.isAccessible()) {
            updateStatus("Project must be writable");
            return;
        }
        if (fileName.length() == 0) {
            updateStatus("File name must be specified");
            return;
        }
        if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
            updateStatus("File name must be valid");
            return;
        }
        IResource temp = ResourcesPlugin.getWorkspace().getRoot()
                .findMember(new Path(getContainerName() + "/Scheduling/" + fileName + ".sdsl"));
        if (temp != null) {
            if (temp.exists()) {
                updateStatus("File already exists");
                return;
            }
        }

        updateStatus(null);
    }

    private void updateStatus(String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }

    public String getContainerName() {
        return containerText.getText();
    }

    public String getFileName() {
        return fileText.getText();
    }
}