package ch.hilbri.assist.gui.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.ui.IWorkbenchCommandConstants;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

@SuppressWarnings("restriction")
public class NewProjectHandler {
	
	@Execute
	public void execute(EHandlerService hService, ECommandService cService) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(IWorkbenchCommandConstants.FILE_NEW_PARM_WIZARDID, BasicNewProjectResourceWizard.WIZARD_ID);
		ParameterizedCommand cmd = cService.createCommand(IWorkbenchCommandConstants.FILE_NEW, map);
		if (hService.canExecute(cmd)) 
				hService.executeHandler(cmd);
	}
	
}
