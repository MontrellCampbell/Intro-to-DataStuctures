package q03;

import java.util.Scanner;

public class RtTriangle extends AbstractShape {
	
	private double base;
	private double height;
	
	public RtTriangle()
	{
		super("shapeName");
	}
	
	public RtTriangle(double base, double height)
	{
		super("shapeName");
		this.base = base;
		this.height = height;
		
	}
	
	public double getBase()
	{
		return this.base;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setBase(double base)
	{
		this.base = base;
		
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}

	@Override
	public double computeArea() 
	{
		return 0.5 * this.base * this.height;
	}

	@Override
	public double computePerimeter() {
		
		double C = Math.pow(height,2) + Math.pow(base,2);
		
		return height + base + Math.sqrt(C);
	}

	@Override
	public void readShapeData() {
		Scanner in = null;
        
        try {
        	in = new Scanner(System.in);
        
        	System.out.println("Enter the base of the Rectangle");
        	base = in.nextDouble();
        	System.out.println("Enter the height of the Rectangle");
        	height = in.nextDouble();
        }
        finally {
        	if (in != null)
        		in.close();
        }
		
	}
	
	@Override
	public String toString()
	{
		return "";
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
