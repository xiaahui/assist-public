package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class TwoThreadsCannotBeDeployedToSameBoard extends BasicConstraintsException {
	
	
	new (AbstractMappingConstraint constraint, Thread t1, Thread t2) {
		super (constraint)
	}
	
	override String getExplanation() {
		'''The threads could not be mapped to the same board.'''
	}
}