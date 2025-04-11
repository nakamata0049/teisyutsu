package java_13practice;

public class Wand {
	private String name;
	private double power;
	
	public void setName(String name) {
		if(name.length() < 3) {
			throw new IllegalArgumentException
				("名前が3文字未満です。処理を中断。");
		}
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setPower(double power) {
		if(power < 0.5 || power > 100) {
			throw new IllegalArgumentException
				("杖の魔力は0.5以上100以下にしてください。処理を中断します。");
		}
		this.power = power;
	}
	public double getPower() {
		return this.power;
	}

}
