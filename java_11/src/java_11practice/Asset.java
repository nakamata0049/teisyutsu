package java_11practice;

public class Asset  {

	protected String name;
	protected int price;
	protected String color;

	public Asset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String getName(TangibleAsset tangibleAsset) {return this.name;}
	public int getPrice(TangibleAsset tangibleAsset) {return this.price;}
	public String getColor(TangibleAsset tangibleAsset) {return this.color;}
}