  import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Name: Montrell Campbell");
		System.out.println("Assignment 04: Q5");
		System.out.println("----------------------------------");
		
		Stack<Integer> stack1 = new Stack <Integer>();
		Stack<Integer> stack2 = new Stack <Integer>();
		
		Queue<Integer> queue = new LinkedList<Integer>();

		stack1.push(-1);
		stack1.push(15);
		stack1.push(23);
		stack1.push(44);
		stack1.push(4);
		stack1.push(99);
		
		for(int item: stack1)
		{
			queue.offer(item);
		}
		
		for(int item: stack1)
		{
			stack2.push(item);
		}
		
		
		
		for(int i =0; i < stack1.size(); i++)
		{
			System.out.println(stack2.pop() + "			" + queue.poll());
		}
		
	
	}

}
