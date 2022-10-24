package assign04_Q3;
public class TWArrayQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TWArrayQueue<String> aq1 = new TWArrayQueue<String>();
		
		System.out.println("Name: Montrell Campbell"); 
		System.out.println("Assignmnet 04: Q3\n");
		
		aq1.offer("sun1", "sun1");
		aq1.offer("sun1", "sun2");
		aq1.offer("sun2", "sun3");
		aq1.offer("sun4", "sun4");
		aq1.offer("sun5", "sun6");
		
		System.out.println("The initial queue: "+aq1);
		
		var iterator = aq1.iterator();
		int index =0;
		
		while(iterator.hasNext())
		{
			
			if(iterator.next().equals("sun5"))
			{
				System.out.println("The index of sun5 in the queue is: "  + index);
				
				
			}
			
			index++;
		}
		
		aq1.poll();
		aq1.poll();
		aq1.poll();


		
		System.out.println("The updated queue "+aq1);
		

	}

}
