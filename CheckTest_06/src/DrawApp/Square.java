package DrawApp;

public class Square extends Rectangle {

	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	public void draw() {
		System.out.println("[正方形を描画]点(" + super.p.getX() + "," + super.p.getY() + ")を基準として幅・高さ" + super.width + "の正方形");
	}
}
