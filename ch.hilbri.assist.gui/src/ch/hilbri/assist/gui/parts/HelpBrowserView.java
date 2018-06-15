
package ch.hilbri.assist.gui.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.browser.LocationAdapter;
import org.eclipse.swt.browser.LocationEvent;

public class HelpBrowserView {
	private Browser browser;
	private Text txtURL;

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite = new Composite(parent, SWT.EMBEDDED);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		composite.setLayout(new GridLayout(3, false));

		ToolBar toolBarLeft = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
		toolBarLeft.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));

		ToolItem tltmGoBack = new ToolItem(toolBarLeft, SWT.NONE);
		tltmGoBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}
		});
		tltmGoBack.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/prev.gif"));

		ToolItem tltmGoHome = new ToolItem(toolBarLeft, SWT.NONE);
		tltmGoHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl("https://github.com/roberthilbrich/assist-public/wiki", "", new String[]{"user-agent: custom"});
			}
		});
		tltmGoHome.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/home.gif"));

		ToolItem tltmGoForward = new ToolItem(toolBarLeft, SWT.NONE);
		tltmGoForward.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}
		});
		tltmGoForward.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/next.gif"));
		
		txtURL = new Text(composite, SWT.BORDER);
		txtURL.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				browser.setUrl(txtURL.getText());
			}
		});
		txtURL.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		ToolBar toolBarRight = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
		toolBarRight.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		ToolItem tltmGo = new ToolItem(toolBarRight, SWT.NONE);
		tltmGo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl(txtURL.getText());
			}
		});
		tltmGo.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/run.gif"));

		browser = new Browser(composite, SWT.NONE);
		browser.addLocationListener(new LocationAdapter() {
			@Override
			public void changing(LocationEvent event) {
				txtURL.setText(event.location);
			}
		});
		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		browser.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		browser.setUrl("https://github.com/roberthilbrich/assist-public/wiki");

	}
}