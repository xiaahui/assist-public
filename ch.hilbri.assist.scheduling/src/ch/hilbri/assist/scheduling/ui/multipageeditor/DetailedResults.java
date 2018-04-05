package ch.hilbri.assist.scheduling.ui.multipageeditor;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.nebula.widgets.ganttchart.GanttChart;
import org.eclipse.nebula.widgets.ganttchart.GanttEvent;
import org.eclipse.nebula.widgets.ganttchart.GanttFlags;
import org.eclipse.nebula.widgets.ganttchart.GanttGroup;
import org.eclipse.nebula.widgets.ganttchart.GanttPhase;
import org.eclipse.nebula.widgets.ganttchart.GanttSection;
import org.eclipse.nebula.widgets.ganttchart.IColorManager;
import org.eclipse.nebula.widgets.ganttchart.ISectionDetailContentReplacer;
import org.eclipse.nebula.widgets.ganttchart.ISettings;
import org.eclipse.nebula.widgets.ganttchart.themes.ColorThemeWindowsBlue;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import ch.hilbri.assist.model.SchedulingResult;
import ch.hilbri.assist.model.Core;
import ch.hilbri.assist.model.Processor;
import ch.hilbri.assist.model.Task;
import ch.hilbri.assist.model.TaskExecutionInstance;

public class DetailedResults extends Composite implements ISectionDetailContentReplacer {
	@SuppressWarnings("unused")
	private MultiPageEditor multiPageEditor;
	private GanttChart ganttChart;
	private Composite ganttComposite;
	
	/* We want to store the result */
	private SchedulingResult currentResult = null;
	
	/* We need to store the links between processors and sections */
	private Map<Processor, GanttSection> processor2ganttsectionsMap;
	private Map<GanttSection, Processor> ganttsections2processorMap;
	private Map<Core, GanttGroup> core2ganttgroupsMap;
	
	/* Settings for the Gantt-Chart */
	private final int ganttFlags 				= GanttFlags.H_SCROLL_FIXED_RANGE | SWT.SINGLE;
	private final ISettings ganttSettings 		= new GanttSettings(this);
	private final IColorManager ganttColorTheme 	= new ColorThemeWindowsBlue();

	public DetailedResults(MultiPageEditor mpe, Composite parent, int style) {
		super(parent, style);
		multiPageEditor = mpe;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		ganttComposite = new Composite(this, SWT.NONE);
		ganttComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
//		ganttChart.getGanttComposite().setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));
	}
	
	
	
	public void setResult(SchedulingResult result) {
		
	    /* Store the result for reference */
	    currentResult = result;
	    
		/* Remove the old chart and create a new one */
		ganttChart.dispose();
		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
//		ganttChart.getGanttComposite().setFont(SWTResourceManager.getFont("Segoe UI", 8, SWT.NORMAL));

		/* We want to create:
		 *    - a gantt section for each processor (both links)
		 *    - a gantt group for each core within the section of each processor
		 */
		processor2ganttsectionsMap = new HashMap<Processor, GanttSection>();
		ganttsections2processorMap = new HashMap<GanttSection, Processor>();
		for (Processor proc : result.getModel().getAllProcessors())  {
			GanttSection newSection = new GanttSection(ganttChart, "");  // we want to have an empty name of the section to avoid UI clutter
			processor2ganttsectionsMap.put(proc, newSection);
			ganttsections2processorMap.put(newSection, proc);
		}
		
		core2ganttgroupsMap = new HashMap<Core, GanttGroup>();
		for (Core core : result.getModel().getAllCores()) {
			GanttGroup newGroup = new GanttGroup(ganttChart);
			core2ganttgroupsMap.put(core, newGroup);
			processor2ganttsectionsMap.get(core.getProcessor()).addGanttEvent(newGroup);
		}
		
		/* Create all the events */
		for (Task task : result.getModel().getAllTasks()) {
			/* Is there a schedule for this task in the result? */
			if (result.getSchedule().containsKey(task)) {
				/* Create all events for this task */
				List<TaskExecutionInstance> taskSchedule = result.getSchedule().get(task);
				GanttGroup coreGroup = core2ganttgroupsMap.get(task.getAssignedCore());
				createEventsForExecutionInstances(task, taskSchedule, coreGroup);
			}
		}
		
		/* Create a gantt phase for the hyper period */
		Calendar cal = (Calendar) ganttChart.getSettings().getDDayRootCalendar().clone();
		final Calendar start = (Calendar) cal.clone();
		final Calendar end = (Calendar) cal.clone();
		end.add(Calendar.DATE, result.getHyperPeriodLength());
		GanttPhase phase = new GanttPhase(ganttChart, start, end, "Hyperperiod [0, " + result.getHyperPeriodLength() + "]");
		phase.setMoveable(false);
		phase.setResizable(false);
		
		/* This is necessary to avoid redraw problems */
		layout(true, true);
	}
	
