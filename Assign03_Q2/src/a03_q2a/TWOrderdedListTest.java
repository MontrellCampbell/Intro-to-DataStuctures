package a03_q2a;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class TWOrderdedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TWOrderedList<Integer> list = new TWOrderedList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);	
		list.add(7);
		list.add(8);
		
		Iterator<Integer> itr = list.iterator();
		
		System.out.println("The built list: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.remove(4);
		list.remove(7);
		
		
		itr = list.iterator();
		System.out.println("\nThe updated list: ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	

	}

}
