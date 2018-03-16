package ch.hilbri.assist.gui.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class HelpHandler {
	@Execute
	public void execute(final EPartService partService) {
	    partService.showPart("ch.hilbri.assist.gui.part.helpbrowser", PartState.ACTIVATE);
	}
}
