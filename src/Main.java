import structures.*;

public class Main {

	public static void main(String[] args) {

		testStack();
		
	}
	
	// using stack sample (not all Stack methods are tested here)
	protected static void testStack() {
		try {
			
			Stack<Point> points;
			points = new Stack<Point>();
			System.out.println(points);
			
			points.push(new Point(3,4));
			System.out.println(points);
			
			points.push(new Point(2,2));
			System.out.println(points);
			
			Point p = points.pop();
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
		catch(StackException e) {}
		
	}
	
}
