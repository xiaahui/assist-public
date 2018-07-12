package ch.hilbri.assist.dse.ui.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.corext.util.JavaModelUtil;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class NewMetricWizardPage extends NewTypeWizardPage {

	public NewMetricWizardPage() {
		super(true, "NewMetricWizardPage");
	}

	/**
	 * The wizard managing this wizard page must call this method during
	 * initialization with a corresponding selection.
	 */
	public void init(IStructuredSelection selection) {
		IJavaElement jelem = getInitialJavaElement(selection);
		initContainerPage(jelem);
		initTypePage(jelem);
		doStatusUpdate();
	}

	/*
	 * Will find out the proper folder where to store the new metric
	 * 
	 * --> needed to override default implementation in order to make sure that the
	 * metrics will be added to the mapping sub folder
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage#initContainerPage(org.
	 * eclipse.jdt.core.IJavaElement)
	 */
	@Override
	protected void initContainerPage(IJavaElement elem) {
		IPackageFragmentRoot initRoot = null;
		if (elem != null) {
			initRoot = JavaModelUtil.getPackageFragmentRoot(elem);
			try {
				if (initRoot == null || initRoot.getKind() != IPackageFragmentRoot.K_SOURCE) {
					IJavaProject jproject = elem.getJavaProject();
					if (jproject != null) {
						initRoot = null;
						if (jproject.exists()) {
							IPackageFragmentRoot[] roots = jproject.getPackageFragmentRoots();
							for (int i = 0; i < roots.length; i++) {
								if ((roots[i].getKind() == IPackageFragmentRoot.K_SOURCE)
										&& roots[i].getElementName().equals("Exploration")) {
									initRoot = roots[i];
									break;
								}
							}
						}
						if (initRoot == null) {
							initRoot = jproject.getPackageFragmentRoot(jproject.getResource());
						}
					}
				}
			} catch (JavaModelException e) {
				JavaPlugin.log(e);
			}
		}
		setPackageFragmentRoot(initRoot, true);
	}

	private void doStatusUpdate() {
		// define the components for which a status is desired
		IStatus[] status = new IStatus[] { fContainerStatus,
				isEnclosingTypeSelected() ? fEnclosingTypeStatus : fPackageStatus, };
		updateStatus(status);
	}

	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		doStatusUpdate();
	}

	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite composite = new Composite(parent, SWT.NONE);
		int nColumns = 4;
		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		// Create the standard input fields
		createTypeNameControls(composite, nColumns);
		createContainerControls(composite, nColumns);
		setControl(composite);
	}
}
