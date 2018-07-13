package ch.hilbri.assist.dse.ui.evaluatesettings;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.wb.swt.ResourceManager;

import ch.hilbri.assist.dse.analysis.metrics.builtin.RandomScore;
import ch.hilbri.assist.dse.ui.handlers.EvalDesignSpace.Mode;
import ch.hilbri.assist.dse.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.model.AbstractDSEMetric;
import ch.hilbri.assist.model.impl.AbstractDSEMetricImpl;

public class EvaluateDesignSpaceSettingsDialog extends TitleAreaDialog {

    private Label lblSelectMetric;
    private Combo cbxSelectMetric;
    private Button btnFeasibilityCheckOnly;
    private Button btnFeasibilityAndScoring;
    private Button btnLoadCustomMetrics;

    private List<AbstractDSEMetric> availableMetrics = new ArrayList<AbstractDSEMetric>();
    private AbstractDSEMetric currentMetric;
    private Mode currentMode = Mode.FEASIBILITY_ONLY;

    /**
     * Standard Constructor
     * 
     * @param parentShell
     */
    public EvaluateDesignSpaceSettingsDialog(Shell parentShell) {
        super(parentShell);
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
        Composite container = new Composite(area, SWT.NONE);
        GridData gd_container = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
        container.setLayoutData(gd_container);
        container.setLayout(new GridLayout(1, false));

        Group grpMode = new Group(container, SWT.NONE);
        grpMode.setLayout(new GridLayout(2, false));
        grpMode.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        grpMode.setText("Mode");

        btnFeasibilityCheckOnly = new Button(grpMode, SWT.RADIO);
        btnFeasibilityCheckOnly.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                currentMode = Mode.FEASIBILITY_ONLY;
                lblSelectMetric.setEnabled(false);
                cbxSelectMetric.setEnabled(false);
                btnLoadCustomMetrics.setEnabled(false);
                removeAllMetrics();
            }
        });
        btnFeasibilityCheckOnly.setSelection(true);
        btnFeasibilityCheckOnly.setText("Feasibility check only");
        new Label(grpMode, SWT.NONE);

        btnFeasibilityAndScoring = new Button(grpMode, SWT.RADIO);
        btnFeasibilityAndScoring.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                currentMode = Mode.FEASIBILITY_AND_SCORING;
                lblSelectMetric.setEnabled(true);
                cbxSelectMetric.setEnabled(true);
                btnLoadCustomMetrics.setEnabled(true);
                fillBuiltinMetrics();
                cbxSelectMetric.select(0);
                cbxSelectMetric.notifyListeners(SWT.Selection, new Event());
            }
        });
        GridData gd_btnFeasibilityAndScoring = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_btnFeasibilityAndScoring.verticalIndent = 10;
        btnFeasibilityAndScoring.setLayoutData(gd_btnFeasibilityAndScoring);
        btnFeasibilityAndScoring.setText("Feasibility and Scoring");
        new Label(grpMode, SWT.NONE);

        lblSelectMetric = new Label(grpMode, SWT.NONE);
        lblSelectMetric.setEnabled(false);
        GridData gd_lblSelectMetric = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_lblSelectMetric.horizontalIndent = 20;
        lblSelectMetric.setLayoutData(gd_lblSelectMetric);
        lblSelectMetric.setText("Please select metric for scoring:");
        new Label(grpMode, SWT.NONE);

        cbxSelectMetric = new Combo(grpMode, SWT.READ_ONLY);
        cbxSelectMetric.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if (availableMetrics.size() > 0)
                    currentMetric = availableMetrics.get(cbxSelectMetric.getSelectionIndex());
            }
        });
        cbxSelectMetric.setEnabled(false);
        GridData gd_cbxSelectMetric = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
        gd_cbxSelectMetric.horizontalIndent = 20;
        cbxSelectMetric.setLayoutData(gd_cbxSelectMetric);
        
        btnLoadCustomMetrics = new Button(grpMode, SWT.NONE);
        btnLoadCustomMetrics.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                // Determine the location where we have to look for new metrics
                MultiPageEditor currentEditor = (MultiPageEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getActiveEditor();
                IFileEditorInput input = (IFileEditorInput) currentEditor.getEditorInput();
                IProject activeProject = input.getFile().getProject();
                IPath activeProjectPath = activeProject.getLocation();
                IPath metricsPath = activeProjectPath.append("Compiled-metrics/");

                // Triggering a build for this project
                try {
                    activeProject.build(IncrementalProjectBuilder.FULL_BUILD, null);
                } catch (CoreException buildException) {
                    buildException.printStackTrace();
                    return;
                }

                // Asking the user which metric is to be imported and preselect
                // all entries
                CompiledMetricsProvider dataProvider = new CompiledMetricsProvider();
                ListSelectionDialog dialog = new ListSelectionDialog(currentEditor.getSite().getShell(),
                        metricsPath.append("metrics/dse"), dataProvider, new LabelProvider(),
                        "Select the metrics which you want to import:");
                dialog.setTitle("Metric selection");
                dialog.setInitialSelections(dataProvider.getElements(metricsPath.append("metrics/dse")));
                if (dialog.open() != Window.OK)
                    return;

                // Clear the old metrics
                removeAllMetrics();

                // Add the metrics that are already part of ASSIST
                fillBuiltinMetrics();

                // Add the metrics that were custom
                String[] classNames = Arrays.copyOf(dialog.getResult(), dialog.getResult().length, String[].class);
                fillCustomMetrics(metricsPath, classNames);
            }
        });

        btnLoadCustomMetrics.setEnabled(false);
        btnLoadCustomMetrics.setImage(ResourceManager.getPluginImage("ch.hilbri.assist.dse", "icons/refresh.gif"));
        btnLoadCustomMetrics.setText("Load custom metrics");

        return area;
    }

    public Mode getMode() {
        return currentMode;
    }

    public AbstractDSEMetric getScoringMetric() {
        return currentMetric;
    }

    private void removeAllMetrics() {
        availableMetrics.clear();
        cbxSelectMetric.removeAll();
    }

    private void fillBuiltinMetrics() {
        availableMetrics.add(new RandomScore());
        
        // Filling the combobox with available builtin metrics
        for (AbstractDSEMetric metric : availableMetrics) {
            if (metric.isBuiltIn())
                cbxSelectMetric.add(metric.getName());
        }
        
        // Check if we should have at least one metric and select the first
        if (availableMetrics.size() > 0)
            cbxSelectMetric.select(0);
    }

    private void fillCustomMetrics(IPath metricsPath, String[] classNames) {
        List<AbstractDSEMetric> newCustomMetrics = new ArrayList<AbstractDSEMetric>();
        try {
            // Create the classloader for our new metrics
            URL url = new URL("file://" + metricsPath.toPortableString());
            URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { url }, getClass().getClassLoader());

            for (String className : classNames) {

                // Get the new class
                Class<? extends AbstractDSEMetricImpl> metricClass = Class
                        .forName("metrics.dse." + className, true, classLoader).asSubclass(AbstractDSEMetricImpl.class);
                classLoader.close();

                // Create a new instance of this metric
                AbstractDSEMetric metric = metricClass.getDeclaredConstructor().newInstance();

                // Add the newly created metric to the temporary list of
                // found metrics
                newCustomMetrics.add(metric);
            }

        } catch (ClassNotFoundException | IOException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException exception) {
            exception.printStackTrace();
        }

        // Add these new custom metrics to the UI
        availableMetrics.addAll(newCustomMetrics);
        for (AbstractDSEMetric metric : newCustomMetrics)
            cbxSelectMetric.add(metric.getName());
        
        // Check if we should have at least one metric and select the first
        if (availableMetrics.size() > 0)
            cbxSelectMetric.select(0);
        
    }
}
