 
package ch.hilbri.assist.mapping.ui.handlers;

import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.core.di.annotations.Execute;

import ch.hilbri.assist.application.helpers.ConsoleCommands;

public class CompileAllMetrics {
	
	@Execute
	public void execute() {
		try {
			ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, null);
		} catch (CoreException e) {
			ConsoleCommands.writeLineToConsole(e.getStackTrace().toString());
		}
	}
		
}