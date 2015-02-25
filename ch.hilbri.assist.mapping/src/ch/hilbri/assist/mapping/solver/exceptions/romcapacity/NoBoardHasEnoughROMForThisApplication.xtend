package ch.hilbri.assist.mapping.solver.exceptions.romcapacity

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class NoBoardHasEnoughROMForThisApplication extends BasicConstraintsException {
	private Application application
	
	new(AbstractMappingConstraint constraint, Application application) {
		super(constraint)
		this.application = application
	}
	
	override def String getExplanation() { 
		'''There is no board in the system with enough ROM for application «application.name».'''
	}
}