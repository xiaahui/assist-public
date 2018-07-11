package ch.hilbri.assist.dse.ui.evaluatesettings;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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

import ch.hilbri.assist.dse.ui.handlers.EvalDesignSpace.Mode;
import ch.hilbri.assist.mapping.analysis.metrics.builtin.RandomScore;
import ch.hilbri.assist.model.AbstractMetric;

public class EvaluateDesignSpaceSettingsDialog extends TitleAreaDialog {

    private Label lblSelectMetric;
    private Combo cbxSelectMetric;
    private Button btnFeasibilityCheckOnly;
    private Button btnFeasibilityAndScoring;
    private List<AbstractMetric> availableMetrics = new ArrayList<AbstractMetric>();
    private Mode currentMode = Mode.FEASIBILITY_ONLY;
    private AbstractMetric currentMetric;

    
    public EvaluateDesignSpaceSettingsDialog(Shell parentShell) {
        super(parentShell);
        
        /* Not all metrics make sense from a DSE perspective - 
         * most of the mapping metrics are more concerned with 
         * comparing different results with each other, while the 
         * DSE only tries to calculate one result for each product */
        availableMetrics.add(new RandomScore());
    }
    

    /**
     * Create contents of the dialog.
     * 
     * @param parent
     */
    @Override
    protected Control createDialogArea(Composite parent) {
        setMessage("Please set the parameters for the design space exploration");
        setTitle("Design Space Exploration");
        getShell().setText("Design Space Exploration");
        Composite area = (Composite) super.createDialogArea(parent);
        area.setLayout(new GridLayout(1, false));

        Group grpMode = new Group(area, SWT.NONE);
        grpMode.setLayout(new GridLayout(1, false));
        grpMode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpMode.setText("Mode");

        btnFeasibilityCheckOnly = new Button(grpMode, SWT.RADIO);
        btnFeasibilityCheckOnly.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                currentMode = Mode.FEASIBILITY_ONLY;
                lblSelectMetric.setEnabled(false);
                cbxSelectMetric.setEnabled(false);
                cbxSelectMetric.removeAll();
            }
        });
        btnFeasibilityCheckOnly.setSelection(true);
        btnFeasibilityCheckOnly.setText("Feasibility check only");

        btnFeasibilityAndScoring = new Button(grpMode, SWT.RADIO);
        btnFeasibilityAndScoring.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                currentMode = Mode.FEASIBILITY_AND_SCORING;
                lblSelectMetric.setEnabled(true);
                cbxSelectMetric.setEnabled(true);
                for (AbstractMetric metric : availableMetrics) {
                    cbxSelectMetric.add(metric.getName());
                }
                cbxSelectMetric.select(0);
                cbxSelectMetric.notifyListeners(SWT.Selection, new Event());
            }
        });
        GridData gd_btnFeasibilityAndScoring = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_btnFeasibilityAndScoring.verticalIndent = 10;
        btnFeasibilityAndScoring.setLayoutData(gd_btnFeasibilityAndScoring);
        btnFeasibilityAndScoring.setText("Feasibility and Scoring");

        lblSelectMetric = new Label(grpMode, SWT.NONE);
        lblSelectMetric.setEnabled(false);
        GridData gd_lblSelectMetric = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblSelectMetric.horizontalIndent = 20;
        lblSelectMetric.setLayoutData(gd_lblSelectMetric);
        lblSelectMetric.setText("Please select metric for scoring:");

        cbxSelectMetric = new Combo(grpMode, SWT.READ_ONLY);
        cbxSelectMetric.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                currentMetric = availableMetrics.get(cbxSelectMetric.getSelectionIndex());
            }
        });
        cbxSelectMetric.setEnabled(false);
        GridData gd_cbxSelectMetric = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_cbxSelectMetric.horizontalIndent = 20;
        cbxSelectMetric.setLayoutData(gd_cbxSelectMetric);

        return area;
    }

    public Mode getMode() {
        return currentMode;
    }
    
    public AbstractMetric getScoringMetric() {
        return currentMetric;
    }
}
