package ch.hilbri.assist.gui.splash;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

public class ASSISTSplashScreen extends Shell {

    /**
     * Create the shell.
     * 
     * @param display
     */
    public ASSISTSplashScreen(Display display) {
        super(display, SWT.TOOL | SWT.NO_TRIM);
        setBackgroundMode(SWT.INHERIT_FORCE);
        
        Image backgroundImage = ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/splash.bmp"); 
        Rectangle imageBounds = backgroundImage.getBounds();
      
        setBounds(imageBounds);

        setBackgroundImage(backgroundImage);
        setLayout(null);

        Label lblVersion = new Label(this, SWT.NONE);
        
        /* Make the font bold in a platform neutral way */
        FontDescriptor boldDescriptor = FontDescriptor.createFrom(lblVersion.getFont()).setStyle(SWT.BOLD);
        Font boldFont = boldDescriptor.createFont(display);
        
        lblVersion.setFont(boldFont);
        lblVersion.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        lblVersion.setBounds(10, 202, 430, 15);
        lblVersion.setText("Version: " + Platform.getBundle("ch.hilbri.assist.gui").getHeaders().get("Bundle-Version"));
        
        Label lblPlatform = new Label(this, SWT.NONE);
        lblPlatform.setFont(boldFont);
        lblPlatform.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
        lblPlatform.setBounds(10, 218, 430, 15);
        lblPlatform.setText("Platform: " + System.getProperty("os.name") + " " + System.getProperty("sun.arch.data.model") + "bit");
    }


    /**
     * Create contents of the shell.
     */
    protected void createContents() {
        setText("ASSIST");
    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }
}
