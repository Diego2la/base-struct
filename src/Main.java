
import java.io.ObjectInputStream.GetField;

import structure.*;
import structure.exceptions.*;

public class Main {

	public static void main(String[] args) {

		test();
		
	}
	
	// using structures samples 
	// (not all methods are tested here)
	protected static void test() {
		
		System.out.println("================ Vector test ===============");
		testVector();
		System.out.println("============================================");
		System.out.println(); 

		System.out.println("================ Stack test ================");
		testStack();
		System.out.println("============================================");
		System.out.println(); 
		System.out.println("================ Queue test ================");
		testQueue();
		System.out.println("============================================");
		System.out.println(); 
		
	}

	protected static void testVector() {
		
		Vector<Integer> v = null;
		try {
			v = new Vector<Integer>(2);
		} catch (VectorException e1) {
			e1.printStackTrace();
		}
		System.out.println(v);

		v.set(0, new Integer(7));
		System.out.println(v);

		v.set(1, new Integer(8));
		System.out.println(v);

		if ( v.set(2, new Integer(9)) == false )
			System.out.println("Cannot use 2 index");
		
		try {
			v.increaseSize(3);
		} catch (VectorException e) {
			e.printStackTrace();
		}
		System.out.println(v);
		
		v.set(2, new Integer(55));
		System.out.println(v);

		Integer i = null;
		try {
			i = v.get(2);
			System.out.println(i);
		} catch (VectorException e) {
			e.printStackTrace();
		}		
		
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
		System.out.println(q);

		q.push(new Integer(100));
		System.out.println(q);
		q.push(new Integer(101));
		System.out.println(q);
		q.push(new Integer(102));
		System.out.println(q);
		q.push(new Integer(102));
		System.out.println(q);

		q.pop();
		System.out.println(q);

	}
}
