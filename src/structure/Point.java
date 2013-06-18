// Author : Tyurin Dima
// E-mail : tyurin94@gmail.com
// Our symbol: Leonid Novikov

package structure;

import structure.exceptions.PointException;

// simple 2D (int, int) point implementation
public class Point {
	public int x;
	public int y;
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return new String("(" + x + ", " + y + ")");
	}
	public double distance(Point p) throws PointException {
		if (p != null) {
			return Math.sqrt( (p.x - x)*(p.x - x) + (p.y - y)*(p.y - y) );
		}
		else throw new PointException(new String("null Point"));
	}
	
	
}