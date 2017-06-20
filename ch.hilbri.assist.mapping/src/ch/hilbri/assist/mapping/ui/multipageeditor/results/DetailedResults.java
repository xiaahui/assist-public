package ch.hilbri.assist.mapping.ui.multipageeditor.results;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class DetailedResults extends Composite {
	private Text text;
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DetailedResults(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		setLayout(new GridLayout(1, false));
		
		Label lblResult = new Label(this, SWT.NONE);
		lblResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblResult.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblResult.setText("Result");
		
		Label lblTestTesTest = new Label(this, SWT.NONE);
		lblTestTesTest.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblTestTesTest.setText("Please select filter");
		
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		GridLayout gl_composite = new GridLayout(1, false);
		gl_composite.marginHeight = 0;
		gl_composite.marginWidth = 0;
		composite.setLayout(gl_composite);
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite.heightHint = 172;
		composite.setLayoutData(gd_composite);
		
		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = tableViewerColumn.getColumn();
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("New Column");
		
		Composite composite_2 = new Composite(this, SWT.NONE);
		composite_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		RowLayout rl_composite_2 = new RowLayout(SWT.HORIZONTAL);
		rl_composite_2.justify = true;
		rl_composite_2.wrap = false;
		composite_2.setLayout(rl_composite_2);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNewButton.setText("<<");
		
		Button btnNewButton_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNewButton_1.setText("< Previous");
		
		Button btnNewButton_2 = new Button(composite_2, SWT.NONE);
		btnNewButton_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNewButton_2.setText("Got to...");
		
		Button btnNewButton_3 = new Button(composite_2, SWT.NONE);
		btnNewButton_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNewButton_3.setText("Next >");
		
		Button btnNewButton_4 = new Button(composite_2, SWT.NONE);
		btnNewButton_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnNewButton_4.setText(">>");
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_composite_1.widthHint = 406;
		composite_1.setLayoutData(gd_composite_1);
		
		Label lblIAmDiagram = new Label(composite_1, SWT.CENTER);
		lblIAmDiagram.setText("I am diagram");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
