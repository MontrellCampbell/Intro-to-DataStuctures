package q02;

public class OutputInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Linda Ward", 26, "Female", 17.8, 22.7);
		Employee employee2 = new Employee("Linda Ward", 26, "Female", 19.3, 17.8);
		
		Student student1 = new Student("James Smith", 21, "Male", "Computer Science", 350, 4);
		Student student2 = new Student("James Smith", 21, "Male", "Information Technology", 281, 3);
		
		if(employee1.equals(employee2))
		{
			System.out.println("Are equal");
		}
		
		else 
			System.out.println("Not equal");
		
		if(student1.equals(student2))
		{
			System.out.println("Are equal");
		}
		
		else 
			System.out.println("Not equal");
		
		
		


	}

}
