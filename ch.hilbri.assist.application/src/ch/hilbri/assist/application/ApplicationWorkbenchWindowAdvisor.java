package ch.hilbri.assist.application;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.cheatsheets.OpenCheatSheetAction;

import ch.hilbri.assist.application.helpers.Helpers;
import ch.hilbri.assist.application.helpers.PathProvider;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1280, 720));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(true);
		configurer.setShowProgressIndicator(true);
	}

	public void postWindowCreate() {
		new OpenCheatSheetAction(PathProvider.APP_CHEAT_SHEET_ID).run();
	}

	@Override
	public void postWindowOpen() {
		super.postWindowOpen();
		Helpers.disableWizards();
	}
}
