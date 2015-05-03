package ch.hilbri.assist.application;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import ch.hilbri.assist.application.helpers.Helpers;

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
//		Do not show the cheat sheet automatically after start up
//		new OpenCheatSheetAction(PathProvider.APP_CHEAT_SHEET_ID).run();
		
		// Open the Info view on the right side
		Object objApp = PlatformUI.getWorkbench().getService(MApplication.class);
		Object objModel = PlatformUI.getWorkbench().getService(EModelService.class);
		if (objApp instanceof MApplication && objModel instanceof EModelService) {
			MApplication application = (MApplication) objApp;
			EModelService modelService = (EModelService) objModel;
			Helpers.addViewToInfofield(
					"ch.hilbri.assist.mapping.infosheet",
					"Information",
					"bundleclass://ch.hilbri.assist.mapping/ch.hilbri.assist.mapping.ui.infosheet.InfoSheetView",
					application, modelService, true);
		}
	}

	@Override
	public void postWindowOpen() {
		super.postWindowOpen();
		Helpers.disableWizards();
		
		/* Focus on the editor after startup so we can populate the availableMetricsList */
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) editor.setFocus();
		
	}
}
