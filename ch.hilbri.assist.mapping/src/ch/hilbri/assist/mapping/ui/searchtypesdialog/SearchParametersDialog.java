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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import ch.hilbri.assist.mapping.solver.SearchType;

public class SearchParametersDialog extends TitleAreaDialog {

	private Text editMaxSolutions;
	private Text editMaxSearchTime;
	private Combo cbxMaxSearchTimeUnit;
	private Label lblExplanationText;
	
	private long 		searchTime 			= 60;
	private String 		searchTimeItem 		= null;
	private int 		maxSolutions 		= 1;
	private SearchType 	selectedSearchType 	= SearchType.getDefaultSearchType();
	private boolean		savePartialSolution = true;
	
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
		composite_1.setBounds(0, 0, 514, 351);
		
		/* selection */
		
		Group grpSolverLimits = new Group(composite_1, SWT.NONE);
		grpSolverLimits.setText("Limits");
		grpSolverLimits.setBounds(10, 153, 494, 81);
		
		
		Label lblMaxSolutions = new Label(grpSolverLimits, SWT.NONE);
		lblMaxSolutions.setBounds(22, 23, 82, 15);
		lblMaxSolutions.setText("Max. solutions:");
		
		editMaxSolutions = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		editMaxSolutions.setBounds(110, 20, 55, 21);
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
		editMaxSolutions.setText("" + maxSolutions);
		Label lblMaxSearchTime = new Label(grpSolverLimits, SWT.NONE);
		lblMaxSearchTime.setBounds(22, 50, 82, 15);
		lblMaxSearchTime.setText("Time out:");
		
		editMaxSearchTime = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		editMaxSearchTime.setBounds(110, 47, 55, 21);
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
		editMaxSearchTime.setText("" + searchTime);
		
		cbxMaxSearchTimeUnit = new Combo(grpSolverLimits, SWT.READ_ONLY);
		cbxMaxSearchTimeUnit.setBounds(171, 47, 55, 23);
		cbxMaxSearchTimeUnit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = cbxMaxSearchTimeUnit.getSelectionIndex();
				searchTimeItem = cbxMaxSearchTimeUnit.getItem(index);
			}
		});
		cbxMaxSearchTimeUnit.setItems(new String[] {"sec", "min"});
		cbxMaxSearchTimeUnit.select(0);
		
		Group grpStrategy = new Group(composite_1, SWT.NONE);
		grpStrategy.setText("Strategy");
		grpStrategy.setBounds(10, 10, 494, 137);
		
		Label lblSearchHeuristic = new Label(grpStrategy, SWT.NONE);
		lblSearchHeuristic.setBounds(22, 28, 82, 15);
		lblSearchHeuristic.setText("Heuristic:");
		
		Combo cbxSearchHeuristics = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxSearchHeuristics.setBounds(110, 25, 374, 23);
		cbxSearchHeuristics.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedSearchType = SearchType.getSortedValues().get(cbxSearchHeuristics.getSelectionIndex());
				lblExplanationText.setText(selectedSearchType.getHumanReadableExplanation());
			}
		});
		String[] items = new String[SearchType.getSortedValues().size()];
		for (int i = 0; i < SearchType.getSortedValues().size(); i++) items[i] = SearchType.getSortedValues().get(i).getHumanReadableName();
		cbxSearchHeuristics.setItems(items);		
		cbxSearchHeuristics.select(0);
		
		Label lblExplanation = new Label(grpStrategy, SWT.NONE);
		lblExplanation.setBounds(22, 59, 82, 15);
		lblExplanation.setText("Explanation:");
		
		lblExplanationText = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		lblExplanationText.setBounds(110, 59, 374, 68);
		lblExplanationText.setText(selectedSearchType.getHumanReadableExplanation());
		
		Group grpMiscOptions = new Group(composite_1, SWT.NONE);
		grpMiscOptions.setText("Miscellaneous");
		grpMiscOptions.setBounds(10, 245, 494, 96);
		
		Button btnSavePartialSolution = new Button(grpMiscOptions, SWT.CHECK);
		btnSavePartialSolution.setSelection(true);
		btnSavePartialSolution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				savePartialSolution = btnSavePartialSolution.getSelection();
			}
		});
		btnSavePartialSolution.setBounds(49, 43, 223, 16);
		btnSavePartialSolution.setText("Save the best partial solution");
		
		Label lblIfNoSolutions = new Label(grpMiscOptions, SWT.NONE);
		lblIfNoSolutions.setBounds(27, 22, 335, 15);
		lblIfNoSolutions.setText("When no solutions are found during the specified time limit:");
		searchTimeItem = cbxMaxSearchTimeUnit.getItem(0);

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
		return new Point(520, 498);
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		return bindingContext;
	}
	
	/**
	 * 
	 * @return mode of the search, returns null, if a not defined/no mode is marked.
	 */
	public SearchType getSearchType() {
		return selectedSearchType;
	}
	
	
	public int getNumberOfSolutions() {
		return maxSolutions;
	}
		
	public boolean getSavePartialSolution() {
		return savePartialSolution;
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
