package ch.hilbri.assist.mapping.ui.metrics;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

class EvaluateJob implements IRunnableWithProgress {

	private DetailedResultsViewUiModel model;
	private ArrayList<AbstractMetric> selectedMetrics;

	public EvaluateJob(DetailedResultsViewUiModel model) {
		this.model = model;
		this.selectedMetrics = model.getSelectedMetricsList();
	}

	@Override
	public void run(IProgressMonitor monitor) {
		monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);
		
		if (model != null) {
			ResultsAnalysis.evaluate(model.getResults(), selectedMetrics);
		
			Collections.sort(model.getResults());
		
			model.refreshResultsList();
		}
		
		monitor.done();
	}
}