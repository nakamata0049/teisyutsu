package DrawApp;

public class Circle extends Shape {

	private Point center; //円の中心
	private int radius; //円の半径

	public Circle() {
		center = new Point();
		this.radius = 0;
	}

	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		this.radius = r;
	}

	@Override
	public void draw() {
		System.out.println("[円を描画]中心点(" + this.center.getX() + "," + this.center.getY() + ")から半径" + this.radius);
	}

	@Override
	public double getPerimeter() {
		return (this.radius * 2 * Math.PI);
	}
}
