package question02;

public class TWArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========================");
		System.out.println("Assignment 02: Question 02 - TWArrayListTest2");
		System.out.println("Montrell Campbell");
		System.out.println("805580762");
		System.out.println("========================");
		
		TWArrayList<String> array1 = new TWArrayList<String>();
		
		array1.addFirst("sun1");
		array1.addFirst("sun2");
		
		System.out.println("The created array list:");
		for (int i =0; i < array1.getSize(); i++)
		{
			System.out.println("The item of index " + i + " is " + array1.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("The calling time "+ 1 + " of method removeFirst()");
		array1.removeFirst();
		System.out.println("The calling time "+ 2 + " of method removeFirst()");
		array1.removeFirst();
		System.out.println("The calling time "+ 3 + " of method removeFirst()");
		array1.removeFirst();
	}

}
