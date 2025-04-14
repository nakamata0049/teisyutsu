package DrawApp;

import java.util.Scanner;

public class Kadai_ex3 {

	public static void main(String[] args) {

		System.out.println("図形描画[0:円 2:線 3:三角形 4:長方形 44:正方形]");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num) {
		case 0:
			drawCircle();
			break;
		case 2:
			drawLine();
			break;
		case 3:
			drawTriangle();
			break;
		case 4:
			drawRectangle();
			break;
		case 44:
			drawSquare();
			break;
		default:
			System.out.println("既定の数字を入力してください");
			System.out.println("中断します");
		}
		scan.close();
	}

	public static void drawCircle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("円の中心のx座標:");
		int x = scan.nextInt();
		System.out.println("円の中心のy座標:");
		int y = scan.nextInt();
		System.out.println("円の半径:");
		int r = scan.nextInt();
		Circle circle = new Circle(x, y, r);
		circle.draw();
		System.out.println("周囲の長さは、" + circle.getPerimeter());
		scan.close();
	}

	public static void drawLine() {
		Scanner scan = new Scanner(System.in);
		System.out.println("始点のx座標:");
		int x1 = scan.nextInt();
		System.out.println("始点のy座標:");
		int y1 = scan.nextInt();
		System.out.println("終点のx座標:");
		int x2 = scan.nextInt();
		System.out.println("終点のy座標:");
		int y2 = scan.nextInt();
		Line line = new Line(x1, y1, x2, y2);
		line.draw();
		System.out.println("周囲の長さは、" + line.getPerimeter());
		scan.close();
	}

	public static void drawTriangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("点1のx座標:");
		int x1 = scan.nextInt();
		System.out.println("点1のy座標:");
		int y1 = scan.nextInt();
		System.out.println("点2のx座標:");
		int x2 = scan.nextInt();
		System.out.println("点2のy座標:");
		int y2 = scan.nextInt();
		System.out.println("点3のx座標:");
		int x3 = scan.nextInt();
		System.out.println("点3のy座標:");
		int y3 = scan.nextInt();
		Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
		triangle.draw();
		System.out.println("周囲の長さは、" + triangle.getPerimeter());
		System.out.println("内角の和は、" + triangle.getInternalAngle());
		scan.close();
	}

	public static void drawRectangle() {
		Scanner scan = new Scanner(System.in);
		System.out.println("基準のx座標:");
		int x = scan.nextInt();
		System.out.println("基準のy座標:");
		int y = scan.nextInt();
		System.out.println("幅:");
		int w = scan.nextInt();
		System.out.println("高さ:");
		int h = scan.nextInt();
		Rectangle rectangle = new Rectangle(x, y, w, h);
		rectangle.draw();
		System.out.println("周囲の長さは、" + rectangle.getPerimeter());
		System.out.println("内角の和は、" + rectangle.getInternalAngle());
		scan.close();
	}

	public static void drawSquare() {
		Scanner scan = new Scanner(System.in);
		System.out.println("基準のx座標:");
		int x = scan.nextInt();
		System.out.println("基準のy座標:");
		int y = scan.nextInt();
		System.out.println("幅:");
		int w = scan.nextInt();
		Square square = new Square(x, y, w);
		square.draw();
		System.out.println("周囲の長さは、" + square.getPerimeter());
		System.out.println("内角の和は、" + square.getInternalAngle());
		scan.close();
	}
}
