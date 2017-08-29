package ch.hilbri.assist.mapping.ui.infosheet

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.Processor
import ch.hilbri.assist.mapping.model.result.Result
import java.util.ArrayList
import org.eclipse.jface.viewers.IStructuredContentProvider

class ComponentsContentProvider implements IStructuredContentProvider {
	AssistModel model

	new(Result result) {
		model = result.getModel()
	}

	// inputElement = SingleMappingElement
	override Object[] getElements(Object inputElement) {
		if (model === null)
			return newArrayOfSize(0)
			
		else if (inputElement instanceof Processor) {
			
			val data = new ArrayList<String[]>()
			data.add(#["CPU", "CPU1"])
			data.add(#["Board1", "Board2"])
			
			return data
			
		} else
			return newArrayOfSize(0)
	}
}
