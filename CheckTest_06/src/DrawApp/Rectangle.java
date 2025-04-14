package DrawApp;

public class Rectangle extends Polygon {

	protected Point p;
	protected int width;
	protected int height;

	public Rectangle(int x, int y, int width, int height) {
		p = new Point(x, y);
		this.width = width;
		this.height = height;
		super.angle = 4;
	}

	@Override
	public void draw() {
		System.out.println("[長方形(短形)を描画]点" + p.getX() + "," + p.getY() + ")を基準として幅"
				+ this.width + "、高さ" + this.height + "の長方形");
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}
}
