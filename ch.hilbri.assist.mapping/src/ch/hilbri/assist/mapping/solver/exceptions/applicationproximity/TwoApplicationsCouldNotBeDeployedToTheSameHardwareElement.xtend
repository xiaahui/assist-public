package ch.hilbri.assist.mapping.solver.exceptions.applicationproximity

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class TwoApplicationsCouldNotBeDeployedToTheSameHardwareElement extends BasicConstraintsException {
	
	private Application a1
	private Application a2
	private HardwareArchitectureLevelType level
	
	new (AbstractMappingConstraint constraint, Application a1, Application a2, HardwareArchitectureLevelType level) {
		super (constraint)
		this.a1 = a2
		this.a2 = a2
		this.level = level
	}
	
	override def String getExplanation() { 
		'''The applications "«a1.name»" and "«a2.name»" could not be mapped to the same «level.literal».'''
	} 
}