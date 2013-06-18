import structures.*;

public class Main {

	public static void main(String[] args) {

		// using structures samples 
		// (not all methods are tested here)
		testStack();
		
		System.out.println();
		System.out.println();
		
		testQueue();
		
	}
	

	protected static void testStack() {
		try {
			Stack<Point> points;
			points = new Stack<Point>();
			System.out.println(points);
			
			points.push(new Point(3,4));
			System.out.println(points);
			
			points.push(new Point(2,2));
			System.out.println(points);
			
			points.pop();
			System.out.println(points);
			
			System.out.println("-------------------");
			
			Stack<Point> stack = new Stack<Point>(points);
			System.out.println(stack);

			stack.pop();
			System.out.println(stack);

			try {
				stack.pop();
			}
			catch (StackException e) {
				System.out.println("Error : " + e.toString());
			}

		}
		catch(StackException e) {
			e.printStackTrace();
		}
		
	}
	
	protected static void testQueue() {
		
		Queue<Integer> q = new Queue<Integer>();
		q.push(new Integer(100));
		q.push(new Integer(101));
		q.push(new Integer(102));
		q.push(new Integer(102));
		q.pop();
		
		System.out.println(q);

	}
}
