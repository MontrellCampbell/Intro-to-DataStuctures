package q02;

import java.text.DecimalFormat;

public class Employee extends Person {
	
	private double hour;
	private double rate;
	private double payment;
	
	
	public Employee(String name, int age, String gender, double hour, double rate)
	{
		super(name, age, gender);
		this.hour = hour;
		this.rate = rate;
		this.payment = rate * hour;
	}
	
	public double getHour()
	{
		return this.hour;
	}
	
	public double getRate()
	{
		return this.rate;
	}
	
	public double getPayment()
	{
		return this.payment;
	}
	
	@Override
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		
		return this.getName() + "/n"
				+ this.getAge() + "/n"
				+ this.getGender() + "/n"
				+ df.format(getPayment());
	}

	@Override
	public boolean equals(Object obj)
	{
		Employee employee2 = (Employee) obj;
		boolean isEqual = true;
		
		if (!this.getName().equals(employee2.getName()))
		{
			isEqual = false;
		}
		
		if (this.getAge() != employee2.getAge())
		{
			isEqual = false;
		}
		
		if (this.payment != employee2.payment)
		{
			isEqual = false;
		}
		
		return isEqual;
	}
}
