package java_8practice;

public class Cleric {
	String name;
	int hp = 50;
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;
	
	public void selfAid() {
		this.mp -=5;
		this.hp = this.maxHp;
	}
	public int pray(int sec) {
		int healAmount;
		int r = new java.util.Random().nextInt(3);
		if (this.mp + sec + r <= this.maxMp){
			healAmount = sec + r;
			this.mp += healAmount;
			
		}else {
			healAmount = this.maxMp - this.mp;
			this.mp = this.maxMp;
		}
		return healAmount;
	}
			
}
