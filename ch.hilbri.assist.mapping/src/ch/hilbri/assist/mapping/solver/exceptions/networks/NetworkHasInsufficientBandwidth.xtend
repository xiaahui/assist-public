package ch.hilbri.assist.mapping.solver.exceptions.networks

import ch.hilbri.assist.datamodel.model.Network
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException

class NetworkHasInsufficientBandwidth extends BasicConstraintsException {
	
	private Network network
	
	new(AbstractMappingConstraint constraint, Network network) {
		super(constraint)
		this.network = network
	}
	
	override def String getExplanation() { 
		'''Network «network.name» does not have enough bandwidth for all its communication relations.'''
	}
	
}