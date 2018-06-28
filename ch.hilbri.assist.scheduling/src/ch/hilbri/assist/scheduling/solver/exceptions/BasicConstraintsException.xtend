package ch.hilbri.assist.scheduling.solver.exceptions

import ch.hilbri.assist.scheduling.solver.constraints.AbstractSchedulingConstraint

class BasicConstraintsException extends Exception {

	AbstractSchedulingConstraint constraint

	new(AbstractSchedulingConstraint constraint) {
		this.constraint = constraint
	}

	def String getConstraintName() { constraint.name }

	def String getExplanation() { '''Adding the constraints "«constraintName»" lead to an inconsistency.''' }
}
