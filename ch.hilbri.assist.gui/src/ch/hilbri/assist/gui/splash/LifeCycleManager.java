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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

public class LifeCycleManager {

    @PostContextCreate
    void postContextCreate(final IEventBroker eventBroker, IApplicationContext context, Display display) {
        Window.setDefaultImages(new Image[] { loadImage("icons/ASSIST-launcher-icon-16x16-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-32x32-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-48x48-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-64x64-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-128x128-32bit.bmp"),
                loadImage("icons/ASSIST-launcher-icon-256x256-32bit.bmp"), });

        final Shell shell = new ASSISTSplashScreen(display);

        // register for startup completed event and close the shell
        eventBroker.subscribe(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE, new EventHandler() {
            @Override
            public void handleEvent(Event event) {
                shell.close();
                shell.dispose();
                eventBroker.unsubscribe(this);
            }
        });

        context.applicationRunning();
        setLocation(display, shell);
        shell.open();
    }

    private Image loadImage(String path) {
        Bundle bundle = FrameworkUtil.getBundle(this.getClass());
        URL url = FileLocator.find(bundle, new Path(path), null);
        ImageDescriptor imageDescr = ImageDescriptor.createFromURL(url);
        return imageDescr.createImage();
    }
    
    private void setLocation(Display display, Shell shell) {
        Monitor monitor = display.getPrimaryMonitor();
        Rectangle monitorRect = monitor.getBounds();
        Rectangle shellRect = shell.getBounds();
        int x = monitorRect.x + (monitorRect.width - shellRect.width) / 2;
        int y = monitorRect.y + (monitorRect.height - shellRect.height) / 2;
        shell.setLocation(x, y);
    }
}
