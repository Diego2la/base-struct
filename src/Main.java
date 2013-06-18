// Author : Tyurin Dima, Silchenkov Ilya
// E-mail : tyurin94@gmail.com, gitrus@yandex.com
// Our symbol: Leonid Novikov

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
		
		System.out.println("================ Fraction test =============");
		testFraction();
		System.out.println("============================================");
		System.out.println(); 
		
		System.out.println("================ Triangle test =============");
		testTriangle();
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
		
	protected static void testTriangle() {	
		Triangle t = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4));
		try {
			System.out.println("Square = " + t.square());
			System.out.println("Perimeter = " + t.perimeter());
			System.out.println("Second vertice = " + t.getVertice(1));
		} catch (TriangleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
