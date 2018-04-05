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
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes;
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes;

public class SearchParametersDialog extends TitleAreaDialog {

	private Text editMaxSolutions;
	private Text editMaxSearchTime;
	private Combo cbxMaxSearchTimeUnit;
	private Label lblCoreExplanation;
	private Combo cbxCoreSelection;
	private Label lblTaskExplanation;
	private Combo cbxTaskSelection;

	private long searchTime = 60;
	private String searchTimeItem = null;
	private int maxSolutions = 10;
	private boolean savePartialSolution = false;
	private boolean noGoodRecordingBoard = false;
	private boolean verboseLogging = false;
	private boolean enableRestarts = false;
	private boolean enableMinimization = false;
	private int restartFailCount = 75;

	private VariableSelectorTypes variableSelector = VariableSelectorTypes.getDefault();
	private ValueSelectorTypes valueSelector = ValueSelectorTypes.getDefault();
	private Text txtFailCount;
	private Label lblFailCount;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public SearchParametersDialog(Shell parentShell) {
		super(parentShell);		
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("Please set the parameters for the search.");
		setTitle("Mapping Generation");
		getShell().setText("Mapping Generation");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_container.heightHint = 412;
		container.setLayoutData(gd_container);
		container.setLayout(new GridLayout(1, false));

		Group grpSolverLimits = new Group(container, SWT.NONE);
		grpSolverLimits.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpSolverLimits.setSize(584, 60);
		grpSolverLimits.setText("Limits");
		grpSolverLimits.setLayout(new GridLayout(6, false));

		Label lblMaxSolutions = new Label(grpSolverLimits, SWT.NONE);
		lblMaxSolutions.setText("Max. solutions:");

		editMaxSolutions = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		GridData gd_editMaxSolutions = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_editMaxSolutions.widthHint = 40;
		editMaxSolutions.setLayoutData(gd_editMaxSolutions);
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

		Label spacerLabel_1 = new Label(grpSolverLimits, SWT.NONE);
		GridData gd_spacerLabel_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_spacerLabel_1.widthHint = 60;
		spacerLabel_1.setLayoutData(gd_spacerLabel_1);
		Label lblMaxSearchTime = new Label(grpSolverLimits, SWT.NONE);
		lblMaxSearchTime.setText("Time out:");

		editMaxSearchTime = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		GridData gd_editMaxSearchTime = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_editMaxSearchTime.widthHint = 40;
		editMaxSearchTime.setLayoutData(gd_editMaxSearchTime);
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
		cbxMaxSearchTimeUnit.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		cbxMaxSearchTimeUnit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = cbxMaxSearchTimeUnit.getSelectionIndex();
				searchTimeItem = cbxMaxSearchTimeUnit.getItem(index);
			}
		});
		cbxMaxSearchTimeUnit.setItems(new String[] { "sec", "min" });
		cbxMaxSearchTimeUnit.select(0);

		searchTimeItem = cbxMaxSearchTimeUnit.getItem(0);

		Group grpStrategy = new Group(container, SWT.NONE);
		grpStrategy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpStrategy.setSize(584, 191);
		grpStrategy.setText("Strategy");
		grpStrategy.setLayout(new GridLayout(2, false));

		Label lblTaskSelection = new Label(grpStrategy, SWT.NONE);
		lblTaskSelection.setText("Task Selection:");

		/* selection */
		String[] taskSelectionStrategies = new String[VariableSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < VariableSelectorTypes.getSortedValues().size(); i++)
			taskSelectionStrategies[i] = VariableSelectorTypes.getSortedValues().get(i).getHumanReadableName();
		String[] coreSelectionStrategies = new String[ValueSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < ValueSelectorTypes.getSortedValues().size(); i++)
			coreSelectionStrategies[i] = ValueSelectorTypes.getSortedValues().get(i).getHumanReadableName();

		cbxTaskSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxTaskSelection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		cbxTaskSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				variableSelector = VariableSelectorTypes.getSortedValues().get(cbxTaskSelection.getSelectionIndex());
				lblTaskExplanation.setText(variableSelector.getHumanReadableExplanation());

				if (variableSelector.isValueSelectorRequired()) {
					cbxCoreSelection.setEnabled(true);
					cbxCoreSelection.deselectAll();
					cbxCoreSelection.select(0);
					lblCoreExplanation
							.setText(ValueSelectorTypes.getSortedValues().get(0).getHumanReadableExplanation());
				}

				else {
					cbxCoreSelection.setEnabled(false);
					cbxCoreSelection.deselectAll();
					lblCoreExplanation.setText("");
				}
			}
		});
		cbxTaskSelection.setItems(taskSelectionStrategies);
		new Label(grpStrategy, SWT.NONE);

		lblTaskExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		GridData gd_lblTaskExplanation = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_lblTaskExplanation.heightHint = 60;
		lblTaskExplanation.setLayoutData(gd_lblTaskExplanation);

		Label lblCoreselection = new Label(grpStrategy, SWT.NONE);
		lblCoreselection.setText("Core Selection:");

		cbxCoreSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxCoreSelection.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		cbxCoreSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valueSelector = ValueSelectorTypes.getSortedValues().get(cbxCoreSelection.getSelectionIndex());
				lblCoreExplanation.setText(valueSelector.getHumanReadableExplanation());
			}
		});
		cbxCoreSelection.setItems(coreSelectionStrategies);
		new Label(grpStrategy, SWT.NONE);

		lblCoreExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		GridData gd_lblCoreExplanation = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_lblCoreExplanation.heightHint = 60;
		lblCoreExplanation.setLayoutData(gd_lblCoreExplanation);

		cbxTaskSelection.select(0);
		cbxTaskSelection.notifyListeners(SWT.Selection, new Event());

		Group grpMiscellaneousOptions = new Group(container, SWT.NONE);
		grpMiscellaneousOptions.setLayout(new GridLayout(4, false));
		grpMiscellaneousOptions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		grpMiscellaneousOptions.setText("Miscellaneous Options");

		Button btnNoGoodRecordingRDC = new Button(grpMiscellaneousOptions, SWT.CHECK);
		btnNoGoodRecordingRDC.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1));
		btnNoGoodRecordingRDC.setText("Multiple solutions must differ in their mapping on the board-level");
		btnNoGoodRecordingRDC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				noGoodRecordingBoard = btnNoGoodRecordingRDC.getSelection();
			}
		});
		new Label(grpMiscellaneousOptions, SWT.NONE);

		Button btnEnableMinimization = new Button(grpMiscellaneousOptions, SWT.CHECK);
		btnEnableMinimization.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1));
		btnEnableMinimization.setEnabled(false);
		btnEnableMinimization.setSelection(true);
		btnEnableMinimization.setText("Enforce optimization during search");
		btnEnableMinimization.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				enableMinimization = btnEnableMinimization.getSelection();
			}
		});
		new Label(grpMiscellaneousOptions, SWT.NONE);

		Button btnEnableRestarts = new Button(grpMiscellaneousOptions, SWT.CHECK);
		btnEnableRestarts.setEnabled(false);
		btnEnableRestarts.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 4, 1));
		btnEnableRestarts.setSelection(true);
		btnEnableRestarts.setText("Allow restarts during search to improve result diversity");
		btnEnableRestarts.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				enableRestarts = btnEnableRestarts.getSelection();
				lblFailCount.setEnabled(enableRestarts);
				txtFailCount.setEnabled(enableRestarts);
			}
		});

		Label spacerLabel_2 = new Label(grpMiscellaneousOptions, SWT.NONE);
		GridData gd_spacerLabel_2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_spacerLabel_2.widthHint = 40;
		spacerLabel_2.setLayoutData(gd_spacerLabel_2);

		lblFailCount = new Label(grpMiscellaneousOptions, SWT.NONE);
		lblFailCount.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		lblFailCount.setEnabled(false);
		lblFailCount.setText("Fail count to trigger a restart:");

		txtFailCount = new Text(grpMiscellaneousOptions, SWT.BORDER | SWT.RIGHT);
		txtFailCount.setEditable(false);
		txtFailCount.setEnabled(false);
		txtFailCount.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		txtFailCount.setText("" + restartFailCount);
		txtFailCount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					int tmp = Integer.parseInt(txtFailCount.getText());
					restartFailCount = tmp;
				} catch (NumberFormatException exception) {
					txtFailCount.setText("75");
				}
			}
		});
		new Label(grpMiscellaneousOptions, SWT.NONE);

		Button btnSavePartialSolution = new Button(grpMiscellaneousOptions, SWT.CHECK);
		btnSavePartialSolution.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		btnSavePartialSolution.setEnabled(false);
		btnSavePartialSolution.setSelection(true);
		btnSavePartialSolution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				savePartialSolution = btnSavePartialSolution.getSelection();
			}
		});
		btnSavePartialSolution.setText("Save the best partial solution, if no complete solutions are found");
		new Label(grpMiscellaneousOptions, SWT.NONE);

		Button btnVerboseLoggingOutput = new Button(grpMiscellaneousOptions, SWT.CHECK);
		btnVerboseLoggingOutput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 3, 1));
		btnVerboseLoggingOutput.setEnabled(false);
		btnVerboseLoggingOutput.setSelection(false);
		btnVerboseLoggingOutput.setText("Detailed logging output");
		new Label(grpMiscellaneousOptions, SWT.NONE);
		btnVerboseLoggingOutput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				verboseLogging = btnVerboseLoggingOutput.getSelection();
			}
		});
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button btnSearch = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		btnSearch.setText("Search");
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(610, 644);
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		return bindingContext;
	}

	public ValueSelectorTypes getValueSelector() {
		if (variableSelector.isValueSelectorRequired())
			return valueSelector;
		else
			return null;
	}

	public VariableSelectorTypes getVariableSelector() {
		return variableSelector;
	}

	public boolean getVerboseLogging() {
		return verboseLogging;
	}

	public boolean getNoGoodRecordingRDC() {
		return noGoodRecordingBoard;
	}

	public int getNumberOfSolutions() {
		return maxSolutions;
	}

	public boolean getSavePartialSolution() {
		return savePartialSolution;
	}

	public boolean getEnableRestarts() {
		return enableRestarts;
	}

	public int getRestartFailCount() {
		return restartFailCount;
	}

	public boolean getEnableMinimization() {
		return enableMinimization;
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
