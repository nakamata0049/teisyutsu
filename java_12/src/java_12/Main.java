package java_12;

public class Main {

	public static void main(String[] args) {
		/*
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		*/
		
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		
		
		Slime s = new Slime();
		Monster mon = new Slime();
		s.run();
		mon.run();

	}

}
