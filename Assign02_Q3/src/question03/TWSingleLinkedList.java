package question03;

	public class TWSingleLinkedList<E> {
		
		
	private Node <E> head = null;
	private int size = 0;
	
	private Node<E> getNode(int index)
	{
		
		return head; 
	}
	
	
	public String toString()
	{
		Node<E> node = head;
		String output = "";
		
		while (node != null)
		{
			if (node.next == null)
			{
				output += node.data;
			}
			
			else 
				
			{
				output += node.data + " ==> ";
			}
			
			
			node = node.next;
		}
		
		return output;
	}
	
	public int getSize()
	{
		
		return size;
		
	}
	
	public int remove(E item)
	{
		
		Node<E> node = head;
		Node<E> prevNode = head;
		int index = -1;
		int count =0;
		
		Node<E> oldHead = null;
		Node<E> newNext = null;
		
		
			
			if(head.data == item)
			{
				oldHead = head;
				head = head.next;
				oldHead.next = null;
				size--;
				index =0;
			}
			
			
			else
			{
				while(node != null)
				{
					if(node.data == item)
					{
						newNext = node.next;
						
						while(node != null)
						{
							if(prevNode.next == node)
							{
								prevNode.next = newNext;
								node.next = null;
								index = count;
								size--;
								break;
							}
								prevNode = prevNode.next;
						}
					}
					
					count++;
					node = node.next;
				}
				}
			
			return index;
		
	}
	
	public void addBefore(int index, E item)
	{
		Node<E> node = head;
		Node<E> newNode = new Node(item, null);
		Node<E> newNext = head;
		int count = 0;
		
		if (index ==0)
		{
			if(head == null)
			{
				head = newNode;
				size++;
			}
			else
			{
				newNode.next = node;
				head = newNode;
				size++;
			}
		}
		
		else
		{
		
			while(count < index && node != null)
			{
			
				if (count == index-1)
				{
					newNext = node.next;
					node.next = newNode;
					newNode.next = newNext;
					size++;
					break;
				}
			
				count++;
				node = node.next;
			
		}
		}
	}
	
	private static class Node<E> 
	{
	
		private E data;
		private Node<E> next;
	
		private Node(E dataItem, Node <E> nodeRef)
		{
			this.data = dataItem;
			this.next = nodeRef;
		}
	
	

	}
	

}
