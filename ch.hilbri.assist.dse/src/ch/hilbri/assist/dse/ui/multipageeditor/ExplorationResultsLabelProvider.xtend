package ch.hilbri.assist.dse.ui.multipageeditor

import ch.hilbri.assist.dse.ui.wizards.GenerateMappingSpecificationWizard
import ch.hilbri.assist.model.ExplorationResult
import java.text.DecimalFormat
import java.util.HashMap
import java.util.Map
import org.apache.commons.io.FilenameUtils
import org.eclipse.jface.viewers.CellLabelProvider
import org.eclipse.jface.viewers.ViewerCell
import org.eclipse.jface.wizard.WizardDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.custom.TableEditor
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.swt.widgets.TableItem
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.PlatformUI
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
				if (explorationResult.getAbsoluteScore === null) {
					cell.text = "n/a"
				} else {
					cell.text = (new DecimalFormat("#.##").format(explorationResult.scaledScore))
				}

			}
			case 3: {
				if (explorationResult.getAbsoluteScore === null) {
					cell.text = "n/a"
				} else {
					cell.text = (new DecimalFormat("#.##").format(explorationResult.absoluteScore))
				}

			}
			
			case 4: {
				var Button button

				/* Check if we already created this button	 */
				if (allButtons.containsKey(cell.element))
					button = allButtons.get(cell.element)
				/* Otherwise, we have to create it */
				else {
					button = new Button(cell.viewerRow.control as Composite, SWT.FLAT)
					val finalButton = button
					button.text = "Generate"
					formToolkit.adapt(button, true, true)
					button.addSelectionListener(new SelectionAdapter() {
						override widgetSelected(SelectionEvent e) {
							val activeEditor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
							val inputFile = (activeEditor.editorInput as IFileEditorInput).file
							val preselectedProject = inputFile.project
							val preselectedFilename = FilenameUtils.removeExtension(inputFile.name) +
								'''-«explorationResult.candidate.name».mdsl'''
							val dialog = new WizardDialog(finalButton.shell,
								new GenerateMappingSpecificationWizard(explorationResult.model, preselectedProject,
									preselectedFilename))
							dialog.open
						}
					})

					allButtons.put(cell.element, button)
				}
				val tableItem = cell.item as TableItem
				val editor = new TableEditor(table)
				editor.minimumWidth = 75
				editor.minimumHeight = 20
				editor.grabVertical = true
				editor.setEditor(button, tableItem, 4)
				editor.layout
			}
			case 5:
				cell.text = explorationResult.candidate.boardAlternatives.map[name].toString.toNicerList
			case 6:
				cell.text = explorationResult.candidate.applicationAlternatives.map[name].toString.toNicerList
			case 7:
				cell.text = explorationResult.candidate.restrictionAlternatives.map[name].toString.toNicerList
		}
	}

	def String toNicerList(String s) {
		if (s == "[]")
			return "-- none --"

		// Remove the [ and ]
		return s.substring(1, s.length - 1)
	}

}
