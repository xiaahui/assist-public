package ch.hilbri.assist.gui.splash.internal;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.BundleException;
import org.osgi.service.component.ComponentContext;

public class SplashServiceImpl {


	private Shell createSplashShell() {
		final Shell shell = new Shell(SWT.TOOL | SWT.NO_TRIM);
//		Image image = createBackgroundImage(shell);
//		shell.setBackgroundImage(image);
//		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
//		Rectangle imageBounds = image.getBounds();
//
//		/*
//		 * final GridLayout layout = new GridLayout(); layout.numColumns = 1;
//		 * layout.marginHeight = 40; layout.marginWidth = 20;
//		 * layout.verticalSpacing = 6; layout.horizontalSpacing = 6;
//		 * shell.setLayout(layout);
//		 */
//		textLabel = createTextLabel(shell);
//		textLabel.setForeground(new Color(null, 255, 255, 255));
//		textLabel.setFont(new Font(shell.getDisplay(),"Tahoma", 8, SWT.BOLD));
//				
//		if (textRect == null) {
//			textRect = new Rectangle(10, imageBounds.height - 100, imageBounds.width - 40, 40);
//		}
//		textLabel.setBounds(textRect);
//
//		if (totalWork != 0) {
//			progressBar = createProgressBar(shell);
//			if (progressRect == null) {
//				progressRect = new Rectangle(0, imageBounds.height - 14 - progressBar.getBorderWidth(),
//						imageBounds.width - progressBar.getBorderWidth(), 14);
//			}
//			progressBar.setBounds(progressRect);
//		}
//
//		shell.setSize(imageBounds.width, imageBounds.height);
//		shell.setLocation(getMonitorCenter(shell));
		return shell;
	}

	private Label createTextLabel(Composite parent) {
		Label label = new Label(parent, SWT.WRAP);
		/*
		 * GridData gd = new GridData(); gd.horizontalAlignment = SWT.FILL;
		 * gd.verticalAlignment = SWT.BOTTOM; gd.grabExcessHorizontalSpace =
		 * true; gd.grabExcessVerticalSpace = true; label.setLayoutData(gd);
		 */
//		if (textColor == null) {
//			textColor = parent.getDisplay().getSystemColor(SWT.COLOR_WHITE);
//		}
//		label.setForeground(textColor);
//		if (textFont == null) {
//			textFont = parent.getDisplay().getSystemFont();
//		}
//		label.setFont(textFont);
//
//		if (nextMessage != null) {
//			label.setText(nextMessage);
//		}
		return label;
	}

	
}
