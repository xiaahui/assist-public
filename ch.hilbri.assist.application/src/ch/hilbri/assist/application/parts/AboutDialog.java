package ch.hilbri.assist.application.parts;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * Dialog which will show up after entering the "Help->About" menu.
 *
 */
public class AboutDialog extends TitleAreaDialog {

	public static String versionNumber = "1.0";
	
	@Inject
	public AboutDialog(
		@Named(IServiceConstants.ACTIVE_SHELL) Shell parentShell) {
		super(parentShell);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {

		Composite area = (Composite) super.createDialogArea(parent);
		
		Image ppImage;
		URL url;
		InputStream in = null;
		url = getClass().getResource("/icons/PP_logo.png");
		try {
			in = url.openStream();
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
		ppImage = new Image(getShell().getDisplay(), in);
		
		setTitleImage(ppImage);
		
		Composite container = new Composite(area, SWT.NONE);
	    GridLayout layout = new GridLayout(1, false);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(layout);
	    
	    
	    Label lbtVersion = new Label(container, SWT.NONE);
	    lbtVersion.setText("Version: " + versionNumber);

	    Label lbtCpr = new Label(container, SWT.NONE);
	    lbtCpr.setText("(c) Copyright by Robert Hilbrich. All rights reserved.");
	    
		return area;
	}  
	
	
	
	@Override
	protected Control createButtonBar(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		// create a layout with spacing and margins appropriate for the font
		// size.
		GridLayout layout = new GridLayout();
		layout.numColumns = 0; // this is incremented by createButton
		layout.makeColumnsEqualWidth = true;
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		composite.setLayout(layout);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_END
				| GridData.VERTICAL_ALIGN_CENTER);
		composite.setLayoutData(data);
		composite.setFont(parent.getFont());
		
		createButton(composite, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		
		return composite;
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
	  super.configureShell(newShell);
	  newShell.setText("About ASSIST");
	}

	
	
	@Override
	protected Point getInitialSize() {
	  return new Point(600, 375);
	}

}
