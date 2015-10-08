package ch.hilbri.assist.application.gui.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.dialogs.NewWizard;
import org.eclipse.ui.internal.help.WorkbenchHelpSystem;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;

/**
 * This opens a Dialog to create a new project.  If possible, do as in the other "New.." handlers.
 * 
 *
 */
@SuppressWarnings({"restriction" })
public class NewProjectDialogHandler {

	private static final int SIZING_WIZARD_WIDTH_2 = 500;

	private static final int SIZING_WIZARD_HEIGHT_2 = 500;

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		NewWizard wizard = new NewWizard();
		wizard.setProjectsOnly(true);
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		IStructuredSelection selectionToPass = null;
		if (selection instanceof IStructuredSelection)
			selectionToPass = (IStructuredSelection) selection;
		else
			selectionToPass = StructuredSelection.EMPTY;
		wizard.init(PlatformUI.getWorkbench(), selectionToPass);
		IDialogSettings workbenchSettings = WorkbenchPlugin.getDefault().getDialogSettings();
		IDialogSettings wizardSettings = workbenchSettings.getSection("NewWizardAction");//$NON-NLS-1$
		if (wizardSettings == null)
			wizardSettings = workbenchSettings.addNewSection("NewWizardAction");//$NON-NLS-1$
		wizard.setDialogSettings(wizardSettings);
		wizard.setForcePreviousAndNextButtons(true);

		// Create wizard dialog.
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(SIZING_WIZARD_WIDTH_2, dialog.getShell().getSize().x), SIZING_WIZARD_HEIGHT_2);
		WorkbenchHelpSystem.getInstance().setHelp(dialog.getShell(), IIDEHelpContextIds.NEW_PROJECT_WIZARD);
		dialog.open();
	}
}
