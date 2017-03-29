package ch.hilbri.assist.gui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class SaveAllHandler {
	@Execute
	public void execute(IWorkbench workbench){
			workbench.close();
	}
	
}
