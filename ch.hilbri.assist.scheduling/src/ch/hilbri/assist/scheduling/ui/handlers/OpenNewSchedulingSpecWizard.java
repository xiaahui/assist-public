package ch.hilbri.assist.scheduling.ui.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.ui.IWorkbenchCommandConstants;

public class OpenNewSchedulingSpecWizard {
	@CanExecute
	public boolean canExecute(MApplication application, EModelService service) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject [] projects = workspace.getRoot().getProjects();
		return projects.length > 0;
	}
	
	@Execute
	public void execute(EHandlerService hService, ECommandService cService) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put(IWorkbenchCommandConstants.FILE_NEW_PARM_WIZARDID, "ch.hilbri.assist.scheduling.wizards.newSchedulingSpecification");
		ParameterizedCommand cmd = cService.createCommand(IWorkbenchCommandConstants.FILE_NEW, map);
		if (hService.canExecute(cmd)) 
				hService.executeHandler(cmd);
	}
}
