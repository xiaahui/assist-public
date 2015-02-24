package ch.hilbri.assist.mapping.solver.exceptions.dissimilarity

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import java.util.List

class ApplicationsCannotBeMappedDissimilar extends BasicConstraintsException {
	private List<Application> applications
	
	new(AbstractMappingConstraint constraint, List<Application> applications) {
		super(constraint)
		this.applications = applications	
	}
	
	override def String getExplanation() { 
		'''The applications «applications» could not be mapped to dissimilar hardware.'''
	}
}