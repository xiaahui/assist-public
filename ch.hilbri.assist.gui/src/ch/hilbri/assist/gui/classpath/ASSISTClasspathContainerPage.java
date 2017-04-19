package ch.hilbri.assist.gui.classpath;

import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPageExtension;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ASSISTClasspathContainerPage extends WizardPage implements IClasspathContainerPage, IClasspathContainerPageExtension  {

	private IClasspathEntry selection;

	private IJavaProject project;
	
	private IClasspathEntry[] currentEntries;
	
	public ASSISTClasspathContainerPage() {
		super("PageOne");

		setTitle("ASSIST Classpath Container");
		setDescription("This container adds all necessary libraries for ASSIST projects");
	}

	@Override
public void initialize(IJavaProject project, IClasspathEntry[] currentEntries) {
	this.project = project;
	this.currentEntries = currentEntries;
}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);

		setControl(composite);
		
		Label lblClickOnFinish = new Label(composite, SWT.NONE);
		lblClickOnFinish.setText("Nothing to configure.");
	}

	@Override
	public boolean finish() {
		
		IClasspathEntry[] newEntries = new IClasspathEntry[currentEntries.length+1];
		
		System.arraycopy(currentEntries, 0, newEntries, 0, currentEntries.length);
				
		newEntries[newEntries.length-1] = JavaCore.newContainerEntry(new Path("ch.hilbri.assist.gui.classpathContainer"));
		
		try {
		
			project.setRawClasspath(newEntries, null);
		
		} catch (JavaModelException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public IClasspathEntry getSelection() {
		return selection;
	}

	@Override
	public void setSelection(IClasspathEntry containerEntry) {
		selection = containerEntry;
	}

}
