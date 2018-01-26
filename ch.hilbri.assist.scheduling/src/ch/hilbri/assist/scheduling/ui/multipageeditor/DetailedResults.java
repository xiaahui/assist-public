package ch.hilbri.assist.scheduling.ui.multipageeditor;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttFlags;
import org.eclipse.nebula.widgets.ganttchart.GanttGroup;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.nebula.widgets.ganttchart.IColorManager;
import org.eclipse.nebula.widgets.ganttchart.ISettings;
import org.eclipse.nebula.widgets.ganttchart.themes.ColorThemeWindowsBlue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;

import ch.hilbri.assist.scheduling.model.AssistModelSchedulingResult;
import ch.hilbri.assist.scheduling.model.Core;
import ch.hilbri.assist.scheduling.model.Task;
import ch.hilbri.assist.scheduling.model.TaskExecutionInstance;

public class DetailedResults extends Composite {
	@SuppressWarnings("unused")
	private MultiPageEditor multiPageEditor;
	private GanttChart ganttChart;
	private Composite ganttComposite;	
	
	/* Settings for the Gantt-Chart */
	private final int ganttFlags 				= GanttFlags.H_SCROLL_FIXED_RANGE | SWT.SINGLE;
	private final ISettings ganttSettings 		= new GanttSettings();
	private final IColorManager ganttColorTheme = new ColorThemeWindowsBlue();

	public DetailedResults(MultiPageEditor mpe, Composite parent, int style) {
		super(parent, style);
		multiPageEditor = mpe;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		ganttComposite = new Composite(this, SWT.NONE);
		ganttComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
		ganttChart.getGanttComposite().setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
	}
	
	
	
	public void setResult(AssistModelSchedulingResult result) {
		
		/* Remove the old chart and create a new one */
		ganttChart.dispose();
		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
		ganttChart.getGanttComposite().setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));

		/* Create the sections for all cores */
		Map<Core, GanttSection> coreSections = new HashMap<Core, GanttSection>();
		for (Core core : result.getModel().getAllCores()) 
			coreSections.put(core, new GanttSection(ganttChart, core.getFullName()));
		
		/* Create all the events */
		for (Task task : result.getModel().getAllTasks()) {
			/* Is there a schedule for this task in the result? */
			if (result.getSchedule().containsKey(task)) {
				/* Create all events for this task */
				List<TaskExecutionInstance> taskSchedule = result.getSchedule().get(task);
				GanttSection coreSection = coreSections.get(task.getAssignedCore());
				createEventsForExecutionInstances(task, taskSchedule, coreSection);
			}
		}
			
		/* This is necessary to avoid redraw problems */
		layout(true, true);
	}
	
	private void createEventsForExecutionInstances(Task task, List<TaskExecutionInstance> schedule, GanttSection coreSection) {
		Calendar cal = (Calendar) ganttChart.getSettings().getDDayRootCalendar().clone();

		GanttGroup group = new GanttGroup(ganttChart);
		for (TaskExecutionInstance instance : schedule) {
			final Calendar start = (Calendar) cal.clone();
			start.add(Calendar.DATE, instance.getBegin());

			final Calendar end = (Calendar) cal.clone();
			end.add(Calendar.DATE, instance.getEnd()-1);

			String eventName = task.getApplication().getName() + "." + task.getName() + " [" + schedule.indexOf(instance) +"]"; 
			GanttEvent event = new GanttEvent(ganttChart, eventName, start, end, 0);
			group.addEvent(event);
		}
		
		coreSection.addGanttEvent(group);
	}

}
