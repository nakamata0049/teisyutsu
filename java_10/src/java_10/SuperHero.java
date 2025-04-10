package java_10;

public class SuperHero extends Hero {
	boolean frying;
	
	public void fry() {
		this.frying = true;
		System.out.println("飛び上がった!");
	}
	public void land() {
		this.frying = false;
		System.out.println("着地した!");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

}
