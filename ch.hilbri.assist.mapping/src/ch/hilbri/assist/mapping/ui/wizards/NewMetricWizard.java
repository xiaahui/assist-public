package ch.hilbri.assist.mapping.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

public class NewMetricWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;

	private NewMetricWizardPage pageOne;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		this.pageOne = new NewMetricWizardPage();
		this.pageOne.init(selection);
		this.pageOne.setDescription("Create a custom metric");
		this.pageOne.setTitle("Metric");
		this.addPage(pageOne);

		setNeedsProgressMonitor(true);

		setWindowTitle("New Custom Metric");

	}

	@Override
	public boolean performFinish() {

		final IResource resource = pageOne.getModifiedResource();
		if (resource instanceof IFile) {

			final IFile file = (IFile) resource;
			InputStream stream = openContentStream();
			try {
				if (file.exists()) {
					file.setContents(stream, true, true, null);
				} else {
					file.create(stream, true, null);
				}
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}

			final IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
			if (activePage != null) {
				final Display display = getShell().getDisplay();
				if (display != null) {
					display.asyncExec(new Runnable() {
						public void run() {
							try {
								IDE.openEditor(activePage, file, true);
							} catch (PartInitException e) {
								e.printStackTrace();
							}
						}
					});
				}
			}
		}

		return true;
	}

	private InputStream openContentStream() {
		String fileName = pageOne.getTypeName();
		String packageName = pageOne.getPackageText();
		packageName = packageName.length() > 0 ? "package " + packageName
				+ ";\n\n" : "";
		String contents = packageName
				+ "import de.fraunhofer.fokus.precisionpro.mapping.result.Result;\n"
				+ "import de.fraunhofer.fokus.precisionpro.mapping.analysis.AbstractMetric;\n\n"
				+

				"public class " + fileName + " extends AbstractMetric { \n" +

				"\tpublic " + fileName + "(int weight) {\n"
				+ "\t\tsuper(weight, false, \"" + fileName + "\");\n"
				+ "\t}\n \n" +

				"\t@Override\n"
				+ "\tprotected double computeScore(Result result) {\n \n" +

				"\t\tdouble score = 0;\n \n" +

				"\t\treturn score;\n" + "\t}\n" +

				"}";
		return new ByteArrayInputStream(contents.getBytes());
	}

	/*
	 * Returns the selection which was passed to <code>init</code>.
	 * 
	 * @return the selection
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * Returns the workbench which was passed to <code>init</code>.
	 *
	 * @return the workbench
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

}
