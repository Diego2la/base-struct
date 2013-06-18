// Author : Tyurin Dima
// E-mail : tyurin94@gmail.com
// Our symbol: Leonid Novikov

package structure.exceptions;

public class BaseStructException extends Exception {
	
	public BaseStructException(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return error;
	}
	
	protected String error;

}
