package ch.hilbri.assist.mapping.ui.metrics;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;


class EvaluateJob implements IRunnableWithProgress {

//	private DetailedResultsViewUiModel model;
//	private List<AbstractMetric> selectedMetrics;

//	public EvaluateJob(DetailedResultsViewUiModel model) {
//		this.model = model;
//		this.selectedMetrics = model.getSelectedMetricsList();
//	}

	@Override
	public void run(IProgressMonitor monitor) {
		monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);
		
//		if (model != null) {
//			ResultsAnalysis.evaluate(model.getResults(), selectedMetrics);
		
//			Collections.sort(model.getResults());
		
//			model.refreshResultsList();
//		}
		
		monitor.done();
	}
}