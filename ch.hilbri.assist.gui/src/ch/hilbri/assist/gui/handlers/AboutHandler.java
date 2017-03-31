 
package ch.hilbri.assist.gui.handlers;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

import ch.hilbri.assist.gui.parts.AboutDialog;

public class AboutHandler {
	@Execute
	public void execute(IEclipseContext context, IWorkbench workbench) {
		AboutDialog dialog = ContextInjectionFactory.make(AboutDialog.class, context);
		dialog.open();
	}
}