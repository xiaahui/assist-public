package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InsufficientTotalRAMException extends BasicConstraintsException {
	
	new(AbstractMappingConstraint constraint) {
		super(constraint)
	}
	
	override def String getExplanation() { 
		'''There is not enough total RAM in the system for all applications.'''
	}
	
}