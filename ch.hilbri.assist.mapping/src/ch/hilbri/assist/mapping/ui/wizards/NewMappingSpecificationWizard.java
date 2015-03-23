package ch.hilbri.assist.mapping.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.eclipse.xtend2.lib.StringConcatenation;

import ch.hilbri.assist.application.helpers.PathProvider;

public class NewMappingSpecificationWizard extends BasicNewResourceWizard implements INewWizard {

	private NewMappingSpecificationWizardPage page;
	private ISelection selection;

	
	public NewMappingSpecificationWizard() {
		super();
		setNeedsProgressMonitor(true);
	}


	public NewMappingSpecificationWizard(IWorkbench workbench, IStructuredSelection selection) {
		super();
		init(workbench, selection);
		setWindowTitle("New Mapping Specification");
		setNeedsProgressMonitor(true);
	}
	
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;

	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewMappingSpecificationWizardPage(selection);
		addPage(page);
	}
	
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName + "/Mapping"));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile file = container.getFile(new Path(fileName));
		try {
			InputStream stream = openContentStream();
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
		}
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName() + ".mdsl";
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * We will initialize file contents with a sample text.
	 */

	private InputStream openContentStream() {
		
		StringConcatenation _builder = new StringConcatenation();
	      _builder.append("Global { ");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("Name = \"Example System\";");
	      _builder.newLine();
	      _builder.append("}");
	      _builder.newLine();
	      _builder.newLine();
	      _builder.append("Compartment C1 {");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("RDC RDC1 {");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Manufacturer = \"Manu\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Type = \"Type\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("ESS = \"Ess\";");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Connector Connector1 {");
	      _builder.newLine();
	      _builder.append("\t\t\t");
	      _builder.append("\"CustomType0\" = 2;");
	      _builder.newLine();
	      _builder.append("\t\t\t");
	      _builder.append("\"CustomType13\" = 3;");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("}");
	      _builder.newLine();
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Connector Connector2 {");
	      _builder.newLine();
	      _builder.append("\t\t\t");
	      _builder.append("\"CustomType4\" = 2;");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("}");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("}");
	      _builder.newLine();
	      _builder.append("}");
	      _builder.newLine();
	      _builder.newLine();
	      _builder.newLine();
	      _builder.append("Interfaces {");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("Interface Iface1 {");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("InterfaceSystem = \"System\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("SubAta = \"SubATA\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Resource = \"Resource\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("LineName = \"LineName\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("WiringLane = \"WiringLane\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("GrpInfo = \"GrpInfo\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Route = \"Route\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("PwSup1 = \"PWSup1\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("EmhZone1 = \"MyZone\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Type = \"CustomType0\";");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("}");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("Interface Iface2 {");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("InterfaceSystem = \"System\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("SubAta = \"SubATA\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Resource = \"Resource\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("LineName = \"LineName\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("WiringLane = \"WiringLane\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("GrpInfo = \"GrpInfo\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Route = \"Route\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("PwSup1 = \"PWSup1\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("EmhZone1 = \"MyZone\";");
	      _builder.newLine();
	      _builder.append("\t\t");
	      _builder.append("Type = \"CustomType0\";");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("}");
	      _builder.newLine();
	      _builder.append("}");
	      _builder.newLine();
	      _builder.newLine();
	      _builder.append("InterfaceGroups {");
	      _builder.newLine();
	      _builder.append("\t");
	      _builder.append("Group G1 { Iface1, Iface2 };");
	      _builder.newLine();
	      _builder.append("}");
	      _builder.newLine();
		
	      return new ByteArrayInputStream(_builder.toString().getBytes());
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR, PathProvider.MAPPING, IStatus.OK, message, null);
		throw new CoreException(status);
	}

}
