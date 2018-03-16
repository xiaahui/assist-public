
package ch.hilbri.assist.gui.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class HelpBrowserView {
	private Browser browser;

	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		Composite composite = new Composite(parent, SWT.EMBEDDED);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		composite.setLayout(new GridLayout(1, false));

		ToolBar toolBar = new ToolBar(composite, SWT.FLAT | SWT.RIGHT);
		toolBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));

		ToolItem tltmGoBack = new ToolItem(toolBar, SWT.NONE);
		tltmGoBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}
		});
		tltmGoBack.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/prev.gif"));

		ToolItem tltmGoHome = new ToolItem(toolBar, SWT.NONE);
		tltmGoHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl("https://github.com/roberthilbrich/assist-public/wiki");
			}
		});
		tltmGoHome.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/home.gif"));

		ToolItem tltmGoForward = new ToolItem(toolBar, SWT.NONE);
		tltmGoForward.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}
		});
		tltmGoForward.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.gui", "icons/next.gif"));

		browser = new Browser(composite, SWT.NONE);
		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		browser.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		browser.setUrl("https://github.com/roberthilbrich/assist-public/wiki");
	}
}