package ch.hilbri.assist.dse.ui.multipageeditor

import ch.hilbri.assist.dse.results.ExplorationResult
import java.util.HashMap
import java.util.Map
import org.eclipse.jface.viewers.CellLabelProvider
import org.eclipse.jface.viewers.ViewerCell
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.TableItem
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.SWT
import org.eclipse.swt.custom.TableEditor

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
            case 0:
                cell.text = explorationResult.candidate.name
            case 1:
                if (explorationResult.isFeasible)
                    cell.text = "yes"
                else
                    cell.text = "no"
            case 2: {
                val item = cell.item as TableItem
                var Button button
                if (allButtons.containsKey(cell.element))
                    button = allButtons.get(cell.element)
                else {
                    button = new Button(cell.viewerRow.control as Composite, SWT.NONE)
                    button.text = "Generate"
                    allButtons.put(cell.element, button)
                }
                val editor = new TableEditor(table)
                editor.minimumWidth = 75
                editor.grabVertical = true
                editor.setEditor(button, item, 2)
                editor.layout
            }
        }
    }

}
