package a03_q1a;

public class InsertRemoveDoubleLinkedList1 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Montrell Campbell");
		System.out.println("Assignment 03: Q1 - (a):\n");
		
		System.out.println("the created double-linked list:");
		System.out.println("==================================");
		
		
		
		Node <String> tom = new Node <String> ("Tom");
		Node <String> dick = new Node <String> ("Dick");
		Node <String> harry = new Node <String> ("Harry");
		Node <String> sam = new Node <String> ("Sam");
		
		
		tom.next = dick;
		tom.prev = null;
		
		dick.next = harry;
		dick.prev = tom;
		
		harry.next = sam;
		harry.prev = dick;
		
		sam.next = null;
		sam.prev = harry;
		
		
		System.out.println("The next person following Tom is: " + tom.next.data + "\n");
		System.out.println("The previous person of Dick is: " + dick.prev.data);
		System.out.println("The next person following Dick is: " + dick.next.data + "\n");
		
		System.out.println("The previous person of Harry is: " + harry.prev.data);
		System.out.println("The next person following Harry is: " + harry.next.data + "\n");
		
		
		
		
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

