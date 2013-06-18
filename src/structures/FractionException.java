package structures;

public class FractionException extends Exception {
	
	public FractionException(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return error;
	}
	
	protected String error;

}