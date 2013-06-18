package structures;

import structure.exceptions.FractionException;

public class Fraction 
{
    int[] primesNumber;
	private int m; //numerator
	private int n; //denominator
	
	
	public Fraction(int m, int n) throws FractionException 
	{
		if (n == 0){
			throw new FractionException(new String("Divided by zero.(n != 0)"));
		}
		
		if (n<0) {
			
			m = m*(-1);
			n = n*(-1);
			
		}
		
		if(m>n){
			int[] primesNumber = new int[m];
		}
		else{
			int[] primesNumber = new int[n];
		}
		primesNumber[0] = 2;
		//for(int  i=1; i<n ; i++){
			
		//	for(int j=0; )
			
		
		
	}
	
	private void Short(Fraction mn){}

}