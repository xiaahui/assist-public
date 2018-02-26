package ch.hilbri.assist.mapping.ui.infosheet

import ch.hilbri.assist.model.Application
import ch.hilbri.assist.model.AssistModel
import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.Processor
import ch.hilbri.assist.model.Result
import ch.hilbri.assist.model.Task
import java.text.DecimalFormat
import java.util.ArrayList
import org.eclipse.jface.viewers.IStructuredContentProvider

class ComponentContentProvider implements IStructuredContentProvider {
	AssistModel assistModel
	Result assistResult

	new(Result result) {
		if (result !== null) {
			assistModel = result.model
			assistResult = result
		}
		else
			assistModel = null
	}
	
	// inputElement = SingleMappingElement
	override Object[] getElements(Object inputElement) {
		if (assistModel === null)
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
					#["Architecture", inputElement.architecture.valueOrDefault],
					#["Utilization", inputElement.utilization]
				])
			else if (inputElement instanceof Processor)
				data.addAll(#[
					#["Type", "Processor"],
					#["Name", inputElement.name.valueOrDefault],
					#["Processor type", inputElement.processorType.valueOrDefault],
					#["Utilization", inputElement.utilization]
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
		
	/* Calculate the load on the core that is induced  */	
	def String getUtilization(Core core) {
		val tasks = assistResult.getMappedTasksForCore(core)
		if (!tasks.isNullOrEmpty) {
			val load = 100.0 * tasks.map[coreUtilization].reduce[p1, p2|p1+p2] / core.capacity
			return new DecimalFormat("#.#").format(load) + "%"
		}
		else
			return "0.0%"
	}
	
	/* Calculate the load on the processor that is induced by the result */
	def String getUtilization(Processor proc) {
		val tasks = proc.cores.map[assistResult.getMappedTasksForCore(it)]
							  .filter[!it.isNullOrEmpty]
							  .flatten
		
		if (!tasks.isNullOrEmpty) {
			val load = 100.0 * tasks.map[coreUtilization].reduce[p1, p2|p1+p2] / 
							   proc.cores.map[capacity].reduce[p1, p2|p1+p2]
			return new DecimalFormat("#.#").format(load)+"%"
		}
		else
			return "0.0%"
	}
}
