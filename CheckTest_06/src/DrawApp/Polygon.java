package DrawApp;

public abstract class Polygon extends Shape {
	
	protected int angle;		//内角の数

	@Override
	public abstract void draw();

	@Override
	public abstract double getPerimeter() ;
	
	public int getInternalAngle() {
		return ((this.angle - 2) * 180);
	}
}
