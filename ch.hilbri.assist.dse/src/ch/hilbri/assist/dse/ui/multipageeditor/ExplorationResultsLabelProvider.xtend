package ch.hilbri.assist.dse.ui.multipageeditor

import ch.hilbri.assist.dse.results.ExplorationResult
import java.util.HashMap
import java.util.Map
import org.eclipse.jface.viewers.CellLabelProvider
import org.eclipse.jface.viewers.ViewerCell
import org.eclipse.swt.SWT
import org.eclipse.swt.custom.TableEditor
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.TableItem
import org.eclipse.wb.swt.ResourceManager

class ExplorationResultsLabelProvider extends CellLabelProvider {
	Table table
	Map<Object, Button> allButtons = new HashMap<Object, Button>();

	new(Table t) {
		super()
		table = t
	}

	override update(ViewerCell cell) {
		val explorationResult = cell.element as ExplorationResult

		switch (cell.columnIndex) {
			case 0: {
				cell.text = explorationResult.candidate.name
				if (explorationResult.isFeasible)
					cell.image = ResourceManager.getPluginImage("ch.hilbri.assist.dse", "icons/yes-green.gif")
				else
					cell.image = ResourceManager.getPluginImage("ch.hilbri.assist.dse", "icons/no-red.gif")

			}
			case 1: {
				var Button button
				if (allButtons.containsKey(cell.element))
					button = allButtons.get(cell.element)
				else {
					button = new Button(cell.viewerRow.control as Composite, SWT.NONE)
					button.text = "Generate"
					allButtons.put(cell.element, button)
				}
				val tableItem = cell.item as TableItem
				val editor = new TableEditor(table)
				editor.minimumWidth = 75
				editor.grabVertical = true
				editor.setEditor(button, tableItem, 1)
				editor.layout
			}
		}
	}

}
