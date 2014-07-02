package ch.hilbri.assist.application.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;

import ch.hilbri.assist.application.helpers.PathProvider;

/**
 * Opens a dialog to create a new file
 * 
 * @author Mirko Liebender
 *
 */
public class NewTextFileDialogHandler {

	@Execute
	public void execute(EHandlerService hService, ECommandService cService) {
		
		Command command = cService.getCommand(PathProvider.ECL_NEW_WIZARD);
		if (command.isDefined()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("newWizardId", PathProvider.ECL_WIZARD_NEW_FILE);
			ParameterizedCommand cmd = cService.createCommand(PathProvider.ECL_NEW_WIZARD, map);
			if (hService.canExecute(cmd)) {
				hService.executeHandler(cmd);
			}
		}
	}
}

// E4 Ansatz
//
//public class NewTextFileDialogHandler {
//	private IContainer parentContainer;
//	private String name;
//	
//	@SuppressWarnings("deprecation")
//	@Execute
//	public void openNewTextFileDialog(
//			@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell,
//			@Optional @Named(IServiceConstants.SELECTION) final IResource resource,
//			final IWorkspace workspace,
//			IProgressMonitor monitor) {
//		
//		TitleAreaDialog dialog = new TitleAreaDialog(parentShell) {
//			private ResourceViewerControl viewer;
//			private Text text;
//			
//			@Override
//			protected Control createDialogArea(Composite parent) {
//				Composite comp = (Composite) super.createDialogArea(parent);
//				Composite container = new Composite(comp,SWT.NONE);
//				container.setLayoutData(new GridData(GridData.FILL_BOTH));
//				container.setLayout(new GridLayout(2,false));
//				
//				Label label = new Label(container, SWT.NONE);
//				label.setText("Folder");
//				
//				viewer = new ResourceViewerControl(container, SWT.NONE, workspace, resource);
//				viewer.setLayoutData(new GridData(GridData.FILL_BOTH));
//				
//				label = new Label(container, SWT.NONE);
//				label.setText("File name");
//				
//				text = new Text(container, SWT.BORDER);
//				text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//				
//				return comp;
//			}
//			
//			@Override
//			protected void okPressed() {
//				IResource resource = viewer.getResource();
//				if( resource == null ) {
//					setMessage("Select a parent folder", IMessageProvider.ERROR);
//					return;
//				}
//				
//				if( text.getText().trim().length() == 0 ) {
//					setMessage("Enter a folder name", IMessageProvider.ERROR);
//					return;
//				}
//				
//				parentContainer = (IContainer) resource;
//				name = text.getText();
//				super.okPressed();
//			}
//		};
//		
//		if( dialog.open() == IDialogConstants.OK_ID ) {
//			IPath newFilePath = parentContainer.getFullPath().append(name);
//			IFile file = workspace.getRoot().getFile(newFilePath);
//			ByteArrayInputStream out = new ByteArrayInputStream(new byte[0]);
//			try {
//				file.create(out, true, monitor);
//			} catch (CoreException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				out.close(); 
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

