package ch.hilbri.assist.mapping.ui.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
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

public class ExportMappingResultToSchedulingWizardPage extends WizardPage {

	private Text txtContainer;
	private Text txtFilename;
	private Text txtSystemName;

	private ISelection selection;

	/**
	 * Constructor
	 * 
	 * @param pageName
	 */
	public ExportMappingResultToSchedulingWizardPage(ISelection selection) {
		super("Create Specification");
		setTitle("Export to a new scheduling specification");
		setDescription("This wizard exports a mapping result to a a scheduling specification file.");
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

		Label projectLabel = new Label(container, SWT.NULL);
		projectLabel.setText("&Project:");

		txtContainer = new Text(container, SWT.BORDER | SWT.SINGLE);
		txtContainer.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtContainer.addModifyListener(new ModifyListener() {
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

		Label fileNameLabel = new Label(container, SWT.NULL);
		fileNameLabel.setText("&File name:");

		txtFilename = new Text(container, SWT.BORDER | SWT.SINGLE);
		txtFilename.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtFilename.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Label fileNameExtensionLabel = new Label(container, SWT.NULL);
		fileNameExtensionLabel.setText(".sdsl");

		Label lblsystemName = new Label(container, SWT.NONE);
		lblsystemName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblsystemName.setText("&System name:");

		txtSystemName = new Text(container, SWT.BORDER);
		txtSystemName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(container, SWT.NONE);

		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection == null) {
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			selection = window.getSelectionService().getSelection("org.eclipse.ui.navigator.ProjectExplorer");
		}

		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				txtContainer.setText(container.getFullPath().toString());
			}
		}
		String name = "newScheduling";
		int i = 1;
		while (ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName() + "/" + name + ".sdsl")) != null) {
			name = "newScheduling" + String.valueOf(i);
			i++;
		}
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
				txtContainer.setText(path.toString());
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
		return txtContainer.getText();
	}

	public String getFileName() {
		return txtFilename.getText();
	}
	
	public String getSystemName() {
		return txtSystemName.getText();
	}
}