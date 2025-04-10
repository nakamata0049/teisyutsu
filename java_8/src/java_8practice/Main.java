package java_8practice;

public class Main {

	public static void main(String[] args) {
		Cleric h1 = new Cleric();
		h1.hp = 20;
		h1.mp = 8;
		
		h1.selfAid();
		System.out.println("HPは" + h1.hp + " MPは" + h1.mp + "です");
		int healAmount = h1.pray(5);
		System.out.println("MPが" + healAmount + "回復しました");
		System.out.println("HPは" + h1.hp + " MPは" + h1.mp + "です");

	}

}