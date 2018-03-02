package ch.hilbri.assist.mapping.ui.metrics;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

import ch.hilbri.assist.mapping.analysis.ResultsAnalysis;
import ch.hilbri.assist.mapping.ui.multipageeditor.MultiPageEditor;
import ch.hilbri.assist.model.AbstractMetric;
import ch.hilbri.assist.model.MappingResult;

class EvaluateJob implements IRunnableWithProgress {

	private List<MappingResult> allResults;
	private List<AbstractMetric> selectedMetrics;
	private MultiPageEditor currentEditor;

	public EvaluateJob(MultiPageEditor e) {
		this.allResults = e.getMappingResultsList();
		this.selectedMetrics = e.getSelectedMetricsList();
		this.currentEditor = e;
	}

	@Override
	public void run(IProgressMonitor monitor) {
		monitor.beginTask("Evaluating results...", IProgressMonitor.UNKNOWN);
		
		ResultsAnalysis.evaluate(allResults, selectedMetrics);
		
		Display.getDefault().syncExec(new Runnable() {
		    public void run() {
		    	currentEditor.setMappingResultsList(allResults);
		    }
		});
		
		monitor.done();
	}
}