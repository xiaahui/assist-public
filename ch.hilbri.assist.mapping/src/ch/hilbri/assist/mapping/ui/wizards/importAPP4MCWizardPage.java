package ch.hilbri.assist.mapping.ui.wizards;

import java.io.InputStream;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.xtext.util.StringInputStream;

public class importAPP4MCWizardPage extends WizardNewFileCreationPage {

    protected FileFieldEditor editor;

    public importAPP4MCWizardPage(String pageName, IStructuredSelection selection) {
        super(pageName, selection);
        setTitle(pageName); // NON-NLS-1
        setDescription("Import an APP4MC model from the local file system into the workspace"); // NON-NLS-1
        setFileExtension("mdsl");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
     */
    protected void createAdvancedControls(Composite parent) {
        Composite fileSelectionArea = new Composite(parent, SWT.NONE);
        GridData fileSelectionData = new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL);
        fileSelectionArea.setLayoutData(fileSelectionData);

        GridLayout fileSelectionLayout = new GridLayout();
        fileSelectionLayout.numColumns = 3;
        fileSelectionLayout.makeColumnsEqualWidth = false;
        fileSelectionLayout.marginWidth = 0;
        fileSelectionLayout.marginHeight = 0;
        fileSelectionArea.setLayout(fileSelectionLayout);

        editor = new FileFieldEditor("fileSelect", "Select File: ", fileSelectionArea); // NON-NLS-1 //NON-NLS-2
        editor.getTextControl(fileSelectionArea).addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                IPath path = new Path(importAPP4MCWizardPage.this.editor.getStringValue());
                setFileName(path.lastSegment());
            }
        });
        String[] extensions = new String[] { "*.amxmi", "*.zip" }; // NON-NLS-1
        editor.setFileExtensions(extensions);
        fileSelectionArea.moveAbove(null);

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
     */
    protected void createLinkTarget() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
     */
    protected InputStream getInitialContents() {
        //return new FileInputStream(new File(editor.getStringValue()));
        return new StringInputStream("Hallo Welt");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
     */
    protected String getNewFileLabel() {
        return "New ASSIST Model:"; // NON-NLS-1
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
     */
    protected IStatus validateLinkedResource() {
        return new Status(IStatus.OK, "ch.hilbri.assist.mapping", IStatus.OK, "", null); // NON-NLS-1 //NON-NLS-2
    }
}
