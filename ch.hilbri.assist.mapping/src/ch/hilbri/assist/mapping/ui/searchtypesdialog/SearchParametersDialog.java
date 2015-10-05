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

import ch.hilbri.assist.mapping.solver.strategies.ValueSelectorTypes;
import ch.hilbri.assist.mapping.solver.strategies.VariableSelectorTypes;

public class SearchParametersDialog extends TitleAreaDialog {

	private Text editMaxSolutions;
	private Text editMaxSearchTime;
	private Combo cbxMaxSearchTimeUnit;
	private Combo cbxPinSelection;
	private Label lblInterfaceExplanation;
	private Combo cbxInterfaceSelection;
	private Label lblPinExplanation;

	
	private long 		searchTime 			= 60;
	private String 		searchTimeItem 		= null;
	private int 		maxSolutions 		= 1;
	private boolean		savePartialSolution = true;
	private VariableSelectorTypes variableSelector 	= VariableSelectorTypes.getDefault();
	private ValueSelectorTypes valueSelector = ValueSelectorTypes.getDefault();

	
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
		composite_1.setBounds(0, 0, 517, 409);
		
		/* selection */
		
		Group grpSolverLimits = new Group(composite_1, SWT.NONE);
		grpSolverLimits.setText("Limits");
		grpSolverLimits.setBounds(10, 231, 495, 81);
		
		
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
		grpStrategy.setBounds(10, 10, 495, 215);
		
		Label lblSearchHeuristic = new Label(grpStrategy, SWT.NONE);
		lblSearchHeuristic.setBounds(22, 28, 107, 15);
		lblSearchHeuristic.setText("Interface Selection:");
		
		cbxInterfaceSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxInterfaceSelection.setBounds(130, 25, 348, 23);
		cbxInterfaceSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				variableSelector = VariableSelectorTypes.getSortedValues().get(cbxInterfaceSelection.getSelectionIndex());
				lblInterfaceExplanation.setText(variableSelector.getHumanReadableExplanation());
				
				if (variableSelector.isValueSelectorRequired()) {
					cbxPinSelection.setEnabled(true);
					cbxPinSelection.deselectAll();
					cbxPinSelection.select(0);
					lblPinExplanation.setText(ValueSelectorTypes.getSortedValues().get(0).getHumanReadableExplanation());
				}
				
				else {
					cbxPinSelection.setEnabled(false);
					cbxPinSelection.deselectAll();
					lblPinExplanation.setText("");
				}
			}
		});
		String[] ifaceStrategies = new String[VariableSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < VariableSelectorTypes.getSortedValues().size(); i++) ifaceStrategies[i] = VariableSelectorTypes.getSortedValues().get(i).getHumanReadableName();
		cbxInterfaceSelection.setItems(ifaceStrategies);		
		cbxInterfaceSelection.select(0);
		
		lblInterfaceExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		lblInterfaceExplanation.setBounds(130, 62, 348, 50);
		lblInterfaceExplanation.setText(VariableSelectorTypes.getSortedValues().get(0).getHumanReadableExplanation());
		
		Label lblPinselection = new Label(grpStrategy, SWT.NONE);
		lblPinselection.setText("Pin Selection:");
		lblPinselection.setBounds(22, 118, 107, 15);
		
		cbxPinSelection = new Combo(grpStrategy, SWT.READ_ONLY);
		cbxPinSelection.setBounds(130, 115, 348, 23);
		cbxPinSelection.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				valueSelector = ValueSelectorTypes.getSortedValues().get(cbxPinSelection.getSelectionIndex());
				lblPinExplanation.setText(variableSelector.getHumanReadableExplanation());
			}
		});
		String[] pinStrategies = new String[ValueSelectorTypes.getSortedValues().size()];
		for (int i = 0; i < ValueSelectorTypes.getSortedValues().size(); i++) pinStrategies[i] = ValueSelectorTypes.getSortedValues().get(i).getHumanReadableName();
		cbxPinSelection.setItems(pinStrategies);		
		cbxPinSelection.select(0);
		
		
		lblPinExplanation = new Label(grpStrategy, SWT.WRAP | SWT.SHADOW_IN);
		lblPinExplanation.setText(ValueSelectorTypes.getSortedValues().get(0).getHumanReadableExplanation());
		lblPinExplanation.setBounds(130, 153, 348, 55);
		
		// Disable value selector if no one is needed
		if (VariableSelectorTypes.getSortedValues().get(0).isValueSelectorRequired() == false) {
			cbxPinSelection.setEnabled(false);
			cbxPinSelection.deselectAll();
			lblPinExplanation.setText("");
		}
		
		Group grpMiscOptions = new Group(composite_1, SWT.NONE);
		grpMiscOptions.setText("Miscellaneous");
		grpMiscOptions.setBounds(10, 318, 495, 81);
		
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
		return new Point(520, 556);
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
