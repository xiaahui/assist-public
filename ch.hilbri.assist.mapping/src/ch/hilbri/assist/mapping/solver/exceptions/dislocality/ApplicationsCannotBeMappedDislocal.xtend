package ch.hilbri.assist.mapping.solver.exceptions.dislocality

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import java.util.List
import ch.hilbri.assist.datamodel.model.HardwareArchitectureLevelType

class ApplicationsCannotBeMappedDislocal extends BasicConstraintsException {
	
	private List<Application> applications
	private HardwareArchitectureLevelType level
	
	new(AbstractMappingConstraint constraint, List<Application> applications, HardwareArchitectureLevelType level) {
		super(constraint)
		this.applications = applications	
		this.level = level
	}
	
	override def String getExplanation() { 
		'''The applications [«FOR a : applications»«a.name», «ENDFOR»] could not be mapped dislocally up to «level»'''
	}
}