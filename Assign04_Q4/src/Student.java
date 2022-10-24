
public class Student {
	
	private String name;
	private String major;
	private double grade;
	private int id;
	
	public Student(String name, String major, double grade, int id)
	{
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMajor()
	{
		return major;
	}
	public double getGrade()
	{
		return grade;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String toString()
	{
		return "The student information:\nName:" + name + "\nMajor:" + major + "\nGrade:" + grade + "\nId:" + id;
	}

	

}
