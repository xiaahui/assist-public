package ch.hilbri.assist.mapping.solver.exceptions.coreutilization

import ch.hilbri.assist.datamodel.model.Thread
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class NoCoreHasEnoughCoreProcessingPowerForThisThread extends BasicConstraintsException {
	private Thread t
	
	new(AbstractMappingConstraint constraint, Thread t) {
		super (constraint)
		this.t = t
	}
	
	override def String getExplanation() { 
		'''There is no core with sufficient processing capabilities for the threads of application "«t.application.name».'''
	} 
	
}