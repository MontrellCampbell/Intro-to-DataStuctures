package assign04_Q1;

public class ListQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListQueue <Integer> ls1 = new ListQueue <Integer>();
		
		ls1.add(14);
		ls1.add(2);
		ls1.add(4);
		ls1.add(6);
		ls1.add(11);
		ls1.add(8);
		
		int evenNumbers = 0;
		
		for(int item: ls1)
		{
			if(item % 2 == 0)
			{
				evenNumbers++;
			}
		}
		
		System.out.println("Name: Montrell Campbell");
		System.out.println("Assignment 04: Q1");
		System.out.println("---------------------------\n");
		System.out.println("There are " + evenNumbers + " even numbers in the queue.");
		
		System.out.println("The initial queue: " + ls1);
		System.out.println("The front of the queue " + ls1.peek());
		System.out.println("The removed front element " + ls1.peek());
		ls1.poll();
		System.out.println("The updated front of the queue " + ls1.peek());
		System.out.println("The updated queue: " + ls1);
		System.out.println("Output the queue element one by one: ");
		
		for(int item: ls1)
		{
			System.out.println(item);
		}
		
		System.out.println("The size of the updated queue: " + ls1.size());
		
		
		

	}

}
