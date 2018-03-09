package ch.hilbri.assist.mapping.ui.multipageeditor

import ch.hilbri.assist.model.Board
import ch.hilbri.assist.model.Box
import ch.hilbri.assist.model.Compartment
import ch.hilbri.assist.model.Core
import ch.hilbri.assist.model.MappingResult
import ch.hilbri.assist.model.Processor
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors class MappingResultTreeNode {
	@Accessors(PUBLIC_GETTER) Object data = null
	List<MappingResultTreeNode> children = newArrayList

	/* Simple Constructor */
	new(Object o) {
		data = o
	}

	/* Complex Constructor for the entire mapping result tree based on single mapping result */
	new(MappingResult mappingResult) {
		this(mappingResult.model)
		for (compartment : mappingResult.model.compartments)
			children.add(new MappingResultTreeNode(compartment, mappingResult))
	}

	new(Compartment compartment, MappingResult mappingResult) {
		this(compartment)
		for (box : compartment.boxes)
			children.add(new MappingResultTreeNode(box, mappingResult))
	}

	new(Box box, MappingResult mappingResult) {
		this(box)
		for (board : box.boards)
			children.add(new MappingResultTreeNode(board, mappingResult))
	}
	
	new(Board board, MappingResult mappingResult) {
		this(board)
		for (proc : board.processors)
			children.add(new MappingResultTreeNode(proc, mappingResult))
	}
	
	new(Processor processor, MappingResult mappingResult) {
		this(processor)
		for (core : processor.cores)
			children.add(new MappingResultTreeNode(core, mappingResult))
	}
	
	new(Core core, MappingResult mappingResult) {
		this(core)
		for (task : mappingResult.getMappedTasksForCore(core))
			children.add(new MappingResultTreeNode(task))
	}

	override String toString() {
		data.toString
	}
	
}
