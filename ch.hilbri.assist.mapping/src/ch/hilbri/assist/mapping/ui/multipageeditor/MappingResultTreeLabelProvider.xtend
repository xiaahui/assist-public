package ch.hilbri.assist.mapping.ui.multipageeditor

import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Task
import org.eclipse.draw2d.IFigure
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.widgets.Display
import org.eclipse.wb.swt.SWTResourceManager
import org.eclipse.zest.core.viewers.EntityConnectionData
import org.eclipse.zest.core.viewers.IEntityConnectionStyleProvider
import org.eclipse.zest.core.viewers.IEntityStyleProvider
import org.eclipse.zest.core.viewers.ISelfStyleProvider
import org.eclipse.zest.core.widgets.GraphConnection
import org.eclipse.zest.core.widgets.GraphNode
import org.eclipse.zest.core.widgets.ZestStyles

class MappingResultTreeLabelProvider extends LabelProvider implements IEntityStyleProvider, IEntityConnectionStyleProvider, ISelfStyleProvider {

	Color lightblue = new Color(Display.getCurrent, 230, 238, 255)
	Color lightgreen = new Color(Display.getCurrent, 242, 255, 230)

	override String getText(Object element) {
		if (element instanceof MappingResultTreeNode) {
			val data = element.data
			if(data instanceof AssistModel) return data.systemName
			if(data instanceof Compartment) return data.name
			if(data instanceof Box) return data.name
			if(data instanceof Board) return data.name
			if(data instanceof Processor) return data.name
			if(data instanceof Core) return data.name
			if(data instanceof Task) return data.name

			throw new RuntimeException("Unexpected data type: " + data.class)
		}
		if (element instanceof EntityConnectionData) {
			return ""
		}
		throw new RuntimeException("Wrong type: " + element.class)
	}

	override Color getForegroundColour(Object element) {
		if (element instanceof MappingResultTreeNode) {
			val data = element.data
			if(data instanceof AssistModel) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Compartment) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Box) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Board) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Processor) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Core) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			if(data instanceof Task) return SWTResourceManager.getColor(SWT.COLOR_BLACK)
			throw new RuntimeException("Unexpected data type: " + data.class)
		}
		if (element instanceof EntityConnectionData) {
			return SWTResourceManager.getColor(SWT.COLOR_BLACK)
		}
		throw new RuntimeException("Wrong type: " + element.class)
	}

	override Color getBackgroundColour(Object element) {
		if (element instanceof MappingResultTreeNode) {
			val data = element.data
			if(data instanceof AssistModel) return SWTResourceManager.getColor(SWT.COLOR_WHITE)
			if(data instanceof Compartment) return lightblue
			if(data instanceof Box) return lightblue
			if(data instanceof Board) return lightblue
			if(data instanceof Processor) return lightblue
			if(data instanceof Core) return lightblue
			if(data instanceof Task) return lightgreen
			throw new RuntimeException("Unexpected data type: " + data.class)
		}
		if (element instanceof EntityConnectionData) {
			return SWTResourceManager.getColor(SWT.COLOR_BLACK)
		}
		throw new RuntimeException("Wrong type: " + element.class)
	}

	override Color getBorderColor(Object arg0) {
		SWTResourceManager.getColor(SWT.COLOR_GRAY)
	}

	/* No highlighting specialty */
	override Color getNodeHighlightColor(Object arg0) {
		getBackgroundColour(arg0)
	}

	/* No highlighting specialty */
	override Color getBorderHighlightColor(Object arg0) {
		getBorderColor(arg0)
	}

	override int getBorderWidth(Object arg0) {
		return 2
	}

	override IFigure getTooltip(Object arg0) {
		null
	}

	override fisheyeNode(Object arg0) {
		false
	}

	/* Connection Styles */
	override getColor(Object arg0, Object arg1) {
		SWTResourceManager.getColor(SWT.COLOR_GRAY)
	}

	override getConnectionStyle(Object arg0, Object arg1) {
		ZestStyles.CONNECTIONS_SOLID
	}

	override getHighlightColor(Object arg0, Object arg1) {
		SWTResourceManager.getColor(SWT.COLOR_GRAY)
	}

	override getLineWidth(Object arg0, Object arg1) {
		1
	}

	/* Explicit styling of the nodes and connections */
	override selfStyleConnection(Object element, GraphConnection connection) {
		/* NOP */
	}

	override selfStyleNode(Object element, GraphNode node) {
		if (element instanceof MappingResultTreeNode) {
			val data = element.data
			if (data instanceof AssistModel) {
				node.setSize(200, node.size.height)
				return
			}
			if(data instanceof Compartment) return;
			if(data instanceof Box) return;
			if(data instanceof Board) return;
			if(data instanceof Processor) return;
			if(data instanceof Core) return;
			if(data instanceof Task) return;
			throw new RuntimeException("Unexpected data type: " + data.class)
		}
		if (element instanceof EntityConnectionData) {
			return
		}
		throw new RuntimeException("Wrong type: " + element.class)

	}

	/* This is called to dispose all Colors and Fonts created by this class */
	override dispose() {
		lightblue.dispose()
		lightgreen.dispose()
	}

}
