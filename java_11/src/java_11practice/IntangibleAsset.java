package java_11practice;

public class IntangibleAsset extends Asset {
	boolean patent;
	
	public IntangibleAsset(String name, int price, String color, boolean patent) {
		super(name, price, color);
		this.patent = patent;
	}

}
