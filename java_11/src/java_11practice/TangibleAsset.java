package java_11practice;

public class TangibleAsset extends Asset implements Thing {
	double weight;
	
	public TangibleAsset(String name, int price, String color) {
		super(name, price, color);
	}

	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}