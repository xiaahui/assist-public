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

import ch.hilbri.assist.mapping.solver.SearchType;

public class SearchParametersDialog extends TitleAreaDialog {

	private Text editMaxSolutions;
	private Text editMaxSearchTime;
	private Combo cbxMaxSearchTimeUnit;
	private Button btnStandardSearch;
	private Button btnRandomSearch;
	
	private long searchTime = 60;
	private String searchTimeItem = null;
	private int maxSolutions = 1;
	private SearchType selectedMode = SearchType.DEFAULT;
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public SearchParametersDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Please set the parameters for the search.");
		setTitle("Generate Deployments");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setBounds(0, 0, 336, 225);
		
		
		Label lblMaxSolutions = new Label(composite_1, SWT.NONE);
		lblMaxSolutions.setLocation(10, 10);
		lblMaxSolutions.setSize(94, 15);
		lblMaxSolutions.setText("Max. solutions:");
		
		editMaxSolutions = new Text(composite_1, SWT.BORDER | SWT.RIGHT);
		editMaxSolutions.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					int tmp = Integer.parseInt(editMaxSolutions.getText());
					maxSolutions = tmp;
				} catch (NumberFormatException exception) {
					editMaxSolutions.setText("1");
				}
			}
		});
		editMaxSolutions.setLocation(110, 10);
		editMaxSolutions.setSize(55, 21);
		editMaxSolutions.setText("" + maxSolutions);
		
		/* selection */
		Label lblMaxSearchTime = new Label(composite_1, SWT.NONE);
		lblMaxSearchTime.setLocation(10, 41);
		lblMaxSearchTime.setSize(94, 15);
		lblMaxSearchTime.setText("Max. search time:");
		
		editMaxSearchTime = new Text(composite_1, SWT.BORDER | SWT.RIGHT);
		editMaxSearchTime.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					int tmp = Integer.parseInt(editMaxSearchTime.getText());
					searchTime = tmp;
				} catch (NumberFormatException exception) {
					editMaxSearchTime.setText("1");
				}
			}
		});
		editMaxSearchTime.setLocation(110, 38);
		editMaxSearchTime.setSize(55, 21);
		editMaxSearchTime.setText("" + searchTime);
		
		cbxMaxSearchTimeUnit = new Combo(composite_1, SWT.NONE);
		cbxMaxSearchTimeUnit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = cbxMaxSearchTimeUnit.getSelectionIndex();
				searchTimeItem = cbxMaxSearchTimeUnit.getItem(index);
			}
		});
		cbxMaxSearchTimeUnit.setLocation(171, 38);
		cbxMaxSearchTimeUnit.setSize(55, 23);
		cbxMaxSearchTimeUnit.setItems(new String[] {"sec", "min"});
		cbxMaxSearchTimeUnit.select(0);
		searchTimeItem = cbxMaxSearchTimeUnit.getItem(0);
		
		Label lblSearchHeuristic = new Label(composite_1, SWT.NONE);
		lblSearchHeuristic.setBounds(10, 74, 94, 15);
		lblSearchHeuristic.setText("Search heuristic:");
		btnStandardSearch = new Button(composite_1, SWT.RADIO);
		btnStandardSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.DEFAULT;
			}
		});
		btnStandardSearch.setLocation(110, 74);
		btnStandardSearch.setSize(216, 16);
		btnStandardSearch.setSelection(true);
		btnStandardSearch.setText("Standard Search (Activity-based)");
		
		/* search time */
		
		/* selection */
		btnRandomSearch = new Button(composite_1, SWT.RADIO);
		btnRandomSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.RANDOM;
			}
		});
		btnRandomSearch.setBounds(110, 96, 190, 16);
		btnRandomSearch.setText("Random Search");
		
		Button btnMinDomainFirst = new Button(composite_1, SWT.RADIO);
		btnMinDomainFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.MIN_DOMAIN_FIRST;
			}
		});
		btnMinDomainFirst.setBounds(110, 119, 216, 16);
		btnMinDomainFirst.setText("Min. Domain first");
		
		Button btnMaxDegreeFirst = new Button(composite_1, SWT.RADIO);
		btnMaxDegreeFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.MAX_DEGREE_FIRST;
			}
		});
		btnMaxDegreeFirst.setBounds(110, 141, 216, 16);
		btnMaxDegreeFirst.setText("Max Degree first");
		
		Button btnHardestDislocalitiesFirst = new Button(composite_1, SWT.RADIO);
		btnHardestDislocalitiesFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.HARDEST_DISLOCALITIES_FIRST;
			}
		});
		btnHardestDislocalitiesFirst.setBounds(110, 164, 216, 16);
		btnHardestDislocalitiesFirst.setText("Hardest Dislocalities first");
		
		Button btnScarcestInterfaceTypesFirst = new Button(composite_1, SWT.RADIO);
		btnScarcestInterfaceTypesFirst.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedMode = SearchType.SCARCEST_IOTYPE_FIRST;
			}
		});
		btnScarcestInterfaceTypesFirst.setBounds(110, 186, 216, 16);
		btnScarcestInterfaceTypesFirst.setText("Scarcest Interface Types first");

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button btnSearch = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,	true);
		btnSearch.setText("Search");
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(342, 374);
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
