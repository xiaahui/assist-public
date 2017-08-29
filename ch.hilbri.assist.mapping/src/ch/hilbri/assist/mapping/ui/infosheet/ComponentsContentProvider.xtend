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

			if (inputElement instanceof Application)
				data.addAll(#[
					#["Type", "Application"],
					#["Name", inputElement.name],
					#["Criticality level", inputElement.criticalityLevel.toString],
					#["Developed by", inputElement.developedBy]
				])
			else if (inputElement instanceof Task)
				data.addAll(#[
					#["Type", "Task"],
					#["Name", inputElement.name],
					#["Core utilization", "" + inputElement.coreUtilization],
					#["RAM utilization", "" + inputElement.ramUtilization],
					#["ROM utilization", "" + inputElement.romUtilization]
				])
			else if (inputElement instanceof Core)
				data.addAll(#[
					#["Type", "Core"],
					#["Name", inputElement.name],
					#["Architecture", inputElement.architecture]
				])
			else if (inputElement instanceof Processor)
				data.addAll(#[
					#["Type", "Processor"],
					#["Name", inputElement.name],
					#["Processor type", inputElement.processorType]
				])
			else if (inputElement instanceof Board)
				data.addAll(#[
					#["Type", "Board"],
					#["Name", inputElement.name],
					#["Board type", inputElement.boardType],
					#["Power supply", inputElement.powerSupply],
					#["Design assurance level", inputElement.assuranceLevel.toString],
					#["RAM", "" + inputElement.ramCapacity],
					#["ROM", "" + inputElement.romCapacity]
				])
			else if (inputElement instanceof Box)
				data.addAll(#[
					#["Type", "Box"],
					#["Name", inputElement.name]
				])
			else if (inputElement instanceof Compartment)
				data.addAll(#[
					#["Type", "Compartment"],
					#["Name", inputElement.name],
					#["Power Supply", inputElement.powerSupply]
				])

			return data
		}
	}
}
