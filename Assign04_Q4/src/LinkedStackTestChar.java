
public class LinkedStackTestChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KWLinkedStack <Character> inStack = new KWLinkedStack<Character>();
		
		System.out.println("Name: Montrell Campbell");
		System.out.println("Assignment 04: Q4 - 1 ");
		System.out.println("---------------------------------\n");
		
		inStack.push('a');
		inStack.push('v');
		inStack.push('a');
		inStack.push('J');
		inStack.push(' ');
		inStack.push('e');
		inStack.push('m');
		inStack.push('o');
		inStack.push('c');
		inStack.push('l');
		inStack.push('e');
		inStack.push('w');
		
		System.out.println("The size of the Linked Stack is: " + inStack.size());
		System.out.println("\nthe first item is " + inStack.peek());
		
		inStack.pop();
		inStack.pop();
		
		System.out.println("\nthe first item is " + inStack.peek());
		System.out.println("The updated size of the Linked Stack is: " + inStack.size());
		
	
		
	}

}
