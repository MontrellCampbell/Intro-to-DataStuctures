
public class LinkedStackTestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KWLinkedStack <Student> inStack = new KWLinkedStack<Student>();
		
		System.out.println("Name: Montrell Campbell");
		System.out.println("Assignment 04: Q4 -2 ");
		
		System.out.println("-------------------------------------------- ");
		System.out.println("-------------------------------------------- ");
		
		Student stud1 = new Student("Jack", "IT", 83.5, 1425);
		Student stud2 = new Student("Jacob", "CS", 86.5, 2356);
		Student stud3 = new Student("Thomas", "EE", 92.0, 9876);
		Student stud4 = new Student("George", "ME", 94.5, 1182);
		Student stud5 = new Student("James", "IS", 63.5, 9826);
		Student stud6 = new Student("Liam", "CS", 73.5, 6793);
		
		Student [] students = {stud1, stud2, stud3, stud4, stud5, stud6};

		inStack.push(stud1);
		inStack.push(stud2);
		inStack.push(stud3);
		inStack.push(stud4);
		inStack.push(stud5);
		inStack.push(stud6);
		
		System.out.println("The size of the Linked Stack is: " + inStack.size());
		
		System.out.println("\nThe First item: ");
		System.out.println(inStack.peek());
		System.out.println("-------------------------------------------- \n ");
		
		System.out.println("The item popped out: ");
		System.out.println(inStack.pop());
		
		System.out.println("The item popped out: ");
		System.out.println(inStack.pop());
		
		System.out.println("-------------------------------------------- \n ");
		
		System.out.println("\nThe First item: ");
		System.out.println(inStack.peek());
		System.out.println("The size of the updated Linked Stack is: " + inStack.size());


	}

}
