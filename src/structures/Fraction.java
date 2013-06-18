package structures;

public class Fraction 
{
	public int m; //numerator
	public int n; //denominator
	
	
	public Fraction(int m, int n) throws FractionException 
	{
		if (n == 0){
			throw new FractionException(new String("Divided by zero.(n != 0)"));
		}
		Short(this);
	}
	
	public Fraction operator (Fraction frct1, char symbolOperator, Fraction frct2 ) throws FractionException
	{
		
		switch (symbolOperator){
			case '-' :
			{
				frct1.m = (frct1.m*frct2.n - frct2.m*frct1.n);	// a/b - c/d = (a*d - c*b) / (b*d)
				frct1.n = frct1.n*frct2.n;						//b*d
				Short(frct1);//
				break;
			}
			
			case '+' :
			{
				frct1.m = (frct1.m*frct2.n + frct2.m*frct1.n);	// a/b + c/d = (a*d + c*b) / (b*d)
				frct1.n = frct1.n*frct2.n;						//b*d
				Short(frct1);//
				break;
			}
			
			case '*' :
			{
				frct1.m = frct1.m*frct2.m ;						// a/b * c/d = (a * c) / (b*d)
				frct1.n = frct1.n*frct2.n;						//b*d
				Short(frct1);//
				break;
			}
			
			case '/' :
			{
				frct1.m = frct1.m*frct2.n ;						// a/b / c/d = (a * d) / (b*c)
				frct1.n = frct1.n*frct2.m;						//b*c
				Short(frct1);//
				break;
			}
			
			default: {throw new FractionException(new String("Invalid operator (+ - / *)"));}
		}
		
		return frct1;
		
	}	

	private void Short(Fraction frct)
	{
		int[] primeNumbers;
		int size;
		
		if (n<0) {
			
			frct.m = frct.m*(-1);
			frct.n = frct.n*(-1);
			
		}
		
		if(m>n){
			size = (int) Math.round(Math.sqrt((double) m)) + 1;
			primeNumbers = new int[size];
		}
		else{
			size = (int) Math.round(Math.sqrt((double) n)) + 1;
			primeNumbers = new int[size];
		}
		
		
		primeNumbers[0] = 2;
		
		for(int  i=2; i<size ; i++){
			
			for(int j=0; j<i; j++)
			{
				if (primeNumbers[j] == 0) primeNumbers[j] = i;

				else if (i%primeNumbers[j] != 0) break;
			}
		}
		
		
		int i = 0;
		while(i < size){
			if((m%primeNumbers[i] == 0) && (n%primeNumbers[i] == 0))
			{
				frct.m = m/primeNumbers[i];
				frct.n = n/primeNumbers[i];
			}
			else i++;
		}
		
	}

}
