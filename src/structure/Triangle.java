package structure;

import structure.exceptions.TriangleException;
import structure.exceptions.VectorException;

public class Triangle {

	public Triangle(Vector<Point> v) throws TriangleException {
		if (v == null) 
			throw new TriangleException(new String("null vector in argument"));	
		if (v.size() != 3)
			throw new TriangleException(new String("vertices count exception"));	
		if (pool.get(0) == null || pool.get(1) == null || pool.get(2) == null)
			throw new TriangleException(new String("one of vertices is null"));	
		pool = v;			
	}
	
	public Triangle(Point a, Point b, Point c) {
		
		pool = new Vector<Point>(3);
		pool.set(0, a);
		pool.set(1, b);
		pool.set(2, c);
	}
	
	public void replaceVertice(int n, Point p) {
		if (!(n >= 0 && n < 3) || p == null)
			throw new TriangleException(new String("wrong Point"));
		pool.set(n, p);
	}
	
	public double perimeter() throws TriangleException {
		double p = 0;
		
		if (pool.size() < 3)
			throw new TriangleException(new String("vertices count less then zero"));
		
		try {
			Point first = pool.get(pool.size() - 1);
			Point last = first;
			for (int i = 0; i < pool.size(); ++i) {
				Point cur = pool.get(i);
				p += Math.sqrt( (last.x - cur.x)*(last.x - cur.x) + (last.y - cur.y)*(last.y - cur.y) );
			}
		} catch(VectorException e) {
			throw new TriangleException(new String()); 
		}
		return p;
	}
	
	protected Vector<Point> pool;
	int 
	
}
