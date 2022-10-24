package question02;

import java.util.Arrays;

public class TWArrayList<E> {
	
	public static int INITIAL_CAPACITY = 10;
	private E [] theData;
	private int size = 0;
	private int capacity = 0;
	
	
	private void reallocate()
	{
		capacity = 2 * capacity;
		theData = Arrays.copyOf(theData, capacity);
	}
	
	public TWArrayList()
	{
		capacity = INITIAL_CAPACITY;
		theData = (E[]) new Object[capacity];
	}
	
	public TWArrayList(int num)
	{
		capacity = num;
		theData = (E[]) new Object[capacity];
	}
	
	public E get(int index)
	{
		return theData[index];
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void addFirst (E anEntry)
	{
		
		if (size == capacity)
		{
			reallocate();
			
		}
		
		if(size >= 1)
		{
			int shift = size;
			
			for (int i =1; i <= size; i++)
			{
				theData[shift] = theData[shift-1];
				shift--;

			}
			
			theData[0] = anEntry;
			size++;
			
		}
		
		if(theData[0] == null)
		{
			theData[0] = anEntry;
			size++;
			
		}
		
	}

	public void addFirstTwo(E anEntry1, E anEntry2)
	{
		
		if (size + 2 >= capacity)
		{
			reallocate();
		}
		
		if (theData[0] == null && theData[1] == null )
		{
			theData[0] = anEntry1;
			theData[1] = anEntry2;
			
			size+=2;
		}
		
		else 
		{
			addFirst(anEntry2);
			addFirst(anEntry1);
		}
		
		
	}
	
	public E removeFirst()
	{
		
		if (theData[0] == null)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
		
		for(int i =0; i < size; i++)
		{
			theData[i] = theData[i+1];
		}
		
		theData[theData.length-1] = null;
		size--;
		
		return theData[0];
	}
	
	public int indexOf(E value)
	{
		
		boolean occured = false;
		int position = 0;
		
		for (int i =0; i < theData.length; i++)
		{
			if (theData[i] == value)
			{
				occured = true;
				position = i;
				break;
			}
		}
		
		if (occured == true)
		{
			return position;
		}
		
		else 
			return -1;
		
	}
	
	
	
	
	
	

}
