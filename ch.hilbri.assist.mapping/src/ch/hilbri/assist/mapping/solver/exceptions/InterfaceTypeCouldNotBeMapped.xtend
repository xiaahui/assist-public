package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import java.util.List

class InterfaceTypeCouldNotBeMapped extends BasicConstraintsException {
	
	private List<String> ifaceTypes
	
	new(AbstractMappingConstraint constraint, List<String> ifaceTypes) {
		super(constraint)
		this.ifaceTypes = ifaceTypes
	}
	
	new(AbstractMappingConstraint constraint, String ifaceType) {
		this(constraint, #[ifaceType])
	}
	
	
	override def String getExplanation()	{
		'''The interfaces of type "«ifaceTypes»" could not be mapped to any connector.'''
		
	}
}