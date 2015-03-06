package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.exceptions.BasicConstraintsException
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import ch.hilbri.assist.datamodel.model.EqInterfaceType

class InterfaceTypeCouldNotBeMapped extends BasicConstraintsException {
	
	private EqInterfaceType ifaceType
	
	new(AbstractMappingConstraint constraint, EqInterfaceType ifaceType) {
		super(constraint)
	}
	
	override def String getExplanation()	{
		'''The interfaces of type «ifaceType» could not be mapped.'''
		
	}
}