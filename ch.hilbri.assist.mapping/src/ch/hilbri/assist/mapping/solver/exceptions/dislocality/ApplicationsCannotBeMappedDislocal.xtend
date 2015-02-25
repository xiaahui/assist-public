package ch.hilbri.assist.mapping.solver.exceptions.dislocality

import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import java.util.List

class ApplicationsCannotBeMappedDislocal extends BasicConstraintsException {
	
	private List<ApplicationOrApplicationGroup> aogs
	private HardwareArchitectureLevelType level
	
	new(AbstractMappingConstraint constraint, List<ApplicationOrApplicationGroup> aogs, HardwareArchitectureLevelType level) {
		super(constraint)
		this.aogs = aogs	
		this.level = level
	}
	
	override def String getExplanation() { 
		'''The applications or application groups «aogs» could not be mapped dislocally up to level "«level»".'''
	}
}