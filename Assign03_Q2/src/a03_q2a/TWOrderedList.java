package a03_q2a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TWOrderedList<E extends Comparable<E>> {
	
	private LinkedList <E> theList;
	
	
	public TWOrderedList()
	{
		theList = new LinkedList<E>();
	}
	
	public void add (E obj)
	{
		theList.add(obj);
	}
	
	public Iterator<E> iterator ()
	{
		
		return theList.iterator() ;
	}

	public boolean remove(E obj)
	{
		
		return theList.remove(obj);
	}
	
	public String toString()
	{
		String list = "";
		
		ListIterator <E> iterator = theList.listIterator();
		
		while(iterator.hasNext())
		{
			list += iterator + " \n";
		}
		
		return list;
	}
}
