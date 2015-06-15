package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import java.util.List

class InterfaceTypeDemandExceedsSupply extends BasicConstraintsException {
	private List<String> ifaceTypes
	private int totalDemand
	private int totalSupply
	
	new(AbstractMappingConstraint constraint, List<String> ifaceTypes, int totalDemand, int totalSupply) {
		super(constraint)
		this.ifaceTypes = ifaceTypes
		this.totalDemand = totalDemand
		this.totalSupply = totalSupply	
	}
	
	new(AbstractMappingConstraint constraint, String ifaceType, int totalDemand, int totalSupply) {
		this(constraint, #[ifaceType], totalDemand, totalSupply)
	}
	
	override def String getExplanation()	{
		
		if (ifaceTypes.length == 1)
			'''There are not enough interfaces of type "«ifaceTypes.get(0)»". The total demand is «totalDemand», but there are only «totalSupply» interface pins of this type on all connectors available.'''
		
		else if (ifaceTypes.length > 1)
			'''There are not enough interfaces of types "«ifaceTypes»". The total demand is «totalDemand», but there are only «totalSupply» interface pins of these types on all connectors available.'''
	}
}