package ch.hilbri.assist.gui.splash;

import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

@SuppressWarnings("restriction")
public class LifeCycleManager {
	
	   @PostContextCreate
	   void postContextCreate(final ISplashService splashService, final IEventBroker eventBroker) {
			splashService.setSplashPluginId("ch.hilbri.assist.gui");
			splashService.setSplashImagePath("icons/splash.bmp");
			splashService.open();
			splashService.setMessage(
					"Version: " + Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version") + "\n" +
					"Platform: " + System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit");
			
			eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE, new EventHandler() {
				@Override
				public void handleEvent(Event event) {
					splashService.close();
					eventBroker.unsubscribe(this);
				}
			});
	   }
}
