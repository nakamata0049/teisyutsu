package java_13practice;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 0;
		}
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException
				("MPが0未満です。中断します。");
		}
		this.mp = mp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setName(String name) {
		if(name.length() < 3) {
			throw new IllegalArgumentException
				("名前が３文字未満です。処理を中断します。");
		}
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した!");
	}

}
