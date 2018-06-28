package ch.hilbri.assist.scheduling.solver.exceptions

class HyperPeriodLengthException extends BasicConstraintsException {
	
	int hypLength
	
	new(int hypLength) {
		super(null)
		this.hypLength = hypLength
	}
	
	override String getConstraintName() { "Hyperperiod length was invalid" }
	override String getExplanation() { '''The length of the hyper period ("«hypLength»"), that was computed based on the period definitions for the taskset was invalid. In most cases it is too large. Please harmonize the periods of all tasks in order to have shorter hyperperiod.''' }
}