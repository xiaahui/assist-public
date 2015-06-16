package ch.hilbri.assist.application.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPageOne;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewAssistProjectWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;

	private NewJavaProjectWizardPageOne pageOne;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;

		setNeedsProgressMonitor(true);
		
		setWindowTitle("New ASSIST Project");
	}

	public void addPages() {
		super.addPages();

		pageOne = new NewJavaProjectWizardPageOne();
		pageOne.setTitle("ASSIST Project");
		pageOne.setDescription("Create a new project");

		this.addPage(pageOne);
	}

	@Override
	public boolean performFinish() {
		
		// First create a simple project of type org.eclipse.core.resources.IProject: 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(pageOne.getProjectName());
		try {
			project.create(null);
			project.open(null);
			
		} catch (CoreException e) {	e.printStackTrace(); }
		
		
		// Because we need a java project, we have to set the Java nature to the created project: 
		IProjectDescription description;
		try {
			description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID });
			project.setDescription(description, null);
		} catch (CoreException e) {	e.printStackTrace(); }
		
		// Now we can create our Java project
		IJavaProject javaProject = JavaCore.create(project); 

		// However, it's not enough if we want to add Java source code to the project. We have to set the Java build path:
		// (1) We first specify the output location of the compiler (the bin folder): 
		IFolder binFolder = project.getFolder("Compiled-Metrics");
		try {
			binFolder.create(false, true, null);
			javaProject.setOutputLocation(binFolder.getFullPath(), null);
		} catch (CoreException e) { e.printStackTrace(); }
		
		// (2) Define the class path entries. 
		//     Class path entries define the roots of package fragments. 
		//     Note that you might have to include the necessary plugin "org.eclipse.jdt.launching". 
		
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
		IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
		LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (LibraryLocation element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}

		//    add libs to project class path
		try {
			javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
		} catch (JavaModelException e) { e.printStackTrace(); }
		
		// (3) We have not yet the source folder created: 
		IFolder mappingSourceFolder = project.getFolder("Metrics");
		
		try {
			mappingSourceFolder.create(false, true, null);
		} catch (CoreException e) {	e.printStackTrace(); }
		
		// (4) Now the created source folder should be added to the class entries of the project, otherwise compilation will fail:
		try {
			IPackageFragmentRoot mappingPackageRoot = javaProject.getPackageFragmentRoot(mappingSourceFolder);
			
			IClasspathEntry[] cpEntries = new IClasspathEntry[3];

			cpEntries[0] = JavaCore.newSourceEntry(mappingPackageRoot.getPath());
			cpEntries[1] = JavaCore.newContainerEntry(new Path("ch.hilbri.assist.application.classpathContainer"));
			cpEntries[2] = JavaRuntime.getDefaultJREContainerEntry();

			javaProject.setRawClasspath(cpEntries, null);
			
		} catch (JavaModelException e) { e.printStackTrace(); }
		
		// Create packages
		try { javaProject.getPackageFragmentRoot(mappingSourceFolder).createPackageFragment("custom", false, null);	} 
		catch (JavaModelException e) {	e.printStackTrace(); }
		
		return true;
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
