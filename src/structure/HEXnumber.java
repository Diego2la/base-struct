// Author : Silchenkov Ilya 
// E-mail : gitrus@yandex.com
// Our symbol: Leonid Novikov

package structure;

import structure.exceptions.HexException;

public class HEXnumber {
	
	public String HexNumber;
	private int[] IntHexNumber;

	public HEXnumber (String s) throws HexException 
	{
		
		s.toUpperCase();
		
		for(char symbol : s.toCharArray() )
		{
			
			if( ((symbol>='F')&&(symbol<'A')) ||((symbol<='0')&&(symbol>='9'))){
				
				throw new HexException(new String("Fucking idiot u think it's Dex number?"));
			}
			
		}
		
		HexNumber    = new String(s);
		IntHexNumber = new int[HexNumber.length()];
		
		char sym;
		for(int i=0; i<HexNumber.length(); ++i)
		{
			sym = HexNumber.charAt(i);
			if (( sym <='9') && ( sym >='0')) IntHexNumber[i] = sym -'0';
			if (( sym <='F') && ( sym >='A')) IntHexNumber[i] = sym - 'A' + 10;
			
		}
		
	}
	
	public HEXnumber (int s)
	{
		
		this.HexNumber.valueOf(s); 
		
	}
	
	public HEXnumber ()
	{
		
		this.HexNumber.valueOf(0); 
		
	}
	
	
	public HEXnumber Plus (HEXnumber num1, HEXnumber num2) throws HexException
	{
		
		HEXnumber result = new HEXnumber("0");
		
		if((num1 == null)||(num2 == null)){
			throw new HexException(new String("Fucking idiot u think it's Dex number?"));
		}
		
		int max;
		int diff;
		int length1 = num1.IntHexNumber.length;
		int length2 = num2.IntHexNumber.length;
		
		if(length1>length2){
			max = length1;
			diff = max - length2;
		}
		else{
			max = length2;
			diff = max - length1;
		}
		
		result.IntHexNumber = new int[max];
		max -=1;
		if(length1>length2){
			
			for(int i=max; i > (-1); --i) result.IntHexNumber[i] = num1.IntHexNumber[i] + num2.IntHexNumber[i-diff];
		
		}
		else{
			
			for(int i=max; i > (-1); --i) result.IntHexNumber[i] = num1.IntHexNumber[i-diff] + num2.IntHexNumber[i];
			
		}
		
		for(int i=max; i > (-1); --i){
			
			if(result.IntHexNumber[i]>15){
				
				result.IntHexNumber[i] -= 15;
				result.IntHexNumber[i-1] += 1;
			}
			
		}
		
		return result;
	}
	
	
	
}
