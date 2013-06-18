import structures.*;

public class Main {

	public static void main(String[] args) {

		// using structures samples 
		// (not all methods are tested here)
		testStack();
		
		System.out.println();
		System.out.println();
		
		testQueue();
		
		testFraction();
		
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
	protected static void testFraction() {
		String output = new String();
		try {
			Fraction frct1 = new Fraction(1,1);
			output = frct1.toString(frct1);
			System.out.println(output);
			Fraction frct2 = new Fraction(5,1);
			
			frct1 = frct1.operator(frct1,'+', frct2);
			output = frct1.toString(frct1);
			System.out.println(output);
			
			frct1 = frct1.operator(frct1,'-', frct2);
			output = frct1.toString(frct1);
			System.out.println(output);
			
			frct1 = frct1.operator(frct1,'*', frct2);
			output = frct1.toString(frct1);
			System.out.println(output);
			
			frct1 = frct1.operator(frct1,'/', frct2);
			output = frct1.toString(frct1);
			System.out.println(output);
			
			frct1 = frct1.operator(frct1,'/', frct2);
			output = frct1.toString(frct1);
			System.out.println(output);
			
		}
		catch (FractionException e) {
			System.out.println("Error : " + e.toString());
		}
		

	}
}
