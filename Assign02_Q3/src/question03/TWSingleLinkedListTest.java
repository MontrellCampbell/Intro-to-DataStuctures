package question03;

public class TWSingleLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TWSingleLinkedList<String> list = new TWSingleLinkedList<String>();
		
		System.out.println("=========================");
		System.out.println("Assignment 02: Question 03");
		System.out.println("Montrell Campbell");
		System.out.println("805580762");
		System.out.println("=========================");
		
		list.addBefore(0, "sun1");
		list.addBefore(0, "sun2");
		list.addBefore(1, "sun3");
		
		System.out.println("The orginal single linked list names is " + list);
		System.out.println("The orginal single linked list size is " + list.getSize() + "\n");
		
	
		list.remove("sun2");
		outputResult(0, list);
		
		
		list.remove("sun1");
		outputResult(1,list);
		
		list.addBefore(0, "snow1");
		outputResult(list);
		list.addBefore(1, "snow2");
		outputResult(list);
		
		
	
	}

	public static void outputResult(TWSingleLinkedList<String> names)
	{
		System.out.printf("The updated single linked list names is: " + names.toString() + "\nThe updated linked list size is: " + names.getSize() + "\n");
	}
	
	public static void outputResult(int index, TWSingleLinkedList<String> names)
	{
		if (index == -1)
		{
			System.out.println("No node found");
		}
		
		else {
			
			System.out.println("The index of the removed node is " + index);
			System.out.println("The updated single linked list name is: " + names.toString() + " \n" + "The updated linked list size is " + names.getSize()+ "\n");
		}
	}
	
	
}
