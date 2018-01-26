package ch.hilbri.assist.scheduling.ui.multipageeditor;

import org.eclipse.nebula.widgets.ganttchart.AbstractSettings;
import org.eclipse.nebula.widgets.ganttchart.ISectionDetailContentReplacer;
import org.eclipse.nebula.widgets.ganttchart.ISettings;
import org.eclipse.swt.SWT;

class GanttSettings extends AbstractSettings {
	public boolean drawHeader() {
		return true;
	}

	public boolean showBarsIn3D() {
		return false;
	}

	public boolean showDateTips() {
		return false;
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

	public boolean showMenuItemsOnRightClick() {
		return false;
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

	public boolean enableDragAndDrop() {
		return false;
	}

	public boolean showZoomLevelBox() {
		return true;
	}

	public boolean drawSectionDetails() {
		return true;
	}

	public int getSectionDetailWidth() {
		return 100;
	}

	public String getSectionDetailTitle() {
		return "\\b\\s8\\ceCore: #name#";
	}
	
    public String getSectionDetailText() {
		return "\\ceTasks: #ne#";
    }
    
    public ISectionDetailContentReplacer getSectionDetailContentReplacer() {
    	return null;
    }
	
    public boolean allowBlankAreaDragAndDropToMoveDates() {
		return false;
	}
	

}