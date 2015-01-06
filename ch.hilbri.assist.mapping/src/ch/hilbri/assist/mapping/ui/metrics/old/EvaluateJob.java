package ch.hilbri.assist.mapping.ui.metrics.old;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.ui.metrics.MetricTableView;

class EvaluateJob implements IRunnableWithProgress {

	private MetricTableView metricTableView;
	private ArrayList<AbstractMetric>	analysis;

	public EvaluateJob(MetricTableView metricTableView, ArrayList<AbstractMetric> analysis) {
		this.metricTableView = metricTableView;
		this.analysis = analysis;
	}

	@Override
	public void run(IProgressMonitor monitor) {
		monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);
		
		if (metricTableView.getModel() != null) {
			ResultsAnalysis.evaluate(metricTableView.getModel().getResults(), analysis);
		
			Collections.sort(metricTableView.getModel().getResults());
		
			metricTableView.getModel().setResultsList(metricTableView.getModel().getResults());
		}
		
		monitor.done();
	}
}