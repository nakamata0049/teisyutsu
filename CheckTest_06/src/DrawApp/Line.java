package DrawApp;

public class Line implements Figure {

	private Point p1;
	private Point p2;

	public Line() {
		p1 = new Point();
		p2 = new Point();
	}

	public Line(int x1, int y1, int x2, int y2) {
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	public void draw() {
		System.out.println("[線を描画]始点(" + p1.getX() + "," + p1.getY() + ")から"
				+ "終点(" + p2.getX() + "," + p2.getY() + ")まで");
	}

	public double getPerimeter() {
		return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() + p2.getY()), 2));
	}
}
