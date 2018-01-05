package ch.hilbri.assist.scheduling.ui.multipageeditor;

import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class DetailedResults extends Composite {
	@SuppressWarnings("unused")
	private MultiPageEditor multiPageEditor;
	
	@SuppressWarnings("unused")
	public DetailedResults(MultiPageEditor mpe, Composite parent, int style) {
		super(parent, style);
		multiPageEditor = mpe;
		
		setLayout(new FillLayout(SWT.HORIZONTAL));
		Composite composite = new Composite(this, SWT.NONE);
		GanttChart ganttChart = new GanttChart(composite, SWT.NONE);
	}
}
