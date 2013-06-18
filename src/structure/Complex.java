package structure;

import structure.exceptions.ComplexException;

public class Complex
{
    public double re;
    public double im;
    
	public Complex(double a, double b)
    {
        this.re = a;
        this.im = b;
    }
    
	public Complex plus(Complex z) throws ComplexException
    {
        if (z == null)
		{
			throw new ComplexException(new String("it's null!"));
		}
		return new Complex(re + z.re, im + z.im);
    }
    
    public Complex minus(Complex z) throws ComplexException
    {
        if (z == null)
		{
			throw new ComplexException(new String("it's null!"));
		}
		return new Complex(re - z.re, im - z.im);
    }
	
    public boolean isReal() {
		return Math.abs(im) < MIN; 
	}
	
    public boolean equals(Complex z) throws ComplexException
	{ 
        if (z == null)
		{
			throw new ComplexException(new String("it's null!"));
		}
		return (Math.abs(re - z.re) + Math.abs(im - z.im)) < MIN;
    }
    
    public double mod() { 
		return Math.sqrt(re * re + im * im);
	}
    
	public double arg() {
		return Math.atan2(re, im);
	}
    
    public String toString() 
    {
        return new String("Complex: " + re + " " + im);
    }
    
    public void print()
    {
        System.out.println (re + (im < 0.0 ? "" : "+") + im + "i");
    }

    private final double MIN = 0.00001;

}