package ch.hilbri.assist.gui.splash;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

@SuppressWarnings("restriction")
public class LifeCycleManager {

    @PostContextCreate
    void postContextCreate(final IEventBroker eventBroker, IApplicationContext context) {
        Window.setDefaultImages(new Image[] { 
                loadImage("icons/ASSIST-launcher-icon-16x16-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-32x32-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-48x48-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-64x64-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-128x128-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-256x256-32bit.bmp"), });

        final Shell shell = new Shell(SWT.SHELL_TRIM);
        
     // register for startup completed event and close the shell
        eventBroker.subscribe(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE,
                new EventHandler() {
                    @Override
                    public void handleEvent(Event event) {
                        shell.close();
                        shell.dispose();
                        eventBroker.unsubscribe(this);
                    }
                });
        
        context.applicationRunning();
        
    
    }
    
//    @PostContextCreate
//    void postContextCreate(final ISplashService splashService, final IEventBroker eventBroker) {
//
//    
//        splashService.setSplashPluginId("ch.hilbri.assist.gui");
//        splashService.setSplashImagePath("icons/splash.bmp");
//        splashService.open();
//        splashService.setMessage("Version: "
//                + Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version") + "\n" + "Platform: "
//                + System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit");
//
//        eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE, new EventHandler() {
//            @Override
//            public void handleEvent(Event event) {
//                splashService.close();
//                eventBroker.unsubscribe(this);
//            }
//        });
//    }

    private Image loadImage(String path) {
        Bundle bundle = FrameworkUtil.getBundle(this.getClass());
        URL url = FileLocator.find(bundle, new Path(path), null);
        ImageDescriptor imageDescr = ImageDescriptor.createFromURL(url);
        return imageDescr.createImage();
    }
}
