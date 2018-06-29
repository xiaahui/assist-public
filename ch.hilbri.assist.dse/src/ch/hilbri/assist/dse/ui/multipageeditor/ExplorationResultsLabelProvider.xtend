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
import org.eclipse.ui.forms.widgets.FormToolkit

class ExplorationResultsLabelProvider extends CellLabelProvider {
	Table table
	Map<Object, Button> allButtons = new HashMap<Object, Button>();
	FormToolkit formToolkit

	new(Table t, FormToolkit f) {
		super()
		table = t
		formToolkit = f
	}

	override update(ViewerCell cell) {
		val explorationResult = cell.element as ExplorationResult

		switch (cell.columnIndex) {
			case 0:
				cell.text = explorationResult.candidate.name
			case 1: {
				// This is handled in the paintEvent listener 
			}
			case 2: {
				var Button button
				if (allButtons.containsKey(cell.element))
					button = allButtons.get(cell.element)
				else {
					button = new Button(cell.viewerRow.control as Composite, SWT.FLAT)
					button.text = "Generate"
					formToolkit.adapt(button, true, true)
					allButtons.put(cell.element, button)
				}
				val tableItem = cell.item as TableItem
				val editor = new TableEditor(table)
				editor.minimumWidth = 75
				editor.grabVertical = true
				editor.setEditor(button, tableItem, 2)
				editor.layout
			}
			case 3: 
				cell.text = explorationResult.candidate.boardAlternatives.map[name].toString.toNicerList
			case 4:
				cell.text = explorationResult.candidate.applicationAlternatives.map[name].toString.toNicerList
			case 5:
				cell.text = explorationResult.candidate.restrictionAlternatives.map[name].toString.toNicerList
			
		}
	}
	
	def String toNicerList(String s) {
		if (s == "[]")
			return "-- none --"
			
		// Remove the [ and ]
		return s.substring(1, s.length-1)
	}

}
