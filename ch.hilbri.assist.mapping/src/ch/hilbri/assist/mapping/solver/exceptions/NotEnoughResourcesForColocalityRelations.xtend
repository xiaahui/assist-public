package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.datamodel.model.ColocalityRelation
import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint
import java.util.List

class NotEnoughResourcesForColocalityRelations extends BasicConstraintsException {
	
	private List<ColocalityRelation> relations
	
	new(AbstractMappingConstraint constraint, List<ColocalityRelation> relations) {
		super(constraint)
		this.relations = relations
	}
	
	override def String getExplanation() {
		'''The hardware architecture does not provide sufficient resources for the mapping of the following on-same relations:
			«FOR rel : relations»
			- «rel.allEqInterfaceOrGroupNames»
			«ENDFOR»'''
	}
}