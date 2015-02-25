package ch.hilbri.assist.mapping.solver.exceptions.restricteddeployment

import ch.hilbri.assist.datamodel.model.Application
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class RestrictingDeploymentOfApplicationFailed extends BasicConstraintsException {
	
	private Application application
	
	new(AbstractMappingConstraint constraint, Application application) {
		super(constraint)
		this.application = application
	}
	
	override def String getExplanation() { 
		'''The deployment of «application.name» could not be restricted without violating other constraints.'''
	}

}