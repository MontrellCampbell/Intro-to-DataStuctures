package assign04_Q3;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class TWArrayQueue<E> extends AbstractQueue<E> implements Queue<E> {
	
	private int front;
	private int rear;
	private int size;
	private int capacity;
	private final int DEFAULT_CAPACITY = 10;
	private E[] theData;
	
	private class iter implements Iterator<E>
	{
		private int index;
		private int count = 0;
		
		public iter()
		{
			index = front;
			count=0;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return count < size;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			
			if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E returnValue = theData[index];
            index = (index + 1) % capacity;
            count++;
            return returnValue;
			
		}
		
	}
	@SuppressWarnings("unchecked")
	public TWArrayQueue()
	{
		capacity = DEFAULT_CAPACITY;
		theData = (E[]) new Object[capacity];
		size =0;
		front =0;
		rear = capacity -1;
		 
	}
	
	@SuppressWarnings("unchecked")
	public TWArrayQueue(int initCapacity)
	{
		capacity = initCapacity;
		theData = (E[]) new Object[capacity];
		size=0;
		front =0;
		rear = capacity -1;
	}
	
	

	@Override
	public boolean offer(E item) {
		// TODO Auto-generated method stub
		
		if (size == capacity) {
            reallocate();
        }
        size++;
        rear = (rear + 1) % capacity;
        theData[rear] = item;

		
		return true;
	}
	
	public boolean offer(E item1, E item2) {
		// TODO Auto-generated method stub
		
			offer(item1);
			offer(item2);
		
		return true;
	}


	@Override
	public E poll() {
		// TODO Auto-generated method stub
		
		  if (size == 0) {
	            return null;
	        }
		  
		  E tempVar = theData[front];
		  E result = null;
		  
		  while(theData[front] == tempVar)
		  {
	        result = theData[front];
	        front = (front + 1) % capacity;
	        size--;
	        
		  }
	        
	        return result;
		
		
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		
		E front = null;
		
		for(E item: theData)
		{
			
			front = item;
		}
		
		
		return front;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new iter();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private void reallocate()
	{
		int newCapacity = capacity *2;
		E [] tempArr = (E[])new Object [capacity];
		
		for(int i =0; i < size; i++)
		{
			tempArr[i] = theData[i];
		}
		
		front = 0;
        rear = size - 1;
        capacity = newCapacity;
        theData = tempArr;
		
	}

	
	
	
	
	
}
