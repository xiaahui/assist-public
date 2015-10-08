package ch.hilbri.assist.application.gui.addons;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.impl.TrimBarImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.widgets.Event;

import ch.hilbri.assist.application.gui.helpers.PathProvider;

/**
 * Handles visibility of the main and bottom toolbar -> this is a rather ugly workaround
 *  *
 */

@SuppressWarnings("restriction")
public class HandleToolbarAddon{
	 
	
	@Inject
	@Optional
	public void partActivation(@UIEventTopic(UIEvents.UILifeCycle.ACTIVATE) Event event, MApplication application, EModelService modelService) {
	  TrimBarImpl toolbar = (TrimBarImpl) modelService.find(PathProvider.ECL_MAIN_TOOLBAR, application);
	  if (toolbar != null) {
		  toolbar.setVisible(true);
	  }
	  toolbar = (TrimBarImpl) modelService.find(PathProvider.ECL_TRIM_STATUS, application);
	  if (toolbar != null) {
		  toolbar.setToBeRendered(true);
		  toolbar.setVisible(true);
	  }
	  
	  List<MToolControl> toolcontrols = modelService.findElements(toolbar, null, MToolControl.class, null);
	  for (MToolControl tmp: toolcontrols) {
		  tmp.setToBeRendered(true);
		  tmp.setVisible(true);
	  }
	} 
}
