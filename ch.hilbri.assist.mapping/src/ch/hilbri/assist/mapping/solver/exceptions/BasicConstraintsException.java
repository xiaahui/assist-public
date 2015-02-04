package ch.hilbri.assist.mapping.solver.exceptions;

public class BasicConstraintsException extends Exception {

	private static final long serialVersionUID = -3027962163706184142L;

	private String constraintName;
	
	public BasicConstraintsException(String constraintName) {
		this.constraintName = constraintName;
	}

	public String getConstraintName() {
		return constraintName;
	}
	
	
}
