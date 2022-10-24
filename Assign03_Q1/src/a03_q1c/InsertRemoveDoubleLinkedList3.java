package a03_q1c;


public class InsertRemoveDoubleLinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Montrell Campbell");
		System.out.println("Assignment 03: Q1 - (c):\n");
		
		System.out.println("the created double-linked list:");
		System.out.println("==================================");
		
		
		Node <String> bill = new Node <String> ("Bill");
		Node <String> tom = new Node <String> ("Tom");
		
		Node <String> harry = new Node <String> ("Harry");
		Node <String> sue = new Node <String> ("Sue");
		Node <String> sam = new Node <String> ("Sam");
		
		bill.next = tom;
		
		
		tom.next = harry;
		tom.prev = bill;
		
		
		harry.next = sue;
		harry.prev = tom;
		
		sue.next = sam;
		sue.prev = harry;
		
		sam.next = null;
		sam.prev = sue;
		
		System.out.println("The next person following Bill is: " + bill.next.data + "\n");
		
		System.out.println("The previous person of Tom is: " + tom.prev.data);
		System.out.println("The next person following Tom is: " + tom.next.data + "\n");
		
		System.out.println("The previous person of Harry is: " + harry.prev.data);
		System.out.println("The next person following Harry is: " + harry.next.data + "\n");
		
		System.out.println("The previous person of Sue is: " + sue.prev.data);
		System.out.println("The next person following Sue is: " + sue.next.data + "\n");
		
		System.out.println("The previous person of Sam is: " + sam.prev.data);

		
	}
	
	private static class Node<E>
	{
		private Node <E> next;
		private Node <E> prev;
		private E data ;
		
		
		public Node(E dataItem)
		{
			this.data = dataItem;
		}
		
		
	}

}

