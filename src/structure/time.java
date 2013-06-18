// Author : Denis Rylskiy 
// E-mail : denisrylsky@gmail.com
// Our symbol: Leonid Novikov
package structure;

public class time {
	public int hour = 0;
    public int min = 0;
    
    public void Set(int hour, int min)
    {
    	if ((hour>=0) && (hour<=24))
    	{
    		this.hour = hour;
    	}
    	else
    	{
    		System.out.println ("Incorrect format");
    	}
    	if ((min>=0) && (min<=60))
    	{
    		this.min = min;
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
