package question02;

public class TWArrayListTest3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========================");
		System.out.println("Assignment 02: Question 02 - TWArrayListTest3");
		System.out.println("Montrell Campbell");
		System.out.println("805580762");
		System.out.println("========================");
		
		TWArrayList<String> array1 = new TWArrayList<String>();
		
		
		System.out.println("The array list created with the method addFirstTwo(E anEntry1, E anEntry2");
		array1.addFirstTwo("sun1", "sun2");
		array1.addFirstTwo("sun3", "sun4");
		
		for(int i = 0; i < array1.getSize(); i++)
		{
			System.out.println("The item of index is "+ "" + i + " " + array1.get(i));
		}
		
		System.out.println("\n");
		
		System.out.println("The index of sun1 is: " + array1.indexOf("sun1"));
		System.out.println("The index of sun4 is: " + array1.indexOf("sun4"));
		System.out.println("The index of sun5 is: " + array1.indexOf("sun5"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
