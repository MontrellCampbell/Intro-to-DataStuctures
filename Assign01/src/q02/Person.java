package q02;

import java.text.DecimalFormat;

public abstract class Person {
	
	private String name;
	private int age;
	private String gender;
	
	
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	

	public String toString()
	{
		return this.getName() + "/n"
				+ this.getAge() + "/n"
				+ this.getGender() + "/n"
				;
	}
	
	public boolean equals(Object obj)
	{
		Person person2 = (Person) obj;
		boolean isEqual = true;
		
		if (!this.getName().equals(person2.getName()))
		{
			isEqual = false;
		}
		
		if (this.getAge() != person2.getAge())
		{
			isEqual = false;
		}
		
		if (!this.getGender().equals(person2.getGender()))
		{
			isEqual = false;
		}
		
		return isEqual;
	}
	

}
