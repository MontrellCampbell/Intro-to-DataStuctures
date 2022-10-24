package question02;

public class TWArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TWArrayList<String> array1 = new TWArrayList<String>(1);
		
		System.out.println("========================");
		System.out.println("Assignment 02: Question 02 - TWArrayListTest1");
		System.out.println("Montrell Campbell");
		System.out.println("805580762");
		System.out.println("========================");
		
		array1.addFirst("sun1");
		array1.addFirst("sun2");
		array1.addFirst("sun3");
		
		System.out.println("The array list:");
		for (int i =0; i < array1.getSize(); i++)
		{
			System.out.println("The item of index " + i + " is " + array1.get(i));
			
		}
		
		System.out.println("\n");
		
		array1.addFirstTwo("sun4", "sun5");
		System.out.println("The updated array list after calling " + "addFirstTwo (\"sun4\", \"sun5\")");
		for (int i =0; i < array1.getSize(); i++)
		{
			System.out.println("The item of index " + i + " is " + array1.get(i));
			
		}
		
		System.out.println(array1.getSize());
		System.out.println("\n");
		
		array1.removeFirst();
		
		System.out.println("The updated array list after calling " + "removeFirst()");
		for (int i =0; i < array1.getSize(); i++)
		{
			System.out.println("The item of index " + i + " is " + array1.get(i));
			
		}
		
		System.out.println("\n");
		
		System.out.println("The size of the array list is: " + array1.getSize());
		System.out.println("The capacity of the array list is: " + array1.getCapacity());
		
		

	}

}
