package structure;

public class time {
	public int hour = 0;
    public int min = 0;
    
    public Set(int a, int b)
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
    public Get()
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
