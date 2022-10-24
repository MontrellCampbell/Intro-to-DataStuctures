import java.util.EmptyStackException;

public class KWLinkedStack<E> implements KWStackInterface<E> {
	
	private Node <E> topOfStackRef= null;
	private int size;
	
	public static class Node<T>
	{
		private T data;
		private Node <T> next;
		
		private Node (T dataItem)
		{
			this.data = dataItem;
		}
		
		private Node (T dataItem, Node <T> nodeRef)
		{
			this.data = dataItem;
			this.next = nodeRef;
		}
		
	}

	@Override
	public void push(E data) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(data, null);
		Node<E> oldNode = new Node<E>(null, null);
		
		if( topOfStackRef == null)
		{
			topOfStackRef = newNode;
			size++;
		}
		
		else
		{	
			oldNode = new Node<E>(topOfStackRef.data, topOfStackRef.next);
			topOfStackRef = new Node<E>(newNode.data, oldNode);
			size++;
		}
		
		
	}

	@Override
	public E peek() 
	{
		return topOfStackRef.data;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
		Node <E> oldRef = topOfStackRef;
		
		if (size > 0)
		{
			topOfStackRef = topOfStackRef.next;
			size--;
		}
		
		else 
			throw new EmptyStackException();
		
		return oldRef.data;
	}
		
	

	
	public boolean empty() {
		
		if(size < 1)
		{
		return true;
		}
		
		else 
		{
			return false;
		}
		// TODO Auto-generated method stub
		
	}
	
	public int size()
	{
		
		return size;
	}

}
