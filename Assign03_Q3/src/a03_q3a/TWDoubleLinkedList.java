package a03_q3a;

import java.util.NoSuchElementException;

public class TWDoubleLinkedList<E> {
	
	private Node <E> head;
	private Node <E> tail;
	private int size;
	
	public TWDoubleLinkedList()
	{
		size = 0;
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		if (size > 0)
		{
			return false;
		}
		
		else 
			return true;
	}
	
	public void addFirst(E data)
	{
		
		Node <E> newNode = new Node<E>(data, null, null);
		Node <E> tempNode = null;
		
		
		if (head == null)
		{
			head = newNode;
			size++;
		}
		
		else
		{
			 tempNode = head;
			 head = newNode;
			 head.next = tempNode;
			 tempNode.prev = head;
			 size++;
	
			 Node <E> node = head;
				
				while (node != null)
				{
					if (node.next == null)
					{
						tail = node;
					}
					
					node = node.next;
				}
		}
		
	}
	
	public void addLast(E data)
	{
		Node <E> newNode = new Node<E>(data, null, null);
		Node <E> tempNode = null;
		
		
		if (head == null)
		{
			addFirst(data);
		}
		
		
		else if (tail == null)
		{
			tail = newNode;
			size++;
		}
		
		else
		{
			 tempNode = tail;
			 tail = newNode;
			 tail.prev = tempNode;
			 tempNode.next = tail;
			 
			 size++;
		}
	}
	
	public E removeFirst()
	{
		
		if (size ==0)
		{
			throw new NoSuchElementException();
		}
		
		
		Node <E> tempNode = null;
		
		tempNode = head;
		head = head.next;
		head.prev = null;
		size--;
		
		
		return tempNode.data;
	}
	
	public E removeLast()
	{
		
		if (size ==0)
		{
			throw new NoSuchElementException();
		}
		
		
		Node <E> tempNode = null;
		
		tempNode = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		
		
		return tempNode.data;
	}
	
	
	public void displayList()
	{
		Node <E> node = head;
		String nodeList = "";
		
		while (node != null)
		{
			nodeList += node.data + " ";
			node = node.next;
		}
		
		System.out.println(nodeList);
	}
	
	
	public static class Node <E>
	{
		
		private E data;
		private Node <E> next;
		private Node <E> prev;
		
		
		public Node (E data)
		{
			this.data = data;
		}
		
		public Node (E data, Node <E> next, Node <E> prev)
		{
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
		
		public void displayNode()
		{
			
			System.out.println(data);
			
		}
		
		public String toString()
		{
			
			return (String) next.data;
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}



