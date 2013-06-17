import java.awt.Point;

import structures.*;

public class Main {

	public static void main(String[] args) {
		// using stack sample
		try {
			Stack<Point> points;
			points = new Stack<Point>();
			points.push(new Point());
			Point p = points.pop();
			boolean isEmpty = points.size() == 0;
		}
		catch(StackException e) {}
	}
}
