package structures;

public class StackException extends Exception {
	
	public StackException(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return error;
	}
	
	protected String error;

}
