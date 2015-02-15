package ch.hilbri.assist.mapping.solver.exceptions.designassurancelevel

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class NoBoardWithSufficientDALFound extends BasicConstraintsException {
	
	private Application a
	
	new(AbstractMappingConstraint constraint, Application a) {
		super(constraint)
		this.a = a
	}
	
	override def String getExplanation() { 
		'''There is no board with a design assurance level of at least «a.criticalityLevel.literal» for application «a.name».'''
	} 
}