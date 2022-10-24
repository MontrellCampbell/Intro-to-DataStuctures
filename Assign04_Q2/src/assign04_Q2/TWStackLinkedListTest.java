package assign04_Q2;

public class TWStackLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("Assignment 04: Q2");
		System.out.println("Name: Montrell Campbell");
		System.out.println("Student id: mcamp10");
		System.out.println("---------------------------\n");
		
		TWStackLinkedList<String> list = new TWStackLinkedList<String>();
		
		System.out.println("The initial linked list is: ");
		
		list.push("sun1");
		list.push("sun2");
		list.push("sun3");
		list.push("sun4");
		list.push("sun5");
		list.push("sun6");
		
		list.printList(list.getHead());
	
		System.out.print("\nThe head of the initial linked is: ");
		list.printNode(list.getHead());
		System.out.println("----------------------------------------");
		
		System.out.println();
		
		System.out.println("The reversed linked list is: ");
		System.out.println(list.reverseList(list.getHead()));

	}

}
