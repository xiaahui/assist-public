package ch.hilbri.assist.application.processors;

import java.util.List;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

/**
 * This processor is a workaround to apply Icons for disabled states into the context. The E4 Model doesn't allow disabled
 * icons inside the application model before runtime.
 * @author Mirko Liebender
 *
 */
public class ToolbarDisabledIconProcessor {

	@Execute
	public void run(MApplication app, EModelService modelService) {
		List<MToolItem> stacks = modelService.findElements(app, null,
				MToolItem.class, null);
		for (MToolItem tmp : stacks) {
			if (tmp.getElementId().startsWith("ch.hilbri.assist.application.handledtoolitem.")){
				setDisabledIconURI(tmp, tmp.getIconURI().replaceAll(".png", "_disabled.png"));
			}
		}
	}
	
	public static void setDisabledIconURI(MToolItem item, String disabledIconURI) {
				item.getTransientData().put(IPresentationEngine.DISABLED_ICON_IMAGE_KEY, disabledIconURI);
			}
}
