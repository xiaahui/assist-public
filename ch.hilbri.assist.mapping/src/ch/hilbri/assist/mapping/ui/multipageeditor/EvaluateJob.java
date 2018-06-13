package ch.hilbri.assist.mapping.ui.multipageeditor;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.MappingResult;

public class EvaluateJob implements IRunnableWithProgress {

    private List<MappingResult> allResults;
    private List<AbstractMetric> selectedMetrics;
    private DetailedResults resultsView;

    public EvaluateJob(DetailedResults v, List<AbstractMetric> metrics) {
        this.allResults = v.getMappingResults();
        this.selectedMetrics = metrics;
        this.resultsView = v;
    }

    @Override
    public void run(IProgressMonitor monitor) {
        monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);

        ResultsAnalysis.evaluate(allResults, selectedMetrics);

        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                resultsView.setResultsList(allResults);
            }
        });

        monitor.done();
    }
}