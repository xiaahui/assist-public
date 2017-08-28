package ch.hilbri.assist.mapping.ui.infosheet

import ch.hilbri.assist.mapping.model.AssistModel
import ch.hilbri.assist.mapping.model.result.Result
import ch.hilbri.assist.mapping.model.result.SingleMappingElement
import java.util.ArrayList
import org.eclipse.jface.viewers.IStructuredContentProvider

class HardwareComponentsContentProvider implements IStructuredContentProvider {
	AssistModel model

	new(Result result) {
		model = result.getModel()
	}

	// inputElement = SingleMappingElement
	override Object[] getElements(Object inputElement) {
		if (model === null)
			return newArrayOfSize(0)
			
		else if (inputElement instanceof SingleMappingElement) {
			
			val data = new ArrayList<String[]>()
			data.add(#["CPU", "CPU1", "CPU2"])
			data.add(#["Board1", "Board2", "Boad3"])
			
			return data
			
		} else
			return newArrayOfSize(0)
	}
}