	public SchedulingResult getCurrentResult() {
	    return currentResult;
	}
	
	private void createEventsForExecutionInstances(Task task, List<TaskExecutionInstance> schedule, GanttGroup coreGroup) {
		Calendar cal = (Calendar) ganttChart.getSettings().getDDayRootCalendar().clone();

		for (TaskExecutionInstance instance : schedule) {
			final Calendar start = (Calendar) cal.clone();
			start.add(Calendar.DATE, instance.getBegin());

			final Calendar end = (Calendar) cal.clone();
			end.add(Calendar.DATE, instance.getEnd()-1);

			String eventName = task.getApplication().getName() + "." + task.getName() + " [" + schedule.indexOf(instance) +"]"; 
			GanttEvent event = new GanttEvent(ganttChart, eventName, start, end, 0);

			/* Color the task if desired */
			if (task.getColor() != ch.hilbri.assist.model.Color.NONE) {
				// We want them plain and simple - no gradient
				event.setStatusColor(getSWTColor(task.getColor()));
				event.setGradientStatusColor(getSWTColor(task.getColor()));
			}
			
			coreGroup.addEvent(event);
		}
	}

	/* This is called to retrieve the text details for the section details in the gantt chart 
	 * 
	 * the magic keywords TITLE/DETAILS are defined in the GanttSettings class
	 * */
	@Override
	public String replaceSectionDetailPlaceHolder(GanttSection section, String sectionDetailPattern) {
		Processor proc = ganttsections2processorMap.get(section);
		if (proc == null)
			return "<unknown processor>";
		
		/* We are asked about the title */
		if (sectionDetailPattern.toUpperCase().equals("TITLE")) {
			/* Reduce the length of the name if it would become too long */
			String procName = proc.getName();
			if (procName.length() > 15) 
				procName = procName.substring(0, 15) + "...";
			return procName;
		} 
		
		/* We are asked about the details for this processor */
		else if (sectionDetailPattern.toUpperCase().equals("DETAILS")) {
			String board = proc.getBoard().getName();
			if (board.length() > 15) board = board.substring(0, 15) + "...";
			
			String vendor = proc.getManufacturer();
			if (vendor.isEmpty()) vendor = "-";
			if (vendor.length() > 15) vendor = vendor.substring(0, 15) + "...";
				
			String ptype = proc.getProcessorType();
			if (ptype.isEmpty()) ptype = "-";
			if (ptype.length() > 15) ptype = ptype.substring(0, 15) + "...";
			
			String coreCount = "" + proc.getCores().size();
			
			// s9 - size 9pt, b - bold font
			return  	"\\s8Board:  \\s8\\b" + board    + "\n" + 
					"\\s8Vendor: \\s8\\b" + vendor 	+ "\n" + 
					"\\s8Type:   \\s8\\b" + ptype	+ "\n" + 
					"\\s8Cores:  \\s8\\b" + coreCount    
					;
		} else
			return "<unknown pattern>";
	}

	private Color getSWTColor(ch.hilbri.assist.model.Color color) {
		switch (color) {
		case BLACK: 		return Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
		case BLUE:			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		case CYAN:			return Display.getCurrent().getSystemColor(SWT.COLOR_CYAN);
		case DARK_BLUE:		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_BLUE);
		case DARK_CYAN:		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_CYAN);
		case DARK_GRAY:		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GRAY);
		case DARK_GREEN:	return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
		case DARK_MAGENTA:	return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_MAGENTA);
		case DARK_RED:		return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);
		case DARK_YELLOW:	return Display.getCurrent().getSystemColor(SWT.COLOR_DARK_YELLOW);
		case GRAY:			return Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
		case GREEN:			return Display.getCurrent().getSystemColor(SWT.COLOR_GREEN);
		case MAGENTA:		return Display.getCurrent().getSystemColor(SWT.COLOR_MAGENTA);
		case NONE:			return null;
		case RED:			return Display.getCurrent().getSystemColor(SWT.COLOR_RED);
		case WHITE:			return Display.getCurrent().getSystemColor(SWT.COLOR_WHITE);
		case YELLOW:		return Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
		}
		return null;
	}
	
}
