package ch.hilbri.assist.mapping.solver.exceptions

import ch.hilbri.assist.mapping.solver.constraints.AbstractMappingConstraint

class BasicConstraintsException extends Exception {

	AbstractMappingConstraint constraint

	new(AbstractMappingConstraint constraint) {
		this.constraint = constraint
	}

	def String getConstraintName() { constraint.name }

	def String getExplanation() { '''Adding the constraint "«constraintName»" lead to an inconsistency.''' }
}
