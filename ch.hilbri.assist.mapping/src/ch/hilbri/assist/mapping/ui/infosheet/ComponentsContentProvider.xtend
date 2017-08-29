package ch.hilbri.assist.mapping.ui.infosheet

import ch.hilbri.assist.mapping.model.Application
import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Board
import ch.hilbri.assist.mapping.model.Box
import ch.hilbri.assist.mapping.model.Compartment
import ch.hilbri.assist.mapping.model.Core
import ch.hilbri.assist.mapping.model.Processor
import ch.hilbri.assist.mapping.model.Task
import ch.hilbri.assist.mapping.model.result.Result
import java.util.ArrayList
import org.eclipse.jface.viewers.IStructuredContentProvider

class ComponentsContentProvider implements IStructuredContentProvider {
	AssistModel model

	new(Result result) {
		if (result != null)
			model = result.model
		else
			model = null
	}

	// inputElement = SingleMappingElement
	override Object[] getElements(Object inputElement) {
		if (model === null)
			return newArrayOfSize(0)
		else {

			val data = new ArrayList<String[]>

			if (inputElement instanceof Application) {
				data.add(#["App", "App"])
			} else if (inputElement instanceof Task) {
				data.add(#["Task", "Task"])
			} else if (inputElement instanceof Core) {
				data.add(#["Core", "Core"])
			} else if (inputElement instanceof Processor) {
				data.add(#["Processor", "Processor"])
			} else if (inputElement instanceof Board) {
				data.add(#["Board", "Board"])
			} else if (inputElement instanceof Box) {
				data.add(#["Box", "Box"])
			} else if (inputElement instanceof Compartment) {
				data.add(#["Comp", "Comp"])
			}

			return data
		}
	}
}
