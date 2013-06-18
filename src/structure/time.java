// Author : Denis Rylskiy 
// E-mail : denisrylsky@gmail.com
// Our symbol: Leonid Novikov
package structure;

public class time {
	public int hour = 0;
    public int min = 0;
    
    public void Set(int a, int b)
    {
    	if ((a>=0) && (a<=24))
    	{
    		this.hour = a;
    	}
    	else
    	{
    		System.out.println ("Incorrect format");
    	}
    	if ((b>=0) && (a<=60))
    	{
    		this.min = b;
    	}
    	else
    	{
    		System.out.println ("Incorrect format");
    	}
    }
    
    public void Get()
    {
    	if ((this.hour != 0) || (this.min != 0))
    	{
    		System.out.println (this.hour+" : "+this.min);
    	}
    	else
    	{
    		System.out.println ("Fuck!");
    	}
    }
}
