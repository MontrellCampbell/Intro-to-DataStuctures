package assign04_Q2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class TWStackLinkedList<E> {
	
	private Node <E> head;
	
	public static class Node <T>{
		
		private T data;
		private Node <T> next;
		
		public Node (T dataItem, Node<T> nodeRef)
		{
			this.data = dataItem;
			this.next = nodeRef;
		}
			
	}
	
	public TWStackLinkedList()
	{
		head = null;
	}
	
	public Node<E> getHead()
	{
		
		return head;
		
	}
	
	public void push(E item)
	{
		
		if (head == null)
		{
			Node<E> newNode = new Node<E>(item, null);
			head = newNode;
		}
		else 
		{
			Node<E> newNode = new Node<E>(item, head);
			head = newNode;
		}
	}
	
	public E reverseList (Node<E> head)
	{
		Deque<E> stackDeque = new LinkedList<E>();
		Node<E> newNode = head;
		Node<E> newHead = null;
		
		if (head == this.head)
		{
			while(newNode != null)
			{
				stackDeque.offerFirst(newNode.data);
				
				if(newNode.next == null)
				{
					newHead = newNode;
				}
				
				newNode = newNode.next;
			}
			
			for (E item: stackDeque)
			{
				System.out.print(item);
				System.out.print(" -> ");
			}
			
		}
		
		System.out.print("\n\nThe head of the reversed linked list is: ");
		
		return newHead.data;
		
	}
	
	
	public void printNode(Node<E> node)
	{
		System.out.println(node.data);
	}
	
	public void printList(Node<E> head)
	{
		Node<E> newNode = head;
		String linkedStack = "";
		
		if (head == this.head)
		{
			if (newNode.next == null)
			{
				linkedStack += newNode.data;
			}
			
			else
			{
			while(newNode!= null)
			{
				linkedStack += newNode.data;
				if(newNode.next != null)
				{
					linkedStack += " -> ";
				}
				newNode = newNode.next;
			}
			}
		}
		
		System.out.println(linkedStack);
	}
	
	
	

}
