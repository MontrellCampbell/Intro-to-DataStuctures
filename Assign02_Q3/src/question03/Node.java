package question03;

public class Node<E> {
	
	
	private E data;
	private Node<E> next;
	
	private Node(E dataItem, Node <E> nodeRef)
	{
		this.data = dataItem;
		this.next = nodeRef;
	}
	
	

}
