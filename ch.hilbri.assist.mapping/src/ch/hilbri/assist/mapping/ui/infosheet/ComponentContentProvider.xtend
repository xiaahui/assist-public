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

class ComponentContentProvider implements IStructuredContentProvider {
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
					#["Name", inputElement.name.valueOrDefault],
					#["Criticality level", inputElement.criticalityLevel.toString.valueOrDefault],
					#["Developed by", inputElement.developedBy.valueOrDefault]
				])
			else if (inputElement instanceof Task)
				data.addAll(#[
					#["Type", "Task"],
					#["Name", inputElement.name.valueOrDefault],
					#["Core utilization", Integer.toString(inputElement.coreUtilization).valueOrDefault],
					#["RAM utilization", Integer.toString(inputElement.ramUtilization).valueOrDefault],
					#["ROM utilization", Integer.toString(inputElement.romUtilization).valueOrDefault]
				])
			else if (inputElement instanceof Core)
				data.addAll(#[
					#["Type", "Core"],
					#["Name", inputElement.name.valueOrDefault],
					#["Architecture", inputElement.architecture.valueOrDefault]
				])
			else if (inputElement instanceof Processor)
				data.addAll(#[
					#["Type", "Processor"],
					#["Name", inputElement.name.valueOrDefault],
					#["Processor type", inputElement.processorType.valueOrDefault]
				])
			else if (inputElement instanceof Board)
				data.addAll(#[
					#["Type", "Board"],
					#["Name", inputElement.name.valueOrDefault],
					#["Board type", inputElement.boardType.valueOrDefault],
					#["Power supply", inputElement.powerSupply.valueOrDefault],
					#["Design assurance level", inputElement.assuranceLevel.toString.valueOrDefault],
					#["RAM utilization", Integer.toString(inputElement.ramCapacity).valueOrDefault],
					#["ROM utilization", Integer.toString(inputElement.romCapacity).valueOrDefault]
				])
			else if (inputElement instanceof Box)
				data.addAll(#[
					#["Type", "Box"],
					#["Name", inputElement.name.valueOrDefault]
				])
			else if (inputElement instanceof Compartment)
				data.addAll(#[
					#["Type", "Compartment"],
					#["Name", inputElement.name.valueOrDefault],
					#["Power Supply", inputElement.powerSupply.valueOrDefault]
				])

			return data
		}
	}
	
	def String getValueOrDefault(String value) {
		if (value.isNullOrEmpty) "-"
		else 					value
	}
}
