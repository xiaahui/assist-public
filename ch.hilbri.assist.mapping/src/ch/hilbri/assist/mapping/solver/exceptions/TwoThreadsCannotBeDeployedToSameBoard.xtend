package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class TwoThreadsCannotBeDeployedToSameBoard extends BasicConstraintsException {
	
	private Thread t1
	private Thread t2
	
	new (AbstractMappingConstraint constraint, Thread t1, Thread t2) {
		super (constraint)
		this.t1 = t1
		this.t2 = t2
	}
	
	override String getExplanation() {
		'''The threads could not be mapped to the same board.'''
	}
}