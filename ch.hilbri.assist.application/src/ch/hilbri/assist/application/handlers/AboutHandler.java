package ch.hilbri.assist.application.handlers;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

import ch.hilbri.assist.application.parts.AboutDialog;

/**
 * Handler for the About Dialog
 * 
 * @author Mirko Liebender
 *
 */
public class AboutHandler {
	
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
		AboutDialog dialog = ContextInjectionFactory.make(AboutDialog.class, context);
		dialog.open();
	}
}
