package ch.hilbri.assist.scheduling.ui.multipageeditor;

import java.util.Calendar;

import org.eclipse.nebula.widgets.ganttchart.AbstractSettings;
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

public class DetailedResults extends Composite {
	@SuppressWarnings("unused")
	private MultiPageEditor multiPageEditor;
	private GanttChart ganttChart;
	private Composite ganttComposite;	
	
	/* Settings for the Gantt-Chart */
	private final int ganttFlags 				= GanttFlags.H_SCROLL_FIXED_RANGE | SWT.SINGLE;
	private final ISettings ganttSettings 		= new TestSettings();
	private final IColorManager ganttColorTheme = new ColorThemeWindowsBlue();

	public DetailedResults(MultiPageEditor mpe, Composite parent, int style) {
		super(parent, style);
		multiPageEditor = mpe;

		setLayout(new FillLayout(SWT.HORIZONTAL));
		ganttComposite = new Composite(this, SWT.NONE);
		ganttComposite.setLayout(new FillLayout(SWT.HORIZONTAL));

		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
		ganttChart.getGanttComposite().setDrawHorizontalLinesOverride(true);
		ganttChart.getGanttComposite().setUseAdvancedTooltips(false);
		ganttChart.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
	}
	
	public void setResult(AssistModelSchedulingResult result) {
		
		/* Remove the old chart and create a new one */
		ganttChart.dispose();
		ganttChart = new GanttChart(ganttComposite, ganttFlags, ganttSettings, ganttColorTheme);
		
		Calendar cal = (Calendar) ganttChart.getSettings().getDDayRootCalendar().clone();

		final Calendar start1 = (Calendar) cal.clone();
		final Calendar end1 = (Calendar) start1.clone();
		end1.add(Calendar.DATE, 10);
		GanttEvent event1 = new GanttEvent(ganttChart, "Task A1.1", start1, end1, 0);

		final Calendar start2 = (Calendar) cal.clone();
		start2.add(Calendar.DATE, 20);
		final Calendar end2 = (Calendar) start2.clone();
		end2.add(Calendar.DATE, 10);
		GanttEvent event2 = new GanttEvent(ganttChart, "Task A1.2", start2, end2, 0);

		GanttGroup groupOne = new GanttGroup(ganttChart);
		groupOne.addEvent(event1);
		groupOne.addEvent(event2);

		GanttSection section = new GanttSection(ganttChart, "Core 1");
		section.addGanttEvent(groupOne);
		
		/* This is necessary to avoid redraw problems */
		layout(true, true);
	}

	private class TestSettings extends AbstractSettings {
		public boolean drawHeader() {
			return true;
		}

		public int getSectionSide() {
			return SWT.LEFT;
		}

		public boolean drawHorizontalLines() {
			return true;
		}

		public int getInitialView() {
			return ISettings.VIEW_D_DAY;
		}

		public boolean drawFullPercentageBar() {
			return false;
		}

		public boolean lockHeaderOnVerticalScroll() {
			return true;
		}

		public boolean showDefaultMenuItemsOnEventRightClick() {
			return false;
		}

		public boolean allowHeaderSelection() {
			return false;
		}

		public String getTextDisplayFormat() {
			return "";
		}

		public int getCalendarStartupDateOffset() {
			return 0;
		}

		public String getDefaultAdvancedTooltipHelpText() {
			return "";
		}

		public String getDefaultAdvancedTooltipTitle() {
			return "\\b\\c027050082#name#";
		}

		public String getDefaultAdvancedTooltipTextExtended() {
			StringBuffer buf = new StringBuffer();
			return buf.toString();// "\\ceStart Date: \\b#sd#\nEnd Date: \\b#ed#\nRevised Start: \\b#rs#\nRevised
									// End: \\b#re#\nDay Span: \\b#days# days\nPercent Complete: \\b#pc#%";
		}

		public String getDefaultAdvancedTooltipText() {
			StringBuffer buf = new StringBuffer();
			return buf.toString();
		}

		public boolean enableTodayLineUpdater() {
			return true;
		}

	}

}
