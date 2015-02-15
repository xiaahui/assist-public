package ch.hilbri.assist.mapping.solver.exceptions.coreutilization

import ch.hilbri.assist.datamodel.model.Core
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class AllThreadsOnThisCoreExceedItsProcessingPower extends BasicConstraintsException {
	private Core core
	
	new(AbstractMappingConstraint constraint, Core core) {
		super(constraint)
		this.core = core
	}
	
	override def String getExplanation() { 
		'''Core «core.name» of processor «core.processor.name» does not have enough processing power for all its applications.'''
	} 
}