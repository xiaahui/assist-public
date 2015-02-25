package ch.hilbri.assist.mapping.solver.exceptions.dissimilarity

import ch.hilbri.assist.datamodel.model.ApplicationOrApplicationGroup
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import java.util.List

class ApplicationsCannotBeMappedDissimilar extends BasicConstraintsException {
	private List<ApplicationOrApplicationGroup> aogs
	
	new(AbstractMappingConstraint constraint, List<ApplicationOrApplicationGroup> aogs) {
		super(constraint)
		this.aogs = aogs	
	}
	
	override def String getExplanation() { 
		'''The applications or application groups «aogs» could not be mapped to dissimilar hardware.'''
	}
}