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


	
	private long 		searchTime 			= 60;
	private String 		searchTimeItem 		= null;
	private int 		maxSolutions 		= 10;
	private boolean		savePartialSolution = false;
	private boolean		noGoodRecordingBoard= false;
	private boolean		verboseLogging		= false;
	private boolean 	enableRestarts		= false;
	private boolean		enableMinimization	= false;
	private int			restartFailCount	= 75;
	
	private VariableSelectorTypes variableSelector 	= VariableSelectorTypes.getDefault();
	private ValueSelectorTypes valueSelector = ValueSelectorTypes.getDefault();
	private Text txtFailCount;
	private Label lblFailCount;
	
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
		setTitle("Mapping Generation");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setBounds(0, 0, 604, 532);
		
		/* selection */
		
		Group grpSolverLimits = new Group(composite_1, SWT.NONE);
		grpSolverLimits.setText("Limits");
		grpSolverLimits.setBounds(10, 198, 584, 60);
		
		
		Label lblMaxSolutions = new Label(grpSolverLimits, SWT.NONE);
		lblMaxSolutions.setBounds(160, 23, 107, 21);
		lblMaxSolutions.setText("Max. solutions:");
		
		editMaxSolutions = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		editMaxSolutions.setBounds(266, 20, 55, 26);
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
		lblMaxSearchTime.setBounds(361, 23, 73, 21);
		lblMaxSearchTime.setText("Time out:");
		
		editMaxSearchTime = new Text(grpSolverLimits, SWT.BORDER | SWT.RIGHT);
		editMaxSearchTime.setBounds(440, 20, 55, 26);
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
		cbxMaxSearchTimeUnit.setBounds(501, 20, 73, 26);
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
		grpStrategy.setBounds(10, 10, 584, 191);
		
		Label lblSearchHeuristic = new Label(grpStrategy, SWT.NONE);
		lblSearchHeuristic.setBounds(22, 37, 131, 25);
		lblSearchHeuristic.setText("Interface Selection:");
		
		cbxTaskSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxTaskSelection.setBounds(159, 34, 415, 28);
		cbxTaskSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				variableSelector = VariableSelectorTypes.getSortedValues().get(cbxTaskSelection.getSelectionIndex());
				lblTaskExplanation.setText(variableSelector.getHumanReadableExplanation());
				
				if (variableSelector.isValueSelectorRequired()) {
					cbxCoreSelection.setEnabled(true);
					cbxCoreSelection.deselectAll();
					cbxCoreSelection.select(0);
					lblCoreExplanation.setText(ValueSelectorTypes.getSortedValues().get(0).getHumanReadableExplanation());
				}
				
				else {
					cbxCoreSelection.setEnabled(false);
					cbxCoreSelection.deselectAll();
					lblCoreExplanation.setText("");
				}
			}
		});
		String[] ifaceStrategies = new String[VariableSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < VariableSelectorTypes.getSortedValues().size(); i++) ifaceStrategies[i] = VariableSelectorTypes.getSortedValues().get(i).getHumanReadableName();
		cbxTaskSelection.setItems(ifaceStrategies);		
		
		lblTaskExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		lblTaskExplanation.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		lblTaskExplanation.setText("Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text ");
		lblTaskExplanation.setBounds(167, 65, 398, 37);
		
		Label lblPinselection = new Label(grpStrategy, SWT.NONE);
		lblPinselection.setText("Pin Selection:");
		lblPinselection.setBounds(22, 119, 131, 25);
		
		cbxCoreSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxCoreSelection.setBounds(159, 116, 415, 28);
		cbxCoreSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valueSelector = ValueSelectorTypes.getSortedValues().get(cbxCoreSelection.getSelectionIndex());
				lblCoreExplanation.setText(variableSelector.getHumanReadableExplanation());
			}
		});
		String[] pinStrategies = new String[ValueSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < ValueSelectorTypes.getSortedValues().size(); i++) pinStrategies[i] = ValueSelectorTypes.getSortedValues().get(i).getHumanReadableName();
		cbxCoreSelection.setItems(pinStrategies);		
		
		lblCoreExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		lblCoreExplanation.setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
		lblCoreExplanation.setText("Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text Text ");
		lblCoreExplanation.setBounds(167, 147, 398, 37);
		
		Group grpMiscOptions = new Group(composite_1, SWT.NONE);
		grpMiscOptions.setText("Miscellaneous");
		grpMiscOptions.setBounds(10, 264, 584, 191);
		
		Button btnSavePartialSolution = new Button(grpMiscOptions, SWT.CHECK);
		btnSavePartialSolution.setSelection(true);
		btnSavePartialSolution.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				savePartialSolution = btnSavePartialSolution.getSelection();
			}
		});
		btnSavePartialSolution.setBounds(35, 132, 539, 24);
		btnSavePartialSolution.setText("Save the best partial solution, if no complete solutions are found");
		
		Button btnNoGoodRecordingRDC = new Button(grpMiscOptions, SWT.CHECK);
		btnNoGoodRecordingRDC.setSelection(true);
		btnNoGoodRecordingRDC.setBounds(35, 106, 539, 24);
		btnNoGoodRecordingRDC.setText("Multiple solutions must differ in their mapping on the board-level");
		btnNoGoodRecordingRDC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				noGoodRecordingBoard = btnNoGoodRecordingRDC.getSelection();
			}
		});

		Button btnVerboseLoggingOutput = new Button(grpMiscOptions, SWT.CHECK);
		btnVerboseLoggingOutput.setSelection(false);
		btnVerboseLoggingOutput.setBounds(35, 158, 539, 24);
		btnVerboseLoggingOutput.setText("Detailed logging output");
		btnVerboseLoggingOutput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				verboseLogging = btnVerboseLoggingOutput.getSelection();
			}
		});

		Button btnEnableRestarts = new Button(grpMiscOptions, SWT.CHECK);
		btnEnableRestarts.setSelection(true);
		btnEnableRestarts.setBounds(35, 51, 405, 24);
		btnEnableRestarts.setText("Allow restarts during search to improve result diversity");
		btnEnableRestarts.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				enableRestarts = btnEnableRestarts.getSelection();
				lblFailCount.setEnabled(enableRestarts);
				txtFailCount.setEnabled(enableRestarts);
			}
		});
		
		lblFailCount = new Label(grpMiscOptions, SWT.NONE);
		lblFailCount.setBounds(63, 79, 203, 24);
		lblFailCount.setText("Fail count to trigger a restart:");
		
		txtFailCount = new Text(grpMiscOptions, SWT.BORDER | SWT.RIGHT);
		txtFailCount.setBounds(266, 76, 56, 26);
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

		Button btnEnableMinimization = new Button(grpMiscOptions, SWT.CHECK);
		btnEnableMinimization.setSelection(true);
		btnEnableMinimization.setBounds(35, 25, 539, 24);
		btnEnableMinimization.setText("Enforce optimization during search");
		btnEnableMinimization.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				enableMinimization = btnEnableMinimization.getSelection();
			}
		});
		
		searchTimeItem = cbxMaxSearchTimeUnit.getItem(0);

		cbxTaskSelection.select(0);
		cbxTaskSelection.notifyListeners(SWT.Selection, new Event());

		
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
		return new Point(610, 644);
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		return bindingContext;
	}
	
	public ValueSelectorTypes getValueSelector() {
		if (variableSelector.isValueSelectorRequired()) return valueSelector;
		else return null;
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
