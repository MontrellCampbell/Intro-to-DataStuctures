package a03_q3a;

public class TWDoubleLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Montrell Campbell");
		System.out.println("Asnwers for Assignment 03: Q3: \n");
		System.out.println("The double linked list is: ");
		TWDoubleLinkedList<Comparable>list = new TWDoubleLinkedList<Comparable>();
		
		 list.addFirst("sun1");
		 list.addFirst("sun2");
		 list.addFirst(12);
		 
		 list.addLast("sun3");
		 list.addLast("sun4");
		 list.addLast(24);
		 
		 
		 list.displayList();
		 
		 list.removeLast();
		 list.removeLast();
		
		System.out.println("\nThe updated double linked list");
		 list.displayList();
	
		
		
		
		

	}

}
