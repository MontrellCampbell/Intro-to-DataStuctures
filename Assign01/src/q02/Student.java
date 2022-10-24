package q02;

import java.text.DecimalFormat;

public class Student extends Person {
	
	private String major;
	private double totalGrade;
	private int numberOfCourses;
	
	public Student (String name, int age, String gender, String major, double totalGrade, int numberOfCourses)
	{
		super(name, age, gender);
		this.major = major;
		this.totalGrade = totalGrade;
		this.numberOfCourses = numberOfCourses;
	}
	
	public double getAverageGrade()
	{
		double averageGrade = totalGrade / numberOfCourses;
		return averageGrade;
		
	}
	

	@Override
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		
		return this.getName() + "/n"
				+ this.getAge() + "/n"
				+ this.getGender() + "/n"
				+ df.format(getAverageGrade());
	}

	@Override
	public boolean equals(Object obj)
	{
		Student student2 = (Student) obj;
		boolean isEqual = true;
		
		if (!this.getName().equals(student2.getName()))
		{
			isEqual = false;
		}
		
		if (this.getAge() != student2.getAge())
		{
			isEqual = false;
		}
		
		if (!this.major.equals(student2.major))
		{
			isEqual = false;
		}
		
		return isEqual;
	}
	

}
