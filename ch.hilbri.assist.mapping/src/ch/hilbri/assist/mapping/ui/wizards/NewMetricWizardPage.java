package ch.hilbri.assist.mapping.ui.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewMetricWizardPage extends NewTypeWizardPage {

    public NewMetricWizardPage() {
        super(true, "NewMetricWizardPage");
    }

    /**
     * The wizard managing this wizard page must call this method
     * during initialization with a corresponding selection.
     */   
    public void init(IStructuredSelection selection) {
        IJavaElement jelem= getInitialJavaElement(selection);
        initContainerPage(jelem);
        initTypePage(jelem);
        doStatusUpdate();
    }

    private void doStatusUpdate() {
        // define the components for which a status is desired
        IStatus[] status= new IStatus[] {
            fContainerStatus,
            isEnclosingTypeSelected() ? fEnclosingTypeStatus : fPackageStatus,
        };
        updateStatus(status);
    }


    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);

        doStatusUpdate();
    }
 
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);
        Composite composite= new Composite(parent, SWT.NONE);
        int nColumns= 4;
        GridLayout layout= new GridLayout();
        layout.numColumns= nColumns;
        composite.setLayout(layout);

        // Create the standard input fields
        createTypeNameControls(composite, nColumns);
        createContainerControls(composite, nColumns);
//        createSeparator(composite, nColumns);

        setControl(composite);
    }
}
