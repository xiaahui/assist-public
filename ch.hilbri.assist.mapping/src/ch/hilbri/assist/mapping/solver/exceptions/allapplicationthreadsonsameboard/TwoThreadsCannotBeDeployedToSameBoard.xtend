package ch.hilbri.assist.mapping.solver.exceptions.allapplicationthreadsonsameboard

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.datamodel.model.Thread

class TwoThreadsCannotBeDeployedToSameBoard extends BasicConstraintsException {
	
	private Thread t1
	private Thread t2
	
	new (AbstractMappingConstraint constraint, Thread t1, Thread t2) {
		super (constraint)
		this.t1 = t1
		this.t2 = t2
	}
	
	override def String getExplanation() { 
		'''The threads "«t1.name»" and "«t2.name»" of application "«t1.application.name»" could not be mapped to the same board.'''
	} 
}