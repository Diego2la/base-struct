package structures;

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
}