package ch.hilbri.assist.mapping.solver.exceptions.romcapacity

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class InsufficientTotalROMException extends BasicConstraintsException {
	
	new(AbstractMappingConstraint constraint) {
		super(constraint)
	}
	
	override def String getExplanation() { 
		'''There is not enough total ROM in the system for all applications.'''
	}
	
}