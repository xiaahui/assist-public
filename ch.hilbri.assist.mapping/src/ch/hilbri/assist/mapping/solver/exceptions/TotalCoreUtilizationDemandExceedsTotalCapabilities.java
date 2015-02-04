package ch.hilbri.assist.mapping.solver.exceptions;

public class TotalCoreUtilizationDemandExceedsTotalCapabilities extends BasicConstraintsException {


	private static final long serialVersionUID = -4265893227319403687L;

	public TotalCoreUtilizationDemandExceedsTotalCapabilities(String constraintName) {
		super(constraintName);
	}

}
