package ch.hilbri.assist.mapping.ui.metrics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

import ch.hilbri.assist.datamodel.result.mapping.AbstractMetric;
import ch.hilbri.assist.datamodel.result.mapping.Result;
import ch.hilbri.assist.mapping.ui.multipageeditor.resultsview.model.DetailedResultsViewUiModel;

public class SortJob implements IRunnableWithProgress {
	private DetailedResultsViewUiModel model;
	private List<AbstractMetric> selectedMetrics;
	private SortCriteriaTypes type;

	public SortJob(DetailedResultsViewUiModel model, SortCriteriaTypes type) {
		this.model = model;
		this.selectedMetrics = model.getSelectedMetricsList();
		this.type = type;
	}

	public static Comparator<Result> CREATION_ORDER = new Comparator<Result>() {
		@Override
		public int compare(Result r1, Result r2) {
			return Integer.compare(r1.getSolutionFoundOrderId(), r2.getSolutionFoundOrderId());
		}
	};
	
	@Override
	public void run(IProgressMonitor monitor) {
		monitor.beginTask("Sorting results...", IProgressMonitor.UNKNOWN);
		
		if (model != null) {
			if (type == SortCriteriaTypes.SCORE) {
				Collections.sort(model.getResults());
			} else if (type == SortCriteriaTypes.CREATION_ORDER) {
				Collections.sort(model.getResults(), SortJob.CREATION_ORDER );
			}
			model.refreshResultsList();
		}
		
		monitor.done();
	}
}
