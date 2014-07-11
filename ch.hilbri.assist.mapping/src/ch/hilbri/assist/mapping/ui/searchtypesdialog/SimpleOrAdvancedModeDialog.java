package ch.hilbri.assist.mapping.ui.searchtypesdialog;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.mapping.solver.SearchType;

public class SimpleOrAdvancedModeDialog extends TitleAreaDialog {

	private Text solNrSimpleMode;
	private Text solNrAdvancedMode;
	private Text searchTimeAdvancedMode;
	private Combo timeUnitAdvancedMode;
	private Label lblNewLabel;
	private Button btnSimpleMode;
	private Button btnAdvancedMode;
	String infoSimpleModel = "Linear Search:\r\n\nUse this mode for a quick start. It will compute consecutive solutions and can give you a hint whether there are more solutions.";
	String infoAdvancedModel = "Random Search:\r\n\nUse this mode for finding different solutions (stochastic selection).";
	
	private long searchTime = 30;
	private int searchTimeUnit = 0;
	private String searchTimeItem = null;
	private int maxSolutions = 1000;
	private SearchType selectedMode = SearchType.CONSECUTIVE;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public SimpleOrAdvancedModeDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Start search for solutions");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setBounds(0, 0, 286, 153);
		
		Label lblNumberOfSolutionsAdvancedMode = new Label(composite_1, SWT.NONE);
		lblNumberOfSolutionsAdvancedMode.setLocation(27, 88);
		lblNumberOfSolutionsAdvancedMode.setSize(113, 15);
		lblNumberOfSolutionsAdvancedMode.setText("number of solutions:");
		
		
		/* + simple mode + */
		
		/* number of solutions */
		Label lblNumberOfSolutionsSimpleMode = new Label(composite_1, SWT.NONE);
		lblNumberOfSolutionsSimpleMode.setLocation(27, 32);
		lblNumberOfSolutionsSimpleMode.setSize(113, 15);
		lblNumberOfSolutionsSimpleMode.setText("number of solutions:");
		
		solNrSimpleMode = new Text(composite_1, SWT.BORDER | SWT.RIGHT);
		solNrSimpleMode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				maxSolutions = Integer.parseInt(solNrSimpleMode.getText());
			}
		});
		solNrSimpleMode.setLocation(153, 32);
		solNrSimpleMode.setSize(55, 21);
		solNrSimpleMode.setText(maxSolutions + "");
		
		/* selection */
		btnSimpleMode = new Button(composite_1, SWT.RADIO);
		btnSimpleMode.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblNewLabel.setText(infoSimpleModel); // Infotext anzeigen
				selectedMode = SearchType.CONSECUTIVE;
				maxSolutions = Integer.parseInt(solNrSimpleMode.getText());
				solNrSimpleMode.setEditable(true);
				solNrAdvancedMode.setEditable(false);
				searchTimeAdvancedMode.setEditable(false);
				timeUnitAdvancedMode.setEnabled(false);
			}
		});
		btnSimpleMode.setLocation(10, 10);
		btnSimpleMode.setSize(240, 16);
		btnSimpleMode.setSelection(true);
		btnSimpleMode.setText("Linear Search (Simple Mode)");		
		
		/* + advanced mode + */
		
		/* number of solutions */
		solNrAdvancedMode = new Text(composite_1, SWT.BORDER | SWT.RIGHT);
		solNrAdvancedMode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				maxSolutions = Integer.parseInt(solNrAdvancedMode.getText());
			}
		});
		solNrAdvancedMode.setLocation(153, 85);
		solNrAdvancedMode.setSize(55, 21);
		solNrAdvancedMode.setText(maxSolutions + "");
		solNrAdvancedMode.setEditable(false);
		
		/* search time */
		Label lblMaximumSearchTime = new Label(composite_1, SWT.NONE);
		lblMaximumSearchTime.setLocation(27, 118);
		lblMaximumSearchTime.setSize(126, 15);
		lblMaximumSearchTime.setText("Time out:");
		
		searchTimeAdvancedMode = new Text(composite_1, SWT.BORDER | SWT.RIGHT);
		searchTimeAdvancedMode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				searchTime = Integer.parseInt(searchTimeAdvancedMode.getText());
			}
		});
		searchTimeAdvancedMode.setLocation(153, 115);
		searchTimeAdvancedMode.setSize(55, 21);
		searchTimeAdvancedMode.setText(searchTime + "");
		searchTimeAdvancedMode.setEditable(false);
		
		timeUnitAdvancedMode = new Combo(composite_1, SWT.NONE);
		timeUnitAdvancedMode.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				searchTimeUnit = timeUnitAdvancedMode.getSelectionIndex();
				searchTimeItem = timeUnitAdvancedMode.getItem(searchTimeUnit);
			}
		});
		timeUnitAdvancedMode.setLocation(217, 114);
		timeUnitAdvancedMode.setSize(55, 23);
		timeUnitAdvancedMode.setItems(new String[] {"sec", "min"});
		timeUnitAdvancedMode.select(0);
		searchTimeItem = timeUnitAdvancedMode.getItem(0);
		timeUnitAdvancedMode.setEnabled(false);
		
		/* selection */
		btnAdvancedMode = new Button(composite_1, SWT.RADIO);
		btnAdvancedMode.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblNewLabel.setText(infoAdvancedModel); // Infotext anzeigen
				selectedMode = SearchType.RANDOM;
				maxSolutions = Integer.parseInt(solNrAdvancedMode.getText());
				solNrSimpleMode.setEditable(false);
				solNrAdvancedMode.setEditable(true);
				searchTimeAdvancedMode.setEditable(true);
				timeUnitAdvancedMode.setEnabled(true);
			}
		});
		btnAdvancedMode.setBounds(10, 70, 240, 16);
		btnAdvancedMode.setText("Random Search");
		
		/* + info text + */
		
		lblNewLabel = new Label(container, SWT.WRAP);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblNewLabel.setBounds(292, 10, 141, 133);
		lblNewLabel.setText(infoSimpleModel);

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		button.setText("Search");
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		return bindingContext;
	}
	
	/**
	 * 
	 * @return mode of the search, returns null, if a not defined/no mode is marked.
	 */
	public SearchType getMode() {
		return selectedMode;
	}
	
	
	public int getNumberOfSolutions() {
		return maxSolutions;
	}
	
	
	public long getSearchTime() {
		switch (searchTimeItem) {
		case "sec":
			return searchTime * 1000;
		case "min":
			return searchTime * 1000 * 60;
		default:
			break;
		}
		return 0;
	}
}
