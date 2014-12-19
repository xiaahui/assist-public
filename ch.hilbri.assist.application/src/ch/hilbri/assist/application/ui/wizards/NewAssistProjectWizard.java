package ch.hilbri.assist.application.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

public class NewAssistProjectWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;

	private WizardNewProjectCreationPage mainPage;

	// cache of newly-created project
	private IProject newProject;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setNeedsProgressMonitor(true);
		setWindowTitle("New ASSIST Project");
	}

	public void addPages() {
		super.addPages();

		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage") { //$NON-NLS-1$
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.ui.dialogs.WizardNewProjectCreationPage#createControl(org.eclipse.swt.widgets.Composite)
			 */
			public void createControl(Composite parent) {
				super.createControl(parent);
				createWorkingSetGroup((Composite) getControl(), getSelection(), new String[] { "org.eclipse.ui.resourceWorkingSetPage" }); //$NON-NLS-1$
				Dialog.applyDialogFont(getControl());
			}
		};
		mainPage.setTitle("Project");
		mainPage.setDescription("Create a new project");
		this.addPage(mainPage);

	}

	@Override
	public boolean performFinish() {
		createNewProject();

		if (newProject == null) {
			return false;
		}

		IWorkingSet[] workingSets = mainPage.getSelectedWorkingSets();
		getWorkbench().getWorkingSetManager().addToWorkingSets(newProject, workingSets);

		selectAndReveal(newProject, getWorkbench().getActiveWorkbenchWindow());

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

	/**
	 * Creates a new project resource with the selected name.
	 * <p>
	 * In normal usage, this method is invoked after the user has pressed Finish on the wizard; the enablement of the Finish
	 * button implies that all controls on the pages currently contain valid values.
	 * </p>
	 * <p>
	 * Note that this wizard caches the new project once it has been successfully created; subsequent invocations of this method
	 * will answer the same project resource without attempting to create it again.
	 * </p>
	 * 
	 * @return the created project resource, or <code>null</code> if the project was not created
	 */
	private IProject createNewProject() {
		if (newProject != null) {
			return newProject;
		}

		// get a project handle
		final IProject newProjectHandle = mainPage.getProjectHandle();

		// get a project descriptor
		URI location = null;
		if (!mainPage.useDefaults()) {
			location = mainPage.getLocationURI();
		}

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace.newProjectDescription(newProjectHandle.getName());
		description.setLocationURI(location);

		// create the new project operation
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				CreateProjectOperation op = new CreateProjectOperation(description, "New Project");
				try {
					// see bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=219901
					// directly execute the operation so that the undo state is
					// not preserved. Making this undoable resulted in too many
					// accidental file deletions.
					op.execute(monitor, new IAdaptable() {
						@SuppressWarnings("rawtypes")
						public Object getAdapter(Class clazz) {
							if (clazz == Shell.class)
								return getShell();
							return null;
						}
					});
				} catch (ExecutionException e) {
					throw new InvocationTargetException(e);
				}
			}
		};

		// run the new project creation operation
		try {
			getContainer().run(true, true, op);
		} catch (InterruptedException e) {
			return null;
		} catch (InvocationTargetException e) {
			Throwable t = e.getTargetException();
			if (t instanceof ExecutionException && t.getCause() instanceof CoreException) {
				CoreException cause = (CoreException) t.getCause();
				StatusAdapter status;
				if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
					status = new StatusAdapter(newStatus(IStatus.WARNING, "The underlying file system is case insensitive. There is an existing project or directory that conflicts with this name", cause));
				} else {
					status = new StatusAdapter(newStatus(cause.getStatus().getSeverity(), "Creation Problems", cause));
				}
				status.setProperty(IStatusAdapterConstants.TITLE_PROPERTY, "Creation Problems");
				StatusManager.getManager().handle(status, StatusManager.BLOCK);
			}

			else {
				StatusAdapter status = new StatusAdapter(new Status(IStatus.WARNING, "ch.hilbri.assist.application", 0, "Internal error", t));
				status.setProperty(IStatusAdapterConstants.TITLE_PROPERTY, "Creation Problems");
				StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.BLOCK);
			}
			return null;
		}

		newProject = newProjectHandle;

		return newProject;
	}

	public static IStatus newStatus(int severity, String message, Throwable exception) {

		String statusMessage = message;
		if (message == null || message.trim().length() == 0) {
			if (exception == null) {
				throw new IllegalArgumentException();
			} else if (exception.getMessage() == null) {
				statusMessage = exception.toString();
			} else {
				statusMessage = exception.getMessage();
			}
		}

		return new Status(severity, "ch.hilbri.assist.application", severity, statusMessage, exception);
	}

	/**
	 * Attempts to select and reveal the specified resource in all parts within the supplied workbench window's active page.
	 * <p>
	 * Checks all parts in the active page to see if they implement <code>ISetSelectionTarget</code>, either directly or as an
	 * adapter. If so, tells the part to select and reveal the specified resource.
	 * </p>
	 *
	 * @param resource
	 *            the resource to be selected and revealed
	 * @param window
	 *            the workbench window to select and reveal the resource
	 * 
	 * @see ISetSelectionTarget
	 */
	public static void selectAndReveal(IResource resource, IWorkbenchWindow window) {
		// validate the input
		if (window == null || resource == null) {
			return;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
			return;
		}

		// get all the view and editor parts
		List<IWorkbenchPart> parts = new ArrayList<IWorkbenchPart>();
		IWorkbenchPartReference refs[] = page.getViewReferences();
		for (int i = 0; i < refs.length; i++) {
			IWorkbenchPart part = refs[i].getPart(false);
			if (part != null) {
				parts.add(part);
			}
		}
		refs = page.getEditorReferences();
		for (int i = 0; i < refs.length; i++) {
			if (refs[i].getPart(false) != null) {
				parts.add(refs[i].getPart(false));
			}
		}

		final ISelection selection = new StructuredSelection(resource);
		Iterator<IWorkbenchPart> itr = parts.iterator();
		
		while (itr.hasNext()) {
			IWorkbenchPart part = (IWorkbenchPart) itr.next();

			// get the part's ISetSelectionTarget implementation
			ISetSelectionTarget target = null;
			
			if (part instanceof ISetSelectionTarget) {
				target = (ISetSelectionTarget) part;
			
			} else {
				target = (ISetSelectionTarget) part.getAdapter(ISetSelectionTarget.class);
			}

			if (target != null) {
				// select and reveal resource
				final ISetSelectionTarget finalTarget = target;
				window.getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						finalTarget.selectReveal(selection);
					}
				});
			}
		}
	}
}
